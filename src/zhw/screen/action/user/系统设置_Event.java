package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class 系统设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_TIMMER_CHECK(MSG_ZHW msg);
   public abstract void _F_Exit(MSG_ZHW msg);
     final static int ST_系统设置_NORMAL= 3006;
boolean IS_ST_系统设置_NORMAL(){ return ST_系统设置_NORMAL==STATE;}
     final static int ST_SCROLL_UP= 3007;
boolean IS_ST_SCROLL_UP(){ return ST_SCROLL_UP==STATE;}
     final static int ST_SCROLL_DOWN= 3008;
boolean IS_ST_SCROLL_DOWN(){ return ST_SCROLL_DOWN==STATE;}
final static int 系统设置_上= 20750;
final static int 系统设置_上_RELEASE=  20751;
final static int 系统设置_上_PRESSING=  20752;
final static int  系统设置_上_PRESSED=  20753;
final static int  系统设置_上_ENTER=  20754;
final static int  系统设置_上_LEAVE=  20755;

final static int 系统设置_下= 20760;
final static int 系统设置_下_RELEASE=  20761;
final static int 系统设置_下_PRESSING=  20762;
final static int  系统设置_下_PRESSED=  20763;
final static int  系统设置_下_ENTER=  20764;
final static int  系统设置_下_LEAVE=  20765;


public 系统设置_Event() {
      actionMap.putInt("上",系统设置_上);
      actionMap.putInt("下",系统设置_下);
	STATE= changeState(STATE,ST_系统设置_NORMAL);
}

public String getScreenName(){
	return  "系统设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_系统设置_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_CHECK(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_UP){
			if(msg.wParam==系统设置_上_RELEASE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_系统设置_NORMAL);
				;
				msg.setComsumered();
			}
			if(msg.wParam==系统设置_上_LEAVE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_系统设置_NORMAL);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_DOWN){
			if(msg.wParam==系统设置_下_RELEASE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_系统设置_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==系统设置_下_LEAVE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_系统设置_NORMAL);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
