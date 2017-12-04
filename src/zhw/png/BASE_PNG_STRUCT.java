package zhw.png;

import java.awt.image.BufferedImage;

import android.graphics.Canvas;

public class BASE_PNG_STRUCT extends BaseItem {

	//public BufferedImage img;// NEED FREE BY CALLER
	public int bytePerPixel;
	public int alfaAddUp;
	public String actionFunction;
	public String toString(){
		return name;
	}



	public void resetAllPngInfor() {
		bytePerPixel = 0;
		width = 0;
		height = 0;
	}

	public BASE_PNG_STRUCT() {
		bytePerPixel = 0;
		alfaAddUp = 0;
	};

	public POINT getLocation() {
		POINT p = new POINT();
		p.x = xLoc;
		p.y = yLoc;
		return p;
	}

	public void loadHeader() {
		// TODO Auto-generated method stub

	}




	public void drawActive(Canvas c) {
		// TODO Auto-generated method stub
		
	}

	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		
	}
	public boolean isShowMe() {
		// TODO Auto-generated method stub
		if (showCustomer != -1)
			return true;
		switch (getShowCondition()) {
		case 0:
		case IShowCondistionConst.N_BLANK:
		case 6:
		case 7:
			return false;
		case 8:
			return false;
		}
		return true;
	}

}
