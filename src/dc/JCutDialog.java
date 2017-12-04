package dc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import zhw.png.PNG_STRUCT;
import zhw.png.POINT;
import zhw.png.RECT;
import zhw.png.ScreenGraphic;
import zhw.png.ZhwPartItem;

public class JCutDialog extends JDialog implements MouseListener {

	/**
	 * 
	 */
	private static final int X_TO_DRAW = 200;
	private static final int Y_TO_DRAW = 100;
	private static final int MAX_Y = 600;
	private static final int MAX_X = 1024;

	private Vector<ZhwPartItem> vBackupZhwPartItem = new Vector<ZhwPartItem>();
	private static final long serialVersionUID = -4455575224092546104L;
	ScreenGraphic toCutScreen = null;
	private int nSelectNo;
	private boolean reCuted;
	private int autoNo;
	PNG_STRUCT toCutPng = null;
	private int[][] allApha;
	final static int MAX_PART_ITEM = 100;
	private static final int MUST_IS_PORT_ALFA = 200;
	private static  int min_alpha = 5;
	public static final int ALL_MIN_ALFA_INIT=5;

	private int maxRect;
	private int width;
	private int height;
	POINT pCurrent = new POINT();;
	private int stepCurrent;
	private int searchStep = 8;
	private static final int MAX_LEN = 8;

	static POINT DXY[] = new POINT[MAX_LEN];
	POINT pStacks[] = new POINT[MAX_X * MAX_Y];
	private byte[] stepStacks = new byte[MAX_X * MAX_Y];
	// private int[][][] alfaDatas = new int[MAX_PART_ITEM][MAX_X][MAX_Y];
	private boolean[][] scanedPoint = new boolean[MAX_X][MAX_Y];
	boolean thisBlocs[][] = new boolean[MAX_X][MAX_Y];
	private JTextField jMinAlfa = null;

	private int pLoc;

	private RECT workFounc[] = new RECT[400];
	private RECT rectFounc[] = new RECT[400];
	private int picNo;
	private PrintWriter pwLog = null;

	static {
		DXY[0] = new POINT(1, 0);
		DXY[1] = new POINT(-1, 0);
		DXY[2] = new POINT(0, 1);
		DXY[3] = new POINT(0, -1);
		DXY[4] = new POINT(1, 1);
		DXY[5] = new POINT(-1, -1);
		DXY[6] = new POINT(1, -1);
		DXY[7] = new POINT(-1, 1);

	};

	public JCutDialog(JFrame jframe, ScreenGraphic screen) {
		// TODO Auto-generated constructor stub

		super(jframe);
		this.getContentPane().setLayout(null);
		setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setLocation(0, 0);
		toCutScreen = screen;
		this.add(getCmdPanel());
		toCutPng = toCutScreen.getToCutPng();
		autoCutePic(false);
		this.addMouseListener(this);
	}

	private Component getCmdPanel() {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		jp.setLayout(fl);
		jp.setSize(100, 800);
		jp.setLocation(10, 10);
		jp.add(getOkBn());
		jp.add(getCanelBn());
		jp.add(getReCutBn());
		jp.add(new JLabel("最小ALPHA:"));
		jp.add(getJTextField());
		return jp;

	}

	private Component getJTextField() {
		// TODO Auto-generated method stub
		if (jMinAlfa == null) {
			jMinAlfa = new JTextField();
			jMinAlfa.setText("" + min_alpha);
			jMinAlfa.setPreferredSize(new Dimension(70,30));
		}
		return jMinAlfa;
	}

	void drawXORLine(Graphics g, PNG_STRUCT png) {

		// ZhwPartItem *itemsa=activeScreen->getActivePng()->getZhwPartInit().items;
		// getZhwPartInit() *partInt=&activeScreen->getActivePng()->getZhwPartInit();
		int itemCount = png.getZhwPartInit().getSize();
		// RECT rectFounc;
		for (int i = 0; i < itemCount; i++) {
			RECT rectDraw = new RECT();
			rectDraw = png.getZhwPartInit().getRect(i);
			String tname = png.getZhwPartInit().getName(i);
			// rectDraw.move(, Y_TO_DRAW);
			// if (i == nSelectNo)
			{
				g.setColor(Color.blue);
				g.drawRect(rectDraw.left + X_TO_DRAW, rectDraw.top + Y_TO_DRAW,
						rectDraw.getWith(), rectDraw.getHeigt());
			}
			// else {
			// g.setColor(Color.white);
			// g.drawRect(rectDraw.left + X_TO_DRAW, rectDraw.top + Y_TO_DRAW,
			// rectDraw.getWith(), rectDraw.getHeigt());
			// }
			// ::DrawText(hdc,name,
			if (rectDraw.right - rectDraw.left < 50) {
				rectDraw.right = rectDraw.left + 200;
			}
			if (rectDraw.bottom - rectDraw.top < 30) {
				rectDraw.bottom = rectDraw.top + 30;
			}
			g.drawString(tname, rectDraw.left + X_TO_DRAW + 2, rectDraw.top
					+ Y_TO_DRAW + 2);
			// DrawText(hdc,tname,lstrlen(tname),&rectDraw,DT_LEFT|DT_VCENTER);
		}
	}

	private Component getReCutBn() {
		// TODO Auto-generated method stub
		JButton bnReCut = new JButton();
		bnReCut.setText("剪  切");
		bnReCut.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// JCutDialog.this.dispose();
				try {
					pwLog = new PrintWriter("d:\\a.txt");
					autoCutePic(true);
					pwLog.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		return bnReCut;
	}

	private Component getCanelBn() {
		// TODO Auto-generated method stub
		JButton jbCancel = new JButton();
		jbCancel.setText("退  出");
		jbCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JCutDialog.this.dispose();
			}

		});

		return jbCancel;
	}

	private Component getOkBn() {
		// TODO Auto-generated method stub
		JButton jbOk = new JButton();
		jbOk.setText("保  存");
		jbOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// JCutDialog.this.dispose();
				try {
					toCutPng.getZhwPartInit().writePartInit();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		return jbOk;
	}

	public void paint(Graphics g) {
		super.paint(g);
		try {

			PNG_STRUCT png = toCutScreen.getToCutPng();
			png.drawPic(g, X_TO_DRAW, Y_TO_DRAW);
			// RECT r=png.getRect();
			g.setColor(Color.black);
			g.drawRect(X_TO_DRAW, Y_TO_DRAW, png.getWidth(), png.getHeight());
			drawXORLine(g, png);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// g.drawImage, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
	}

	POINT seachNewPoint(int x, int y, int step) {
		POINT p = new POINT();
		p.x = -1;
		int alfaOrg = getAlfa(x, y);
		x += DXY[step].x;
		y += DXY[step].y;
		if (x < 0 || y < 0 || x >= width || y >= height)
			return p;// over bounder
		if (thisBlocs[x][y])
			return p;// marked as searched
		int alfa = getAlfa(x, y);
		if (alfa > 0) {
			boolean isPoint = false;
			// if(isWhiteColor(x,y)){
			// isPoint=alfa>WHITE_MIN_ALFA;
			// }else{
			if (alfa >= MUST_IS_PORT_ALFA) {
				isPoint = true;
			} else {
				if (alfa > min_alpha && alfaOrg >= alfa) {
					isPoint = true;
				}
			}
			// }
			if (isPoint) {
				p.x = x;
				p.y = y;
				thisBlocs[x][y] = true;
			}
		}
		return p;
	}

	private int getAlfa(int x, int y) {
		// TODO Auto-generated method stub
		if (y > this.allApha[0].length)
			return 0;
		if (x > this.allApha.length)
			return 0;
		return allApha[x][y];
	}

	boolean isStackEmpty() {
		return pLoc == 0;
	}

	void push() {
		pStacks[pLoc] = pCurrent;
		stepStacks[pLoc] = (byte) stepCurrent;
		pLoc++;
	}

	private void search(int x, int y) {
		pCurrent.x = x;
		pCurrent.y = y;
		stepCurrent = 0;
		while (true) {
			// search current forword
			if (stepCurrent < searchStep) {
				POINT pNew = seachNewPoint(pCurrent.x, pCurrent.y, stepCurrent);
				stepCurrent++;
				// found a new point can to seach
				if (pNew.x != -1) {
					// 1.make the point
					// push pCurrent,stepCurrent
					push();
					pCurrent = pNew;
					stepCurrent = 0;
					continue; // search on
					// 2.make the point as current point and set stepCurrent=0;
				}
				if (stepCurrent < MAX_LEN) {
					continue;
				}
			}
			if (isStackEmpty()) {
				break;
			} else {
				pop();
			}
			// seach on
			// don't found point search next step
			// if stepCurrent>8
			// if(stack empty over)
			// pop
		}
	}

	private void pop() {
		// TODO Auto-generated method stub
		pLoc--;
		pCurrent = pStacks[pLoc];
		stepCurrent = stepStacks[pLoc];
	}

	boolean isContaitPoint(RECT r, int x, int y) {
		if (r.left <= x && r.right >= x && r.top <= y && r.bottom >= y)
			return true;
		return false;
	}

	boolean isContait(RECT container, RECT rect) {
		if (!isContaitPoint(container, rect.left, rect.top))
			return false;
		if (!isContaitPoint(container, rect.left, rect.bottom))
			return false;
		if (!isContaitPoint(container, rect.right, rect.top))
			return false;
		if (!isContaitPoint(container, rect.right, rect.bottom))
			return false;
		return true;
	}

	boolean isCrossed(RECT rs, RECT rt) {
		int count = 0;
		for (int x = rs.left; x < rs.right; x++) {
			for (int y = rs.top; y < rs.bottom; y++) {
				if (isContaitPoint(rt, x, y)) {
					count++;
				}
			}
		}
		if (count * 1.0 / (rt.bottom - rt.top) / (rt.right - rt.left) > 0.7) {
			return true;
		}
		return false;
	}

	boolean makeBox() {
		int minx, miny, maxx, maxy;
		minx = MAX_X;
		miny = MAX_Y;
		maxx = 0;
		maxy = 0;
		for (int x = 0; x < MAX_X; x++) {
			for (int y = 0; y < MAX_Y; y++) {
				if (thisBlocs[x][y]) {
					if (x > maxx) {
						maxx = x;
					}
					if (x < minx) {
						minx = x;
					}
					if (y > maxy) {
						maxy = y;
					}
					if (y < miny) {
						miny = y;
					}
				}
			}
		}
		/**
		 * 如果是弱引用,并且 一定是一个有效点,另外又不在本扫描中
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		for (int y = miny; y < maxy; y++) {
			for (int x = minx; x < maxx; x++) {
				int a = this.getAlfa(x, y);
				// pwLog.printf("%03d(%d) ", this.getAlfa(j, i),thisBlocs[j][i]?
				// 1:0);
			}
			// pwLog.println();
		}
		if (pwLog != null) {
			pwLog.println("==========================");
			// RECT r=zpi.getRect();
			for (int i = miny; i < maxy; i++) {
				for (int j = minx; j < maxx; j++) {
					pwLog.printf("%03d(%d) ", this.getAlfa(j, i),
							thisBlocs[j][i] ? 1 : 0);
				}
				pwLog.println();
			}
		}
		RECT r = new RECT();
		r.left = minx;
		r.right = maxx + 1;
		r.top = miny;
		r.bottom = maxy + 1;
		if (maxx - minx < 10) {
			tryToJoinLiterBox(r);
			return false;
		}
		if (maxy - miny < 10) {
			tryToJoinLiterBox(r);
			return false;
		}
		if (maxRect >= 400)
			return false;
		// 如果包含直接合并

		for (int i = 0; i < maxRect; i++) {
			boolean beCombin = false;
			if (isContait(rectFounc[i], r)) {
				// 合并RETURN 0
				beCombin = true;

			} else if (isCrossed(rectFounc[i], r)) {
				beCombin = true;
			}
			// if(beCombin){

			// }
			if (beCombin) {
				rectFounc[i] = addUpRect(rectFounc[i], r);
				return false;
			}
		}
		// 如果，交接度 > 80 合并
		rectFounc[maxRect] = r;
		maxRect++;
		return true;
	}

	private void tryToJoinLiterBox(RECT r) {
		// TODO Auto-generated method stub
		for (int i = 0; i < maxRect; i++) {
			boolean beCombin = false;
			if (isContait(rectFounc[i], r)) {
				// 合并RETURN 0
				beCombin = true;

			} else if (isCrossed(rectFounc[i], r)) {
				beCombin = true;
			}
			if (!beCombin) {
				if (isNearBy(rectFounc[i], r)) {
					beCombin = true;
				}
			}
			// if(beCombin){

			// }
			if (beCombin) {
				rectFounc[i] = addUpRect(rectFounc[i], r);
				// return false;
			}
		}
	}

	private boolean isNearBy(RECT rt, RECT rs) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int x = rs.left; x < rs.right; x++) {
			for (int y = rs.top; y < rs.bottom; y++) {
				if (isNearBy(rt, x, y)) {
					count++;
				}
			}
		}
		if (count > 2) {
			return true;
		}
		return false;
	}

	private boolean isNearBy(RECT rt, int x, int y) {
		// TODO Auto-generated method stub
		if (Math.abs(rt.left - x) < 10 || Math.abs(rt.right - x) < 10) {
			if (y >= rt.top && y <= rt.bottom)
				return true;
			return false;
		}

		if (Math.abs(rt.top - y) < 10 || Math.abs(rt.bottom - y) < 10) {
			if (x >= rt.left && x <= rt.right)
				return true;
			return false;
		}

		return false;
	}

	private RECT addUpRect(RECT rect, RECT r) {
		// TODO Auto-generated method stub
		if (r.left < rect.left)
			rect.left = r.left;
		if (r.top < rect.top)
			rect.top = r.top;
		if (r.right > rect.right)
			rect.right = r.right;
		if (r.bottom > rect.bottom)
			rect.bottom = rect.bottom;
		return rect;
	}

	ZhwPartItem makeNewItem(RECT thisBox, int picNoSet) {
		ZhwPartItem zpi = new ZhwPartItem();
		/*
		 * RECT thisBox = new RECT(); thisBox.left = 10000; thisBox.right =
		 * 10000; thisBox.top = -1; thisBox.bottom = -1;
		 * 
		 * for (int x = 0; x < thisBloc.length; x++) { for (int y = 0; y <
		 * thisBloc[0].length; y++) { if (thisBloc[x][y]) { if (x <
		 * thisBox.left) { thisBox.left = x; } if (y < thisBox.top) {
		 * thisBox.top = y; } ; if (x > thisBox.right) { thisBox.right = x; } ;
		 * if (y > thisBox.bottom) { thisBox.bottom = y; } ; } }
		 */
		zpi.setRect(thisBox);
		String backUpName = findBackUpName(thisBox);
		String name = null;
		if (backUpName == null) {
			name = "I_" + autoNo++;
			// sprintf(buffer,"I_%d",autoNo++);
		} else {
			name = backUpName;

		}
		zpi.setName(name);

		// }
		return zpi;
	}

	private String findBackUpName(RECT thisBox) {
		// TODO Auto-generated method stub
		for (int i = 0; i < vBackupZhwPartItem.size(); i++) {
			ZhwPartItem zpi = vBackupZhwPartItem.get(i);
			if (Math.abs(zpi.x - thisBox.left) < 10
					&& Math.abs(zpi.y - thisBox.top) < 10)
				return zpi.name;
		}
		return null;
	}

	void autoCutePic(boolean newIt) {
		autoNo = 0;
		reCuted = newIt;
		if (newIt) {
			backUpAllNames();
		}
		toCutPng.intZhwPartInit();
		//toCutPng.getZhwPartInit().setName(toCutPng.getName());
		try {

			if (!newIt) {
				toCutPng.getZhwPartInit().readPartInit();
				min_alpha=toCutPng.getZhwPartInit().getMinAlfa();
				jMinAlfa.setText(""+min_alpha);
				return;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (newIt) {
			toCutPng.getZhwPartInit().clearAll();
		} else {
			// backUpNameCount=0;
		}

		try {
			min_alpha = Integer.parseInt(this.jMinAlfa.getText());
		} catch (Exception e) {
		}

		this.allApha = toCutPng.getPngAlpha();
		// if (alfaDatas == null)
		// return;
		for (int i = 0; i < scanedPoint.length; i++) {
			for (int j = 0; j < scanedPoint[0].length; j++) {
				scanedPoint[i][j] = false;
			}
		}
		// memset(scanedPoint,0,1000*1000);
		maxRect = 0;
		int pngWidth = width = toCutPng.width;
		int pngHeight = height = toCutPng.height;
		toCutPng.loadPNG();

		for (int y = 0; y < pngHeight; y++) {
			for (int x = 0; x < pngWidth; x++) {
				if (scanedPoint[x][y])
					continue;
				int a = allApha[x][y];

				boolean isPoint = false;
				/*
				 * if(isWhitePoint(r,g,b)){ if(a>WHITE_MIN_ALFA) isPoint=true;
				 * }else{
				 */
				if (a >= MUST_IS_PORT_ALFA) {
					// 从MAX =255 的点开始搜索
					isPoint = true;
				}
				// }
				if (isPoint) {
					// found al point to make box
					// to make block
					//
					// memset()
					memset(thisBlocs, false);
					thisBlocs[x][y] = true;
					search(x, y);
					for (int x1 = 0; x1 < MAX_X; x1++) {
						for (int y1 = 0; y1 < MAX_Y; y1++) {
							if (thisBlocs[x1][y1]) {
								scanedPoint[x1][y1] = true;
							}
						}
					}
					if (makeBox()) {
						// 合并

					}
				}
			}
		}
		/*
		 * 
		 * for(int row=0;row<pngHeight;row++){ for(int
		 * col=0;col<pngWidth;col++){ if(scanedPoint[col][row]) continue; int
		 * loc=(row*pngWidth+col)*toCutPng.bytePerPixel; int
		 * a=data[loc+3];//alfa 值 int r=data[loc]; int g=data[loc]; int
		 * b=data[loc]; bool isPoint=false; // 从盒子出发 if(a>=200){ // 从MAX =255
		 * 的点开始搜索 isPoint=true; } //} if(isPoint){ // found al point to make box
		 * // to make block // memset(thisBlocs[maxRect],0,1000*1000);
		 * thisBlocs[maxRect][col][row]=1; search(col,row); for(int
		 * i=0;i<1000;i++){ for(int j=0;j<1000;j++){
		 * if(thisBlocs[maxRect][i][j]){ scanedPoint[i][j]=1; } } }
		 * if(makeBox()){ // 合并
		 * 
		 * } } } }
		 */
		picNo = 0;
		toCutPng.getZhwPartInit().clearAll();
		for (int i = 0; i < maxRect; i++) {
			int picNoThis = picNo++;
			toCutPng.getZhwPartInit().add(makeNewItem(rectFounc[i], picNoThis));
			// writePngPicFile(pngStruct,picNoThis,i);
			// ZhwPartItem*ppp=toCutPng.getZhwPartInit().findItem(thisBlocs[i]);
			// if(ppp==NULL){
			// RECT r=rectFounc[maxRect-1];
			// toCutPng.getZhwPartInit().addNewItem(thisBlocs[i], picNoThis);

			// }
			// else{
			// ppp->picNo=picNoThis;
			// }
		}

		// toCutPng.nNumberPic = picNo;
		try {
			toCutPng.getZhwPartInit().setMinAlfa(this.min_alpha);
			toCutPng.getZhwPartInit().writePartInit();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.repaint();
	}

	private void memset(boolean[][] bs, boolean value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < bs.length; i++) {
			for (int j = 0; j < bs[i].length; j++) {
				bs[i][j] = value;
			}
		}
	}

	private void backUpAllNames() {
		// TODO Auto-generated method stub
		this.vBackupZhwPartItem.clear();
		for (int i = 0; i < toCutPng.getZhwPartInit().getSize(); i++) {
			vBackupZhwPartItem.add(toCutPng.getZhwPartInit().vZhwPartItem.get(i));
		}

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ZhwPartItem zpi = toCutPng.getZhwPartInit().findItem(e.getX() - X_TO_DRAW,
				e.getY() - Y_TO_DRAW);
		if (zpi != null) {
			// RECT r=zpi.getRect();

			String name = JOptionPane.showInputDialog(this, "输出名字",
					zpi.getname());
			if (name != null) {
				zpi.setName(name);
				repaint();
				try {
					toCutPng.getZhwPartInit().writePartInit();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
