package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��Ƶ����;
public abstract class ��Ƶ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_��Ƶ����(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_ҡ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�ֳ�(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�ŵ�(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_ƽ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
     final static int ST_��Ƶ����= 3052;
boolean IS_ST_��Ƶ����(){ return ST_��Ƶ����==STATE;}
final static int ��Ƶ����_�ر�= 24670;
final static int ��Ƶ����_�ر�_RELEASE=  24671;
final static int ��Ƶ����_�ر�_PRESSING=  24672;
final static int  ��Ƶ����_�ر�_PRESSED=  24673;
final static int  ��Ƶ����_�ر�_ENTER=  24674;
final static int  ��Ƶ����_�ر�_LEAVE=  24675;

final static int ��Ƶ����_ҡ��= 24680;
final static int ��Ƶ����_ҡ��_RELEASE=  24681;
final static int ��Ƶ����_ҡ��_PRESSING=  24682;
final static int  ��Ƶ����_ҡ��_PRESSED=  24683;
final static int  ��Ƶ����_ҡ��_ENTER=  24684;
final static int  ��Ƶ����_ҡ��_LEAVE=  24685;

final static int ��Ƶ����_����= 24690;
final static int ��Ƶ����_����_RELEASE=  24691;
final static int ��Ƶ����_����_PRESSING=  24692;
final static int  ��Ƶ����_����_PRESSED=  24693;
final static int  ��Ƶ����_����_ENTER=  24694;
final static int  ��Ƶ����_����_LEAVE=  24695;

final static int ��Ƶ����_�ֳ�= 24700;
final static int ��Ƶ����_�ֳ�_RELEASE=  24701;
final static int ��Ƶ����_�ֳ�_PRESSING=  24702;
final static int  ��Ƶ����_�ֳ�_PRESSED=  24703;
final static int  ��Ƶ����_�ֳ�_ENTER=  24704;
final static int  ��Ƶ����_�ֳ�_LEAVE=  24705;

final static int ��Ƶ����_����= 24710;
final static int ��Ƶ����_����_RELEASE=  24711;
final static int ��Ƶ����_����_PRESSING=  24712;
final static int  ��Ƶ����_����_PRESSED=  24713;
final static int  ��Ƶ����_����_ENTER=  24714;
final static int  ��Ƶ����_����_LEAVE=  24715;

final static int ��Ƶ����_�ŵ�= 24720;
final static int ��Ƶ����_�ŵ�_RELEASE=  24721;
final static int ��Ƶ����_�ŵ�_PRESSING=  24722;
final static int  ��Ƶ����_�ŵ�_PRESSED=  24723;
final static int  ��Ƶ����_�ŵ�_ENTER=  24724;
final static int  ��Ƶ����_�ŵ�_LEAVE=  24725;

final static int ��Ƶ����_���= 24730;
final static int ��Ƶ����_���_RELEASE=  24731;
final static int ��Ƶ����_���_PRESSING=  24732;
final static int  ��Ƶ����_���_PRESSED=  24733;
final static int  ��Ƶ����_���_ENTER=  24734;
final static int  ��Ƶ����_���_LEAVE=  24735;

final static int ��Ƶ����_����= 24740;
final static int ��Ƶ����_����_RELEASE=  24741;
final static int ��Ƶ����_����_PRESSING=  24742;
final static int  ��Ƶ����_����_PRESSED=  24743;
final static int  ��Ƶ����_����_ENTER=  24744;
final static int  ��Ƶ����_����_LEAVE=  24745;

final static int ��Ƶ����_ƽ��= 24750;
final static int ��Ƶ����_ƽ��_RELEASE=  24751;
final static int ��Ƶ����_ƽ��_PRESSING=  24752;
final static int  ��Ƶ����_ƽ��_PRESSED=  24753;
final static int  ��Ƶ����_ƽ��_ENTER=  24754;
final static int  ��Ƶ����_ƽ��_LEAVE=  24755;

final static int ��Ƶ����_����= 24760;
final static int ��Ƶ����_����_RELEASE=  24761;
final static int ��Ƶ����_����_PRESSING=  24762;
final static int  ��Ƶ����_����_PRESSED=  24763;
final static int  ��Ƶ����_����_ENTER=  24764;
final static int  ��Ƶ����_����_LEAVE=  24765;

final static int ��Ƶ����_��ҳ= 24770;
final static int ��Ƶ����_��ҳ_RELEASE=  24771;
final static int ��Ƶ����_��ҳ_PRESSING=  24772;
final static int  ��Ƶ����_��ҳ_PRESSED=  24773;
final static int  ��Ƶ����_��ҳ_ENTER=  24774;
final static int  ��Ƶ����_��ҳ_LEAVE=  24775;


public ��Ƶ����_Event() {
      actionMap.putInt("�ر�",��Ƶ����_�ر�);
      actionMap.putInt("ҡ��",��Ƶ����_ҡ��);
      actionMap.putInt("����",��Ƶ����_����);
      actionMap.putInt("�ֳ�",��Ƶ����_�ֳ�);
      actionMap.putInt("����",��Ƶ����_����);
      actionMap.putInt("�ŵ�",��Ƶ����_�ŵ�);
      actionMap.putInt("���",��Ƶ����_���);
      actionMap.putInt("����",��Ƶ����_����);
      actionMap.putInt("ƽ��",��Ƶ����_ƽ��);
      actionMap.putInt("����",��Ƶ����_����);
      actionMap.putInt("��ҳ",��Ƶ����_��ҳ);
	STATE= changeState(STATE,ST_��Ƶ����);
	setBindScreen(new Screen_��Ƶ����(),SCRN_��Ƶ����);
}

public String getScreenName(){
	return  "��Ƶ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��Ƶ����){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_��Ƶ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_ҡ��_RELEASE){
				_F_ҡ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_�ֳ�_RELEASE){
				_F_�ֳ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_�ŵ�_RELEASE){
				_F_�ŵ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_ƽ��_RELEASE){
				_F_ƽ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
