package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_参数设置;
public abstract class 参数设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_导航DIR1(MSG_ZHW msg);
   public abstract void _F_启动选择(String a,MSG_ZHW msg);
   public abstract void _F_上页(MSG_ZHW msg);
   public abstract void _F_下页(MSG_ZHW msg);
   public abstract void _F_TIMMER_参数(MSG_ZHW msg);
     final static int ST_导航1_NORMAL= 3012;
boolean IS_ST_导航1_NORMAL(){ return ST_导航1_NORMAL==STATE;}
final static int 参数设置_显示设置= 21290;
final static int 参数设置_显示设置_RELEASE=  21291;
final static int 参数设置_显示设置_PRESSING=  21292;
final static int  参数设置_显示设置_PRESSED=  21293;
final static int  参数设置_显示设置_ENTER=  21294;
final static int  参数设置_显示设置_LEAVE=  21295;

final static int 参数设置_音频设置= 21300;
final static int 参数设置_音频设置_RELEASE=  21301;
final static int 参数设置_音频设置_PRESSING=  21302;
final static int  参数设置_音频设置_PRESSED=  21303;
final static int  参数设置_音频设置_ENTER=  21304;
final static int  参数设置_音频设置_LEAVE=  21305;

final static int 参数设置_系统设置= 21310;
final static int 参数设置_系统设置_RELEASE=  21311;
final static int 参数设置_系统设置_PRESSING=  21312;
final static int  参数设置_系统设置_PRESSED=  21313;
final static int  参数设置_系统设置_ENTER=  21314;
final static int  参数设置_系统设置_LEAVE=  21315;

final static int 参数设置_方向盘设置= 21320;
final static int 参数设置_方向盘设置_RELEASE=  21321;
final static int 参数设置_方向盘设置_PRESSING=  21322;
final static int  参数设置_方向盘设置_PRESSED=  21323;
final static int  参数设置_方向盘设置_ENTER=  21324;
final static int  参数设置_方向盘设置_LEAVE=  21325;

final static int 参数设置_参数设置= 21330;
final static int 参数设置_参数设置_RELEASE=  21331;
final static int 参数设置_参数设置_PRESSING=  21332;
final static int  参数设置_参数设置_PRESSED=  21333;
final static int  参数设置_参数设置_ENTER=  21334;
final static int  参数设置_参数设置_LEAVE=  21335;

final static int 参数设置_路径设置= 21340;
final static int 参数设置_路径设置_RELEASE=  21341;
final static int 参数设置_路径设置_PRESSING=  21342;
final static int  参数设置_路径设置_PRESSED=  21343;
final static int  参数设置_路径设置_ENTER=  21344;
final static int  参数设置_路径设置_LEAVE=  21345;

final static int 参数设置_返回主菜单= 21350;
final static int 参数设置_返回主菜单_RELEASE=  21351;
final static int 参数设置_返回主菜单_PRESSING=  21352;
final static int  参数设置_返回主菜单_PRESSED=  21353;
final static int  参数设置_返回主菜单_ENTER=  21354;
final static int  参数设置_返回主菜单_LEAVE=  21355;

final static int 参数设置_选择1= 21360;
final static int 参数设置_选择1_RELEASE=  21361;
final static int 参数设置_选择1_PRESSING=  21362;
final static int  参数设置_选择1_PRESSED=  21363;
final static int  参数设置_选择1_ENTER=  21364;
final static int  参数设置_选择1_LEAVE=  21365;

final static int 参数设置_上页= 21370;
final static int 参数设置_上页_RELEASE=  21371;
final static int 参数设置_上页_PRESSING=  21372;
final static int  参数设置_上页_PRESSED=  21373;
final static int  参数设置_上页_ENTER=  21374;
final static int  参数设置_上页_LEAVE=  21375;

final static int 参数设置_下页= 21380;
final static int 参数设置_下页_RELEASE=  21381;
final static int 参数设置_下页_PRESSING=  21382;
final static int  参数设置_下页_PRESSED=  21383;
final static int  参数设置_下页_ENTER=  21384;
final static int  参数设置_下页_LEAVE=  21385;


public 参数设置_Event() {
      actionMap.putInt("显示设置",参数设置_显示设置);
      actionMap.putInt("音频设置",参数设置_音频设置);
      actionMap.putInt("系统设置",参数设置_系统设置);
      actionMap.putInt("方向盘设置",参数设置_方向盘设置);
      actionMap.putInt("参数设置",参数设置_参数设置);
      actionMap.putInt("路径设置",参数设置_路径设置);
      actionMap.putInt("返回主菜单",参数设置_返回主菜单);
      actionMap.putInt("选择1",参数设置_选择1);
      actionMap.putInt("上页",参数设置_上页);
      actionMap.putInt("下页",参数设置_下页);
	STATE= changeState(STATE,ST_导航1_NORMAL);
	setBindScreen(new Screen_参数设置(),SCRN_参数设置);
}

public String getScreenName(){
	return  "参数设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_导航1_NORMAL){
			if(msg.wParam==参数设置_显示设置_RELEASE){
				TO_SCRN(SCRN_显示设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_音频设置_RELEASE){
				TO_SCRN(SCRN_音频设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_系统设置_RELEASE){
				TO_SCRN(SCRN_系统设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_方向盘设置_RELEASE){
				TO_SCRN(SCRN_方向盘设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_参数设置_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_导航DIR1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_路径设置_RELEASE){
				TO_SCRN(SCRN_导航_2);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_返回主菜单_RELEASE){
				TO_SCRN(getMainScreen());
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_选择1_RELEASE){
				_F_启动选择("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_选择1_RELEASE){
				_F_启动选择("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_选择1_RELEASE){
				_F_启动选择("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_选择1_RELEASE){
				_F_启动选择("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_选择1_RELEASE){
				_F_启动选择("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_上页_RELEASE){
				_F_上页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置_下页_RELEASE){
				_F_下页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_参数(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
