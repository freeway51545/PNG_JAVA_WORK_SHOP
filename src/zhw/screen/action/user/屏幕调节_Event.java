package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��Ļ����;
public abstract class ��Ļ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_SCREEN(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_RECOVER_DEFAULT(MSG_ZHW msg);
   public abstract void _F_RECOVER_BRIGHT(MSG_ZHW msg);
   public abstract void _F_BACK(MSG_ZHW msg);
     final static int ST_��Ļ����= 3048;
boolean IS_ST_��Ļ����(){ return ST_��Ļ����==STATE;}
final static int ��Ļ����_Ĭ��= 24510;
final static int ��Ļ����_Ĭ��_RELEASE=  24511;
final static int ��Ļ����_Ĭ��_PRESSING=  24512;
final static int  ��Ļ����_Ĭ��_PRESSED=  24513;
final static int  ��Ļ����_Ĭ��_ENTER=  24514;
final static int  ��Ļ����_Ĭ��_LEAVE=  24515;

final static int ��Ļ����_����= 24520;
final static int ��Ļ����_����_RELEASE=  24521;
final static int ��Ļ����_����_PRESSING=  24522;
final static int  ��Ļ����_����_PRESSED=  24523;
final static int  ��Ļ����_����_ENTER=  24524;
final static int  ��Ļ����_����_LEAVE=  24525;

final static int ��Ļ����_����= 24530;
final static int ��Ļ����_����_RELEASE=  24531;
final static int ��Ļ����_����_PRESSING=  24532;
final static int  ��Ļ����_����_PRESSED=  24533;
final static int  ��Ļ����_����_ENTER=  24534;
final static int  ��Ļ����_����_LEAVE=  24535;


public ��Ļ����_Event() {
      actionMap.putInt("Ĭ��",��Ļ����_Ĭ��);
      actionMap.putInt("����",��Ļ����_����);
      actionMap.putInt("����",��Ļ����_����);
	STATE= changeState(STATE,ST_��Ļ����);
	setBindScreen(new Screen_��Ļ����(),SCRN_��Ļ����);
}

public String getScreenName(){
	return  "��Ļ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��Ļ����){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SCREEN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ļ����_Ĭ��_RELEASE){
				_F_RECOVER_DEFAULT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ļ����_����_RELEASE){
				_F_RECOVER_BRIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ļ����_����_RELEASE){
				_F_BACK(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
