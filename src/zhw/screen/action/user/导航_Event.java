package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_EXTERN(MSG_ZHW msg);
     final static int ST_����_NORMAL= 3005;
boolean IS_ST_����_NORMAL(){ return ST_����_NORMAL==STATE;}
final static int ����_RETURN= 20740;
final static int ����_RETURN_RELEASE=  20741;
final static int ����_RETURN_PRESSING=  20742;
final static int  ����_RETURN_PRESSED=  20743;
final static int  ����_RETURN_ENTER=  20744;
final static int  ����_RETURN_LEAVE=  20745;


public ����_Event() {
      actionMap.putInt("RETURN",����_RETURN);
	STATE= changeState(STATE,ST_����_NORMAL);
}

public String getScreenName(){
	return  "����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����_NORMAL){
			if(msg.wParam==����_RETURN_RELEASE){
				TO_SCRN(getMainScreen());
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
