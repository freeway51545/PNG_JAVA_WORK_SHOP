package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_VCD;
public abstract class DVP_VCD_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_VCD(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一曲(MSG_ZHW msg);
   public abstract void _F_下一曲(MSG_ZHW msg);
   public abstract void _F_PBC(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_屏显(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_重复(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_DVP_VCD= 3045;
boolean IS_ST_DVP_VCD(){ return ST_DVP_VCD==STATE;}
final static int DVP_VCD_播放= 24150;
final static int DVP_VCD_播放_RELEASE=  24151;
final static int DVP_VCD_播放_PRESSING=  24152;
final static int  DVP_VCD_播放_PRESSED=  24153;
final static int  DVP_VCD_播放_ENTER=  24154;
final static int  DVP_VCD_播放_LEAVE=  24155;

final static int DVP_VCD_上一曲= 24160;
final static int DVP_VCD_上一曲_RELEASE=  24161;
final static int DVP_VCD_上一曲_PRESSING=  24162;
final static int  DVP_VCD_上一曲_PRESSED=  24163;
final static int  DVP_VCD_上一曲_ENTER=  24164;
final static int  DVP_VCD_上一曲_LEAVE=  24165;

final static int DVP_VCD_下一曲= 24170;
final static int DVP_VCD_下一曲_RELEASE=  24171;
final static int DVP_VCD_下一曲_PRESSING=  24172;
final static int  DVP_VCD_下一曲_PRESSED=  24173;
final static int  DVP_VCD_下一曲_ENTER=  24174;
final static int  DVP_VCD_下一曲_LEAVE=  24175;

final static int DVP_VCD_PBC= 24180;
final static int DVP_VCD_PBC_RELEASE=  24181;
final static int DVP_VCD_PBC_PRESSING=  24182;
final static int  DVP_VCD_PBC_PRESSED=  24183;
final static int  DVP_VCD_PBC_ENTER=  24184;
final static int  DVP_VCD_PBC_LEAVE=  24185;

final static int DVP_VCD_声道= 24190;
final static int DVP_VCD_声道_RELEASE=  24191;
final static int DVP_VCD_声道_PRESSING=  24192;
final static int  DVP_VCD_声道_PRESSED=  24193;
final static int  DVP_VCD_声道_ENTER=  24194;
final static int  DVP_VCD_声道_LEAVE=  24195;

final static int DVP_VCD_屏显= 24200;
final static int DVP_VCD_屏显_RELEASE=  24201;
final static int DVP_VCD_屏显_PRESSING=  24202;
final static int  DVP_VCD_屏显_PRESSED=  24203;
final static int  DVP_VCD_屏显_ENTER=  24204;
final static int  DVP_VCD_屏显_LEAVE=  24205;

final static int DVP_VCD_随机= 24210;
final static int DVP_VCD_随机_RELEASE=  24211;
final static int DVP_VCD_随机_PRESSING=  24212;
final static int  DVP_VCD_随机_PRESSED=  24213;
final static int  DVP_VCD_随机_ENTER=  24214;
final static int  DVP_VCD_随机_LEAVE=  24215;

final static int DVP_VCD_重复= 24220;
final static int DVP_VCD_重复_RELEASE=  24221;
final static int DVP_VCD_重复_PRESSING=  24222;
final static int  DVP_VCD_重复_PRESSED=  24223;
final static int  DVP_VCD_重复_ENTER=  24224;
final static int  DVP_VCD_重复_LEAVE=  24225;

final static int DVP_VCD_关闭= 24230;
final static int DVP_VCD_关闭_RELEASE=  24231;
final static int DVP_VCD_关闭_PRESSING=  24232;
final static int  DVP_VCD_关闭_PRESSED=  24233;
final static int  DVP_VCD_关闭_ENTER=  24234;
final static int  DVP_VCD_关闭_LEAVE=  24235;

final static int DVP_VCD_主界面返回= 24240;
final static int DVP_VCD_主界面返回_RELEASE=  24241;
final static int DVP_VCD_主界面返回_PRESSING=  24242;
final static int  DVP_VCD_主界面返回_PRESSED=  24243;
final static int  DVP_VCD_主界面返回_ENTER=  24244;
final static int  DVP_VCD_主界面返回_LEAVE=  24245;

final static int DVP_VCD_返回列表= 24250;
final static int DVP_VCD_返回列表_RELEASE=  24251;
final static int DVP_VCD_返回列表_PRESSING=  24252;
final static int  DVP_VCD_返回列表_PRESSED=  24253;
final static int  DVP_VCD_返回列表_ENTER=  24254;
final static int  DVP_VCD_返回列表_LEAVE=  24255;


public DVP_VCD_Event() {
      actionMap.putInt("播放",DVP_VCD_播放);
      actionMap.putInt("上一曲",DVP_VCD_上一曲);
      actionMap.putInt("下一曲",DVP_VCD_下一曲);
      actionMap.putInt("PBC",DVP_VCD_PBC);
      actionMap.putInt("声道",DVP_VCD_声道);
      actionMap.putInt("屏显",DVP_VCD_屏显);
      actionMap.putInt("随机",DVP_VCD_随机);
      actionMap.putInt("重复",DVP_VCD_重复);
      actionMap.putInt("关闭",DVP_VCD_关闭);
      actionMap.putInt("主界面返回",DVP_VCD_主界面返回);
      actionMap.putInt("返回列表",DVP_VCD_返回列表);
	STATE= changeState(STATE,ST_DVP_VCD);
	setBindScreen(new Screen_DVP_VCD(),SCRN_DVP_VCD);
}

public String getScreenName(){
	return  "DVP_VCD";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_VCD){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_VCD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_上一曲_RELEASE){
				_F_上一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_下一曲_RELEASE){
				_F_下一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_PBC_RELEASE){
				_F_PBC(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_屏显_RELEASE){
				_F_屏显(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_随机_RELEASE){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_重复_RELEASE){
				_F_重复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
