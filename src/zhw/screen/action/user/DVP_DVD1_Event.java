package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_DVD1;
public abstract class DVP_DVD1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_DVD1(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_�ظ�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_DVP_DVD1= 3046;
boolean IS_ST_DVP_DVD1(){ return ST_DVP_DVD1==STATE;}
final static int DVP_DVD1_����= 24260;
final static int DVP_DVD1_����_RELEASE=  24261;
final static int DVP_DVD1_����_PRESSING=  24262;
final static int  DVP_DVD1_����_PRESSED=  24263;
final static int  DVP_DVD1_����_ENTER=  24264;
final static int  DVP_DVD1_����_LEAVE=  24265;

final static int DVP_DVD1_��һ��= 24270;
final static int DVP_DVD1_��һ��_RELEASE=  24271;
final static int DVP_DVD1_��һ��_PRESSING=  24272;
final static int  DVP_DVD1_��һ��_PRESSED=  24273;
final static int  DVP_DVD1_��һ��_ENTER=  24274;
final static int  DVP_DVD1_��һ��_LEAVE=  24275;

final static int DVP_DVD1_��һ��= 24280;
final static int DVP_DVD1_��һ��_RELEASE=  24281;
final static int DVP_DVD1_��һ��_PRESSING=  24282;
final static int  DVP_DVD1_��һ��_PRESSED=  24283;
final static int  DVP_DVD1_��һ��_ENTER=  24284;
final static int  DVP_DVD1_��һ��_LEAVE=  24285;

final static int DVP_DVD1_����= 24290;
final static int DVP_DVD1_����_RELEASE=  24291;
final static int DVP_DVD1_����_PRESSING=  24292;
final static int  DVP_DVD1_����_PRESSED=  24293;
final static int  DVP_DVD1_����_ENTER=  24294;
final static int  DVP_DVD1_����_LEAVE=  24295;

final static int DVP_DVD1_��һҳ= 24300;
final static int DVP_DVD1_��һҳ_RELEASE=  24301;
final static int DVP_DVD1_��һҳ_PRESSING=  24302;
final static int  DVP_DVD1_��һҳ_PRESSED=  24303;
final static int  DVP_DVD1_��һҳ_ENTER=  24304;
final static int  DVP_DVD1_��һҳ_LEAVE=  24305;

final static int DVP_DVD1_���= 24310;
final static int DVP_DVD1_���_RELEASE=  24311;
final static int DVP_DVD1_���_PRESSING=  24312;
final static int  DVP_DVD1_���_PRESSED=  24313;
final static int  DVP_DVD1_���_ENTER=  24314;
final static int  DVP_DVD1_���_LEAVE=  24315;

final static int DVP_DVD1_�ظ�= 24320;
final static int DVP_DVD1_�ظ�_RELEASE=  24321;
final static int DVP_DVD1_�ظ�_PRESSING=  24322;
final static int  DVP_DVD1_�ظ�_PRESSED=  24323;
final static int  DVP_DVD1_�ظ�_ENTER=  24324;
final static int  DVP_DVD1_�ظ�_LEAVE=  24325;

final static int DVP_DVD1_�ر�= 24330;
final static int DVP_DVD1_�ر�_RELEASE=  24331;
final static int DVP_DVD1_�ر�_PRESSING=  24332;
final static int  DVP_DVD1_�ر�_PRESSED=  24333;
final static int  DVP_DVD1_�ر�_ENTER=  24334;
final static int  DVP_DVD1_�ر�_LEAVE=  24335;

final static int DVP_DVD1_�����淵��= 24340;
final static int DVP_DVD1_�����淵��_RELEASE=  24341;
final static int DVP_DVD1_�����淵��_PRESSING=  24342;
final static int  DVP_DVD1_�����淵��_PRESSED=  24343;
final static int  DVP_DVD1_�����淵��_ENTER=  24344;
final static int  DVP_DVD1_�����淵��_LEAVE=  24345;

final static int DVP_DVD1_�����б�= 24350;
final static int DVP_DVD1_�����б�_RELEASE=  24351;
final static int DVP_DVD1_�����б�_PRESSING=  24352;
final static int  DVP_DVD1_�����б�_PRESSED=  24353;
final static int  DVP_DVD1_�����б�_ENTER=  24354;
final static int  DVP_DVD1_�����б�_LEAVE=  24355;


public DVP_DVD1_Event() {
      actionMap.putInt("����",DVP_DVD1_����);
      actionMap.putInt("��һ��",DVP_DVD1_��һ��);
      actionMap.putInt("��һ��",DVP_DVD1_��һ��);
      actionMap.putInt("����",DVP_DVD1_����);
      actionMap.putInt("��һҳ",DVP_DVD1_��һҳ);
      actionMap.putInt("���",DVP_DVD1_���);
      actionMap.putInt("�ظ�",DVP_DVD1_�ظ�);
      actionMap.putInt("�ر�",DVP_DVD1_�ر�);
      actionMap.putInt("�����淵��",DVP_DVD1_�����淵��);
      actionMap.putInt("�����б�",DVP_DVD1_�����б�);
	STATE= changeState(STATE,ST_DVP_DVD1);
	setBindScreen(new Screen_DVP_DVD1(),SCRN_DVP_DVD1);
}

public String getScreenName(){
	return  "DVP_DVD1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_DVD1){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_DVD1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_�ظ�_RELEASE){
				_F_�ظ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_DVD1_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
