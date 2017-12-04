package zhw.png;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import android.graphics.Canvas;

public class SUB_PNG_STRUCT extends BASE_PNG_STRUCT {
	public PNG_STRUCT parent;
	public int picNo;
	public boolean nameIsNewed;
	ZhwPartItem zhwPartItem;

	public void unLoadPNG() {
	};



	public void loadHeader() {
	};

	SUB_PNG_STRUCT() {
		parent = null;
		picNo = 0;
		nameIsNewed = false;
	}

	public void initAs(ZhwPartItem zhwPartItemSet) {
		// TODO Auto-generated method stub
		zhwPartItem = zhwPartItemSet;
		this.setRect(zhwPartItem.getRect());
		this.name = zhwPartItem.getname();
	}
	
	public RECT getRect() {
		RECT r = new RECT();
		r.left = xLoc+parent.getX();
		r.top = yLoc+parent.getY();
		r.right = r.left + width;
		r.bottom = r.top + height;
		return r;
	};

	public int getX(){
		return xLoc+parent.getX();
	}
	public int getY(){
		return yLoc+parent.getY();
	}


	public void draw(Canvas c) {
		// TODO Auto-generated method stub
		// public void drawPic(Graphics g, int x, int y) {
		// TODO Auto-generated method stub

//		String fileName = "img\\" + parent.getName();
		drawFileSub(c.getG());

		// }
	}

	private void drawFileSub(Graphics g) {
		// TODO Auto-generated method stub
		// public void drawFile(Graphics g, int x, int y, String fileName) {
		try {
//			FileInputStream fis = new FileInputStream(fileName);
			BufferedImage bi = parent.getImage();
			RECT r=getRect();
			r.move(FileOp.TEST_DRAWX, FileOp.TEST_DRAWY);
			RECT rs=getRect();
			g.drawImage(bi, r.left, r.top, r.right, r.bottom, rs.left, rs.top, rs.right, rs.bottom, null,null);
			//g.drawImage(bi, 0, 0, 200,200, 0,0,200,200, null,null);
			//g.drawImage(bi,0,0,null);
//			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// }
	}

	public boolean isShowMe() {
		// TODO Auto-generated method stub
		return false;
	};

}
