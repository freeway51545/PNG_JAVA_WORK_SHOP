package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_°²¼ªÐÇ;
public abstract class °²¼ªÐÇ_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_°²¼ªÐÇ(MSG_ZHW msg);
   public abstract void _F_Press(String a,MSG_ZHW msg);
   public abstract void _F_²¦´ò(MSG_ZHW msg);
   public abstract void _F_¹Ò¶Ï(MSG_ZHW msg);
   public abstract void _F_C(MSG_ZHW msg);
   public abstract void _F_Ö÷½çÃæ(MSG_ZHW msg);
   public abstract void _F_ÍË³ö(MSG_ZHW msg);
     final static int ST_°²¼ªÐÇ= 3038;
boolean IS_ST_°²¼ªÐÇ(){ return ST_°²¼ªÐÇ==STATE;}
final static int °²¼ªÐÇ_0= 23480;
final static int °²¼ªÐÇ_0_RELEASE=  23481;
final static int °²¼ªÐÇ_0_PRESSING=  23482;
final static int  °²¼ªÐÇ_0_PRESSED=  23483;
final static int  °²¼ªÐÇ_0_ENTER=  23484;
final static int  °²¼ªÐÇ_0_LEAVE=  23485;

final static int °²¼ªÐÇ_1= 23490;
final static int °²¼ªÐÇ_1_RELEASE=  23491;
final static int °²¼ªÐÇ_1_PRESSING=  23492;
final static int  °²¼ªÐÇ_1_PRESSED=  23493;
final static int  °²¼ªÐÇ_1_ENTER=  23494;
final static int  °²¼ªÐÇ_1_LEAVE=  23495;

final static int °²¼ªÐÇ_2= 23500;
final static int °²¼ªÐÇ_2_RELEASE=  23501;
final static int °²¼ªÐÇ_2_PRESSING=  23502;
final static int  °²¼ªÐÇ_2_PRESSED=  23503;
final static int  °²¼ªÐÇ_2_ENTER=  23504;
final static int  °²¼ªÐÇ_2_LEAVE=  23505;

final static int °²¼ªÐÇ_3= 23510;
final static int °²¼ªÐÇ_3_RELEASE=  23511;
final static int °²¼ªÐÇ_3_PRESSING=  23512;
final static int  °²¼ªÐÇ_3_PRESSED=  23513;
final static int  °²¼ªÐÇ_3_ENTER=  23514;
final static int  °²¼ªÐÇ_3_LEAVE=  23515;

final static int °²¼ªÐÇ_4= 23520;
final static int °²¼ªÐÇ_4_RELEASE=  23521;
final static int °²¼ªÐÇ_4_PRESSING=  23522;
final static int  °²¼ªÐÇ_4_PRESSED=  23523;
final static int  °²¼ªÐÇ_4_ENTER=  23524;
final static int  °²¼ªÐÇ_4_LEAVE=  23525;

final static int °²¼ªÐÇ_5= 23530;
final static int °²¼ªÐÇ_5_RELEASE=  23531;
final static int °²¼ªÐÇ_5_PRESSING=  23532;
final static int  °²¼ªÐÇ_5_PRESSED=  23533;
final static int  °²¼ªÐÇ_5_ENTER=  23534;
final static int  °²¼ªÐÇ_5_LEAVE=  23535;

final static int °²¼ªÐÇ_6= 23540;
final static int °²¼ªÐÇ_6_RELEASE=  23541;
final static int °²¼ªÐÇ_6_PRESSING=  23542;
final static int  °²¼ªÐÇ_6_PRESSED=  23543;
final static int  °²¼ªÐÇ_6_ENTER=  23544;
final static int  °²¼ªÐÇ_6_LEAVE=  23545;

final static int °²¼ªÐÇ_7= 23550;
final static int °²¼ªÐÇ_7_RELEASE=  23551;
final static int °²¼ªÐÇ_7_PRESSING=  23552;
final static int  °²¼ªÐÇ_7_PRESSED=  23553;
final static int  °²¼ªÐÇ_7_ENTER=  23554;
final static int  °²¼ªÐÇ_7_LEAVE=  23555;

final static int °²¼ªÐÇ_8= 23560;
final static int °²¼ªÐÇ_8_RELEASE=  23561;
final static int °²¼ªÐÇ_8_PRESSING=  23562;
final static int  °²¼ªÐÇ_8_PRESSED=  23563;
final static int  °²¼ªÐÇ_8_ENTER=  23564;
final static int  °²¼ªÐÇ_8_LEAVE=  23565;

final static int °²¼ªÐÇ_9= 23570;
final static int °²¼ªÐÇ_9_RELEASE=  23571;
final static int °²¼ªÐÇ_9_PRESSING=  23572;
final static int  °²¼ªÐÇ_9_PRESSED=  23573;
final static int  °²¼ªÐÇ_9_ENTER=  23574;
final static int  °²¼ªÐÇ_9_LEAVE=  23575;

final static int °²¼ªÐÇ_star= 23580;
final static int °²¼ªÐÇ_star_RELEASE=  23581;
final static int °²¼ªÐÇ_star_PRESSING=  23582;
final static int  °²¼ªÐÇ_star_PRESSED=  23583;
final static int  °²¼ªÐÇ_star_ENTER=  23584;
final static int  °²¼ªÐÇ_star_LEAVE=  23585;

final static int °²¼ªÐÇ_jinhao= 23590;
final static int °²¼ªÐÇ_jinhao_RELEASE=  23591;
final static int °²¼ªÐÇ_jinhao_PRESSING=  23592;
final static int  °²¼ªÐÇ_jinhao_PRESSED=  23593;
final static int  °²¼ªÐÇ_jinhao_ENTER=  23594;
final static int  °²¼ªÐÇ_jinhao_LEAVE=  23595;

final static int °²¼ªÐÇ_²¦´ò= 23600;
final static int °²¼ªÐÇ_²¦´ò_RELEASE=  23601;
final static int °²¼ªÐÇ_²¦´ò_PRESSING=  23602;
final static int  °²¼ªÐÇ_²¦´ò_PRESSED=  23603;
final static int  °²¼ªÐÇ_²¦´ò_ENTER=  23604;
final static int  °²¼ªÐÇ_²¦´ò_LEAVE=  23605;

final static int °²¼ªÐÇ_¹Ò¶Ï= 23610;
final static int °²¼ªÐÇ_¹Ò¶Ï_RELEASE=  23611;
final static int °²¼ªÐÇ_¹Ò¶Ï_PRESSING=  23612;
final static int  °²¼ªÐÇ_¹Ò¶Ï_PRESSED=  23613;
final static int  °²¼ªÐÇ_¹Ò¶Ï_ENTER=  23614;
final static int  °²¼ªÐÇ_¹Ò¶Ï_LEAVE=  23615;

final static int °²¼ªÐÇ_C= 23620;
final static int °²¼ªÐÇ_C_RELEASE=  23621;
final static int °²¼ªÐÇ_C_PRESSING=  23622;
final static int  °²¼ªÐÇ_C_PRESSED=  23623;
final static int  °²¼ªÐÇ_C_ENTER=  23624;
final static int  °²¼ªÐÇ_C_LEAVE=  23625;

final static int °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø= 23630;
final static int °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_RELEASE=  23631;
final static int °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_PRESSING=  23632;
final static int  °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_PRESSED=  23633;
final static int  °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_ENTER=  23634;
final static int  °²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_LEAVE=  23635;

final static int °²¼ªÐÇ_ÍË³ö= 23640;
final static int °²¼ªÐÇ_ÍË³ö_RELEASE=  23641;
final static int °²¼ªÐÇ_ÍË³ö_PRESSING=  23642;
final static int  °²¼ªÐÇ_ÍË³ö_PRESSED=  23643;
final static int  °²¼ªÐÇ_ÍË³ö_ENTER=  23644;
final static int  °²¼ªÐÇ_ÍË³ö_LEAVE=  23645;


public °²¼ªÐÇ_Event() {
      actionMap.putInt("0",°²¼ªÐÇ_0);
      actionMap.putInt("1",°²¼ªÐÇ_1);
      actionMap.putInt("2",°²¼ªÐÇ_2);
      actionMap.putInt("3",°²¼ªÐÇ_3);
      actionMap.putInt("4",°²¼ªÐÇ_4);
      actionMap.putInt("5",°²¼ªÐÇ_5);
      actionMap.putInt("6",°²¼ªÐÇ_6);
      actionMap.putInt("7",°²¼ªÐÇ_7);
      actionMap.putInt("8",°²¼ªÐÇ_8);
      actionMap.putInt("9",°²¼ªÐÇ_9);
      actionMap.putInt("star",°²¼ªÐÇ_star);
      actionMap.putInt("jinhao",°²¼ªÐÇ_jinhao);
      actionMap.putInt("²¦´ò",°²¼ªÐÇ_²¦´ò);
      actionMap.putInt("¹Ò¶Ï",°²¼ªÐÇ_¹Ò¶Ï);
      actionMap.putInt("C",°²¼ªÐÇ_C);
      actionMap.putInt("Ö÷½çÃæ·µ»Ø",°²¼ªÐÇ_Ö÷½çÃæ·µ»Ø);
      actionMap.putInt("ÍË³ö",°²¼ªÐÇ_ÍË³ö);
	STATE= changeState(STATE,ST_°²¼ªÐÇ);
	setBindScreen(new Screen_°²¼ªÐÇ(),SCRN_°²¼ªÐÇ);
}

public String getScreenName(){
	return  "°²¼ªÐÇ";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_°²¼ªÐÇ){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_°²¼ªÐÇ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_0_RELEASE){
				_F_Press("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_1_RELEASE){
				_F_Press("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_2_RELEASE){
				_F_Press("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_3_RELEASE){
				_F_Press("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_4_RELEASE){
				_F_Press("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_5_RELEASE){
				_F_Press("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_6_RELEASE){
				_F_Press("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_7_RELEASE){
				_F_Press("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_8_RELEASE){
				_F_Press("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_9_RELEASE){
				_F_Press("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_star_RELEASE){
				_F_Press("*",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_jinhao_RELEASE){
				_F_Press("#",msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_²¦´ò_RELEASE){
				_F_²¦´ò(msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_¹Ò¶Ï_RELEASE){
				_F_¹Ò¶Ï(msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_C_RELEASE){
				_F_C(msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_Ö÷½çÃæ·µ»Ø_RELEASE){
				_F_Ö÷½çÃæ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==°²¼ªÐÇ_ÍË³ö_RELEASE){
				_F_ÍË³ö(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
