package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_�µ绰��;
public abstract class �µ绰��_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�绰��(MSG_ZHW msg);
   public abstract void _F_ͨѶ¼(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
     final static int ST_�µ绰��= 3058;
boolean IS_ST_�µ绰��(){ return ST_�µ绰��==STATE;}
final static int �µ绰��_��ҳ= 25130;
final static int �µ绰��_��ҳ_RELEASE=  25131;
final static int �µ绰��_��ҳ_PRESSING=  25132;
final static int  �µ绰��_��ҳ_PRESSED=  25133;
final static int  �µ绰��_��ҳ_ENTER=  25134;
final static int  �µ绰��_��ҳ_LEAVE=  25135;

final static int �µ绰��_����= 25140;
final static int �µ绰��_����_RELEASE=  25141;
final static int �µ绰��_����_PRESSING=  25142;
final static int  �µ绰��_����_PRESSED=  25143;
final static int  �µ绰��_����_ENTER=  25144;
final static int  �µ绰��_����_LEAVE=  25145;

final static int �µ绰��_����= 25150;
final static int �µ绰��_����_RELEASE=  25151;
final static int �µ绰��_����_PRESSING=  25152;
final static int  �µ绰��_����_PRESSED=  25153;
final static int  �µ绰��_����_ENTER=  25154;
final static int  �µ绰��_����_LEAVE=  25155;

final static int �µ绰��_���= 25160;
final static int �µ绰��_���_RELEASE=  25161;
final static int �µ绰��_���_PRESSING=  25162;
final static int  �µ绰��_���_PRESSED=  25163;
final static int  �µ绰��_���_ENTER=  25164;
final static int  �µ绰��_���_LEAVE=  25165;

final static int �µ绰��_����= 25170;
final static int �µ绰��_����_RELEASE=  25171;
final static int �µ绰��_����_PRESSING=  25172;
final static int  �µ绰��_����_PRESSED=  25173;
final static int  �µ绰��_����_ENTER=  25174;
final static int  �µ绰��_����_LEAVE=  25175;

final static int �µ绰��_����= 25180;
final static int �µ绰��_����_RELEASE=  25181;
final static int �µ绰��_����_PRESSING=  25182;
final static int  �µ绰��_����_PRESSED=  25183;
final static int  �µ绰��_����_ENTER=  25184;
final static int  �µ绰��_����_LEAVE=  25185;

final static int �µ绰��_�绰��= 25190;
final static int �µ绰��_�绰��_RELEASE=  25191;
final static int �µ绰��_�绰��_PRESSING=  25192;
final static int  �µ绰��_�绰��_PRESSED=  25193;
final static int  �µ绰��_�绰��_ENTER=  25194;
final static int  �µ绰��_�绰��_LEAVE=  25195;

final static int �µ绰��_ͨѶ¼= 25200;
final static int �µ绰��_ͨѶ¼_RELEASE=  25201;
final static int �µ绰��_ͨѶ¼_PRESSING=  25202;
final static int  �µ绰��_ͨѶ¼_PRESSED=  25203;
final static int  �µ绰��_ͨѶ¼_ENTER=  25204;
final static int  �µ绰��_ͨѶ¼_LEAVE=  25205;

final static int �µ绰��_����= 25210;
final static int �µ绰��_����_RELEASE=  25211;
final static int �µ绰��_����_PRESSING=  25212;
final static int  �µ绰��_����_PRESSED=  25213;
final static int  �µ绰��_����_ENTER=  25214;
final static int  �µ绰��_����_LEAVE=  25215;

final static int �µ绰��_��������= 25220;
final static int �µ绰��_��������_RELEASE=  25221;
final static int �µ绰��_��������_PRESSING=  25222;
final static int  �µ绰��_��������_PRESSED=  25223;
final static int  �µ绰��_��������_ENTER=  25224;
final static int  �µ绰��_��������_LEAVE=  25225;


public �µ绰��_Event() {
      actionMap.putInt("��ҳ",�µ绰��_��ҳ);
      actionMap.putInt("����",�µ绰��_����);
      actionMap.putInt("����",�µ绰��_����);
      actionMap.putInt("���",�µ绰��_���);
      actionMap.putInt("����",�µ绰��_����);
      actionMap.putInt("����",�µ绰��_����);
      actionMap.putInt("�绰��",�µ绰��_�绰��);
      actionMap.putInt("ͨѶ¼",�µ绰��_ͨѶ¼);
      actionMap.putInt("����",�µ绰��_����);
      actionMap.putInt("��������",�µ绰��_��������);
	STATE= changeState(STATE,ST_�µ绰��);
	setBindScreen(new Screen_�µ绰��(),SCRN_�µ绰��);
}

public String getScreenName(){
	return  "�µ绰��";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_�µ绰��){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_�绰��_RELEASE){
				_F_�绰��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_ͨѶ¼_RELEASE){
				_F_ͨѶ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==�µ绰��_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
