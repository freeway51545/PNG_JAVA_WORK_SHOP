package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class ϵͳ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_TIMMER_CHECK(MSG_ZHW msg);
   public abstract void _F_Exit(MSG_ZHW msg);
     final static int ST_ϵͳ����_NORMAL= 3006;
boolean IS_ST_ϵͳ����_NORMAL(){ return ST_ϵͳ����_NORMAL==STATE;}
     final static int ST_SCROLL_UP= 3007;
boolean IS_ST_SCROLL_UP(){ return ST_SCROLL_UP==STATE;}
     final static int ST_SCROLL_DOWN= 3008;
boolean IS_ST_SCROLL_DOWN(){ return ST_SCROLL_DOWN==STATE;}
final static int ϵͳ����_��= 20750;
final static int ϵͳ����_��_RELEASE=  20751;
final static int ϵͳ����_��_PRESSING=  20752;
final static int  ϵͳ����_��_PRESSED=  20753;
final static int  ϵͳ����_��_ENTER=  20754;
final static int  ϵͳ����_��_LEAVE=  20755;

final static int ϵͳ����_��= 20760;
final static int ϵͳ����_��_RELEASE=  20761;
final static int ϵͳ����_��_PRESSING=  20762;
final static int  ϵͳ����_��_PRESSED=  20763;
final static int  ϵͳ����_��_ENTER=  20764;
final static int  ϵͳ����_��_LEAVE=  20765;


public ϵͳ����_Event() {
      actionMap.putInt("��",ϵͳ����_��);
      actionMap.putInt("��",ϵͳ����_��);
	STATE= changeState(STATE,ST_ϵͳ����_NORMAL);
}

public String getScreenName(){
	return  "ϵͳ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ϵͳ����_NORMAL){
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
			if(msg.wParam==ϵͳ����_��_RELEASE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_ϵͳ����_NORMAL);
				;
				msg.setComsumered();
			}
			if(msg.wParam==ϵͳ����_��_LEAVE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_ϵͳ����_NORMAL);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_SCROLL_DOWN){
			if(msg.wParam==ϵͳ����_��_RELEASE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_ϵͳ����_NORMAL);
				msg.setComsumered();
			}
			if(msg.wParam==ϵͳ����_��_LEAVE){
				_F_Exit(msg);
				STATE=changeState(STATE,ST_ϵͳ����_NORMAL);
				;
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
