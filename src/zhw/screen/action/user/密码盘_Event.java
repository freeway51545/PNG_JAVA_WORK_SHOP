package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_ÃÜÂëÅÌ;
public abstract class ÃÜÂëÅÌ_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_RELEASE(String a,MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_ÃÜÂëÅÌ= 3028;
boolean IS_ST_ÃÜÂëÅÌ(){ return ST_ÃÜÂëÅÌ==STATE;}
final static int ÃÜÂëÅÌ_0= 22590;
final static int ÃÜÂëÅÌ_0_RELEASE=  22591;
final static int ÃÜÂëÅÌ_0_PRESSING=  22592;
final static int  ÃÜÂëÅÌ_0_PRESSED=  22593;
final static int  ÃÜÂëÅÌ_0_ENTER=  22594;
final static int  ÃÜÂëÅÌ_0_LEAVE=  22595;

final static int ÃÜÂëÅÌ_1= 22600;
final static int ÃÜÂëÅÌ_1_RELEASE=  22601;
final static int ÃÜÂëÅÌ_1_PRESSING=  22602;
final static int  ÃÜÂëÅÌ_1_PRESSED=  22603;
final static int  ÃÜÂëÅÌ_1_ENTER=  22604;
final static int  ÃÜÂëÅÌ_1_LEAVE=  22605;

final static int ÃÜÂëÅÌ_2= 22610;
final static int ÃÜÂëÅÌ_2_RELEASE=  22611;
final static int ÃÜÂëÅÌ_2_PRESSING=  22612;
final static int  ÃÜÂëÅÌ_2_PRESSED=  22613;
final static int  ÃÜÂëÅÌ_2_ENTER=  22614;
final static int  ÃÜÂëÅÌ_2_LEAVE=  22615;

final static int ÃÜÂëÅÌ_3= 22620;
final static int ÃÜÂëÅÌ_3_RELEASE=  22621;
final static int ÃÜÂëÅÌ_3_PRESSING=  22622;
final static int  ÃÜÂëÅÌ_3_PRESSED=  22623;
final static int  ÃÜÂëÅÌ_3_ENTER=  22624;
final static int  ÃÜÂëÅÌ_3_LEAVE=  22625;

final static int ÃÜÂëÅÌ_4= 22630;
final static int ÃÜÂëÅÌ_4_RELEASE=  22631;
final static int ÃÜÂëÅÌ_4_PRESSING=  22632;
final static int  ÃÜÂëÅÌ_4_PRESSED=  22633;
final static int  ÃÜÂëÅÌ_4_ENTER=  22634;
final static int  ÃÜÂëÅÌ_4_LEAVE=  22635;

final static int ÃÜÂëÅÌ_5= 22640;
final static int ÃÜÂëÅÌ_5_RELEASE=  22641;
final static int ÃÜÂëÅÌ_5_PRESSING=  22642;
final static int  ÃÜÂëÅÌ_5_PRESSED=  22643;
final static int  ÃÜÂëÅÌ_5_ENTER=  22644;
final static int  ÃÜÂëÅÌ_5_LEAVE=  22645;

final static int ÃÜÂëÅÌ_6= 22650;
final static int ÃÜÂëÅÌ_6_RELEASE=  22651;
final static int ÃÜÂëÅÌ_6_PRESSING=  22652;
final static int  ÃÜÂëÅÌ_6_PRESSED=  22653;
final static int  ÃÜÂëÅÌ_6_ENTER=  22654;
final static int  ÃÜÂëÅÌ_6_LEAVE=  22655;

final static int ÃÜÂëÅÌ_7= 22660;
final static int ÃÜÂëÅÌ_7_RELEASE=  22661;
final static int ÃÜÂëÅÌ_7_PRESSING=  22662;
final static int  ÃÜÂëÅÌ_7_PRESSED=  22663;
final static int  ÃÜÂëÅÌ_7_ENTER=  22664;
final static int  ÃÜÂëÅÌ_7_LEAVE=  22665;

final static int ÃÜÂëÅÌ_8= 22670;
final static int ÃÜÂëÅÌ_8_RELEASE=  22671;
final static int ÃÜÂëÅÌ_8_PRESSING=  22672;
final static int  ÃÜÂëÅÌ_8_PRESSED=  22673;
final static int  ÃÜÂëÅÌ_8_ENTER=  22674;
final static int  ÃÜÂëÅÌ_8_LEAVE=  22675;

final static int ÃÜÂëÅÌ_9= 22680;
final static int ÃÜÂëÅÌ_9_RELEASE=  22681;
final static int ÃÜÂëÅÌ_9_PRESSING=  22682;
final static int  ÃÜÂëÅÌ_9_PRESSED=  22683;
final static int  ÃÜÂëÅÌ_9_ENTER=  22684;
final static int  ÃÜÂëÅÌ_9_LEAVE=  22685;

final static int ÃÜÂëÅÌ_C= 22690;
final static int ÃÜÂëÅÌ_C_RELEASE=  22691;
final static int ÃÜÂëÅÌ_C_PRESSING=  22692;
final static int  ÃÜÂëÅÌ_C_PRESSED=  22693;
final static int  ÃÜÂëÅÌ_C_ENTER=  22694;
final static int  ÃÜÂëÅÌ_C_LEAVE=  22695;

final static int ÃÜÂëÅÌ_OK= 22700;
final static int ÃÜÂëÅÌ_OK_RELEASE=  22701;
final static int ÃÜÂëÅÌ_OK_PRESSING=  22702;
final static int  ÃÜÂëÅÌ_OK_PRESSED=  22703;
final static int  ÃÜÂëÅÌ_OK_ENTER=  22704;
final static int  ÃÜÂëÅÌ_OK_LEAVE=  22705;


public ÃÜÂëÅÌ_Event() {
      actionMap.putInt("0",ÃÜÂëÅÌ_0);
      actionMap.putInt("1",ÃÜÂëÅÌ_1);
      actionMap.putInt("2",ÃÜÂëÅÌ_2);
      actionMap.putInt("3",ÃÜÂëÅÌ_3);
      actionMap.putInt("4",ÃÜÂëÅÌ_4);
      actionMap.putInt("5",ÃÜÂëÅÌ_5);
      actionMap.putInt("6",ÃÜÂëÅÌ_6);
      actionMap.putInt("7",ÃÜÂëÅÌ_7);
      actionMap.putInt("8",ÃÜÂëÅÌ_8);
      actionMap.putInt("9",ÃÜÂëÅÌ_9);
      actionMap.putInt("C",ÃÜÂëÅÌ_C);
      actionMap.putInt("OK",ÃÜÂëÅÌ_OK);
	STATE= changeState(STATE,ST_ÃÜÂëÅÌ);
	setBindScreen(new Screen_ÃÜÂëÅÌ(),SCRN_ÃÜÂëÅÌ);
}

public String getScreenName(){
	return  "ÃÜÂëÅÌ";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ÃÜÂëÅÌ){
			if(msg.wParam==ÃÜÂëÅÌ_0_RELEASE){
				_F_RELEASE("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_1_RELEASE){
				_F_RELEASE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_2_RELEASE){
				_F_RELEASE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_3_RELEASE){
				_F_RELEASE("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_4_RELEASE){
				_F_RELEASE("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_5_RELEASE){
				_F_RELEASE("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_6_RELEASE){
				_F_RELEASE("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_7_RELEASE){
				_F_RELEASE("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_8_RELEASE){
				_F_RELEASE("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_9_RELEASE){
				_F_RELEASE("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ÃÜÂëÅÌ_OK_RELEASE){
				_F_OK(msg);
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
