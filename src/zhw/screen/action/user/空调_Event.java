package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_空调;
public abstract class 空调_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_MSG_ENTER_SCRN(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_空调现实= 3031;
boolean IS_ST_空调现实(){ return ST_空调现实==STATE;}
final static int 空调_C= 22750;
final static int 空调_C_RELEASE=  22751;
final static int 空调_C_PRESSING=  22752;
final static int  空调_C_PRESSED=  22753;
final static int  空调_C_ENTER=  22754;
final static int  空调_C_LEAVE=  22755;


public 空调_Event() {
      actionMap.putInt("C",空调_C);
	STATE= changeState(STATE,ST_空调现实);
	setBindScreen(new Screen_空调(),SCRN_空调);
}

public String getScreenName(){
	return  "空调";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_空调现实){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_MSG_ENTER_SCRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==空调_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
