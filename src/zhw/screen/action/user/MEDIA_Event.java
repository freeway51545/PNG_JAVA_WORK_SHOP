package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MEDIA;
public abstract class MEDIA_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_MEIDA(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�ظ�(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_MEDIA= 3050;
boolean IS_ST_MEDIA(){ return ST_MEDIA==STATE;}
final static int MEDIA_����= 24560;
final static int MEDIA_����_RELEASE=  24561;
final static int MEDIA_����_PRESSING=  24562;
final static int  MEDIA_����_PRESSED=  24563;
final static int  MEDIA_����_ENTER=  24564;
final static int  MEDIA_����_LEAVE=  24565;

final static int MEDIA_��һ��= 24570;
final static int MEDIA_��һ��_RELEASE=  24571;
final static int MEDIA_��һ��_PRESSING=  24572;
final static int  MEDIA_��һ��_PRESSED=  24573;
final static int  MEDIA_��һ��_ENTER=  24574;
final static int  MEDIA_��һ��_LEAVE=  24575;

final static int MEDIA_��һ��= 24580;
final static int MEDIA_��һ��_RELEASE=  24581;
final static int MEDIA_��һ��_PRESSING=  24582;
final static int  MEDIA_��һ��_PRESSED=  24583;
final static int  MEDIA_��һ��_ENTER=  24584;
final static int  MEDIA_��һ��_LEAVE=  24585;

final static int MEDIA_����= 24590;
final static int MEDIA_����_RELEASE=  24591;
final static int MEDIA_����_PRESSING=  24592;
final static int  MEDIA_����_PRESSED=  24593;
final static int  MEDIA_����_ENTER=  24594;
final static int  MEDIA_����_LEAVE=  24595;

final static int MEDIA_����= 24600;
final static int MEDIA_����_RELEASE=  24601;
final static int MEDIA_����_PRESSING=  24602;
final static int  MEDIA_����_PRESSED=  24603;
final static int  MEDIA_����_ENTER=  24604;
final static int  MEDIA_����_LEAVE=  24605;

final static int MEDIA_�ظ�= 24610;
final static int MEDIA_�ظ�_RELEASE=  24611;
final static int MEDIA_�ظ�_PRESSING=  24612;
final static int  MEDIA_�ظ�_PRESSED=  24613;
final static int  MEDIA_�ظ�_ENTER=  24614;
final static int  MEDIA_�ظ�_LEAVE=  24615;

final static int MEDIA_���= 24620;
final static int MEDIA_���_RELEASE=  24621;
final static int MEDIA_���_PRESSING=  24622;
final static int  MEDIA_���_PRESSED=  24623;
final static int  MEDIA_���_ENTER=  24624;
final static int  MEDIA_���_LEAVE=  24625;

final static int MEDIA_�ر�= 24630;
final static int MEDIA_�ر�_RELEASE=  24631;
final static int MEDIA_�ر�_PRESSING=  24632;
final static int  MEDIA_�ر�_PRESSED=  24633;
final static int  MEDIA_�ر�_ENTER=  24634;
final static int  MEDIA_�ر�_LEAVE=  24635;

final static int MEDIA_�����淵��= 24640;
final static int MEDIA_�����淵��_RELEASE=  24641;
final static int MEDIA_�����淵��_PRESSING=  24642;
final static int  MEDIA_�����淵��_PRESSED=  24643;
final static int  MEDIA_�����淵��_ENTER=  24644;
final static int  MEDIA_�����淵��_LEAVE=  24645;

final static int MEDIA_�����б�= 24650;
final static int MEDIA_�����б�_RELEASE=  24651;
final static int MEDIA_�����б�_PRESSING=  24652;
final static int  MEDIA_�����б�_PRESSED=  24653;
final static int  MEDIA_�����б�_ENTER=  24654;
final static int  MEDIA_�����б�_LEAVE=  24655;


public MEDIA_Event() {
      actionMap.putInt("����",MEDIA_����);
      actionMap.putInt("��һ��",MEDIA_��һ��);
      actionMap.putInt("��һ��",MEDIA_��һ��);
      actionMap.putInt("����",MEDIA_����);
      actionMap.putInt("����",MEDIA_����);
      actionMap.putInt("�ظ�",MEDIA_�ظ�);
      actionMap.putInt("���",MEDIA_���);
      actionMap.putInt("�ر�",MEDIA_�ر�);
      actionMap.putInt("�����淵��",MEDIA_�����淵��);
      actionMap.putInt("�����б�",MEDIA_�����б�);
	STATE= changeState(STATE,ST_MEDIA);
	setBindScreen(new Screen_MEDIA(),SCRN_MEDIA);
}

public String getScreenName(){
	return  "MEDIA";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MEDIA){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_MEIDA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_�ظ�_RELEASE){
				_F_�ظ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
