package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_¿∂—¿≈‰÷√;
public abstract class ¿∂—¿≈‰÷√_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_÷˜“≥(MSG_ZHW msg);
   public abstract void _F_∑µªÿ(MSG_ZHW msg);
   public abstract void _F_¡¨Ω”(MSG_ZHW msg);
   public abstract void _F_∂œø™(MSG_ZHW msg);
   public abstract void _F_¿∂—¿“Ù¿÷(MSG_ZHW msg);
   public abstract void _F_¿∂—¿(MSG_ZHW msg);
   public abstract void _F_±‡º≠(MSG_ZHW msg);
   public abstract void _F_µÁª∞±æ(MSG_ZHW msg);
   public abstract void _F_Õ®—∂¬º(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_…Ë÷√(MSG_ZHW msg);
     final static int ST_¿∂—¿≈‰÷√= 3027;
boolean IS_ST_¿∂—¿≈‰÷√(){ return ST_¿∂—¿≈‰÷√==STATE;}
final static int ¿∂—¿≈‰÷√_÷˜“≥= 22490;
final static int ¿∂—¿≈‰÷√_÷˜“≥_RELEASE=  22491;
final static int ¿∂—¿≈‰÷√_÷˜“≥_PRESSING=  22492;
final static int  ¿∂—¿≈‰÷√_÷˜“≥_PRESSED=  22493;
final static int  ¿∂—¿≈‰÷√_÷˜“≥_ENTER=  22494;
final static int  ¿∂—¿≈‰÷√_÷˜“≥_LEAVE=  22495;

final static int ¿∂—¿≈‰÷√_∑µªÿ= 22500;
final static int ¿∂—¿≈‰÷√_∑µªÿ_RELEASE=  22501;
final static int ¿∂—¿≈‰÷√_∑µªÿ_PRESSING=  22502;
final static int  ¿∂—¿≈‰÷√_∑µªÿ_PRESSED=  22503;
final static int  ¿∂—¿≈‰÷√_∑µªÿ_ENTER=  22504;
final static int  ¿∂—¿≈‰÷√_∑µªÿ_LEAVE=  22505;

final static int ¿∂—¿≈‰÷√_¡¨Ω”= 22510;
final static int ¿∂—¿≈‰÷√_¡¨Ω”_RELEASE=  22511;
final static int ¿∂—¿≈‰÷√_¡¨Ω”_PRESSING=  22512;
final static int  ¿∂—¿≈‰÷√_¡¨Ω”_PRESSED=  22513;
final static int  ¿∂—¿≈‰÷√_¡¨Ω”_ENTER=  22514;
final static int  ¿∂—¿≈‰÷√_¡¨Ω”_LEAVE=  22515;

final static int ¿∂—¿≈‰÷√_∂œø™= 22520;
final static int ¿∂—¿≈‰÷√_∂œø™_RELEASE=  22521;
final static int ¿∂—¿≈‰÷√_∂œø™_PRESSING=  22522;
final static int  ¿∂—¿≈‰÷√_∂œø™_PRESSED=  22523;
final static int  ¿∂—¿≈‰÷√_∂œø™_ENTER=  22524;
final static int  ¿∂—¿≈‰÷√_∂œø™_LEAVE=  22525;

final static int ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷= 22530;
final static int ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_RELEASE=  22531;
final static int ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_PRESSING=  22532;
final static int  ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_PRESSED=  22533;
final static int  ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_ENTER=  22534;
final static int  ¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_LEAVE=  22535;

final static int ¿∂—¿≈‰÷√_¿∂—¿= 22540;
final static int ¿∂—¿≈‰÷√_¿∂—¿_RELEASE=  22541;
final static int ¿∂—¿≈‰÷√_¿∂—¿_PRESSING=  22542;
final static int  ¿∂—¿≈‰÷√_¿∂—¿_PRESSED=  22543;
final static int  ¿∂—¿≈‰÷√_¿∂—¿_ENTER=  22544;
final static int  ¿∂—¿≈‰÷√_¿∂—¿_LEAVE=  22545;

final static int ¿∂—¿≈‰÷√_±‡º≠= 22550;
final static int ¿∂—¿≈‰÷√_±‡º≠_RELEASE=  22551;
final static int ¿∂—¿≈‰÷√_±‡º≠_PRESSING=  22552;
final static int  ¿∂—¿≈‰÷√_±‡º≠_PRESSED=  22553;
final static int  ¿∂—¿≈‰÷√_±‡º≠_ENTER=  22554;
final static int  ¿∂—¿≈‰÷√_±‡º≠_LEAVE=  22555;

final static int ¿∂—¿≈‰÷√_µÁª∞±æ= 22560;
final static int ¿∂—¿≈‰÷√_µÁª∞±æ_RELEASE=  22561;
final static int ¿∂—¿≈‰÷√_µÁª∞±æ_PRESSING=  22562;
final static int  ¿∂—¿≈‰÷√_µÁª∞±æ_PRESSED=  22563;
final static int  ¿∂—¿≈‰÷√_µÁª∞±æ_ENTER=  22564;
final static int  ¿∂—¿≈‰÷√_µÁª∞±æ_LEAVE=  22565;

final static int ¿∂—¿≈‰÷√_Õ®—∂¬º= 22570;
final static int ¿∂—¿≈‰÷√_Õ®—∂¬º_RELEASE=  22571;
final static int ¿∂—¿≈‰÷√_Õ®—∂¬º_PRESSING=  22572;
final static int  ¿∂—¿≈‰÷√_Õ®—∂¬º_PRESSED=  22573;
final static int  ¿∂—¿≈‰÷√_Õ®—∂¬º_ENTER=  22574;
final static int  ¿∂—¿≈‰÷√_Õ®—∂¬º_LEAVE=  22575;

final static int ¿∂—¿≈‰÷√_…Ë÷√= 22580;
final static int ¿∂—¿≈‰÷√_…Ë÷√_RELEASE=  22581;
final static int ¿∂—¿≈‰÷√_…Ë÷√_PRESSING=  22582;
final static int  ¿∂—¿≈‰÷√_…Ë÷√_PRESSED=  22583;
final static int  ¿∂—¿≈‰÷√_…Ë÷√_ENTER=  22584;
final static int  ¿∂—¿≈‰÷√_…Ë÷√_LEAVE=  22585;


public ¿∂—¿≈‰÷√_Event() {
      actionMap.putInt("÷˜“≥",¿∂—¿≈‰÷√_÷˜“≥);
      actionMap.putInt("∑µªÿ",¿∂—¿≈‰÷√_∑µªÿ);
      actionMap.putInt("¡¨Ω”",¿∂—¿≈‰÷√_¡¨Ω”);
      actionMap.putInt("∂œø™",¿∂—¿≈‰÷√_∂œø™);
      actionMap.putInt("¿∂—¿“Ù¿÷",¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷);
      actionMap.putInt("¿∂—¿",¿∂—¿≈‰÷√_¿∂—¿);
      actionMap.putInt("±‡º≠",¿∂—¿≈‰÷√_±‡º≠);
      actionMap.putInt("µÁª∞±æ",¿∂—¿≈‰÷√_µÁª∞±æ);
      actionMap.putInt("Õ®—∂¬º",¿∂—¿≈‰÷√_Õ®—∂¬º);
      actionMap.putInt("…Ë÷√",¿∂—¿≈‰÷√_…Ë÷√);
	STATE= changeState(STATE,ST_¿∂—¿≈‰÷√);
	setBindScreen(new Screen_¿∂—¿≈‰÷√(),SCRN_¿∂—¿≈‰÷√);
}

public String getScreenName(){
	return  "¿∂—¿≈‰÷√";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_¿∂—¿≈‰÷√){
			if(msg.wParam==¿∂—¿≈‰÷√_÷˜“≥_RELEASE){
				_F_÷˜“≥(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_∑µªÿ_RELEASE){
				_F_∑µªÿ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_¡¨Ω”_RELEASE){
				_F_¡¨Ω”(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_∂œø™_RELEASE){
				_F_∂œø™(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_¿∂—¿“Ù¿÷_RELEASE){
				_F_¿∂—¿“Ù¿÷(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_¿∂—¿_RELEASE){
				_F_¿∂—¿(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_±‡º≠_RELEASE){
				_F_±‡º≠(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_µÁª∞±æ_RELEASE){
				_F_µÁª∞±æ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_Õ®—∂¬º_RELEASE){
				_F_Õ®—∂¬º(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==¿∂—¿≈‰÷√_…Ë÷√_RELEASE){
				_F_…Ë÷√(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
