package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_FS;
public abstract class DVP_FS_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_FS(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_�ظ�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
     final static int ST_DVP_FS= 3053;
boolean IS_ST_DVP_FS(){ return ST_DVP_FS==STATE;}
final static int DVP_FS_����= 24780;
final static int DVP_FS_����_RELEASE=  24781;
final static int DVP_FS_����_PRESSING=  24782;
final static int  DVP_FS_����_PRESSED=  24783;
final static int  DVP_FS_����_ENTER=  24784;
final static int  DVP_FS_����_LEAVE=  24785;

final static int DVP_FS_��һ��= 24790;
final static int DVP_FS_��һ��_RELEASE=  24791;
final static int DVP_FS_��һ��_PRESSING=  24792;
final static int  DVP_FS_��һ��_PRESSED=  24793;
final static int  DVP_FS_��һ��_ENTER=  24794;
final static int  DVP_FS_��һ��_LEAVE=  24795;

final static int DVP_FS_��һ��= 24800;
final static int DVP_FS_��һ��_RELEASE=  24801;
final static int DVP_FS_��һ��_PRESSING=  24802;
final static int  DVP_FS_��һ��_PRESSED=  24803;
final static int  DVP_FS_��һ��_ENTER=  24804;
final static int  DVP_FS_��һ��_LEAVE=  24805;

final static int DVP_FS_����= 24810;
final static int DVP_FS_����_RELEASE=  24811;
final static int DVP_FS_����_PRESSING=  24812;
final static int  DVP_FS_����_PRESSED=  24813;
final static int  DVP_FS_����_ENTER=  24814;
final static int  DVP_FS_����_LEAVE=  24815;

final static int DVP_FS_����= 24820;
final static int DVP_FS_����_RELEASE=  24821;
final static int DVP_FS_����_PRESSING=  24822;
final static int  DVP_FS_����_PRESSED=  24823;
final static int  DVP_FS_����_ENTER=  24824;
final static int  DVP_FS_����_LEAVE=  24825;

final static int DVP_FS_���= 24830;
final static int DVP_FS_���_RELEASE=  24831;
final static int DVP_FS_���_PRESSING=  24832;
final static int  DVP_FS_���_PRESSED=  24833;
final static int  DVP_FS_���_ENTER=  24834;
final static int  DVP_FS_���_LEAVE=  24835;

final static int DVP_FS_�ظ�= 24840;
final static int DVP_FS_�ظ�_RELEASE=  24841;
final static int DVP_FS_�ظ�_PRESSING=  24842;
final static int  DVP_FS_�ظ�_PRESSED=  24843;
final static int  DVP_FS_�ظ�_ENTER=  24844;
final static int  DVP_FS_�ظ�_LEAVE=  24845;

final static int DVP_FS_�ر�= 24850;
final static int DVP_FS_�ر�_RELEASE=  24851;
final static int DVP_FS_�ر�_PRESSING=  24852;
final static int  DVP_FS_�ر�_PRESSED=  24853;
final static int  DVP_FS_�ر�_ENTER=  24854;
final static int  DVP_FS_�ر�_LEAVE=  24855;

final static int DVP_FS_�����淵��= 24860;
final static int DVP_FS_�����淵��_RELEASE=  24861;
final static int DVP_FS_�����淵��_PRESSING=  24862;
final static int  DVP_FS_�����淵��_PRESSED=  24863;
final static int  DVP_FS_�����淵��_ENTER=  24864;
final static int  DVP_FS_�����淵��_LEAVE=  24865;

final static int DVP_FS_�����б�= 24870;
final static int DVP_FS_�����б�_RELEASE=  24871;
final static int DVP_FS_�����б�_PRESSING=  24872;
final static int  DVP_FS_�����б�_PRESSED=  24873;
final static int  DVP_FS_�����б�_ENTER=  24874;
final static int  DVP_FS_�����б�_LEAVE=  24875;


public DVP_FS_Event() {
      actionMap.putInt("����",DVP_FS_����);
      actionMap.putInt("��һ��",DVP_FS_��һ��);
      actionMap.putInt("��һ��",DVP_FS_��һ��);
      actionMap.putInt("����",DVP_FS_����);
      actionMap.putInt("����",DVP_FS_����);
      actionMap.putInt("���",DVP_FS_���);
      actionMap.putInt("�ظ�",DVP_FS_�ظ�);
      actionMap.putInt("�ر�",DVP_FS_�ر�);
      actionMap.putInt("�����淵��",DVP_FS_�����淵��);
      actionMap.putInt("�����б�",DVP_FS_�����б�);
	STATE= changeState(STATE,ST_DVP_FS);
	setBindScreen(new Screen_DVP_FS(),SCRN_DVP_FS);
}

public String getScreenName(){
	return  "DVP_FS";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_FS){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_FS(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_�ظ�_RELEASE){
				_F_�ظ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_�����淵��_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
