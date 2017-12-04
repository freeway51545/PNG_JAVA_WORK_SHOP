package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class DVD1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_TO_SETING(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_屏显(MSG_ZHW msg);
   public abstract void _F_反复(MSG_ZHW msg);
   public abstract void _F_AB(MSG_ZHW msg);
   public abstract void _F_立体声(MSG_ZHW msg);
   public abstract void _F_上(MSG_ZHW msg);
   public abstract void _F_下(MSG_ZHW msg);
   public abstract void _F_左(MSG_ZHW msg);
   public abstract void _F_右(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_菜单(MSG_ZHW msg);
   public abstract void _F_菜单_PRESSING(MSG_ZHW msg);
   public abstract void _F_全屏(MSG_ZHW msg);
   public abstract void _F_上一曲_RELEASE(MSG_ZHW msg);
   public abstract void _F_下一曲_RELEASE(MSG_ZHW msg);
   public abstract void _F_快进_RELEASE(MSG_ZHW msg);
   public abstract void _F_快退_RELEASE(MSG_ZHW msg);
   public abstract void _F_播放_RELEASE(MSG_ZHW msg);
   public abstract void _F_停止_RELEASE(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_BT_STATE_CHANGED(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_REMOTE_KEY_DEAL(MSG_ZHW msg);
   public abstract void _F_CHANGE_TO_CONTROL(MSG_ZHW msg);
   public abstract void _F_CHANGE_TO_WINCE(MSG_ZHW msg);
   public abstract void _F_DVD_TIMMER(MSG_ZHW msg);
   public abstract void _F_FILE_PLAY_OVER(MSG_ZHW msg);
   public abstract void _F_SCRN_ENTERED(MSG_ZHW msg);
   public abstract void _F_CHECK_YUV(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_主界面(MSG_ZHW msg);
     final static int ST_DVD1_NORMAL= 3001;
boolean IS_ST_DVD1_NORMAL(){ return ST_DVD1_NORMAL==STATE;}
final static int DVD1_设置= 20180;
final static int DVD1_设置_RELEASE=  20181;
final static int DVD1_设置_PRESSING=  20182;
final static int  DVD1_设置_PRESSED=  20183;
final static int  DVD1_设置_ENTER=  20184;
final static int  DVD1_设置_LEAVE=  20185;

final static int DVD1_换页= 20190;
final static int DVD1_换页_RELEASE=  20191;
final static int DVD1_换页_PRESSING=  20192;
final static int  DVD1_换页_PRESSED=  20193;
final static int  DVD1_换页_ENTER=  20194;
final static int  DVD1_换页_LEAVE=  20195;

final static int DVD1_随机= 20200;
final static int DVD1_随机_RELEASE=  20201;
final static int DVD1_随机_PRESSING=  20202;
final static int  DVD1_随机_PRESSED=  20203;
final static int  DVD1_随机_ENTER=  20204;
final static int  DVD1_随机_LEAVE=  20205;

final static int DVD1_声道= 20210;
final static int DVD1_声道_RELEASE=  20211;
final static int DVD1_声道_PRESSING=  20212;
final static int  DVD1_声道_PRESSED=  20213;
final static int  DVD1_声道_ENTER=  20214;
final static int  DVD1_声道_LEAVE=  20215;

final static int DVD1_屏显= 20220;
final static int DVD1_屏显_RELEASE=  20221;
final static int DVD1_屏显_PRESSING=  20222;
final static int  DVD1_屏显_PRESSED=  20223;
final static int  DVD1_屏显_ENTER=  20224;
final static int  DVD1_屏显_LEAVE=  20225;

final static int DVD1_反复= 20230;
final static int DVD1_反复_RELEASE=  20231;
final static int DVD1_反复_PRESSING=  20232;
final static int  DVD1_反复_PRESSED=  20233;
final static int  DVD1_反复_ENTER=  20234;
final static int  DVD1_反复_LEAVE=  20235;

final static int DVD1_AB= 20240;
final static int DVD1_AB_RELEASE=  20241;
final static int DVD1_AB_PRESSING=  20242;
final static int  DVD1_AB_PRESSED=  20243;
final static int  DVD1_AB_ENTER=  20244;
final static int  DVD1_AB_LEAVE=  20245;

final static int DVD1_立体声= 20250;
final static int DVD1_立体声_RELEASE=  20251;
final static int DVD1_立体声_PRESSING=  20252;
final static int  DVD1_立体声_PRESSED=  20253;
final static int  DVD1_立体声_ENTER=  20254;
final static int  DVD1_立体声_LEAVE=  20255;

final static int DVD1_上= 20260;
final static int DVD1_上_RELEASE=  20261;
final static int DVD1_上_PRESSING=  20262;
final static int  DVD1_上_PRESSED=  20263;
final static int  DVD1_上_ENTER=  20264;
final static int  DVD1_上_LEAVE=  20265;

final static int DVD1_下= 20270;
final static int DVD1_下_RELEASE=  20271;
final static int DVD1_下_PRESSING=  20272;
final static int  DVD1_下_PRESSED=  20273;
final static int  DVD1_下_ENTER=  20274;
final static int  DVD1_下_LEAVE=  20275;

final static int DVD1_左= 20280;
final static int DVD1_左_RELEASE=  20281;
final static int DVD1_左_PRESSING=  20282;
final static int  DVD1_左_PRESSED=  20283;
final static int  DVD1_左_ENTER=  20284;
final static int  DVD1_左_LEAVE=  20285;

final static int DVD1_右= 20290;
final static int DVD1_右_RELEASE=  20291;
final static int DVD1_右_PRESSING=  20292;
final static int  DVD1_右_PRESSED=  20293;
final static int  DVD1_右_ENTER=  20294;
final static int  DVD1_右_LEAVE=  20295;

final static int DVD1_OK= 20300;
final static int DVD1_OK_RELEASE=  20301;
final static int DVD1_OK_PRESSING=  20302;
final static int  DVD1_OK_PRESSED=  20303;
final static int  DVD1_OK_ENTER=  20304;
final static int  DVD1_OK_LEAVE=  20305;

final static int DVD1_菜单= 20310;
final static int DVD1_菜单_RELEASE=  20311;
final static int DVD1_菜单_PRESSING=  20312;
final static int  DVD1_菜单_PRESSED=  20313;
final static int  DVD1_菜单_ENTER=  20314;
final static int  DVD1_菜单_LEAVE=  20315;

final static int DVD1_全屏= 20320;
final static int DVD1_全屏_RELEASE=  20321;
final static int DVD1_全屏_PRESSING=  20322;
final static int  DVD1_全屏_PRESSED=  20323;
final static int  DVD1_全屏_ENTER=  20324;
final static int  DVD1_全屏_LEAVE=  20325;

final static int DVD1_上一曲= 20330;
final static int DVD1_上一曲_RELEASE=  20331;
final static int DVD1_上一曲_PRESSING=  20332;
final static int  DVD1_上一曲_PRESSED=  20333;
final static int  DVD1_上一曲_ENTER=  20334;
final static int  DVD1_上一曲_LEAVE=  20335;

final static int DVD1_下一曲= 20340;
final static int DVD1_下一曲_RELEASE=  20341;
final static int DVD1_下一曲_PRESSING=  20342;
final static int  DVD1_下一曲_PRESSED=  20343;
final static int  DVD1_下一曲_ENTER=  20344;
final static int  DVD1_下一曲_LEAVE=  20345;

final static int DVD1_快进= 20350;
final static int DVD1_快进_RELEASE=  20351;
final static int DVD1_快进_PRESSING=  20352;
final static int  DVD1_快进_PRESSED=  20353;
final static int  DVD1_快进_ENTER=  20354;
final static int  DVD1_快进_LEAVE=  20355;

final static int DVD1_快退= 20360;
final static int DVD1_快退_RELEASE=  20361;
final static int DVD1_快退_PRESSING=  20362;
final static int  DVD1_快退_PRESSED=  20363;
final static int  DVD1_快退_ENTER=  20364;
final static int  DVD1_快退_LEAVE=  20365;

final static int DVD1_播放= 20370;
final static int DVD1_播放_RELEASE=  20371;
final static int DVD1_播放_PRESSING=  20372;
final static int  DVD1_播放_PRESSED=  20373;
final static int  DVD1_播放_ENTER=  20374;
final static int  DVD1_播放_LEAVE=  20375;

final static int DVD1_停止= 20380;
final static int DVD1_停止_RELEASE=  20381;
final static int DVD1_停止_PRESSING=  20382;
final static int  DVD1_停止_PRESSED=  20383;
final static int  DVD1_停止_ENTER=  20384;
final static int  DVD1_停止_LEAVE=  20385;

final static int DVD1_$MSG_BT_STATE_CHANGED= 20390;
final static int DVD1_$MSG_BT_STATE_CHANGED_RELEASE=  20391;
final static int DVD1_$MSG_BT_STATE_CHANGED_PRESSING=  20392;
final static int  DVD1_$MSG_BT_STATE_CHANGED_PRESSED=  20393;
final static int  DVD1_$MSG_BT_STATE_CHANGED_ENTER=  20394;
final static int  DVD1_$MSG_BT_STATE_CHANGED_LEAVE=  20395;

final static int DVD1_返回按钮= 20400;
final static int DVD1_返回按钮_RELEASE=  20401;
final static int DVD1_返回按钮_PRESSING=  20402;
final static int  DVD1_返回按钮_PRESSED=  20403;
final static int  DVD1_返回按钮_ENTER=  20404;
final static int  DVD1_返回按钮_LEAVE=  20405;

final static int DVD1_关闭= 20410;
final static int DVD1_关闭_RELEASE=  20411;
final static int DVD1_关闭_PRESSING=  20412;
final static int  DVD1_关闭_PRESSED=  20413;
final static int  DVD1_关闭_ENTER=  20414;
final static int  DVD1_关闭_LEAVE=  20415;

final static int DVD1_主界面返回= 20420;
final static int DVD1_主界面返回_RELEASE=  20421;
final static int DVD1_主界面返回_PRESSING=  20422;
final static int  DVD1_主界面返回_PRESSED=  20423;
final static int  DVD1_主界面返回_ENTER=  20424;
final static int  DVD1_主界面返回_LEAVE=  20425;


public DVD1_Event() {
      actionMap.putInt("设置",DVD1_设置);
      actionMap.putInt("换页",DVD1_换页);
      actionMap.putInt("随机",DVD1_随机);
      actionMap.putInt("声道",DVD1_声道);
      actionMap.putInt("屏显",DVD1_屏显);
      actionMap.putInt("反复",DVD1_反复);
      actionMap.putInt("AB",DVD1_AB);
      actionMap.putInt("立体声",DVD1_立体声);
      actionMap.putInt("上",DVD1_上);
      actionMap.putInt("下",DVD1_下);
      actionMap.putInt("左",DVD1_左);
      actionMap.putInt("右",DVD1_右);
      actionMap.putInt("OK",DVD1_OK);
      actionMap.putInt("菜单",DVD1_菜单);
      actionMap.putInt("全屏",DVD1_全屏);
      actionMap.putInt("上一曲",DVD1_上一曲);
      actionMap.putInt("下一曲",DVD1_下一曲);
      actionMap.putInt("快进",DVD1_快进);
      actionMap.putInt("快退",DVD1_快退);
      actionMap.putInt("播放",DVD1_播放);
      actionMap.putInt("停止",DVD1_停止);
      actionMap.putInt("$MSG_BT_STATE_CHANGED",DVD1_$MSG_BT_STATE_CHANGED);
      actionMap.putInt("返回按钮",DVD1_返回按钮);
      actionMap.putInt("关闭",DVD1_关闭);
      actionMap.putInt("主界面返回",DVD1_主界面返回);
	STATE= changeState(STATE,ST_DVD1_NORMAL);
}

public String getScreenName(){
	return  "DVD1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVD1_NORMAL){
			if(msg.wParam==DVD1_设置_RELEASE){
				_F_TO_SETING(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_换页_RELEASE){
				TO_SCRN(SCRN_DVD);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_随机_PRESSED){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_声道_PRESSED){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_屏显_PRESSED){
				_F_屏显(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_反复_PRESSED){
				_F_反复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_AB_PRESSED){
				_F_AB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_立体声_PRESSED){
				_F_立体声(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_上_PRESSED){
				_F_上(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_下_PRESSED){
				_F_下(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_左_PRESSED){
				_F_左(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_右_PRESSED){
				_F_右(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_OK_PRESSED){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_菜单_RELEASE){
				_F_菜单(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_菜单_PRESSING){
				_F_菜单_PRESSING(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_全屏_PRESSED){
				_F_全屏(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_上一曲_PRESSED){
				_F_上一曲_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_下一曲_PRESSED){
				_F_下一曲_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_快进_PRESSED){
				_F_快进_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_快退_PRESSED){
				_F_快退_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_播放_PRESSED){
				_F_播放_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_停止_PRESSED){
				_F_停止_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_$MSG_BT_STATE_CHANGED){
				_F_BT_STATE_CHANGED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_返回按钮_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_REMOTE_KEY_DEAL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CHANGE_TO_CONTROL){
				_F_CHANGE_TO_CONTROL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CHANGE_TO_WINCE){
				_F_CHANGE_TO_WINCE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_DVD_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SCREEN_右滑动){
				TO_SCRN(SCRN_DVD);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FILE_PLAY_OVER){
				_F_FILE_PLAY_OVER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FULL_SCREEN_CAMERA){
				_F_全屏(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTERED_NEW){
				_F_SCRN_ENTERED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_YUV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_主界面返回_RELEASE){
				_F_主界面(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
