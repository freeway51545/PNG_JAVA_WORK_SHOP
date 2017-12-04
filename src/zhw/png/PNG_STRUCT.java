package zhw.png;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import android.graphics.Canvas;

public class PNG_STRUCT extends BASE_PNG_STRUCT {
	private ZhwPartInit zhwPartInit;
	BufferedImage biCatched;// = ImageIO.read(fis);

	public void fillSubNames() {
	}

	public void loadPNG() {
		try {
			String fileName = "img\\" + name;
			FileInputStream fis = new FileInputStream(fileName);
			BufferedImage bi = ImageIO.read(fis);
			this.width = bi.getWidth();
			this.height = bi.getHeight();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void unLoadPNG() {
		biCatched = null;
	};

	public void loadHeader() {
	}

	public BufferedImage getImage() throws IOException {
		if (biCatched != null)
			return biCatched;
		String fileName = "img\\" + name;
		File f = new File(fileName);
		if (!f.exists()) {
			FileInputStream fis = new FileInputStream("img\\error.png");
			// BufferedImage bi = ImageIO.read(fis);
			biCatched = ImageIO.read(fis);
			fis.close();
			return biCatched;
		}
		FileInputStream fis = new FileInputStream(fileName);
		// BufferedImage bi = ImageIO.read(fis);
		biCatched = ImageIO.read(fis);
		fis.close();
		return biCatched;
	}

	public void drawFile(Graphics g, int x, int y) {
		try {

			g.drawImage(getImage(), x, y, null);
			this.width = biCatched.getWidth();
			this.height = biCatched.getHeight();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void drawSampleFile(Graphics g, int x, int y) {
		try {

			double blf;
			BufferedImage bi = getImage();
			Dimension d = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
			int tagety = d.height - y - 5;
			blf = (double) bi.getHeight() / (tagety);
			if (blf < 1)
				blf = 1;
			g.drawImage(getImage(), x, y, (int) (x + bi.getWidth() / blf),
					(int) (y + bi.getHeight() / blf), 0, 0, bi.getWidth(),
					bi.getHeight(), null, null);
			g.drawRect(x, y, (int) (bi.getWidth() / blf),
					(int) (bi.getHeight() / blf));
			// g.drawImage(bi, x, y, null);
			// this.width=bi.getWidth();
			// this.height=bi.getHeight();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int[][] getPngAlpha() {
		try {
			int ba[][];
			String fileName = "img\\" + name;
			FileInputStream fis = new FileInputStream(fileName);
			BufferedImage bi = ImageIO.read(fis);
			ColorModel cm = bi.getColorModel();
			WritableRaster wr = bi.getRaster();
			ba = new int[bi.getWidth()][bi.getHeight()];
			for (int x = 0; x < bi.getWidth(); x++) {
				for (int y = 0; y < bi.getHeight(); y++) {
					ba[x][y] = cm.getAlpha(wr.getDataElements(x, y, null));
				}
			}
			return ba;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void drawPic(Graphics g) {
		// TODO Auto-generated method stub
		// String fileName = "img\\" + name;
		drawFile(g, FileOp.TEST_DRAWX + xLoc, FileOp.TEST_DRAWY + yLoc);

	}

	public void drawPicOrg(Graphics g) {
		// TODO Auto-generated method stub
		// String fileName = "img\\" + name;
		drawFile(g, xLoc, yLoc);

	}

	public void drawSample(Graphics g) {
		// TODO Auto-generated method stub
		Shape sh = g.getClip();
		g.setClip(0, 0, 2000, 2000);
		// String fileName = "img\\" + name;
		drawSampleFile(g, FileOp.TEST_DRAWX, FileOp.TEST_DRAWY + 605);
		g.setClip(sh);

	}

	public void drawPic(Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		// String fileName = "img\\" + name;
		drawFile(g, x, y);

	}

	public void intZhwPartInit() {
		// TODO Auto-generated method stub
		if (zhwPartInit == null) {
			zhwPartInit = new ZhwPartInit();
			zhwPartInit.setParent(this);
			zhwPartInit.setName(this.getName());
		}
	}

	public SUB_PNG_STRUCT getSubItem(int i) {
		// TODO Auto-generated method stub
		if (i >= this.getSubSize())
			return null;
		SUB_PNG_STRUCT sps = new SUB_PNG_STRUCT();
		sps.parent = this;
		sps.initAs(this.zhwPartInit.vZhwPartItem.get(i));
		return sps;
	}

	public void initSubAction() {
		// TODO Auto-generated method stub
		if (getShowCondition() == ScreenGraphic.PIC_USE_AFTER_CUT) {
			zhwPartInit = new ZhwPartInit();
			zhwPartInit.setName(name);
			try {
				zhwPartInit.readPartInit();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public SUB_PNG_STRUCT findSub(String name) {
		// TODO Auto-generated method stub
		if (this.zhwPartInit == null)
			return null;
		return this.zhwPartInit.findSub(name);
		// return null;
	}

	public int getSubSize() {
		// TODO Auto-generated method stub
		if (this.zhwPartInit == null)
			return 0;
		return this.zhwPartInit.getSize();
		// return 0;
	}

	public ZhwPartInit getZhwPartInit() {
		// TODO Auto-generated method stub
		return zhwPartInit;
	}

	public void setValues(String aliasNameSet, String nameSet, int xLocSet,
			int yLocSet, int showConditionSet, int showCustomerSet,
			int nNumberPicSet) {
		aliasName = aliasNameSet;
		name = nameSet;
		xLoc = xLocSet;
		yLoc = yLocSet;
		showCondition = showConditionSet;
		showCustomer = showCustomerSet;
		// nNumberPic = nNumberPicSet;
	}

	// TODO Auto-generated method stub

	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		drawPic(c.getG());
	}

	public String getActionString() {
		// TODO Auto-generated method stub
		if (this.actionFunction == null || this.actionFunction.length() == 0) {
			return this.aliasName;
		}
		return this.aliasName + ":" + this.actionFunction;
	}

	public boolean isActionBotton() {

		if (aliasName == null)
			return false;
		return IShowCondistionConst.N_ACTION == this.showCondition;

	}

	public boolean hasFuction() {
		// TODO Auto-generated method stub
		if (actionFunction == null) {
			return false;
		}
		if (actionFunction.length() == 0)
			return false;
		return IShowCondistionConst.N_ACTION == this.showCondition;
	}

	public void removeFunction() {
		// TODO Auto-generated method stub
		actionFunction = "";
	}

	public void addFunction() {
		// TODO Auto-generated method stub
		// 最后一个是数字添加成数字型
		int len = aliasName.length();
		char c = aliasName.charAt(len - 1);
		if (c >= '0' && c <= '9') {
			actionFunction = "_F_" + aliasName.substring(0, len - 1) + "$" + c;
		} else {
			actionFunction = "_F_" + aliasName;
		}
	}

	public String getFunctionName() {
		// TODO Auto-generated method stub
		String str = actionFunction;
		int n;
		if ((n = str.indexOf("$")) == -1) {
			int in = str.lastIndexOf(":L");
			if (in > 0) {
				return str.substring(0, in);
			}
			return str;
		}
		int in = str.lastIndexOf(":L");
		if (in > 0) {
			//n = str.indexOf("$")
			return str.substring(0, n);
		}
		return str.substring(0, n);
	}

	public String getFunctionParamters() {
		// TODO Auto-generated method stub
		String str = actionFunction;
		if ((str.indexOf("$")) == -1) {
			return "";
		}
		return ",String no";
	}

	public String getFunctionParamtersC() {
		// TODO Auto-generated method stub
		String str = actionFunction;
		if ((str.indexOf("$")) == -1) {
			return "";
		}
		return ",char* no";
	}
	
	public String getFunctionValue() {
		// TODO Auto-generated method stub
		String str = actionFunction;
		int n;
		if ((n = str.indexOf("$")) == -1) {
			return "";
		}
		int in = str.lastIndexOf(":L");
		if (in > 0) {
			//n = str.indexOf("$")
			//str.substring(0, n);
			return ",\"" + str.substring(n + 1,in) + "\"";
		}
		return ",\"" + str.substring(n + 1) + "\"";
	}

	public String getShowString() {
		// TODO Auto-generated method stub
		if (aliasName == null) {
			return this.getName() + "        " + getShowFlag();
		} else {
			return this.getName() + "[" + getActionString() + "]         "
					+ getShowFlag();
		}
	}

	private String getShowFlag() {
		// TODO Auto-generated method stub
		if (this.showCondition < 0
				|| this.showCondition >= IShowCondistionConst.showName.length) {
			return "";
		}

		return IShowCondistionConst.showName[showCondition];
	}

	public void setLongPressingAction(boolean selected) {
		// TODO Auto-generated method stub
		if (actionFunction == null || actionFunction.length() == 0) {
			return;
		}
		int index = actionFunction.lastIndexOf(":");
		if (index > 0) {
			actionFunction = actionFunction.substring(0, index);
		}
		if (selected) {
			actionFunction = actionFunction + ":L";
		}
	}

	public boolean isLongPressed() {
		if (actionFunction == null || actionFunction.length() == 0) {
			return false;
		}
		return actionFunction.endsWith(":L");
	}

	public void replaceImage(String fileName) {
		// TODO Auto-generated method stub
		biCatched = null;
		//

		FileOp.copyFileTrue0(fileName, "img\\" + getName());

	}
}
