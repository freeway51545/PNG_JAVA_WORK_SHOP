package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_ԭ��������USB;
public abstract class ԭ��������USB_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ACTION(String a,MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_ԭ��������USB= 3041;
boolean IS_ST_ԭ��������USB(){ return ST_ԭ��������USB==STATE;}
final static int ԭ��������USB_��= 23840;
final static int ԭ��������USB_��_RELEASE=  23841;
final static int ԭ��������USB_��_PRESSING=  23842;
final static int  ԭ��������USB_��_PRESSED=  23843;
final static int  ԭ��������USB_��_ENTER=  23844;
final static int  ԭ��������USB_��_LEAVE=  23845;

final static int ԭ��������USB_�ر�= 23850;
final static int ԭ��������USB_�ر�_RELEASE=  23851;
final static int ԭ��������USB_�ر�_PRESSING=  23852;
final static int  ԭ��������USB_�ر�_PRESSED=  23853;
final static int  ԭ��������USB_�ر�_ENTER=  23854;
final static int  ԭ��������USB_�ر�_LEAVE=  23855;

final static int ԭ��������USB_ѭ��= 23860;
final static int ԭ��������USB_ѭ��_RELEASE=  23861;
final static int ԭ��������USB_ѭ��_PRESSING=  23862;
final static int  ԭ��������USB_ѭ��_PRESSED=  23863;
final static int  ԭ��������USB_ѭ��_ENTER=  23864;
final static int  ԭ��������USB_ѭ��_LEAVE=  23865;

final static int ԭ��������USB_���= 23870;
final static int ԭ��������USB_���_RELEASE=  23871;
final static int ԭ��������USB_���_PRESSING=  23872;
final static int  ԭ��������USB_���_PRESSED=  23873;
final static int  ԭ��������USB_���_ENTER=  23874;
final static int  ԭ��������USB_���_LEAVE=  23875;

final static int ԭ��������USB_��һ��= 23880;
final static int ԭ��������USB_��һ��_RELEASE=  23881;
final static int ԭ��������USB_��һ��_PRESSING=  23882;
final static int  ԭ��������USB_��һ��_PRESSED=  23883;
final static int  ԭ��������USB_��һ��_ENTER=  23884;
final static int  ԭ��������USB_��һ��_LEAVE=  23885;

final static int ԭ��������USB_����= 23890;
final static int ԭ��������USB_����_RELEASE=  23891;
final static int ԭ��������USB_����_PRESSING=  23892;
final static int  ԭ��������USB_����_PRESSED=  23893;
final static int  ԭ��������USB_����_ENTER=  23894;
final static int  ԭ��������USB_����_LEAVE=  23895;

final static int ԭ��������USB_ֹͣ= 23900;
final static int ԭ��������USB_ֹͣ_RELEASE=  23901;
final static int ԭ��������USB_ֹͣ_PRESSING=  23902;
final static int  ԭ��������USB_ֹͣ_PRESSED=  23903;
final static int  ԭ��������USB_ֹͣ_ENTER=  23904;
final static int  ԭ��������USB_ֹͣ_LEAVE=  23905;

final static int ԭ��������USB_��һ��= 23910;
final static int ԭ��������USB_��һ��_RELEASE=  23911;
final static int ԭ��������USB_��һ��_PRESSING=  23912;
final static int  ԭ��������USB_��һ��_PRESSED=  23913;
final static int  ԭ��������USB_��һ��_ENTER=  23914;
final static int  ԭ��������USB_��һ��_LEAVE=  23915;

final static int ԭ��������USB_����= 23920;
final static int ԭ��������USB_����_RELEASE=  23921;
final static int ԭ��������USB_����_PRESSING=  23922;
final static int  ԭ��������USB_����_PRESSED=  23923;
final static int  ԭ��������USB_����_ENTER=  23924;
final static int  ԭ��������USB_����_LEAVE=  23925;

final static int ԭ��������USB_��һ�ļ���= 23930;
final static int ԭ��������USB_��һ�ļ���_RELEASE=  23931;
final static int ԭ��������USB_��һ�ļ���_PRESSING=  23932;
final static int  ԭ��������USB_��һ�ļ���_PRESSED=  23933;
final static int  ԭ��������USB_��һ�ļ���_ENTER=  23934;
final static int  ԭ��������USB_��һ�ļ���_LEAVE=  23935;

final static int ԭ��������USB_��һ�ļ���= 23940;
final static int ԭ��������USB_��һ�ļ���_RELEASE=  23941;
final static int ԭ��������USB_��һ�ļ���_PRESSING=  23942;
final static int  ԭ��������USB_��һ�ļ���_PRESSED=  23943;
final static int  ԭ��������USB_��һ�ļ���_ENTER=  23944;
final static int  ԭ��������USB_��һ�ļ���_LEAVE=  23945;

final static int ԭ��������USB_���= 23950;
final static int ԭ��������USB_���_RELEASE=  23951;
final static int ԭ��������USB_���_PRESSING=  23952;
final static int  ԭ��������USB_���_PRESSED=  23953;
final static int  ԭ��������USB_���_ENTER=  23954;
final static int  ԭ��������USB_���_LEAVE=  23955;


public ԭ��������USB_Event() {
      actionMap.putInt("��",ԭ��������USB_��);
      actionMap.putInt("�ر�",ԭ��������USB_�ر�);
      actionMap.putInt("ѭ��",ԭ��������USB_ѭ��);
      actionMap.putInt("���",ԭ��������USB_���);
      actionMap.putInt("��һ��",ԭ��������USB_��һ��);
      actionMap.putInt("����",ԭ��������USB_����);
      actionMap.putInt("ֹͣ",ԭ��������USB_ֹͣ);
      actionMap.putInt("��һ��",ԭ��������USB_��һ��);
      actionMap.putInt("����",ԭ��������USB_����);
      actionMap.putInt("��һ�ļ���",ԭ��������USB_��һ�ļ���);
      actionMap.putInt("��һ�ļ���",ԭ��������USB_��һ�ļ���);
      actionMap.putInt("���",ԭ��������USB_���);
	STATE= changeState(STATE,ST_ԭ��������USB);
	setBindScreen(new Screen_ԭ��������USB(),SCRN_ԭ��������USB);
}

public String getScreenName(){
	return  "ԭ��������USB";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ԭ��������USB){
			if(msg.wParam==ԭ��������USB_��_RELEASE){
				_F_ACTION("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_�ر�_RELEASE){
				_F_ACTION("�ر�",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_ѭ��_RELEASE){
				_F_ACTION("ѭ��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_���_RELEASE){
				_F_ACTION("���",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_��һ��_RELEASE){
				_F_ACTION("��һ��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_����_RELEASE){
				_F_ACTION("����",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_ֹͣ_RELEASE){
				_F_ACTION("ֹͣ",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_��һ��_RELEASE){
				_F_ACTION("��һ��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_����_RELEASE){
				_F_ACTION("����",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_��һ�ļ���_RELEASE){
				_F_ACTION("��һ�ļ���",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_��һ�ļ���_RELEASE){
				_F_ACTION("��һ�ļ���",msg);
				msg.setComsumered();
			}
			if(msg.wParam==ԭ��������USB_���_RELEASE){
				_F_ACTION("���",msg);
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
