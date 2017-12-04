package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_À¶ÑÀ;
public abstract class À¶ÑÀ_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_É¾³ý(MSG_ZHW msg);
   public abstract void _F_É¾³ýÈ«²¿(MSG_ZHW msg);
   public abstract void _F_ÖØ²¦(MSG_ZHW msg);
   public abstract void _F_½ÓÌý_²¦´ò(MSG_ZHW msg);
   public abstract void _F_¹Ò¶Ï(MSG_ZHW msg);
   public abstract void _F_ÇÐ»»(MSG_ZHW msg);
   public abstract void _F_¶Ï¿ªÁ¬½Ó(MSG_ZHW msg);
   public abstract void _F_À¶ÑÀÒôÀÖ(MSG_ZHW msg);
   public abstract void _F_µç»°±¾(MSG_ZHW msg);
   public abstract void _F_Í¨»°¼ÇÂ¼(MSG_ZHW msg);
   public abstract void _F_Á¬½Ó(MSG_ZHW msg);
   public abstract void _F_ÉèÖÃ(MSG_ZHW msg);
   public abstract void _F_BTM(MSG_ZHW msg);
   public abstract void _F_SEARCH(MSG_ZHW msg);
   public abstract void _F_TIMMER(MSG_ZHW msg);
   public abstract void _F_INIT_BT(MSG_ZHW msg);
   public abstract void _F_GET_TEL_NO(MSG_ZHW msg);
   public abstract void _F_TOMAIN(MSG_ZHW msg);
     final static int ST_À¶ÑÀ_NORMAL= 3002;
boolean IS_ST_À¶ÑÀ_NORMAL(){ return ST_À¶ÑÀ_NORMAL==STATE;}
final static int À¶ÑÀ_·µ»ØÖ÷½çÃæ= 20040;
final static int À¶ÑÀ_·µ»ØÖ÷½çÃæ_RELEASE=  20041;
final static int À¶ÑÀ_·µ»ØÖ÷½çÃæ_PRESSING=  20042;
final static int  À¶ÑÀ_·µ»ØÖ÷½çÃæ_PRESSED=  20043;
final static int  À¶ÑÀ_·µ»ØÖ÷½çÃæ_ENTER=  20044;
final static int  À¶ÑÀ_·µ»ØÖ÷½çÃæ_LEAVE=  20045;

final static int À¶ÑÀ_0= 20050;
final static int À¶ÑÀ_0_RELEASE=  20051;
final static int À¶ÑÀ_0_PRESSING=  20052;
final static int  À¶ÑÀ_0_PRESSED=  20053;
final static int  À¶ÑÀ_0_ENTER=  20054;
final static int  À¶ÑÀ_0_LEAVE=  20055;

final static int À¶ÑÀ_1= 20060;
final static int À¶ÑÀ_1_RELEASE=  20061;
final static int À¶ÑÀ_1_PRESSING=  20062;
final static int  À¶ÑÀ_1_PRESSED=  20063;
final static int  À¶ÑÀ_1_ENTER=  20064;
final static int  À¶ÑÀ_1_LEAVE=  20065;

final static int À¶ÑÀ_2= 20070;
final static int À¶ÑÀ_2_RELEASE=  20071;
final static int À¶ÑÀ_2_PRESSING=  20072;
final static int  À¶ÑÀ_2_PRESSED=  20073;
final static int  À¶ÑÀ_2_ENTER=  20074;
final static int  À¶ÑÀ_2_LEAVE=  20075;

final static int À¶ÑÀ_3= 20080;
final static int À¶ÑÀ_3_RELEASE=  20081;
final static int À¶ÑÀ_3_PRESSING=  20082;
final static int  À¶ÑÀ_3_PRESSED=  20083;
final static int  À¶ÑÀ_3_ENTER=  20084;
final static int  À¶ÑÀ_3_LEAVE=  20085;

final static int À¶ÑÀ_4= 20090;
final static int À¶ÑÀ_4_RELEASE=  20091;
final static int À¶ÑÀ_4_PRESSING=  20092;
final static int  À¶ÑÀ_4_PRESSED=  20093;
final static int  À¶ÑÀ_4_ENTER=  20094;
final static int  À¶ÑÀ_4_LEAVE=  20095;

final static int À¶ÑÀ_5= 20100;
final static int À¶ÑÀ_5_RELEASE=  20101;
final static int À¶ÑÀ_5_PRESSING=  20102;
final static int  À¶ÑÀ_5_PRESSED=  20103;
final static int  À¶ÑÀ_5_ENTER=  20104;
final static int  À¶ÑÀ_5_LEAVE=  20105;

final static int À¶ÑÀ_6= 20110;
final static int À¶ÑÀ_6_RELEASE=  20111;
final static int À¶ÑÀ_6_PRESSING=  20112;
final static int  À¶ÑÀ_6_PRESSED=  20113;
final static int  À¶ÑÀ_6_ENTER=  20114;
final static int  À¶ÑÀ_6_LEAVE=  20115;

final static int À¶ÑÀ_7= 20120;
final static int À¶ÑÀ_7_RELEASE=  20121;
final static int À¶ÑÀ_7_PRESSING=  20122;
final static int  À¶ÑÀ_7_PRESSED=  20123;
final static int  À¶ÑÀ_7_ENTER=  20124;
final static int  À¶ÑÀ_7_LEAVE=  20125;

final static int À¶ÑÀ_8= 20130;
final static int À¶ÑÀ_8_RELEASE=  20131;
final static int À¶ÑÀ_8_PRESSING=  20132;
final static int  À¶ÑÀ_8_PRESSED=  20133;
final static int  À¶ÑÀ_8_ENTER=  20134;
final static int  À¶ÑÀ_8_LEAVE=  20135;

final static int À¶ÑÀ_9= 20140;
final static int À¶ÑÀ_9_RELEASE=  20141;
final static int À¶ÑÀ_9_PRESSING=  20142;
final static int  À¶ÑÀ_9_PRESSED=  20143;
final static int  À¶ÑÀ_9_ENTER=  20144;
final static int  À¶ÑÀ_9_LEAVE=  20145;

final static int À¶ÑÀ_STAR= 20150;
final static int À¶ÑÀ_STAR_RELEASE=  20151;
final static int À¶ÑÀ_STAR_PRESSING=  20152;
final static int  À¶ÑÀ_STAR_PRESSED=  20153;
final static int  À¶ÑÀ_STAR_ENTER=  20154;
final static int  À¶ÑÀ_STAR_LEAVE=  20155;

final static int À¶ÑÀ_jinhao= 20160;
final static int À¶ÑÀ_jinhao_RELEASE=  20161;
final static int À¶ÑÀ_jinhao_PRESSING=  20162;
final static int  À¶ÑÀ_jinhao_PRESSED=  20163;
final static int  À¶ÑÀ_jinhao_ENTER=  20164;
final static int  À¶ÑÀ_jinhao_LEAVE=  20165;

final static int À¶ÑÀ_É¾³ý= 20170;
final static int À¶ÑÀ_É¾³ý_RELEASE=  20171;
final static int À¶ÑÀ_É¾³ý_PRESSING=  20172;
final static int  À¶ÑÀ_É¾³ý_PRESSED=  20173;
final static int  À¶ÑÀ_É¾³ý_ENTER=  20174;
final static int  À¶ÑÀ_É¾³ý_LEAVE=  20175;

final static int À¶ÑÀ_ÖØ²¦= 20180;
final static int À¶ÑÀ_ÖØ²¦_RELEASE=  20181;
final static int À¶ÑÀ_ÖØ²¦_PRESSING=  20182;
final static int  À¶ÑÀ_ÖØ²¦_PRESSED=  20183;
final static int  À¶ÑÀ_ÖØ²¦_ENTER=  20184;
final static int  À¶ÑÀ_ÖØ²¦_LEAVE=  20185;

final static int À¶ÑÀ_½ÓÌý_²¦´ò= 20190;
final static int À¶ÑÀ_½ÓÌý_²¦´ò_RELEASE=  20191;
final static int À¶ÑÀ_½ÓÌý_²¦´ò_PRESSING=  20192;
final static int  À¶ÑÀ_½ÓÌý_²¦´ò_PRESSED=  20193;
final static int  À¶ÑÀ_½ÓÌý_²¦´ò_ENTER=  20194;
final static int  À¶ÑÀ_½ÓÌý_²¦´ò_LEAVE=  20195;

final static int À¶ÑÀ_¹Ò¶Ï= 20200;
final static int À¶ÑÀ_¹Ò¶Ï_RELEASE=  20201;
final static int À¶ÑÀ_¹Ò¶Ï_PRESSING=  20202;
final static int  À¶ÑÀ_¹Ò¶Ï_PRESSED=  20203;
final static int  À¶ÑÀ_¹Ò¶Ï_ENTER=  20204;
final static int  À¶ÑÀ_¹Ò¶Ï_LEAVE=  20205;

final static int À¶ÑÀ_ÇÐ»»= 20210;
final static int À¶ÑÀ_ÇÐ»»_RELEASE=  20211;
final static int À¶ÑÀ_ÇÐ»»_PRESSING=  20212;
final static int  À¶ÑÀ_ÇÐ»»_PRESSED=  20213;
final static int  À¶ÑÀ_ÇÐ»»_ENTER=  20214;
final static int  À¶ÑÀ_ÇÐ»»_LEAVE=  20215;

final static int À¶ÑÀ_¶Ï¿ª= 20220;
final static int À¶ÑÀ_¶Ï¿ª_RELEASE=  20221;
final static int À¶ÑÀ_¶Ï¿ª_PRESSING=  20222;
final static int  À¶ÑÀ_¶Ï¿ª_PRESSED=  20223;
final static int  À¶ÑÀ_¶Ï¿ª_ENTER=  20224;
final static int  À¶ÑÀ_¶Ï¿ª_LEAVE=  20225;

final static int À¶ÑÀ_À¶ÑÀÒôÀÖ= 20230;
final static int À¶ÑÀ_À¶ÑÀÒôÀÖ_RELEASE=  20231;
final static int À¶ÑÀ_À¶ÑÀÒôÀÖ_PRESSING=  20232;
final static int  À¶ÑÀ_À¶ÑÀÒôÀÖ_PRESSED=  20233;
final static int  À¶ÑÀ_À¶ÑÀÒôÀÖ_ENTER=  20234;
final static int  À¶ÑÀ_À¶ÑÀÒôÀÖ_LEAVE=  20235;

final static int À¶ÑÀ_µç»°±¾= 20240;
final static int À¶ÑÀ_µç»°±¾_RELEASE=  20241;
final static int À¶ÑÀ_µç»°±¾_PRESSING=  20242;
final static int  À¶ÑÀ_µç»°±¾_PRESSED=  20243;
final static int  À¶ÑÀ_µç»°±¾_ENTER=  20244;
final static int  À¶ÑÀ_µç»°±¾_LEAVE=  20245;

final static int À¶ÑÀ_Í¨»°¼ÇÂ¼= 20250;
final static int À¶ÑÀ_Í¨»°¼ÇÂ¼_RELEASE=  20251;
final static int À¶ÑÀ_Í¨»°¼ÇÂ¼_PRESSING=  20252;
final static int  À¶ÑÀ_Í¨»°¼ÇÂ¼_PRESSED=  20253;
final static int  À¶ÑÀ_Í¨»°¼ÇÂ¼_ENTER=  20254;
final static int  À¶ÑÀ_Í¨»°¼ÇÂ¼_LEAVE=  20255;

final static int À¶ÑÀ_Á¬½Ó= 20260;
final static int À¶ÑÀ_Á¬½Ó_RELEASE=  20261;
final static int À¶ÑÀ_Á¬½Ó_PRESSING=  20262;
final static int  À¶ÑÀ_Á¬½Ó_PRESSED=  20263;
final static int  À¶ÑÀ_Á¬½Ó_ENTER=  20264;
final static int  À¶ÑÀ_Á¬½Ó_LEAVE=  20265;

final static int À¶ÑÀ_ÉèÖÃ= 20270;
final static int À¶ÑÀ_ÉèÖÃ_RELEASE=  20271;
final static int À¶ÑÀ_ÉèÖÃ_PRESSING=  20272;
final static int  À¶ÑÀ_ÉèÖÃ_PRESSED=  20273;
final static int  À¶ÑÀ_ÉèÖÃ_ENTER=  20274;
final static int  À¶ÑÀ_ÉèÖÃ_LEAVE=  20275;

final static int À¶ÑÀ_À¶ÑÀ= 20280;
final static int À¶ÑÀ_À¶ÑÀ_RELEASE=  20281;
final static int À¶ÑÀ_À¶ÑÀ_PRESSING=  20282;
final static int  À¶ÑÀ_À¶ÑÀ_PRESSED=  20283;
final static int  À¶ÑÀ_À¶ÑÀ_ENTER=  20284;
final static int  À¶ÑÀ_À¶ÑÀ_LEAVE=  20285;

final static int À¶ÑÀ_ÊÕË÷= 20290;
final static int À¶ÑÀ_ÊÕË÷_RELEASE=  20291;
final static int À¶ÑÀ_ÊÕË÷_PRESSING=  20292;
final static int  À¶ÑÀ_ÊÕË÷_PRESSED=  20293;
final static int  À¶ÑÀ_ÊÕË÷_ENTER=  20294;
final static int  À¶ÑÀ_ÊÕË÷_LEAVE=  20295;

final static int À¶ÑÀ_Ö÷Ò³= 20300;
final static int À¶ÑÀ_Ö÷Ò³_RELEASE=  20301;
final static int À¶ÑÀ_Ö÷Ò³_PRESSING=  20302;
final static int  À¶ÑÀ_Ö÷Ò³_PRESSED=  20303;
final static int  À¶ÑÀ_Ö÷Ò³_ENTER=  20304;
final static int  À¶ÑÀ_Ö÷Ò³_LEAVE=  20305;


public À¶ÑÀ_Event() {
      actionMap.putInt("·µ»ØÖ÷½çÃæ",À¶ÑÀ_·µ»ØÖ÷½çÃæ);
      actionMap.putInt("0",À¶ÑÀ_0);
      actionMap.putInt("1",À¶ÑÀ_1);
      actionMap.putInt("2",À¶ÑÀ_2);
      actionMap.putInt("3",À¶ÑÀ_3);
      actionMap.putInt("4",À¶ÑÀ_4);
      actionMap.putInt("5",À¶ÑÀ_5);
      actionMap.putInt("6",À¶ÑÀ_6);
      actionMap.putInt("7",À¶ÑÀ_7);
      actionMap.putInt("8",À¶ÑÀ_8);
      actionMap.putInt("9",À¶ÑÀ_9);
      actionMap.putInt("STAR",À¶ÑÀ_STAR);
      actionMap.putInt("jinhao",À¶ÑÀ_jinhao);
      actionMap.putInt("É¾³ý",À¶ÑÀ_É¾³ý);
      actionMap.putInt("ÖØ²¦",À¶ÑÀ_ÖØ²¦);
      actionMap.putInt("½ÓÌý_²¦´ò",À¶ÑÀ_½ÓÌý_²¦´ò);
      actionMap.putInt("¹Ò¶Ï",À¶ÑÀ_¹Ò¶Ï);
      actionMap.putInt("ÇÐ»»",À¶ÑÀ_ÇÐ»»);
      actionMap.putInt("¶Ï¿ª",À¶ÑÀ_¶Ï¿ª);
      actionMap.putInt("À¶ÑÀÒôÀÖ",À¶ÑÀ_À¶ÑÀÒôÀÖ);
      actionMap.putInt("µç»°±¾",À¶ÑÀ_µç»°±¾);
      actionMap.putInt("Í¨»°¼ÇÂ¼",À¶ÑÀ_Í¨»°¼ÇÂ¼);
      actionMap.putInt("Á¬½Ó",À¶ÑÀ_Á¬½Ó);
      actionMap.putInt("ÉèÖÃ",À¶ÑÀ_ÉèÖÃ);
      actionMap.putInt("À¶ÑÀ",À¶ÑÀ_À¶ÑÀ);
      actionMap.putInt("ÊÕË÷",À¶ÑÀ_ÊÕË÷);
      actionMap.putInt("Ö÷Ò³",À¶ÑÀ_Ö÷Ò³);
	STATE= changeState(STATE,ST_À¶ÑÀ_NORMAL);
	setBindScreen(new Screen_À¶ÑÀ(),SCRN_À¶ÑÀ);
}

public String getScreenName(){
	return  "À¶ÑÀ";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_À¶ÑÀ_NORMAL){
			if(msg.wParam==À¶ÑÀ_·µ»ØÖ÷½çÃæ_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_0_RELEASE){
				_F_PRESSED("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_1_RELEASE){
				_F_PRESSED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_2_RELEASE){
				_F_PRESSED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_3_RELEASE){
				_F_PRESSED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_4_RELEASE){
				_F_PRESSED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_5_RELEASE){
				_F_PRESSED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_6_RELEASE){
				_F_PRESSED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_7_RELEASE){
				_F_PRESSED("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_8_RELEASE){
				_F_PRESSED("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_9_RELEASE){
				_F_PRESSED("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_STAR_RELEASE){
				_F_PRESSED("*",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_jinhao_RELEASE){
				_F_PRESSED("#",msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_É¾³ý_RELEASE){
				_F_É¾³ý(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_É¾³ý_PRESSING){
				_F_É¾³ýÈ«²¿(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_ÖØ²¦_RELEASE){
				_F_ÖØ²¦(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_½ÓÌý_²¦´ò_RELEASE){
				_F_½ÓÌý_²¦´ò(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_½ÓÌý_²¦´ò_PRESSING){
				_F_ÖØ²¦(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_¹Ò¶Ï_RELEASE){
				_F_¹Ò¶Ï(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_ÇÐ»»_RELEASE){
				_F_ÇÐ»»(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_¶Ï¿ª_RELEASE){
				_F_¶Ï¿ªÁ¬½Ó(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_À¶ÑÀÒôÀÖ_RELEASE){
				_F_À¶ÑÀÒôÀÖ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_µç»°±¾_RELEASE){
				_F_µç»°±¾(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_Í¨»°¼ÇÂ¼_RELEASE){
				_F_Í¨»°¼ÇÂ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_Á¬½Ó_RELEASE){
				_F_Á¬½Ó(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_ÉèÖÃ_RELEASE){
				_F_ÉèÖÃ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_À¶ÑÀ_RELEASE){
				_F_BTM(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_ÊÕË÷_RELEASE){
				_F_SEARCH(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_GET_TEL_NO){
				_F_GET_TEL_NO(msg);
				msg.setComsumered();
			}
			if(msg.wParam==À¶ÑÀ_Ö÷Ò³_RELEASE){
				_F_TOMAIN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
