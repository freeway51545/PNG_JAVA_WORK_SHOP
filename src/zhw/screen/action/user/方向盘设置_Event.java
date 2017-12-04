package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_方向盘设置;
public abstract class 方向盘设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET(String a,MSG_ZHW msg);
   public abstract void _F_清除(MSG_ZHW msg);
   public abstract void _F_CHECK_INPUT_VALUE(MSG_ZHW msg);
   public abstract void _F_RECIVE_DATA(MSG_ZHW msg);
   public abstract void _F_INIT_方向盘(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
     final static int ST_方向盘_NORMAL= 3005;
boolean IS_ST_方向盘_NORMAL(){ return ST_方向盘_NORMAL==STATE;}
final static int 方向盘设置_复位= 20630;
final static int 方向盘设置_复位_RELEASE=  20631;
final static int 方向盘设置_复位_PRESSING=  20632;
final static int  方向盘设置_复位_PRESSED=  20633;
final static int  方向盘设置_复位_ENTER=  20634;
final static int  方向盘设置_复位_LEAVE=  20635;

final static int 方向盘设置_确认= 20640;
final static int 方向盘设置_确认_RELEASE=  20641;
final static int 方向盘设置_确认_PRESSING=  20642;
final static int  方向盘设置_确认_PRESSED=  20643;
final static int  方向盘设置_确认_ENTER=  20644;
final static int  方向盘设置_确认_LEAVE=  20645;

final static int 方向盘设置_清除= 20650;
final static int 方向盘设置_清除_RELEASE=  20651;
final static int 方向盘设置_清除_PRESSING=  20652;
final static int  方向盘设置_清除_PRESSED=  20653;
final static int  方向盘设置_清除_ENTER=  20654;
final static int  方向盘设置_清除_LEAVE=  20655;

final static int 方向盘设置_静音= 20660;
final static int 方向盘设置_静音_RELEASE=  20661;
final static int 方向盘设置_静音_PRESSING=  20662;
final static int  方向盘设置_静音_PRESSED=  20663;
final static int  方向盘设置_静音_ENTER=  20664;
final static int  方向盘设置_静音_LEAVE=  20665;

final static int 方向盘设置_电源= 20670;
final static int 方向盘设置_电源_RELEASE=  20671;
final static int 方向盘设置_电源_PRESSING=  20672;
final static int  方向盘设置_电源_PRESSED=  20673;
final static int  方向盘设置_电源_ENTER=  20674;
final static int  方向盘设置_电源_LEAVE=  20675;

final static int 方向盘设置_音量减= 20680;
final static int 方向盘设置_音量减_RELEASE=  20681;
final static int 方向盘设置_音量减_PRESSING=  20682;
final static int  方向盘设置_音量减_PRESSED=  20683;
final static int  方向盘设置_音量减_ENTER=  20684;
final static int  方向盘设置_音量减_LEAVE=  20685;

final static int 方向盘设置_音量加= 20690;
final static int 方向盘设置_音量加_RELEASE=  20691;
final static int 方向盘设置_音量加_PRESSING=  20692;
final static int  方向盘设置_音量加_PRESSED=  20693;
final static int  方向盘设置_音量加_ENTER=  20694;
final static int  方向盘设置_音量加_LEAVE=  20695;

final static int 方向盘设置_模式= 20700;
final static int 方向盘设置_模式_RELEASE=  20701;
final static int 方向盘设置_模式_PRESSING=  20702;
final static int  方向盘设置_模式_PRESSED=  20703;
final static int  方向盘设置_模式_ENTER=  20704;
final static int  方向盘设置_模式_LEAVE=  20705;

final static int 方向盘设置_上一曲= 20710;
final static int 方向盘设置_上一曲_RELEASE=  20711;
final static int 方向盘设置_上一曲_PRESSING=  20712;
final static int  方向盘设置_上一曲_PRESSED=  20713;
final static int  方向盘设置_上一曲_ENTER=  20714;
final static int  方向盘设置_上一曲_LEAVE=  20715;

final static int 方向盘设置_下一曲= 20720;
final static int 方向盘设置_下一曲_RELEASE=  20721;
final static int 方向盘设置_下一曲_PRESSING=  20722;
final static int  方向盘设置_下一曲_PRESSED=  20723;
final static int  方向盘设置_下一曲_ENTER=  20724;
final static int  方向盘设置_下一曲_LEAVE=  20725;

final static int 方向盘设置_收音= 20730;
final static int 方向盘设置_收音_RELEASE=  20731;
final static int 方向盘设置_收音_PRESSING=  20732;
final static int  方向盘设置_收音_PRESSED=  20733;
final static int  方向盘设置_收音_ENTER=  20734;
final static int  方向盘设置_收音_LEAVE=  20735;

final static int 方向盘设置_导航= 20740;
final static int 方向盘设置_导航_RELEASE=  20741;
final static int 方向盘设置_导航_PRESSING=  20742;
final static int  方向盘设置_导航_PRESSED=  20743;
final static int  方向盘设置_导航_ENTER=  20744;
final static int  方向盘设置_导航_LEAVE=  20745;

final static int 方向盘设置_DVD= 20750;
final static int 方向盘设置_DVD_RELEASE=  20751;
final static int 方向盘设置_DVD_PRESSING=  20752;
final static int  方向盘设置_DVD_PRESSED=  20753;
final static int  方向盘设置_DVD_ENTER=  20754;
final static int  方向盘设置_DVD_LEAVE=  20755;

final static int 方向盘设置_打电话= 20760;
final static int 方向盘设置_打电话_RELEASE=  20761;
final static int 方向盘设置_打电话_PRESSING=  20762;
final static int  方向盘设置_打电话_PRESSED=  20763;
final static int  方向盘设置_打电话_ENTER=  20764;
final static int  方向盘设置_打电话_LEAVE=  20765;

final static int 方向盘设置_挂断= 20770;
final static int 方向盘设置_挂断_RELEASE=  20771;
final static int 方向盘设置_挂断_PRESSING=  20772;
final static int  方向盘设置_挂断_PRESSED=  20773;
final static int  方向盘设置_挂断_ENTER=  20774;
final static int  方向盘设置_挂断_LEAVE=  20775;

final static int 方向盘设置_音频= 20780;
final static int 方向盘设置_音频_RELEASE=  20781;
final static int 方向盘设置_音频_PRESSING=  20782;
final static int  方向盘设置_音频_PRESSED=  20783;
final static int  方向盘设置_音频_ENTER=  20784;
final static int  方向盘设置_音频_LEAVE=  20785;

final static int 方向盘设置_显示设置= 20790;
final static int 方向盘设置_显示设置_RELEASE=  20791;
final static int 方向盘设置_显示设置_PRESSING=  20792;
final static int  方向盘设置_显示设置_PRESSED=  20793;
final static int  方向盘设置_显示设置_ENTER=  20794;
final static int  方向盘设置_显示设置_LEAVE=  20795;

final static int 方向盘设置_音频设置= 20800;
final static int 方向盘设置_音频设置_RELEASE=  20801;
final static int 方向盘设置_音频设置_PRESSING=  20802;
final static int  方向盘设置_音频设置_PRESSED=  20803;
final static int  方向盘设置_音频设置_ENTER=  20804;
final static int  方向盘设置_音频设置_LEAVE=  20805;

final static int 方向盘设置_系统设置= 20810;
final static int 方向盘设置_系统设置_RELEASE=  20811;
final static int 方向盘设置_系统设置_PRESSING=  20812;
final static int  方向盘设置_系统设置_PRESSED=  20813;
final static int  方向盘设置_系统设置_ENTER=  20814;
final static int  方向盘设置_系统设置_LEAVE=  20815;

final static int 方向盘设置_参数设置= 20820;
final static int 方向盘设置_参数设置_RELEASE=  20821;
final static int 方向盘设置_参数设置_PRESSING=  20822;
final static int  方向盘设置_参数设置_PRESSED=  20823;
final static int  方向盘设置_参数设置_ENTER=  20824;
final static int  方向盘设置_参数设置_LEAVE=  20825;

final static int 方向盘设置_返回按钮= 20830;
final static int 方向盘设置_返回按钮_RELEASE=  20831;
final static int 方向盘设置_返回按钮_PRESSING=  20832;
final static int  方向盘设置_返回按钮_PRESSED=  20833;
final static int  方向盘设置_返回按钮_ENTER=  20834;
final static int  方向盘设置_返回按钮_LEAVE=  20835;


public 方向盘设置_Event() {
      actionMap.putInt("复位",方向盘设置_复位);
      actionMap.putInt("确认",方向盘设置_确认);
      actionMap.putInt("清除",方向盘设置_清除);
      actionMap.putInt("静音",方向盘设置_静音);
      actionMap.putInt("电源",方向盘设置_电源);
      actionMap.putInt("音量减",方向盘设置_音量减);
      actionMap.putInt("音量加",方向盘设置_音量加);
      actionMap.putInt("模式",方向盘设置_模式);
      actionMap.putInt("上一曲",方向盘设置_上一曲);
      actionMap.putInt("下一曲",方向盘设置_下一曲);
      actionMap.putInt("收音",方向盘设置_收音);
      actionMap.putInt("导航",方向盘设置_导航);
      actionMap.putInt("DVD",方向盘设置_DVD);
      actionMap.putInt("打电话",方向盘设置_打电话);
      actionMap.putInt("挂断",方向盘设置_挂断);
      actionMap.putInt("音频",方向盘设置_音频);
      actionMap.putInt("显示设置",方向盘设置_显示设置);
      actionMap.putInt("音频设置",方向盘设置_音频设置);
      actionMap.putInt("系统设置",方向盘设置_系统设置);
      actionMap.putInt("参数设置",方向盘设置_参数设置);
      actionMap.putInt("返回按钮",方向盘设置_返回按钮);
	STATE= changeState(STATE,ST_方向盘_NORMAL);
	setBindScreen(new Screen_方向盘设置(),SCRN_方向盘设置);
}

public String getScreenName(){
	return  "方向盘设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_方向盘_NORMAL){
			if(msg.wParam==方向盘设置_复位_RELEASE){
				_F_SET("复位_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_确认_RELEASE){
				_F_SET("确认_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_清除_RELEASE){
				_F_清除(msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_静音_RELEASE){
				_F_SET("静音_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_电源_RELEASE){
				_F_SET("电源_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_音量减_RELEASE){
				_F_SET("音量减_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_音量加_RELEASE){
				_F_SET("音量加_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_模式_RELEASE){
				_F_SET("模式_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_上一曲_RELEASE){
				_F_SET("上一曲_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_下一曲_RELEASE){
				_F_SET("下一曲_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_收音_RELEASE){
				_F_SET("收音_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_导航_RELEASE){
				_F_SET("导航_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_DVD_RELEASE){
				_F_SET("DVD_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_打电话_RELEASE){
				_F_SET("打电话_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_挂断_RELEASE){
				_F_SET("挂电话_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_音频_RELEASE){
				_F_SET("音频_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_INPUT_VALUE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_显示设置_RELEASE){
				TO_SCRN(SCRN_显示设置);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_音频设置_RELEASE){
				TO_SCRN(SCRN_音频设置);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_系统设置_RELEASE){
				TO_SCRN(SCRN_系统设置);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_参数设置_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_音频设置_RELEASE){
				TO_SCRN(SCRN_音频设置);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_RECIVE_DATA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_方向盘(msg);
				msg.setComsumered();
			}
			if(msg.wParam==方向盘设置_返回按钮_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
