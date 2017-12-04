package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_倒车11;
public abstract class 倒车11_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_MSG_ENTER_SCRN(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_倒车XX= 3033;
boolean IS_ST_倒车XX(){ return ST_倒车XX==STATE;}
final static int 倒车11_C= 22770;
final static int 倒车11_C_RELEASE=  22771;
final static int 倒车11_C_PRESSING=  22772;
final static int  倒车11_C_PRESSED=  22773;
final static int  倒车11_C_ENTER=  22774;
final static int  倒车11_C_LEAVE=  22775;


public 倒车11_Event() {
      actionMap.putInt("C",倒车11_C);
	STATE= changeState(STATE,ST_倒车XX);
	setBindScreen(new Screen_倒车11(),SCRN_倒车11);
}

public String getScreenName(){
	return  "倒车11";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_倒车XX){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_MSG_ENTER_SCRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==倒车11_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
