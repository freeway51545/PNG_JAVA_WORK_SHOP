package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_����;
public abstract class ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_MSG_ENTER_SCRN(MSG_ZHW msg);
   public abstract void _F_CANCEL(MSG_ZHW msg);
     final static int ST_����= 3032;
boolean IS_ST_����(){ return ST_����==STATE;}
final static int ����_C= 22760;
final static int ����_C_RELEASE=  22761;
final static int ����_C_PRESSING=  22762;
final static int  ����_C_PRESSED=  22763;
final static int  ����_C_ENTER=  22764;
final static int  ����_C_LEAVE=  22765;


public ����_Event() {
      actionMap.putInt("C",����_C);
	STATE= changeState(STATE,ST_����);
	setBindScreen(new Screen_����(),SCRN_����);
}

public String getScreenName(){
	return  "����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_MSG_ENTER_SCRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_C_RELEASE){
				_F_CANCEL(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
