package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�Ի���;
public abstract class �Ի���_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
   public abstract void _F_INIT_EXTERN(MSG_ZHW msg);
     final static int ST_�Ի���_NORMAL= 3030;
boolean IS_ST_�Ի���_NORMAL(){ return ST_�Ի���_NORMAL==STATE;}
final static int �Ի���_OK= 22730;
final static int �Ի���_OK_RELEASE=  22731;
final static int �Ի���_OK_PRESSING=  22732;
final static int  �Ի���_OK_PRESSED=  22733;
final static int  �Ի���_OK_ENTER=  22734;
final static int  �Ի���_OK_LEAVE=  22735;

final static int �Ի���_CANCEL= 22740;
final static int �Ի���_CANCEL_RELEASE=  22741;
final static int �Ի���_CANCEL_PRESSING=  22742;
final static int  �Ի���_CANCEL_PRESSED=  22743;
final static int  �Ի���_CANCEL_ENTER=  22744;
final static int  �Ի���_CANCEL_LEAVE=  22745;


public �Ի���_Event() {
      actionMap.putInt("OK",�Ի���_OK);
      actionMap.putInt("CANCEL",�Ի���_CANCEL);
	STATE= changeState(STATE,ST_�Ի���_NORMAL);
	setBindScreen(new Screen_�Ի���(),SCRN_�Ի���);
}

public String getScreenName(){
	return  "�Ի���";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�Ի���_NORMAL){
			if(msg.wParam==�Ի���_OK_RELEASE){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�Ի���_CANCEL_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_EXTERN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
