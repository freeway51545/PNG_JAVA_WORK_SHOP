package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_ԭ������;
public abstract class ԭ������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_�ر�(MSG_ZHW msg);
     final static int ST_ԭ������2= 3042;
boolean IS_ST_ԭ������2(){ return ST_ԭ������2==STATE;}
final static int ԭ������_�ر�= 23960;
final static int ԭ������_�ر�_RELEASE=  23961;
final static int ԭ������_�ر�_PRESSING=  23962;
final static int  ԭ������_�ر�_PRESSED=  23963;
final static int  ԭ������_�ر�_ENTER=  23964;
final static int  ԭ������_�ر�_LEAVE=  23965;


public ԭ������_Event() {
      actionMap.putInt("�ر�",ԭ������_�ر�);
	STATE= changeState(STATE,ST_ԭ������2);
	setBindScreen(new Screen_ԭ������(),SCRN_ԭ������);
}

public String getScreenName(){
	return  "ԭ������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ԭ������2){
			if(msg.wParam==ԭ������_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
