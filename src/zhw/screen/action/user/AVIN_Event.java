package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_AVIN;
public abstract class AVIN_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_AVIN(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_屏幕调节(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
     final static int ST_AVIN= 3049;
boolean IS_ST_AVIN(){ return ST_AVIN==STATE;}
final static int AVIN_屏幕调节= 24540;
final static int AVIN_屏幕调节_RELEASE=  24541;
final static int AVIN_屏幕调节_PRESSING=  24542;
final static int  AVIN_屏幕调节_PRESSED=  24543;
final static int  AVIN_屏幕调节_ENTER=  24544;
final static int  AVIN_屏幕调节_LEAVE=  24545;

final static int AVIN_主界面返回= 24550;
final static int AVIN_主界面返回_RELEASE=  24551;
final static int AVIN_主界面返回_PRESSING=  24552;
final static int  AVIN_主界面返回_PRESSED=  24553;
final static int  AVIN_主界面返回_ENTER=  24554;
final static int  AVIN_主界面返回_LEAVE=  24555;


public AVIN_Event() {
      actionMap.putInt("屏幕调节",AVIN_屏幕调节);
      actionMap.putInt("主界面返回",AVIN_主界面返回);
	STATE= changeState(STATE,ST_AVIN);
	setBindScreen(new Screen_AVIN(),SCRN_AVIN);
}

public String getScreenName(){
	return  "AVIN";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_AVIN){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_AVIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==AVIN_屏幕调节_RELEASE){
				_F_屏幕调节(msg);
				msg.setComsumered();
			}
			if(msg.wParam==AVIN_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
