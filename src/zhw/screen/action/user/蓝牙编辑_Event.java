package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_À¶ÑÀ±à¼­;
public abstract class À¶ÑÀ±à¼­_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_Ö÷Ò³(MSG_ZHW msg);
   public abstract void _F_·µ»Ø(MSG_ZHW msg);
   public abstract void _F_Ãû³Æ(MSG_ZHW msg);
   public abstract void _F_ÃÜÂë(MSG_ZHW msg);
   public abstract void _F_»ØÍË(MSG_ZHW msg);
   public abstract void _F_KEYDOWN(String a,MSG_ZHW msg);
     final static int ST_À¶ÑÀ±à¼­= 3059;
boolean IS_ST_À¶ÑÀ±à¼­(){ return ST_À¶ÑÀ±à¼­==STATE;}
final static int À¶ÑÀ±à¼­_Ö÷Ò³= 25230;
final static int À¶ÑÀ±à¼­_Ö÷Ò³_RELEASE=  25231;
final static int À¶ÑÀ±à¼­_Ö÷Ò³_PRESSING=  25232;
final static int  À¶ÑÀ±à¼­_Ö÷Ò³_PRESSED=  25233;
final static int  À¶ÑÀ±à¼­_Ö÷Ò³_ENTER=  25234;
final static int  À¶ÑÀ±à¼­_Ö÷Ò³_LEAVE=  25235;

final static int À¶ÑÀ±à¼­_·µ»Ø= 25240;
final static int À¶ÑÀ±à¼­_·µ»Ø_RELEASE=  25241;
final static int À¶ÑÀ±à¼­_·µ»Ø_PRESSING=  25242;
final static int  À¶ÑÀ±à¼­_·µ»Ø_PRESSED=  25243;
final static int  À¶ÑÀ±à¼­_·µ»Ø_ENTER=  25244;
final static int  À¶ÑÀ±à¼­_·µ»Ø_LEAVE=  25245;

final static int À¶ÑÀ±à¼­_Ãû³Æ= 25250;
final static int À¶ÑÀ±à¼­_Ãû³Æ_RELEASE=  25251;
final static int À¶ÑÀ±à¼­_Ãû³Æ_PRESSING=  25252;
final static int  À¶ÑÀ±à¼­_Ãû³Æ_PRESSED=  25253;
final static int  À¶ÑÀ±à¼­_Ãû³Æ_ENTER=  25254;
final static int  À¶ÑÀ±à¼­_Ãû³Æ_LEAVE=  25255;

final static int À¶ÑÀ±à¼­_ÃÜÂë= 25260;
final static int À¶ÑÀ±à¼­_ÃÜÂë_RELEASE=  25261;
final static int À¶ÑÀ±à¼­_ÃÜÂë_PRESSING=  25262;
final static int  À¶ÑÀ±à¼­_ÃÜÂë_PRESSED=  25263;
final static int  À¶ÑÀ±à¼­_ÃÜÂë_ENTER=  25264;
final static int  À¶ÑÀ±à¼­_ÃÜÂë_LEAVE=  25265;

final static int À¶ÑÀ±à¼­_»ØÍË= 25270;
final static int À¶ÑÀ±à¼­_»ØÍË_RELEASE=  25271;
final static int À¶ÑÀ±à¼­_»ØÍË_PRESSING=  25272;
final static int  À¶ÑÀ±à¼­_»ØÍË_PRESSED=  25273;
final static int  À¶ÑÀ±à¼­_»ØÍË_ENTER=  25274;
final static int  À¶ÑÀ±à¼­_»ØÍË_LEAVE=  25275;

final static int À¶ÑÀ±à¼­_0= 25280;
final static int À¶ÑÀ±à¼­_0_RELEASE=  25281;
final static int À¶ÑÀ±à¼­_0_PRESSING=  25282;
final static int  À¶ÑÀ±à¼­_0_PRESSED=  25283;
final static int  À¶ÑÀ±à¼­_0_ENTER=  25284;
final static int  À¶ÑÀ±à¼­_0_LEAVE=  25285;

final static int À¶ÑÀ±à¼­_1= 25290;
final static int À¶ÑÀ±à¼­_1_RELEASE=  25291;
final static int À¶ÑÀ±à¼­_1_PRESSING=  25292;
final static int  À¶ÑÀ±à¼­_1_PRESSED=  25293;
final static int  À¶ÑÀ±à¼­_1_ENTER=  25294;
final static int  À¶ÑÀ±à¼­_1_LEAVE=  25295;

final static int À¶ÑÀ±à¼­_2= 25300;
final static int À¶ÑÀ±à¼­_2_RELEASE=  25301;
final static int À¶ÑÀ±à¼­_2_PRESSING=  25302;
final static int  À¶ÑÀ±à¼­_2_PRESSED=  25303;
final static int  À¶ÑÀ±à¼­_2_ENTER=  25304;
final static int  À¶ÑÀ±à¼­_2_LEAVE=  25305;

final static int À¶ÑÀ±à¼­_3= 25310;
final static int À¶ÑÀ±à¼­_3_RELEASE=  25311;
final static int À¶ÑÀ±à¼­_3_PRESSING=  25312;
final static int  À¶ÑÀ±à¼­_3_PRESSED=  25313;
final static int  À¶ÑÀ±à¼­_3_ENTER=  25314;
final static int  À¶ÑÀ±à¼­_3_LEAVE=  25315;

final static int À¶ÑÀ±à¼­_4= 25320;
final static int À¶ÑÀ±à¼­_4_RELEASE=  25321;
final static int À¶ÑÀ±à¼­_4_PRESSING=  25322;
final static int  À¶ÑÀ±à¼­_4_PRESSED=  25323;
final static int  À¶ÑÀ±à¼­_4_ENTER=  25324;
final static int  À¶ÑÀ±à¼­_4_LEAVE=  25325;

final static int À¶ÑÀ±à¼­_5= 25330;
final static int À¶ÑÀ±à¼­_5_RELEASE=  25331;
final static int À¶ÑÀ±à¼­_5_PRESSING=  25332;
final static int  À¶ÑÀ±à¼­_5_PRESSED=  25333;
final static int  À¶ÑÀ±à¼­_5_ENTER=  25334;
final static int  À¶ÑÀ±à¼­_5_LEAVE=  25335;

final static int À¶ÑÀ±à¼­_6= 25340;
final static int À¶ÑÀ±à¼­_6_RELEASE=  25341;
final static int À¶ÑÀ±à¼­_6_PRESSING=  25342;
final static int  À¶ÑÀ±à¼­_6_PRESSED=  25343;
final static int  À¶ÑÀ±à¼­_6_ENTER=  25344;
final static int  À¶ÑÀ±à¼­_6_LEAVE=  25345;

final static int À¶ÑÀ±à¼­_7= 25350;
final static int À¶ÑÀ±à¼­_7_RELEASE=  25351;
final static int À¶ÑÀ±à¼­_7_PRESSING=  25352;
final static int  À¶ÑÀ±à¼­_7_PRESSED=  25353;
final static int  À¶ÑÀ±à¼­_7_ENTER=  25354;
final static int  À¶ÑÀ±à¼­_7_LEAVE=  25355;

final static int À¶ÑÀ±à¼­_8= 25360;
final static int À¶ÑÀ±à¼­_8_RELEASE=  25361;
final static int À¶ÑÀ±à¼­_8_PRESSING=  25362;
final static int  À¶ÑÀ±à¼­_8_PRESSED=  25363;
final static int  À¶ÑÀ±à¼­_8_ENTER=  25364;
final static int  À¶ÑÀ±à¼­_8_LEAVE=  25365;

final static int À¶ÑÀ±à¼­_9= 25370;
final static int À¶ÑÀ±à¼­_9_RELEASE=  25371;
final static int À¶ÑÀ±à¼­_9_PRESSING=  25372;
final static int  À¶ÑÀ±à¼­_9_PRESSED=  25373;
final static int  À¶ÑÀ±à¼­_9_ENTER=  25374;
final static int  À¶ÑÀ±à¼­_9_LEAVE=  25375;

final static int À¶ÑÀ±à¼­_A= 25380;
final static int À¶ÑÀ±à¼­_A_RELEASE=  25381;
final static int À¶ÑÀ±à¼­_A_PRESSING=  25382;
final static int  À¶ÑÀ±à¼­_A_PRESSED=  25383;
final static int  À¶ÑÀ±à¼­_A_ENTER=  25384;
final static int  À¶ÑÀ±à¼­_A_LEAVE=  25385;

final static int À¶ÑÀ±à¼­_B= 25390;
final static int À¶ÑÀ±à¼­_B_RELEASE=  25391;
final static int À¶ÑÀ±à¼­_B_PRESSING=  25392;
final static int  À¶ÑÀ±à¼­_B_PRESSED=  25393;
final static int  À¶ÑÀ±à¼­_B_ENTER=  25394;
final static int  À¶ÑÀ±à¼­_B_LEAVE=  25395;

final static int À¶ÑÀ±à¼­_C= 25400;
final static int À¶ÑÀ±à¼­_C_RELEASE=  25401;
final static int À¶ÑÀ±à¼­_C_PRESSING=  25402;
final static int  À¶ÑÀ±à¼­_C_PRESSED=  25403;
final static int  À¶ÑÀ±à¼­_C_ENTER=  25404;
final static int  À¶ÑÀ±à¼­_C_LEAVE=  25405;

final static int À¶ÑÀ±à¼­_D= 25410;
final static int À¶ÑÀ±à¼­_D_RELEASE=  25411;
final static int À¶ÑÀ±à¼­_D_PRESSING=  25412;
final static int  À¶ÑÀ±à¼­_D_PRESSED=  25413;
final static int  À¶ÑÀ±à¼­_D_ENTER=  25414;
final static int  À¶ÑÀ±à¼­_D_LEAVE=  25415;

final static int À¶ÑÀ±à¼­_E= 25420;
final static int À¶ÑÀ±à¼­_E_RELEASE=  25421;
final static int À¶ÑÀ±à¼­_E_PRESSING=  25422;
final static int  À¶ÑÀ±à¼­_E_PRESSED=  25423;
final static int  À¶ÑÀ±à¼­_E_ENTER=  25424;
final static int  À¶ÑÀ±à¼­_E_LEAVE=  25425;

final static int À¶ÑÀ±à¼­_F= 25430;
final static int À¶ÑÀ±à¼­_F_RELEASE=  25431;
final static int À¶ÑÀ±à¼­_F_PRESSING=  25432;
final static int  À¶ÑÀ±à¼­_F_PRESSED=  25433;
final static int  À¶ÑÀ±à¼­_F_ENTER=  25434;
final static int  À¶ÑÀ±à¼­_F_LEAVE=  25435;

final static int À¶ÑÀ±à¼­_G= 25440;
final static int À¶ÑÀ±à¼­_G_RELEASE=  25441;
final static int À¶ÑÀ±à¼­_G_PRESSING=  25442;
final static int  À¶ÑÀ±à¼­_G_PRESSED=  25443;
final static int  À¶ÑÀ±à¼­_G_ENTER=  25444;
final static int  À¶ÑÀ±à¼­_G_LEAVE=  25445;

final static int À¶ÑÀ±à¼­_H= 25450;
final static int À¶ÑÀ±à¼­_H_RELEASE=  25451;
final static int À¶ÑÀ±à¼­_H_PRESSING=  25452;
final static int  À¶ÑÀ±à¼­_H_PRESSED=  25453;
final static int  À¶ÑÀ±à¼­_H_ENTER=  25454;
final static int  À¶ÑÀ±à¼­_H_LEAVE=  25455;

final static int À¶ÑÀ±à¼­_I= 25460;
final static int À¶ÑÀ±à¼­_I_RELEASE=  25461;
final static int À¶ÑÀ±à¼­_I_PRESSING=  25462;
final static int  À¶ÑÀ±à¼­_I_PRESSED=  25463;
final static int  À¶ÑÀ±à¼­_I_ENTER=  25464;
final static int  À¶ÑÀ±à¼­_I_LEAVE=  25465;

final static int À¶ÑÀ±à¼­_J= 25470;
final static int À¶ÑÀ±à¼­_J_RELEASE=  25471;
final static int À¶ÑÀ±à¼­_J_PRESSING=  25472;
final static int  À¶ÑÀ±à¼­_J_PRESSED=  25473;
final static int  À¶ÑÀ±à¼­_J_ENTER=  25474;
final static int  À¶ÑÀ±à¼­_J_LEAVE=  25475;

final static int À¶ÑÀ±à¼­_K= 25480;
final static int À¶ÑÀ±à¼­_K_RELEASE=  25481;
final static int À¶ÑÀ±à¼­_K_PRESSING=  25482;
final static int  À¶ÑÀ±à¼­_K_PRESSED=  25483;
final static int  À¶ÑÀ±à¼­_K_ENTER=  25484;
final static int  À¶ÑÀ±à¼­_K_LEAVE=  25485;

final static int À¶ÑÀ±à¼­_L= 25490;
final static int À¶ÑÀ±à¼­_L_RELEASE=  25491;
final static int À¶ÑÀ±à¼­_L_PRESSING=  25492;
final static int  À¶ÑÀ±à¼­_L_PRESSED=  25493;
final static int  À¶ÑÀ±à¼­_L_ENTER=  25494;
final static int  À¶ÑÀ±à¼­_L_LEAVE=  25495;

final static int À¶ÑÀ±à¼­_M= 25500;
final static int À¶ÑÀ±à¼­_M_RELEASE=  25501;
final static int À¶ÑÀ±à¼­_M_PRESSING=  25502;
final static int  À¶ÑÀ±à¼­_M_PRESSED=  25503;
final static int  À¶ÑÀ±à¼­_M_ENTER=  25504;
final static int  À¶ÑÀ±à¼­_M_LEAVE=  25505;

final static int À¶ÑÀ±à¼­_N= 25510;
final static int À¶ÑÀ±à¼­_N_RELEASE=  25511;
final static int À¶ÑÀ±à¼­_N_PRESSING=  25512;
final static int  À¶ÑÀ±à¼­_N_PRESSED=  25513;
final static int  À¶ÑÀ±à¼­_N_ENTER=  25514;
final static int  À¶ÑÀ±à¼­_N_LEAVE=  25515;

final static int À¶ÑÀ±à¼­_O= 25520;
final static int À¶ÑÀ±à¼­_O_RELEASE=  25521;
final static int À¶ÑÀ±à¼­_O_PRESSING=  25522;
final static int  À¶ÑÀ±à¼­_O_PRESSED=  25523;
final static int  À¶ÑÀ±à¼­_O_ENTER=  25524;
final static int  À¶ÑÀ±à¼­_O_LEAVE=  25525;

final static int À¶ÑÀ±à¼­_P= 25530;
final static int À¶ÑÀ±à¼­_P_RELEASE=  25531;
final static int À¶ÑÀ±à¼­_P_PRESSING=  25532;
final static int  À¶ÑÀ±à¼­_P_PRESSED=  25533;
final static int  À¶ÑÀ±à¼­_P_ENTER=  25534;
final static int  À¶ÑÀ±à¼­_P_LEAVE=  25535;

final static int À¶ÑÀ±à¼­_Q= 25540;
final static int À¶ÑÀ±à¼­_Q_RELEASE=  25541;
final static int À¶ÑÀ±à¼­_Q_PRESSING=  25542;
final static int  À¶ÑÀ±à¼­_Q_PRESSED=  25543;
final static int  À¶ÑÀ±à¼­_Q_ENTER=  25544;
final static int  À¶ÑÀ±à¼­_Q_LEAVE=  25545;

final static int À¶ÑÀ±à¼­_R= 25550;
final static int À¶ÑÀ±à¼­_R_RELEASE=  25551;
final static int À¶ÑÀ±à¼­_R_PRESSING=  25552;
final static int  À¶ÑÀ±à¼­_R_PRESSED=  25553;
final static int  À¶ÑÀ±à¼­_R_ENTER=  25554;
final static int  À¶ÑÀ±à¼­_R_LEAVE=  25555;

final static int À¶ÑÀ±à¼­_S= 25560;
final static int À¶ÑÀ±à¼­_S_RELEASE=  25561;
final static int À¶ÑÀ±à¼­_S_PRESSING=  25562;
final static int  À¶ÑÀ±à¼­_S_PRESSED=  25563;
final static int  À¶ÑÀ±à¼­_S_ENTER=  25564;
final static int  À¶ÑÀ±à¼­_S_LEAVE=  25565;

final static int À¶ÑÀ±à¼­_T= 25570;
final static int À¶ÑÀ±à¼­_T_RELEASE=  25571;
final static int À¶ÑÀ±à¼­_T_PRESSING=  25572;
final static int  À¶ÑÀ±à¼­_T_PRESSED=  25573;
final static int  À¶ÑÀ±à¼­_T_ENTER=  25574;
final static int  À¶ÑÀ±à¼­_T_LEAVE=  25575;

final static int À¶ÑÀ±à¼­_U= 25580;
final static int À¶ÑÀ±à¼­_U_RELEASE=  25581;
final static int À¶ÑÀ±à¼­_U_PRESSING=  25582;
final static int  À¶ÑÀ±à¼­_U_PRESSED=  25583;
final static int  À¶ÑÀ±à¼­_U_ENTER=  25584;
final static int  À¶ÑÀ±à¼­_U_LEAVE=  25585;

final static int À¶ÑÀ±à¼­_V= 25590;
final static int À¶ÑÀ±à¼­_V_RELEASE=  25591;
final static int À¶ÑÀ±à¼­_V_PRESSING=  25592;
final static int  À¶ÑÀ±à¼­_V_PRESSED=  25593;
final static int  À¶ÑÀ±à¼­_V_ENTER=  25594;
final static int  À¶ÑÀ±à¼­_V_LEAVE=  25595;

final static int À¶ÑÀ±à¼­_W= 25600;
final static int À¶ÑÀ±à¼­_W_RELEASE=  25601;
final static int À¶ÑÀ±à¼­_W_PRESSING=  25602;
final static int  À¶ÑÀ±à¼­_W_PRESSED=  25603;
final static int  À¶ÑÀ±à¼­_W_ENTER=  25604;
final static int  À¶ÑÀ±à¼­_W_LEAVE=  25605;

final static int À¶ÑÀ±à¼­_X= 25610;
final static int À¶ÑÀ±à¼­_X_RELEASE=  25611;
final static int À¶ÑÀ±à¼­_X_PRESSING=  25612;
final static int  À¶ÑÀ±à¼­_X_PRESSED=  25613;
final static int  À¶ÑÀ±à¼­_X_ENTER=  25614;
final static int  À¶ÑÀ±à¼­_X_LEAVE=  25615;

final static int À¶ÑÀ±à¼­_Y= 25620;
final static int À¶ÑÀ±à¼­_Y_RELEASE=  25621;
final static int À¶ÑÀ±à¼­_Y_PRESSING=  25622;
final static int  À¶ÑÀ±à¼­_Y_PRESSED=  25623;
final static int  À¶ÑÀ±à¼­_Y_ENTER=  25624;
final static int  À¶ÑÀ±à¼­_Y_LEAVE=  25625;

final static int À¶ÑÀ±à¼­_Z= 25630;
final static int À¶ÑÀ±à¼­_Z_RELEASE=  25631;
final static int À¶ÑÀ±à¼­_Z_PRESSING=  25632;
final static int  À¶ÑÀ±à¼­_Z_PRESSED=  25633;
final static int  À¶ÑÀ±à¼­_Z_ENTER=  25634;
final static int  À¶ÑÀ±à¼­_Z_LEAVE=  25635;


public À¶ÑÀ±à¼­_Event() {
      actionMap.putInt("Ö÷Ò³",À¶ÑÀ±à¼­_Ö÷Ò³);
      actionMap.putInt("·µ»Ø",À¶ÑÀ±à¼­_·µ»Ø);
      actionMap.putInt("Ãû³Æ",À¶ÑÀ±à¼­_Ãû³Æ);
      actionMap.putInt("ÃÜÂë",À¶ÑÀ±à¼­_ÃÜÂë);
      actionMap.putInt("»ØÍË",À¶ÑÀ±à¼­_»ØÍË);
      actionMap.putInt("0",À¶ÑÀ±à¼­_0);
      actionMap.putInt("1",À¶ÑÀ±à¼­_1);
      actionMap.putInt("2",À¶ÑÀ±à¼­_2);
      actionMap.putInt("3",À¶ÑÀ±à¼­_3);
      actionMap.putInt("4",À¶ÑÀ±à¼­_4);
      actionMap.putInt("5",À¶ÑÀ±à¼­_5);
      actionMap.putInt("6",À¶ÑÀ±à¼­_6);
      actionMap.putInt("7",À¶ÑÀ±à¼­_7);
      actionMap.putInt("8",À¶ÑÀ±à¼­_8);
      actionMap.putInt("9",À¶ÑÀ±à¼­_9);
      actionMap.putInt("A",À¶ÑÀ±à¼­_A);
      actionMap.putInt("B",À¶ÑÀ±à¼­_B);
      actionMap.putInt("C",À¶ÑÀ±à¼­_C);
      actionMap.putInt("D",À¶ÑÀ±à¼­_D);
      actionMap.putInt("E",À¶ÑÀ±à¼­_E);
      actionMap.putInt("F",À¶ÑÀ±à¼­_F);
      actionMap.putInt("G",À¶ÑÀ±à¼­_G);
      actionMap.putInt("H",À¶ÑÀ±à¼­_H);
      actionMap.putInt("I",À¶ÑÀ±à¼­_I);
      actionMap.putInt("J",À¶ÑÀ±à¼­_J);
      actionMap.putInt("K",À¶ÑÀ±à¼­_K);
      actionMap.putInt("L",À¶ÑÀ±à¼­_L);
      actionMap.putInt("M",À¶ÑÀ±à¼­_M);
      actionMap.putInt("N",À¶ÑÀ±à¼­_N);
      actionMap.putInt("O",À¶ÑÀ±à¼­_O);
      actionMap.putInt("P",À¶ÑÀ±à¼­_P);
      actionMap.putInt("Q",À¶ÑÀ±à¼­_Q);
      actionMap.putInt("R",À¶ÑÀ±à¼­_R);
      actionMap.putInt("S",À¶ÑÀ±à¼­_S);
      actionMap.putInt("T",À¶ÑÀ±à¼­_T);
      actionMap.putInt("U",À¶ÑÀ±à¼­_U);
      actionMap.putInt("V",À¶ÑÀ±à¼­_V);
      actionMap.putInt("W",À¶ÑÀ±à¼­_W);
      actionMap.putInt("X",À¶ÑÀ±à¼­_X);
      actionMap.putInt("Y",À¶ÑÀ±à¼­_Y);
      actionMap.putInt("Z",À¶ÑÀ±à¼­_Z);
	STATE= changeState(STATE,ST_À¶ÑÀ±à¼­);
	setBindScreen(new Screen_À¶ÑÀ±à¼­(),SCRN_À¶ÑÀ±à¼­);
}

public String getScreenName(){
	return  "À¶ÑÀ±à¼­";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_À¶ÑÀ±à¼­){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_Ö÷Ò³_RELEASE){
				_F_Ö÷Ò³(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_·µ»Ø_RELEASE){
				_F_·µ»Ø(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_Ãû³Æ_RELEASE){
				_F_Ãû³Æ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_ÃÜÂë_RELEASE){
				_F_ÃÜÂë(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_»ØÍË_RELEASE){
				_F_»ØÍË(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_0_RELEASE){
				_F_KEYDOWN("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_1_RELEASE){
				_F_KEYDOWN("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_2_RELEASE){
				_F_KEYDOWN("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_3_RELEASE){
				_F_KEYDOWN("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_4_RELEASE){
				_F_KEYDOWN("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_5_RELEASE){
				_F_KEYDOWN("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_6_RELEASE){
				_F_KEYDOWN("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_7_RELEASE){
				_F_KEYDOWN("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_8_RELEASE){
				_F_KEYDOWN("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_9_RELEASE){
				_F_KEYDOWN("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_A_RELEASE){
				_F_KEYDOWN("A",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_B_RELEASE){
				_F_KEYDOWN("B",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_C_RELEASE){
				_F_KEYDOWN("C",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_D_RELEASE){
				_F_KEYDOWN("D",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_E_RELEASE){
				_F_KEYDOWN("E",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_F_RELEASE){
				_F_KEYDOWN("F",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_G_RELEASE){
				_F_KEYDOWN("G",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_H_RELEASE){
				_F_KEYDOWN("H",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_I_RELEASE){
				_F_KEYDOWN("I",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_J_RELEASE){
				_F_KEYDOWN("J",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_K_RELEASE){
				_F_KEYDOWN("K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_L_RELEASE){
				_F_KEYDOWN("L",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_M_RELEASE){
				_F_KEYDOWN("M",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_N_RELEASE){
				_F_KEYDOWN("N",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_O_RELEASE){
				_F_KEYDOWN("O",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_P_RELEASE){
				_F_KEYDOWN("P",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_Q_RELEASE){
				_F_KEYDOWN("Q",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_R_RELEASE){
				_F_KEYDOWN("R",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_S_RELEASE){
				_F_KEYDOWN("S",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_T_RELEASE){
				_F_KEYDOWN("T",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_U_RELEASE){
				_F_KEYDOWN("U",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_V_RELEASE){
				_F_KEYDOWN("V",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_W_RELEASE){
				_F_KEYDOWN("W",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_X_RELEASE){
				_F_KEYDOWN("X",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_Y_RELEASE){
				_F_KEYDOWN("Y",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ±à¼­_Z_RELEASE){
				_F_KEYDOWN("Z",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
