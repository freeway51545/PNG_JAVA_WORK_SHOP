package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_原车蓝牙和USB;
public abstract class 原车蓝牙和USB_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ACTION(String a,MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_原车蓝牙和USB= 3041;
boolean IS_ST_原车蓝牙和USB(){ return ST_原车蓝牙和USB==STATE;}
final static int 原车蓝牙和USB_打开= 23840;
final static int 原车蓝牙和USB_打开_RELEASE=  23841;
final static int 原车蓝牙和USB_打开_PRESSING=  23842;
final static int  原车蓝牙和USB_打开_PRESSED=  23843;
final static int  原车蓝牙和USB_打开_ENTER=  23844;
final static int  原车蓝牙和USB_打开_LEAVE=  23845;

final static int 原车蓝牙和USB_关闭= 23850;
final static int 原车蓝牙和USB_关闭_RELEASE=  23851;
final static int 原车蓝牙和USB_关闭_PRESSING=  23852;
final static int  原车蓝牙和USB_关闭_PRESSED=  23853;
final static int  原车蓝牙和USB_关闭_ENTER=  23854;
final static int  原车蓝牙和USB_关闭_LEAVE=  23855;

final static int 原车蓝牙和USB_循环= 23860;
final static int 原车蓝牙和USB_循环_RELEASE=  23861;
final static int 原车蓝牙和USB_循环_PRESSING=  23862;
final static int  原车蓝牙和USB_循环_PRESSED=  23863;
final static int  原车蓝牙和USB_循环_ENTER=  23864;
final static int  原车蓝牙和USB_循环_LEAVE=  23865;

final static int 原车蓝牙和USB_随机= 23870;
final static int 原车蓝牙和USB_随机_RELEASE=  23871;
final static int 原车蓝牙和USB_随机_PRESSING=  23872;
final static int  原车蓝牙和USB_随机_PRESSED=  23873;
final static int  原车蓝牙和USB_随机_ENTER=  23874;
final static int  原车蓝牙和USB_随机_LEAVE=  23875;

final static int 原车蓝牙和USB_上一曲= 23880;
final static int 原车蓝牙和USB_上一曲_RELEASE=  23881;
final static int 原车蓝牙和USB_上一曲_PRESSING=  23882;
final static int  原车蓝牙和USB_上一曲_PRESSED=  23883;
final static int  原车蓝牙和USB_上一曲_ENTER=  23884;
final static int  原车蓝牙和USB_上一曲_LEAVE=  23885;

final static int 原车蓝牙和USB_播放= 23890;
final static int 原车蓝牙和USB_播放_RELEASE=  23891;
final static int 原车蓝牙和USB_播放_PRESSING=  23892;
final static int  原车蓝牙和USB_播放_PRESSED=  23893;
final static int  原车蓝牙和USB_播放_ENTER=  23894;
final static int  原车蓝牙和USB_播放_LEAVE=  23895;

final static int 原车蓝牙和USB_停止= 23900;
final static int 原车蓝牙和USB_停止_RELEASE=  23901;
final static int 原车蓝牙和USB_停止_PRESSING=  23902;
final static int  原车蓝牙和USB_停止_PRESSED=  23903;
final static int  原车蓝牙和USB_停止_ENTER=  23904;
final static int  原车蓝牙和USB_停止_LEAVE=  23905;

final static int 原车蓝牙和USB_下一曲= 23910;
final static int 原车蓝牙和USB_下一曲_RELEASE=  23911;
final static int 原车蓝牙和USB_下一曲_PRESSING=  23912;
final static int  原车蓝牙和USB_下一曲_PRESSED=  23913;
final static int  原车蓝牙和USB_下一曲_ENTER=  23914;
final static int  原车蓝牙和USB_下一曲_LEAVE=  23915;

final static int 原车蓝牙和USB_快退= 23920;
final static int 原车蓝牙和USB_快退_RELEASE=  23921;
final static int 原车蓝牙和USB_快退_PRESSING=  23922;
final static int  原车蓝牙和USB_快退_PRESSED=  23923;
final static int  原车蓝牙和USB_快退_ENTER=  23924;
final static int  原车蓝牙和USB_快退_LEAVE=  23925;

final static int 原车蓝牙和USB_上一文件夹= 23930;
final static int 原车蓝牙和USB_上一文件夹_RELEASE=  23931;
final static int 原车蓝牙和USB_上一文件夹_PRESSING=  23932;
final static int  原车蓝牙和USB_上一文件夹_PRESSED=  23933;
final static int  原车蓝牙和USB_上一文件夹_ENTER=  23934;
final static int  原车蓝牙和USB_上一文件夹_LEAVE=  23935;

final static int 原车蓝牙和USB_下一文件夹= 23940;
final static int 原车蓝牙和USB_下一文件夹_RELEASE=  23941;
final static int 原车蓝牙和USB_下一文件夹_PRESSING=  23942;
final static int  原车蓝牙和USB_下一文件夹_PRESSED=  23943;
final static int  原车蓝牙和USB_下一文件夹_ENTER=  23944;
final static int  原车蓝牙和USB_下一文件夹_LEAVE=  23945;

final static int 原车蓝牙和USB_快进= 23950;
final static int 原车蓝牙和USB_快进_RELEASE=  23951;
final static int 原车蓝牙和USB_快进_PRESSING=  23952;
final static int  原车蓝牙和USB_快进_PRESSED=  23953;
final static int  原车蓝牙和USB_快进_ENTER=  23954;
final static int  原车蓝牙和USB_快进_LEAVE=  23955;


public 原车蓝牙和USB_Event() {
      actionMap.putInt("打开",原车蓝牙和USB_打开);
      actionMap.putInt("关闭",原车蓝牙和USB_关闭);
      actionMap.putInt("循环",原车蓝牙和USB_循环);
      actionMap.putInt("随机",原车蓝牙和USB_随机);
      actionMap.putInt("上一曲",原车蓝牙和USB_上一曲);
      actionMap.putInt("播放",原车蓝牙和USB_播放);
      actionMap.putInt("停止",原车蓝牙和USB_停止);
      actionMap.putInt("下一曲",原车蓝牙和USB_下一曲);
      actionMap.putInt("快退",原车蓝牙和USB_快退);
      actionMap.putInt("上一文件夹",原车蓝牙和USB_上一文件夹);
      actionMap.putInt("下一文件夹",原车蓝牙和USB_下一文件夹);
      actionMap.putInt("快进",原车蓝牙和USB_快进);
	STATE= changeState(STATE,ST_原车蓝牙和USB);
	setBindScreen(new Screen_原车蓝牙和USB(),SCRN_原车蓝牙和USB);
}

public String getScreenName(){
	return  "原车蓝牙和USB";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_原车蓝牙和USB){
			if(msg.wParam==原车蓝牙和USB_打开_RELEASE){
				_F_ACTION("打开",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_关闭_RELEASE){
				_F_ACTION("关闭",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_循环_RELEASE){
				_F_ACTION("循环",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_随机_RELEASE){
				_F_ACTION("随机",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_上一曲_RELEASE){
				_F_ACTION("上一曲",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_播放_RELEASE){
				_F_ACTION("播放",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_停止_RELEASE){
				_F_ACTION("停止",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_下一曲_RELEASE){
				_F_ACTION("下一曲",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_快退_RELEASE){
				_F_ACTION("快退",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_上一文件夹_RELEASE){
				_F_ACTION("上一文件夹",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_下一文件夹_RELEASE){
				_F_ACTION("下一文件夹",msg);
				msg.setComsumered();
			}
			if(msg.wParam==原车蓝牙和USB_快进_RELEASE){
				_F_ACTION("快进",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
