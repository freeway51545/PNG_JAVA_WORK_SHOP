package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_������2;
public abstract class ������2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_������_����_ROUTINE(msg);
              }

 int STATE_����;
   public abstract void _F_BEGIN_SEARCH(MSG_ZHW msg);
   public abstract void _F_DEALING_SEARCH(MSG_ZHW msg);
   public abstract void _F_EXCHANG_FM_AM(MSG_ZHW msg);
   public abstract void _F_DEAL_������(MSG_ZHW msg);
   public abstract void _F_PLAY(String a,MSG_ZHW msg);
   public abstract void _F_SAVE(String a,MSG_ZHW msg);
   public abstract void _F_TURN_DOWN(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��̨_SUB(MSG_ZHW msg);
   public abstract void _F_��̨_PLUS(MSG_ZHW msg);
   public abstract void _F_SEARCHING_UP(MSG_ZHW msg);
   public abstract void _F_SEARCHING_DOWN(MSG_ZHW msg);
   public abstract void _F_DEAL_���(MSG_ZHW msg);
   public abstract void _F_CHECK_SOTRE_FLAGE(MSG_ZHW msg);
   public abstract void _F_ENTER_FIRST(MSG_ZHW msg);
   public abstract void _F_Enter����(MSG_ZHW msg);
   public abstract void _F_AUTO_PLAY(MSG_ZHW msg);
   public abstract void _F_Other(MSG_ZHW msg);
   public abstract void _F_TRY_SAVE_DATA(MSG_ZHW msg);
   public abstract void _F_INIT_������(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_Զ�̽���(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_MSG_KEY_EVENT(MSG_ZHW msg);
     final static int ST_AM_FM= 3019;
boolean IS_ST_AM_FM(){ return ST_AM_FM==STATE_����;}
     final static int ST_��̨_STATE= 3020;
boolean IS_ST_��̨_STATE(){ return ST_��̨_STATE==STATE_����;}
     final static int ST_��һ̨_STATE= 3021;
boolean IS_ST_��һ̨_STATE(){ return ST_��һ̨_STATE==STATE_����;}
     final static int ST_��һ̨_STATE= 3022;
boolean IS_ST_��һ̨_STATE(){ return ST_��һ̨_STATE==STATE_����;}
     final static int ST_AUTO_PLAY= 3023;
boolean IS_ST_AUTO_PLAY(){ return ST_AUTO_PLAY==STATE_����;}
final static int ������2_��̨= 22160;
final static int ������2_��̨_RELEASE=  22161;
final static int ������2_��̨_PRESSING=  22162;
final static int  ������2_��̨_PRESSED=  22163;
final static int  ������2_��̨_ENTER=  22164;
final static int  ������2_��̨_LEAVE=  22165;

final static int ������2_BAND= 22170;
final static int ������2_BAND_RELEASE=  22171;
final static int ������2_BAND_PRESSING=  22172;
final static int  ������2_BAND_PRESSED=  22173;
final static int  ������2_BAND_ENTER=  22174;
final static int  ������2_BAND_LEAVE=  22175;

final static int ������2_������= 22180;
final static int ������2_������_RELEASE=  22181;
final static int ������2_������_PRESSING=  22182;
final static int  ������2_������_PRESSED=  22183;
final static int  ������2_������_ENTER=  22184;
final static int  ������2_������_LEAVE=  22185;

final static int ������2_LOC1= 22190;
final static int ������2_LOC1_RELEASE=  22191;
final static int ������2_LOC1_PRESSING=  22192;
final static int  ������2_LOC1_PRESSED=  22193;
final static int  ������2_LOC1_ENTER=  22194;
final static int  ������2_LOC1_LEAVE=  22195;

final static int ������2_LOC2= 22200;
final static int ������2_LOC2_RELEASE=  22201;
final static int ������2_LOC2_PRESSING=  22202;
final static int  ������2_LOC2_PRESSED=  22203;
final static int  ������2_LOC2_ENTER=  22204;
final static int  ������2_LOC2_LEAVE=  22205;

final static int ������2_LOC3= 22210;
final static int ������2_LOC3_RELEASE=  22211;
final static int ������2_LOC3_PRESSING=  22212;
final static int  ������2_LOC3_PRESSED=  22213;
final static int  ������2_LOC3_ENTER=  22214;
final static int  ������2_LOC3_LEAVE=  22215;

final static int ������2_LOC4= 22220;
final static int ������2_LOC4_RELEASE=  22221;
final static int ������2_LOC4_PRESSING=  22222;
final static int  ������2_LOC4_PRESSED=  22223;
final static int  ������2_LOC4_ENTER=  22224;
final static int  ������2_LOC4_LEAVE=  22225;

final static int ������2_LOC5= 22230;
final static int ������2_LOC5_RELEASE=  22231;
final static int ������2_LOC5_PRESSING=  22232;
final static int  ������2_LOC5_PRESSED=  22233;
final static int  ������2_LOC5_ENTER=  22234;
final static int  ������2_LOC5_LEAVE=  22235;

final static int ������2_LOC6= 22240;
final static int ������2_LOC6_RELEASE=  22241;
final static int ������2_LOC6_PRESSING=  22242;
final static int  ������2_LOC6_PRESSED=  22243;
final static int  ������2_LOC6_ENTER=  22244;
final static int  ������2_LOC6_LEAVE=  22245;

final static int ������2_��= 22250;
final static int ������2_��_RELEASE=  22251;
final static int ������2_��_PRESSING=  22252;
final static int  ������2_��_PRESSED=  22253;
final static int  ������2_��_ENTER=  22254;
final static int  ������2_��_LEAVE=  22255;

final static int ������2_��= 22260;
final static int ������2_��_RELEASE=  22261;
final static int ������2_��_PRESSING=  22262;
final static int  ������2_��_PRESSED=  22263;
final static int  ������2_��_ENTER=  22264;
final static int  ������2_��_LEAVE=  22265;

final static int ������2_��һ̨= 22270;
final static int ������2_��һ̨_RELEASE=  22271;
final static int ������2_��һ̨_PRESSING=  22272;
final static int  ������2_��һ̨_PRESSED=  22273;
final static int  ������2_��һ̨_ENTER=  22274;
final static int  ������2_��һ̨_LEAVE=  22275;

final static int ������2_��һ̨= 22280;
final static int ������2_��һ̨_RELEASE=  22281;
final static int ������2_��һ̨_PRESSING=  22282;
final static int  ������2_��һ̨_PRESSED=  22283;
final static int  ������2_��һ̨_ENTER=  22284;
final static int  ������2_��һ̨_LEAVE=  22285;

final static int ������2_���= 22290;
final static int ������2_���_RELEASE=  22291;
final static int ������2_���_PRESSING=  22292;
final static int  ������2_���_PRESSED=  22293;
final static int  ������2_���_ENTER=  22294;
final static int  ������2_���_LEAVE=  22295;

final static int ������2_���ذ�ť= 22300;
final static int ������2_���ذ�ť_RELEASE=  22301;
final static int ������2_���ذ�ť_PRESSING=  22302;
final static int  ������2_���ذ�ť_PRESSED=  22303;
final static int  ������2_���ذ�ť_ENTER=  22304;
final static int  ������2_���ذ�ť_LEAVE=  22305;

final static int ������2_Զ��= 22310;
final static int ������2_Զ��_RELEASE=  22311;
final static int ������2_Զ��_PRESSING=  22312;
final static int  ������2_Զ��_PRESSED=  22313;
final static int  ������2_Զ��_ENTER=  22314;
final static int  ������2_Զ��_LEAVE=  22315;

final static int ������2_EQ= 22320;
final static int ������2_EQ_RELEASE=  22321;
final static int ������2_EQ_PRESSING=  22322;
final static int  ������2_EQ_PRESSED=  22323;
final static int  ������2_EQ_ENTER=  22324;
final static int  ������2_EQ_LEAVE=  22325;


public ������2_Event() {
      actionMap.putInt("��̨",������2_��̨);
      actionMap.putInt("BAND",������2_BAND);
      actionMap.putInt("������",������2_������);
      actionMap.putInt("LOC1",������2_LOC1);
      actionMap.putInt("LOC2",������2_LOC2);
      actionMap.putInt("LOC3",������2_LOC3);
      actionMap.putInt("LOC4",������2_LOC4);
      actionMap.putInt("LOC5",������2_LOC5);
      actionMap.putInt("LOC6",������2_LOC6);
      actionMap.putInt("��",������2_��);
      actionMap.putInt("��",������2_��);
      actionMap.putInt("��һ̨",������2_��һ̨);
      actionMap.putInt("��һ̨",������2_��һ̨);
      actionMap.putInt("���",������2_���);
      actionMap.putInt("���ذ�ť",������2_���ذ�ť);
      actionMap.putInt("Զ��",������2_Զ��);
      actionMap.putInt("EQ",������2_EQ);
	STATE_����= changeState(STATE_����,ST_AM_FM);
	setBindScreen(new Screen_������2(),SCRN_������2);
}

public String getScreenName(){
	return  "������2";
};

 void _F_������_����_ROUTINE(MSG_ZHW msg){

		if (STATE_���� == ST_AM_FM){
			if(msg.wParam==������2_��̨_RELEASE){
				_F_BEGIN_SEARCH(msg);
				STATE_����=changeState(STATE_����,ST_��̨_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��̨_PRESSING){
				_F_DEALING_SEARCH(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_BAND_RELEASE){
				_F_EXCHANG_FM_AM(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_������_RELEASE){
				_F_DEAL_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC1_RELEASE){
				_F_PLAY("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC2_RELEASE){
				_F_PLAY("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC3_RELEASE){
				_F_PLAY("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC4_RELEASE){
				_F_PLAY("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC5_RELEASE){
				_F_PLAY("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC6_RELEASE){
				_F_PLAY("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC1_PRESSING){
				_F_SAVE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC2_PRESSING){
				_F_SAVE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC3_PRESSING){
				_F_SAVE("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC4_PRESSING){
				_F_SAVE("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC5_PRESSING){
				_F_SAVE("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC6_PRESSING){
				_F_SAVE("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_TURN_DOWN){
				_F_TURN_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_RELEASE){
				_F_��̨_SUB(msg);
				STATE_����=changeState(STATE_����,ST_��һ̨_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_RELEASE){
				_F_��̨_PLUS(msg);
				STATE_����=changeState(STATE_����,ST_��һ̨_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_PRESSING){
				_F_SEARCHING_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_PRESSING){
				_F_SEARCHING_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_���_RELEASE){
				_F_DEAL_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_SOTRE_FLAGE(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_���� == ST_��̨_STATE){
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_ENTER_FIRST(msg);
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_���� == ST_��һ̨_STATE){
			if(msg.wParam==MSG_ZHW.MSG_FoundValidChannel){
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_���� == ST_��һ̨_STATE){
			if(msg.wParam==MSG_ZHW.MSG_FoundValidChannel){
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_���� == ST_AUTO_PLAY){
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_AUTO_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter����(msg);
				;
				STATE_����=changeState(STATE_����,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==������2_��̨_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC1_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC2_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC3_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC4_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC5_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_LOC6_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_��һ̨_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TRY_SAVE_DATA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_���ذ�ť_RELEASE){
				_F_Other(msg);
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_Զ��_RELEASE){
				_F_Զ�̽���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==������2_EQ_RELEASE){
				_F_EQ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_MSG_KEY_EVENT(msg);
				msg.setComsumered();
			}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
