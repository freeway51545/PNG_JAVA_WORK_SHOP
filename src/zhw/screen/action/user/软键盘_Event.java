package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�����;
public abstract class �����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_RELEASE(String a,MSG_ZHW msg);
   public abstract void _F_PRESSING(String a,MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_rjp_NORMAL= 3039;
boolean IS_ST_rjp_NORMAL(){ return ST_rjp_NORMAL==STATE;}
final static int �����_K0= 23650;
final static int �����_K0_RELEASE=  23651;
final static int �����_K0_PRESSING=  23652;
final static int  �����_K0_PRESSED=  23653;
final static int  �����_K0_ENTER=  23654;
final static int  �����_K0_LEAVE=  23655;

final static int �����_K1= 23660;
final static int �����_K1_RELEASE=  23661;
final static int �����_K1_PRESSING=  23662;
final static int  �����_K1_PRESSED=  23663;
final static int  �����_K1_ENTER=  23664;
final static int  �����_K1_LEAVE=  23665;

final static int �����_K2= 23670;
final static int �����_K2_RELEASE=  23671;
final static int �����_K2_PRESSING=  23672;
final static int  �����_K2_PRESSED=  23673;
final static int  �����_K2_ENTER=  23674;
final static int  �����_K2_LEAVE=  23675;

final static int �����_K3= 23680;
final static int �����_K3_RELEASE=  23681;
final static int �����_K3_PRESSING=  23682;
final static int  �����_K3_PRESSED=  23683;
final static int  �����_K3_ENTER=  23684;
final static int  �����_K3_LEAVE=  23685;

final static int �����_K4= 23690;
final static int �����_K4_RELEASE=  23691;
final static int �����_K4_PRESSING=  23692;
final static int  �����_K4_PRESSED=  23693;
final static int  �����_K4_ENTER=  23694;
final static int  �����_K4_LEAVE=  23695;

final static int �����_CANCEL= 23700;
final static int �����_CANCEL_RELEASE=  23701;
final static int �����_CANCEL_PRESSING=  23702;
final static int  �����_CANCEL_PRESSED=  23703;
final static int  �����_CANCEL_ENTER=  23704;
final static int  �����_CANCEL_LEAVE=  23705;

final static int �����_����= 23710;
final static int �����_����_RELEASE=  23711;
final static int �����_����_PRESSING=  23712;
final static int  �����_����_PRESSED=  23713;
final static int  �����_����_ENTER=  23714;
final static int  �����_����_LEAVE=  23715;


public �����_Event() {
      actionMap.putInt("K0",�����_K0);
      actionMap.putInt("K1",�����_K1);
      actionMap.putInt("K2",�����_K2);
      actionMap.putInt("K3",�����_K3);
      actionMap.putInt("K4",�����_K4);
      actionMap.putInt("CANCEL",�����_CANCEL);
      actionMap.putInt("����",�����_����);
	STATE= changeState(STATE,ST_rjp_NORMAL);
	setBindScreen(new Screen_�����(),SCRN_�����);
}

public String getScreenName(){
	return  "�����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_rjp_NORMAL){
			if(msg.wParam==�����_K0_PRESSED){
				_F_PRESSED("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K1_PRESSED){
				_F_PRESSED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K2_PRESSED){
				_F_PRESSED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K3_PRESSED){
				_F_PRESSED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K4_PRESSED){
				_F_PRESSED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K0_RELEASE){
				_F_RELEASE("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K1_RELEASE){
				_F_RELEASE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K2_RELEASE){
				_F_RELEASE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K3_RELEASE){
				_F_RELEASE("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K4_RELEASE){
				_F_RELEASE("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K0_PRESSING){
				_F_PRESSING("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K1_PRESSING){
				_F_PRESSING("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K2_PRESSING){
				_F_PRESSING("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K3_PRESSING){
				_F_PRESSING("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_K4_PRESSING){
				_F_PRESSING("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_CANCEL_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����_����_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
