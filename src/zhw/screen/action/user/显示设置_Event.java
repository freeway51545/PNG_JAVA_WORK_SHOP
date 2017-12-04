package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_显示设置;
public abstract class 显示设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET_明亮(MSG_ZHW msg);
   public abstract void _F_SET_柔和(MSG_ZHW msg);
   public abstract void _F_SET_标准(MSG_ZHW msg);
   public abstract void _F_SET_用户(MSG_ZHW msg);
   public abstract void _F_左_SET(MSG_ZHW msg);
   public abstract void _F_右_SET(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
     final static int ST_显示设置_NORMAL= 3003;
boolean IS_ST_显示设置_NORMAL(){ return ST_显示设置_NORMAL==STATE;}
final static int 显示设置_显示设置= 20310;
final static int 显示设置_显示设置_RELEASE=  20311;
final static int 显示设置_显示设置_PRESSING=  20312;
final static int  显示设置_显示设置_PRESSED=  20313;
final static int  显示设置_显示设置_ENTER=  20314;
final static int  显示设置_显示设置_LEAVE=  20315;

final static int 显示设置_音频设置= 20320;
final static int 显示设置_音频设置_RELEASE=  20321;
final static int 显示设置_音频设置_PRESSING=  20322;
final static int  显示设置_音频设置_PRESSED=  20323;
final static int  显示设置_音频设置_ENTER=  20324;
final static int  显示设置_音频设置_LEAVE=  20325;

final static int 显示设置_系统设置= 20330;
final static int 显示设置_系统设置_RELEASE=  20331;
final static int 显示设置_系统设置_PRESSING=  20332;
final static int  显示设置_系统设置_PRESSED=  20333;
final static int  显示设置_系统设置_ENTER=  20334;
final static int  显示设置_系统设置_LEAVE=  20335;

final static int 显示设置_方向盘设置= 20340;
final static int 显示设置_方向盘设置_RELEASE=  20341;
final static int 显示设置_方向盘设置_PRESSING=  20342;
final static int  显示设置_方向盘设置_PRESSED=  20343;
final static int  显示设置_方向盘设置_ENTER=  20344;
final static int  显示设置_方向盘设置_LEAVE=  20345;

final static int 显示设置_返回设置= 20350;
final static int 显示设置_返回设置_RELEASE=  20351;
final static int 显示设置_返回设置_PRESSING=  20352;
final static int  显示设置_返回设置_PRESSED=  20353;
final static int  显示设置_返回设置_ENTER=  20354;
final static int  显示设置_返回设置_LEAVE=  20355;

final static int 显示设置_明亮= 20360;
final static int 显示设置_明亮_RELEASE=  20361;
final static int 显示设置_明亮_PRESSING=  20362;
final static int  显示设置_明亮_PRESSED=  20363;
final static int  显示设置_明亮_ENTER=  20364;
final static int  显示设置_明亮_LEAVE=  20365;

final static int 显示设置_柔和= 20370;
final static int 显示设置_柔和_RELEASE=  20371;
final static int 显示设置_柔和_PRESSING=  20372;
final static int  显示设置_柔和_PRESSED=  20373;
final static int  显示设置_柔和_ENTER=  20374;
final static int  显示设置_柔和_LEAVE=  20375;

final static int 显示设置_标准= 20380;
final static int 显示设置_标准_RELEASE=  20381;
final static int 显示设置_标准_PRESSING=  20382;
final static int  显示设置_标准_PRESSED=  20383;
final static int  显示设置_标准_ENTER=  20384;
final static int  显示设置_标准_LEAVE=  20385;

final static int 显示设置_用户= 20390;
final static int 显示设置_用户_RELEASE=  20391;
final static int 显示设置_用户_PRESSING=  20392;
final static int  显示设置_用户_PRESSED=  20393;
final static int  显示设置_用户_ENTER=  20394;
final static int  显示设置_用户_LEAVE=  20395;

final static int 显示设置_左= 20400;
final static int 显示设置_左_RELEASE=  20401;
final static int 显示设置_左_PRESSING=  20402;
final static int  显示设置_左_PRESSED=  20403;
final static int  显示设置_左_ENTER=  20404;
final static int  显示设置_左_LEAVE=  20405;

final static int 显示设置_右= 20410;
final static int 显示设置_右_RELEASE=  20411;
final static int 显示设置_右_PRESSING=  20412;
final static int  显示设置_右_PRESSED=  20413;
final static int  显示设置_右_ENTER=  20414;
final static int  显示设置_右_LEAVE=  20415;


public 显示设置_Event() {
      actionMap.putInt("显示设置",显示设置_显示设置);
      actionMap.putInt("音频设置",显示设置_音频设置);
      actionMap.putInt("系统设置",显示设置_系统设置);
      actionMap.putInt("方向盘设置",显示设置_方向盘设置);
      actionMap.putInt("返回设置",显示设置_返回设置);
      actionMap.putInt("明亮",显示设置_明亮);
      actionMap.putInt("柔和",显示设置_柔和);
      actionMap.putInt("标准",显示设置_标准);
      actionMap.putInt("用户",显示设置_用户);
      actionMap.putInt("左",显示设置_左);
      actionMap.putInt("右",显示设置_右);
	STATE= changeState(STATE,ST_显示设置_NORMAL);
	setBindScreen(new Screen_显示设置(),SCRN_显示设置);
}

public String getScreenName(){
	return  "显示设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_显示设置_NORMAL){
			if(msg.wParam==显示设置_显示设置_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_音频设置_RELEASE){
				TO_SCRN(SCRN_音频设置);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_系统设置_RELEASE){
				TO_SCRN(SCRN_系统设置);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_方向盘设置_RELEASE){
				TO_SCRN(SCRN_方向盘设置);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_返回设置_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_明亮_RELEASE){
				_F_SET_明亮(msg);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_柔和_RELEASE){
				_F_SET_柔和(msg);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_标准_RELEASE){
				_F_SET_标准(msg);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_用户_RELEASE){
				_F_SET_用户(msg);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_左_RELEASE){
				_F_左_SET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==显示设置_右_RELEASE){
				_F_右_SET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_EnerFunction(MSG_ZHW msg){
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
