package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_NullScreen;
public abstract class NullScreen_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_AUX(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_��Ļ����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
     final static int ST_NULL_NORMAL_NORMAL= 3017;
boolean IS_ST_NULL_NORMAL_NORMAL(){ return ST_NULL_NORMAL_NORMAL==STATE;}
final static int NullScreen_��Ļ����= 21730;
final static int NullScreen_��Ļ����_RELEASE=  21731;
final static int NullScreen_��Ļ����_PRESSING=  21732;
final static int  NullScreen_��Ļ����_PRESSED=  21733;
final static int  NullScreen_��Ļ����_ENTER=  21734;
final static int  NullScreen_��Ļ����_LEAVE=  21735;

final static int NullScreen_����= 21740;
final static int NullScreen_����_RELEASE=  21741;
final static int NullScreen_����_PRESSING=  21742;
final static int  NullScreen_����_PRESSED=  21743;
final static int  NullScreen_����_ENTER=  21744;
final static int  NullScreen_����_LEAVE=  21745;

final static int NullScreen_�ر�= 21750;
final static int NullScreen_�ر�_RELEASE=  21751;
final static int NullScreen_�ر�_PRESSING=  21752;
final static int  NullScreen_�ر�_PRESSED=  21753;
final static int  NullScreen_�ر�_ENTER=  21754;
final static int  NullScreen_�ر�_LEAVE=  21755;


public NullScreen_Event() {
      actionMap.putInt("��Ļ����",NullScreen_��Ļ����);
      actionMap.putInt("����",NullScreen_����);
      actionMap.putInt("�ر�",NullScreen_�ر�);
	STATE= changeState(STATE,ST_NULL_NORMAL_NORMAL);
	setBindScreen(new Screen_NullScreen(),SCRN_NullScreen);
}

public String getScreenName(){
	return  "NullScreen";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_NULL_NORMAL_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_AUX(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_��Ļ����_RELEASE){
				_F_��Ļ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==NullScreen_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
