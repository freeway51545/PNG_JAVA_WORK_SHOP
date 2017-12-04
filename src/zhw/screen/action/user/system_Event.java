package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_system;
public abstract class system_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_CLOSE_SCREEN(MSG_ZHW msg);
   public abstract void _F_OPEN�����(MSG_ZHW msg);
   public abstract void _F_BT_STATE_CHANGED(MSG_ZHW msg);
   public abstract void _F_OPEN_SCREEN(MSG_ZHW msg);
   public abstract void _F_BT_STATE_CHANGED_IN_DARK(MSG_ZHW msg);
     final static int ST_SYSTEM_NORMAL= 3000;
boolean IS_ST_SYSTEM_NORMAL(){ return ST_SYSTEM_NORMAL==STATE;}
     final static int ST_SCREEN_CLOSED= 3001;
boolean IS_ST_SCREEN_CLOSED(){ return ST_SCREEN_CLOSED==STATE;}
final static int system_����= 20000;
final static int system_����_RELEASE=  20001;
final static int system_����_PRESSING=  20002;
final static int  system_����_PRESSED=  20003;
final static int  system_����_ENTER=  20004;
final static int  system_����_LEAVE=  20005;

final static int system_������= 20010;
final static int system_������_RELEASE=  20011;
final static int system_������_PRESSING=  20012;
final static int  system_������_PRESSED=  20013;
final static int  system_������_ENTER=  20014;
final static int  system_������_LEAVE=  20015;

final static int system_�����_RLEASE= 20020;
final static int system_�����_RLEASE_RELEASE=  20021;
final static int system_�����_RLEASE_PRESSING=  20022;
final static int  system_�����_RLEASE_PRESSED=  20023;
final static int  system_�����_RLEASE_ENTER=  20024;
final static int  system_�����_RLEASE_LEAVE=  20025;

final static int system_SCREEN_TOUCH= 20030;
final static int system_SCREEN_TOUCH_RELEASE=  20031;
final static int system_SCREEN_TOUCH_PRESSING=  20032;
final static int  system_SCREEN_TOUCH_PRESSED=  20033;
final static int  system_SCREEN_TOUCH_ENTER=  20034;
final static int  system_SCREEN_TOUCH_LEAVE=  20035;


public system_Event() {
      actionMap.putInt("����",system_����);
      actionMap.putInt("������",system_������);
      actionMap.putInt("�����_RLEASE",system_�����_RLEASE);
      actionMap.putInt("SCREEN_TOUCH",system_SCREEN_TOUCH);
	STATE= changeState(STATE,ST_SYSTEM_NORMAL);
	setBindScreen(new Screen_system(),SCRN_system);
}

public String getScreenName(){
	return  "system";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_SYSTEM_NORMAL){
			if(msg.wParam==system_����_RELEASE){
				_F_CLOSE_SCREEN(msg);
				STATE=changeState(STATE,ST_SCREEN_CLOSED);
				msg.setComsumered();
			}
			if(msg.wParam==system_������_RELEASE){
				TO_SCRN(getMainScreen());
				msg.setComsumered();
			}
			if(msg.wParam==system_�����_RLEASE){
				_F_OPEN�����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_BT_STATE_CHANGED){
				_F_BT_STATE_CHANGED(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCREEN_CLOSED){
			if(msg.wParam==system_SCREEN_TOUCH_RELEASE){
				_F_OPEN_SCREEN(msg);
				STATE=changeState(STATE,ST_SYSTEM_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_BT_STATE_CHANGED){
				_F_BT_STATE_CHANGED(msg);
				_F_BT_STATE_CHANGED_IN_DARK(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
