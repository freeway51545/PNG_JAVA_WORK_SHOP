package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_车身信息;
public abstract class 车身信息_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ACTION(String a,MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
   public abstract void _F_上一页(MSG_ZHW msg);
   public abstract void _F_下一页(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_恢复默认设置(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_车身设置= 3036;
boolean IS_ST_车身设置(){ return ST_车身设置==STATE;}
final static int 车身信息_0= 23010;
final static int 车身信息_0_RELEASE=  23011;
final static int 车身信息_0_PRESSING=  23012;
final static int  车身信息_0_PRESSED=  23013;
final static int  车身信息_0_ENTER=  23014;
final static int  车身信息_0_LEAVE=  23015;

final static int 车身信息_1= 23020;
final static int 车身信息_1_RELEASE=  23021;
final static int 车身信息_1_PRESSING=  23022;
final static int  车身信息_1_PRESSED=  23023;
final static int  车身信息_1_ENTER=  23024;
final static int  车身信息_1_LEAVE=  23025;

final static int 车身信息_2= 23030;
final static int 车身信息_2_RELEASE=  23031;
final static int 车身信息_2_PRESSING=  23032;
final static int  车身信息_2_PRESSED=  23033;
final static int  车身信息_2_ENTER=  23034;
final static int  车身信息_2_LEAVE=  23035;

final static int 车身信息_3= 23040;
final static int 车身信息_3_RELEASE=  23041;
final static int 车身信息_3_PRESSING=  23042;
final static int  车身信息_3_PRESSED=  23043;
final static int  车身信息_3_ENTER=  23044;
final static int  车身信息_3_LEAVE=  23045;

final static int 车身信息_4= 23050;
final static int 车身信息_4_RELEASE=  23051;
final static int 车身信息_4_PRESSING=  23052;
final static int  车身信息_4_PRESSED=  23053;
final static int  车身信息_4_ENTER=  23054;
final static int  车身信息_4_LEAVE=  23055;

final static int 车身信息_5= 23060;
final static int 车身信息_5_RELEASE=  23061;
final static int 车身信息_5_PRESSING=  23062;
final static int  车身信息_5_PRESSED=  23063;
final static int  车身信息_5_ENTER=  23064;
final static int  车身信息_5_LEAVE=  23065;

final static int 车身信息_6= 23070;
final static int 车身信息_6_RELEASE=  23071;
final static int 车身信息_6_PRESSING=  23072;
final static int  车身信息_6_PRESSED=  23073;
final static int  车身信息_6_ENTER=  23074;
final static int  车身信息_6_LEAVE=  23075;

final static int 车身信息_7= 23080;
final static int 车身信息_7_RELEASE=  23081;
final static int 车身信息_7_PRESSING=  23082;
final static int  车身信息_7_PRESSED=  23083;
final static int  车身信息_7_ENTER=  23084;
final static int  车身信息_7_LEAVE=  23085;

final static int 车身信息_8= 23090;
final static int 车身信息_8_RELEASE=  23091;
final static int 车身信息_8_PRESSING=  23092;
final static int  车身信息_8_PRESSED=  23093;
final static int  车身信息_8_ENTER=  23094;
final static int  车身信息_8_LEAVE=  23095;

final static int 车身信息_9= 23100;
final static int 车身信息_9_RELEASE=  23101;
final static int 车身信息_9_PRESSING=  23102;
final static int  车身信息_9_PRESSED=  23103;
final static int  车身信息_9_ENTER=  23104;
final static int  车身信息_9_LEAVE=  23105;

final static int 车身信息_10= 23110;
final static int 车身信息_10_RELEASE=  23111;
final static int 车身信息_10_PRESSING=  23112;
final static int  车身信息_10_PRESSED=  23113;
final static int  车身信息_10_ENTER=  23114;
final static int  车身信息_10_LEAVE=  23115;

final static int 车身信息_11= 23120;
final static int 车身信息_11_RELEASE=  23121;
final static int 车身信息_11_PRESSING=  23122;
final static int  车身信息_11_PRESSED=  23123;
final static int  车身信息_11_ENTER=  23124;
final static int  车身信息_11_LEAVE=  23125;

final static int 车身信息_12= 23130;
final static int 车身信息_12_RELEASE=  23131;
final static int 车身信息_12_PRESSING=  23132;
final static int  车身信息_12_PRESSED=  23133;
final static int  车身信息_12_ENTER=  23134;
final static int  车身信息_12_LEAVE=  23135;

final static int 车身信息_13= 23140;
final static int 车身信息_13_RELEASE=  23141;
final static int 车身信息_13_PRESSING=  23142;
final static int  车身信息_13_PRESSED=  23143;
final static int  车身信息_13_ENTER=  23144;
final static int  车身信息_13_LEAVE=  23145;

final static int 车身信息_14= 23150;
final static int 车身信息_14_RELEASE=  23151;
final static int 车身信息_14_PRESSING=  23152;
final static int  车身信息_14_PRESSED=  23153;
final static int  车身信息_14_ENTER=  23154;
final static int  车身信息_14_LEAVE=  23155;

final static int 车身信息_15= 23160;
final static int 车身信息_15_RELEASE=  23161;
final static int 车身信息_15_PRESSING=  23162;
final static int  车身信息_15_PRESSED=  23163;
final static int  车身信息_15_ENTER=  23164;
final static int  车身信息_15_LEAVE=  23165;

final static int 车身信息_16= 23170;
final static int 车身信息_16_RELEASE=  23171;
final static int 车身信息_16_PRESSING=  23172;
final static int  车身信息_16_PRESSED=  23173;
final static int  车身信息_16_ENTER=  23174;
final static int  车身信息_16_LEAVE=  23175;

final static int 车身信息_17= 23180;
final static int 车身信息_17_RELEASE=  23181;
final static int 车身信息_17_PRESSING=  23182;
final static int  车身信息_17_PRESSED=  23183;
final static int  车身信息_17_ENTER=  23184;
final static int  车身信息_17_LEAVE=  23185;

final static int 车身信息_18= 23190;
final static int 车身信息_18_RELEASE=  23191;
final static int 车身信息_18_PRESSING=  23192;
final static int  车身信息_18_PRESSED=  23193;
final static int  车身信息_18_ENTER=  23194;
final static int  车身信息_18_LEAVE=  23195;

final static int 车身信息_19= 23200;
final static int 车身信息_19_RELEASE=  23201;
final static int 车身信息_19_PRESSING=  23202;
final static int  车身信息_19_PRESSED=  23203;
final static int  车身信息_19_ENTER=  23204;
final static int  车身信息_19_LEAVE=  23205;

final static int 车身信息_C= 23210;
final static int 车身信息_C_RELEASE=  23211;
final static int 车身信息_C_PRESSING=  23212;
final static int  车身信息_C_PRESSED=  23213;
final static int  车身信息_C_ENTER=  23214;
final static int  车身信息_C_LEAVE=  23215;

final static int 车身信息_上一页= 23220;
final static int 车身信息_上一页_RELEASE=  23221;
final static int 车身信息_上一页_PRESSING=  23222;
final static int  车身信息_上一页_PRESSED=  23223;
final static int  车身信息_上一页_ENTER=  23224;
final static int  车身信息_上一页_LEAVE=  23225;

final static int 车身信息_下一页= 23230;
final static int 车身信息_下一页_RELEASE=  23231;
final static int 车身信息_下一页_PRESSING=  23232;
final static int  车身信息_下一页_PRESSED=  23233;
final static int  车身信息_下一页_ENTER=  23234;
final static int  车身信息_下一页_LEAVE=  23235;

final static int 车身信息_返回设置= 23240;
final static int 车身信息_返回设置_RELEASE=  23241;
final static int 车身信息_返回设置_PRESSING=  23242;
final static int  车身信息_返回设置_PRESSED=  23243;
final static int  车身信息_返回设置_ENTER=  23244;
final static int  车身信息_返回设置_LEAVE=  23245;

final static int 车身信息_恢复默认设置= 23250;
final static int 车身信息_恢复默认设置_RELEASE=  23251;
final static int 车身信息_恢复默认设置_PRESSING=  23252;
final static int  车身信息_恢复默认设置_PRESSED=  23253;
final static int  车身信息_恢复默认设置_ENTER=  23254;
final static int  车身信息_恢复默认设置_LEAVE=  23255;


public 车身信息_Event() {
      actionMap.putInt("0",车身信息_0);
      actionMap.putInt("1",车身信息_1);
      actionMap.putInt("2",车身信息_2);
      actionMap.putInt("3",车身信息_3);
      actionMap.putInt("4",车身信息_4);
      actionMap.putInt("5",车身信息_5);
      actionMap.putInt("6",车身信息_6);
      actionMap.putInt("7",车身信息_7);
      actionMap.putInt("8",车身信息_8);
      actionMap.putInt("9",车身信息_9);
      actionMap.putInt("10",车身信息_10);
      actionMap.putInt("11",车身信息_11);
      actionMap.putInt("12",车身信息_12);
      actionMap.putInt("13",车身信息_13);
      actionMap.putInt("14",车身信息_14);
      actionMap.putInt("15",车身信息_15);
      actionMap.putInt("16",车身信息_16);
      actionMap.putInt("17",车身信息_17);
      actionMap.putInt("18",车身信息_18);
      actionMap.putInt("19",车身信息_19);
      actionMap.putInt("C",车身信息_C);
      actionMap.putInt("上一页",车身信息_上一页);
      actionMap.putInt("下一页",车身信息_下一页);
      actionMap.putInt("返回设置",车身信息_返回设置);
      actionMap.putInt("恢复默认设置",车身信息_恢复默认设置);
	STATE= changeState(STATE,ST_车身设置);
	setBindScreen(new Screen_车身信息(),SCRN_车身信息);
}

public String getScreenName(){
	return  "车身信息";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_车身设置){
			if(msg.wParam==车身信息_0_RELEASE){
				_F_ACTION("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_1_RELEASE){
				_F_ACTION("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_2_RELEASE){
				_F_ACTION("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_3_RELEASE){
				_F_ACTION("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_4_RELEASE){
				_F_ACTION("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_5_RELEASE){
				_F_ACTION("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_6_RELEASE){
				_F_ACTION("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_7_RELEASE){
				_F_ACTION("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_8_RELEASE){
				_F_ACTION("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_9_RELEASE){
				_F_ACTION("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_10_RELEASE){
				_F_ACTION("10",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_11_RELEASE){
				_F_ACTION("11",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_12_RELEASE){
				_F_ACTION("12",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_13_RELEASE){
				_F_ACTION("13",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_14_RELEASE){
				_F_ACTION("14",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_15_RELEASE){
				_F_ACTION("15",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_16_RELEASE){
				_F_ACTION("16",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_17_RELEASE){
				_F_ACTION("17",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_18_RELEASE){
				_F_ACTION("18",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_19_RELEASE){
				_F_ACTION("19",msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_返回设置_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车身信息_恢复默认设置_RELEASE){
				_F_恢复默认设置(msg);
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
