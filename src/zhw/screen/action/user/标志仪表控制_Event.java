package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��־�Ǳ����;
public abstract class ��־�Ǳ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_selected(String a,MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_�Ǳ����= 3040;
boolean IS_ST_�Ǳ����(){ return ST_�Ǳ����==STATE;}
final static int ��־�Ǳ����_SD= 23720;
final static int ��־�Ǳ����_SD_RELEASE=  23721;
final static int ��־�Ǳ����_SD_PRESSING=  23722;
final static int  ��־�Ǳ����_SD_PRESSED=  23723;
final static int  ��־�Ǳ����_SD_ENTER=  23724;
final static int  ��־�Ǳ����_SD_LEAVE=  23725;

final static int ��־�Ǳ����_������= 23730;
final static int ��־�Ǳ����_������_RELEASE=  23731;
final static int ��־�Ǳ����_������_PRESSING=  23732;
final static int  ��־�Ǳ����_������_PRESSED=  23733;
final static int  ��־�Ǳ����_������_ENTER=  23734;
final static int  ��־�Ǳ����_������_LEAVE=  23735;

final static int ��־�Ǳ����_DVD= 23740;
final static int ��־�Ǳ����_DVD_RELEASE=  23741;
final static int ��־�Ǳ����_DVD_PRESSING=  23742;
final static int  ��־�Ǳ����_DVD_PRESSED=  23743;
final static int  ��־�Ǳ����_DVD_ENTER=  23744;
final static int  ��־�Ǳ����_DVD_LEAVE=  23745;

final static int ��־�Ǳ����_ģʽ= 23750;
final static int ��־�Ǳ����_ģʽ_RELEASE=  23751;
final static int ��־�Ǳ����_ģʽ_PRESSING=  23752;
final static int  ��־�Ǳ����_ģʽ_PRESSED=  23753;
final static int  ��־�Ǳ����_ģʽ_ENTER=  23754;
final static int  ��־�Ǳ����_ģʽ_LEAVE=  23755;

final static int ��־�Ǳ����_��= 23760;
final static int ��־�Ǳ����_��_RELEASE=  23761;
final static int ��־�Ǳ����_��_PRESSING=  23762;
final static int  ��־�Ǳ����_��_PRESSED=  23763;
final static int  ��־�Ǳ����_��_ENTER=  23764;
final static int  ��־�Ǳ����_��_LEAVE=  23765;

final static int ��־�Ǳ����_��ɫ= 23770;
final static int ��־�Ǳ����_��ɫ_RELEASE=  23771;
final static int ��־�Ǳ����_��ɫ_PRESSING=  23772;
final static int  ��־�Ǳ����_��ɫ_PRESSED=  23773;
final static int  ��־�Ǳ����_��ɫ_ENTER=  23774;
final static int  ��־�Ǳ����_��ɫ_LEAVE=  23775;

final static int ��־�Ǳ����_��= 23780;
final static int ��־�Ǳ����_��_RELEASE=  23781;
final static int ��־�Ǳ����_��_PRESSING=  23782;
final static int  ��־�Ǳ����_��_PRESSED=  23783;
final static int  ��־�Ǳ����_��_ENTER=  23784;
final static int  ��־�Ǳ����_��_LEAVE=  23785;

final static int ��־�Ǳ����_OK= 23790;
final static int ��־�Ǳ����_OK_RELEASE=  23791;
final static int ��־�Ǳ����_OK_PRESSING=  23792;
final static int  ��־�Ǳ����_OK_PRESSED=  23793;
final static int  ��־�Ǳ����_OK_ENTER=  23794;
final static int  ��־�Ǳ����_OK_LEAVE=  23795;

final static int ��־�Ǳ����_��= 23800;
final static int ��־�Ǳ����_��_RELEASE=  23801;
final static int ��־�Ǳ����_��_PRESSING=  23802;
final static int  ��־�Ǳ����_��_PRESSED=  23803;
final static int  ��־�Ǳ����_��_ENTER=  23804;
final static int  ��־�Ǳ����_��_LEAVE=  23805;

final static int ��־�Ǳ����_�˵�= 23810;
final static int ��־�Ǳ����_�˵�_RELEASE=  23811;
final static int ��־�Ǳ����_�˵�_PRESSING=  23812;
final static int  ��־�Ǳ����_�˵�_PRESSED=  23813;
final static int  ��־�Ǳ����_�˵�_ENTER=  23814;
final static int  ��־�Ǳ����_�˵�_LEAVE=  23815;

final static int ��־�Ǳ����_��= 23820;
final static int ��־�Ǳ����_��_RELEASE=  23821;
final static int ��־�Ǳ����_��_PRESSING=  23822;
final static int  ��־�Ǳ����_��_PRESSED=  23823;
final static int  ��־�Ǳ����_��_ENTER=  23824;
final static int  ��־�Ǳ����_��_LEAVE=  23825;

final static int ��־�Ǳ����_�˳�= 23830;
final static int ��־�Ǳ����_�˳�_RELEASE=  23831;
final static int ��־�Ǳ����_�˳�_PRESSING=  23832;
final static int  ��־�Ǳ����_�˳�_PRESSED=  23833;
final static int  ��־�Ǳ����_�˳�_ENTER=  23834;
final static int  ��־�Ǳ����_�˳�_LEAVE=  23835;


public ��־�Ǳ����_Event() {
      actionMap.putInt("SD",��־�Ǳ����_SD);
      actionMap.putInt("������",��־�Ǳ����_������);
      actionMap.putInt("DVD",��־�Ǳ����_DVD);
      actionMap.putInt("ģʽ",��־�Ǳ����_ģʽ);
      actionMap.putInt("��",��־�Ǳ����_��);
      actionMap.putInt("��ɫ",��־�Ǳ����_��ɫ);
      actionMap.putInt("��",��־�Ǳ����_��);
      actionMap.putInt("OK",��־�Ǳ����_OK);
      actionMap.putInt("��",��־�Ǳ����_��);
      actionMap.putInt("�˵�",��־�Ǳ����_�˵�);
      actionMap.putInt("��",��־�Ǳ����_��);
      actionMap.putInt("�˳�",��־�Ǳ����_�˳�);
	STATE= changeState(STATE,ST_�Ǳ����);
	setBindScreen(new Screen_��־�Ǳ����(),SCRN_��־�Ǳ����);
}

public String getScreenName(){
	return  "��־�Ǳ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�Ǳ����){
			if(msg.wParam==��־�Ǳ����_SD_RELEASE){
				_F_selected("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_������_RELEASE){
				_F_selected("������",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_DVD_RELEASE){
				_F_selected("DVD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_ģʽ_RELEASE){
				_F_selected("ģʽ",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��ɫ_RELEASE){
				_F_selected("��ɫ",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_OK_RELEASE){
				_F_selected("OK",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_�˵�_RELEASE){
				_F_selected("�˵�",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_RELEASE){
				_F_selected("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_�˳�_RELEASE){
				_F_selected("�˳�",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_SD_PRESSED){
				_F_PRESSED("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_������_PRESSED){
				_F_PRESSED("������",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_DVD_PRESSED){
				_F_PRESSED("DVD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_ģʽ_PRESSED){
				_F_PRESSED("ģʽ",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_PRESSED){
				_F_PRESSED("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��ɫ_PRESSED){
				_F_PRESSED("��ɫ",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_PRESSED){
				_F_PRESSED("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_OK_PRESSED){
				_F_PRESSED("OK",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_PRESSED){
				_F_PRESSED("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_�˵�_PRESSED){
				_F_PRESSED("�˵�",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_��_PRESSED){
				_F_PRESSED("SD",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��־�Ǳ����_�˳�_PRESSED){
				_F_PRESSED("�˳�",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
