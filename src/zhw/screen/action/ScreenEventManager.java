package zhw.screen.action;

import java.awt.Canvas;

import zhw.screen.IScreenConst;
import zhw.screen.Screen;
import zhw.screen.action.user.EventList;
import zhw.screen.action.user.actions.收音机2_Event_funcs;
import zhw.screen.action.user.actions.方向盘设置_Event_funcs;
import zhw.screen.action.user.actions.蓝牙_Event_funcs;

public class ScreenEventManager {
	public static boolean b忽略本按钮=false;
	public static 蓝牙_Event_funcs 蓝牙_Event_funcs0=new 蓝牙_Event_funcs();;
	public static 收音机2_Event_funcs v0=new 收音机2_Event_funcs();
	public static 方向盘设置_Event_funcs v=new 方向盘设置_Event_funcs();
	public static boolean beNeedRedraw;
	public static boolean beInited=false;
	
	
	static String activeSNo=IScreenConst.SCRN_MAIN1;
	static BaseStateEventItem bsei=null;
	public static Screen getScreen(String scrnNo) {
		// TODO Auto-generated method stub
		BaseStateEventItem bsei=EventList.getEventHandle(scrnNo);
		if(bsei==null)
			return null;
		return bsei.getBindScreen();
	}
	
	public static BaseStateEventItem getBaseStateEventItem(String scrnNo) {
		// TODO Auto-generated method stub
		return EventList.getEventHandle(scrnNo);
	}
	
	public static Screen getActiveScreen() {
		if(bsei==null)
			return null;
		return bsei.getBindScreen();
	}
	public static BaseStateEventItem getActiveEvent() {
		// TODO Auto-generated method stub
		return bsei;
	}
	

	public static void setBeNeedRedraw(boolean b){
		beNeedRedraw=b;
	}
	
	public static boolean isBeNeedRedraw(){
		return beNeedRedraw;
	}

	public static void beginAction() {
		// TODO Auto-generated method stub
		if(bsei==null){
			try{
			bsei=ScreenEventManager.getBaseStateEventItem(activeSNo);
			bsei.getBindScreen().initItems();// 加载图片
			}catch(Throwable t){
				t.printStackTrace();
			}
			bsei.dispatch(new MSG_ZHW(MSG_ZHW.MSG_ENTER_SCRN, 0));
		}

	}

	public static void drawExten(Canvas c) {
		// TODO Auto-generated method stub
		
	}

	public static boolean setActiveScreen(String scrnNo) {
		// TODO Auto-generated method stub
		if(getBaseStateEventItem(scrnNo)==null){
			return false;
		}
		if(activeSNo!=scrnNo){
			if(bsei!=null){
				Screen screen=bsei.getBindScreen();
				screen.uninit();
			}
		}
		activeSNo=scrnNo;
		bsei=getBaseStateEventItem(scrnNo);
		if(bsei!=null){
			Screen screen=bsei.getBindScreen();
			if(screen!=null){
				screen.initItems();
			}
			bsei.dispatch(new MSG_ZHW(MSG_ZHW.MSG_ENTER_SCRN, 0));
		}
		return true;
	}

	public static void drawExten(android.graphics.Canvas c) {
		// TODO Auto-generated method stub
		
	}
}
