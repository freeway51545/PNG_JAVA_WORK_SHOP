package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_收音机2;
public abstract class 收音机2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_收音机_播放_ROUTINE(msg);
              }

 int STATE_播放;
   public abstract void _F_BEGIN_SEARCH(MSG_ZHW msg);
   public abstract void _F_DEALING_SEARCH(MSG_ZHW msg);
   public abstract void _F_EXCHANG_FM_AM(MSG_ZHW msg);
   public abstract void _F_DEAL_立体声(MSG_ZHW msg);
   public abstract void _F_PLAY(String a,MSG_ZHW msg);
   public abstract void _F_SAVE(String a,MSG_ZHW msg);
   public abstract void _F_TURN_DOWN(MSG_ZHW msg);
   public abstract void _F_上(MSG_ZHW msg);
   public abstract void _F_下(MSG_ZHW msg);
   public abstract void _F_搜台_SUB(MSG_ZHW msg);
   public abstract void _F_搜台_PLUS(MSG_ZHW msg);
   public abstract void _F_SEARCHING_UP(MSG_ZHW msg);
   public abstract void _F_SEARCHING_DOWN(MSG_ZHW msg);
   public abstract void _F_DEAL_浏览(MSG_ZHW msg);
   public abstract void _F_CHECK_SOTRE_FLAGE(MSG_ZHW msg);
   public abstract void _F_ENTER_FIRST(MSG_ZHW msg);
   public abstract void _F_Enter播放(MSG_ZHW msg);
   public abstract void _F_AUTO_PLAY(MSG_ZHW msg);
   public abstract void _F_Other(MSG_ZHW msg);
   public abstract void _F_TRY_SAVE_DATA(MSG_ZHW msg);
   public abstract void _F_INIT_收音机(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
   public abstract void _F_远程近程(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_MSG_KEY_EVENT(MSG_ZHW msg);
     final static int ST_AM_FM= 3019;
boolean IS_ST_AM_FM(){ return ST_AM_FM==STATE_播放;}
     final static int ST_搜台_STATE= 3020;
boolean IS_ST_搜台_STATE(){ return ST_搜台_STATE==STATE_播放;}
     final static int ST_上一台_STATE= 3021;
boolean IS_ST_上一台_STATE(){ return ST_上一台_STATE==STATE_播放;}
     final static int ST_下一台_STATE= 3022;
boolean IS_ST_下一台_STATE(){ return ST_下一台_STATE==STATE_播放;}
     final static int ST_AUTO_PLAY= 3023;
boolean IS_ST_AUTO_PLAY(){ return ST_AUTO_PLAY==STATE_播放;}
final static int 收音机2_搜台= 22160;
final static int 收音机2_搜台_RELEASE=  22161;
final static int 收音机2_搜台_PRESSING=  22162;
final static int  收音机2_搜台_PRESSED=  22163;
final static int  收音机2_搜台_ENTER=  22164;
final static int  收音机2_搜台_LEAVE=  22165;

final static int 收音机2_BAND= 22170;
final static int 收音机2_BAND_RELEASE=  22171;
final static int 收音机2_BAND_PRESSING=  22172;
final static int  收音机2_BAND_PRESSED=  22173;
final static int  收音机2_BAND_ENTER=  22174;
final static int  收音机2_BAND_LEAVE=  22175;

final static int 收音机2_立体声= 22180;
final static int 收音机2_立体声_RELEASE=  22181;
final static int 收音机2_立体声_PRESSING=  22182;
final static int  收音机2_立体声_PRESSED=  22183;
final static int  收音机2_立体声_ENTER=  22184;
final static int  收音机2_立体声_LEAVE=  22185;

final static int 收音机2_LOC1= 22190;
final static int 收音机2_LOC1_RELEASE=  22191;
final static int 收音机2_LOC1_PRESSING=  22192;
final static int  收音机2_LOC1_PRESSED=  22193;
final static int  收音机2_LOC1_ENTER=  22194;
final static int  收音机2_LOC1_LEAVE=  22195;

final static int 收音机2_LOC2= 22200;
final static int 收音机2_LOC2_RELEASE=  22201;
final static int 收音机2_LOC2_PRESSING=  22202;
final static int  收音机2_LOC2_PRESSED=  22203;
final static int  收音机2_LOC2_ENTER=  22204;
final static int  收音机2_LOC2_LEAVE=  22205;

final static int 收音机2_LOC3= 22210;
final static int 收音机2_LOC3_RELEASE=  22211;
final static int 收音机2_LOC3_PRESSING=  22212;
final static int  收音机2_LOC3_PRESSED=  22213;
final static int  收音机2_LOC3_ENTER=  22214;
final static int  收音机2_LOC3_LEAVE=  22215;

final static int 收音机2_LOC4= 22220;
final static int 收音机2_LOC4_RELEASE=  22221;
final static int 收音机2_LOC4_PRESSING=  22222;
final static int  收音机2_LOC4_PRESSED=  22223;
final static int  收音机2_LOC4_ENTER=  22224;
final static int  收音机2_LOC4_LEAVE=  22225;

final static int 收音机2_LOC5= 22230;
final static int 收音机2_LOC5_RELEASE=  22231;
final static int 收音机2_LOC5_PRESSING=  22232;
final static int  收音机2_LOC5_PRESSED=  22233;
final static int  收音机2_LOC5_ENTER=  22234;
final static int  收音机2_LOC5_LEAVE=  22235;

final static int 收音机2_LOC6= 22240;
final static int 收音机2_LOC6_RELEASE=  22241;
final static int 收音机2_LOC6_PRESSING=  22242;
final static int  收音机2_LOC6_PRESSED=  22243;
final static int  收音机2_LOC6_ENTER=  22244;
final static int  收音机2_LOC6_LEAVE=  22245;

final static int 收音机2_上= 22250;
final static int 收音机2_上_RELEASE=  22251;
final static int 收音机2_上_PRESSING=  22252;
final static int  收音机2_上_PRESSED=  22253;
final static int  收音机2_上_ENTER=  22254;
final static int  收音机2_上_LEAVE=  22255;

final static int 收音机2_下= 22260;
final static int 收音机2_下_RELEASE=  22261;
final static int 收音机2_下_PRESSING=  22262;
final static int  收音机2_下_PRESSED=  22263;
final static int  收音机2_下_ENTER=  22264;
final static int  收音机2_下_LEAVE=  22265;

final static int 收音机2_上一台= 22270;
final static int 收音机2_上一台_RELEASE=  22271;
final static int 收音机2_上一台_PRESSING=  22272;
final static int  收音机2_上一台_PRESSED=  22273;
final static int  收音机2_上一台_ENTER=  22274;
final static int  收音机2_上一台_LEAVE=  22275;

final static int 收音机2_下一台= 22280;
final static int 收音机2_下一台_RELEASE=  22281;
final static int 收音机2_下一台_PRESSING=  22282;
final static int  收音机2_下一台_PRESSED=  22283;
final static int  收音机2_下一台_ENTER=  22284;
final static int  收音机2_下一台_LEAVE=  22285;

final static int 收音机2_浏览= 22290;
final static int 收音机2_浏览_RELEASE=  22291;
final static int 收音机2_浏览_PRESSING=  22292;
final static int  收音机2_浏览_PRESSED=  22293;
final static int  收音机2_浏览_ENTER=  22294;
final static int  收音机2_浏览_LEAVE=  22295;

final static int 收音机2_返回按钮= 22300;
final static int 收音机2_返回按钮_RELEASE=  22301;
final static int 收音机2_返回按钮_PRESSING=  22302;
final static int  收音机2_返回按钮_PRESSED=  22303;
final static int  收音机2_返回按钮_ENTER=  22304;
final static int  收音机2_返回按钮_LEAVE=  22305;

final static int 收音机2_远程= 22310;
final static int 收音机2_远程_RELEASE=  22311;
final static int 收音机2_远程_PRESSING=  22312;
final static int  收音机2_远程_PRESSED=  22313;
final static int  收音机2_远程_ENTER=  22314;
final static int  收音机2_远程_LEAVE=  22315;

final static int 收音机2_EQ= 22320;
final static int 收音机2_EQ_RELEASE=  22321;
final static int 收音机2_EQ_PRESSING=  22322;
final static int  收音机2_EQ_PRESSED=  22323;
final static int  收音机2_EQ_ENTER=  22324;
final static int  收音机2_EQ_LEAVE=  22325;


public 收音机2_Event() {
      actionMap.putInt("搜台",收音机2_搜台);
      actionMap.putInt("BAND",收音机2_BAND);
      actionMap.putInt("立体声",收音机2_立体声);
      actionMap.putInt("LOC1",收音机2_LOC1);
      actionMap.putInt("LOC2",收音机2_LOC2);
      actionMap.putInt("LOC3",收音机2_LOC3);
      actionMap.putInt("LOC4",收音机2_LOC4);
      actionMap.putInt("LOC5",收音机2_LOC5);
      actionMap.putInt("LOC6",收音机2_LOC6);
      actionMap.putInt("上",收音机2_上);
      actionMap.putInt("下",收音机2_下);
      actionMap.putInt("上一台",收音机2_上一台);
      actionMap.putInt("下一台",收音机2_下一台);
      actionMap.putInt("浏览",收音机2_浏览);
      actionMap.putInt("返回按钮",收音机2_返回按钮);
      actionMap.putInt("远程",收音机2_远程);
      actionMap.putInt("EQ",收音机2_EQ);
	STATE_播放= changeState(STATE_播放,ST_AM_FM);
	setBindScreen(new Screen_收音机2(),SCRN_收音机2);
}

public String getScreenName(){
	return  "收音机2";
};

 void _F_收音机_播放_ROUTINE(MSG_ZHW msg){

		if (STATE_播放 == ST_AM_FM){
			if(msg.wParam==收音机2_搜台_RELEASE){
				_F_BEGIN_SEARCH(msg);
				STATE_播放=changeState(STATE_播放,ST_搜台_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_搜台_PRESSING){
				_F_DEALING_SEARCH(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_BAND_RELEASE){
				_F_EXCHANG_FM_AM(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_立体声_RELEASE){
				_F_DEAL_立体声(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC1_RELEASE){
				_F_PLAY("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC2_RELEASE){
				_F_PLAY("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC3_RELEASE){
				_F_PLAY("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC4_RELEASE){
				_F_PLAY("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC5_RELEASE){
				_F_PLAY("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC6_RELEASE){
				_F_PLAY("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC1_PRESSING){
				_F_SAVE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC2_PRESSING){
				_F_SAVE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC3_PRESSING){
				_F_SAVE("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC4_PRESSING){
				_F_SAVE("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC5_PRESSING){
				_F_SAVE("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC6_PRESSING){
				_F_SAVE("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_TURN_DOWN){
				_F_TURN_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_上_RELEASE){
				_F_上(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_下_RELEASE){
				_F_下(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_上一台_RELEASE){
				_F_搜台_SUB(msg);
				STATE_播放=changeState(STATE_播放,ST_上一台_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_下一台_RELEASE){
				_F_搜台_PLUS(msg);
				STATE_播放=changeState(STATE_播放,ST_下一台_STATE);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_上一台_PRESSING){
				_F_SEARCHING_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_下一台_PRESSING){
				_F_SEARCHING_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_浏览_RELEASE){
				_F_DEAL_浏览(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_SOTRE_FLAGE(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_播放 == ST_搜台_STATE){
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_ENTER_FIRST(msg);
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_播放 == ST_上一台_STATE){
			if(msg.wParam==MSG_ZHW.MSG_FoundValidChannel){
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_播放 == ST_下一台_STATE){
			if(msg.wParam==MSG_ZHW.MSG_FoundValidChannel){
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE_播放 == ST_AUTO_PLAY){
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_AUTO_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SEARCH_OVER){
				_F_Enter播放(msg);
				;
				STATE_播放=changeState(STATE_播放,ST_AM_FM);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==收音机2_搜台_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC1_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC2_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC3_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC4_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC5_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_LOC6_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_上_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_下_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_上一台_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_下一台_RELEASE){
				_F_Other(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TRY_SAVE_DATA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_收音机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_返回按钮_RELEASE){
				_F_Other(msg);
				_F_返回(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_远程_RELEASE){
				_F_远程近程(msg);
				msg.setComsumered();
			}
			if(msg.wParam==收音机2_EQ_RELEASE){
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
