package zhw.screen;



import java.awt.Color;

import zhw.png.BASE_PNG_STRUCT;
import zhw.png.FileOp;
import zhw.png.PNG_STRUCT;
import zhw.png.RECT;
import zhw.png.SUB_PNG_STRUCT;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.ScreenEventManager;
import android.graphics.Canvas;

public abstract class Screen extends zhw.png.ScreenGraphic {
	private BaseStateEventItem bindBsi;

	public abstract void init();

	/*
	 * void reinitItems(); void unInitItems(); void loadPngData(); void
	 * selectBackDno(int dNo); //void selectBackNo(int no); ZString
	 * getActiveName(); Boolean drawThisPic(int no); Boolean
	 * drawThisPic(BaseItem *item); POINT findPngLocation(char *name);
	 * BASE_PNG_STRUCT *Screen::findPng(char c,Boolean big); BASE_PNG_STRUCT
	 * *findPng(char*name); void setBorder(char*name,RECT *rect); RECT
	 * getRect(char *itemName); TXT_STRUCT *findTxt(char*name); void
	 * setTxtShowTxt(char *name,char *newValue); void setTxtShowLayOut(char
	 * *name,int layOut); void setTextShowColor(char *name,COLORREF color,bool
	 * boder); BASE_PNG_STRUCT *searchActionPng(int x,int y); void
	 * setShowCondition(char *name,int value); void drawActivePngWithGrid(HWND
	 * hwnd); RECT getActiveBox(); RECT getActiveCuteBox(); PNG_STRUCT
	 * *getActivePng(); int getItemCount(); PNG_STRUCT *findCanCutPic(); bool
	 * locationCutPic(); void drawOnScreenButtonActiveOnOff(HWND hwnd,int x,int
	 * y,int sleepTime); void showAllItems(); void hideAllTxt(); void
	 * showAllText(); void setAllTextShowNull(); void setAllTextShowMiddle();
	 * void setTextShowMiddle(char *name); void setScreenTxtMiddle(char
	 * *names[],int size); void drawOnScreen(BYTE* membuffer); Screen(); //bool
	 * inTesting; void drawOnScreen(HWND hwnd,HDC hdcInit=NULL); //void
	 * drawScreen(DrawContext&dc); void drawOnlySelf(DrawContext &dc); void
	 * drawBacground(BYTE* membuffer); void clearBackGround(BYTE* membuffer,int
	 * yBegin,int yEnd); void drawBacgroundKeepOld(BYTE* membuffer,int
	 * yBegin,int yEnd); void setLocation(int x,int y); static void
	 * setAllLocation(int x,int y); void selectActive(int dNo); void
	 * modifyHeight(int dh); void drawActive(HWND hwd); int mouseX; int mouseY;
	 * void moveDxDy(int dx,int dy); static void moveDxDy(int dx,int dy,bool
	 * beMoveAll); void selectPic(int x,int y); bool inPnBox(int no,int x,int
	 * y); void init(); void uninit(); bool initedBackGround; void
	 * setXOffSet(int x){ xOffSet=x; } BaseStateEventItem *bse; void
	 * setBaseStateEventItem(BaseStateEventItem *bseSet); //BYTE
	 * *backGroundBuffer; char *getName();
	 */
	public static void main(String[] args) {

	}

	void drawBackGround(Canvas c) {

	}

	public void drawOnScreen(Canvas c) {
		// c.save();
		try {
			// c.translate(IScreenConst.xOrg, IScreenConst.yOrg);
			drawOnScreen0(c);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		// c.restore();
	}

	private void drawOnScreen0(Canvas c) {
		
		drawBackGround(c);
		c.getG().setColor(Color.black);
		RECT r=new RECT();
		r.left=FileOp.TEST_DRAWX;
		r.top=FileOp.TEST_DRAWY;
		r.bottom=r.top+600;
		r.right=r.left+1024;
		c.getG().drawRect(r.left, r.top, r.getWith(), r.getHeigt());
		for (int i = 0; i < pnStructList.size(); i++) {
			PNG_STRUCT psThis = pnStructList.get(i);
			if (psThis == null)
				continue;
			if (psThis.isShowMe()) {
				psThis.draw(c);
			}
			for (int j = 0; j < psThis.getSubSize(); j++) {
				SUB_PNG_STRUCT pngSub = psThis.getSubItem(j);
				if (pngSub != null) {
					if (pngSub.isShowMe()) {
						pngSub.draw(c);
					}
				}
			}
		}

		for (int i = 0; i < txtStruct.size(); i++) {
			if (txtStruct.get(i) != null)
				txtStruct.get(i).draw(c);
		}
		/*
		 * if(bse!=NULL){ if(volumeScreen!=NULL){ TXT_STRUCT
		 * *txt=volumeScreen->findTxt("±êÌâÎ»ÖÃ");
		 * txt->replaceValue=bse->getTitleName(); dc.drawTextBig(txt); } }
		 * getScreenEventManagerInstance()->drawExten(this,dc);
		 */

		ScreenEventManager.drawExten(c);
		if (bindBsi != null) {
			bindBsi.drawSelectItem(c);
			bindBsi.drawDynimic(c);
		}

	}

	public void mouseDown(float x, float y) {
		// TODO Auto-generated method stub

	}

	public void mouseUp(float x, float y) {
		// TODO Auto-generated method stub

	}

	public BASE_PNG_STRUCT searchActionPng(float x, float y) {
		// TODO Auto-generated method stub
		BASE_PNG_STRUCT png= searchActionPng((int) x, (int) y);
		if(png!=null){
			System.out.printf("find %s on %d %d\r\n",png.getName(),(int)x,(int)y);
		}else{
			System.out.printf("find null png %d %d\r\n",(int)x,(int)y);
		}
		return png;
	}

	public void setBindBsi(BaseStateEventItem bseiSet) {
		bindBsi = bseiSet;
	}

}
