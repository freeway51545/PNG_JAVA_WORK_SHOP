package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_原车蓝牙;
public abstract class 原车蓝牙_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_关闭(MSG_ZHW msg);
     final static int ST_原车蓝牙2= 3042;
boolean IS_ST_原车蓝牙2(){ return ST_原车蓝牙2==STATE;}
final static int 原车蓝牙_关闭= 23960;
final static int 原车蓝牙_关闭_RELEASE=  23961;
final static int 原车蓝牙_关闭_PRESSING=  23962;
final static int  原车蓝牙_关闭_PRESSED=  23963;
final static int  原车蓝牙_关闭_ENTER=  23964;
final static int  原车蓝牙_关闭_LEAVE=  23965;


public 原车蓝牙_Event() {
      actionMap.putInt("关闭",原车蓝牙_关闭);
	STATE= changeState(STATE,ST_原车蓝牙2);
	setBindScreen(new Screen_原车蓝牙(),SCRN_原车蓝牙);
}

public String getScreenName(){
	return  "原车蓝牙";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_原车蓝牙2){
			if(msg.wParam==原车蓝牙_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
