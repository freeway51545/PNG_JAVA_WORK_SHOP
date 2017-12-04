package zhw.png;

import java.awt.Color;
import java.awt.Graphics;

import android.graphics.Canvas;

public class TXT_STRUCT extends BaseItem {

	public final static int LEFT = 0;
	public final static int RIGHT = 1;
	public final static int MIDDLE = 2;

	public int rgb;
	public boolean boder;
	public int fontSize;
	// 设置变形的数据。
	public int dY;
	public int dHgith;
	public String replaceValue;
	public int nShowOffSet;
	public int layOutMode;

	public TXT_STRUCT() {
		replaceValue = null;
		bounder = null;
		boder = false;
		layOutMode = LEFT;
		nShowOffSet = 0;
	};

	public String getShowString() {
		if (replaceValue == null)
			return name;
		return replaceValue;
	}

	@Override
	public void loadHeader() {
		// TODO Auto-generated method stub

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		java.awt.Font f = new java.awt.Font("宋体", 0, height);
		g.setFont(f);
		g.setColor(new Color(rgb));
		g.drawString(getShowString(), xLoc+FileOp.TEST_DRAWX, yLoc+FileOp.TEST_DRAWY+this.height);

	}

	public void drawText(Graphics g, int x, int y) {
		// TODO Auto-generated method stub

		java.awt.Font f = new java.awt.Font("宋体", 0, height);
		g.setFont(f);
		g.setColor(new Color(rgb));
		g.drawString(getShowString(),x+FileOp.TEST_DRAWX, y+FileOp.TEST_DRAWY+this.height);
	}

		public void setValues(String nameSet, int xLocSet, int yLocSet,
			int widthSet, int heightSet, int rgbSet, int fontSizeSet,
			int showConditionSet, int dySet, int dHgithSet) {
		name = nameSet;
		xLoc = xLocSet;
		yLoc = yLocSet;
		width = widthSet;
		height = heightSet;
		rgb = rgbSet;
		fontSize = fontSizeSet;
		showCondition = showConditionSet;
		dY = dySet;
		dHgith = dHgithSet;
	}

		public void draw(Canvas c) {
			// TODO Auto-generated method stub
			
		}

}
