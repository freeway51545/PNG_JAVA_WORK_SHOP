package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��ʾ����;
public abstract class ��ʾ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET_����(MSG_ZHW msg);
   public abstract void _F_SET_���(MSG_ZHW msg);
   public abstract void _F_SET_��׼(MSG_ZHW msg);
   public abstract void _F_SET_�û�(MSG_ZHW msg);
   public abstract void _F_��_SET(MSG_ZHW msg);
   public abstract void _F_��_SET(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
     final static int ST_��ʾ����_NORMAL= 3003;
boolean IS_ST_��ʾ����_NORMAL(){ return ST_��ʾ����_NORMAL==STATE;}
final static int ��ʾ����_��ʾ����= 20310;
final static int ��ʾ����_��ʾ����_RELEASE=  20311;
final static int ��ʾ����_��ʾ����_PRESSING=  20312;
final static int  ��ʾ����_��ʾ����_PRESSED=  20313;
final static int  ��ʾ����_��ʾ����_ENTER=  20314;
final static int  ��ʾ����_��ʾ����_LEAVE=  20315;

final static int ��ʾ����_��Ƶ����= 20320;
final static int ��ʾ����_��Ƶ����_RELEASE=  20321;
final static int ��ʾ����_��Ƶ����_PRESSING=  20322;
final static int  ��ʾ����_��Ƶ����_PRESSED=  20323;
final static int  ��ʾ����_��Ƶ����_ENTER=  20324;
final static int  ��ʾ����_��Ƶ����_LEAVE=  20325;

final static int ��ʾ����_ϵͳ����= 20330;
final static int ��ʾ����_ϵͳ����_RELEASE=  20331;
final static int ��ʾ����_ϵͳ����_PRESSING=  20332;
final static int  ��ʾ����_ϵͳ����_PRESSED=  20333;
final static int  ��ʾ����_ϵͳ����_ENTER=  20334;
final static int  ��ʾ����_ϵͳ����_LEAVE=  20335;

final static int ��ʾ����_����������= 20340;
final static int ��ʾ����_����������_RELEASE=  20341;
final static int ��ʾ����_����������_PRESSING=  20342;
final static int  ��ʾ����_����������_PRESSED=  20343;
final static int  ��ʾ����_����������_ENTER=  20344;
final static int  ��ʾ����_����������_LEAVE=  20345;

final static int ��ʾ����_��������= 20350;
final static int ��ʾ����_��������_RELEASE=  20351;
final static int ��ʾ����_��������_PRESSING=  20352;
final static int  ��ʾ����_��������_PRESSED=  20353;
final static int  ��ʾ����_��������_ENTER=  20354;
final static int  ��ʾ����_��������_LEAVE=  20355;

final static int ��ʾ����_����= 20360;
final static int ��ʾ����_����_RELEASE=  20361;
final static int ��ʾ����_����_PRESSING=  20362;
final static int  ��ʾ����_����_PRESSED=  20363;
final static int  ��ʾ����_����_ENTER=  20364;
final static int  ��ʾ����_����_LEAVE=  20365;

final static int ��ʾ����_���= 20370;
final static int ��ʾ����_���_RELEASE=  20371;
final static int ��ʾ����_���_PRESSING=  20372;
final static int  ��ʾ����_���_PRESSED=  20373;
final static int  ��ʾ����_���_ENTER=  20374;
final static int  ��ʾ����_���_LEAVE=  20375;

final static int ��ʾ����_��׼= 20380;
final static int ��ʾ����_��׼_RELEASE=  20381;
final static int ��ʾ����_��׼_PRESSING=  20382;
final static int  ��ʾ����_��׼_PRESSED=  20383;
final static int  ��ʾ����_��׼_ENTER=  20384;
final static int  ��ʾ����_��׼_LEAVE=  20385;

final static int ��ʾ����_�û�= 20390;
final static int ��ʾ����_�û�_RELEASE=  20391;
final static int ��ʾ����_�û�_PRESSING=  20392;
final static int  ��ʾ����_�û�_PRESSED=  20393;
final static int  ��ʾ����_�û�_ENTER=  20394;
final static int  ��ʾ����_�û�_LEAVE=  20395;

final static int ��ʾ����_��= 20400;
final static int ��ʾ����_��_RELEASE=  20401;
final static int ��ʾ����_��_PRESSING=  20402;
final static int  ��ʾ����_��_PRESSED=  20403;
final static int  ��ʾ����_��_ENTER=  20404;
final static int  ��ʾ����_��_LEAVE=  20405;

final static int ��ʾ����_��= 20410;
final static int ��ʾ����_��_RELEASE=  20411;
final static int ��ʾ����_��_PRESSING=  20412;
final static int  ��ʾ����_��_PRESSED=  20413;
final static int  ��ʾ����_��_ENTER=  20414;
final static int  ��ʾ����_��_LEAVE=  20415;


public ��ʾ����_Event() {
      actionMap.putInt("��ʾ����",��ʾ����_��ʾ����);
      actionMap.putInt("��Ƶ����",��ʾ����_��Ƶ����);
      actionMap.putInt("ϵͳ����",��ʾ����_ϵͳ����);
      actionMap.putInt("����������",��ʾ����_����������);
      actionMap.putInt("��������",��ʾ����_��������);
      actionMap.putInt("����",��ʾ����_����);
      actionMap.putInt("���",��ʾ����_���);
      actionMap.putInt("��׼",��ʾ����_��׼);
      actionMap.putInt("�û�",��ʾ����_�û�);
      actionMap.putInt("��",��ʾ����_��);
      actionMap.putInt("��",��ʾ����_��);
	STATE= changeState(STATE,ST_��ʾ����_NORMAL);
	setBindScreen(new Screen_��ʾ����(),SCRN_��ʾ����);
}

public String getScreenName(){
	return  "��ʾ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��ʾ����_NORMAL){
			if(msg.wParam==��ʾ����_��ʾ����_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_��Ƶ����_RELEASE){
				TO_SCRN(SCRN_��Ƶ����);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_ϵͳ����_RELEASE){
				TO_SCRN(SCRN_ϵͳ����);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_����������_RELEASE){
				TO_SCRN(SCRN_����������);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_��������_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_����_RELEASE){
				_F_SET_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_���_RELEASE){
				_F_SET_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_��׼_RELEASE){
				_F_SET_��׼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_�û�_RELEASE){
				_F_SET_�û�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_��_RELEASE){
				_F_��_SET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ʾ����_��_RELEASE){
				_F_��_SET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_EnerFunction(MSG_ZHW msg){
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
