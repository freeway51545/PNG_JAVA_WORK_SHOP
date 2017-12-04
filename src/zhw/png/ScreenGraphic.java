package zhw.png;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import dc.WorkDialog;

public class ScreenGraphic {
	final static int PIC_DYNAMIC_DRAW = 7;
	final static int PIC_BACK_GROUND = 1;
	final static int PIC_SELECT_PIC = 0;
	final static int PIC_SELECT_PIC_NO_DRAW = 2;
	final static int PIC_USE_AFTER_CUT = 8;
	public static int sizeWidth=800;
	public static int sizeHeight=480;

	public String screenName;
	public String projectPath;
	public String screenId;
	public int xOffSet;
	public Vector<PNG_STRUCT> pnStructList = new Vector<PNG_STRUCT>();
	public Vector<TXT_STRUCT> txtStruct = new Vector<TXT_STRUCT>();
	public String dlgBack = "";
	boolean bHideAllTxt;
	public int itemLen;
	public int beInited;
	public int activeNo;
	public int backLightHight;
	public int backLightLow;
	public boolean inSearchDt;
	private int nSelectItem;
	private String stringInclude;
	private boolean isGen = true;

	public void setIncludeEq(String includeEq) {
		stringInclude = includeEq;
	}

	public void reinitItems() {
		for (int i = 0; i < pnStructList.size(); i++) {
			pnStructList.get(i).resetAllPngInfor();
		}
	};

	public void loadPngData() {
	};

	public void selectBackDno(int dNo) {
	};

	// void selectBackNo(int no){};
	public String getActiveName() {
		return null;

	};

	public boolean drawThisPic(PNG_STRUCT png) {
		if (FileOp.IS_RUN_MODE) {
			if (png.showCustomer != -1)
				return true;
			switch (png.getShowCondition()) {
			case 0:
			case PIC_SELECT_PIC_NO_DRAW:
			case 6:
			case 7:
				return false;
			case 8:
				return false;
			}

		}
		return true;
	};

	public boolean drawThisPic(BaseItem item) {
		return false;
	};

	public POINT findPngLocation(char name) {
		return null;
	};

	public BASE_PNG_STRUCT findPng(char c, boolean big) {
		return null;
	};

	public BASE_PNG_STRUCT findPng(String name) {
		if (pnStructList == null) {
			return null;
		}
		if (name == null)
			return null;
		for (int i = 0; i < pnStructList.size(); i++) {
			PNG_STRUCT png = pnStructList.get(i);
			if (name.equals(png.name)) {
				return png;
			}
			if (name.equals(png.aliasName)) {
				return png;
			}

			SUB_PNG_STRUCT zhwSub = png.findSub(name);
			if (zhwSub != null)
				return zhwSub;

		}
		return null;
	};

	public void setBorder(String name, RECT rect) {
	};

	public RECT getRect(String itemName) {
		return null;
	};

	public TXT_STRUCT findTxt(String name) {
		return null;
	};

	public void setTxtShowTxt(String name, String newValue) {
	};

	public void setTxtShowLayOut(String name, int layOut) {
	};

	public void setTextShowColor(String name, java.awt.Color color,
			boolean boder) {
	};

	protected BASE_PNG_STRUCT searchActionPng(int x, int y) {
		// private BASE_PNG_STRUCT searchActionPng(int x, int y) {
		// x -= IScreenConst.xOrg;
		// y -= IScreenConst.yOrg;
		if (pnStructList == null)
			return null;
		for (int i = 0; i < pnStructList.size(); i++) {
			PNG_STRUCT pngStruct = pnStructList.get(i);
			if (pngStruct.getShowCondition() != PIC_USE_AFTER_CUT) {
				int showCondition = pngStruct.getShowCondition();
				if (showCondition == IShowCondistionConst.N_ACTION
						|| showCondition == IShowCondistionConst.N_BLANK) {
					if (pngStruct.width == 0) {
						pngStruct.loadPNG();
					}
					RECT r = pngStruct.getRect();
					System.out.printf(
							"to match %s (%d,%d)~(%d,%d),on %d %d\r\n",
							pngStruct.getName(), r.left, r.top, r.right,
							r.bottom, x, y);
					if (pngStruct.inBox(x, y)) {
						System.out.printf("match true\r\n");
						return pngStruct;
					} else {
						System.out.printf("match false\r\n");
					}
				}
			} else {
				for (int j = 0; j < pngStruct.getSubSize(); j++) {
					SUB_PNG_STRUCT subPng = pngStruct.getSubItem(j);
					if (subPng == null)
						continue;
					if (subPng.getShowCondition() != IShowCondistionConst.N_FREE) {
						RECT r = subPng.getRect();
						// if(subPng.getName().equals("I_0")){
						// subPng.setLocation(0, 0);
						// }
						System.out.printf(
								"to sub match %s (%d,%d)~(%d,%d),on %d %d\r\n",
								subPng.getName(), r.left, r.top, r.right,
								r.bottom, x, y);
						if (subPng.inBox(x, y)) {
							System.out.printf("match true\r\n");
							return subPng;
						} else {
							System.out.printf("match false\r\n");
						}
					}
				}
			}
		}
		return null;
		// }
	}

	public void setShowCondition(String name, int value) {
	};

	// public void drawActivePngWithGrid(HWND hwnd){};
	public RECT getActiveBox() {
		return null;
	};

	public RECT getActiveCuteBox() {
		return null;
	};

	public PNG_STRUCT getActivePng() {
		return null;
	};

	public int getItemCount() {
		return pnStructList.size() + txtStruct.size();
	};

	public boolean locationCutPic() {
		// if (nSelectItem == -1)
		// return false;
		if (nSelectItem <= pnStructList.size() && nSelectItem >= 0) {
			if (pnStructList.get(nSelectItem) == null) {
				return false;
			}
		}
		return getToCutPng() != null;
		// return false;
	};

	private PNG_STRUCT findCanCutPic() {
		// TODO Auto-generated method stub
		for (int i = 0; i < pnStructList.size(); i++) {
			if (pnStructList.get(i).getShowCondition() == PIC_USE_AFTER_CUT) {
				// activeNo=i;
				return pnStructList.get(i);
			}
		}
		return null;
	}

	// public void drawOnScreenButtonActiveOnOff(HWND hwnd,int x,int y,int
	// sleepTime){};
	public void showAllItems(Component jf) {
		// StringBuffer buffer = new StringBuffer("");
		// StringBuffer line = new StringBuffer("");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(bos);

		// TCHAR buffer[10000];
		// TCHAR line[1000];
		// buffer[0]=0;
		int loc = 0;
		for (int i = 0; i < this.pnStructList.size(); i++) {
			PNG_STRUCT png = (PNG_STRUCT) pnStructList.get(i);

			if (png.getShowCondition() == 0) {
				// TCHAR nn[50];
				pw.printf("%03d>I%s,\tN:%s,%s\r\n", loc++, png.getLocStr(), png
						.getNameAndAlias(),
						(png.getShowCondition() == 0) ? "(Action)" : "");
				// wcscat(buffer,line);
			} else if (png.getShowCondition() == PIC_USE_AFTER_CUT) {
				// if(png.zhwPartInit!=null)
				{
					for (int j = 0; j < png.getSubSize(); j++) {
						SUB_PNG_STRUCT subPng = png.getSubItem(j);
						// SUB_PNG_STRUCT*
						// subPng=png.zhwPartInit.vZhwPartItem.get(j);
						pw.printf("%03d> I%s,\tN:%s\r\n", loc++,
								subPng.getLocStr(), subPng.getNameAndAlias());
					}
				}
			}
		}
		pw.flush();
		pw.close();
		String str = new String(bos.toByteArray());
		JOptionPane.showMessageDialog(jf, str);
		// MessageBox(NULL,buffer,L"infor",0);
	};

	public void hideAllTxt() {
	};

	public void showAllText() {
	};

	public void setAllTextShowNull() {
	};

	public void setAllTextShowMiddle() {
	};

	public void setTextShowMiddle(String name) {
	};

	public void setScreenTxtMiddle(String names[], int size) {
	};

	public static void drawFile(Graphics g, int x, int y, String fileName) {
		try {
			File f = new File(fileName);
			if (!f.exists()) {
				return;
			}
			FileInputStream fis = new FileInputStream(fileName);
			if (fis == null)
				return;
			BufferedImage bi = ImageIO.read(fis);
			g.drawImage(bi, x, y, null);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void drawPic(Graphics g) {

		String backGroundName = "img\\背景图\\17.JPG";
		drawFile(g, FileOp.TEST_DRAWX, FileOp.TEST_DRAWY, backGroundName);
		if (this.dlgBack != null && this.dlgBack.length() > 0) {
			//
			ScreenGraphic o = WorkDialog.fo.findScreen(this.dlgBack);
			if (o != null) {
				o.drawPic(g);
				o.drawOnScreen(g);
			}
		}
		for (int i = 0; i < pnStructList.size(); i++) {
			PNG_STRUCT pic = pnStructList.get(i);
			if (!drawThisPic(pic))
				continue;
			if (i == this.getnSelectItem()) {
				// 绘制边框
				RECT r = pic.getRect();
				// r.larg(2);
				r.move(FileOp.TEST_DRAWX, FileOp.TEST_DRAWY);
				Color rr = new Color(100, 100, 100, 150);
				// Graphics2D g2=(Graphics2D)g;
				// g2.setStroke(new BasicStroke(2));
				g.setColor(rr);

				g.fillRect(r.left + 2, r.top + 2, r.getWith() - 4,
						r.getHeigt() - 4);
				Color rr1 = new Color(255, 0, 0, 100);
				g.setColor(rr1);
				g.drawRect(r.left + 2, r.top + 2, r.getWith() - 4,
						r.getHeigt() - 4);
			}
			pic.drawPic(g);
			// drawFile(g,FileOp.TEST_DRAWX,FileOp.TEST_DRAWY,pic.getFileName());
			// dc.drawPicCareBackGround(pic,beginKeepY,endKeepY);
			// if(actScrnNo!=SCRN_MAIN1)
			pic.unLoadPNG();
			if (i == this.getnSelectItem()) {
				// 绘制边框
				pic.drawSample(g);

			}
			// printAlfa(pnStructList[i].name);
		}
		// printTimeSpend(L"mdd5");

		// drawDynamicBackGround(this,dc);
		// BaseStateEventItem *bse=sem.getStateEvent(actScrnNo);
		// if(bse!=NULL)
		// bse->
	}

	public void drawOnScreen(Graphics g) {
		drawPic(g);
		for (int i = 0; i < this.txtStruct.size(); i++) {
			TXT_STRUCT tx = txtStruct.get(i);
			if (i == this.getnSelectItem() - this.pnStructList.size()) {
				// 绘制边框
				RECT r = tx.getRect();
				// r.larg(2);
				r.move(FileOp.TEST_DRAWX, FileOp.TEST_DRAWY);
				Color rr = new Color(100, 100, 100, 150);
				// Graphics2D g2=(Graphics2D)g;
				// g2.setStroke(new BasicStroke(2));
				g.setColor(rr);

				g.fillRect(r.left, r.top, r.getWith(), r.getHeigt());
				Color rr1 = new Color(255, 0, 0, 255);
				g.setColor(rr1);
				g.drawRect(r.left, r.top, r.getWith(), r.getHeigt());
			}

			tx.draw(g);
			if (i == this.getnSelectItem() - this.pnStructList.size()) {

				Shape sh = g.getClip();
				g.setClip(0, 0, 2000, 2000);
				// String fileName = "img\\" + name;
				// drawSampleFile(g, FileOp.TEST_DRAWX, FileOp.TEST_DRAWY + 605,
				// fileName);
				tx.drawText(g, 0, 605);
				g.setClip(sh);
			}
		}
		/*
		 * if(IS_DESIGN_MODE){ if(activeNo<this->pngLen) {
		 * if(((pnStructList+activeNo
		 * )->width)>NEEDTOZOOM)//若图标像素大于NEEDTOZOOM，则缩小一半
		 * dc.drawPicBelow(pnStructList+activeNo,0,LCD_HEIGHT+20);
		 * //画屏蔽下方的图，changed by luffy 11-07 ,500->620 else
		 * dc.drawPic(pnStructList+activeNo,0,LCD_HEIGHT+20); }
		 * //dc.drawPic(pnStructList+activeNo,0,500); } // 绘制标准标题 if(bse!=NULL){
		 * if(volumeScreen!=NULL){ TXT_STRUCT
		 * *txt=volumeScreen->findTxt("标题位置");
		 * txt->replaceValue=bse->getTitleName(); dc.drawTextBig(txt); } }
		 * //getScreenEventManagerInstance()->drawExten(this,dc); //DWORD
		 * lEndAll=GetTickCount(); // //} * /
		 */

	};

	public ScreenGraphic() {
	};

	// boolean inTesting;
	// public void drawOnScreen(HWND hwnd,HDC hdcInit=NULL){};
	// void drawScreen(DrawContext&dc){};
	// public void drawOnlySelf(DrawContext &dc){};
	public void drawBacground(char[] membuffer) {
	};

	public void clearBackGround(char[] membuffer, int yBegin, int yEnd) {
	};

	public void drawBacgroundKeepOld(char[] membuffer, int yBegin, int yEnd) {
	};

	public void setLocation(int x, int y) {
	};

	public static void setAllLocation(int x, int y) {
	};

	public void selectActive(int dNo) {
	};

	public void modifyHeight(int dh) {
	};

	// public void drawActive(HWND hwd){};
	public int mouseX;
	public int mouseY;

	public void moveDxDy(int dx, int dy) {
	};

	public static void moveDxDy(int dx, int dy, boolean beMoveAll) {
	};

	public void selectPic(int x, int y) {
	};

	public boolean inPnBox(int no, int x, int y) {
		return false;
	};

	public void init() {
	};

	public void uninit() {
		for (int i = 0; i < pnStructList.size(); i++) {
			pnStructList.get(i).unLoadPNG();
		}
		reinitItems();
		// this.pnStructList.clear();
		// this.txtStruct.clear();
	};

	public boolean initedBackGround;

	public void setXOffSet(int x) {
		xOffSet = x;
	}

	public BaseStateEventItem bse;
	public boolean genCode = true;
	public boolean Fullscreen = false;
	public String background = null;
	public String packageName;
	public boolean beinclude;
	public boolean haveInclude = false;
	public int nIncludeCount;
	public Vector<String> vIncludeName;

	public void setBaseStateEventItem(BaseStateEventItem bseSet) {
	};

	// BYTE *backGroundBuffer;
	public String getName() {
		return screenName;
	}

	public int getnSelectItem() {
		return nSelectItem;
	}

	public void setnSelectItem(int nSelectItem) {
		if (nSelectItem < 0) {
			nSelectItem = getItemCount() - 1;
		} else if (nSelectItem >= getItemCount()) {
			nSelectItem = 0;
		}
		this.nSelectItem = nSelectItem;
	}

	public BaseItem getActiveItem() {
		// TODO Auto-generated method stub
		if (nSelectItem == -1)
			return null;
		if (nSelectItem < this.pnStructList.size()) {
			return this.pnStructList.get(nSelectItem);
		}
		int n = nSelectItem - this.pnStructList.size();
		if (n >= this.txtStruct.size()) {
			return null;
		}
		return this.txtStruct.get(n);
	}

	public PNG_STRUCT getToCutPng() {
		// TODO Auto-generated method stub
		if (nSelectItem < pnStructList.size() && nSelectItem >= 0) {
			if (pnStructList.get(nSelectItem).getShowCondition() == PIC_USE_AFTER_CUT)
				return pnStructList.get(nSelectItem);
		}
		return findCanCutPic();
	};

	public void initItems() {
		for (int i = 0; i < pnStructList.size(); i++) {
			pnStructList.get(i).loadPNG();
			pnStructList.get(i).intZhwPartInit();
			try {
				pnStructList.get(i).getZhwPartInit().readPartInit();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setPngs(PNG_STRUCT[] pngs) {
		// TODO Auto-generated method stub
		pnStructList.removeAllElements();
		for (int i = 0; i < pngs.length; i++) {
			pnStructList.add(pngs[i]);
		}
	}

	public void setTexts(TXT_STRUCT[] texts) {
		// TODO Auto-generated method stub
		this.txtStruct.removeAllElements();
		for (int i = 0; i < texts.length; i++) {
			txtStruct.add(texts[i]);
		}
	}

	public boolean isDlg() {
		// TODO Auto-generated method stub
		if (dlgBack == null || dlgBack.length() == 0) {
			return false;
		}
		return true;
	}

	public boolean removeCurrent() {
		// TODO Auto-generated method stub
		if (nSelectItem < 0) {
			return false;
		}
		if (nSelectItem < pnStructList.size()) {
			pnStructList.remove(nSelectItem);
			return true;
		}
		int textloc = nSelectItem - pnStructList.size();
		if (textloc < txtStruct.size()) {
			txtStruct.remove(textloc);
			return true;
		}
		return false;
	}

	public boolean moveDownCurrent() {
		// TODO Auto-generated method stub
		if (nSelectItem < 0) {
			return false;
		}
		if (nSelectItem < pnStructList.size() - 1) {
			PNG_STRUCT a = pnStructList.get(nSelectItem);
			PNG_STRUCT b = pnStructList.get(nSelectItem + 1);
			pnStructList.set(nSelectItem, b);
			pnStructList.set(nSelectItem + 1, a);
			return true;
		}
		return false;
	}

	public boolean moveUpCurrent() {
		// TODO Auto-generated method stub
		if (nSelectItem < 0) {
			return false;
		}
		if (nSelectItem > 0 && nSelectItem < pnStructList.size()) {
			PNG_STRUCT a = pnStructList.get(nSelectItem);
			PNG_STRUCT b = pnStructList.get(nSelectItem - 1);
			pnStructList.set(nSelectItem, b);
			pnStructList.set(nSelectItem - 1, a);
			return true;
		}
		return false;
	}

	public String adjustAsSameLocation(String name, int x, int y) {
		// TODO Auto-generated method stub
		name = name.toLowerCase();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < pnStructList.size(); i++) {
			PNG_STRUCT png = pnStructList.get(i);
			if (png.getName().toLowerCase().equals(name)) {
				int x1 = png.getX();
				int y1 = png.getY();
				if (x1 == x && y1 == y) {
					sb.append(screenName + " same (" + x1 + "," + y1 + ")\r\n");
					continue;
				}
				if (Math.abs(x1 - x) < 50 && Math.abs(y1 - y) < 50) {
					sb.append(screenName + " from (" + x1 + "," + y1 + ")-->("
							+ x + "," + y + ")\r\n");
					png.setLocation(x, y);
				} else {
					sb.append(screenName + " too far (" + x1 + "," + y1
							+ ")\r\n");
				}
			}
		}
		return sb.toString();
	}

	public void addPng(String allFileName) {
		// TODO Auto-generated method stub
		PNG_STRUCT png = new PNG_STRUCT();
		String img = "img\\";
		int loc = allFileName.indexOf("img\\");
		if (loc < 0) {
			return;
		}
		String name = allFileName.substring(loc + img.length());
		png.name = name;
		png.aliasName = getAliasName(name);
		png.xLoc = 0;
		png.yLoc = 0;
		if (nSelectItem >= 0 && nSelectItem < pnStructList.size()) {
			png.xLoc = pnStructList.get(nSelectItem).getX();
			png.yLoc = pnStructList.get(nSelectItem).getY();
			// pnStructList.add(png);
			pnStructList.insertElementAt(png, nSelectItem + 1);
			nSelectItem++;
		} else {
			pnStructList.add(png);
		}
	}

	private String getAliasName(String name) {
		// TODO Auto-generated method stub
		int nLast = name.lastIndexOf('.');
		int nLast1 = name.lastIndexOf('\\');
		return name.substring(nLast1 + 1, nLast);
	}

	public String getShowName() {
		// TODO Auto-generated method stub
		String nameP = getName();
		String name = "";
		if (projectPath != null) {
			int n = projectPath.lastIndexOf("\\");
			if (n > 0) {
				String pName = projectPath.substring(n + 1);
				name += "<" + pName + ">     ";
			}
		}
		if (isDlg()) {
			nameP += "(Dlg)";
		}
		return name + nameP;
	}

	public void initParamValue() {
		// TODO Auto-generated method stub
		Fullscreen = false;
		background = null;
		genCode = true;
	}

	public String getPacageName() {
		// TODO Auto-generated method stub
		if (packageName != null) {
			return packageName;
		}
		if (projectPath == null) {
			return "NULL";
		}
		String projShowName = projectPath;
		int nl = projShowName.lastIndexOf("\\");
		packageName = projShowName.substring(nl + 1);
		packageName = packageName.toLowerCase();
		packageName = "com.dc." + packageName;
		return packageName;
		// return null;
	}

	public String getIncludePack() {
		// TODO Auto-generated method stub
		return stringInclude;
	}

	public void setGen(boolean b) {
		// TODO Auto-generated method stub
		isGen = b;
	}

	public boolean isGen() {
		return isGen;
	}

	public String getPrjectShortName() {
		// TODO Auto-generated method stub
		String projShowName = projectPath;
		if (projShowName == null) {
			return "NULL";
		}
		int nl = projShowName.lastIndexOf("\\");
		String pName = projShowName.substring(nl + 1);
		pName = pName.toLowerCase();
		return pName;
	}
}
