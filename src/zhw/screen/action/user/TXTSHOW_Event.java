package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_TXTSHOW;
public abstract class TXTSHOW_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_EXTERN(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
     final static int ST_ShowTxt_NORMAL= 3029;
boolean IS_ST_ShowTxt_NORMAL(){ return ST_ShowTxt_NORMAL==STATE;}
final static int TXTSHOW_����= 22710;
final static int TXTSHOW_����_RELEASE=  22711;
final static int TXTSHOW_����_PRESSING=  22712;
final static int  TXTSHOW_����_PRESSED=  22713;
final static int  TXTSHOW_����_ENTER=  22714;
final static int  TXTSHOW_����_LEAVE=  22715;

final static int TXTSHOW_��ҳ= 22720;
final static int TXTSHOW_��ҳ_RELEASE=  22721;
final static int TXTSHOW_��ҳ_PRESSING=  22722;
final static int  TXTSHOW_��ҳ_PRESSED=  22723;
final static int  TXTSHOW_��ҳ_ENTER=  22724;
final static int  TXTSHOW_��ҳ_LEAVE=  22725;


public TXTSHOW_Event() {
      actionMap.putInt("����",TXTSHOW_����);
      actionMap.putInt("��ҳ",TXTSHOW_��ҳ);
	STATE= changeState(STATE,ST_ShowTxt_NORMAL);
	setBindScreen(new Screen_TXTSHOW(),SCRN_TXTSHOW);
}

public String getScreenName(){
	return  "TXTSHOW";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ShowTxt_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_EXTERN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==TXTSHOW_����_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==TXTSHOW_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
