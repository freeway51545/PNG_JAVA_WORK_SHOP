package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_����;
public abstract class ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET_CHE_BIAO(MSG_ZHW msg);
   public abstract void _F_PAGE_UP(MSG_ZHW msg);
   public abstract void _F_PAGE_DOWN(MSG_ZHW msg);
   public abstract void _F_INIT_����(MSG_ZHW msg);
   public abstract void _F_TIMMER_CHECK(MSG_ZHW msg);
   public abstract void _F_ϵͳ����(MSG_ZHW msg);
   public abstract void _F_SD��(MSG_ZHW msg);
     final static int ST_����_NORMAL= 3014;
boolean IS_ST_����_NORMAL(){ return ST_����_NORMAL==STATE;}
     final static int ST_MAKE_CHE_BIAO= 3015;
boolean IS_ST_MAKE_CHE_BIAO(){ return ST_MAKE_CHE_BIAO==STATE;}
final static int ����_��������= 21560;
final static int ����_��������_RELEASE=  21561;
final static int ����_��������_PRESSING=  21562;
final static int  ����_��������_PRESSED=  21563;
final static int  ����_��������_ENTER=  21564;
final static int  ����_��������_LEAVE=  21565;

final static int ����_���ó���= 21570;
final static int ����_���ó���_RELEASE=  21571;
final static int ����_���ó���_PRESSING=  21572;
final static int  ����_���ó���_PRESSED=  21573;
final static int  ����_���ó���_ENTER=  21574;
final static int  ����_���ó���_LEAVE=  21575;

final static int ����_��һҳ= 21580;
final static int ����_��һҳ_RELEASE=  21581;
final static int ����_��һҳ_PRESSING=  21582;
final static int  ����_��һҳ_PRESSED=  21583;
final static int  ����_��һҳ_ENTER=  21584;
final static int  ����_��һҳ_LEAVE=  21585;

final static int ����_��һҳ= 21590;
final static int ����_��һҳ_RELEASE=  21591;
final static int ����_��һҳ_PRESSING=  21592;
final static int  ����_��һҳ_PRESSED=  21593;
final static int  ����_��һҳ_ENTER=  21594;
final static int  ����_��һҳ_LEAVE=  21595;

final static int ����_ϵͳ����= 21600;
final static int ����_ϵͳ����_RELEASE=  21601;
final static int ����_ϵͳ����_PRESSING=  21602;
final static int  ����_ϵͳ����_PRESSED=  21603;
final static int  ����_ϵͳ����_ENTER=  21604;
final static int  ����_ϵͳ����_LEAVE=  21605;

final static int ����_SD��= 21610;
final static int ����_SD��_RELEASE=  21611;
final static int ����_SD��_PRESSING=  21612;
final static int  ����_SD��_PRESSED=  21613;
final static int  ����_SD��_ENTER=  21614;
final static int  ����_SD��_LEAVE=  21615;


public ����_Event() {
      actionMap.putInt("��������",����_��������);
      actionMap.putInt("���ó���",����_���ó���);
      actionMap.putInt("��һҳ",����_��һҳ);
      actionMap.putInt("��һҳ",����_��һҳ);
      actionMap.putInt("ϵͳ����",����_ϵͳ����);
      actionMap.putInt("SD��",����_SD��);
	STATE= changeState(STATE,ST_����_NORMAL);
	setBindScreen(new Screen_����(),SCRN_����);
}

public String getScreenName(){
	return  "����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����_NORMAL){
			if(msg.wParam==����_��������_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==����_���ó���_RELEASE){
				_F_SET_CHE_BIAO(msg);
				STATE=changeState(STATE,ST_MAKE_CHE_BIAO);
				msg.setComsumered();
			}
			if(msg.wParam==����_��һҳ_RELEASE){
				_F_PAGE_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_��һҳ_RELEASE){
				_F_PAGE_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_CHECK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_ϵͳ����_RELEASE){
				_F_ϵͳ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_SD��_RELEASE){
				_F_SD��(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_MAKE_CHE_BIAO){
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
