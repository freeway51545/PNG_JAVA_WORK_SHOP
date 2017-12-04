package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_GPS声音;
public abstract class GPS声音_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_跟随(MSG_ZHW msg);
   public abstract void _F_独立(MSG_ZHW msg);
   public abstract void _F_选中(MSG_ZHW msg);
   public abstract void _F_GPS独立音量BNT(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_GPS声音= 3026;
boolean IS_ST_GPS声音(){ return ST_GPS声音==STATE;}
final static int GPS声音_跟随= 22440;
final static int GPS声音_跟随_RELEASE=  22441;
final static int GPS声音_跟随_PRESSING=  22442;
final static int  GPS声音_跟随_PRESSED=  22443;
final static int  GPS声音_跟随_ENTER=  22444;
final static int  GPS声音_跟随_LEAVE=  22445;

final static int GPS声音_独立= 22450;
final static int GPS声音_独立_RELEASE=  22451;
final static int GPS声音_独立_PRESSING=  22452;
final static int  GPS声音_独立_PRESSED=  22453;
final static int  GPS声音_独立_ENTER=  22454;
final static int  GPS声音_独立_LEAVE=  22455;

final static int GPS声音_选中= 22460;
final static int GPS声音_选中_RELEASE=  22461;
final static int GPS声音_选中_PRESSING=  22462;
final static int  GPS声音_选中_PRESSED=  22463;
final static int  GPS声音_选中_ENTER=  22464;
final static int  GPS声音_选中_LEAVE=  22465;

final static int GPS声音_GPS独立音量BNT= 22470;
final static int GPS声音_GPS独立音量BNT_RELEASE=  22471;
final static int GPS声音_GPS独立音量BNT_PRESSING=  22472;
final static int  GPS声音_GPS独立音量BNT_PRESSED=  22473;
final static int  GPS声音_GPS独立音量BNT_ENTER=  22474;
final static int  GPS声音_GPS独立音量BNT_LEAVE=  22475;

final static int GPS声音_返回参数= 22480;
final static int GPS声音_返回参数_RELEASE=  22481;
final static int GPS声音_返回参数_PRESSING=  22482;
final static int  GPS声音_返回参数_PRESSED=  22483;
final static int  GPS声音_返回参数_ENTER=  22484;
final static int  GPS声音_返回参数_LEAVE=  22485;


public GPS声音_Event() {
      actionMap.putInt("跟随",GPS声音_跟随);
      actionMap.putInt("独立",GPS声音_独立);
      actionMap.putInt("选中",GPS声音_选中);
      actionMap.putInt("GPS独立音量BNT",GPS声音_GPS独立音量BNT);
      actionMap.putInt("返回参数",GPS声音_返回参数);
	STATE= changeState(STATE,ST_GPS声音);
	setBindScreen(new Screen_GPS声音(),SCRN_GPS声音);
}

public String getScreenName(){
	return  "GPS声音";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_GPS声音){
			if(msg.wParam==GPS声音_跟随_RELEASE){
				_F_跟随(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS声音_独立_RELEASE){
				_F_独立(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS声音_选中_RELEASE){
				_F_选中(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS声音_GPS独立音量BNT_RELEASE){
				_F_GPS独立音量BNT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS声音_返回参数_RELEASE){
				TO_SCRN(getSCRN_参数设置());
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
