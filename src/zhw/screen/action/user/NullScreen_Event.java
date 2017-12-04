package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_NullScreen;
public abstract class NullScreen_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_AUX(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_屏幕调节(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
     final static int ST_NULL_NORMAL_NORMAL= 3017;
boolean IS_ST_NULL_NORMAL_NORMAL(){ return ST_NULL_NORMAL_NORMAL==STATE;}
final static int NullScreen_屏幕调节= 21730;
final static int NullScreen_屏幕调节_RELEASE=  21731;
final static int NullScreen_屏幕调节_PRESSING=  21732;
final static int  NullScreen_屏幕调节_PRESSED=  21733;
final static int  NullScreen_屏幕调节_ENTER=  21734;
final static int  NullScreen_屏幕调节_LEAVE=  21735;

final static int NullScreen_返回= 21740;
final static int NullScreen_返回_RELEASE=  21741;
final static int NullScreen_返回_PRESSING=  21742;
final static int  NullScreen_返回_PRESSED=  21743;
final static int  NullScreen_返回_ENTER=  21744;
final static int  NullScreen_返回_LEAVE=  21745;

final static int NullScreen_关闭= 21750;
final static int NullScreen_关闭_RELEASE=  21751;
final static int NullScreen_关闭_PRESSING=  21752;
final static int  NullScreen_关闭_PRESSED=  21753;
final static int  NullScreen_关闭_ENTER=  21754;
final static int  NullScreen_关闭_LEAVE=  21755;


public NullScreen_Event() {
      actionMap.putInt("屏幕调节",NullScreen_屏幕调节);
      actionMap.putInt("返回",NullScreen_返回);
      actionMap.putInt("关闭",NullScreen_关闭);
	STATE= changeState(STATE,ST_NULL_NORMAL_NORMAL);
	setBindScreen(new Screen_NullScreen(),SCRN_NullScreen);
}

public String getScreenName(){
	return  "NullScreen";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_NULL_NORMAL_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_AUX(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_屏幕调节_RELEASE){
				_F_屏幕调节(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_返回_RELEASE){
				_F_返回(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
