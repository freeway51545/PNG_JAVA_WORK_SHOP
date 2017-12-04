package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_DVD1;
public abstract class DVP_DVD1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_DVD1(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一曲(MSG_ZHW msg);
   public abstract void _F_下一曲(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_下一页(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_重复(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_DVP_DVD1= 3046;
boolean IS_ST_DVP_DVD1(){ return ST_DVP_DVD1==STATE;}
final static int DVP_DVD1_播放= 24260;
final static int DVP_DVD1_播放_RELEASE=  24261;
final static int DVP_DVD1_播放_PRESSING=  24262;
final static int  DVP_DVD1_播放_PRESSED=  24263;
final static int  DVP_DVD1_播放_ENTER=  24264;
final static int  DVP_DVD1_播放_LEAVE=  24265;

final static int DVP_DVD1_上一曲= 24270;
final static int DVP_DVD1_上一曲_RELEASE=  24271;
final static int DVP_DVD1_上一曲_PRESSING=  24272;
final static int  DVP_DVD1_上一曲_PRESSED=  24273;
final static int  DVP_DVD1_上一曲_ENTER=  24274;
final static int  DVP_DVD1_上一曲_LEAVE=  24275;

final static int DVP_DVD1_下一曲= 24280;
final static int DVP_DVD1_下一曲_RELEASE=  24281;
final static int DVP_DVD1_下一曲_PRESSING=  24282;
final static int  DVP_DVD1_下一曲_PRESSED=  24283;
final static int  DVP_DVD1_下一曲_ENTER=  24284;
final static int  DVP_DVD1_下一曲_LEAVE=  24285;

final static int DVP_DVD1_声道= 24290;
final static int DVP_DVD1_声道_RELEASE=  24291;
final static int DVP_DVD1_声道_PRESSING=  24292;
final static int  DVP_DVD1_声道_PRESSED=  24293;
final static int  DVP_DVD1_声道_ENTER=  24294;
final static int  DVP_DVD1_声道_LEAVE=  24295;

final static int DVP_DVD1_下一页= 24300;
final static int DVP_DVD1_下一页_RELEASE=  24301;
final static int DVP_DVD1_下一页_PRESSING=  24302;
final static int  DVP_DVD1_下一页_PRESSED=  24303;
final static int  DVP_DVD1_下一页_ENTER=  24304;
final static int  DVP_DVD1_下一页_LEAVE=  24305;

final static int DVP_DVD1_随机= 24310;
final static int DVP_DVD1_随机_RELEASE=  24311;
final static int DVP_DVD1_随机_PRESSING=  24312;
final static int  DVP_DVD1_随机_PRESSED=  24313;
final static int  DVP_DVD1_随机_ENTER=  24314;
final static int  DVP_DVD1_随机_LEAVE=  24315;

final static int DVP_DVD1_重复= 24320;
final static int DVP_DVD1_重复_RELEASE=  24321;
final static int DVP_DVD1_重复_PRESSING=  24322;
final static int  DVP_DVD1_重复_PRESSED=  24323;
final static int  DVP_DVD1_重复_ENTER=  24324;
final static int  DVP_DVD1_重复_LEAVE=  24325;

final static int DVP_DVD1_关闭= 24330;
final static int DVP_DVD1_关闭_RELEASE=  24331;
final static int DVP_DVD1_关闭_PRESSING=  24332;
final static int  DVP_DVD1_关闭_PRESSED=  24333;
final static int  DVP_DVD1_关闭_ENTER=  24334;
final static int  DVP_DVD1_关闭_LEAVE=  24335;

final static int DVP_DVD1_主界面返回= 24340;
final static int DVP_DVD1_主界面返回_RELEASE=  24341;
final static int DVP_DVD1_主界面返回_PRESSING=  24342;
final static int  DVP_DVD1_主界面返回_PRESSED=  24343;
final static int  DVP_DVD1_主界面返回_ENTER=  24344;
final static int  DVP_DVD1_主界面返回_LEAVE=  24345;

final static int DVP_DVD1_返回列表= 24350;
final static int DVP_DVD1_返回列表_RELEASE=  24351;
final static int DVP_DVD1_返回列表_PRESSING=  24352;
final static int  DVP_DVD1_返回列表_PRESSED=  24353;
final static int  DVP_DVD1_返回列表_ENTER=  24354;
final static int  DVP_DVD1_返回列表_LEAVE=  24355;


public DVP_DVD1_Event() {
      actionMap.putInt("播放",DVP_DVD1_播放);
      actionMap.putInt("上一曲",DVP_DVD1_上一曲);
      actionMap.putInt("下一曲",DVP_DVD1_下一曲);
      actionMap.putInt("声道",DVP_DVD1_声道);
      actionMap.putInt("下一页",DVP_DVD1_下一页);
      actionMap.putInt("随机",DVP_DVD1_随机);
      actionMap.putInt("重复",DVP_DVD1_重复);
      actionMap.putInt("关闭",DVP_DVD1_关闭);
      actionMap.putInt("主界面返回",DVP_DVD1_主界面返回);
      actionMap.putInt("返回列表",DVP_DVD1_返回列表);
	STATE= changeState(STATE,ST_DVP_DVD1);
	setBindScreen(new Screen_DVP_DVD1(),SCRN_DVP_DVD1);
}

public String getScreenName(){
	return  "DVP_DVD1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_DVD1){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_DVD1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_上一曲_RELEASE){
				_F_上一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_下一曲_RELEASE){
				_F_下一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_随机_RELEASE){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_重复_RELEASE){
				_F_重复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
