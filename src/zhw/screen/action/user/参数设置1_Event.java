package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������1;
public abstract class ��������1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_������(MSG_ZHW msg);
   public abstract void _F_����Ӱ��(MSG_ZHW msg);
   public abstract void _F_�ָ���������(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_��ĻУ��(MSG_ZHW msg);
   public abstract void _F_ɲ����DVD(MSG_ZHW msg);
   public abstract void _F_ϵͳ����(MSG_ZHW msg);
   public abstract void _F_ϵͳ��Ϣ(MSG_ZHW msg);
   public abstract void _F_INIT_��������1(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
     final static int ST_ϵͳ����1_NORMAL= 3034;
boolean IS_ST_ϵͳ����1_NORMAL(){ return ST_ϵͳ����1_NORMAL==STATE;}
final static int ��������1_��������= 22780;
final static int ��������1_��������_RELEASE=  22781;
final static int ��������1_��������_PRESSING=  22782;
final static int  ��������1_��������_PRESSED=  22783;
final static int  ��������1_��������_ENTER=  22784;
final static int  ��������1_��������_LEAVE=  22785;

final static int ��������1_ʱ������= 22790;
final static int ��������1_ʱ������_RELEASE=  22791;
final static int ��������1_ʱ������_PRESSING=  22792;
final static int  ��������1_ʱ������_PRESSED=  22793;
final static int  ��������1_ʱ������_ENTER=  22794;
final static int  ��������1_ʱ������_LEAVE=  22795;

final static int ��������1_��������= 22800;
final static int ��������1_��������_RELEASE=  22801;
final static int ��������1_��������_PRESSING=  22802;
final static int  ��������1_��������_PRESSED=  22803;
final static int  ��������1_��������_ENTER=  22804;
final static int  ��������1_��������_LEAVE=  22805;

final static int ��������1_��������= 22810;
final static int ��������1_��������_RELEASE=  22811;
final static int ��������1_��������_PRESSING=  22812;
final static int  ��������1_��������_PRESSED=  22813;
final static int  ��������1_��������_ENTER=  22814;
final static int  ��������1_��������_LEAVE=  22815;

final static int ��������1_��������= 22820;
final static int ��������1_��������_RELEASE=  22821;
final static int ��������1_��������_PRESSING=  22822;
final static int  ��������1_��������_PRESSED=  22823;
final static int  ��������1_��������_ENTER=  22824;
final static int  ��������1_��������_LEAVE=  22825;

final static int ��������1_�ָ���������= 22830;
final static int ��������1_�ָ���������_RELEASE=  22831;
final static int ��������1_�ָ���������_PRESSING=  22832;
final static int  ��������1_�ָ���������_PRESSED=  22833;
final static int  ��������1_�ָ���������_ENTER=  22834;
final static int  ��������1_�ָ���������_LEAVE=  22835;

final static int ��������1_��������= 22840;
final static int ��������1_��������_RELEASE=  22841;
final static int ��������1_��������_PRESSING=  22842;
final static int  ��������1_��������_PRESSED=  22843;
final static int  ��������1_��������_ENTER=  22844;
final static int  ��������1_��������_LEAVE=  22845;

final static int ��������1_��ĻУ��= 22850;
final static int ��������1_��ĻУ��_RELEASE=  22851;
final static int ��������1_��ĻУ��_PRESSING=  22852;
final static int  ��������1_��ĻУ��_PRESSED=  22853;
final static int  ��������1_��ĻУ��_ENTER=  22854;
final static int  ��������1_��ĻУ��_LEAVE=  22855;

final static int ��������1_��Ƶ����= 22860;
final static int ��������1_��Ƶ����_RELEASE=  22861;
final static int ��������1_��Ƶ����_PRESSING=  22862;
final static int  ��������1_��Ƶ����_PRESSED=  22863;
final static int  ��������1_��Ƶ����_ENTER=  22864;
final static int  ��������1_��Ƶ����_LEAVE=  22865;

final static int ��������1_ϵͳ����= 22870;
final static int ��������1_ϵͳ����_RELEASE=  22871;
final static int ��������1_ϵͳ����_PRESSING=  22872;
final static int  ��������1_ϵͳ����_PRESSED=  22873;
final static int  ��������1_ϵͳ����_ENTER=  22874;
final static int  ��������1_ϵͳ����_LEAVE=  22875;

final static int ��������1_������= 22880;
final static int ��������1_������_RELEASE=  22881;
final static int ��������1_������_PRESSING=  22882;
final static int  ��������1_������_PRESSED=  22883;
final static int  ��������1_������_ENTER=  22884;
final static int  ��������1_������_LEAVE=  22885;

final static int ��������1_�������= 22890;
final static int ��������1_�������_RELEASE=  22891;
final static int ��������1_�������_PRESSING=  22892;
final static int  ��������1_�������_PRESSED=  22893;
final static int  ��������1_�������_ENTER=  22894;
final static int  ��������1_�������_LEAVE=  22895;

final static int ��������1_ɲ����DVD= 22900;
final static int ��������1_ɲ����DVD_RELEASE=  22901;
final static int ��������1_ɲ����DVD_PRESSING=  22902;
final static int  ��������1_ɲ����DVD_PRESSED=  22903;
final static int  ��������1_ɲ����DVD_ENTER=  22904;
final static int  ��������1_ɲ����DVD_LEAVE=  22905;

final static int ��������1_��ͼ= 22910;
final static int ��������1_��ͼ_RELEASE=  22911;
final static int ��������1_��ͼ_PRESSING=  22912;
final static int  ��������1_��ͼ_PRESSED=  22913;
final static int  ��������1_��ͼ_ENTER=  22914;
final static int  ��������1_��ͼ_LEAVE=  22915;

final static int ��������1_ϵͳ����= 22920;
final static int ��������1_ϵͳ����_RELEASE=  22921;
final static int ��������1_ϵͳ����_PRESSING=  22922;
final static int  ��������1_ϵͳ����_PRESSED=  22923;
final static int  ��������1_ϵͳ����_ENTER=  22924;
final static int  ��������1_ϵͳ����_LEAVE=  22925;

final static int ��������1_ϵͳ��Ϣ= 22930;
final static int ��������1_ϵͳ��Ϣ_RELEASE=  22931;
final static int ��������1_ϵͳ��Ϣ_PRESSING=  22932;
final static int  ��������1_ϵͳ��Ϣ_PRESSED=  22933;
final static int  ��������1_ϵͳ��Ϣ_ENTER=  22934;
final static int  ��������1_ϵͳ��Ϣ_LEAVE=  22935;

final static int ��������1_��������= 22940;
final static int ��������1_��������_RELEASE=  22941;
final static int ��������1_��������_PRESSING=  22942;
final static int  ��������1_��������_PRESSED=  22943;
final static int  ��������1_��������_ENTER=  22944;
final static int  ��������1_��������_LEAVE=  22945;

final static int ��������1_����= 22950;
final static int ��������1_����_RELEASE=  22951;
final static int ��������1_����_PRESSING=  22952;
final static int  ��������1_����_PRESSED=  22953;
final static int  ��������1_����_ENTER=  22954;
final static int  ��������1_����_LEAVE=  22955;

final static int ��������1_��������= 22960;
final static int ��������1_��������_RELEASE=  22961;
final static int ��������1_��������_PRESSING=  22962;
final static int  ��������1_��������_PRESSED=  22963;
final static int  ��������1_��������_ENTER=  22964;
final static int  ��������1_��������_LEAVE=  22965;


public ��������1_Event() {
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("ʱ������",��������1_ʱ������);
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("�ָ���������",��������1_�ָ���������);
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("��ĻУ��",��������1_��ĻУ��);
      actionMap.putInt("��Ƶ����",��������1_��Ƶ����);
      actionMap.putInt("ϵͳ����",��������1_ϵͳ����);
      actionMap.putInt("������",��������1_������);
      actionMap.putInt("�������",��������1_�������);
      actionMap.putInt("ɲ����DVD",��������1_ɲ����DVD);
      actionMap.putInt("��ͼ",��������1_��ͼ);
      actionMap.putInt("ϵͳ����",��������1_ϵͳ����);
      actionMap.putInt("ϵͳ��Ϣ",��������1_ϵͳ��Ϣ);
      actionMap.putInt("��������",��������1_��������);
      actionMap.putInt("����",��������1_����);
      actionMap.putInt("��������",��������1_��������);
	STATE= changeState(STATE,ST_ϵͳ����1_NORMAL);
	setBindScreen(new Screen_��������1(),SCRN_��������1);
}

public String getScreenName(){
	return  "��������1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ϵͳ����1_NORMAL){
			if(msg.wParam==��������1_��������_RELEASE){
				TO_SCRN(SCRN_��ʾ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_ʱ������_RELEASE){
				TO_SCRN(SCRN_ʱ�����);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				TO_SCRN(SCRN_GPS����);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				_F_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				_F_����Ӱ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_�ָ���������_RELEASE){
				_F_�ָ���������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��ĻУ��_RELEASE){
				_F_��ĻУ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��Ƶ����_RELEASE){
				TO_SCRN(SCRN_��Ƶ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_ϵͳ����_RELEASE){
				TO_SCRN(SCRN_ϵͳ����);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_������_RELEASE){
				TO_SCRN(SCRN_����������);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_�������_RELEASE){
				show�������();;
				msg.setComsumered();
			}
			if(msg.wParam==��������1_ɲ����DVD_RELEASE){
				_F_ɲ����DVD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��ͼ_RELEASE){
				TO_SCRN(SCRN_����_2);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_ϵͳ����_RELEASE){
				_F_ϵͳ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_ϵͳ��Ϣ_RELEASE){
				_F_ϵͳ��Ϣ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_��������1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������1_����_RELEASE){
				TO_SCRN(getMainScreen());
				msg.setComsumered();
			}
			if(msg.wParam==��������1_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
