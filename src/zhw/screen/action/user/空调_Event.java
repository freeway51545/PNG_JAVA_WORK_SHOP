package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�յ�;
public abstract class �յ�_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_MSG_ENTER_SCRN(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_�յ���ʵ= 3031;
boolean IS_ST_�յ���ʵ(){ return ST_�յ���ʵ==STATE;}
final static int �յ�_C= 22750;
final static int �յ�_C_RELEASE=  22751;
final static int �յ�_C_PRESSING=  22752;
final static int  �յ�_C_PRESSED=  22753;
final static int  �յ�_C_ENTER=  22754;
final static int  �յ�_C_LEAVE=  22755;


public �յ�_Event() {
      actionMap.putInt("C",�յ�_C);
	STATE= changeState(STATE,ST_�յ���ʵ);
	setBindScreen(new Screen_�յ�(),SCRN_�յ�);
}

public String getScreenName(){
	return  "�յ�";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�յ���ʵ){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_MSG_ENTER_SCRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�յ�_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
