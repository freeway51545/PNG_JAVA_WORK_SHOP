package zhw.screen.action;



import java.awt.event.MouseEvent;

import javax.swing.text.View;

import zhw.png.BASE_PNG_STRUCT;
import zhw.png.IShowCondistionConst;
import zhw.screen.IScreenConst;
import zhw.screen.Screen;
import zhw.screen.action.user.EventListData;
import android.graphics.Canvas;

public abstract class BaseStateEventItem implements IScreenConst {
	private String screenId = "";
	BASE_PNG_STRUCT activePng0 = null;

	public BASE_PNG_STRUCT getActivePng() {
		return activePng0;
	}

	public void setActivePng(BASE_PNG_STRUCT activePng0) {
		this.activePng0 = activePng0;
	}

	protected Bundle actionMap = new Bundle();
	public static Boolean beLongPressedLock = false;
	private Screen bindScreen;
	/*

	int events[] = { MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE,
			MotionEvent.ACTION_UP, MotionEvent.ACTION_MOVE,
			MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_OUTSIDE,
			MotionEvent.ACTION_POINTER_DOWN, MotionEvent.ACTION_POINTER_UP,
			MotionEvent.EDGE_TOP, MotionEvent.EDGE_BOTTOM,
			MotionEvent.EDGE_LEFT, MotionEvent.EDGE_RIGHT };
	*/
	public static MyHandler myHandler;
	//public static MainActivity mainActivity;
	public static View mv;

	public void drawDynimic(Canvas c) {
	};

	public static void setBindView(View view) {
		mv = view;
	}

	public static void toNextActivity() {
		//mainActivity.onCallNext();
	}

	/*
	public static void setBaindActivity(MainActivity activity) {
//		mainActivity = activity;
		myHandler = new MyHandler(activity.getMainLooper());
	}
	*/

	public MSG_ZHW traslateMsg(Screen screenToSearch, MSG_ZHW msg) {
		
		MouseEvent event = msg.mouseEvent;
		BASE_PNG_STRUCT pngStructActive = null;
		BASE_PNG_STRUCT pngStruct = null;
		if (event != null) {
			//if (event.getAction() != MotionEvent.ACTION_DOWN) {
				//System.out.println(" get action name : "
					//	+ msg.event.getAction());
			//}
			msg.x = (int) event.getX();
			msg.y = (int) event.getY();
			switch (event.getID()) {
			case MouseEvent.MOUSE_PRESSED:
				pngStruct = screenToSearch.searchActionPng(msg.x, msg.y);
				break;
//			case MouseEvent.MOUSE_MOVED:
			case MouseEvent.MOUSE_RELEASED:
				pngStruct = screenToSearch.searchActionPng(msg.x, msg.y);
				break;
			}
		}
		if (pngStruct != null) {
			int msgNo = getMsg(pngStruct.getMsgName());
			// RETAILMSG(1,(L"msgNO  is%x \r\n",msgNo));
			if (msgNo != -1) {
				// RETAILMSG(1,(L"a2 message is %x %x\r\n",ec->message,ecMessage));
				switch (event.getID()) {
				case MouseEvent.MOUSE_PRESSED:
					msg.wParam = msgNo + MSG_ZHW.NULL_PRESSED;
					pngStructActive = pngStruct;
					break;
				case MouseEvent.MOUSE_MOVED:
					break;
				case MouseEvent.MOUSE_RELEASED:
					msg.wParam = msgNo + MSG_ZHW.NULL_RELEASE;
					// dispatch(*pmsg);
					if (!ScreenEventManager.b忽略本按钮) {
						/** 进入了滑动模式 */
						if (!beLongPressedLock)
							PostMessageZhw(msg);
						// mouseRelease(*pmsg);
					}
					// activedTimmer=0;
					pngStructActive = null;
					break;
				}
			}else{
				// 系统级别的处理
				/*
				msgNo=EventListData.system_Event_funcs_instance.getMsg(pngStruct.getMsgName());
				if (msgNo != -1) {
					// RETAILMSG(1,(L"a2 message is %x %x\r\n",ec->message,ecMessage));
					switch (event.getID()) {
					case MouseEvent.MOUSE_PRESSED:
						msg.wParam = msgNo + MSG_ZHW.NULL_PRESSED;
						pngStructActive = pngStruct;
						break;
					case MouseEvent.MOUSE_MOVED:
						break;
					case MouseEvent.MOUSE_RELEASED:
						msg.wParam = msgNo + MSG_ZHW.NULL_RELEASE;
						// dispatch(*pmsg);
						if (!ScreenEventManager.b忽略本按钮) {
							/** 进入了滑动模式 * /
							if (!beLongPressedLock)
								PostMessageZhw(msg,IScreenConst.SCRN_system);
							// mouseRelease(*pmsg);
						}
						// activedTimmer=0;
						pngStructActive = null;
						break;
					}
				}*/
			}
			
		}
		setNewActivePng(pngStructActive);
		//*/
		return msg;
	}

	public static boolean toDebug = false;

	private void setNewActivePng(BASE_PNG_STRUCT pngStructActive) {
		// TODO Auto-generated method stub
		//if(pngStructActive!=null){
			System.out.println("set setNewActivePng:" + pngStructActive);
		//}else{
			
		//}
		activePng0 = pngStructActive;
		toDebug = activePng0 != null;
		// 重画
		ScreenEventManager.setBeNeedRedraw(true);
	}

	private void PostMessageZhw(MSG_ZHW zhwMsg, String screenId) {
		// TODO Auto-generated method stub
		// void sendMessageToShow(String str){
		/*
		Message msg = myHandler.obtainMessage(); // new Message();//
		Bundle b = new Bundle();
		b.putSerializable("msg", zhwMsg);
		b.putInt("SCRN_ID", screenId);
		msg.setData(b);
		myHandler.sendMessage(msg); // 向Handler发送消息,更新UI
		*/
		// lLast=System.currentTimeMillis();
	}

	private void PostMessageZhw(MSG_ZHW zhwMsg) {
		// TODO Auto-generated method stub
		// void sendMessageToShow(String str){
		/*
		Message msg = myHandler.obtainMessage(); // new Message();//
		Bundle b = new Bundle();
		b.putSerializable("msg", zhwMsg);
		b.putInt("SCRN_ID", this.screenId);
		msg.setData(b);
		myHandler.sendMessage(msg); // 向Handler发送消息,更新UI
		*/
		// lLast=System.currentTimeMillis();
	}

	protected int changeState(int oldstate, int state) {
		// if(true)
		// return;
		// setBeNeedRedraw(true);
		// PostMessageZhw(MSG_ENTER_STATE,state);
		MSG_ZHW zhwMsg = new MSG_ZHW(MSG_ZHW.MSG_ENTER_STATE, state);
		dispatch(zhwMsg);
		return state;
	}

	public int getMsg(String msgName) {
		// TODO Auto-generated method stub
		/* */
		if (!actionMap.containsKey(msgName))
			return -1;
		int n = actionMap.getInt(msgName);
		/* 
		 * new AlertDialog.Builder(mv.getContext()).setTitle("标题")
		 * .setMessage(msgName+" found ").setPositiveButton("确定", null).show();
		 */

		return n;
		//*/
		//return 0;
	};

	public abstract void dispatch(MSG_ZHW msgp);
	/*
	public void drawSelectItem(Canvas c) {
		if (activePng0 != null) {
			if (activePng0.getShowCondition() == IShowCondistionConst.PIC_SELECT_PIC
					|| activePng0.getShowCondition() == IShowCondistionConst.PIC_USE_AFTER_CUT) {
				//activePng0.draw(c);
			}

		}
	}
	*/

	public static void TO_SCRN(String scrnNo) {
		if (scrnNo == SCRN_参数设置) {
			BaseStateEventItem.toNextActivity();
		} else {
			if (ScreenEventManager.setActiveScreen(scrnNo)) {

			//	mainActivity.onShowMe();
			} else {
			//	new AlertDialog.Builder(mainActivity).setTitle("没有对应的SCREEN:")
				//		.setMessage("这是一个提示,请确定").show();
			}
		}

	}

	public static String getSCRN_参数设置() {
		return SCRN_参数设置;
	}

	public static String getMainScreen() {
		return SCRN_MAIN1;
	}

	public static void show多国语言() {

	}

	public Screen getBindScreen() {
		return bindScreen;
	}

	public void setBindScreen(Screen bindScreen, String screenIdSet) {
		if (bindScreen != null) {
			this.bindScreen = bindScreen;
			bindScreen.init();
			bindScreen.setBindBsi(this);
			screenId = screenIdSet;
		}
	}

	public void drawSelectItem(Canvas c) {
		// TODO Auto-generated method stub
		if (activePng0 != null) {
			if (activePng0.getShowCondition() == IShowCondistionConst.N_ACTION
					|| activePng0.getShowCondition() == IShowCondistionConst.N_PICS) {
				activePng0.draw(c);
			}

		}
	}
}
