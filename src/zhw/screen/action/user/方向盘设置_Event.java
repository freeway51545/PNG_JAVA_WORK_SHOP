package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_����������;
public abstract class ����������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET(String a,MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_CHECK_INPUT_VALUE(MSG_ZHW msg);
   public abstract void _F_RECIVE_DATA(MSG_ZHW msg);
   public abstract void _F_INIT_������(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
     final static int ST_������_NORMAL= 3005;
boolean IS_ST_������_NORMAL(){ return ST_������_NORMAL==STATE;}
final static int ����������_��λ= 20630;
final static int ����������_��λ_RELEASE=  20631;
final static int ����������_��λ_PRESSING=  20632;
final static int  ����������_��λ_PRESSED=  20633;
final static int  ����������_��λ_ENTER=  20634;
final static int  ����������_��λ_LEAVE=  20635;

final static int ����������_ȷ��= 20640;
final static int ����������_ȷ��_RELEASE=  20641;
final static int ����������_ȷ��_PRESSING=  20642;
final static int  ����������_ȷ��_PRESSED=  20643;
final static int  ����������_ȷ��_ENTER=  20644;
final static int  ����������_ȷ��_LEAVE=  20645;

final static int ����������_���= 20650;
final static int ����������_���_RELEASE=  20651;
final static int ����������_���_PRESSING=  20652;
final static int  ����������_���_PRESSED=  20653;
final static int  ����������_���_ENTER=  20654;
final static int  ����������_���_LEAVE=  20655;

final static int ����������_����= 20660;
final static int ����������_����_RELEASE=  20661;
final static int ����������_����_PRESSING=  20662;
final static int  ����������_����_PRESSED=  20663;
final static int  ����������_����_ENTER=  20664;
final static int  ����������_����_LEAVE=  20665;

final static int ����������_��Դ= 20670;
final static int ����������_��Դ_RELEASE=  20671;
final static int ����������_��Դ_PRESSING=  20672;
final static int  ����������_��Դ_PRESSED=  20673;
final static int  ����������_��Դ_ENTER=  20674;
final static int  ����������_��Դ_LEAVE=  20675;

final static int ����������_������= 20680;
final static int ����������_������_RELEASE=  20681;
final static int ����������_������_PRESSING=  20682;
final static int  ����������_������_PRESSED=  20683;
final static int  ����������_������_ENTER=  20684;
final static int  ����������_������_LEAVE=  20685;

final static int ����������_������= 20690;
final static int ����������_������_RELEASE=  20691;
final static int ����������_������_PRESSING=  20692;
final static int  ����������_������_PRESSED=  20693;
final static int  ����������_������_ENTER=  20694;
final static int  ����������_������_LEAVE=  20695;

final static int ����������_ģʽ= 20700;
final static int ����������_ģʽ_RELEASE=  20701;
final static int ����������_ģʽ_PRESSING=  20702;
final static int  ����������_ģʽ_PRESSED=  20703;
final static int  ����������_ģʽ_ENTER=  20704;
final static int  ����������_ģʽ_LEAVE=  20705;

final static int ����������_��һ��= 20710;
final static int ����������_��һ��_RELEASE=  20711;
final static int ����������_��һ��_PRESSING=  20712;
final static int  ����������_��һ��_PRESSED=  20713;
final static int  ����������_��һ��_ENTER=  20714;
final static int  ����������_��һ��_LEAVE=  20715;

final static int ����������_��һ��= 20720;
final static int ����������_��һ��_RELEASE=  20721;
final static int ����������_��һ��_PRESSING=  20722;
final static int  ����������_��һ��_PRESSED=  20723;
final static int  ����������_��һ��_ENTER=  20724;
final static int  ����������_��һ��_LEAVE=  20725;

final static int ����������_����= 20730;
final static int ����������_����_RELEASE=  20731;
final static int ����������_����_PRESSING=  20732;
final static int  ����������_����_PRESSED=  20733;
final static int  ����������_����_ENTER=  20734;
final static int  ����������_����_LEAVE=  20735;

final static int ����������_����= 20740;
final static int ����������_����_RELEASE=  20741;
final static int ����������_����_PRESSING=  20742;
final static int  ����������_����_PRESSED=  20743;
final static int  ����������_����_ENTER=  20744;
final static int  ����������_����_LEAVE=  20745;

final static int ����������_DVD= 20750;
final static int ����������_DVD_RELEASE=  20751;
final static int ����������_DVD_PRESSING=  20752;
final static int  ����������_DVD_PRESSED=  20753;
final static int  ����������_DVD_ENTER=  20754;
final static int  ����������_DVD_LEAVE=  20755;

final static int ����������_��绰= 20760;
final static int ����������_��绰_RELEASE=  20761;
final static int ����������_��绰_PRESSING=  20762;
final static int  ����������_��绰_PRESSED=  20763;
final static int  ����������_��绰_ENTER=  20764;
final static int  ����������_��绰_LEAVE=  20765;

final static int ����������_�Ҷ�= 20770;
final static int ����������_�Ҷ�_RELEASE=  20771;
final static int ����������_�Ҷ�_PRESSING=  20772;
final static int  ����������_�Ҷ�_PRESSED=  20773;
final static int  ����������_�Ҷ�_ENTER=  20774;
final static int  ����������_�Ҷ�_LEAVE=  20775;

final static int ����������_��Ƶ= 20780;
final static int ����������_��Ƶ_RELEASE=  20781;
final static int ����������_��Ƶ_PRESSING=  20782;
final static int  ����������_��Ƶ_PRESSED=  20783;
final static int  ����������_��Ƶ_ENTER=  20784;
final static int  ����������_��Ƶ_LEAVE=  20785;

final static int ����������_��ʾ����= 20790;
final static int ����������_��ʾ����_RELEASE=  20791;
final static int ����������_��ʾ����_PRESSING=  20792;
final static int  ����������_��ʾ����_PRESSED=  20793;
final static int  ����������_��ʾ����_ENTER=  20794;
final static int  ����������_��ʾ����_LEAVE=  20795;

final static int ����������_��Ƶ����= 20800;
final static int ����������_��Ƶ����_RELEASE=  20801;
final static int ����������_��Ƶ����_PRESSING=  20802;
final static int  ����������_��Ƶ����_PRESSED=  20803;
final static int  ����������_��Ƶ����_ENTER=  20804;
final static int  ����������_��Ƶ����_LEAVE=  20805;

final static int ����������_ϵͳ����= 20810;
final static int ����������_ϵͳ����_RELEASE=  20811;
final static int ����������_ϵͳ����_PRESSING=  20812;
final static int  ����������_ϵͳ����_PRESSED=  20813;
final static int  ����������_ϵͳ����_ENTER=  20814;
final static int  ����������_ϵͳ����_LEAVE=  20815;

final static int ����������_��������= 20820;
final static int ����������_��������_RELEASE=  20821;
final static int ����������_��������_PRESSING=  20822;
final static int  ����������_��������_PRESSED=  20823;
final static int  ����������_��������_ENTER=  20824;
final static int  ����������_��������_LEAVE=  20825;

final static int ����������_���ذ�ť= 20830;
final static int ����������_���ذ�ť_RELEASE=  20831;
final static int ����������_���ذ�ť_PRESSING=  20832;
final static int  ����������_���ذ�ť_PRESSED=  20833;
final static int  ����������_���ذ�ť_ENTER=  20834;
final static int  ����������_���ذ�ť_LEAVE=  20835;


public ����������_Event() {
      actionMap.putInt("��λ",����������_��λ);
      actionMap.putInt("ȷ��",����������_ȷ��);
      actionMap.putInt("���",����������_���);
      actionMap.putInt("����",����������_����);
      actionMap.putInt("��Դ",����������_��Դ);
      actionMap.putInt("������",����������_������);
      actionMap.putInt("������",����������_������);
      actionMap.putInt("ģʽ",����������_ģʽ);
      actionMap.putInt("��һ��",����������_��һ��);
      actionMap.putInt("��һ��",����������_��һ��);
      actionMap.putInt("����",����������_����);
      actionMap.putInt("����",����������_����);
      actionMap.putInt("DVD",����������_DVD);
      actionMap.putInt("��绰",����������_��绰);
      actionMap.putInt("�Ҷ�",����������_�Ҷ�);
      actionMap.putInt("��Ƶ",����������_��Ƶ);
      actionMap.putInt("��ʾ����",����������_��ʾ����);
      actionMap.putInt("��Ƶ����",����������_��Ƶ����);
      actionMap.putInt("ϵͳ����",����������_ϵͳ����);
      actionMap.putInt("��������",����������_��������);
      actionMap.putInt("���ذ�ť",����������_���ذ�ť);
	STATE= changeState(STATE,ST_������_NORMAL);
	setBindScreen(new Screen_����������(),SCRN_����������);
}

public String getScreenName(){
	return  "����������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_������_NORMAL){
			if(msg.wParam==����������_��λ_RELEASE){
				_F_SET("��λ_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_ȷ��_RELEASE){
				_F_SET("ȷ��_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_����_RELEASE){
				_F_SET("����_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��Դ_RELEASE){
				_F_SET("��Դ_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_������_RELEASE){
				_F_SET("������_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_������_RELEASE){
				_F_SET("������_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_ģʽ_RELEASE){
				_F_SET("ģʽ_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��һ��_RELEASE){
				_F_SET("��һ��_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��һ��_RELEASE){
				_F_SET("��һ��_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_����_RELEASE){
				_F_SET("����_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_����_RELEASE){
				_F_SET("����_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_DVD_RELEASE){
				_F_SET("DVD_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��绰_RELEASE){
				_F_SET("��绰_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_�Ҷ�_RELEASE){
				_F_SET("�ҵ绰_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��Ƶ_RELEASE){
				_F_SET("��Ƶ_K",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_INPUT_VALUE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��ʾ����_RELEASE){
				TO_SCRN(SCRN_��ʾ����);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��Ƶ����_RELEASE){
				TO_SCRN(SCRN_��Ƶ����);
				msg.setComsumered();
			}
			if(msg.wParam==����������_ϵͳ����_RELEASE){
				TO_SCRN(SCRN_ϵͳ����);
				msg.setComsumered();
			}
			if(msg.wParam==����������_��������_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==����������_��Ƶ����_RELEASE){
				TO_SCRN(SCRN_��Ƶ����);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_RECIVE_DATA(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����������_���ذ�ť_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
