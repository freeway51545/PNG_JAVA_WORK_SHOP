package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_LOAD_PROCESS;
public abstract class LOAD_PROCESS_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_MAIN_TIMMER(MSG_ZHW msg);
     final static int ST_LOAD_PROCESS_NORMAL_NORMAL= 3024;
boolean IS_ST_LOAD_PROCESS_NORMAL_NORMAL(){ return ST_LOAD_PROCESS_NORMAL_NORMAL==STATE;}
final static int LOAD_PROCESS_取消= 22330;
final static int LOAD_PROCESS_取消_RELEASE=  22331;
final static int LOAD_PROCESS_取消_PRESSING=  22332;
final static int  LOAD_PROCESS_取消_PRESSED=  22333;
final static int  LOAD_PROCESS_取消_ENTER=  22334;
final static int  LOAD_PROCESS_取消_LEAVE=  22335;


public LOAD_PROCESS_Event() {
      actionMap.putInt("取消",LOAD_PROCESS_取消);
	STATE= changeState(STATE,ST_LOAD_PROCESS_NORMAL_NORMAL);
	setBindScreen(new Screen_LOAD_PROCESS(),SCRN_LOAD_PROCESS);
}

public String getScreenName(){
	return  "LOAD_PROCESS";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_LOAD_PROCESS_NORMAL_NORMAL){
			if(msg.wParam==LOAD_PROCESS_取消_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_MAIN_TIMMER(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
