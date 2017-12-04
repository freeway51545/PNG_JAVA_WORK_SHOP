package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class 声音_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
     final static int ST_SX_NORMAL= 3024;
boolean IS_ST_SX_NORMAL(){ return ST_SX_NORMAL==STATE;}
final static int 声音_返回= 22140;
final static int 声音_返回_RELEASE=  22141;
final static int 声音_返回_PRESSING=  22142;
final static int  声音_返回_PRESSED=  22143;
final static int  声音_返回_ENTER=  22144;
final static int  声音_返回_LEAVE=  22145;


public 声音_Event() {
      actionMap.putInt("返回",声音_返回);
	STATE= changeState(STATE,ST_SX_NORMAL);
}

public String getScreenName(){
	return  "声音";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_SX_NORMAL){
			if(msg.wParam==声音_返回_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
