package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MEDIA_PIC;
public abstract class MEDIA_PIC_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_MEIDA_PIC(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_ֹͣ(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_MEDIA_PIC= 3055;
boolean IS_ST_MEDIA_PIC(){ return ST_MEDIA_PIC==STATE;}
final static int MEDIA_PIC_����= 24940;
final static int MEDIA_PIC_����_RELEASE=  24941;
final static int MEDIA_PIC_����_PRESSING=  24942;
final static int  MEDIA_PIC_����_PRESSED=  24943;
final static int  MEDIA_PIC_����_ENTER=  24944;
final static int  MEDIA_PIC_����_LEAVE=  24945;

final static int MEDIA_PIC_��һ��= 24950;
final static int MEDIA_PIC_��һ��_RELEASE=  24951;
final static int MEDIA_PIC_��һ��_PRESSING=  24952;
final static int  MEDIA_PIC_��һ��_PRESSED=  24953;
final static int  MEDIA_PIC_��һ��_ENTER=  24954;
final static int  MEDIA_PIC_��һ��_LEAVE=  24955;

final static int MEDIA_PIC_��һ��= 24960;
final static int MEDIA_PIC_��һ��_RELEASE=  24961;
final static int MEDIA_PIC_��һ��_PRESSING=  24962;
final static int  MEDIA_PIC_��һ��_PRESSED=  24963;
final static int  MEDIA_PIC_��һ��_ENTER=  24964;
final static int  MEDIA_PIC_��һ��_LEAVE=  24965;

final static int MEDIA_PIC_ֹͣ= 24970;
final static int MEDIA_PIC_ֹͣ_RELEASE=  24971;
final static int MEDIA_PIC_ֹͣ_PRESSING=  24972;
final static int  MEDIA_PIC_ֹͣ_PRESSED=  24973;
final static int  MEDIA_PIC_ֹͣ_ENTER=  24974;
final static int  MEDIA_PIC_ֹͣ_LEAVE=  24975;

final static int MEDIA_PIC_�ر�= 24980;
final static int MEDIA_PIC_�ر�_RELEASE=  24981;
final static int MEDIA_PIC_�ر�_PRESSING=  24982;
final static int  MEDIA_PIC_�ر�_PRESSED=  24983;
final static int  MEDIA_PIC_�ر�_ENTER=  24984;
final static int  MEDIA_PIC_�ر�_LEAVE=  24985;

final static int MEDIA_PIC_�����淵��= 24990;
final static int MEDIA_PIC_�����淵��_RELEASE=  24991;
final static int MEDIA_PIC_�����淵��_PRESSING=  24992;
final static int  MEDIA_PIC_�����淵��_PRESSED=  24993;
final static int  MEDIA_PIC_�����淵��_ENTER=  24994;
final static int  MEDIA_PIC_�����淵��_LEAVE=  24995;

final static int MEDIA_PIC_�����б�= 25000;
final static int MEDIA_PIC_�����б�_RELEASE=  25001;
final static int MEDIA_PIC_�����б�_PRESSING=  25002;
final static int  MEDIA_PIC_�����б�_PRESSED=  25003;
final static int  MEDIA_PIC_�����б�_ENTER=  25004;
final static int  MEDIA_PIC_�����б�_LEAVE=  25005;


public MEDIA_PIC_Event() {
      actionMap.putInt("����",MEDIA_PIC_����);
      actionMap.putInt("��һ��",MEDIA_PIC_��һ��);
      actionMap.putInt("��һ��",MEDIA_PIC_��һ��);
      actionMap.putInt("ֹͣ",MEDIA_PIC_ֹͣ);
      actionMap.putInt("�ر�",MEDIA_PIC_�ر�);
      actionMap.putInt("�����淵��",MEDIA_PIC_�����淵��);
      actionMap.putInt("�����б�",MEDIA_PIC_�����б�);
	STATE= changeState(STATE,ST_MEDIA_PIC);
	setBindScreen(new Screen_MEDIA_PIC(),SCRN_MEDIA_PIC);
}

public String getScreenName(){
	return  "MEDIA_PIC";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MEDIA_PIC){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_MEIDA_PIC(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_ֹͣ_RELEASE){
				_F_ֹͣ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MEDIA_PIC_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
