package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_倒车;
public abstract class 倒车_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_MSG_ENTER_SCRN(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_倒车= 3032;
boolean IS_ST_倒车(){ return ST_倒车==STATE;}
final static int 倒车_C= 22760;
final static int 倒车_C_RELEASE=  22761;
final static int 倒车_C_PRESSING=  22762;
final static int  倒车_C_PRESSED=  22763;
final static int  倒车_C_ENTER=  22764;
final static int  倒车_C_LEAVE=  22765;


public 倒车_Event() {
      actionMap.putInt("C",倒车_C);
	STATE= changeState(STATE,ST_倒车);
	setBindScreen(new Screen_倒车(),SCRN_倒车);
}

public String getScreenName(){
	return  "倒车";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_倒车){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_MSG_ENTER_SCRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==倒车_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
