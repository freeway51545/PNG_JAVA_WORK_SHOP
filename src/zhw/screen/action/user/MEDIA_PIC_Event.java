package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MEDIA_PIC;
public abstract class MEDIA_PIC_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_MEIDA_PIC(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一张(MSG_ZHW msg);
   public abstract void _F_下一张(MSG_ZHW msg);
   public abstract void _F_停止(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_MEDIA_PIC= 3055;
boolean IS_ST_MEDIA_PIC(){ return ST_MEDIA_PIC==STATE;}
final static int MEDIA_PIC_播放= 24940;
final static int MEDIA_PIC_播放_RELEASE=  24941;
final static int MEDIA_PIC_播放_PRESSING=  24942;
final static int  MEDIA_PIC_播放_PRESSED=  24943;
final static int  MEDIA_PIC_播放_ENTER=  24944;
final static int  MEDIA_PIC_播放_LEAVE=  24945;

final static int MEDIA_PIC_上一张= 24950;
final static int MEDIA_PIC_上一张_RELEASE=  24951;
final static int MEDIA_PIC_上一张_PRESSING=  24952;
final static int  MEDIA_PIC_上一张_PRESSED=  24953;
final static int  MEDIA_PIC_上一张_ENTER=  24954;
final static int  MEDIA_PIC_上一张_LEAVE=  24955;

final static int MEDIA_PIC_下一张= 24960;
final static int MEDIA_PIC_下一张_RELEASE=  24961;
final static int MEDIA_PIC_下一张_PRESSING=  24962;
final static int  MEDIA_PIC_下一张_PRESSED=  24963;
final static int  MEDIA_PIC_下一张_ENTER=  24964;
final static int  MEDIA_PIC_下一张_LEAVE=  24965;

final static int MEDIA_PIC_停止= 24970;
final static int MEDIA_PIC_停止_RELEASE=  24971;
final static int MEDIA_PIC_停止_PRESSING=  24972;
final static int  MEDIA_PIC_停止_PRESSED=  24973;
final static int  MEDIA_PIC_停止_ENTER=  24974;
final static int  MEDIA_PIC_停止_LEAVE=  24975;

final static int MEDIA_PIC_关闭= 24980;
final static int MEDIA_PIC_关闭_RELEASE=  24981;
final static int MEDIA_PIC_关闭_PRESSING=  24982;
final static int  MEDIA_PIC_关闭_PRESSED=  24983;
final static int  MEDIA_PIC_关闭_ENTER=  24984;
final static int  MEDIA_PIC_关闭_LEAVE=  24985;

final static int MEDIA_PIC_主界面返回= 24990;
final static int MEDIA_PIC_主界面返回_RELEASE=  24991;
final static int MEDIA_PIC_主界面返回_PRESSING=  24992;
final static int  MEDIA_PIC_主界面返回_PRESSED=  24993;
final static int  MEDIA_PIC_主界面返回_ENTER=  24994;
final static int  MEDIA_PIC_主界面返回_LEAVE=  24995;

final static int MEDIA_PIC_返回列表= 25000;
final static int MEDIA_PIC_返回列表_RELEASE=  25001;
final static int MEDIA_PIC_返回列表_PRESSING=  25002;
final static int  MEDIA_PIC_返回列表_PRESSED=  25003;
final static int  MEDIA_PIC_返回列表_ENTER=  25004;
final static int  MEDIA_PIC_返回列表_LEAVE=  25005;


public MEDIA_PIC_Event() {
      actionMap.putInt("播放",MEDIA_PIC_播放);
      actionMap.putInt("上一张",MEDIA_PIC_上一张);
      actionMap.putInt("下一张",MEDIA_PIC_下一张);
      actionMap.putInt("停止",MEDIA_PIC_停止);
      actionMap.putInt("关闭",MEDIA_PIC_关闭);
      actionMap.putInt("主界面返回",MEDIA_PIC_主界面返回);
      actionMap.putInt("返回列表",MEDIA_PIC_返回列表);
	STATE= changeState(STATE,ST_MEDIA_PIC);
	setBindScreen(new Screen_MEDIA_PIC(),SCRN_MEDIA_PIC);
}

public String getScreenName(){
	return  "MEDIA_PIC";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MEDIA_PIC){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_MEIDA_PIC(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_上一张_RELEASE){
				_F_上一张(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_下一张_RELEASE){
				_F_下一张(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_停止_RELEASE){
				_F_停止(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
