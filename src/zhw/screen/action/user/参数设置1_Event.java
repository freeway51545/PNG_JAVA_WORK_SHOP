package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_参数设置1;
public abstract class 参数设置1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_键盘声(MSG_ZHW msg);
   public abstract void _F_倒车影像(MSG_ZHW msg);
   public abstract void _F_恢复出厂设置(MSG_ZHW msg);
   public abstract void _F_车标设置(MSG_ZHW msg);
   public abstract void _F_屏幕校正(MSG_ZHW msg);
   public abstract void _F_刹车开DVD(MSG_ZHW msg);
   public abstract void _F_系统升级(MSG_ZHW msg);
   public abstract void _F_系统信息(MSG_ZHW msg);
   public abstract void _F_INIT_参数设置1(MSG_ZHW msg);
   public abstract void _F_工厂设置(MSG_ZHW msg);
     final static int ST_系统设置1_NORMAL= 3034;
boolean IS_ST_系统设置1_NORMAL(){ return ST_系统设置1_NORMAL==STATE;}
final static int 参数设置1_亮度设置= 22780;
final static int 参数设置1_亮度设置_RELEASE=  22781;
final static int 参数设置1_亮度设置_PRESSING=  22782;
final static int  参数设置1_亮度设置_PRESSED=  22783;
final static int  参数设置1_亮度设置_ENTER=  22784;
final static int  参数设置1_亮度设置_LEAVE=  22785;

final static int 参数设置1_时钟设置= 22790;
final static int 参数设置1_时钟设置_RELEASE=  22791;
final static int 参数设置1_时钟设置_PRESSING=  22792;
final static int  参数设置1_时钟设置_PRESSED=  22793;
final static int  参数设置1_时钟设置_ENTER=  22794;
final static int  参数设置1_时钟设置_LEAVE=  22795;

final static int 参数设置1_音量设置= 22800;
final static int 参数设置1_音量设置_RELEASE=  22801;
final static int 参数设置1_音量设置_PRESSING=  22802;
final static int  参数设置1_音量设置_PRESSED=  22803;
final static int  参数设置1_音量设置_ENTER=  22804;
final static int  参数设置1_音量设置_LEAVE=  22805;

final static int 参数设置1_按键声音= 22810;
final static int 参数设置1_按键声音_RELEASE=  22811;
final static int 参数设置1_按键声音_PRESSING=  22812;
final static int  参数设置1_按键声音_PRESSED=  22813;
final static int  参数设置1_按键声音_ENTER=  22814;
final static int  参数设置1_按键声音_LEAVE=  22815;

final static int 参数设置1_倒车镜像= 22820;
final static int 参数设置1_倒车镜像_RELEASE=  22821;
final static int 参数设置1_倒车镜像_PRESSING=  22822;
final static int  参数设置1_倒车镜像_PRESSED=  22823;
final static int  参数设置1_倒车镜像_ENTER=  22824;
final static int  参数设置1_倒车镜像_LEAVE=  22825;

final static int 参数设置1_恢复出厂设置= 22830;
final static int 参数设置1_恢复出厂设置_RELEASE=  22831;
final static int 参数设置1_恢复出厂设置_PRESSING=  22832;
final static int  参数设置1_恢复出厂设置_PRESSED=  22833;
final static int  参数设置1_恢复出厂设置_ENTER=  22834;
final static int  参数设置1_恢复出厂设置_LEAVE=  22835;

final static int 参数设置1_车标设置= 22840;
final static int 参数设置1_车标设置_RELEASE=  22841;
final static int 参数设置1_车标设置_PRESSING=  22842;
final static int  参数设置1_车标设置_PRESSED=  22843;
final static int  参数设置1_车标设置_ENTER=  22844;
final static int  参数设置1_车标设置_LEAVE=  22845;

final static int 参数设置1_屏幕校正= 22850;
final static int 参数设置1_屏幕校正_RELEASE=  22851;
final static int 参数设置1_屏幕校正_PRESSING=  22852;
final static int  参数设置1_屏幕校正_PRESSED=  22853;
final static int  参数设置1_屏幕校正_ENTER=  22854;
final static int  参数设置1_屏幕校正_LEAVE=  22855;

final static int 参数设置1_音频设置= 22860;
final static int 参数设置1_音频设置_RELEASE=  22861;
final static int 参数设置1_音频设置_PRESSING=  22862;
final static int  参数设置1_音频设置_PRESSED=  22863;
final static int  参数设置1_音频设置_ENTER=  22864;
final static int  参数设置1_音频设置_LEAVE=  22865;

final static int 参数设置1_系统设置= 22870;
final static int 参数设置1_系统设置_RELEASE=  22871;
final static int 参数设置1_系统设置_PRESSING=  22872;
final static int  参数设置1_系统设置_PRESSED=  22873;
final static int  参数设置1_系统设置_ENTER=  22874;
final static int  参数设置1_系统设置_LEAVE=  22875;

final static int 参数设置1_方向盘= 22880;
final static int 参数设置1_方向盘_RELEASE=  22881;
final static int 参数设置1_方向盘_PRESSING=  22882;
final static int  参数设置1_方向盘_PRESSED=  22883;
final static int  参数设置1_方向盘_ENTER=  22884;
final static int  参数设置1_方向盘_LEAVE=  22885;

final static int 参数设置1_多国语言= 22890;
final static int 参数设置1_多国语言_RELEASE=  22891;
final static int 参数设置1_多国语言_PRESSING=  22892;
final static int  参数设置1_多国语言_PRESSED=  22893;
final static int  参数设置1_多国语言_ENTER=  22894;
final static int  参数设置1_多国语言_LEAVE=  22895;

final static int 参数设置1_刹车开DVD= 22900;
final static int 参数设置1_刹车开DVD_RELEASE=  22901;
final static int 参数设置1_刹车开DVD_PRESSING=  22902;
final static int  参数设置1_刹车开DVD_PRESSED=  22903;
final static int  参数设置1_刹车开DVD_ENTER=  22904;
final static int  参数设置1_刹车开DVD_LEAVE=  22905;

final static int 参数设置1_地图= 22910;
final static int 参数设置1_地图_RELEASE=  22911;
final static int 参数设置1_地图_PRESSING=  22912;
final static int  参数设置1_地图_PRESSED=  22913;
final static int  参数设置1_地图_ENTER=  22914;
final static int  参数设置1_地图_LEAVE=  22915;

final static int 参数设置1_系统升级= 22920;
final static int 参数设置1_系统升级_RELEASE=  22921;
final static int 参数设置1_系统升级_PRESSING=  22922;
final static int  参数设置1_系统升级_PRESSED=  22923;
final static int  参数设置1_系统升级_ENTER=  22924;
final static int  参数设置1_系统升级_LEAVE=  22925;

final static int 参数设置1_系统信息= 22930;
final static int 参数设置1_系统信息_RELEASE=  22931;
final static int 参数设置1_系统信息_PRESSING=  22932;
final static int  参数设置1_系统信息_PRESSED=  22933;
final static int  参数设置1_系统信息_ENTER=  22934;
final static int  参数设置1_系统信息_LEAVE=  22935;

final static int 参数设置1_参数设置= 22940;
final static int 参数设置1_参数设置_RELEASE=  22941;
final static int 参数设置1_参数设置_PRESSING=  22942;
final static int  参数设置1_参数设置_PRESSED=  22943;
final static int  参数设置1_参数设置_ENTER=  22944;
final static int  参数设置1_参数设置_LEAVE=  22945;

final static int 参数设置1_返回= 22950;
final static int 参数设置1_返回_RELEASE=  22951;
final static int 参数设置1_返回_PRESSING=  22952;
final static int  参数设置1_返回_PRESSED=  22953;
final static int  参数设置1_返回_ENTER=  22954;
final static int  参数设置1_返回_LEAVE=  22955;

final static int 参数设置1_工厂设置= 22960;
final static int 参数设置1_工厂设置_RELEASE=  22961;
final static int 参数设置1_工厂设置_PRESSING=  22962;
final static int  参数设置1_工厂设置_PRESSED=  22963;
final static int  参数设置1_工厂设置_ENTER=  22964;
final static int  参数设置1_工厂设置_LEAVE=  22965;


public 参数设置1_Event() {
      actionMap.putInt("亮度设置",参数设置1_亮度设置);
      actionMap.putInt("时钟设置",参数设置1_时钟设置);
      actionMap.putInt("音量设置",参数设置1_音量设置);
      actionMap.putInt("按键声音",参数设置1_按键声音);
      actionMap.putInt("倒车镜像",参数设置1_倒车镜像);
      actionMap.putInt("恢复出厂设置",参数设置1_恢复出厂设置);
      actionMap.putInt("车标设置",参数设置1_车标设置);
      actionMap.putInt("屏幕校正",参数设置1_屏幕校正);
      actionMap.putInt("音频设置",参数设置1_音频设置);
      actionMap.putInt("系统设置",参数设置1_系统设置);
      actionMap.putInt("方向盘",参数设置1_方向盘);
      actionMap.putInt("多国语言",参数设置1_多国语言);
      actionMap.putInt("刹车开DVD",参数设置1_刹车开DVD);
      actionMap.putInt("地图",参数设置1_地图);
      actionMap.putInt("系统升级",参数设置1_系统升级);
      actionMap.putInt("系统信息",参数设置1_系统信息);
      actionMap.putInt("参数设置",参数设置1_参数设置);
      actionMap.putInt("返回",参数设置1_返回);
      actionMap.putInt("工厂设置",参数设置1_工厂设置);
	STATE= changeState(STATE,ST_系统设置1_NORMAL);
	setBindScreen(new Screen_参数设置1(),SCRN_参数设置1);
}

public String getScreenName(){
	return  "参数设置1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_系统设置1_NORMAL){
			if(msg.wParam==参数设置1_亮度设置_RELEASE){
				TO_SCRN(SCRN_显示设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_时钟设置_RELEASE){
				TO_SCRN(SCRN_时间调整);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_音量设置_RELEASE){
				TO_SCRN(SCRN_GPS声音);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_按键声音_RELEASE){
				_F_键盘声(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_倒车镜像_RELEASE){
				_F_倒车影像(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_恢复出厂设置_RELEASE){
				_F_恢复出厂设置(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_车标设置_RELEASE){
				_F_车标设置(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_屏幕校正_RELEASE){
				_F_屏幕校正(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_音频设置_RELEASE){
				TO_SCRN(SCRN_音频设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_系统设置_RELEASE){
				TO_SCRN(SCRN_系统设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_方向盘_RELEASE){
				TO_SCRN(SCRN_方向盘设置);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_多国语言_RELEASE){
				show多国语言();;
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_刹车开DVD_RELEASE){
				_F_刹车开DVD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_地图_RELEASE){
				TO_SCRN(SCRN_导航_2);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_系统升级_RELEASE){
				_F_系统升级(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_系统信息_RELEASE){
				_F_系统信息(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_参数设置_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_参数设置1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_返回_RELEASE){
				TO_SCRN(getMainScreen());
				msg.setComsumered();
			}
			if(msg.wParam==参数设置1_工厂设置_RELEASE){
				_F_工厂设置(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
