package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MEDIA;
public abstract class MEDIA_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_MEIDA(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一曲(MSG_ZHW msg);
   public abstract void _F_下一曲(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_屏显(MSG_ZHW msg);
   public abstract void _F_重复(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_MEDIA= 3050;
boolean IS_ST_MEDIA(){ return ST_MEDIA==STATE;}
final static int MEDIA_播放= 24560;
final static int MEDIA_播放_RELEASE=  24561;
final static int MEDIA_播放_PRESSING=  24562;
final static int  MEDIA_播放_PRESSED=  24563;
final static int  MEDIA_播放_ENTER=  24564;
final static int  MEDIA_播放_LEAVE=  24565;

final static int MEDIA_上一曲= 24570;
final static int MEDIA_上一曲_RELEASE=  24571;
final static int MEDIA_上一曲_PRESSING=  24572;
final static int  MEDIA_上一曲_PRESSED=  24573;
final static int  MEDIA_上一曲_ENTER=  24574;
final static int  MEDIA_上一曲_LEAVE=  24575;

final static int MEDIA_下一曲= 24580;
final static int MEDIA_下一曲_RELEASE=  24581;
final static int MEDIA_下一曲_PRESSING=  24582;
final static int  MEDIA_下一曲_PRESSED=  24583;
final static int  MEDIA_下一曲_ENTER=  24584;
final static int  MEDIA_下一曲_LEAVE=  24585;

final static int MEDIA_声道= 24590;
final static int MEDIA_声道_RELEASE=  24591;
final static int MEDIA_声道_PRESSING=  24592;
final static int  MEDIA_声道_PRESSED=  24593;
final static int  MEDIA_声道_ENTER=  24594;
final static int  MEDIA_声道_LEAVE=  24595;

final static int MEDIA_屏显= 24600;
final static int MEDIA_屏显_RELEASE=  24601;
final static int MEDIA_屏显_PRESSING=  24602;
final static int  MEDIA_屏显_PRESSED=  24603;
final static int  MEDIA_屏显_ENTER=  24604;
final static int  MEDIA_屏显_LEAVE=  24605;

final static int MEDIA_重复= 24610;
final static int MEDIA_重复_RELEASE=  24611;
final static int MEDIA_重复_PRESSING=  24612;
final static int  MEDIA_重复_PRESSED=  24613;
final static int  MEDIA_重复_ENTER=  24614;
final static int  MEDIA_重复_LEAVE=  24615;

final static int MEDIA_随机= 24620;
final static int MEDIA_随机_RELEASE=  24621;
final static int MEDIA_随机_PRESSING=  24622;
final static int  MEDIA_随机_PRESSED=  24623;
final static int  MEDIA_随机_ENTER=  24624;
final static int  MEDIA_随机_LEAVE=  24625;

final static int MEDIA_关闭= 24630;
final static int MEDIA_关闭_RELEASE=  24631;
final static int MEDIA_关闭_PRESSING=  24632;
final static int  MEDIA_关闭_PRESSED=  24633;
final static int  MEDIA_关闭_ENTER=  24634;
final static int  MEDIA_关闭_LEAVE=  24635;

final static int MEDIA_主界面返回= 24640;
final static int MEDIA_主界面返回_RELEASE=  24641;
final static int MEDIA_主界面返回_PRESSING=  24642;
final static int  MEDIA_主界面返回_PRESSED=  24643;
final static int  MEDIA_主界面返回_ENTER=  24644;
final static int  MEDIA_主界面返回_LEAVE=  24645;

final static int MEDIA_返回列表= 24650;
final static int MEDIA_返回列表_RELEASE=  24651;
final static int MEDIA_返回列表_PRESSING=  24652;
final static int  MEDIA_返回列表_PRESSED=  24653;
final static int  MEDIA_返回列表_ENTER=  24654;
final static int  MEDIA_返回列表_LEAVE=  24655;


public MEDIA_Event() {
      actionMap.putInt("播放",MEDIA_播放);
      actionMap.putInt("上一曲",MEDIA_上一曲);
      actionMap.putInt("下一曲",MEDIA_下一曲);
      actionMap.putInt("声道",MEDIA_声道);
      actionMap.putInt("屏显",MEDIA_屏显);
      actionMap.putInt("重复",MEDIA_重复);
      actionMap.putInt("随机",MEDIA_随机);
      actionMap.putInt("关闭",MEDIA_关闭);
      actionMap.putInt("主界面返回",MEDIA_主界面返回);
      actionMap.putInt("返回列表",MEDIA_返回列表);
	STATE= changeState(STATE,ST_MEDIA);
	setBindScreen(new Screen_MEDIA(),SCRN_MEDIA);
}

public String getScreenName(){
	return  "MEDIA";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MEDIA){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_MEIDA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_上一曲_RELEASE){
				_F_上一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_下一曲_RELEASE){
				_F_下一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_屏显_RELEASE){
				_F_屏显(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_重复_RELEASE){
				_F_重复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_随机_RELEASE){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
