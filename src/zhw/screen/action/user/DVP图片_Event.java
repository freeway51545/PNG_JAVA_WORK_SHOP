package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP图片;
public abstract class DVP图片_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP图片(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一张(MSG_ZHW msg);
   public abstract void _F_下一张(MSG_ZHW msg);
   public abstract void _F_放大(MSG_ZHW msg);
   public abstract void _F_缩小(MSG_ZHW msg);
   public abstract void _F_旋转(MSG_ZHW msg);
   public abstract void _F_循环(MSG_ZHW msg);
   public abstract void _F_重复(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_DVP图片= 3043;
boolean IS_ST_DVP图片(){ return ST_DVP图片==STATE;}
final static int DVP图片_播放= 23970;
final static int DVP图片_播放_RELEASE=  23971;
final static int DVP图片_播放_PRESSING=  23972;
final static int  DVP图片_播放_PRESSED=  23973;
final static int  DVP图片_播放_ENTER=  23974;
final static int  DVP图片_播放_LEAVE=  23975;

final static int DVP图片_上一张= 23980;
final static int DVP图片_上一张_RELEASE=  23981;
final static int DVP图片_上一张_PRESSING=  23982;
final static int  DVP图片_上一张_PRESSED=  23983;
final static int  DVP图片_上一张_ENTER=  23984;
final static int  DVP图片_上一张_LEAVE=  23985;

final static int DVP图片_下一张= 23990;
final static int DVP图片_下一张_RELEASE=  23991;
final static int DVP图片_下一张_PRESSING=  23992;
final static int  DVP图片_下一张_PRESSED=  23993;
final static int  DVP图片_下一张_ENTER=  23994;
final static int  DVP图片_下一张_LEAVE=  23995;

final static int DVP图片_放大= 24000;
final static int DVP图片_放大_RELEASE=  24001;
final static int DVP图片_放大_PRESSING=  24002;
final static int  DVP图片_放大_PRESSED=  24003;
final static int  DVP图片_放大_ENTER=  24004;
final static int  DVP图片_放大_LEAVE=  24005;

final static int DVP图片_缩小= 24010;
final static int DVP图片_缩小_RELEASE=  24011;
final static int DVP图片_缩小_PRESSING=  24012;
final static int  DVP图片_缩小_PRESSED=  24013;
final static int  DVP图片_缩小_ENTER=  24014;
final static int  DVP图片_缩小_LEAVE=  24015;

final static int DVP图片_旋转= 24020;
final static int DVP图片_旋转_RELEASE=  24021;
final static int DVP图片_旋转_PRESSING=  24022;
final static int  DVP图片_旋转_PRESSED=  24023;
final static int  DVP图片_旋转_ENTER=  24024;
final static int  DVP图片_旋转_LEAVE=  24025;

final static int DVP图片_循环= 24030;
final static int DVP图片_循环_RELEASE=  24031;
final static int DVP图片_循环_PRESSING=  24032;
final static int  DVP图片_循环_PRESSED=  24033;
final static int  DVP图片_循环_ENTER=  24034;
final static int  DVP图片_循环_LEAVE=  24035;

final static int DVP图片_重复= 24040;
final static int DVP图片_重复_RELEASE=  24041;
final static int DVP图片_重复_PRESSING=  24042;
final static int  DVP图片_重复_PRESSED=  24043;
final static int  DVP图片_重复_ENTER=  24044;
final static int  DVP图片_重复_LEAVE=  24045;

final static int DVP图片_关闭= 24050;
final static int DVP图片_关闭_RELEASE=  24051;
final static int DVP图片_关闭_PRESSING=  24052;
final static int  DVP图片_关闭_PRESSED=  24053;
final static int  DVP图片_关闭_ENTER=  24054;
final static int  DVP图片_关闭_LEAVE=  24055;

final static int DVP图片_返回列表= 24060;
final static int DVP图片_返回列表_RELEASE=  24061;
final static int DVP图片_返回列表_PRESSING=  24062;
final static int  DVP图片_返回列表_PRESSED=  24063;
final static int  DVP图片_返回列表_ENTER=  24064;
final static int  DVP图片_返回列表_LEAVE=  24065;


public DVP图片_Event() {
      actionMap.putInt("播放",DVP图片_播放);
      actionMap.putInt("上一张",DVP图片_上一张);
      actionMap.putInt("下一张",DVP图片_下一张);
      actionMap.putInt("放大",DVP图片_放大);
      actionMap.putInt("缩小",DVP图片_缩小);
      actionMap.putInt("旋转",DVP图片_旋转);
      actionMap.putInt("循环",DVP图片_循环);
      actionMap.putInt("重复",DVP图片_重复);
      actionMap.putInt("关闭",DVP图片_关闭);
      actionMap.putInt("返回列表",DVP图片_返回列表);
	STATE= changeState(STATE,ST_DVP图片);
	setBindScreen(new Screen_DVP图片(),SCRN_DVP图片);
}

public String getScreenName(){
	return  "DVP图片";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP图片){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP图片(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_上一张_RELEASE){
				_F_上一张(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_下一张_RELEASE){
				_F_下一张(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_放大_RELEASE){
				_F_放大(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_缩小_RELEASE){
				_F_缩小(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_旋转_RELEASE){
				_F_旋转(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_循环_RELEASE){
				_F_循环(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_重复_RELEASE){
				_F_重复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP图片_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
