package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_VCD;
public abstract class DVP_VCD_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_VCD(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_PBC(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_�ظ�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_DVP_VCD= 3045;
boolean IS_ST_DVP_VCD(){ return ST_DVP_VCD==STATE;}
final static int DVP_VCD_����= 24150;
final static int DVP_VCD_����_RELEASE=  24151;
final static int DVP_VCD_����_PRESSING=  24152;
final static int  DVP_VCD_����_PRESSED=  24153;
final static int  DVP_VCD_����_ENTER=  24154;
final static int  DVP_VCD_����_LEAVE=  24155;

final static int DVP_VCD_��һ��= 24160;
final static int DVP_VCD_��һ��_RELEASE=  24161;
final static int DVP_VCD_��һ��_PRESSING=  24162;
final static int  DVP_VCD_��һ��_PRESSED=  24163;
final static int  DVP_VCD_��һ��_ENTER=  24164;
final static int  DVP_VCD_��һ��_LEAVE=  24165;

final static int DVP_VCD_��һ��= 24170;
final static int DVP_VCD_��һ��_RELEASE=  24171;
final static int DVP_VCD_��һ��_PRESSING=  24172;
final static int  DVP_VCD_��һ��_PRESSED=  24173;
final static int  DVP_VCD_��һ��_ENTER=  24174;
final static int  DVP_VCD_��һ��_LEAVE=  24175;

final static int DVP_VCD_PBC= 24180;
final static int DVP_VCD_PBC_RELEASE=  24181;
final static int DVP_VCD_PBC_PRESSING=  24182;
final static int  DVP_VCD_PBC_PRESSED=  24183;
final static int  DVP_VCD_PBC_ENTER=  24184;
final static int  DVP_VCD_PBC_LEAVE=  24185;

final static int DVP_VCD_����= 24190;
final static int DVP_VCD_����_RELEASE=  24191;
final static int DVP_VCD_����_PRESSING=  24192;
final static int  DVP_VCD_����_PRESSED=  24193;
final static int  DVP_VCD_����_ENTER=  24194;
final static int  DVP_VCD_����_LEAVE=  24195;

final static int DVP_VCD_����= 24200;
final static int DVP_VCD_����_RELEASE=  24201;
final static int DVP_VCD_����_PRESSING=  24202;
final static int  DVP_VCD_����_PRESSED=  24203;
final static int  DVP_VCD_����_ENTER=  24204;
final static int  DVP_VCD_����_LEAVE=  24205;

final static int DVP_VCD_���= 24210;
final static int DVP_VCD_���_RELEASE=  24211;
final static int DVP_VCD_���_PRESSING=  24212;
final static int  DVP_VCD_���_PRESSED=  24213;
final static int  DVP_VCD_���_ENTER=  24214;
final static int  DVP_VCD_���_LEAVE=  24215;

final static int DVP_VCD_�ظ�= 24220;
final static int DVP_VCD_�ظ�_RELEASE=  24221;
final static int DVP_VCD_�ظ�_PRESSING=  24222;
final static int  DVP_VCD_�ظ�_PRESSED=  24223;
final static int  DVP_VCD_�ظ�_ENTER=  24224;
final static int  DVP_VCD_�ظ�_LEAVE=  24225;

final static int DVP_VCD_�ر�= 24230;
final static int DVP_VCD_�ر�_RELEASE=  24231;
final static int DVP_VCD_�ر�_PRESSING=  24232;
final static int  DVP_VCD_�ر�_PRESSED=  24233;
final static int  DVP_VCD_�ر�_ENTER=  24234;
final static int  DVP_VCD_�ر�_LEAVE=  24235;

final static int DVP_VCD_�����淵��= 24240;
final static int DVP_VCD_�����淵��_RELEASE=  24241;
final static int DVP_VCD_�����淵��_PRESSING=  24242;
final static int  DVP_VCD_�����淵��_PRESSED=  24243;
final static int  DVP_VCD_�����淵��_ENTER=  24244;
final static int  DVP_VCD_�����淵��_LEAVE=  24245;

final static int DVP_VCD_�����б�= 24250;
final static int DVP_VCD_�����б�_RELEASE=  24251;
final static int DVP_VCD_�����б�_PRESSING=  24252;
final static int  DVP_VCD_�����б�_PRESSED=  24253;
final static int  DVP_VCD_�����б�_ENTER=  24254;
final static int  DVP_VCD_�����б�_LEAVE=  24255;


public DVP_VCD_Event() {
      actionMap.putInt("����",DVP_VCD_����);
      actionMap.putInt("��һ��",DVP_VCD_��һ��);
      actionMap.putInt("��һ��",DVP_VCD_��һ��);
      actionMap.putInt("PBC",DVP_VCD_PBC);
      actionMap.putInt("����",DVP_VCD_����);
      actionMap.putInt("����",DVP_VCD_����);
      actionMap.putInt("���",DVP_VCD_���);
      actionMap.putInt("�ظ�",DVP_VCD_�ظ�);
      actionMap.putInt("�ر�",DVP_VCD_�ر�);
      actionMap.putInt("�����淵��",DVP_VCD_�����淵��);
      actionMap.putInt("�����б�",DVP_VCD_�����б�);
	STATE= changeState(STATE,ST_DVP_VCD);
	setBindScreen(new Screen_DVP_VCD(),SCRN_DVP_VCD);
}

public String getScreenName(){
	return  "DVP_VCD";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_VCD){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_VCD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_PBC_RELEASE){
				_F_PBC(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_�ظ�_RELEASE){
				_F_�ظ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_VCD_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
