package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������;
public abstract class ��������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_KEYDOWN(String a,MSG_ZHW msg);
     final static int ST_��������= 3060;
boolean IS_ST_��������(){ return ST_��������==STATE;}
final static int ��������_��ҳ= 25640;
final static int ��������_��ҳ_RELEASE=  25641;
final static int ��������_��ҳ_PRESSING=  25642;
final static int  ��������_��ҳ_PRESSED=  25643;
final static int  ��������_��ҳ_ENTER=  25644;
final static int  ��������_��ҳ_LEAVE=  25645;

final static int ��������_����= 25650;
final static int ��������_����_RELEASE=  25651;
final static int ��������_����_PRESSING=  25652;
final static int  ��������_����_PRESSED=  25653;
final static int  ��������_����_ENTER=  25654;
final static int  ��������_����_LEAVE=  25655;

final static int ��������_����= 25660;
final static int ��������_����_RELEASE=  25661;
final static int ��������_����_PRESSING=  25662;
final static int  ��������_����_PRESSED=  25663;
final static int  ��������_����_ENTER=  25664;
final static int  ��������_����_LEAVE=  25665;

final static int ��������_A= 25670;
final static int ��������_A_RELEASE=  25671;
final static int ��������_A_PRESSING=  25672;
final static int  ��������_A_PRESSED=  25673;
final static int  ��������_A_ENTER=  25674;
final static int  ��������_A_LEAVE=  25675;

final static int ��������_B= 25680;
final static int ��������_B_RELEASE=  25681;
final static int ��������_B_PRESSING=  25682;
final static int  ��������_B_PRESSED=  25683;
final static int  ��������_B_ENTER=  25684;
final static int  ��������_B_LEAVE=  25685;

final static int ��������_C= 25690;
final static int ��������_C_RELEASE=  25691;
final static int ��������_C_PRESSING=  25692;
final static int  ��������_C_PRESSED=  25693;
final static int  ��������_C_ENTER=  25694;
final static int  ��������_C_LEAVE=  25695;

final static int ��������_D= 25700;
final static int ��������_D_RELEASE=  25701;
final static int ��������_D_PRESSING=  25702;
final static int  ��������_D_PRESSED=  25703;
final static int  ��������_D_ENTER=  25704;
final static int  ��������_D_LEAVE=  25705;

final static int ��������_E= 25710;
final static int ��������_E_RELEASE=  25711;
final static int ��������_E_PRESSING=  25712;
final static int  ��������_E_PRESSED=  25713;
final static int  ��������_E_ENTER=  25714;
final static int  ��������_E_LEAVE=  25715;

final static int ��������_F= 25720;
final static int ��������_F_RELEASE=  25721;
final static int ��������_F_PRESSING=  25722;
final static int  ��������_F_PRESSED=  25723;
final static int  ��������_F_ENTER=  25724;
final static int  ��������_F_LEAVE=  25725;

final static int ��������_G= 25730;
final static int ��������_G_RELEASE=  25731;
final static int ��������_G_PRESSING=  25732;
final static int  ��������_G_PRESSED=  25733;
final static int  ��������_G_ENTER=  25734;
final static int  ��������_G_LEAVE=  25735;

final static int ��������_H= 25740;
final static int ��������_H_RELEASE=  25741;
final static int ��������_H_PRESSING=  25742;
final static int  ��������_H_PRESSED=  25743;
final static int  ��������_H_ENTER=  25744;
final static int  ��������_H_LEAVE=  25745;

final static int ��������_I= 25750;
final static int ��������_I_RELEASE=  25751;
final static int ��������_I_PRESSING=  25752;
final static int  ��������_I_PRESSED=  25753;
final static int  ��������_I_ENTER=  25754;
final static int  ��������_I_LEAVE=  25755;

final static int ��������_J= 25760;
final static int ��������_J_RELEASE=  25761;
final static int ��������_J_PRESSING=  25762;
final static int  ��������_J_PRESSED=  25763;
final static int  ��������_J_ENTER=  25764;
final static int  ��������_J_LEAVE=  25765;

final static int ��������_K= 25770;
final static int ��������_K_RELEASE=  25771;
final static int ��������_K_PRESSING=  25772;
final static int  ��������_K_PRESSED=  25773;
final static int  ��������_K_ENTER=  25774;
final static int  ��������_K_LEAVE=  25775;

final static int ��������_L= 25780;
final static int ��������_L_RELEASE=  25781;
final static int ��������_L_PRESSING=  25782;
final static int  ��������_L_PRESSED=  25783;
final static int  ��������_L_ENTER=  25784;
final static int  ��������_L_LEAVE=  25785;

final static int ��������_M= 25790;
final static int ��������_M_RELEASE=  25791;
final static int ��������_M_PRESSING=  25792;
final static int  ��������_M_PRESSED=  25793;
final static int  ��������_M_ENTER=  25794;
final static int  ��������_M_LEAVE=  25795;

final static int ��������_N= 25800;
final static int ��������_N_RELEASE=  25801;
final static int ��������_N_PRESSING=  25802;
final static int  ��������_N_PRESSED=  25803;
final static int  ��������_N_ENTER=  25804;
final static int  ��������_N_LEAVE=  25805;

final static int ��������_O= 25810;
final static int ��������_O_RELEASE=  25811;
final static int ��������_O_PRESSING=  25812;
final static int  ��������_O_PRESSED=  25813;
final static int  ��������_O_ENTER=  25814;
final static int  ��������_O_LEAVE=  25815;

final static int ��������_P= 25820;
final static int ��������_P_RELEASE=  25821;
final static int ��������_P_PRESSING=  25822;
final static int  ��������_P_PRESSED=  25823;
final static int  ��������_P_ENTER=  25824;
final static int  ��������_P_LEAVE=  25825;

final static int ��������_Q= 25830;
final static int ��������_Q_RELEASE=  25831;
final static int ��������_Q_PRESSING=  25832;
final static int  ��������_Q_PRESSED=  25833;
final static int  ��������_Q_ENTER=  25834;
final static int  ��������_Q_LEAVE=  25835;

final static int ��������_R= 25840;
final static int ��������_R_RELEASE=  25841;
final static int ��������_R_PRESSING=  25842;
final static int  ��������_R_PRESSED=  25843;
final static int  ��������_R_ENTER=  25844;
final static int  ��������_R_LEAVE=  25845;

final static int ��������_S= 25850;
final static int ��������_S_RELEASE=  25851;
final static int ��������_S_PRESSING=  25852;
final static int  ��������_S_PRESSED=  25853;
final static int  ��������_S_ENTER=  25854;
final static int  ��������_S_LEAVE=  25855;

final static int ��������_T= 25860;
final static int ��������_T_RELEASE=  25861;
final static int ��������_T_PRESSING=  25862;
final static int  ��������_T_PRESSED=  25863;
final static int  ��������_T_ENTER=  25864;
final static int  ��������_T_LEAVE=  25865;

final static int ��������_U= 25870;
final static int ��������_U_RELEASE=  25871;
final static int ��������_U_PRESSING=  25872;
final static int  ��������_U_PRESSED=  25873;
final static int  ��������_U_ENTER=  25874;
final static int  ��������_U_LEAVE=  25875;

final static int ��������_V= 25880;
final static int ��������_V_RELEASE=  25881;
final static int ��������_V_PRESSING=  25882;
final static int  ��������_V_PRESSED=  25883;
final static int  ��������_V_ENTER=  25884;
final static int  ��������_V_LEAVE=  25885;

final static int ��������_W= 25890;
final static int ��������_W_RELEASE=  25891;
final static int ��������_W_PRESSING=  25892;
final static int  ��������_W_PRESSED=  25893;
final static int  ��������_W_ENTER=  25894;
final static int  ��������_W_LEAVE=  25895;

final static int ��������_X= 25900;
final static int ��������_X_RELEASE=  25901;
final static int ��������_X_PRESSING=  25902;
final static int  ��������_X_PRESSED=  25903;
final static int  ��������_X_ENTER=  25904;
final static int  ��������_X_LEAVE=  25905;

final static int ��������_Y= 25910;
final static int ��������_Y_RELEASE=  25911;
final static int ��������_Y_PRESSING=  25912;
final static int  ��������_Y_PRESSED=  25913;
final static int  ��������_Y_ENTER=  25914;
final static int  ��������_Y_LEAVE=  25915;

final static int ��������_Z= 25920;
final static int ��������_Z_RELEASE=  25921;
final static int ��������_Z_PRESSING=  25922;
final static int  ��������_Z_PRESSED=  25923;
final static int  ��������_Z_ENTER=  25924;
final static int  ��������_Z_LEAVE=  25925;

final static int ��������_0= 25930;
final static int ��������_0_RELEASE=  25931;
final static int ��������_0_PRESSING=  25932;
final static int  ��������_0_PRESSED=  25933;
final static int  ��������_0_ENTER=  25934;
final static int  ��������_0_LEAVE=  25935;

final static int ��������_1= 25940;
final static int ��������_1_RELEASE=  25941;
final static int ��������_1_PRESSING=  25942;
final static int  ��������_1_PRESSED=  25943;
final static int  ��������_1_ENTER=  25944;
final static int  ��������_1_LEAVE=  25945;

final static int ��������_2= 25950;
final static int ��������_2_RELEASE=  25951;
final static int ��������_2_PRESSING=  25952;
final static int  ��������_2_PRESSED=  25953;
final static int  ��������_2_ENTER=  25954;
final static int  ��������_2_LEAVE=  25955;

final static int ��������_3= 25960;
final static int ��������_3_RELEASE=  25961;
final static int ��������_3_PRESSING=  25962;
final static int  ��������_3_PRESSED=  25963;
final static int  ��������_3_ENTER=  25964;
final static int  ��������_3_LEAVE=  25965;

final static int ��������_4= 25970;
final static int ��������_4_RELEASE=  25971;
final static int ��������_4_PRESSING=  25972;
final static int  ��������_4_PRESSED=  25973;
final static int  ��������_4_ENTER=  25974;
final static int  ��������_4_LEAVE=  25975;

final static int ��������_5= 25980;
final static int ��������_5_RELEASE=  25981;
final static int ��������_5_PRESSING=  25982;
final static int  ��������_5_PRESSED=  25983;
final static int  ��������_5_ENTER=  25984;
final static int  ��������_5_LEAVE=  25985;

final static int ��������_6= 25990;
final static int ��������_6_RELEASE=  25991;
final static int ��������_6_PRESSING=  25992;
final static int  ��������_6_PRESSED=  25993;
final static int  ��������_6_ENTER=  25994;
final static int  ��������_6_LEAVE=  25995;

final static int ��������_7= 26000;
final static int ��������_7_RELEASE=  26001;
final static int ��������_7_PRESSING=  26002;
final static int  ��������_7_PRESSED=  26003;
final static int  ��������_7_ENTER=  26004;
final static int  ��������_7_LEAVE=  26005;

final static int ��������_8= 26010;
final static int ��������_8_RELEASE=  26011;
final static int ��������_8_PRESSING=  26012;
final static int  ��������_8_PRESSED=  26013;
final static int  ��������_8_ENTER=  26014;
final static int  ��������_8_LEAVE=  26015;

final static int ��������_9= 26020;
final static int ��������_9_RELEASE=  26021;
final static int ��������_9_PRESSING=  26022;
final static int  ��������_9_PRESSED=  26023;
final static int  ��������_9_ENTER=  26024;
final static int  ��������_9_LEAVE=  26025;


public ��������_Event() {
      actionMap.putInt("��ҳ",��������_��ҳ);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("A",��������_A);
      actionMap.putInt("B",��������_B);
      actionMap.putInt("C",��������_C);
      actionMap.putInt("D",��������_D);
      actionMap.putInt("E",��������_E);
      actionMap.putInt("F",��������_F);
      actionMap.putInt("G",��������_G);
      actionMap.putInt("H",��������_H);
      actionMap.putInt("I",��������_I);
      actionMap.putInt("J",��������_J);
      actionMap.putInt("K",��������_K);
      actionMap.putInt("L",��������_L);
      actionMap.putInt("M",��������_M);
      actionMap.putInt("N",��������_N);
      actionMap.putInt("O",��������_O);
      actionMap.putInt("P",��������_P);
      actionMap.putInt("Q",��������_Q);
      actionMap.putInt("R",��������_R);
      actionMap.putInt("S",��������_S);
      actionMap.putInt("T",��������_T);
      actionMap.putInt("U",��������_U);
      actionMap.putInt("V",��������_V);
      actionMap.putInt("W",��������_W);
      actionMap.putInt("X",��������_X);
      actionMap.putInt("Y",��������_Y);
      actionMap.putInt("Z",��������_Z);
      actionMap.putInt("0",��������_0);
      actionMap.putInt("1",��������_1);
      actionMap.putInt("2",��������_2);
      actionMap.putInt("3",��������_3);
      actionMap.putInt("4",��������_4);
      actionMap.putInt("5",��������_5);
      actionMap.putInt("6",��������_6);
      actionMap.putInt("7",��������_7);
      actionMap.putInt("8",��������_8);
      actionMap.putInt("9",��������_9);
	STATE= changeState(STATE,ST_��������);
	setBindScreen(new Screen_��������(),SCRN_��������);
}

public String getScreenName(){
	return  "��������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��������){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_A_RELEASE){
				_F_KEYDOWN("A",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_B_RELEASE){
				_F_KEYDOWN("B",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_C_RELEASE){
				_F_KEYDOWN("C",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_D_RELEASE){
				_F_KEYDOWN("D",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_E_RELEASE){
				_F_KEYDOWN("E",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_F_RELEASE){
				_F_KEYDOWN("F",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_G_RELEASE){
				_F_KEYDOWN("G",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_H_RELEASE){
				_F_KEYDOWN("H",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_I_RELEASE){
				_F_KEYDOWN("I",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_J_RELEASE){
				_F_KEYDOWN("J",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_K_RELEASE){
				_F_KEYDOWN("K",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_L_RELEASE){
				_F_KEYDOWN("L",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_M_RELEASE){
				_F_KEYDOWN("M",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_N_RELEASE){
				_F_KEYDOWN("N",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_O_RELEASE){
				_F_KEYDOWN("O",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_P_RELEASE){
				_F_KEYDOWN("P",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_Q_RELEASE){
				_F_KEYDOWN("Q",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_R_RELEASE){
				_F_KEYDOWN("R",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_S_RELEASE){
				_F_KEYDOWN("S",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_T_RELEASE){
				_F_KEYDOWN("T",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_U_RELEASE){
				_F_KEYDOWN("U",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_V_RELEASE){
				_F_KEYDOWN("V",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_W_RELEASE){
				_F_KEYDOWN("W",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_X_RELEASE){
				_F_KEYDOWN("X",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_Y_RELEASE){
				_F_KEYDOWN("Y",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_Z_RELEASE){
				_F_KEYDOWN("Z",msg);
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_0_RELEASE){
				_F_KEYDOWN("0",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_1_RELEASE){
				_F_KEYDOWN("1",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_2_RELEASE){
				_F_KEYDOWN("2",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_3_RELEASE){
				_F_KEYDOWN("3",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_4_RELEASE){
				_F_KEYDOWN("4",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_5_RELEASE){
				_F_KEYDOWN("5",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_6_RELEASE){
				_F_KEYDOWN("6",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_7_RELEASE){
				_F_KEYDOWN("7",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_8_RELEASE){
				_F_KEYDOWN("8",msg);
				;
				;
				;
				;
				;
				;
				msg.setComsumered();
			}
			if(msg.wParam==��������_9_RELEASE){
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
