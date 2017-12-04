package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_音乐播放;
public abstract class 音乐播放_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_播放(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一曲(MSG_ZHW msg);
   public abstract void _F_下一曲(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_循环(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
     final static int ST_音乐播放_NORMAL= 3010;
boolean IS_ST_音乐播放_NORMAL(){ return ST_音乐播放_NORMAL==STATE;}
final static int 音乐播放_播放= 21090;
final static int 音乐播放_播放_RELEASE=  21091;
final static int 音乐播放_播放_PRESSING=  21092;
final static int  音乐播放_播放_PRESSED=  21093;
final static int  音乐播放_播放_ENTER=  21094;
final static int  音乐播放_播放_LEAVE=  21095;

final static int 音乐播放_上一曲= 21100;
final static int 音乐播放_上一曲_RELEASE=  21101;
final static int 音乐播放_上一曲_PRESSING=  21102;
final static int  音乐播放_上一曲_PRESSED=  21103;
final static int  音乐播放_上一曲_ENTER=  21104;
final static int  音乐播放_上一曲_LEAVE=  21105;

final static int 音乐播放_下一曲= 21110;
final static int 音乐播放_下一曲_RELEASE=  21111;
final static int 音乐播放_下一曲_PRESSING=  21112;
final static int  音乐播放_下一曲_PRESSED=  21113;
final static int  音乐播放_下一曲_ENTER=  21114;
final static int  音乐播放_下一曲_LEAVE=  21115;

final static int 音乐播放_随机= 21120;
final static int 音乐播放_随机_RELEASE=  21121;
final static int 音乐播放_随机_PRESSING=  21122;
final static int  音乐播放_随机_PRESSED=  21123;
final static int  音乐播放_随机_ENTER=  21124;
final static int  音乐播放_随机_LEAVE=  21125;

final static int 音乐播放_循环= 21130;
final static int 音乐播放_循环_RELEASE=  21131;
final static int 音乐播放_循环_PRESSING=  21132;
final static int  音乐播放_循环_PRESSED=  21133;
final static int  音乐播放_循环_ENTER=  21134;
final static int  音乐播放_循环_LEAVE=  21135;

final static int 音乐播放_声道= 21140;
final static int 音乐播放_声道_RELEASE=  21141;
final static int 音乐播放_声道_PRESSING=  21142;
final static int  音乐播放_声道_PRESSED=  21143;
final static int  音乐播放_声道_ENTER=  21144;
final static int  音乐播放_声道_LEAVE=  21145;

final static int 音乐播放_EQ= 21150;
final static int 音乐播放_EQ_RELEASE=  21151;
final static int 音乐播放_EQ_PRESSING=  21152;
final static int  音乐播放_EQ_PRESSED=  21153;
final static int  音乐播放_EQ_ENTER=  21154;
final static int  音乐播放_EQ_LEAVE=  21155;

final static int 音乐播放_返回列表= 21160;
final static int 音乐播放_返回列表_RELEASE=  21161;
final static int 音乐播放_返回列表_PRESSING=  21162;
final static int  音乐播放_返回列表_PRESSED=  21163;
final static int  音乐播放_返回列表_ENTER=  21164;
final static int  音乐播放_返回列表_LEAVE=  21165;

final static int 音乐播放_关闭= 21170;
final static int 音乐播放_关闭_RELEASE=  21171;
final static int 音乐播放_关闭_PRESSING=  21172;
final static int  音乐播放_关闭_PRESSED=  21173;
final static int  音乐播放_关闭_ENTER=  21174;
final static int  音乐播放_关闭_LEAVE=  21175;


public 音乐播放_Event() {
      actionMap.putInt("播放",音乐播放_播放);
      actionMap.putInt("上一曲",音乐播放_上一曲);
      actionMap.putInt("下一曲",音乐播放_下一曲);
      actionMap.putInt("随机",音乐播放_随机);
      actionMap.putInt("循环",音乐播放_循环);
      actionMap.putInt("声道",音乐播放_声道);
      actionMap.putInt("EQ",音乐播放_EQ);
      actionMap.putInt("返回列表",音乐播放_返回列表);
      actionMap.putInt("关闭",音乐播放_关闭);
	STATE= changeState(STATE,ST_音乐播放_NORMAL);
	setBindScreen(new Screen_音乐播放(),SCRN_音乐播放);
}

public String getScreenName(){
	return  "音乐播放";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_音乐播放_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_上一曲_RELEASE){
				_F_上一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_下一曲_RELEASE){
				_F_下一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_随机_RELEASE){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_循环_RELEASE){
				_F_循环(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_EQ_RELEASE){
				_F_EQ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音乐播放_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
