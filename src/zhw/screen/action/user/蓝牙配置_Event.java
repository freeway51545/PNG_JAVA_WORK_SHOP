package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������;
public abstract class ��������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�Ͽ�(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�༭(MSG_ZHW msg);
   public abstract void _F_�绰��(MSG_ZHW msg);
   public abstract void _F_ͨѶ¼(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
     final static int ST_��������= 3027;
boolean IS_ST_��������(){ return ST_��������==STATE;}
final static int ��������_��ҳ= 22490;
final static int ��������_��ҳ_RELEASE=  22491;
final static int ��������_��ҳ_PRESSING=  22492;
final static int  ��������_��ҳ_PRESSED=  22493;
final static int  ��������_��ҳ_ENTER=  22494;
final static int  ��������_��ҳ_LEAVE=  22495;

final static int ��������_����= 22500;
final static int ��������_����_RELEASE=  22501;
final static int ��������_����_PRESSING=  22502;
final static int  ��������_����_PRESSED=  22503;
final static int  ��������_����_ENTER=  22504;
final static int  ��������_����_LEAVE=  22505;

final static int ��������_����= 22510;
final static int ��������_����_RELEASE=  22511;
final static int ��������_����_PRESSING=  22512;
final static int  ��������_����_PRESSED=  22513;
final static int  ��������_����_ENTER=  22514;
final static int  ��������_����_LEAVE=  22515;

final static int ��������_�Ͽ�= 22520;
final static int ��������_�Ͽ�_RELEASE=  22521;
final static int ��������_�Ͽ�_PRESSING=  22522;
final static int  ��������_�Ͽ�_PRESSED=  22523;
final static int  ��������_�Ͽ�_ENTER=  22524;
final static int  ��������_�Ͽ�_LEAVE=  22525;

final static int ��������_��������= 22530;
final static int ��������_��������_RELEASE=  22531;
final static int ��������_��������_PRESSING=  22532;
final static int  ��������_��������_PRESSED=  22533;
final static int  ��������_��������_ENTER=  22534;
final static int  ��������_��������_LEAVE=  22535;

final static int ��������_����= 22540;
final static int ��������_����_RELEASE=  22541;
final static int ��������_����_PRESSING=  22542;
final static int  ��������_����_PRESSED=  22543;
final static int  ��������_����_ENTER=  22544;
final static int  ��������_����_LEAVE=  22545;

final static int ��������_�༭= 22550;
final static int ��������_�༭_RELEASE=  22551;
final static int ��������_�༭_PRESSING=  22552;
final static int  ��������_�༭_PRESSED=  22553;
final static int  ��������_�༭_ENTER=  22554;
final static int  ��������_�༭_LEAVE=  22555;

final static int ��������_�绰��= 22560;
final static int ��������_�绰��_RELEASE=  22561;
final static int ��������_�绰��_PRESSING=  22562;
final static int  ��������_�绰��_PRESSED=  22563;
final static int  ��������_�绰��_ENTER=  22564;
final static int  ��������_�绰��_LEAVE=  22565;

final static int ��������_ͨѶ¼= 22570;
final static int ��������_ͨѶ¼_RELEASE=  22571;
final static int ��������_ͨѶ¼_PRESSING=  22572;
final static int  ��������_ͨѶ¼_PRESSED=  22573;
final static int  ��������_ͨѶ¼_ENTER=  22574;
final static int  ��������_ͨѶ¼_LEAVE=  22575;

final static int ��������_����= 22580;
final static int ��������_����_RELEASE=  22581;
final static int ��������_����_PRESSING=  22582;
final static int  ��������_����_PRESSED=  22583;
final static int  ��������_����_ENTER=  22584;
final static int  ��������_����_LEAVE=  22585;


public ��������_Event() {
      actionMap.putInt("��ҳ",��������_��ҳ);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("�Ͽ�",��������_�Ͽ�);
      actionMap.putInt("��������",��������_��������);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("�༭",��������_�༭);
      actionMap.putInt("�绰��",��������_�绰��);
      actionMap.putInt("ͨѶ¼",��������_ͨѶ¼);
      actionMap.putInt("����",��������_����);
	STATE= changeState(STATE,ST_��������);
	setBindScreen(new Screen_��������(),SCRN_��������);
}

public String getScreenName(){
	return  "��������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��������){
			if(msg.wParam==��������_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�Ͽ�_RELEASE){
				_F_�Ͽ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�༭_RELEASE){
				_F_�༭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�绰��_RELEASE){
				_F_�绰��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ͨѶ¼_RELEASE){
				_F_ͨѶ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
