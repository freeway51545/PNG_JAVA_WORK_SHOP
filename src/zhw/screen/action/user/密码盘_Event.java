package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_������;
public abstract class ������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_RELEASE(String a,MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_������= 3028;
boolean IS_ST_������(){ return ST_������==STATE;}
final static int ������_0= 22590;
final static int ������_0_RELEASE=  22591;
final static int ������_0_PRESSING=  22592;
final static int  ������_0_PRESSED=  22593;
final static int  ������_0_ENTER=  22594;
final static int  ������_0_LEAVE=  22595;

final static int ������_1= 22600;
final static int ������_1_RELEASE=  22601;
final static int ������_1_PRESSING=  22602;
final static int  ������_1_PRESSED=  22603;
final static int  ������_1_ENTER=  22604;
final static int  ������_1_LEAVE=  22605;

final static int ������_2= 22610;
final static int ������_2_RELEASE=  22611;
final static int ������_2_PRESSING=  22612;
final static int  ������_2_PRESSED=  22613;
final static int  ������_2_ENTER=  22614;
final static int  ������_2_LEAVE=  22615;

final static int ������_3= 22620;
final static int ������_3_RELEASE=  22621;
final static int ������_3_PRESSING=  22622;
final static int  ������_3_PRESSED=  22623;
final static int  ������_3_ENTER=  22624;
final static int  ������_3_LEAVE=  22625;

final static int ������_4= 22630;
final static int ������_4_RELEASE=  22631;
final static int ������_4_PRESSING=  22632;
final static int  ������_4_PRESSED=  22633;
final static int  ������_4_ENTER=  22634;
final static int  ������_4_LEAVE=  22635;

final static int ������_5= 22640;
final static int ������_5_RELEASE=  22641;
final static int ������_5_PRESSING=  22642;
final static int  ������_5_PRESSED=  22643;
final static int  ������_5_ENTER=  22644;
final static int  ������_5_LEAVE=  22645;

final static int ������_6= 22650;
final static int ������_6_RELEASE=  22651;
final static int ������_6_PRESSING=  22652;
final static int  ������_6_PRESSED=  22653;
final static int  ������_6_ENTER=  22654;
final static int  ������_6_LEAVE=  22655;

final static int ������_7= 22660;
final static int ������_7_RELEASE=  22661;
final static int ������_7_PRESSING=  22662;
final static int  ������_7_PRESSED=  22663;
final static int  ������_7_ENTER=  22664;
final static int  ������_7_LEAVE=  22665;

final static int ������_8= 22670;
final static int ������_8_RELEASE=  22671;
final static int ������_8_PRESSING=  22672;
final static int  ������_8_PRESSED=  22673;
final static int  ������_8_ENTER=  22674;
final static int  ������_8_LEAVE=  22675;

final static int ������_9= 22680;
final static int ������_9_RELEASE=  22681;
final static int ������_9_PRESSING=  22682;
final static int  ������_9_PRESSED=  22683;
final static int  ������_9_ENTER=  22684;
final static int  ������_9_LEAVE=  22685;

final static int ������_C= 22690;
final static int ������_C_RELEASE=  22691;
final static int ������_C_PRESSING=  22692;
final static int  ������_C_PRESSED=  22693;
final static int  ������_C_ENTER=  22694;
final static int  ������_C_LEAVE=  22695;

final static int ������_OK= 22700;
final static int ������_OK_RELEASE=  22701;
final static int ������_OK_PRESSING=  22702;
final static int  ������_OK_PRESSED=  22703;
final static int  ������_OK_ENTER=  22704;
final static int  ������_OK_LEAVE=  22705;


public ������_Event() {
      actionMap.putInt("0",������_0);
      actionMap.putInt("1",������_1);
      actionMap.putInt("2",������_2);
      actionMap.putInt("3",������_3);
      actionMap.putInt("4",������_4);
      actionMap.putInt("5",������_5);
      actionMap.putInt("6",������_6);
      actionMap.putInt("7",������_7);
      actionMap.putInt("8",������_8);
      actionMap.putInt("9",������_9);
      actionMap.putInt("C",������_C);
      actionMap.putInt("OK",������_OK);
	STATE= changeState(STATE,ST_������);
	setBindScreen(new Screen_������(),SCRN_������);
}

public String getScreenName(){
	return  "������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_������){
			if(msg.wParam==������_0_RELEASE){
				_F_RELEASE("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_1_RELEASE){
				_F_RELEASE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_2_RELEASE){
				_F_RELEASE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_3_RELEASE){
				_F_RELEASE("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_4_RELEASE){
				_F_RELEASE("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_5_RELEASE){
				_F_RELEASE("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_6_RELEASE){
				_F_RELEASE("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_7_RELEASE){
				_F_RELEASE("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_8_RELEASE){
				_F_RELEASE("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_9_RELEASE){
				_F_RELEASE("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_OK_RELEASE){
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
