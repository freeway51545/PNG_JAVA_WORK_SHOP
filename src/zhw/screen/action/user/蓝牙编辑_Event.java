package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�����༭;
public abstract class �����༭_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_KEYDOWN(String a,MSG_ZHW msg);
     final static int ST_�����༭= 3059;
boolean IS_ST_�����༭(){ return ST_�����༭==STATE;}
final static int �����༭_��ҳ= 25230;
final static int �����༭_��ҳ_RELEASE=  25231;
final static int �����༭_��ҳ_PRESSING=  25232;
final static int  �����༭_��ҳ_PRESSED=  25233;
final static int  �����༭_��ҳ_ENTER=  25234;
final static int  �����༭_��ҳ_LEAVE=  25235;

final static int �����༭_����= 25240;
final static int �����༭_����_RELEASE=  25241;
final static int �����༭_����_PRESSING=  25242;
final static int  �����༭_����_PRESSED=  25243;
final static int  �����༭_����_ENTER=  25244;
final static int  �����༭_����_LEAVE=  25245;

final static int �����༭_����= 25250;
final static int �����༭_����_RELEASE=  25251;
final static int �����༭_����_PRESSING=  25252;
final static int  �����༭_����_PRESSED=  25253;
final static int  �����༭_����_ENTER=  25254;
final static int  �����༭_����_LEAVE=  25255;

final static int �����༭_����= 25260;
final static int �����༭_����_RELEASE=  25261;
final static int �����༭_����_PRESSING=  25262;
final static int  �����༭_����_PRESSED=  25263;
final static int  �����༭_����_ENTER=  25264;
final static int  �����༭_����_LEAVE=  25265;

final static int �����༭_����= 25270;
final static int �����༭_����_RELEASE=  25271;
final static int �����༭_����_PRESSING=  25272;
final static int  �����༭_����_PRESSED=  25273;
final static int  �����༭_����_ENTER=  25274;
final static int  �����༭_����_LEAVE=  25275;

final static int �����༭_0= 25280;
final static int �����༭_0_RELEASE=  25281;
final static int �����༭_0_PRESSING=  25282;
final static int  �����༭_0_PRESSED=  25283;
final static int  �����༭_0_ENTER=  25284;
final static int  �����༭_0_LEAVE=  25285;

final static int �����༭_1= 25290;
final static int �����༭_1_RELEASE=  25291;
final static int �����༭_1_PRESSING=  25292;
final static int  �����༭_1_PRESSED=  25293;
final static int  �����༭_1_ENTER=  25294;
final static int  �����༭_1_LEAVE=  25295;

final static int �����༭_2= 25300;
final static int �����༭_2_RELEASE=  25301;
final static int �����༭_2_PRESSING=  25302;
final static int  �����༭_2_PRESSED=  25303;
final static int  �����༭_2_ENTER=  25304;
final static int  �����༭_2_LEAVE=  25305;

final static int �����༭_3= 25310;
final static int �����༭_3_RELEASE=  25311;
final static int �����༭_3_PRESSING=  25312;
final static int  �����༭_3_PRESSED=  25313;
final static int  �����༭_3_ENTER=  25314;
final static int  �����༭_3_LEAVE=  25315;

final static int �����༭_4= 25320;
final static int �����༭_4_RELEASE=  25321;
final static int �����༭_4_PRESSING=  25322;
final static int  �����༭_4_PRESSED=  25323;
final static int  �����༭_4_ENTER=  25324;
final static int  �����༭_4_LEAVE=  25325;

final static int �����༭_5= 25330;
final static int �����༭_5_RELEASE=  25331;
final static int �����༭_5_PRESSING=  25332;
final static int  �����༭_5_PRESSED=  25333;
final static int  �����༭_5_ENTER=  25334;
final static int  �����༭_5_LEAVE=  25335;

final static int �����༭_6= 25340;
final static int �����༭_6_RELEASE=  25341;
final static int �����༭_6_PRESSING=  25342;
final static int  �����༭_6_PRESSED=  25343;
final static int  �����༭_6_ENTER=  25344;
final static int  �����༭_6_LEAVE=  25345;

final static int �����༭_7= 25350;
final static int �����༭_7_RELEASE=  25351;
final static int �����༭_7_PRESSING=  25352;
final static int  �����༭_7_PRESSED=  25353;
final static int  �����༭_7_ENTER=  25354;
final static int  �����༭_7_LEAVE=  25355;

final static int �����༭_8= 25360;
final static int �����༭_8_RELEASE=  25361;
final static int �����༭_8_PRESSING=  25362;
final static int  �����༭_8_PRESSED=  25363;
final static int  �����༭_8_ENTER=  25364;
final static int  �����༭_8_LEAVE=  25365;

final static int �����༭_9= 25370;
final static int �����༭_9_RELEASE=  25371;
final static int �����༭_9_PRESSING=  25372;
final static int  �����༭_9_PRESSED=  25373;
final static int  �����༭_9_ENTER=  25374;
final static int  �����༭_9_LEAVE=  25375;

final static int �����༭_A= 25380;
final static int �����༭_A_RELEASE=  25381;
final static int �����༭_A_PRESSING=  25382;
final static int  �����༭_A_PRESSED=  25383;
final static int  �����༭_A_ENTER=  25384;
final static int  �����༭_A_LEAVE=  25385;

final static int �����༭_B= 25390;
final static int �����༭_B_RELEASE=  25391;
final static int �����༭_B_PRESSING=  25392;
final static int  �����༭_B_PRESSED=  25393;
final static int  �����༭_B_ENTER=  25394;
final static int  �����༭_B_LEAVE=  25395;

final static int �����༭_C= 25400;
final static int �����༭_C_RELEASE=  25401;
final static int �����༭_C_PRESSING=  25402;
final static int  �����༭_C_PRESSED=  25403;
final static int  �����༭_C_ENTER=  25404;
final static int  �����༭_C_LEAVE=  25405;

final static int �����༭_D= 25410;
final static int �����༭_D_RELEASE=  25411;
final static int �����༭_D_PRESSING=  25412;
final static int  �����༭_D_PRESSED=  25413;
final static int  �����༭_D_ENTER=  25414;
final static int  �����༭_D_LEAVE=  25415;

final static int �����༭_E= 25420;
final static int �����༭_E_RELEASE=  25421;
final static int �����༭_E_PRESSING=  25422;
final static int  �����༭_E_PRESSED=  25423;
final static int  �����༭_E_ENTER=  25424;
final static int  �����༭_E_LEAVE=  25425;

final static int �����༭_F= 25430;
final static int �����༭_F_RELEASE=  25431;
final static int �����༭_F_PRESSING=  25432;
final static int  �����༭_F_PRESSED=  25433;
final static int  �����༭_F_ENTER=  25434;
final static int  �����༭_F_LEAVE=  25435;

final static int �����༭_G= 25440;
final static int �����༭_G_RELEASE=  25441;
final static int �����༭_G_PRESSING=  25442;
final static int  �����༭_G_PRESSED=  25443;
final static int  �����༭_G_ENTER=  25444;
final static int  �����༭_G_LEAVE=  25445;

final static int �����༭_H= 25450;
final static int �����༭_H_RELEASE=  25451;
final static int �����༭_H_PRESSING=  25452;
final static int  �����༭_H_PRESSED=  25453;
final static int  �����༭_H_ENTER=  25454;
final static int  �����༭_H_LEAVE=  25455;

final static int �����༭_I= 25460;
final static int �����༭_I_RELEASE=  25461;
final static int �����༭_I_PRESSING=  25462;
final static int  �����༭_I_PRESSED=  25463;
final static int  �����༭_I_ENTER=  25464;
final static int  �����༭_I_LEAVE=  25465;

final static int �����༭_J= 25470;
final static int �����༭_J_RELEASE=  25471;
final static int �����༭_J_PRESSING=  25472;
final static int  �����༭_J_PRESSED=  25473;
final static int  �����༭_J_ENTER=  25474;
final static int  �����༭_J_LEAVE=  25475;

final static int �����༭_K= 25480;
final static int �����༭_K_RELEASE=  25481;
final static int �����༭_K_PRESSING=  25482;
final static int  �����༭_K_PRESSED=  25483;
final static int  �����༭_K_ENTER=  25484;
final static int  �����༭_K_LEAVE=  25485;

final static int �����༭_L= 25490;
final static int �����༭_L_RELEASE=  25491;
final static int �����༭_L_PRESSING=  25492;
final static int  �����༭_L_PRESSED=  25493;
final static int  �����༭_L_ENTER=  25494;
final static int  �����༭_L_LEAVE=  25495;

final static int �����༭_M= 25500;
final static int �����༭_M_RELEASE=  25501;
final static int �����༭_M_PRESSING=  25502;
final static int  �����༭_M_PRESSED=  25503;
final static int  �����༭_M_ENTER=  25504;
final static int  �����༭_M_LEAVE=  25505;

final static int �����༭_N= 25510;
final static int �����༭_N_RELEASE=  25511;
final static int �����༭_N_PRESSING=  25512;
final static int  �����༭_N_PRESSED=  25513;
final static int  �����༭_N_ENTER=  25514;
final static int  �����༭_N_LEAVE=  25515;

final static int �����༭_O= 25520;
final static int �����༭_O_RELEASE=  25521;
final static int �����༭_O_PRESSING=  25522;
final static int  �����༭_O_PRESSED=  25523;
final static int  �����༭_O_ENTER=  25524;
final static int  �����༭_O_LEAVE=  25525;

final static int �����༭_P= 25530;
final static int �����༭_P_RELEASE=  25531;
final static int �����༭_P_PRESSING=  25532;
final static int  �����༭_P_PRESSED=  25533;
final static int  �����༭_P_ENTER=  25534;
final static int  �����༭_P_LEAVE=  25535;

final static int �����༭_Q= 25540;
final static int �����༭_Q_RELEASE=  25541;
final static int �����༭_Q_PRESSING=  25542;
final static int  �����༭_Q_PRESSED=  25543;
final static int  �����༭_Q_ENTER=  25544;
final static int  �����༭_Q_LEAVE=  25545;

final static int �����༭_R= 25550;
final static int �����༭_R_RELEASE=  25551;
final static int �����༭_R_PRESSING=  25552;
final static int  �����༭_R_PRESSED=  25553;
final static int  �����༭_R_ENTER=  25554;
final static int  �����༭_R_LEAVE=  25555;

final static int �����༭_S= 25560;
final static int �����༭_S_RELEASE=  25561;
final static int �����༭_S_PRESSING=  25562;
final static int  �����༭_S_PRESSED=  25563;
final static int  �����༭_S_ENTER=  25564;
final static int  �����༭_S_LEAVE=  25565;

final static int �����༭_T= 25570;
final static int �����༭_T_RELEASE=  25571;
final static int �����༭_T_PRESSING=  25572;
final static int  �����༭_T_PRESSED=  25573;
final static int  �����༭_T_ENTER=  25574;
final static int  �����༭_T_LEAVE=  25575;

final static int �����༭_U= 25580;
final static int �����༭_U_RELEASE=  25581;
final static int �����༭_U_PRESSING=  25582;
final static int  �����༭_U_PRESSED=  25583;
final static int  �����༭_U_ENTER=  25584;
final static int  �����༭_U_LEAVE=  25585;

final static int �����༭_V= 25590;
final static int �����༭_V_RELEASE=  25591;
final static int �����༭_V_PRESSING=  25592;
final static int  �����༭_V_PRESSED=  25593;
final static int  �����༭_V_ENTER=  25594;
final static int  �����༭_V_LEAVE=  25595;

final static int �����༭_W= 25600;
final static int �����༭_W_RELEASE=  25601;
final static int �����༭_W_PRESSING=  25602;
final static int  �����༭_W_PRESSED=  25603;
final static int  �����༭_W_ENTER=  25604;
final static int  �����༭_W_LEAVE=  25605;

final static int �����༭_X= 25610;
final static int �����༭_X_RELEASE=  25611;
final static int �����༭_X_PRESSING=  25612;
final static int  �����༭_X_PRESSED=  25613;
final static int  �����༭_X_ENTER=  25614;
final static int  �����༭_X_LEAVE=  25615;

final static int �����༭_Y= 25620;
final static int �����༭_Y_RELEASE=  25621;
final static int �����༭_Y_PRESSING=  25622;
final static int  �����༭_Y_PRESSED=  25623;
final static int  �����༭_Y_ENTER=  25624;
final static int  �����༭_Y_LEAVE=  25625;

final static int �����༭_Z= 25630;
final static int �����༭_Z_RELEASE=  25631;
final static int �����༭_Z_PRESSING=  25632;
final static int  �����༭_Z_PRESSED=  25633;
final static int  �����༭_Z_ENTER=  25634;
final static int  �����༭_Z_LEAVE=  25635;


public �����༭_Event() {
      actionMap.putInt("��ҳ",�����༭_��ҳ);
      actionMap.putInt("����",�����༭_����);
      actionMap.putInt("����",�����༭_����);
      actionMap.putInt("����",�����༭_����);
      actionMap.putInt("����",�����༭_����);
      actionMap.putInt("0",�����༭_0);
      actionMap.putInt("1",�����༭_1);
      actionMap.putInt("2",�����༭_2);
      actionMap.putInt("3",�����༭_3);
      actionMap.putInt("4",�����༭_4);
      actionMap.putInt("5",�����༭_5);
      actionMap.putInt("6",�����༭_6);
      actionMap.putInt("7",�����༭_7);
      actionMap.putInt("8",�����༭_8);
      actionMap.putInt("9",�����༭_9);
      actionMap.putInt("A",�����༭_A);
      actionMap.putInt("B",�����༭_B);
      actionMap.putInt("C",�����༭_C);
      actionMap.putInt("D",�����༭_D);
      actionMap.putInt("E",�����༭_E);
      actionMap.putInt("F",�����༭_F);
      actionMap.putInt("G",�����༭_G);
      actionMap.putInt("H",�����༭_H);
      actionMap.putInt("I",�����༭_I);
      actionMap.putInt("J",�����༭_J);
      actionMap.putInt("K",�����༭_K);
      actionMap.putInt("L",�����༭_L);
      actionMap.putInt("M",�����༭_M);
      actionMap.putInt("N",�����༭_N);
      actionMap.putInt("O",�����༭_O);
      actionMap.putInt("P",�����༭_P);
      actionMap.putInt("Q",�����༭_Q);
      actionMap.putInt("R",�����༭_R);
      actionMap.putInt("S",�����༭_S);
      actionMap.putInt("T",�����༭_T);
      actionMap.putInt("U",�����༭_U);
      actionMap.putInt("V",�����༭_V);
      actionMap.putInt("W",�����༭_W);
      actionMap.putInt("X",�����༭_X);
      actionMap.putInt("Y",�����༭_Y);
      actionMap.putInt("Z",�����༭_Z);
	STATE= changeState(STATE,ST_�����༭);
	setBindScreen(new Screen_�����༭(),SCRN_�����༭);
}

public String getScreenName(){
	return  "�����༭";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�����༭){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_0_RELEASE){
				_F_KEYDOWN("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_1_RELEASE){
				_F_KEYDOWN("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_2_RELEASE){
				_F_KEYDOWN("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_3_RELEASE){
				_F_KEYDOWN("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_4_RELEASE){
				_F_KEYDOWN("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_5_RELEASE){
				_F_KEYDOWN("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_6_RELEASE){
				_F_KEYDOWN("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_7_RELEASE){
				_F_KEYDOWN("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_8_RELEASE){
				_F_KEYDOWN("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_9_RELEASE){
				_F_KEYDOWN("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_A_RELEASE){
				_F_KEYDOWN("A",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_B_RELEASE){
				_F_KEYDOWN("B",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_C_RELEASE){
				_F_KEYDOWN("C",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_D_RELEASE){
				_F_KEYDOWN("D",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_E_RELEASE){
				_F_KEYDOWN("E",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_F_RELEASE){
				_F_KEYDOWN("F",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_G_RELEASE){
				_F_KEYDOWN("G",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_H_RELEASE){
				_F_KEYDOWN("H",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_I_RELEASE){
				_F_KEYDOWN("I",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_J_RELEASE){
				_F_KEYDOWN("J",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_K_RELEASE){
				_F_KEYDOWN("K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_L_RELEASE){
				_F_KEYDOWN("L",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_M_RELEASE){
				_F_KEYDOWN("M",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_N_RELEASE){
				_F_KEYDOWN("N",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_O_RELEASE){
				_F_KEYDOWN("O",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_P_RELEASE){
				_F_KEYDOWN("P",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_Q_RELEASE){
				_F_KEYDOWN("Q",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_R_RELEASE){
				_F_KEYDOWN("R",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_S_RELEASE){
				_F_KEYDOWN("S",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_T_RELEASE){
				_F_KEYDOWN("T",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_U_RELEASE){
				_F_KEYDOWN("U",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_V_RELEASE){
				_F_KEYDOWN("V",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_W_RELEASE){
				_F_KEYDOWN("W",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_X_RELEASE){
				_F_KEYDOWN("X",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_Y_RELEASE){
				_F_KEYDOWN("Y",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�����༭_Z_RELEASE){
				_F_KEYDOWN("Z",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
