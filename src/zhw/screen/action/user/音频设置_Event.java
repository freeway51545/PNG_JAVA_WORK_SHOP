package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��Ƶ����;
public abstract class ��Ƶ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ǰ(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_����_LEFT(MSG_ZHW msg);
   public abstract void _F_����_RIGHT(MSG_ZHW msg);
   public abstract void _F_����_LEFT(MSG_ZHW msg);
   public abstract void _F_����_RIGHT(MSG_ZHW msg);
   public abstract void _F_LOUD_ON(MSG_ZHW msg);
   public abstract void _F_LOUD_OFF(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_ҡ��(MSG_ZHW msg);
   public abstract void _F_��ʿ(MSG_ZHW msg);
   public abstract void _F_�ŵ�(MSG_ZHW msg);
   public abstract void _F_��׼(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_RETURN_MAIN(MSG_ZHW msg);
   public abstract void _F_MSG_KEY_EVENT(MSG_ZHW msg);
     final static int ST_��Ƶ����_NORMAL= 3004;
boolean IS_ST_��Ƶ����_NORMAL(){ return ST_��Ƶ����_NORMAL==STATE;}
final static int ��Ƶ����_��ʾ����= 20420;
final static int ��Ƶ����_��ʾ����_RELEASE=  20421;
final static int ��Ƶ����_��ʾ����_PRESSING=  20422;
final static int  ��Ƶ����_��ʾ����_PRESSED=  20423;
final static int  ��Ƶ����_��ʾ����_ENTER=  20424;
final static int  ��Ƶ����_��ʾ����_LEAVE=  20425;

final static int ��Ƶ����_��Ƶ����= 20430;
final static int ��Ƶ����_��Ƶ����_RELEASE=  20431;
final static int ��Ƶ����_��Ƶ����_PRESSING=  20432;
final static int  ��Ƶ����_��Ƶ����_PRESSED=  20433;
final static int  ��Ƶ����_��Ƶ����_ENTER=  20434;
final static int  ��Ƶ����_��Ƶ����_LEAVE=  20435;

final static int ��Ƶ����_ϵͳ����= 20440;
final static int ��Ƶ����_ϵͳ����_RELEASE=  20441;
final static int ��Ƶ����_ϵͳ����_PRESSING=  20442;
final static int  ��Ƶ����_ϵͳ����_PRESSED=  20443;
final static int  ��Ƶ����_ϵͳ����_ENTER=  20444;
final static int  ��Ƶ����_ϵͳ����_LEAVE=  20445;

final static int ��Ƶ����_����������= 20450;
final static int ��Ƶ����_����������_RELEASE=  20451;
final static int ��Ƶ����_����������_PRESSING=  20452;
final static int  ��Ƶ����_����������_PRESSED=  20453;
final static int  ��Ƶ����_����������_ENTER=  20454;
final static int  ��Ƶ����_����������_LEAVE=  20455;

final static int ��Ƶ����_��������= 20460;
final static int ��Ƶ����_��������_RELEASE=  20461;
final static int ��Ƶ����_��������_PRESSING=  20462;
final static int  ��Ƶ����_��������_PRESSED=  20463;
final static int  ��Ƶ����_��������_ENTER=  20464;
final static int  ��Ƶ����_��������_LEAVE=  20465;

final static int ��Ƶ����_ǰ= 20470;
final static int ��Ƶ����_ǰ_RELEASE=  20471;
final static int ��Ƶ����_ǰ_PRESSING=  20472;
final static int  ��Ƶ����_ǰ_PRESSED=  20473;
final static int  ��Ƶ����_ǰ_ENTER=  20474;
final static int  ��Ƶ����_ǰ_LEAVE=  20475;

final static int ��Ƶ����_��= 20480;
final static int ��Ƶ����_��_RELEASE=  20481;
final static int ��Ƶ����_��_PRESSING=  20482;
final static int  ��Ƶ����_��_PRESSED=  20483;
final static int  ��Ƶ����_��_ENTER=  20484;
final static int  ��Ƶ����_��_LEAVE=  20485;

final static int ��Ƶ����_��= 20490;
final static int ��Ƶ����_��_RELEASE=  20491;
final static int ��Ƶ����_��_PRESSING=  20492;
final static int  ��Ƶ����_��_PRESSED=  20493;
final static int  ��Ƶ����_��_ENTER=  20494;
final static int  ��Ƶ����_��_LEAVE=  20495;

final static int ��Ƶ����_��= 20500;
final static int ��Ƶ����_��_RELEASE=  20501;
final static int ��Ƶ����_��_PRESSING=  20502;
final static int  ��Ƶ����_��_PRESSED=  20503;
final static int  ��Ƶ����_��_ENTER=  20504;
final static int  ��Ƶ����_��_LEAVE=  20505;

final static int ��Ƶ����_����_LEFT= 20510;
final static int ��Ƶ����_����_LEFT_RELEASE=  20511;
final static int ��Ƶ����_����_LEFT_PRESSING=  20512;
final static int  ��Ƶ����_����_LEFT_PRESSED=  20513;
final static int  ��Ƶ����_����_LEFT_ENTER=  20514;
final static int  ��Ƶ����_����_LEFT_LEAVE=  20515;

final static int ��Ƶ����_����_RIGHT= 20520;
final static int ��Ƶ����_����_RIGHT_RELEASE=  20521;
final static int ��Ƶ����_����_RIGHT_PRESSING=  20522;
final static int  ��Ƶ����_����_RIGHT_PRESSED=  20523;
final static int  ��Ƶ����_����_RIGHT_ENTER=  20524;
final static int  ��Ƶ����_����_RIGHT_LEAVE=  20525;

final static int ��Ƶ����_����_LEFT= 20530;
final static int ��Ƶ����_����_LEFT_RELEASE=  20531;
final static int ��Ƶ����_����_LEFT_PRESSING=  20532;
final static int  ��Ƶ����_����_LEFT_PRESSED=  20533;
final static int  ��Ƶ����_����_LEFT_ENTER=  20534;
final static int  ��Ƶ����_����_LEFT_LEAVE=  20535;

final static int ��Ƶ����_����_RIGHT= 20540;
final static int ��Ƶ����_����_RIGHT_RELEASE=  20541;
final static int ��Ƶ����_����_RIGHT_PRESSING=  20542;
final static int  ��Ƶ����_����_RIGHT_PRESSED=  20543;
final static int  ��Ƶ����_����_RIGHT_ENTER=  20544;
final static int  ��Ƶ����_����_RIGHT_LEAVE=  20545;

final static int ��Ƶ����_LOUD_ON= 20550;
final static int ��Ƶ����_LOUD_ON_RELEASE=  20551;
final static int ��Ƶ����_LOUD_ON_PRESSING=  20552;
final static int  ��Ƶ����_LOUD_ON_PRESSED=  20553;
final static int  ��Ƶ����_LOUD_ON_ENTER=  20554;
final static int  ��Ƶ����_LOUD_ON_LEAVE=  20555;

final static int ��Ƶ����_LOUD_OFF= 20560;
final static int ��Ƶ����_LOUD_OFF_RELEASE=  20561;
final static int ��Ƶ����_LOUD_OFF_PRESSING=  20562;
final static int  ��Ƶ����_LOUD_OFF_PRESSED=  20563;
final static int  ��Ƶ����_LOUD_OFF_ENTER=  20564;
final static int  ��Ƶ����_LOUD_OFF_LEAVE=  20565;

final static int ��Ƶ����_����= 20570;
final static int ��Ƶ����_����_RELEASE=  20571;
final static int ��Ƶ����_����_PRESSING=  20572;
final static int  ��Ƶ����_����_PRESSED=  20573;
final static int  ��Ƶ����_����_ENTER=  20574;
final static int  ��Ƶ����_����_LEAVE=  20575;

final static int ��Ƶ����_ҡ��= 20580;
final static int ��Ƶ����_ҡ��_RELEASE=  20581;
final static int ��Ƶ����_ҡ��_PRESSING=  20582;
final static int  ��Ƶ����_ҡ��_PRESSED=  20583;
final static int  ��Ƶ����_ҡ��_ENTER=  20584;
final static int  ��Ƶ����_ҡ��_LEAVE=  20585;

final static int ��Ƶ����_��ʿ= 20590;
final static int ��Ƶ����_��ʿ_RELEASE=  20591;
final static int ��Ƶ����_��ʿ_PRESSING=  20592;
final static int  ��Ƶ����_��ʿ_PRESSED=  20593;
final static int  ��Ƶ����_��ʿ_ENTER=  20594;
final static int  ��Ƶ����_��ʿ_LEAVE=  20595;

final static int ��Ƶ����_�ŵ�= 20600;
final static int ��Ƶ����_�ŵ�_RELEASE=  20601;
final static int ��Ƶ����_�ŵ�_PRESSING=  20602;
final static int  ��Ƶ����_�ŵ�_PRESSED=  20603;
final static int  ��Ƶ����_�ŵ�_ENTER=  20604;
final static int  ��Ƶ����_�ŵ�_LEAVE=  20605;

final static int ��Ƶ����_��׼= 20610;
final static int ��Ƶ����_��׼_RELEASE=  20611;
final static int ��Ƶ����_��׼_PRESSING=  20612;
final static int  ��Ƶ����_��׼_PRESSED=  20613;
final static int  ��Ƶ����_��׼_ENTER=  20614;
final static int  ��Ƶ����_��׼_LEAVE=  20615;

final static int ��Ƶ����_���ذ�ť= 20620;
final static int ��Ƶ����_���ذ�ť_RELEASE=  20621;
final static int ��Ƶ����_���ذ�ť_PRESSING=  20622;
final static int  ��Ƶ����_���ذ�ť_PRESSED=  20623;
final static int  ��Ƶ����_���ذ�ť_ENTER=  20624;
final static int  ��Ƶ����_���ذ�ť_LEAVE=  20625;


public ��Ƶ����_Event() {
      actionMap.putInt("��ʾ����",��Ƶ����_��ʾ����);
      actionMap.putInt("��Ƶ����",��Ƶ����_��Ƶ����);
      actionMap.putInt("ϵͳ����",��Ƶ����_ϵͳ����);
      actionMap.putInt("����������",��Ƶ����_����������);
      actionMap.putInt("��������",��Ƶ����_��������);
      actionMap.putInt("ǰ",��Ƶ����_ǰ);
      actionMap.putInt("��",��Ƶ����_��);
      actionMap.putInt("��",��Ƶ����_��);
      actionMap.putInt("��",��Ƶ����_��);
      actionMap.putInt("����_LEFT",��Ƶ����_����_LEFT);
      actionMap.putInt("����_RIGHT",��Ƶ����_����_RIGHT);
      actionMap.putInt("����_LEFT",��Ƶ����_����_LEFT);
      actionMap.putInt("����_RIGHT",��Ƶ����_����_RIGHT);
      actionMap.putInt("LOUD_ON",��Ƶ����_LOUD_ON);
      actionMap.putInt("LOUD_OFF",��Ƶ����_LOUD_OFF);
      actionMap.putInt("����",��Ƶ����_����);
      actionMap.putInt("ҡ��",��Ƶ����_ҡ��);
      actionMap.putInt("��ʿ",��Ƶ����_��ʿ);
      actionMap.putInt("�ŵ�",��Ƶ����_�ŵ�);
      actionMap.putInt("��׼",��Ƶ����_��׼);
      actionMap.putInt("���ذ�ť",��Ƶ����_���ذ�ť);
	STATE= changeState(STATE,ST_��Ƶ����_NORMAL);
	setBindScreen(new Screen_��Ƶ����(),SCRN_��Ƶ����);
}

public String getScreenName(){
	return  "��Ƶ����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��Ƶ����_NORMAL){
			if(msg.wParam==��Ƶ����_��ʾ����_RELEASE){
				TO_SCRN(SCRN_��ʾ����);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��Ƶ����_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_ϵͳ����_RELEASE){
				TO_SCRN(SCRN_ϵͳ����);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����������_RELEASE){
				TO_SCRN(SCRN_����������);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��������_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_ǰ_RELEASE){
				_F_ǰ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��_RELEASE){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_LEFT_RELEASE){
				_F_����_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RIGHT_RELEASE){
				_F_����_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_LEFT_RELEASE){
				_F_����_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RIGHT_RELEASE){
				_F_����_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_LOUD_ON_RELEASE){
				_F_LOUD_ON(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_LOUD_OFF_RELEASE){
				_F_LOUD_OFF(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_ҡ��_RELEASE){
				_F_ҡ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��ʿ_RELEASE){
				_F_��ʿ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_�ŵ�_RELEASE){
				_F_�ŵ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_��׼_RELEASE){
				_F_��׼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��Ƶ����_���ذ�ť_RELEASE){
				_F_RETURN_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_MSG_KEY_EVENT(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
