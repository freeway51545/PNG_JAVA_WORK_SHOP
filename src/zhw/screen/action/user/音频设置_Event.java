package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_音频设置;
public abstract class 音频设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_前(MSG_ZHW msg);
   public abstract void _F_左(MSG_ZHW msg);
   public abstract void _F_右(MSG_ZHW msg);
   public abstract void _F_后(MSG_ZHW msg);
   public abstract void _F_低音_LEFT(MSG_ZHW msg);
   public abstract void _F_低音_RIGHT(MSG_ZHW msg);
   public abstract void _F_高音_LEFT(MSG_ZHW msg);
   public abstract void _F_高音_RIGHT(MSG_ZHW msg);
   public abstract void _F_LOUD_ON(MSG_ZHW msg);
   public abstract void _F_LOUD_OFF(MSG_ZHW msg);
   public abstract void _F_流行(MSG_ZHW msg);
   public abstract void _F_摇滚(MSG_ZHW msg);
   public abstract void _F_爵士(MSG_ZHW msg);
   public abstract void _F_古典(MSG_ZHW msg);
   public abstract void _F_标准(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_RETURN_MAIN(MSG_ZHW msg);
   public abstract void _F_MSG_KEY_EVENT(MSG_ZHW msg);
     final static int ST_音频设置_NORMAL= 3004;
boolean IS_ST_音频设置_NORMAL(){ return ST_音频设置_NORMAL==STATE;}
final static int 音频设置_显示设置= 20420;
final static int 音频设置_显示设置_RELEASE=  20421;
final static int 音频设置_显示设置_PRESSING=  20422;
final static int  音频设置_显示设置_PRESSED=  20423;
final static int  音频设置_显示设置_ENTER=  20424;
final static int  音频设置_显示设置_LEAVE=  20425;

final static int 音频设置_音频设置= 20430;
final static int 音频设置_音频设置_RELEASE=  20431;
final static int 音频设置_音频设置_PRESSING=  20432;
final static int  音频设置_音频设置_PRESSED=  20433;
final static int  音频设置_音频设置_ENTER=  20434;
final static int  音频设置_音频设置_LEAVE=  20435;

final static int 音频设置_系统设置= 20440;
final static int 音频设置_系统设置_RELEASE=  20441;
final static int 音频设置_系统设置_PRESSING=  20442;
final static int  音频设置_系统设置_PRESSED=  20443;
final static int  音频设置_系统设置_ENTER=  20444;
final static int  音频设置_系统设置_LEAVE=  20445;

final static int 音频设置_方向盘设置= 20450;
final static int 音频设置_方向盘设置_RELEASE=  20451;
final static int 音频设置_方向盘设置_PRESSING=  20452;
final static int  音频设置_方向盘设置_PRESSED=  20453;
final static int  音频设置_方向盘设置_ENTER=  20454;
final static int  音频设置_方向盘设置_LEAVE=  20455;

final static int 音频设置_参数设置= 20460;
final static int 音频设置_参数设置_RELEASE=  20461;
final static int 音频设置_参数设置_PRESSING=  20462;
final static int  音频设置_参数设置_PRESSED=  20463;
final static int  音频设置_参数设置_ENTER=  20464;
final static int  音频设置_参数设置_LEAVE=  20465;

final static int 音频设置_前= 20470;
final static int 音频设置_前_RELEASE=  20471;
final static int 音频设置_前_PRESSING=  20472;
final static int  音频设置_前_PRESSED=  20473;
final static int  音频设置_前_ENTER=  20474;
final static int  音频设置_前_LEAVE=  20475;

final static int 音频设置_左= 20480;
final static int 音频设置_左_RELEASE=  20481;
final static int 音频设置_左_PRESSING=  20482;
final static int  音频设置_左_PRESSED=  20483;
final static int  音频设置_左_ENTER=  20484;
final static int  音频设置_左_LEAVE=  20485;

final static int 音频设置_右= 20490;
final static int 音频设置_右_RELEASE=  20491;
final static int 音频设置_右_PRESSING=  20492;
final static int  音频设置_右_PRESSED=  20493;
final static int  音频设置_右_ENTER=  20494;
final static int  音频设置_右_LEAVE=  20495;

final static int 音频设置_后= 20500;
final static int 音频设置_后_RELEASE=  20501;
final static int 音频设置_后_PRESSING=  20502;
final static int  音频设置_后_PRESSED=  20503;
final static int  音频设置_后_ENTER=  20504;
final static int  音频设置_后_LEAVE=  20505;

final static int 音频设置_低音_LEFT= 20510;
final static int 音频设置_低音_LEFT_RELEASE=  20511;
final static int 音频设置_低音_LEFT_PRESSING=  20512;
final static int  音频设置_低音_LEFT_PRESSED=  20513;
final static int  音频设置_低音_LEFT_ENTER=  20514;
final static int  音频设置_低音_LEFT_LEAVE=  20515;

final static int 音频设置_低音_RIGHT= 20520;
final static int 音频设置_低音_RIGHT_RELEASE=  20521;
final static int 音频设置_低音_RIGHT_PRESSING=  20522;
final static int  音频设置_低音_RIGHT_PRESSED=  20523;
final static int  音频设置_低音_RIGHT_ENTER=  20524;
final static int  音频设置_低音_RIGHT_LEAVE=  20525;

final static int 音频设置_高音_LEFT= 20530;
final static int 音频设置_高音_LEFT_RELEASE=  20531;
final static int 音频设置_高音_LEFT_PRESSING=  20532;
final static int  音频设置_高音_LEFT_PRESSED=  20533;
final static int  音频设置_高音_LEFT_ENTER=  20534;
final static int  音频设置_高音_LEFT_LEAVE=  20535;

final static int 音频设置_高音_RIGHT= 20540;
final static int 音频设置_高音_RIGHT_RELEASE=  20541;
final static int 音频设置_高音_RIGHT_PRESSING=  20542;
final static int  音频设置_高音_RIGHT_PRESSED=  20543;
final static int  音频设置_高音_RIGHT_ENTER=  20544;
final static int  音频设置_高音_RIGHT_LEAVE=  20545;

final static int 音频设置_LOUD_ON= 20550;
final static int 音频设置_LOUD_ON_RELEASE=  20551;
final static int 音频设置_LOUD_ON_PRESSING=  20552;
final static int  音频设置_LOUD_ON_PRESSED=  20553;
final static int  音频设置_LOUD_ON_ENTER=  20554;
final static int  音频设置_LOUD_ON_LEAVE=  20555;

final static int 音频设置_LOUD_OFF= 20560;
final static int 音频设置_LOUD_OFF_RELEASE=  20561;
final static int 音频设置_LOUD_OFF_PRESSING=  20562;
final static int  音频设置_LOUD_OFF_PRESSED=  20563;
final static int  音频设置_LOUD_OFF_ENTER=  20564;
final static int  音频设置_LOUD_OFF_LEAVE=  20565;

final static int 音频设置_流行= 20570;
final static int 音频设置_流行_RELEASE=  20571;
final static int 音频设置_流行_PRESSING=  20572;
final static int  音频设置_流行_PRESSED=  20573;
final static int  音频设置_流行_ENTER=  20574;
final static int  音频设置_流行_LEAVE=  20575;

final static int 音频设置_摇滚= 20580;
final static int 音频设置_摇滚_RELEASE=  20581;
final static int 音频设置_摇滚_PRESSING=  20582;
final static int  音频设置_摇滚_PRESSED=  20583;
final static int  音频设置_摇滚_ENTER=  20584;
final static int  音频设置_摇滚_LEAVE=  20585;

final static int 音频设置_爵士= 20590;
final static int 音频设置_爵士_RELEASE=  20591;
final static int 音频设置_爵士_PRESSING=  20592;
final static int  音频设置_爵士_PRESSED=  20593;
final static int  音频设置_爵士_ENTER=  20594;
final static int  音频设置_爵士_LEAVE=  20595;

final static int 音频设置_古典= 20600;
final static int 音频设置_古典_RELEASE=  20601;
final static int 音频设置_古典_PRESSING=  20602;
final static int  音频设置_古典_PRESSED=  20603;
final static int  音频设置_古典_ENTER=  20604;
final static int  音频设置_古典_LEAVE=  20605;

final static int 音频设置_标准= 20610;
final static int 音频设置_标准_RELEASE=  20611;
final static int 音频设置_标准_PRESSING=  20612;
final static int  音频设置_标准_PRESSED=  20613;
final static int  音频设置_标准_ENTER=  20614;
final static int  音频设置_标准_LEAVE=  20615;

final static int 音频设置_返回按钮= 20620;
final static int 音频设置_返回按钮_RELEASE=  20621;
final static int 音频设置_返回按钮_PRESSING=  20622;
final static int  音频设置_返回按钮_PRESSED=  20623;
final static int  音频设置_返回按钮_ENTER=  20624;
final static int  音频设置_返回按钮_LEAVE=  20625;


public 音频设置_Event() {
      actionMap.putInt("显示设置",音频设置_显示设置);
      actionMap.putInt("音频设置",音频设置_音频设置);
      actionMap.putInt("系统设置",音频设置_系统设置);
      actionMap.putInt("方向盘设置",音频设置_方向盘设置);
      actionMap.putInt("参数设置",音频设置_参数设置);
      actionMap.putInt("前",音频设置_前);
      actionMap.putInt("左",音频设置_左);
      actionMap.putInt("右",音频设置_右);
      actionMap.putInt("后",音频设置_后);
      actionMap.putInt("低音_LEFT",音频设置_低音_LEFT);
      actionMap.putInt("低音_RIGHT",音频设置_低音_RIGHT);
      actionMap.putInt("高音_LEFT",音频设置_高音_LEFT);
      actionMap.putInt("高音_RIGHT",音频设置_高音_RIGHT);
      actionMap.putInt("LOUD_ON",音频设置_LOUD_ON);
      actionMap.putInt("LOUD_OFF",音频设置_LOUD_OFF);
      actionMap.putInt("流行",音频设置_流行);
      actionMap.putInt("摇滚",音频设置_摇滚);
      actionMap.putInt("爵士",音频设置_爵士);
      actionMap.putInt("古典",音频设置_古典);
      actionMap.putInt("标准",音频设置_标准);
      actionMap.putInt("返回按钮",音频设置_返回按钮);
	STATE= changeState(STATE,ST_音频设置_NORMAL);
	setBindScreen(new Screen_音频设置(),SCRN_音频设置);
}

public String getScreenName(){
	return  "音频设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_音频设置_NORMAL){
			if(msg.wParam==音频设置_显示设置_RELEASE){
				TO_SCRN(SCRN_显示设置);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_音频设置_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_系统设置_RELEASE){
				TO_SCRN(SCRN_系统设置);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_方向盘设置_RELEASE){
				TO_SCRN(SCRN_方向盘设置);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_参数设置_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_前_RELEASE){
				_F_前(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_左_RELEASE){
				_F_左(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_右_RELEASE){
				_F_右(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_后_RELEASE){
				_F_后(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_低音_LEFT_RELEASE){
				_F_低音_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_低音_RIGHT_RELEASE){
				_F_低音_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_高音_LEFT_RELEASE){
				_F_高音_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_高音_RIGHT_RELEASE){
				_F_高音_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_LOUD_ON_RELEASE){
				_F_LOUD_ON(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_LOUD_OFF_RELEASE){
				_F_LOUD_OFF(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_流行_RELEASE){
				_F_流行(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_摇滚_RELEASE){
				_F_摇滚(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_爵士_RELEASE){
				_F_爵士(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_古典_RELEASE){
				_F_古典(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_标准_RELEASE){
				_F_标准(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频设置_返回按钮_RELEASE){
				_F_RETURN_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_MSG_KEY_EVENT(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
