package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������;
public abstract class ��������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_PREV(MSG_ZHW msg);
   public abstract void _F_PAUSE(MSG_ZHW msg);
   public abstract void _F_PLAY(MSG_ZHW msg);
   public abstract void _F_STOP_PLAY(MSG_ZHW msg);
   public abstract void _F_NEXT(MSG_ZHW msg);
   public abstract void _F_INIT_BTYY(MSG_ZHW msg);
   public abstract void _F_RETURN_RELEASE(MSG_ZHW msg);
   public abstract void _F_�л�(MSG_ZHW msg);
   public abstract void _F_VOL_PLUS(MSG_ZHW msg);
   public abstract void _F_VOL_SUB(MSG_ZHW msg);
   public abstract void _F_RETURN_BT(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
     final static int ST_��������_NORMAL= 3016;
boolean IS_ST_��������_NORMAL(){ return ST_��������_NORMAL==STATE;}
final static int ��������_��һ��= 21620;
final static int ��������_��һ��_RELEASE=  21621;
final static int ��������_��һ��_PRESSING=  21622;
final static int  ��������_��һ��_PRESSED=  21623;
final static int  ��������_��һ��_ENTER=  21624;
final static int  ��������_��һ��_LEAVE=  21625;

final static int ��������_��ͣ= 21630;
final static int ��������_��ͣ_RELEASE=  21631;
final static int ��������_��ͣ_PRESSING=  21632;
final static int  ��������_��ͣ_PRESSED=  21633;
final static int  ��������_��ͣ_ENTER=  21634;
final static int  ��������_��ͣ_LEAVE=  21635;

final static int ��������_����= 21640;
final static int ��������_����_RELEASE=  21641;
final static int ��������_����_PRESSING=  21642;
final static int  ��������_����_PRESSED=  21643;
final static int  ��������_����_ENTER=  21644;
final static int  ��������_����_LEAVE=  21645;

final static int ��������_ֹͣ= 21650;
final static int ��������_ֹͣ_RELEASE=  21651;
final static int ��������_ֹͣ_PRESSING=  21652;
final static int  ��������_ֹͣ_PRESSED=  21653;
final static int  ��������_ֹͣ_ENTER=  21654;
final static int  ��������_ֹͣ_LEAVE=  21655;

final static int ��������_��һ��= 21660;
final static int ��������_��һ��_RELEASE=  21661;
final static int ��������_��һ��_PRESSING=  21662;
final static int  ��������_��һ��_PRESSED=  21663;
final static int  ��������_��һ��_ENTER=  21664;
final static int  ��������_��һ��_LEAVE=  21665;

final static int ��������_��������= 21670;
final static int ��������_��������_RELEASE=  21671;
final static int ��������_��������_PRESSING=  21672;
final static int  ��������_��������_PRESSED=  21673;
final static int  ��������_��������_ENTER=  21674;
final static int  ��������_��������_LEAVE=  21675;

final static int ��������_�л�= 21680;
final static int ��������_�л�_RELEASE=  21681;
final static int ��������_�л�_PRESSING=  21682;
final static int  ��������_�л�_PRESSED=  21683;
final static int  ��������_�л�_ENTER=  21684;
final static int  ��������_�л�_LEAVE=  21685;

final static int ��������_����_PLUS= 21690;
final static int ��������_����_PLUS_RELEASE=  21691;
final static int ��������_����_PLUS_PRESSING=  21692;
final static int  ��������_����_PLUS_PRESSED=  21693;
final static int  ��������_����_PLUS_ENTER=  21694;
final static int  ��������_����_PLUS_LEAVE=  21695;

final static int ��������_����_SUB= 21700;
final static int ��������_����_SUB_RELEASE=  21701;
final static int ��������_����_SUB_PRESSING=  21702;
final static int  ��������_����_SUB_PRESSED=  21703;
final static int  ��������_����_SUB_ENTER=  21704;
final static int  ��������_����_SUB_LEAVE=  21705;

final static int ��������_��������= 21710;
final static int ��������_��������_RELEASE=  21711;
final static int ��������_��������_PRESSING=  21712;
final static int  ��������_��������_PRESSED=  21713;
final static int  ��������_��������_ENTER=  21714;
final static int  ��������_��������_LEAVE=  21715;

final static int ��������_�ر�= 21720;
final static int ��������_�ر�_RELEASE=  21721;
final static int ��������_�ر�_PRESSING=  21722;
final static int  ��������_�ر�_PRESSED=  21723;
final static int  ��������_�ر�_ENTER=  21724;
final static int  ��������_�ر�_LEAVE=  21725;


public ��������_Event() {
      actionMap.putInt("��һ��",��������_��һ��);
      actionMap.putInt("��ͣ",��������_��ͣ);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("ֹͣ",��������_ֹͣ);
      actionMap.putInt("��һ��",��������_��һ��);
      actionMap.putInt("��������",��������_��������);
      actionMap.putInt("�л�",��������_�л�);
      actionMap.putInt("����_PLUS",��������_����_PLUS);
      actionMap.putInt("����_SUB",��������_����_SUB);
      actionMap.putInt("��������",��������_��������);
      actionMap.putInt("�ر�",��������_�ر�);
	STATE= changeState(STATE,ST_��������_NORMAL);
	setBindScreen(new Screen_��������(),SCRN_��������);
}

public String getScreenName(){
	return  "��������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��������_NORMAL){
			if(msg.wParam==��������_��һ��_RELEASE){
				_F_PREV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��ͣ_RELEASE){
				_F_PAUSE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ֹͣ_RELEASE){
				_F_STOP_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��һ��_RELEASE){
				_F_NEXT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BTYY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��������_RELEASE){
				_F_RETURN_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�л�_RELEASE){
				_F_�л�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_PLUS_RELEASE){
				_F_VOL_PLUS(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_SUB_RELEASE){
				_F_VOL_SUB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��������_RELEASE){
				_F_RETURN_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
