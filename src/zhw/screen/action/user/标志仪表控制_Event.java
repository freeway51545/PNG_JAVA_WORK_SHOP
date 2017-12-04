package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_标志仪表控制;
public abstract class 标志仪表控制_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_selected(String a,MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_仪表控制= 3040;
boolean IS_ST_仪表控制(){ return ST_仪表控制==STATE;}
final static int 标志仪表控制_SD= 23720;
final static int 标志仪表控制_SD_RELEASE=  23721;
final static int 标志仪表控制_SD_PRESSING=  23722;
final static int  标志仪表控制_SD_PRESSED=  23723;
final static int  标志仪表控制_SD_ENTER=  23724;
final static int  标志仪表控制_SD_LEAVE=  23725;

final static int 标志仪表控制_立体声= 23730;
final static int 标志仪表控制_立体声_RELEASE=  23731;
final static int 标志仪表控制_立体声_PRESSING=  23732;
final static int  标志仪表控制_立体声_PRESSED=  23733;
final static int  标志仪表控制_立体声_ENTER=  23734;
final static int  标志仪表控制_立体声_LEAVE=  23735;

final static int 标志仪表控制_DVD= 23740;
final static int 标志仪表控制_DVD_RELEASE=  23741;
final static int 标志仪表控制_DVD_PRESSING=  23742;
final static int  标志仪表控制_DVD_PRESSED=  23743;
final static int  标志仪表控制_DVD_ENTER=  23744;
final static int  标志仪表控制_DVD_LEAVE=  23745;

final static int 标志仪表控制_模式= 23750;
final static int 标志仪表控制_模式_RELEASE=  23751;
final static int 标志仪表控制_模式_PRESSING=  23752;
final static int  标志仪表控制_模式_PRESSED=  23753;
final static int  标志仪表控制_模式_ENTER=  23754;
final static int  标志仪表控制_模式_LEAVE=  23755;

final static int 标志仪表控制_上= 23760;
final static int 标志仪表控制_上_RELEASE=  23761;
final static int 标志仪表控制_上_PRESSING=  23762;
final static int  标志仪表控制_上_PRESSED=  23763;
final static int  标志仪表控制_上_ENTER=  23764;
final static int  标志仪表控制_上_LEAVE=  23765;

final static int 标志仪表控制_暗色= 23770;
final static int 标志仪表控制_暗色_RELEASE=  23771;
final static int 标志仪表控制_暗色_PRESSING=  23772;
final static int  标志仪表控制_暗色_PRESSED=  23773;
final static int  标志仪表控制_暗色_ENTER=  23774;
final static int  标志仪表控制_暗色_LEAVE=  23775;

final static int 标志仪表控制_左= 23780;
final static int 标志仪表控制_左_RELEASE=  23781;
final static int 标志仪表控制_左_PRESSING=  23782;
final static int  标志仪表控制_左_PRESSED=  23783;
final static int  标志仪表控制_左_ENTER=  23784;
final static int  标志仪表控制_左_LEAVE=  23785;

final static int 标志仪表控制_OK= 23790;
final static int 标志仪表控制_OK_RELEASE=  23791;
final static int 标志仪表控制_OK_PRESSING=  23792;
final static int  标志仪表控制_OK_PRESSED=  23793;
final static int  标志仪表控制_OK_ENTER=  23794;
final static int  标志仪表控制_OK_LEAVE=  23795;

final static int 标志仪表控制_右= 23800;
final static int 标志仪表控制_右_RELEASE=  23801;
final static int 标志仪表控制_右_PRESSING=  23802;
final static int  标志仪表控制_右_PRESSED=  23803;
final static int  标志仪表控制_右_ENTER=  23804;
final static int  标志仪表控制_右_LEAVE=  23805;

final static int 标志仪表控制_菜单= 23810;
final static int 标志仪表控制_菜单_RELEASE=  23811;
final static int 标志仪表控制_菜单_PRESSING=  23812;
final static int  标志仪表控制_菜单_PRESSED=  23813;
final static int  标志仪表控制_菜单_ENTER=  23814;
final static int  标志仪表控制_菜单_LEAVE=  23815;

final static int 标志仪表控制_下= 23820;
final static int 标志仪表控制_下_RELEASE=  23821;
final static int 标志仪表控制_下_PRESSING=  23822;
final static int  标志仪表控制_下_PRESSED=  23823;
final static int  标志仪表控制_下_ENTER=  23824;
final static int  标志仪表控制_下_LEAVE=  23825;

final static int 标志仪表控制_退出= 23830;
final static int 标志仪表控制_退出_RELEASE=  23831;
final static int 标志仪表控制_退出_PRESSING=  23832;
final static int  标志仪表控制_退出_PRESSED=  23833;
final static int  标志仪表控制_退出_ENTER=  23834;
final static int  标志仪表控制_退出_LEAVE=  23835;


public 标志仪表控制_Event() {
      actionMap.putInt("SD",标志仪表控制_SD);
      actionMap.putInt("立体声",标志仪表控制_立体声);
      actionMap.putInt("DVD",标志仪表控制_DVD);
      actionMap.putInt("模式",标志仪表控制_模式);
      actionMap.putInt("上",标志仪表控制_上);
      actionMap.putInt("暗色",标志仪表控制_暗色);
      actionMap.putInt("左",标志仪表控制_左);
      actionMap.putInt("OK",标志仪表控制_OK);
      actionMap.putInt("右",标志仪表控制_右);
      actionMap.putInt("菜单",标志仪表控制_菜单);
      actionMap.putInt("下",标志仪表控制_下);
      actionMap.putInt("退出",标志仪表控制_退出);
	STATE= changeState(STATE,ST_仪表控制);
	setBindScreen(new Screen_标志仪表控制(),SCRN_标志仪表控制);
}

public String getScreenName(){
	return  "标志仪表控制";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_仪表控制){
			if(msg.wParam==标志仪表控制_SD_RELEASE){
				_F_selected("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_立体声_RELEASE){
				_F_selected("立体声",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_DVD_RELEASE){
				_F_selected("DVD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_模式_RELEASE){
				_F_selected("模式",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_上_RELEASE){
				_F_selected("上",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_暗色_RELEASE){
				_F_selected("暗色",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_左_RELEASE){
				_F_selected("左",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_OK_RELEASE){
				_F_selected("OK",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_右_RELEASE){
				_F_selected("右",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_菜单_RELEASE){
				_F_selected("菜单",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_下_RELEASE){
				_F_selected("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_退出_RELEASE){
				_F_selected("退出",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_SD_PRESSED){
				_F_PRESSED("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_立体声_PRESSED){
				_F_PRESSED("立体声",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_DVD_PRESSED){
				_F_PRESSED("DVD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_模式_PRESSED){
				_F_PRESSED("模式",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_上_PRESSED){
				_F_PRESSED("上",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_暗色_PRESSED){
				_F_PRESSED("暗色",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_左_PRESSED){
				_F_PRESSED("左",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_OK_PRESSED){
				_F_PRESSED("OK",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_右_PRESSED){
				_F_PRESSED("右",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_菜单_PRESSED){
				_F_PRESSED("菜单",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_下_PRESSED){
				_F_PRESSED("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==标志仪表控制_退出_PRESSED){
				_F_PRESSED("退出",msg);
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
