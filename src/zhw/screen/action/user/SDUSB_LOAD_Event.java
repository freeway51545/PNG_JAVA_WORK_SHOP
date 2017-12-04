package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_SDUSB_LOAD;
public abstract class SDUSB_LOAD_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_SDUSB_LOAD(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
     final static int ST_SDUSB_LOAD= 3056;
boolean IS_ST_SDUSB_LOAD(){ return ST_SDUSB_LOAD==STATE;}
final static int SDUSB_LOAD_取消= 25010;
final static int SDUSB_LOAD_取消_RELEASE=  25011;
final static int SDUSB_LOAD_取消_PRESSING=  25012;
final static int  SDUSB_LOAD_取消_PRESSED=  25013;
final static int  SDUSB_LOAD_取消_ENTER=  25014;
final static int  SDUSB_LOAD_取消_LEAVE=  25015;


public SDUSB_LOAD_Event() {
      actionMap.putInt("取消",SDUSB_LOAD_取消);
	STATE= changeState(STATE,ST_SDUSB_LOAD);
	setBindScreen(new Screen_SDUSB_LOAD(),SCRN_SDUSB_LOAD);
}

public String getScreenName(){
	return  "SDUSB_LOAD";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_SDUSB_LOAD){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SDUSB_LOAD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==SDUSB_LOAD_取消_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
