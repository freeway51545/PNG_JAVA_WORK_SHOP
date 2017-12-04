package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_DVD2;
public abstract class DVP_DVD2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_DVD2(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_放大(MSG_ZHW msg);
   public abstract void _F_缩小(MSG_ZHW msg);
   public abstract void _F_MENU(MSG_ZHW msg);
   public abstract void _F_TITLE(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_屏显(MSG_ZHW msg);
   public abstract void _F_上一页(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_上(MSG_ZHW msg);
   public abstract void _F_下(MSG_ZHW msg);
   public abstract void _F_左(MSG_ZHW msg);
   public abstract void _F_右(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_DVP_DVD2= 3047;
boolean IS_ST_DVP_DVD2(){ return ST_DVP_DVD2==STATE;}
final static int DVP_DVD2_放大= 24360;
final static int DVP_DVD2_放大_RELEASE=  24361;
final static int DVP_DVD2_放大_PRESSING=  24362;
final static int  DVP_DVD2_放大_PRESSED=  24363;
final static int  DVP_DVD2_放大_ENTER=  24364;
final static int  DVP_DVD2_放大_LEAVE=  24365;

final static int DVP_DVD2_缩小= 24370;
final static int DVP_DVD2_缩小_RELEASE=  24371;
final static int DVP_DVD2_缩小_PRESSING=  24372;
final static int  DVP_DVD2_缩小_PRESSED=  24373;
final static int  DVP_DVD2_缩小_ENTER=  24374;
final static int  DVP_DVD2_缩小_LEAVE=  24375;

final static int DVP_DVD2_MENU= 24380;
final static int DVP_DVD2_MENU_RELEASE=  24381;
final static int DVP_DVD2_MENU_PRESSING=  24382;
final static int  DVP_DVD2_MENU_PRESSED=  24383;
final static int  DVP_DVD2_MENU_ENTER=  24384;
final static int  DVP_DVD2_MENU_LEAVE=  24385;

final static int DVP_DVD2_TITLE= 24390;
final static int DVP_DVD2_TITLE_RELEASE=  24391;
final static int DVP_DVD2_TITLE_PRESSING=  24392;
final static int  DVP_DVD2_TITLE_PRESSED=  24393;
final static int  DVP_DVD2_TITLE_ENTER=  24394;
final static int  DVP_DVD2_TITLE_LEAVE=  24395;

final static int DVP_DVD2_声道= 24400;
final static int DVP_DVD2_声道_RELEASE=  24401;
final static int DVP_DVD2_声道_PRESSING=  24402;
final static int  DVP_DVD2_声道_PRESSED=  24403;
final static int  DVP_DVD2_声道_ENTER=  24404;
final static int  DVP_DVD2_声道_LEAVE=  24405;

final static int DVP_DVD2_屏显= 24410;
final static int DVP_DVD2_屏显_RELEASE=  24411;
final static int DVP_DVD2_屏显_PRESSING=  24412;
final static int  DVP_DVD2_屏显_PRESSED=  24413;
final static int  DVP_DVD2_屏显_ENTER=  24414;
final static int  DVP_DVD2_屏显_LEAVE=  24415;

final static int DVP_DVD2_上一页= 24420;
final static int DVP_DVD2_上一页_RELEASE=  24421;
final static int DVP_DVD2_上一页_PRESSING=  24422;
final static int  DVP_DVD2_上一页_PRESSED=  24423;
final static int  DVP_DVD2_上一页_ENTER=  24424;
final static int  DVP_DVD2_上一页_LEAVE=  24425;

final static int DVP_DVD2_关闭= 24430;
final static int DVP_DVD2_关闭_RELEASE=  24431;
final static int DVP_DVD2_关闭_PRESSING=  24432;
final static int  DVP_DVD2_关闭_PRESSED=  24433;
final static int  DVP_DVD2_关闭_ENTER=  24434;
final static int  DVP_DVD2_关闭_LEAVE=  24435;

final static int DVP_DVD2_上= 24440;
final static int DVP_DVD2_上_RELEASE=  24441;
final static int DVP_DVD2_上_PRESSING=  24442;
final static int  DVP_DVD2_上_PRESSED=  24443;
final static int  DVP_DVD2_上_ENTER=  24444;
final static int  DVP_DVD2_上_LEAVE=  24445;

final static int DVP_DVD2_下= 24450;
final static int DVP_DVD2_下_RELEASE=  24451;
final static int DVP_DVD2_下_PRESSING=  24452;
final static int  DVP_DVD2_下_PRESSED=  24453;
final static int  DVP_DVD2_下_ENTER=  24454;
final static int  DVP_DVD2_下_LEAVE=  24455;

final static int DVP_DVD2_左= 24460;
final static int DVP_DVD2_左_RELEASE=  24461;
final static int DVP_DVD2_左_PRESSING=  24462;
final static int  DVP_DVD2_左_PRESSED=  24463;
final static int  DVP_DVD2_左_ENTER=  24464;
final static int  DVP_DVD2_左_LEAVE=  24465;

final static int DVP_DVD2_右= 24470;
final static int DVP_DVD2_右_RELEASE=  24471;
final static int DVP_DVD2_右_PRESSING=  24472;
final static int  DVP_DVD2_右_PRESSED=  24473;
final static int  DVP_DVD2_右_ENTER=  24474;
final static int  DVP_DVD2_右_LEAVE=  24475;

final static int DVP_DVD2_OK= 24480;
final static int DVP_DVD2_OK_RELEASE=  24481;
final static int DVP_DVD2_OK_PRESSING=  24482;
final static int  DVP_DVD2_OK_PRESSED=  24483;
final static int  DVP_DVD2_OK_ENTER=  24484;
final static int  DVP_DVD2_OK_LEAVE=  24485;

final static int DVP_DVD2_主界面返回= 24490;
final static int DVP_DVD2_主界面返回_RELEASE=  24491;
final static int DVP_DVD2_主界面返回_PRESSING=  24492;
final static int  DVP_DVD2_主界面返回_PRESSED=  24493;
final static int  DVP_DVD2_主界面返回_ENTER=  24494;
final static int  DVP_DVD2_主界面返回_LEAVE=  24495;

final static int DVP_DVD2_返回列表= 24500;
final static int DVP_DVD2_返回列表_RELEASE=  24501;
final static int DVP_DVD2_返回列表_PRESSING=  24502;
final static int  DVP_DVD2_返回列表_PRESSED=  24503;
final static int  DVP_DVD2_返回列表_ENTER=  24504;
final static int  DVP_DVD2_返回列表_LEAVE=  24505;


public DVP_DVD2_Event() {
      actionMap.putInt("放大",DVP_DVD2_放大);
      actionMap.putInt("缩小",DVP_DVD2_缩小);
      actionMap.putInt("MENU",DVP_DVD2_MENU);
      actionMap.putInt("TITLE",DVP_DVD2_TITLE);
      actionMap.putInt("声道",DVP_DVD2_声道);
      actionMap.putInt("屏显",DVP_DVD2_屏显);
      actionMap.putInt("上一页",DVP_DVD2_上一页);
      actionMap.putInt("关闭",DVP_DVD2_关闭);
      actionMap.putInt("上",DVP_DVD2_上);
      actionMap.putInt("下",DVP_DVD2_下);
      actionMap.putInt("左",DVP_DVD2_左);
      actionMap.putInt("右",DVP_DVD2_右);
      actionMap.putInt("OK",DVP_DVD2_OK);
      actionMap.putInt("主界面返回",DVP_DVD2_主界面返回);
      actionMap.putInt("返回列表",DVP_DVD2_返回列表);
	STATE= changeState(STATE,ST_DVP_DVD2);
	setBindScreen(new Screen_DVP_DVD2(),SCRN_DVP_DVD2);
}

public String getScreenName(){
	return  "DVP_DVD2";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_DVD2){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_DVD2(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_放大_RELEASE){
				_F_放大(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_缩小_RELEASE){
				_F_缩小(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_MENU_RELEASE){
				_F_MENU(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_TITLE_RELEASE){
				_F_TITLE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_屏显_RELEASE){
				_F_屏显(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_上_RELEASE){
				_F_上(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_下_RELEASE){
				_F_下(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_左_RELEASE){
				_F_左(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_右_RELEASE){
				_F_右(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_OK_RELEASE){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD2_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
