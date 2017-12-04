package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_¿∂—¿“Ù¿÷;
public abstract class ¿∂—¿“Ù¿÷_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_PREV(MSG_ZHW msg);
   public abstract void _F_PAUSE(MSG_ZHW msg);
   public abstract void _F_PLAY(MSG_ZHW msg);
   public abstract void _F_STOP_PLAY(MSG_ZHW msg);
   public abstract void _F_NEXT(MSG_ZHW msg);
   public abstract void _F_INIT_BTYY(MSG_ZHW msg);
   public abstract void _F_RETURN_RELEASE(MSG_ZHW msg);
   public abstract void _F_«–ªª(MSG_ZHW msg);
   public abstract void _F_VOL_PLUS(MSG_ZHW msg);
   public abstract void _F_VOL_SUB(MSG_ZHW msg);
   public abstract void _F_RETURN_BT(MSG_ZHW msg);
   public abstract void _F_πÿ±’(MSG_ZHW msg);
     final static int ST_¿∂—¿“Ù¿÷_NORMAL= 3016;
boolean IS_ST_¿∂—¿“Ù¿÷_NORMAL(){ return ST_¿∂—¿“Ù¿÷_NORMAL==STATE;}
final static int ¿∂—¿“Ù¿÷_…œ“ª«˙= 21620;
final static int ¿∂—¿“Ù¿÷_…œ“ª«˙_RELEASE=  21621;
final static int ¿∂—¿“Ù¿÷_…œ“ª«˙_PRESSING=  21622;
final static int  ¿∂—¿“Ù¿÷_…œ“ª«˙_PRESSED=  21623;
final static int  ¿∂—¿“Ù¿÷_…œ“ª«˙_ENTER=  21624;
final static int  ¿∂—¿“Ù¿÷_…œ“ª«˙_LEAVE=  21625;

final static int ¿∂—¿“Ù¿÷_‘›Õ£= 21630;
final static int ¿∂—¿“Ù¿÷_‘›Õ£_RELEASE=  21631;
final static int ¿∂—¿“Ù¿÷_‘›Õ£_PRESSING=  21632;
final static int  ¿∂—¿“Ù¿÷_‘›Õ£_PRESSED=  21633;
final static int  ¿∂—¿“Ù¿÷_‘›Õ£_ENTER=  21634;
final static int  ¿∂—¿“Ù¿÷_‘›Õ£_LEAVE=  21635;

final static int ¿∂—¿“Ù¿÷_≤•∑≈= 21640;
final static int ¿∂—¿“Ù¿÷_≤•∑≈_RELEASE=  21641;
final static int ¿∂—¿“Ù¿÷_≤•∑≈_PRESSING=  21642;
final static int  ¿∂—¿“Ù¿÷_≤•∑≈_PRESSED=  21643;
final static int  ¿∂—¿“Ù¿÷_≤•∑≈_ENTER=  21644;
final static int  ¿∂—¿“Ù¿÷_≤•∑≈_LEAVE=  21645;

final static int ¿∂—¿“Ù¿÷_Õ£÷π= 21650;
final static int ¿∂—¿“Ù¿÷_Õ£÷π_RELEASE=  21651;
final static int ¿∂—¿“Ù¿÷_Õ£÷π_PRESSING=  21652;
final static int  ¿∂—¿“Ù¿÷_Õ£÷π_PRESSED=  21653;
final static int  ¿∂—¿“Ù¿÷_Õ£÷π_ENTER=  21654;
final static int  ¿∂—¿“Ù¿÷_Õ£÷π_LEAVE=  21655;

final static int ¿∂—¿“Ù¿÷_œ¬“ª«˙= 21660;
final static int ¿∂—¿“Ù¿÷_œ¬“ª«˙_RELEASE=  21661;
final static int ¿∂—¿“Ù¿÷_œ¬“ª«˙_PRESSING=  21662;
final static int  ¿∂—¿“Ù¿÷_œ¬“ª«˙_PRESSED=  21663;
final static int  ¿∂—¿“Ù¿÷_œ¬“ª«˙_ENTER=  21664;
final static int  ¿∂—¿“Ù¿÷_œ¬“ª«˙_LEAVE=  21665;

final static int ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√= 21670;
final static int ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_RELEASE=  21671;
final static int ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_PRESSING=  21672;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_PRESSED=  21673;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_ENTER=  21674;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_LEAVE=  21675;

final static int ¿∂—¿“Ù¿÷_«–ªª= 21680;
final static int ¿∂—¿“Ù¿÷_«–ªª_RELEASE=  21681;
final static int ¿∂—¿“Ù¿÷_«–ªª_PRESSING=  21682;
final static int  ¿∂—¿“Ù¿÷_«–ªª_PRESSED=  21683;
final static int  ¿∂—¿“Ù¿÷_«–ªª_ENTER=  21684;
final static int  ¿∂—¿“Ù¿÷_«–ªª_LEAVE=  21685;

final static int ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS= 21690;
final static int ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_RELEASE=  21691;
final static int ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_PRESSING=  21692;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_PRESSED=  21693;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_ENTER=  21694;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_LEAVE=  21695;

final static int ¿∂—¿“Ù¿÷_“Ù¡ø_SUB= 21700;
final static int ¿∂—¿“Ù¿÷_“Ù¡ø_SUB_RELEASE=  21701;
final static int ¿∂—¿“Ù¿÷_“Ù¡ø_SUB_PRESSING=  21702;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_SUB_PRESSED=  21703;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_SUB_ENTER=  21704;
final static int  ¿∂—¿“Ù¿÷_“Ù¡ø_SUB_LEAVE=  21705;

final static int ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿= 21710;
final static int ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_RELEASE=  21711;
final static int ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_PRESSING=  21712;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_PRESSED=  21713;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_ENTER=  21714;
final static int  ¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_LEAVE=  21715;

final static int ¿∂—¿“Ù¿÷_πÿ±’= 21720;
final static int ¿∂—¿“Ù¿÷_πÿ±’_RELEASE=  21721;
final static int ¿∂—¿“Ù¿÷_πÿ±’_PRESSING=  21722;
final static int  ¿∂—¿“Ù¿÷_πÿ±’_PRESSED=  21723;
final static int  ¿∂—¿“Ù¿÷_πÿ±’_ENTER=  21724;
final static int  ¿∂—¿“Ù¿÷_πÿ±’_LEAVE=  21725;


public ¿∂—¿“Ù¿÷_Event() {
      actionMap.putInt("…œ“ª«˙",¿∂—¿“Ù¿÷_…œ“ª«˙);
      actionMap.putInt("‘›Õ£",¿∂—¿“Ù¿÷_‘›Õ£);
      actionMap.putInt("≤•∑≈",¿∂—¿“Ù¿÷_≤•∑≈);
      actionMap.putInt("Õ£÷π",¿∂—¿“Ù¿÷_Õ£÷π);
      actionMap.putInt("œ¬“ª«˙",¿∂—¿“Ù¿÷_œ¬“ª«˙);
      actionMap.putInt("∑µªÿ…Ë÷√",¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√);
      actionMap.putInt("«–ªª",¿∂—¿“Ù¿÷_«–ªª);
      actionMap.putInt("“Ù¡ø_PLUS",¿∂—¿“Ù¿÷_“Ù¡ø_PLUS);
      actionMap.putInt("“Ù¡ø_SUB",¿∂—¿“Ù¿÷_“Ù¡ø_SUB);
      actionMap.putInt("∑µªÿ¿∂—¿",¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿);
      actionMap.putInt("πÿ±’",¿∂—¿“Ù¿÷_πÿ±’);
	STATE= changeState(STATE,ST_¿∂—¿“Ù¿÷_NORMAL);
	setBindScreen(new Screen_¿∂—¿“Ù¿÷(),SCRN_¿∂—¿“Ù¿÷);
}

public String getScreenName(){
	return  "¿∂—¿“Ù¿÷";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_¿∂—¿“Ù¿÷_NORMAL){
			if(msg.wParam==¿∂—¿“Ù¿÷_…œ“ª«˙_RELEASE){
				_F_PREV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_‘›Õ£_RELEASE){
				_F_PAUSE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_≤•∑≈_RELEASE){
				_F_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_Õ£÷π_RELEASE){
				_F_STOP_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_œ¬“ª«˙_RELEASE){
				_F_NEXT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BTYY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_∑µªÿ…Ë÷√_RELEASE){
				_F_RETURN_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_«–ªª_RELEASE){
				_F_«–ªª(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_“Ù¡ø_PLUS_RELEASE){
				_F_VOL_PLUS(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_“Ù¡ø_SUB_RELEASE){
				_F_VOL_SUB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_∑µªÿ¿∂—¿_RELEASE){
				_F_RETURN_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿“Ù¿÷_πÿ±’_RELEASE){
				_F_πÿ±’(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
