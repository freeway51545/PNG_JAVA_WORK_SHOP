package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class 导航_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_EXTERN(MSG_ZHW msg);
     final static int ST_导航_NORMAL= 3005;
boolean IS_ST_导航_NORMAL(){ return ST_导航_NORMAL==STATE;}
final static int 导航_RETURN= 20740;
final static int 导航_RETURN_RELEASE=  20741;
final static int 导航_RETURN_PRESSING=  20742;
final static int  导航_RETURN_PRESSED=  20743;
final static int  导航_RETURN_ENTER=  20744;
final static int  导航_RETURN_LEAVE=  20745;


public 导航_Event() {
      actionMap.putInt("RETURN",导航_RETURN);
	STATE= changeState(STATE,ST_导航_NORMAL);
}

public String getScreenName(){
	return  "导航";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_导航_NORMAL){
			if(msg.wParam==导航_RETURN_RELEASE){
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
