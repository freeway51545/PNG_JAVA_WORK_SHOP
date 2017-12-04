package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_电话本;
public abstract class 电话本_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_BOOK(MSG_ZHW msg);
   public abstract void _F_上一页(MSG_ZHW msg);
   public abstract void _F_下一页(MSG_ZHW msg);
   public abstract void _F_TO_键盘(MSG_ZHW msg);
   public abstract void _F_SELECT_TEL(String a,MSG_ZHW msg);
   public abstract void _F_同步(MSG_ZHW msg);
   public abstract void _F_ST_TIMMER(MSG_ZHW msg);
   public abstract void _F_DEAL_INFORS(MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_BACK(MSG_ZHW msg);
   public abstract void _F_TO_号码(MSG_ZHW msg);
   public abstract void _F_SCROLL_TABLE_MOUSE_UP(MSG_ZHW msg);
   public abstract void _F_SCROLL_TABLE_MOUSE_MOVE(MSG_ZHW msg);
   public abstract void _F_SELECT_ITEM(MSG_ZHW msg);
   public abstract void _F_SCROLL_BEGIN(MSG_ZHW msg);
   public abstract void _F_CLEAR_SEARCH(MSG_ZHW msg);
   public abstract void _F_ST_TIMMER_AUTO_SCROLL(MSG_ZHW msg);
     final static int ST_电话本_NORMAL= 3006;
boolean IS_ST_电话本_NORMAL(){ return ST_电话本_NORMAL==STATE;}
     final static int ST_键盘= 3007;
boolean IS_ST_键盘(){ return ST_键盘==STATE;}
     final static int ST_SCROLL_TABLE_MOUSE_MOVE= 3008;
boolean IS_ST_SCROLL_TABLE_MOUSE_MOVE(){ return ST_SCROLL_TABLE_MOUSE_MOVE==STATE;}
     final static int ST_SCROLL_AUTO= 3009;
boolean IS_ST_SCROLL_AUTO(){ return ST_SCROLL_AUTO==STATE;}
final static int 电话本_上一页= 20840;
final static int 电话本_上一页_RELEASE=  20841;
final static int 电话本_上一页_PRESSING=  20842;
final static int  电话本_上一页_PRESSED=  20843;
final static int  电话本_上一页_ENTER=  20844;
final static int  电话本_上一页_LEAVE=  20845;

final static int 电话本_下一页= 20850;
final static int 电话本_下一页_RELEASE=  20851;
final static int 电话本_下一页_PRESSING=  20852;
final static int  电话本_下一页_PRESSED=  20853;
final static int  电话本_下一页_ENTER=  20854;
final static int  电话本_下一页_LEAVE=  20855;

final static int 电话本_键盘= 20860;
final static int 电话本_键盘_RELEASE=  20861;
final static int 电话本_键盘_PRESSING=  20862;
final static int  电话本_键盘_PRESSED=  20863;
final static int  电话本_键盘_ENTER=  20864;
final static int  电话本_键盘_LEAVE=  20865;

final static int 电话本_TEL1= 20870;
final static int 电话本_TEL1_RELEASE=  20871;
final static int 电话本_TEL1_PRESSING=  20872;
final static int  电话本_TEL1_PRESSED=  20873;
final static int  电话本_TEL1_ENTER=  20874;
final static int  电话本_TEL1_LEAVE=  20875;

final static int 电话本_TEL2= 20880;
final static int 电话本_TEL2_RELEASE=  20881;
final static int 电话本_TEL2_PRESSING=  20882;
final static int  电话本_TEL2_PRESSED=  20883;
final static int  电话本_TEL2_ENTER=  20884;
final static int  电话本_TEL2_LEAVE=  20885;

final static int 电话本_TEL3= 20890;
final static int 电话本_TEL3_RELEASE=  20891;
final static int 电话本_TEL3_PRESSING=  20892;
final static int  电话本_TEL3_PRESSED=  20893;
final static int  电话本_TEL3_ENTER=  20894;
final static int  电话本_TEL3_LEAVE=  20895;

final static int 电话本_TEL4= 20900;
final static int 电话本_TEL4_RELEASE=  20901;
final static int 电话本_TEL4_PRESSING=  20902;
final static int  电话本_TEL4_PRESSED=  20903;
final static int  电话本_TEL4_ENTER=  20904;
final static int  电话本_TEL4_LEAVE=  20905;

final static int 电话本_TEL5= 20910;
final static int 电话本_TEL5_RELEASE=  20911;
final static int 电话本_TEL5_PRESSING=  20912;
final static int  电话本_TEL5_PRESSED=  20913;
final static int  电话本_TEL5_ENTER=  20914;
final static int  电话本_TEL5_LEAVE=  20915;

final static int 电话本_TEL6= 20920;
final static int 电话本_TEL6_RELEASE=  20921;
final static int 电话本_TEL6_PRESSING=  20922;
final static int  电话本_TEL6_PRESSED=  20923;
final static int  电话本_TEL6_ENTER=  20924;
final static int  电话本_TEL6_LEAVE=  20925;

final static int 电话本_同步= 20930;
final static int 电话本_同步_RELEASE=  20931;
final static int 电话本_同步_PRESSING=  20932;
final static int  电话本_同步_PRESSED=  20933;
final static int  电话本_同步_ENTER=  20934;
final static int  电话本_同步_LEAVE=  20935;

final static int 电话本_C= 20940;
final static int 电话本_C_RELEASE=  20941;
final static int 电话本_C_PRESSING=  20942;
final static int  电话本_C_PRESSED=  20943;
final static int  电话本_C_ENTER=  20944;
final static int  电话本_C_LEAVE=  20945;

final static int 电话本_0= 20950;
final static int 电话本_0_RELEASE=  20951;
final static int 电话本_0_PRESSING=  20952;
final static int  电话本_0_PRESSED=  20953;
final static int  电话本_0_ENTER=  20954;
final static int  电话本_0_LEAVE=  20955;

final static int 电话本_1= 20960;
final static int 电话本_1_RELEASE=  20961;
final static int 电话本_1_PRESSING=  20962;
final static int  电话本_1_PRESSED=  20963;
final static int  电话本_1_ENTER=  20964;
final static int  电话本_1_LEAVE=  20965;

final static int 电话本_2= 20970;
final static int 电话本_2_RELEASE=  20971;
final static int 电话本_2_PRESSING=  20972;
final static int  电话本_2_PRESSED=  20973;
final static int  电话本_2_ENTER=  20974;
final static int  电话本_2_LEAVE=  20975;

final static int 电话本_3= 20980;
final static int 电话本_3_RELEASE=  20981;
final static int 电话本_3_PRESSING=  20982;
final static int  电话本_3_PRESSED=  20983;
final static int  电话本_3_ENTER=  20984;
final static int  电话本_3_LEAVE=  20985;

final static int 电话本_4= 20990;
final static int 电话本_4_RELEASE=  20991;
final static int 电话本_4_PRESSING=  20992;
final static int  电话本_4_PRESSED=  20993;
final static int  电话本_4_ENTER=  20994;
final static int  电话本_4_LEAVE=  20995;

final static int 电话本_5= 21000;
final static int 电话本_5_RELEASE=  21001;
final static int 电话本_5_PRESSING=  21002;
final static int  电话本_5_PRESSED=  21003;
final static int  电话本_5_ENTER=  21004;
final static int  电话本_5_LEAVE=  21005;

final static int 电话本_6= 21010;
final static int 电话本_6_RELEASE=  21011;
final static int 电话本_6_PRESSING=  21012;
final static int  电话本_6_PRESSED=  21013;
final static int  电话本_6_ENTER=  21014;
final static int  电话本_6_LEAVE=  21015;

final static int 电话本_7= 21020;
final static int 电话本_7_RELEASE=  21021;
final static int 电话本_7_PRESSING=  21022;
final static int  电话本_7_PRESSED=  21023;
final static int  电话本_7_ENTER=  21024;
final static int  电话本_7_LEAVE=  21025;

final static int 电话本_8= 21030;
final static int 电话本_8_RELEASE=  21031;
final static int 电话本_8_PRESSING=  21032;
final static int  电话本_8_PRESSED=  21033;
final static int  电话本_8_ENTER=  21034;
final static int  电话本_8_LEAVE=  21035;

final static int 电话本_9= 21040;
final static int 电话本_9_RELEASE=  21041;
final static int 电话本_9_PRESSING=  21042;
final static int  电话本_9_PRESSED=  21043;
final static int  电话本_9_ENTER=  21044;
final static int  电话本_9_LEAVE=  21045;

final static int 电话本_退格= 21050;
final static int 电话本_退格_RELEASE=  21051;
final static int 电话本_退格_PRESSING=  21052;
final static int  电话本_退格_PRESSED=  21053;
final static int  电话本_退格_ENTER=  21054;
final static int  电话本_退格_LEAVE=  21055;

final static int 电话本_CLOSE= 21060;
final static int 电话本_CLOSE_RELEASE=  21061;
final static int 电话本_CLOSE_PRESSING=  21062;
final static int  电话本_CLOSE_PRESSED=  21063;
final static int  电话本_CLOSE_ENTER=  21064;
final static int  电话本_CLOSE_LEAVE=  21065;

final static int 电话本_SCROLL= 21070;
final static int 电话本_SCROLL_RELEASE=  21071;
final static int 电话本_SCROLL_PRESSING=  21072;
final static int  电话本_SCROLL_PRESSED=  21073;
final static int  电话本_SCROLL_ENTER=  21074;
final static int  电话本_SCROLL_LEAVE=  21075;

final static int 电话本_返回蓝牙= 21080;
final static int 电话本_返回蓝牙_RELEASE=  21081;
final static int 电话本_返回蓝牙_PRESSING=  21082;
final static int  电话本_返回蓝牙_PRESSED=  21083;
final static int  电话本_返回蓝牙_ENTER=  21084;
final static int  电话本_返回蓝牙_LEAVE=  21085;


public 电话本_Event() {
      actionMap.putInt("上一页",电话本_上一页);
      actionMap.putInt("下一页",电话本_下一页);
      actionMap.putInt("键盘",电话本_键盘);
      actionMap.putInt("TEL1",电话本_TEL1);
      actionMap.putInt("TEL2",电话本_TEL2);
      actionMap.putInt("TEL3",电话本_TEL3);
      actionMap.putInt("TEL4",电话本_TEL4);
      actionMap.putInt("TEL5",电话本_TEL5);
      actionMap.putInt("TEL6",电话本_TEL6);
      actionMap.putInt("同步",电话本_同步);
      actionMap.putInt("C",电话本_C);
      actionMap.putInt("0",电话本_0);
      actionMap.putInt("1",电话本_1);
      actionMap.putInt("2",电话本_2);
      actionMap.putInt("3",电话本_3);
      actionMap.putInt("4",电话本_4);
      actionMap.putInt("5",电话本_5);
      actionMap.putInt("6",电话本_6);
      actionMap.putInt("7",电话本_7);
      actionMap.putInt("8",电话本_8);
      actionMap.putInt("9",电话本_9);
      actionMap.putInt("退格",电话本_退格);
      actionMap.putInt("CLOSE",电话本_CLOSE);
      actionMap.putInt("SCROLL",电话本_SCROLL);
      actionMap.putInt("返回蓝牙",电话本_返回蓝牙);
	STATE= changeState(STATE,ST_电话本_NORMAL);
	setBindScreen(new Screen_电话本(),SCRN_电话本);
}

public String getScreenName(){
	return  "电话本";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_电话本_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BOOK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_键盘_RELEASE){
				_F_TO_键盘(msg);
				STATE=changeState(STATE,ST_键盘);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL1_RELEASE){
				_F_SELECT_TEL("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL2_RELEASE){
				_F_SELECT_TEL("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL3_RELEASE){
				_F_SELECT_TEL("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL4_RELEASE){
				_F_SELECT_TEL("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL5_RELEASE){
				_F_SELECT_TEL("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL6_RELEASE){
				_F_SELECT_TEL("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_同步_RELEASE){
				_F_同步(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_ST_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_C_PRESSING){
				_F_DEAL_INFORS(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_键盘){
			if(msg.wParam==电话本_TEL1_RELEASE){
				_F_SELECT_TEL("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL2_RELEASE){
				_F_SELECT_TEL("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL3_RELEASE){
				_F_SELECT_TEL("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_TEL4_RELEASE){
				_F_SELECT_TEL("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_0_RELEASE){
				_F_PRESSED("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_1_RELEASE){
				_F_PRESSED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_2_RELEASE){
				_F_PRESSED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_3_RELEASE){
				_F_PRESSED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_4_RELEASE){
				_F_PRESSED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_5_RELEASE){
				_F_PRESSED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_6_RELEASE){
				_F_PRESSED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_7_RELEASE){
				_F_PRESSED("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_8_RELEASE){
				_F_PRESSED("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_9_RELEASE){
				_F_PRESSED("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_退格_RELEASE){
				_F_BACK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_CLOSE_RELEASE){
				_F_TO_号码(msg);
				STATE=changeState(STATE,ST_电话本_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_键盘_RELEASE){
				_F_TO_号码(msg);
				STATE=changeState(STATE,ST_电话本_NORMAL);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_TABLE_MOUSE_MOVE){
			if(msg.wParam==MSG_ZHW.独占MouseUp){
				_F_SCROLL_TABLE_MOUSE_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.独占MouseMove){
				_F_SCROLL_TABLE_MOUSE_MOVE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SELECT_UP){
				_F_SELECT_ITEM(msg);
				STATE=changeState(STATE,ST_电话本_NORMAL);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_AUTO){
			if(msg.wParam==MSG_ZHW.MSG_SCROLL_STOP){
				STATE=changeState(STATE,ST_电话本_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_SCROLL_PRESSED){
				_F_SCROLL_BEGIN(msg);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==电话本_返回蓝牙_RELEASE){
				TO_SCRN(SCRN_蓝牙);
				msg.setComsumered();
			}
			if(msg.wParam==电话本_C_RELEASE){
				_F_CLEAR_SEARCH(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_ST_TIMMER_AUTO_SCROLL(msg);
				msg.setComsumered();
			}
	}
 void _F_EnerFunction(MSG_ZHW msg){
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
