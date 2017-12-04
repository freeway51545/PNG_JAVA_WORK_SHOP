package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_多国语言;
public abstract class 多国语言_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SELECT(String a,MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_MAIN_TIMMER(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_多国语言= 3025;
boolean IS_ST_多国语言(){ return ST_多国语言==STATE;}
final static int 多国语言_L0= 22340;
final static int 多国语言_L0_RELEASE=  22341;
final static int 多国语言_L0_PRESSING=  22342;
final static int  多国语言_L0_PRESSED=  22343;
final static int  多国语言_L0_ENTER=  22344;
final static int  多国语言_L0_LEAVE=  22345;

final static int 多国语言_L1= 22350;
final static int 多国语言_L1_RELEASE=  22351;
final static int 多国语言_L1_PRESSING=  22352;
final static int  多国语言_L1_PRESSED=  22353;
final static int  多国语言_L1_ENTER=  22354;
final static int  多国语言_L1_LEAVE=  22355;

final static int 多国语言_L2= 22360;
final static int 多国语言_L2_RELEASE=  22361;
final static int 多国语言_L2_PRESSING=  22362;
final static int  多国语言_L2_PRESSED=  22363;
final static int  多国语言_L2_ENTER=  22364;
final static int  多国语言_L2_LEAVE=  22365;

final static int 多国语言_L3= 22370;
final static int 多国语言_L3_RELEASE=  22371;
final static int 多国语言_L3_PRESSING=  22372;
final static int  多国语言_L3_PRESSED=  22373;
final static int  多国语言_L3_ENTER=  22374;
final static int  多国语言_L3_LEAVE=  22375;

final static int 多国语言_L4= 22380;
final static int 多国语言_L4_RELEASE=  22381;
final static int 多国语言_L4_PRESSING=  22382;
final static int  多国语言_L4_PRESSED=  22383;
final static int  多国语言_L4_ENTER=  22384;
final static int  多国语言_L4_LEAVE=  22385;

final static int 多国语言_L5= 22390;
final static int 多国语言_L5_RELEASE=  22391;
final static int 多国语言_L5_PRESSING=  22392;
final static int  多国语言_L5_PRESSED=  22393;
final static int  多国语言_L5_ENTER=  22394;
final static int  多国语言_L5_LEAVE=  22395;

final static int 多国语言_L6= 22400;
final static int 多国语言_L6_RELEASE=  22401;
final static int 多国语言_L6_PRESSING=  22402;
final static int  多国语言_L6_PRESSED=  22403;
final static int  多国语言_L6_ENTER=  22404;
final static int  多国语言_L6_LEAVE=  22405;

final static int 多国语言_L7= 22410;
final static int 多国语言_L7_RELEASE=  22411;
final static int 多国语言_L7_PRESSING=  22412;
final static int  多国语言_L7_PRESSED=  22413;
final static int  多国语言_L7_ENTER=  22414;
final static int  多国语言_L7_LEAVE=  22415;

final static int 多国语言_OK= 22420;
final static int 多国语言_OK_RELEASE=  22421;
final static int 多国语言_OK_PRESSING=  22422;
final static int  多国语言_OK_PRESSED=  22423;
final static int  多国语言_OK_ENTER=  22424;
final static int  多国语言_OK_LEAVE=  22425;

final static int 多国语言_CANCEL= 22430;
final static int 多国语言_CANCEL_RELEASE=  22431;
final static int 多国语言_CANCEL_PRESSING=  22432;
final static int  多国语言_CANCEL_PRESSED=  22433;
final static int  多国语言_CANCEL_ENTER=  22434;
final static int  多国语言_CANCEL_LEAVE=  22435;


public 多国语言_Event() {
      actionMap.putInt("L0",多国语言_L0);
      actionMap.putInt("L1",多国语言_L1);
      actionMap.putInt("L2",多国语言_L2);
      actionMap.putInt("L3",多国语言_L3);
      actionMap.putInt("L4",多国语言_L4);
      actionMap.putInt("L5",多国语言_L5);
      actionMap.putInt("L6",多国语言_L6);
      actionMap.putInt("L7",多国语言_L7);
      actionMap.putInt("OK",多国语言_OK);
      actionMap.putInt("CANCEL",多国语言_CANCEL);
	STATE= changeState(STATE,ST_多国语言);
	setBindScreen(new Screen_多国语言(),SCRN_多国语言);
}

public String getScreenName(){
	return  "多国语言";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_多国语言){
			if(msg.wParam==多国语言_L0_RELEASE){
				_F_SELECT("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L1_RELEASE){
				_F_SELECT("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L2_RELEASE){
				_F_SELECT("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L3_RELEASE){
				_F_SELECT("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L4_RELEASE){
				_F_SELECT("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L5_RELEASE){
				_F_SELECT("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L6_RELEASE){
				_F_SELECT("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_L7_RELEASE){
				_F_SELECT("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_MAIN_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_OK_RELEASE){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多国语言_CANCEL_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
