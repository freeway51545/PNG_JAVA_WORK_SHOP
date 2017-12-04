package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_对话框;
public abstract class 对话框_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
   public abstract void _F_INIT_EXTERN(MSG_ZHW msg);
     final static int ST_对话框_NORMAL= 3030;
boolean IS_ST_对话框_NORMAL(){ return ST_对话框_NORMAL==STATE;}
final static int 对话框_OK= 22730;
final static int 对话框_OK_RELEASE=  22731;
final static int 对话框_OK_PRESSING=  22732;
final static int  对话框_OK_PRESSED=  22733;
final static int  对话框_OK_ENTER=  22734;
final static int  对话框_OK_LEAVE=  22735;

final static int 对话框_CANCEL= 22740;
final static int 对话框_CANCEL_RELEASE=  22741;
final static int 对话框_CANCEL_PRESSING=  22742;
final static int  对话框_CANCEL_PRESSED=  22743;
final static int  对话框_CANCEL_ENTER=  22744;
final static int  对话框_CANCEL_LEAVE=  22745;


public 对话框_Event() {
      actionMap.putInt("OK",对话框_OK);
      actionMap.putInt("CANCEL",对话框_CANCEL);
	STATE= changeState(STATE,ST_对话框_NORMAL);
	setBindScreen(new Screen_对话框(),SCRN_对话框);
}

public String getScreenName(){
	return  "对话框";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_对话框_NORMAL){
			if(msg.wParam==对话框_OK_RELEASE){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==对话框_CANCEL_RELEASE){
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
