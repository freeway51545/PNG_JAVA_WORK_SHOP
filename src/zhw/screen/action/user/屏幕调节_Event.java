package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_屏幕调节;
public abstract class 屏幕调节_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_SCREEN(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_RECOVER_DEFAULT(MSG_ZHW msg);
   public abstract void _F_RECOVER_BRIGHT(MSG_ZHW msg);
   public abstract void _F_BACK(MSG_ZHW msg);
     final static int ST_屏幕调节= 3048;
boolean IS_ST_屏幕调节(){ return ST_屏幕调节==STATE;}
final static int 屏幕调节_默认= 24510;
final static int 屏幕调节_默认_RELEASE=  24511;
final static int 屏幕调节_默认_PRESSING=  24512;
final static int  屏幕调节_默认_PRESSED=  24513;
final static int  屏幕调节_默认_ENTER=  24514;
final static int  屏幕调节_默认_LEAVE=  24515;

final static int 屏幕调节_明亮= 24520;
final static int 屏幕调节_明亮_RELEASE=  24521;
final static int 屏幕调节_明亮_PRESSING=  24522;
final static int  屏幕调节_明亮_PRESSED=  24523;
final static int  屏幕调节_明亮_ENTER=  24524;
final static int  屏幕调节_明亮_LEAVE=  24525;

final static int 屏幕调节_返回= 24530;
final static int 屏幕调节_返回_RELEASE=  24531;
final static int 屏幕调节_返回_PRESSING=  24532;
final static int  屏幕调节_返回_PRESSED=  24533;
final static int  屏幕调节_返回_ENTER=  24534;
final static int  屏幕调节_返回_LEAVE=  24535;


public 屏幕调节_Event() {
      actionMap.putInt("默认",屏幕调节_默认);
      actionMap.putInt("明亮",屏幕调节_明亮);
      actionMap.putInt("返回",屏幕调节_返回);
	STATE= changeState(STATE,ST_屏幕调节);
	setBindScreen(new Screen_屏幕调节(),SCRN_屏幕调节);
}

public String getScreenName(){
	return  "屏幕调节";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_屏幕调节){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SCREEN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==屏幕调节_默认_RELEASE){
				_F_RECOVER_DEFAULT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==屏幕调节_明亮_RELEASE){
				_F_RECOVER_BRIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==屏幕调节_返回_RELEASE){
				_F_BACK(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
