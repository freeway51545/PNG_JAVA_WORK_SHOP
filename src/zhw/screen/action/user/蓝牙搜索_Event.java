package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_À¶ÑÀËÑË÷;
public abstract class À¶ÑÀËÑË÷_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_Ö÷Ò³(MSG_ZHW msg);
   public abstract void _F_·µ»Ø(MSG_ZHW msg);
   public abstract void _F_»ØÍË(MSG_ZHW msg);
   public abstract void _F_KEYDOWN(String a,MSG_ZHW msg);
     final static int ST_À¶ÑÀËÑË÷= 3060;
boolean IS_ST_À¶ÑÀËÑË÷(){ return ST_À¶ÑÀËÑË÷==STATE;}
final static int À¶ÑÀËÑË÷_Ö÷Ò³= 25640;
final static int À¶ÑÀËÑË÷_Ö÷Ò³_RELEASE=  25641;
final static int À¶ÑÀËÑË÷_Ö÷Ò³_PRESSING=  25642;
final static int  À¶ÑÀËÑË÷_Ö÷Ò³_PRESSED=  25643;
final static int  À¶ÑÀËÑË÷_Ö÷Ò³_ENTER=  25644;
final static int  À¶ÑÀËÑË÷_Ö÷Ò³_LEAVE=  25645;

final static int À¶ÑÀËÑË÷_·µ»Ø= 25650;
final static int À¶ÑÀËÑË÷_·µ»Ø_RELEASE=  25651;
final static int À¶ÑÀËÑË÷_·µ»Ø_PRESSING=  25652;
final static int  À¶ÑÀËÑË÷_·µ»Ø_PRESSED=  25653;
final static int  À¶ÑÀËÑË÷_·µ»Ø_ENTER=  25654;
final static int  À¶ÑÀËÑË÷_·µ»Ø_LEAVE=  25655;

final static int À¶ÑÀËÑË÷_»ØÍË= 25660;
final static int À¶ÑÀËÑË÷_»ØÍË_RELEASE=  25661;
final static int À¶ÑÀËÑË÷_»ØÍË_PRESSING=  25662;
final static int  À¶ÑÀËÑË÷_»ØÍË_PRESSED=  25663;
final static int  À¶ÑÀËÑË÷_»ØÍË_ENTER=  25664;
final static int  À¶ÑÀËÑË÷_»ØÍË_LEAVE=  25665;

final static int À¶ÑÀËÑË÷_A= 25670;
final static int À¶ÑÀËÑË÷_A_RELEASE=  25671;
final static int À¶ÑÀËÑË÷_A_PRESSING=  25672;
final static int  À¶ÑÀËÑË÷_A_PRESSED=  25673;
final static int  À¶ÑÀËÑË÷_A_ENTER=  25674;
final static int  À¶ÑÀËÑË÷_A_LEAVE=  25675;

final static int À¶ÑÀËÑË÷_B= 25680;
final static int À¶ÑÀËÑË÷_B_RELEASE=  25681;
final static int À¶ÑÀËÑË÷_B_PRESSING=  25682;
final static int  À¶ÑÀËÑË÷_B_PRESSED=  25683;
final static int  À¶ÑÀËÑË÷_B_ENTER=  25684;
final static int  À¶ÑÀËÑË÷_B_LEAVE=  25685;

final static int À¶ÑÀËÑË÷_C= 25690;
final static int À¶ÑÀËÑË÷_C_RELEASE=  25691;
final static int À¶ÑÀËÑË÷_C_PRESSING=  25692;
final static int  À¶ÑÀËÑË÷_C_PRESSED=  25693;
final static int  À¶ÑÀËÑË÷_C_ENTER=  25694;
final static int  À¶ÑÀËÑË÷_C_LEAVE=  25695;

final static int À¶ÑÀËÑË÷_D= 25700;
final static int À¶ÑÀËÑË÷_D_RELEASE=  25701;
final static int À¶ÑÀËÑË÷_D_PRESSING=  25702;
final static int  À¶ÑÀËÑË÷_D_PRESSED=  25703;
final static int  À¶ÑÀËÑË÷_D_ENTER=  25704;
final static int  À¶ÑÀËÑË÷_D_LEAVE=  25705;

final static int À¶ÑÀËÑË÷_E= 25710;
final static int À¶ÑÀËÑË÷_E_RELEASE=  25711;
final static int À¶ÑÀËÑË÷_E_PRESSING=  25712;
final static int  À¶ÑÀËÑË÷_E_PRESSED=  25713;
final static int  À¶ÑÀËÑË÷_E_ENTER=  25714;
final static int  À¶ÑÀËÑË÷_E_LEAVE=  25715;

final static int À¶ÑÀËÑË÷_F= 25720;
final static int À¶ÑÀËÑË÷_F_RELEASE=  25721;
final static int À¶ÑÀËÑË÷_F_PRESSING=  25722;
final static int  À¶ÑÀËÑË÷_F_PRESSED=  25723;
final static int  À¶ÑÀËÑË÷_F_ENTER=  25724;
final static int  À¶ÑÀËÑË÷_F_LEAVE=  25725;

final static int À¶ÑÀËÑË÷_G= 25730;
final static int À¶ÑÀËÑË÷_G_RELEASE=  25731;
final static int À¶ÑÀËÑË÷_G_PRESSING=  25732;
final static int  À¶ÑÀËÑË÷_G_PRESSED=  25733;
final static int  À¶ÑÀËÑË÷_G_ENTER=  25734;
final static int  À¶ÑÀËÑË÷_G_LEAVE=  25735;

final static int À¶ÑÀËÑË÷_H= 25740;
final static int À¶ÑÀËÑË÷_H_RELEASE=  25741;
final static int À¶ÑÀËÑË÷_H_PRESSING=  25742;
final static int  À¶ÑÀËÑË÷_H_PRESSED=  25743;
final static int  À¶ÑÀËÑË÷_H_ENTER=  25744;
final static int  À¶ÑÀËÑË÷_H_LEAVE=  25745;

final static int À¶ÑÀËÑË÷_I= 25750;
final static int À¶ÑÀËÑË÷_I_RELEASE=  25751;
final static int À¶ÑÀËÑË÷_I_PRESSING=  25752;
final static int  À¶ÑÀËÑË÷_I_PRESSED=  25753;
final static int  À¶ÑÀËÑË÷_I_ENTER=  25754;
final static int  À¶ÑÀËÑË÷_I_LEAVE=  25755;

final static int À¶ÑÀËÑË÷_J= 25760;
final static int À¶ÑÀËÑË÷_J_RELEASE=  25761;
final static int À¶ÑÀËÑË÷_J_PRESSING=  25762;
final static int  À¶ÑÀËÑË÷_J_PRESSED=  25763;
final static int  À¶ÑÀËÑË÷_J_ENTER=  25764;
final static int  À¶ÑÀËÑË÷_J_LEAVE=  25765;

final static int À¶ÑÀËÑË÷_K= 25770;
final static int À¶ÑÀËÑË÷_K_RELEASE=  25771;
final static int À¶ÑÀËÑË÷_K_PRESSING=  25772;
final static int  À¶ÑÀËÑË÷_K_PRESSED=  25773;
final static int  À¶ÑÀËÑË÷_K_ENTER=  25774;
final static int  À¶ÑÀËÑË÷_K_LEAVE=  25775;

final static int À¶ÑÀËÑË÷_L= 25780;
final static int À¶ÑÀËÑË÷_L_RELEASE=  25781;
final static int À¶ÑÀËÑË÷_L_PRESSING=  25782;
final static int  À¶ÑÀËÑË÷_L_PRESSED=  25783;
final static int  À¶ÑÀËÑË÷_L_ENTER=  25784;
final static int  À¶ÑÀËÑË÷_L_LEAVE=  25785;

final static int À¶ÑÀËÑË÷_M= 25790;
final static int À¶ÑÀËÑË÷_M_RELEASE=  25791;
final static int À¶ÑÀËÑË÷_M_PRESSING=  25792;
final static int  À¶ÑÀËÑË÷_M_PRESSED=  25793;
final static int  À¶ÑÀËÑË÷_M_ENTER=  25794;
final static int  À¶ÑÀËÑË÷_M_LEAVE=  25795;

final static int À¶ÑÀËÑË÷_N= 25800;
final static int À¶ÑÀËÑË÷_N_RELEASE=  25801;
final static int À¶ÑÀËÑË÷_N_PRESSING=  25802;
final static int  À¶ÑÀËÑË÷_N_PRESSED=  25803;
final static int  À¶ÑÀËÑË÷_N_ENTER=  25804;
final static int  À¶ÑÀËÑË÷_N_LEAVE=  25805;

final static int À¶ÑÀËÑË÷_O= 25810;
final static int À¶ÑÀËÑË÷_O_RELEASE=  25811;
final static int À¶ÑÀËÑË÷_O_PRESSING=  25812;
final static int  À¶ÑÀËÑË÷_O_PRESSED=  25813;
final static int  À¶ÑÀËÑË÷_O_ENTER=  25814;
final static int  À¶ÑÀËÑË÷_O_LEAVE=  25815;

final static int À¶ÑÀËÑË÷_P= 25820;
final static int À¶ÑÀËÑË÷_P_RELEASE=  25821;
final static int À¶ÑÀËÑË÷_P_PRESSING=  25822;
final static int  À¶ÑÀËÑË÷_P_PRESSED=  25823;
final static int  À¶ÑÀËÑË÷_P_ENTER=  25824;
final static int  À¶ÑÀËÑË÷_P_LEAVE=  25825;

final static int À¶ÑÀËÑË÷_Q= 25830;
final static int À¶ÑÀËÑË÷_Q_RELEASE=  25831;
final static int À¶ÑÀËÑË÷_Q_PRESSING=  25832;
final static int  À¶ÑÀËÑË÷_Q_PRESSED=  25833;
final static int  À¶ÑÀËÑË÷_Q_ENTER=  25834;
final static int  À¶ÑÀËÑË÷_Q_LEAVE=  25835;

final static int À¶ÑÀËÑË÷_R= 25840;
final static int À¶ÑÀËÑË÷_R_RELEASE=  25841;
final static int À¶ÑÀËÑË÷_R_PRESSING=  25842;
final static int  À¶ÑÀËÑË÷_R_PRESSED=  25843;
final static int  À¶ÑÀËÑË÷_R_ENTER=  25844;
final static int  À¶ÑÀËÑË÷_R_LEAVE=  25845;

final static int À¶ÑÀËÑË÷_S= 25850;
final static int À¶ÑÀËÑË÷_S_RELEASE=  25851;
final static int À¶ÑÀËÑË÷_S_PRESSING=  25852;
final static int  À¶ÑÀËÑË÷_S_PRESSED=  25853;
final static int  À¶ÑÀËÑË÷_S_ENTER=  25854;
final static int  À¶ÑÀËÑË÷_S_LEAVE=  25855;

final static int À¶ÑÀËÑË÷_T= 25860;
final static int À¶ÑÀËÑË÷_T_RELEASE=  25861;
final static int À¶ÑÀËÑË÷_T_PRESSING=  25862;
final static int  À¶ÑÀËÑË÷_T_PRESSED=  25863;
final static int  À¶ÑÀËÑË÷_T_ENTER=  25864;
final static int  À¶ÑÀËÑË÷_T_LEAVE=  25865;

final static int À¶ÑÀËÑË÷_U= 25870;
final static int À¶ÑÀËÑË÷_U_RELEASE=  25871;
final static int À¶ÑÀËÑË÷_U_PRESSING=  25872;
final static int  À¶ÑÀËÑË÷_U_PRESSED=  25873;
final static int  À¶ÑÀËÑË÷_U_ENTER=  25874;
final static int  À¶ÑÀËÑË÷_U_LEAVE=  25875;

final static int À¶ÑÀËÑË÷_V= 25880;
final static int À¶ÑÀËÑË÷_V_RELEASE=  25881;
final static int À¶ÑÀËÑË÷_V_PRESSING=  25882;
final static int  À¶ÑÀËÑË÷_V_PRESSED=  25883;
final static int  À¶ÑÀËÑË÷_V_ENTER=  25884;
final static int  À¶ÑÀËÑË÷_V_LEAVE=  25885;

final static int À¶ÑÀËÑË÷_W= 25890;
final static int À¶ÑÀËÑË÷_W_RELEASE=  25891;
final static int À¶ÑÀËÑË÷_W_PRESSING=  25892;
final static int  À¶ÑÀËÑË÷_W_PRESSED=  25893;
final static int  À¶ÑÀËÑË÷_W_ENTER=  25894;
final static int  À¶ÑÀËÑË÷_W_LEAVE=  25895;

final static int À¶ÑÀËÑË÷_X= 25900;
final static int À¶ÑÀËÑË÷_X_RELEASE=  25901;
final static int À¶ÑÀËÑË÷_X_PRESSING=  25902;
final static int  À¶ÑÀËÑË÷_X_PRESSED=  25903;
final static int  À¶ÑÀËÑË÷_X_ENTER=  25904;
final static int  À¶ÑÀËÑË÷_X_LEAVE=  25905;

final static int À¶ÑÀËÑË÷_Y= 25910;
final static int À¶ÑÀËÑË÷_Y_RELEASE=  25911;
final static int À¶ÑÀËÑË÷_Y_PRESSING=  25912;
final static int  À¶ÑÀËÑË÷_Y_PRESSED=  25913;
final static int  À¶ÑÀËÑË÷_Y_ENTER=  25914;
final static int  À¶ÑÀËÑË÷_Y_LEAVE=  25915;

final static int À¶ÑÀËÑË÷_Z= 25920;
final static int À¶ÑÀËÑË÷_Z_RELEASE=  25921;
final static int À¶ÑÀËÑË÷_Z_PRESSING=  25922;
final static int  À¶ÑÀËÑË÷_Z_PRESSED=  25923;
final static int  À¶ÑÀËÑË÷_Z_ENTER=  25924;
final static int  À¶ÑÀËÑË÷_Z_LEAVE=  25925;

final static int À¶ÑÀËÑË÷_0= 25930;
final static int À¶ÑÀËÑË÷_0_RELEASE=  25931;
final static int À¶ÑÀËÑË÷_0_PRESSING=  25932;
final static int  À¶ÑÀËÑË÷_0_PRESSED=  25933;
final static int  À¶ÑÀËÑË÷_0_ENTER=  25934;
final static int  À¶ÑÀËÑË÷_0_LEAVE=  25935;

final static int À¶ÑÀËÑË÷_1= 25940;
final static int À¶ÑÀËÑË÷_1_RELEASE=  25941;
final static int À¶ÑÀËÑË÷_1_PRESSING=  25942;
final static int  À¶ÑÀËÑË÷_1_PRESSED=  25943;
final static int  À¶ÑÀËÑË÷_1_ENTER=  25944;
final static int  À¶ÑÀËÑË÷_1_LEAVE=  25945;

final static int À¶ÑÀËÑË÷_2= 25950;
final static int À¶ÑÀËÑË÷_2_RELEASE=  25951;
final static int À¶ÑÀËÑË÷_2_PRESSING=  25952;
final static int  À¶ÑÀËÑË÷_2_PRESSED=  25953;
final static int  À¶ÑÀËÑË÷_2_ENTER=  25954;
final static int  À¶ÑÀËÑË÷_2_LEAVE=  25955;

final static int À¶ÑÀËÑË÷_3= 25960;
final static int À¶ÑÀËÑË÷_3_RELEASE=  25961;
final static int À¶ÑÀËÑË÷_3_PRESSING=  25962;
final static int  À¶ÑÀËÑË÷_3_PRESSED=  25963;
final static int  À¶ÑÀËÑË÷_3_ENTER=  25964;
final static int  À¶ÑÀËÑË÷_3_LEAVE=  25965;

final static int À¶ÑÀËÑË÷_4= 25970;
final static int À¶ÑÀËÑË÷_4_RELEASE=  25971;
final static int À¶ÑÀËÑË÷_4_PRESSING=  25972;
final static int  À¶ÑÀËÑË÷_4_PRESSED=  25973;
final static int  À¶ÑÀËÑË÷_4_ENTER=  25974;
final static int  À¶ÑÀËÑË÷_4_LEAVE=  25975;

final static int À¶ÑÀËÑË÷_5= 25980;
final static int À¶ÑÀËÑË÷_5_RELEASE=  25981;
final static int À¶ÑÀËÑË÷_5_PRESSING=  25982;
final static int  À¶ÑÀËÑË÷_5_PRESSED=  25983;
final static int  À¶ÑÀËÑË÷_5_ENTER=  25984;
final static int  À¶ÑÀËÑË÷_5_LEAVE=  25985;

final static int À¶ÑÀËÑË÷_6= 25990;
final static int À¶ÑÀËÑË÷_6_RELEASE=  25991;
final static int À¶ÑÀËÑË÷_6_PRESSING=  25992;
final static int  À¶ÑÀËÑË÷_6_PRESSED=  25993;
final static int  À¶ÑÀËÑË÷_6_ENTER=  25994;
final static int  À¶ÑÀËÑË÷_6_LEAVE=  25995;

final static int À¶ÑÀËÑË÷_7= 26000;
final static int À¶ÑÀËÑË÷_7_RELEASE=  26001;
final static int À¶ÑÀËÑË÷_7_PRESSING=  26002;
final static int  À¶ÑÀËÑË÷_7_PRESSED=  26003;
final static int  À¶ÑÀËÑË÷_7_ENTER=  26004;
final static int  À¶ÑÀËÑË÷_7_LEAVE=  26005;

final static int À¶ÑÀËÑË÷_8= 26010;
final static int À¶ÑÀËÑË÷_8_RELEASE=  26011;
final static int À¶ÑÀËÑË÷_8_PRESSING=  26012;
final static int  À¶ÑÀËÑË÷_8_PRESSED=  26013;
final static int  À¶ÑÀËÑË÷_8_ENTER=  26014;
final static int  À¶ÑÀËÑË÷_8_LEAVE=  26015;

final static int À¶ÑÀËÑË÷_9= 26020;
final static int À¶ÑÀËÑË÷_9_RELEASE=  26021;
final static int À¶ÑÀËÑË÷_9_PRESSING=  26022;
final static int  À¶ÑÀËÑË÷_9_PRESSED=  26023;
final static int  À¶ÑÀËÑË÷_9_ENTER=  26024;
final static int  À¶ÑÀËÑË÷_9_LEAVE=  26025;


public À¶ÑÀËÑË÷_Event() {
      actionMap.putInt("Ö÷Ò³",À¶ÑÀËÑË÷_Ö÷Ò³);
      actionMap.putInt("·µ»Ø",À¶ÑÀËÑË÷_·µ»Ø);
      actionMap.putInt("»ØÍË",À¶ÑÀËÑË÷_»ØÍË);
      actionMap.putInt("A",À¶ÑÀËÑË÷_A);
      actionMap.putInt("B",À¶ÑÀËÑË÷_B);
      actionMap.putInt("C",À¶ÑÀËÑË÷_C);
      actionMap.putInt("D",À¶ÑÀËÑË÷_D);
      actionMap.putInt("E",À¶ÑÀËÑË÷_E);
      actionMap.putInt("F",À¶ÑÀËÑË÷_F);
      actionMap.putInt("G",À¶ÑÀËÑË÷_G);
      actionMap.putInt("H",À¶ÑÀËÑË÷_H);
      actionMap.putInt("I",À¶ÑÀËÑË÷_I);
      actionMap.putInt("J",À¶ÑÀËÑË÷_J);
      actionMap.putInt("K",À¶ÑÀËÑË÷_K);
      actionMap.putInt("L",À¶ÑÀËÑË÷_L);
      actionMap.putInt("M",À¶ÑÀËÑË÷_M);
      actionMap.putInt("N",À¶ÑÀËÑË÷_N);
      actionMap.putInt("O",À¶ÑÀËÑË÷_O);
      actionMap.putInt("P",À¶ÑÀËÑË÷_P);
      actionMap.putInt("Q",À¶ÑÀËÑË÷_Q);
      actionMap.putInt("R",À¶ÑÀËÑË÷_R);
      actionMap.putInt("S",À¶ÑÀËÑË÷_S);
      actionMap.putInt("T",À¶ÑÀËÑË÷_T);
      actionMap.putInt("U",À¶ÑÀËÑË÷_U);
      actionMap.putInt("V",À¶ÑÀËÑË÷_V);
      actionMap.putInt("W",À¶ÑÀËÑË÷_W);
      actionMap.putInt("X",À¶ÑÀËÑË÷_X);
      actionMap.putInt("Y",À¶ÑÀËÑË÷_Y);
      actionMap.putInt("Z",À¶ÑÀËÑË÷_Z);
      actionMap.putInt("0",À¶ÑÀËÑË÷_0);
      actionMap.putInt("1",À¶ÑÀËÑË÷_1);
      actionMap.putInt("2",À¶ÑÀËÑË÷_2);
      actionMap.putInt("3",À¶ÑÀËÑË÷_3);
      actionMap.putInt("4",À¶ÑÀËÑË÷_4);
      actionMap.putInt("5",À¶ÑÀËÑË÷_5);
      actionMap.putInt("6",À¶ÑÀËÑË÷_6);
      actionMap.putInt("7",À¶ÑÀËÑË÷_7);
      actionMap.putInt("8",À¶ÑÀËÑË÷_8);
      actionMap.putInt("9",À¶ÑÀËÑË÷_9);
	STATE= changeState(STATE,ST_À¶ÑÀËÑË÷);
	setBindScreen(new Screen_À¶ÑÀËÑË÷(),SCRN_À¶ÑÀËÑË÷);
}

public String getScreenName(){
	return  "À¶ÑÀËÑË÷";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_À¶ÑÀËÑË÷){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_Ö÷Ò³_RELEASE){
				_F_Ö÷Ò³(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_·µ»Ø_RELEASE){
				_F_·µ»Ø(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_»ØÍË_RELEASE){
				_F_»ØÍË(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_A_RELEASE){
				_F_KEYDOWN("A",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_B_RELEASE){
				_F_KEYDOWN("B",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_C_RELEASE){
				_F_KEYDOWN("C",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_D_RELEASE){
				_F_KEYDOWN("D",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_E_RELEASE){
				_F_KEYDOWN("E",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_F_RELEASE){
				_F_KEYDOWN("F",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_G_RELEASE){
				_F_KEYDOWN("G",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_H_RELEASE){
				_F_KEYDOWN("H",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_I_RELEASE){
				_F_KEYDOWN("I",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_J_RELEASE){
				_F_KEYDOWN("J",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_K_RELEASE){
				_F_KEYDOWN("K",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_L_RELEASE){
				_F_KEYDOWN("L",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_M_RELEASE){
				_F_KEYDOWN("M",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_N_RELEASE){
				_F_KEYDOWN("N",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_O_RELEASE){
				_F_KEYDOWN("O",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_P_RELEASE){
				_F_KEYDOWN("P",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_Q_RELEASE){
				_F_KEYDOWN("Q",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_R_RELEASE){
				_F_KEYDOWN("R",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_S_RELEASE){
				_F_KEYDOWN("S",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_T_RELEASE){
				_F_KEYDOWN("T",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_U_RELEASE){
				_F_KEYDOWN("U",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_V_RELEASE){
				_F_KEYDOWN("V",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_W_RELEASE){
				_F_KEYDOWN("W",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_X_RELEASE){
				_F_KEYDOWN("X",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_Y_RELEASE){
				_F_KEYDOWN("Y",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_Z_RELEASE){
				_F_KEYDOWN("Z",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_0_RELEASE){
				_F_KEYDOWN("0",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_1_RELEASE){
				_F_KEYDOWN("1",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_2_RELEASE){
				_F_KEYDOWN("2",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_3_RELEASE){
				_F_KEYDOWN("3",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_4_RELEASE){
				_F_KEYDOWN("4",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_5_RELEASE){
				_F_KEYDOWN("5",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_6_RELEASE){
				_F_KEYDOWN("6",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_7_RELEASE){
				_F_KEYDOWN("7",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_8_RELEASE){
				_F_KEYDOWN("8",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀËÑË÷_9_RELEASE){
				_F_KEYDOWN("9",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
