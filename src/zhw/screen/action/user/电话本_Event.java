package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�绰��;
public abstract class �绰��_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_BOOK(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_TO_����(MSG_ZHW msg);
   public abstract void _F_SELECT_TEL(String a,MSG_ZHW msg);
   public abstract void _F_ͬ��(MSG_ZHW msg);
   public abstract void _F_ST_TIMMER(MSG_ZHW msg);
   public abstract void _F_DEAL_INFORS(MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_BACK(MSG_ZHW msg);
   public abstract void _F_TO_����(MSG_ZHW msg);
   public abstract void _F_SCROLL_TABLE_MOUSE_UP(MSG_ZHW msg);
   public abstract void _F_SCROLL_TABLE_MOUSE_MOVE(MSG_ZHW msg);
   public abstract void _F_SELECT_ITEM(MSG_ZHW msg);
   public abstract void _F_SCROLL_BEGIN(MSG_ZHW msg);
   public abstract void _F_CLEAR_SEARCH(MSG_ZHW msg);
   public abstract void _F_ST_TIMMER_AUTO_SCROLL(MSG_ZHW msg);
     final static int ST_�绰��_NORMAL= 3006;
boolean IS_ST_�绰��_NORMAL(){ return ST_�绰��_NORMAL==STATE;}
     final static int ST_����= 3007;
boolean IS_ST_����(){ return ST_����==STATE;}
     final static int ST_SCROLL_TABLE_MOUSE_MOVE= 3008;
boolean IS_ST_SCROLL_TABLE_MOUSE_MOVE(){ return ST_SCROLL_TABLE_MOUSE_MOVE==STATE;}
     final static int ST_SCROLL_AUTO= 3009;
boolean IS_ST_SCROLL_AUTO(){ return ST_SCROLL_AUTO==STATE;}
final static int �绰��_��һҳ= 20840;
final static int �绰��_��һҳ_RELEASE=  20841;
final static int �绰��_��һҳ_PRESSING=  20842;
final static int  �绰��_��һҳ_PRESSED=  20843;
final static int  �绰��_��һҳ_ENTER=  20844;
final static int  �绰��_��һҳ_LEAVE=  20845;

final static int �绰��_��һҳ= 20850;
final static int �绰��_��һҳ_RELEASE=  20851;
final static int �绰��_��һҳ_PRESSING=  20852;
final static int  �绰��_��һҳ_PRESSED=  20853;
final static int  �绰��_��һҳ_ENTER=  20854;
final static int  �绰��_��һҳ_LEAVE=  20855;

final static int �绰��_����= 20860;
final static int �绰��_����_RELEASE=  20861;
final static int �绰��_����_PRESSING=  20862;
final static int  �绰��_����_PRESSED=  20863;
final static int  �绰��_����_ENTER=  20864;
final static int  �绰��_����_LEAVE=  20865;

final static int �绰��_TEL1= 20870;
final static int �绰��_TEL1_RELEASE=  20871;
final static int �绰��_TEL1_PRESSING=  20872;
final static int  �绰��_TEL1_PRESSED=  20873;
final static int  �绰��_TEL1_ENTER=  20874;
final static int  �绰��_TEL1_LEAVE=  20875;

final static int �绰��_TEL2= 20880;
final static int �绰��_TEL2_RELEASE=  20881;
final static int �绰��_TEL2_PRESSING=  20882;
final static int  �绰��_TEL2_PRESSED=  20883;
final static int  �绰��_TEL2_ENTER=  20884;
final static int  �绰��_TEL2_LEAVE=  20885;

final static int �绰��_TEL3= 20890;
final static int �绰��_TEL3_RELEASE=  20891;
final static int �绰��_TEL3_PRESSING=  20892;
final static int  �绰��_TEL3_PRESSED=  20893;
final static int  �绰��_TEL3_ENTER=  20894;
final static int  �绰��_TEL3_LEAVE=  20895;

final static int �绰��_TEL4= 20900;
final static int �绰��_TEL4_RELEASE=  20901;
final static int �绰��_TEL4_PRESSING=  20902;
final static int  �绰��_TEL4_PRESSED=  20903;
final static int  �绰��_TEL4_ENTER=  20904;
final static int  �绰��_TEL4_LEAVE=  20905;

final static int �绰��_TEL5= 20910;
final static int �绰��_TEL5_RELEASE=  20911;
final static int �绰��_TEL5_PRESSING=  20912;
final static int  �绰��_TEL5_PRESSED=  20913;
final static int  �绰��_TEL5_ENTER=  20914;
final static int  �绰��_TEL5_LEAVE=  20915;

final static int �绰��_TEL6= 20920;
final static int �绰��_TEL6_RELEASE=  20921;
final static int �绰��_TEL6_PRESSING=  20922;
final static int  �绰��_TEL6_PRESSED=  20923;
final static int  �绰��_TEL6_ENTER=  20924;
final static int  �绰��_TEL6_LEAVE=  20925;

final static int �绰��_ͬ��= 20930;
final static int �绰��_ͬ��_RELEASE=  20931;
final static int �绰��_ͬ��_PRESSING=  20932;
final static int  �绰��_ͬ��_PRESSED=  20933;
final static int  �绰��_ͬ��_ENTER=  20934;
final static int  �绰��_ͬ��_LEAVE=  20935;

final static int �绰��_C= 20940;
final static int �绰��_C_RELEASE=  20941;
final static int �绰��_C_PRESSING=  20942;
final static int  �绰��_C_PRESSED=  20943;
final static int  �绰��_C_ENTER=  20944;
final static int  �绰��_C_LEAVE=  20945;

final static int �绰��_0= 20950;
final static int �绰��_0_RELEASE=  20951;
final static int �绰��_0_PRESSING=  20952;
final static int  �绰��_0_PRESSED=  20953;
final static int  �绰��_0_ENTER=  20954;
final static int  �绰��_0_LEAVE=  20955;

final static int �绰��_1= 20960;
final static int �绰��_1_RELEASE=  20961;
final static int �绰��_1_PRESSING=  20962;
final static int  �绰��_1_PRESSED=  20963;
final static int  �绰��_1_ENTER=  20964;
final static int  �绰��_1_LEAVE=  20965;

final static int �绰��_2= 20970;
final static int �绰��_2_RELEASE=  20971;
final static int �绰��_2_PRESSING=  20972;
final static int  �绰��_2_PRESSED=  20973;
final static int  �绰��_2_ENTER=  20974;
final static int  �绰��_2_LEAVE=  20975;

final static int �绰��_3= 20980;
final static int �绰��_3_RELEASE=  20981;
final static int �绰��_3_PRESSING=  20982;
final static int  �绰��_3_PRESSED=  20983;
final static int  �绰��_3_ENTER=  20984;
final static int  �绰��_3_LEAVE=  20985;

final static int �绰��_4= 20990;
final static int �绰��_4_RELEASE=  20991;
final static int �绰��_4_PRESSING=  20992;
final static int  �绰��_4_PRESSED=  20993;
final static int  �绰��_4_ENTER=  20994;
final static int  �绰��_4_LEAVE=  20995;

final static int �绰��_5= 21000;
final static int �绰��_5_RELEASE=  21001;
final static int �绰��_5_PRESSING=  21002;
final static int  �绰��_5_PRESSED=  21003;
final static int  �绰��_5_ENTER=  21004;
final static int  �绰��_5_LEAVE=  21005;

final static int �绰��_6= 21010;
final static int �绰��_6_RELEASE=  21011;
final static int �绰��_6_PRESSING=  21012;
final static int  �绰��_6_PRESSED=  21013;
final static int  �绰��_6_ENTER=  21014;
final static int  �绰��_6_LEAVE=  21015;

final static int �绰��_7= 21020;
final static int �绰��_7_RELEASE=  21021;
final static int �绰��_7_PRESSING=  21022;
final static int  �绰��_7_PRESSED=  21023;
final static int  �绰��_7_ENTER=  21024;
final static int  �绰��_7_LEAVE=  21025;

final static int �绰��_8= 21030;
final static int �绰��_8_RELEASE=  21031;
final static int �绰��_8_PRESSING=  21032;
final static int  �绰��_8_PRESSED=  21033;
final static int  �绰��_8_ENTER=  21034;
final static int  �绰��_8_LEAVE=  21035;

final static int �绰��_9= 21040;
final static int �绰��_9_RELEASE=  21041;
final static int �绰��_9_PRESSING=  21042;
final static int  �绰��_9_PRESSED=  21043;
final static int  �绰��_9_ENTER=  21044;
final static int  �绰��_9_LEAVE=  21045;

final static int �绰��_�˸�= 21050;
final static int �绰��_�˸�_RELEASE=  21051;
final static int �绰��_�˸�_PRESSING=  21052;
final static int  �绰��_�˸�_PRESSED=  21053;
final static int  �绰��_�˸�_ENTER=  21054;
final static int  �绰��_�˸�_LEAVE=  21055;

final static int �绰��_CLOSE= 21060;
final static int �绰��_CLOSE_RELEASE=  21061;
final static int �绰��_CLOSE_PRESSING=  21062;
final static int  �绰��_CLOSE_PRESSED=  21063;
final static int  �绰��_CLOSE_ENTER=  21064;
final static int  �绰��_CLOSE_LEAVE=  21065;

final static int �绰��_SCROLL= 21070;
final static int �绰��_SCROLL_RELEASE=  21071;
final static int �绰��_SCROLL_PRESSING=  21072;
final static int  �绰��_SCROLL_PRESSED=  21073;
final static int  �绰��_SCROLL_ENTER=  21074;
final static int  �绰��_SCROLL_LEAVE=  21075;

final static int �绰��_��������= 21080;
final static int �绰��_��������_RELEASE=  21081;
final static int �绰��_��������_PRESSING=  21082;
final static int  �绰��_��������_PRESSED=  21083;
final static int  �绰��_��������_ENTER=  21084;
final static int  �绰��_��������_LEAVE=  21085;


public �绰��_Event() {
      actionMap.putInt("��һҳ",�绰��_��һҳ);
      actionMap.putInt("��һҳ",�绰��_��һҳ);
      actionMap.putInt("����",�绰��_����);
      actionMap.putInt("TEL1",�绰��_TEL1);
      actionMap.putInt("TEL2",�绰��_TEL2);
      actionMap.putInt("TEL3",�绰��_TEL3);
      actionMap.putInt("TEL4",�绰��_TEL4);
      actionMap.putInt("TEL5",�绰��_TEL5);
      actionMap.putInt("TEL6",�绰��_TEL6);
      actionMap.putInt("ͬ��",�绰��_ͬ��);
      actionMap.putInt("C",�绰��_C);
      actionMap.putInt("0",�绰��_0);
      actionMap.putInt("1",�绰��_1);
      actionMap.putInt("2",�绰��_2);
      actionMap.putInt("3",�绰��_3);
      actionMap.putInt("4",�绰��_4);
      actionMap.putInt("5",�绰��_5);
      actionMap.putInt("6",�绰��_6);
      actionMap.putInt("7",�绰��_7);
      actionMap.putInt("8",�绰��_8);
      actionMap.putInt("9",�绰��_9);
      actionMap.putInt("�˸�",�绰��_�˸�);
      actionMap.putInt("CLOSE",�绰��_CLOSE);
      actionMap.putInt("SCROLL",�绰��_SCROLL);
      actionMap.putInt("��������",�绰��_��������);
	STATE= changeState(STATE,ST_�绰��_NORMAL);
	setBindScreen(new Screen_�绰��(),SCRN_�绰��);
}

public String getScreenName(){
	return  "�绰��";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�绰��_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BOOK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_����_RELEASE){
				_F_TO_����(msg);
				STATE=changeState(STATE,ST_����);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL1_RELEASE){
				_F_SELECT_TEL("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL2_RELEASE){
				_F_SELECT_TEL("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL3_RELEASE){
				_F_SELECT_TEL("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL4_RELEASE){
				_F_SELECT_TEL("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL5_RELEASE){
				_F_SELECT_TEL("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL6_RELEASE){
				_F_SELECT_TEL("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_ͬ��_RELEASE){
				_F_ͬ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_ST_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_C_PRESSING){
				_F_DEAL_INFORS(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_����){
			if(msg.wParam==�绰��_TEL1_RELEASE){
				_F_SELECT_TEL("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL2_RELEASE){
				_F_SELECT_TEL("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL3_RELEASE){
				_F_SELECT_TEL("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_TEL4_RELEASE){
				_F_SELECT_TEL("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_0_RELEASE){
				_F_PRESSED("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_1_RELEASE){
				_F_PRESSED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_2_RELEASE){
				_F_PRESSED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_3_RELEASE){
				_F_PRESSED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_4_RELEASE){
				_F_PRESSED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_5_RELEASE){
				_F_PRESSED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_6_RELEASE){
				_F_PRESSED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_7_RELEASE){
				_F_PRESSED("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_8_RELEASE){
				_F_PRESSED("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_9_RELEASE){
				_F_PRESSED("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_�˸�_RELEASE){
				_F_BACK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_CLOSE_RELEASE){
				_F_TO_����(msg);
				STATE=changeState(STATE,ST_�绰��_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_����_RELEASE){
				_F_TO_����(msg);
				STATE=changeState(STATE,ST_�绰��_NORMAL);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_TABLE_MOUSE_MOVE){
			if(msg.wParam==MSG_ZHW.��ռMouseUp){
				_F_SCROLL_TABLE_MOUSE_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.��ռMouseMove){
				_F_SCROLL_TABLE_MOUSE_MOVE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SELECT_UP){
				_F_SELECT_ITEM(msg);
				STATE=changeState(STATE,ST_�绰��_NORMAL);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_AUTO){
			if(msg.wParam==MSG_ZHW.MSG_SCROLL_STOP){
				STATE=changeState(STATE,ST_�绰��_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_SCROLL_PRESSED){
				_F_SCROLL_BEGIN(msg);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==�绰��_��������_RELEASE){
				TO_SCRN(SCRN_����);
				msg.setComsumered();
			}
			if(msg.wParam==�绰��_C_RELEASE){
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
