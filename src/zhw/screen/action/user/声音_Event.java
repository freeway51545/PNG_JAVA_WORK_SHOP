package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
     final static int ST_SX_NORMAL= 3024;
boolean IS_ST_SX_NORMAL(){ return ST_SX_NORMAL==STATE;}
final static int ����_����= 22140;
final static int ����_����_RELEASE=  22141;
final static int ����_����_PRESSING=  22142;
final static int  ����_����_PRESSED=  22143;
final static int  ����_����_ENTER=  22144;
final static int  ����_����_LEAVE=  22145;


public ����_Event() {
      actionMap.putInt("����",����_����);
	STATE= changeState(STATE,ST_SX_NORMAL);
}

public String getScreenName(){
	return  "����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_SX_NORMAL){
			if(msg.wParam==����_����_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
