package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_������;
public abstract class ������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_������(MSG_ZHW msg);
   public abstract void _F_Press(String a,MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�Ҷ�(MSG_ZHW msg);
   public abstract void _F_C(MSG_ZHW msg);
   public abstract void _F_������(MSG_ZHW msg);
   public abstract void _F_�˳�(MSG_ZHW msg);
     final static int ST_������= 3038;
boolean IS_ST_������(){ return ST_������==STATE;}
final static int ������_0= 23480;
final static int ������_0_RELEASE=  23481;
final static int ������_0_PRESSING=  23482;
final static int  ������_0_PRESSED=  23483;
final static int  ������_0_ENTER=  23484;
final static int  ������_0_LEAVE=  23485;

final static int ������_1= 23490;
final static int ������_1_RELEASE=  23491;
final static int ������_1_PRESSING=  23492;
final static int  ������_1_PRESSED=  23493;
final static int  ������_1_ENTER=  23494;
final static int  ������_1_LEAVE=  23495;

final static int ������_2= 23500;
final static int ������_2_RELEASE=  23501;
final static int ������_2_PRESSING=  23502;
final static int  ������_2_PRESSED=  23503;
final static int  ������_2_ENTER=  23504;
final static int  ������_2_LEAVE=  23505;

final static int ������_3= 23510;
final static int ������_3_RELEASE=  23511;
final static int ������_3_PRESSING=  23512;
final static int  ������_3_PRESSED=  23513;
final static int  ������_3_ENTER=  23514;
final static int  ������_3_LEAVE=  23515;

final static int ������_4= 23520;
final static int ������_4_RELEASE=  23521;
final static int ������_4_PRESSING=  23522;
final static int  ������_4_PRESSED=  23523;
final static int  ������_4_ENTER=  23524;
final static int  ������_4_LEAVE=  23525;

final static int ������_5= 23530;
final static int ������_5_RELEASE=  23531;
final static int ������_5_PRESSING=  23532;
final static int  ������_5_PRESSED=  23533;
final static int  ������_5_ENTER=  23534;
final static int  ������_5_LEAVE=  23535;

final static int ������_6= 23540;
final static int ������_6_RELEASE=  23541;
final static int ������_6_PRESSING=  23542;
final static int  ������_6_PRESSED=  23543;
final static int  ������_6_ENTER=  23544;
final static int  ������_6_LEAVE=  23545;

final static int ������_7= 23550;
final static int ������_7_RELEASE=  23551;
final static int ������_7_PRESSING=  23552;
final static int  ������_7_PRESSED=  23553;
final static int  ������_7_ENTER=  23554;
final static int  ������_7_LEAVE=  23555;

final static int ������_8= 23560;
final static int ������_8_RELEASE=  23561;
final static int ������_8_PRESSING=  23562;
final static int  ������_8_PRESSED=  23563;
final static int  ������_8_ENTER=  23564;
final static int  ������_8_LEAVE=  23565;

final static int ������_9= 23570;
final static int ������_9_RELEASE=  23571;
final static int ������_9_PRESSING=  23572;
final static int  ������_9_PRESSED=  23573;
final static int  ������_9_ENTER=  23574;
final static int  ������_9_LEAVE=  23575;

final static int ������_star= 23580;
final static int ������_star_RELEASE=  23581;
final static int ������_star_PRESSING=  23582;
final static int  ������_star_PRESSED=  23583;
final static int  ������_star_ENTER=  23584;
final static int  ������_star_LEAVE=  23585;

final static int ������_jinhao= 23590;
final static int ������_jinhao_RELEASE=  23591;
final static int ������_jinhao_PRESSING=  23592;
final static int  ������_jinhao_PRESSED=  23593;
final static int  ������_jinhao_ENTER=  23594;
final static int  ������_jinhao_LEAVE=  23595;

final static int ������_����= 23600;
final static int ������_����_RELEASE=  23601;
final static int ������_����_PRESSING=  23602;
final static int  ������_����_PRESSED=  23603;
final static int  ������_����_ENTER=  23604;
final static int  ������_����_LEAVE=  23605;

final static int ������_�Ҷ�= 23610;
final static int ������_�Ҷ�_RELEASE=  23611;
final static int ������_�Ҷ�_PRESSING=  23612;
final static int  ������_�Ҷ�_PRESSED=  23613;
final static int  ������_�Ҷ�_ENTER=  23614;
final static int  ������_�Ҷ�_LEAVE=  23615;

final static int ������_C= 23620;
final static int ������_C_RELEASE=  23621;
final static int ������_C_PRESSING=  23622;
final static int  ������_C_PRESSED=  23623;
final static int  ������_C_ENTER=  23624;
final static int  ������_C_LEAVE=  23625;

final static int ������_�����淵��= 23630;
final static int ������_�����淵��_RELEASE=  23631;
final static int ������_�����淵��_PRESSING=  23632;
final static int  ������_�����淵��_PRESSED=  23633;
final static int  ������_�����淵��_ENTER=  23634;
final static int  ������_�����淵��_LEAVE=  23635;

final static int ������_�˳�= 23640;
final static int ������_�˳�_RELEASE=  23641;
final static int ������_�˳�_PRESSING=  23642;
final static int  ������_�˳�_PRESSED=  23643;
final static int  ������_�˳�_ENTER=  23644;
final static int  ������_�˳�_LEAVE=  23645;


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
      actionMap.putInt("star",������_star);
      actionMap.putInt("jinhao",������_jinhao);
      actionMap.putInt("����",������_����);
      actionMap.putInt("�Ҷ�",������_�Ҷ�);
      actionMap.putInt("C",������_C);
      actionMap.putInt("�����淵��",������_�����淵��);
      actionMap.putInt("�˳�",������_�˳�);
	STATE= changeState(STATE,ST_������);
	setBindScreen(new Screen_������(),SCRN_������);
}

public String getScreenName(){
	return  "������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_������){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_0_RELEASE){
				_F_Press("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_1_RELEASE){
				_F_Press("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_2_RELEASE){
				_F_Press("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_3_RELEASE){
				_F_Press("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_4_RELEASE){
				_F_Press("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_5_RELEASE){
				_F_Press("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_6_RELEASE){
				_F_Press("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_7_RELEASE){
				_F_Press("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_8_RELEASE){
				_F_Press("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_9_RELEASE){
				_F_Press("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_star_RELEASE){
				_F_Press("*",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_jinhao_RELEASE){
				_F_Press("#",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_�Ҷ�_RELEASE){
				_F_�Ҷ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_C_RELEASE){
				_F_C(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_�����淵��_RELEASE){
				_F_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������_�˳�_RELEASE){
				_F_�˳�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
