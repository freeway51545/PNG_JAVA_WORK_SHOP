package zhw.png;

import java.util.Locale;

public abstract class BaseItem {
	public String aliasName;
	public String name;
	public int xLoc;
	public int yLoc;
	public int width;
	public int height;

	public abstract void loadHeader();

	public int showCondition; // 0,allways show,1、move on show
	public int showCustomer;

	public boolean inBox(int x, int y) {
		if (getShowCondition() == 5)
			return false;
		int pngWidth = getWidth();
		int pngHeight = getHeight();
		int x0 = getX();
		int y0 = getY();
		// RETAILMSG(1,(L"Find %s %d,%d-%d,%d (x,y)=(%d,%d)\r\n",getTCHAR1_0(tBuf,sizeof(tBuf),this->name),x0,y0,x0+pngWidth,y0+pngWidth,x,y));
		// 避免操作，
		// 最大图标范围 40
		/*
		 * if(actScrnNo==SCRN_MAIN1){ // MAIN 容易重叠 的部分 if(pngWidth>MAX_X_RANG){
		 * int cutOff=(pngWidth-MAX_X_RANG)/2; x0+=cutOff; pngWidth=MAX_X_RANG;
		 * } if(pngHeight>MAX_Y_RANG){ int cutOff=(pngHeight-MAX_Y_RANG)/2;
		 * y0+=cutOff; pngHeight=MAX_Y_RANG; } }
		 */
		if (x < x0)
			return false;
		if (x > x0 + pngWidth)
			return false;
		if (y < y0)
			return false;
		if (y > y0 + pngHeight)
			return false;
		return true;
	}

	public final static int FAR_DES = 100;

	public int inBoxDest(int x, int y) {

		if (getShowCondition() == 5)
			return 0;
		int pngWidth = getWidth();
		int pngHeight = getHeight();
		int x0 = getX();
		int y0 = getY();
		int centerX = x0 + (pngWidth >> 1);
		int centerY = y0 + (pngHeight >> 1);
		int dx = x - centerX;
		int dy = y - centerY;
		if (Math.abs(dx) > FAR_DES || Math.abs(dy) > FAR_DES)
			return FAR_DES;
		return (int) Math.sqrt((double) (dx * dx + dy * dy));
	}

	public String toString() {
		return "";
	}

	public RECT bounder;
	// public TString getNameAndAlias(TString name,int len);
	public Boolean beRGBASwitched;
	IDrawSelfFuction drawSelfFuction;

	// public void (*drawSelfFuction)(DrawContext *dc);
	BaseItem() {
		showCustomer = -1;
		showCondition = 0;
		width = height = 0;
		xLoc = yLoc = 0;
		name = aliasName = null;
		// beRGBASwitched=false;
		drawSelfFuction = null;
		bounder = null;
	};

	public void moveDxDy(int dx, int dy) {
		xLoc += dx;
		yLoc += dy;
	}

	public int getShowCondition() {
		return showCondition;
	}

	public int getX() {
		return xLoc;
	};

	public int getY() {
		return yLoc;
	};

	public int getWidth() {
		return width;
	};

	public int getHeight() {
		return height;
	};

	public String getName() {
		return name;
	}

	public String getMsgName() {
		if (aliasName != null)
			return aliasName;
		return name;
	}

	public void setLocation(int x, int y) {
		xLoc = x;
		yLoc = y;
	}

	public void setRect(RECT r) {
		xLoc = r.left;
		yLoc = r.top;
		width = r.right - r.left;
		height = r.bottom - r.top;
	}

	public RECT getRect() {
		RECT r = new RECT();
		r.left = xLoc;
		r.top = yLoc;
		r.right = r.left + width;
		r.bottom = r.top + height;
		return r;
	};

	public String getLocStr() {
		// TODO Auto-generated method stub
		int pngWidth = getWidth();
		int pngHeight = getHeight();
		return String.format((Locale) null, "(%d,%d)-(%d,%d)", getX(), getY(),
				getX() + pngWidth, getY() + pngHeight);
		// return bbb;
	}

	public String getNameAndAlias() {
		if (aliasName == null)
			return name;
		return name + "(" + aliasName + ")";

	}
}
