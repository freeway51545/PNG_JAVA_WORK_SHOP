package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MCU_UPDATE;
public abstract class MCU_UPDATE_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_MCU_UPDATE(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_RETURN_MAIN(MSG_ZHW msg);
     final static int ST_MCU_UPDATE= 3051;
boolean IS_ST_MCU_UPDATE(){ return ST_MCU_UPDATE==STATE;}
final static int MCU_UPDATE_返回按钮= 24660;
final static int MCU_UPDATE_返回按钮_RELEASE=  24661;
final static int MCU_UPDATE_返回按钮_PRESSING=  24662;
final static int  MCU_UPDATE_返回按钮_PRESSED=  24663;
final static int  MCU_UPDATE_返回按钮_ENTER=  24664;
final static int  MCU_UPDATE_返回按钮_LEAVE=  24665;


public MCU_UPDATE_Event() {
      actionMap.putInt("返回按钮",MCU_UPDATE_返回按钮);
	STATE= changeState(STATE,ST_MCU_UPDATE);
	setBindScreen(new Screen_MCU_UPDATE(),SCRN_MCU_UPDATE);
}

public String getScreenName(){
	return  "MCU_UPDATE";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MCU_UPDATE){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_MCU_UPDATE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MCU_UPDATE_返回按钮_RELEASE){
				_F_RETURN_MAIN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
