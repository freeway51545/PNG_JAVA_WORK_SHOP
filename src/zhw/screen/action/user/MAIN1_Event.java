package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_MAIN1;
public abstract class MAIN1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER_MAIN1(MSG_ZHW msg);
   public abstract void _F_ENTER_NORMAL_STATE(MSG_ZHW msg);
   public abstract void _F_MAIN_TIMMER(MSG_ZHW msg);
   public abstract void _F_RE_MAKE_ICONS(MSG_ZHW msg);
   public abstract void _F_PAGE1(MSG_ZHW msg);
   public abstract void _F_PAGE2(MSG_ZHW msg);
   public abstract void _F_PAGE3(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_CALL_IPOD(MSG_ZHW msg);
   public abstract void _F_CALL_����(MSG_ZHW msg);
   public abstract void _F_CALL_GPS�ź�(MSG_ZHW msg);
   public abstract void _F_CALL_������(MSG_ZHW msg);
   public abstract void _F_SET�����(MSG_ZHW msg);
   public abstract void _F_CALL_�Ǳ���(MSG_ZHW msg);
   public abstract void _F_CALL_ԭ��������USB(MSG_ZHW msg);
   public abstract void _F_PAGE_CHANGE(String a,MSG_ZHW msg);
   public abstract void _F_CALL_CDC(MSG_ZHW msg);
   public abstract void _F_CALL_DVD(MSG_ZHW msg);
   public abstract void _F_CALL_SD(MSG_ZHW msg);
   public abstract void _F_CALL_USB(MSG_ZHW msg);
   public abstract void _F_CALL_USB2(MSG_ZHW msg);
   public abstract void _F_RE_SET_8202_POWER(MSG_ZHW msg);
   public abstract void _F_CALL_ͼƬ(MSG_ZHW msg);
   public abstract void _F_CALL_�ⲿ����(MSG_ZHW msg);
   public abstract void _F_CALL_����(MSG_ZHW msg);
   public abstract void _F_CALL_������(MSG_ZHW msg);
   public abstract void _F_CALL_����(MSG_ZHW msg);
   public abstract void _F_CALL_��������(MSG_ZHW msg);
   public abstract void _F_CALL_������(MSG_ZHW msg);
   public abstract void _F_CALL_����(MSG_ZHW msg);
   public abstract void _F_CALL_����(MSG_ZHW msg);
   public abstract void _F_CALL_��������(MSG_ZHW msg);
   public abstract void _F_CALL_����·��(MSG_ZHW msg);
   public abstract void _F_����������(MSG_ZHW msg);
   public abstract void _F_��ʾ����(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_��Ƶ����(MSG_ZHW msg);
   public abstract void _F_NEXT_PAGE(MSG_ZHW msg);
   public abstract void _F_REPOWER_ON(MSG_ZHW msg);
   public abstract void _F_RUN_GPS(MSG_ZHW msg);
     final static int ST_MAIN1_NORMAL_NORMAL= 3018;
boolean IS_ST_MAIN1_NORMAL_NORMAL(){ return ST_MAIN1_NORMAL_NORMAL==STATE;}
final static int MAIN1_��ԭ= 21760;
final static int MAIN1_��ԭ_RELEASE=  21761;
final static int MAIN1_��ԭ_PRESSING=  21762;
final static int  MAIN1_��ԭ_PRESSED=  21763;
final static int  MAIN1_��ԭ_ENTER=  21764;
final static int  MAIN1_��ԭ_LEAVE=  21765;

final static int MAIN1_PAGE1= 21770;
final static int MAIN1_PAGE1_RELEASE=  21771;
final static int MAIN1_PAGE1_PRESSING=  21772;
final static int  MAIN1_PAGE1_PRESSED=  21773;
final static int  MAIN1_PAGE1_ENTER=  21774;
final static int  MAIN1_PAGE1_LEAVE=  21775;

final static int MAIN1_PAGE2= 21780;
final static int MAIN1_PAGE2_RELEASE=  21781;
final static int MAIN1_PAGE2_PRESSING=  21782;
final static int  MAIN1_PAGE2_PRESSED=  21783;
final static int  MAIN1_PAGE2_ENTER=  21784;
final static int  MAIN1_PAGE2_LEAVE=  21785;

final static int MAIN1_PAGE3= 21790;
final static int MAIN1_PAGE3_RELEASE=  21791;
final static int MAIN1_PAGE3_PRESSING=  21792;
final static int  MAIN1_PAGE3_PRESSED=  21793;
final static int  MAIN1_PAGE3_ENTER=  21794;
final static int  MAIN1_PAGE3_LEAVE=  21795;

final static int MAIN1_����= 21800;
final static int MAIN1_����_RELEASE=  21801;
final static int MAIN1_����_PRESSING=  21802;
final static int  MAIN1_����_PRESSED=  21803;
final static int  MAIN1_����_ENTER=  21804;
final static int  MAIN1_����_LEAVE=  21805;

final static int MAIN1_����= 21810;
final static int MAIN1_����_RELEASE=  21811;
final static int MAIN1_����_PRESSING=  21812;
final static int  MAIN1_����_PRESSED=  21813;
final static int  MAIN1_����_ENTER=  21814;
final static int  MAIN1_����_LEAVE=  21815;

final static int MAIN1_����= 21820;
final static int MAIN1_����_RELEASE=  21821;
final static int MAIN1_����_PRESSING=  21822;
final static int  MAIN1_����_PRESSED=  21823;
final static int  MAIN1_����_ENTER=  21824;
final static int  MAIN1_����_LEAVE=  21825;

final static int MAIN1_IPOD= 21830;
final static int MAIN1_IPOD_RELEASE=  21831;
final static int MAIN1_IPOD_PRESSING=  21832;
final static int  MAIN1_IPOD_PRESSED=  21833;
final static int  MAIN1_IPOD_ENTER=  21834;
final static int  MAIN1_IPOD_LEAVE=  21835;

final static int MAIN1_����= 21840;
final static int MAIN1_����_RELEASE=  21841;
final static int MAIN1_����_PRESSING=  21842;
final static int  MAIN1_����_PRESSED=  21843;
final static int  MAIN1_����_ENTER=  21844;
final static int  MAIN1_����_LEAVE=  21845;

final static int MAIN1_GPS�ź�= 21850;
final static int MAIN1_GPS�ź�_RELEASE=  21851;
final static int MAIN1_GPS�ź�_PRESSING=  21852;
final static int  MAIN1_GPS�ź�_PRESSED=  21853;
final static int  MAIN1_GPS�ź�_ENTER=  21854;
final static int  MAIN1_GPS�ź�_LEAVE=  21855;

final static int MAIN1_������= 21860;
final static int MAIN1_������_RELEASE=  21861;
final static int MAIN1_������_PRESSING=  21862;
final static int  MAIN1_������_PRESSED=  21863;
final static int  MAIN1_������_ENTER=  21864;
final static int  MAIN1_������_LEAVE=  21865;

final static int MAIN1_�����= 21870;
final static int MAIN1_�����_RELEASE=  21871;
final static int MAIN1_�����_PRESSING=  21872;
final static int  MAIN1_�����_PRESSED=  21873;
final static int  MAIN1_�����_ENTER=  21874;
final static int  MAIN1_�����_LEAVE=  21875;

final static int MAIN1_�Ǳ���= 21880;
final static int MAIN1_�Ǳ���_RELEASE=  21881;
final static int MAIN1_�Ǳ���_PRESSING=  21882;
final static int  MAIN1_�Ǳ���_PRESSED=  21883;
final static int  MAIN1_�Ǳ���_ENTER=  21884;
final static int  MAIN1_�Ǳ���_LEAVE=  21885;

final static int MAIN1_ԭ������USB= 21890;
final static int MAIN1_ԭ������USB_RELEASE=  21891;
final static int MAIN1_ԭ������USB_PRESSING=  21892;
final static int  MAIN1_ԭ������USB_PRESSED=  21893;
final static int  MAIN1_ԭ������USB_ENTER=  21894;
final static int  MAIN1_ԭ������USB_LEAVE=  21895;

final static int MAIN1_P1= 21900;
final static int MAIN1_P1_RELEASE=  21901;
final static int MAIN1_P1_PRESSING=  21902;
final static int  MAIN1_P1_PRESSED=  21903;
final static int  MAIN1_P1_ENTER=  21904;
final static int  MAIN1_P1_LEAVE=  21905;

final static int MAIN1_P2= 21910;
final static int MAIN1_P2_RELEASE=  21911;
final static int MAIN1_P2_PRESSING=  21912;
final static int  MAIN1_P2_PRESSED=  21913;
final static int  MAIN1_P2_ENTER=  21914;
final static int  MAIN1_P2_LEAVE=  21915;

final static int MAIN1_P3= 21920;
final static int MAIN1_P3_RELEASE=  21921;
final static int MAIN1_P3_PRESSING=  21922;
final static int  MAIN1_P3_PRESSED=  21923;
final static int  MAIN1_P3_ENTER=  21924;
final static int  MAIN1_P3_LEAVE=  21925;

final static int MAIN1_CDC= 21930;
final static int MAIN1_CDC_RELEASE=  21931;
final static int MAIN1_CDC_PRESSING=  21932;
final static int  MAIN1_CDC_PRESSED=  21933;
final static int  MAIN1_CDC_ENTER=  21934;
final static int  MAIN1_CDC_LEAVE=  21935;

final static int MAIN1_DVD= 21940;
final static int MAIN1_DVD_RELEASE=  21941;
final static int MAIN1_DVD_PRESSING=  21942;
final static int  MAIN1_DVD_PRESSED=  21943;
final static int  MAIN1_DVD_ENTER=  21944;
final static int  MAIN1_DVD_LEAVE=  21945;

final static int MAIN1_SD��= 21950;
final static int MAIN1_SD��_RELEASE=  21951;
final static int MAIN1_SD��_PRESSING=  21952;
final static int  MAIN1_SD��_PRESSED=  21953;
final static int  MAIN1_SD��_ENTER=  21954;
final static int  MAIN1_SD��_LEAVE=  21955;

final static int MAIN1_USB= 21960;
final static int MAIN1_USB_RELEASE=  21961;
final static int MAIN1_USB_PRESSING=  21962;
final static int  MAIN1_USB_PRESSED=  21963;
final static int  MAIN1_USB_ENTER=  21964;
final static int  MAIN1_USB_LEAVE=  21965;

final static int MAIN1_USB2= 21970;
final static int MAIN1_USB2_RELEASE=  21971;
final static int MAIN1_USB2_PRESSING=  21972;
final static int  MAIN1_USB2_PRESSED=  21973;
final static int  MAIN1_USB2_ENTER=  21974;
final static int  MAIN1_USB2_LEAVE=  21975;

final static int MAIN1_ͼƬ= 21980;
final static int MAIN1_ͼƬ_RELEASE=  21981;
final static int MAIN1_ͼƬ_PRESSING=  21982;
final static int  MAIN1_ͼƬ_PRESSED=  21983;
final static int  MAIN1_ͼƬ_ENTER=  21984;
final static int  MAIN1_ͼƬ_LEAVE=  21985;

final static int MAIN1_�ⲿ����= 21990;
final static int MAIN1_�ⲿ����_RELEASE=  21991;
final static int MAIN1_�ⲿ����_PRESSING=  21992;
final static int  MAIN1_�ⲿ����_PRESSED=  21993;
final static int  MAIN1_�ⲿ����_ENTER=  21994;
final static int  MAIN1_�ⲿ����_LEAVE=  21995;

final static int MAIN1_����= 22000;
final static int MAIN1_����_RELEASE=  22001;
final static int MAIN1_����_PRESSING=  22002;
final static int  MAIN1_����_PRESSED=  22003;
final static int  MAIN1_����_ENTER=  22004;
final static int  MAIN1_����_LEAVE=  22005;

final static int MAIN1_������= 22010;
final static int MAIN1_������_RELEASE=  22011;
final static int MAIN1_������_PRESSING=  22012;
final static int  MAIN1_������_PRESSED=  22013;
final static int  MAIN1_������_ENTER=  22014;
final static int  MAIN1_������_LEAVE=  22015;

final static int MAIN1_����= 22020;
final static int MAIN1_����_RELEASE=  22021;
final static int MAIN1_����_PRESSING=  22022;
final static int  MAIN1_����_PRESSED=  22023;
final static int  MAIN1_����_ENTER=  22024;
final static int  MAIN1_����_LEAVE=  22025;

final static int MAIN1_��������= 22030;
final static int MAIN1_��������_RELEASE=  22031;
final static int MAIN1_��������_PRESSING=  22032;
final static int  MAIN1_��������_PRESSED=  22033;
final static int  MAIN1_��������_ENTER=  22034;
final static int  MAIN1_��������_LEAVE=  22035;

final static int MAIN1_������= 22040;
final static int MAIN1_������_RELEASE=  22041;
final static int MAIN1_������_PRESSING=  22042;
final static int  MAIN1_������_PRESSED=  22043;
final static int  MAIN1_������_ENTER=  22044;
final static int  MAIN1_������_LEAVE=  22045;

final static int MAIN1_����= 22050;
final static int MAIN1_����_RELEASE=  22051;
final static int MAIN1_����_PRESSING=  22052;
final static int  MAIN1_����_PRESSED=  22053;
final static int  MAIN1_����_ENTER=  22054;
final static int  MAIN1_����_LEAVE=  22055;

final static int MAIN1_����= 22060;
final static int MAIN1_����_RELEASE=  22061;
final static int MAIN1_����_PRESSING=  22062;
final static int  MAIN1_����_PRESSED=  22063;
final static int  MAIN1_����_ENTER=  22064;
final static int  MAIN1_����_LEAVE=  22065;

final static int MAIN1_��������= 22070;
final static int MAIN1_��������_RELEASE=  22071;
final static int MAIN1_��������_PRESSING=  22072;
final static int  MAIN1_��������_PRESSED=  22073;
final static int  MAIN1_��������_ENTER=  22074;
final static int  MAIN1_��������_LEAVE=  22075;

final static int MAIN1_����·��= 22080;
final static int MAIN1_����·��_RELEASE=  22081;
final static int MAIN1_����·��_PRESSING=  22082;
final static int  MAIN1_����·��_PRESSED=  22083;
final static int  MAIN1_����·��_ENTER=  22084;
final static int  MAIN1_����·��_LEAVE=  22085;

final static int MAIN1_����������= 22090;
final static int MAIN1_����������_RELEASE=  22091;
final static int MAIN1_����������_PRESSING=  22092;
final static int  MAIN1_����������_PRESSED=  22093;
final static int  MAIN1_����������_ENTER=  22094;
final static int  MAIN1_����������_LEAVE=  22095;

final static int MAIN1_��ʾ����= 22100;
final static int MAIN1_��ʾ����_RELEASE=  22101;
final static int MAIN1_��ʾ����_PRESSING=  22102;
final static int  MAIN1_��ʾ����_PRESSED=  22103;
final static int  MAIN1_��ʾ����_ENTER=  22104;
final static int  MAIN1_��ʾ����_LEAVE=  22105;

final static int MAIN1_��������= 22110;
final static int MAIN1_��������_RELEASE=  22111;
final static int MAIN1_��������_PRESSING=  22112;
final static int  MAIN1_��������_PRESSED=  22113;
final static int  MAIN1_��������_ENTER=  22114;
final static int  MAIN1_��������_LEAVE=  22115;

final static int MAIN1_��������= 22120;
final static int MAIN1_��������_RELEASE=  22121;
final static int MAIN1_��������_PRESSING=  22122;
final static int  MAIN1_��������_PRESSED=  22123;
final static int  MAIN1_��������_ENTER=  22124;
final static int  MAIN1_��������_LEAVE=  22125;

final static int MAIN1_��Ƶ����= 22130;
final static int MAIN1_��Ƶ����_RELEASE=  22131;
final static int MAIN1_��Ƶ����_PRESSING=  22132;
final static int  MAIN1_��Ƶ����_PRESSED=  22133;
final static int  MAIN1_��Ƶ����_ENTER=  22134;
final static int  MAIN1_��Ƶ����_LEAVE=  22135;

final static int MAIN1_NEXT_PAGE= 22140;
final static int MAIN1_NEXT_PAGE_RELEASE=  22141;
final static int MAIN1_NEXT_PAGE_PRESSING=  22142;
final static int  MAIN1_NEXT_PAGE_PRESSED=  22143;
final static int  MAIN1_NEXT_PAGE_ENTER=  22144;
final static int  MAIN1_NEXT_PAGE_LEAVE=  22145;

final static int MAIN1_GPS= 22150;
final static int MAIN1_GPS_RELEASE=  22151;
final static int MAIN1_GPS_PRESSING=  22152;
final static int  MAIN1_GPS_PRESSED=  22153;
final static int  MAIN1_GPS_ENTER=  22154;
final static int  MAIN1_GPS_LEAVE=  22155;


public MAIN1_Event() {
      actionMap.putInt("��ԭ",MAIN1_��ԭ);
      actionMap.putInt("PAGE1",MAIN1_PAGE1);
      actionMap.putInt("PAGE2",MAIN1_PAGE2);
      actionMap.putInt("PAGE3",MAIN1_PAGE3);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("IPOD",MAIN1_IPOD);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("GPS�ź�",MAIN1_GPS�ź�);
      actionMap.putInt("������",MAIN1_������);
      actionMap.putInt("�����",MAIN1_�����);
      actionMap.putInt("�Ǳ���",MAIN1_�Ǳ���);
      actionMap.putInt("ԭ������USB",MAIN1_ԭ������USB);
      actionMap.putInt("P1",MAIN1_P1);
      actionMap.putInt("P2",MAIN1_P2);
      actionMap.putInt("P3",MAIN1_P3);
      actionMap.putInt("CDC",MAIN1_CDC);
      actionMap.putInt("DVD",MAIN1_DVD);
      actionMap.putInt("SD��",MAIN1_SD��);
      actionMap.putInt("USB",MAIN1_USB);
      actionMap.putInt("USB2",MAIN1_USB2);
      actionMap.putInt("ͼƬ",MAIN1_ͼƬ);
      actionMap.putInt("�ⲿ����",MAIN1_�ⲿ����);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("������",MAIN1_������);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("��������",MAIN1_��������);
      actionMap.putInt("������",MAIN1_������);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("����",MAIN1_����);
      actionMap.putInt("��������",MAIN1_��������);
      actionMap.putInt("����·��",MAIN1_����·��);
      actionMap.putInt("����������",MAIN1_����������);
      actionMap.putInt("��ʾ����",MAIN1_��ʾ����);
      actionMap.putInt("��������",MAIN1_��������);
      actionMap.putInt("��������",MAIN1_��������);
      actionMap.putInt("��Ƶ����",MAIN1_��Ƶ����);
      actionMap.putInt("NEXT_PAGE",MAIN1_NEXT_PAGE);
      actionMap.putInt("GPS",MAIN1_GPS);
	STATE= changeState(STATE,ST_MAIN1_NORMAL_NORMAL);
	setBindScreen(new Screen_MAIN1(),SCRN_MAIN1);
}

public String getScreenName(){
	return  "MAIN1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_MAIN1_NORMAL_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER_MAIN1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_STATE){
				_F_ENTER_NORMAL_STATE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_MAIN_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��ԭ_RELEASE){
				_F_RE_MAKE_ICONS(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_PAGE1_RELEASE){
				_F_PAGE1(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_PAGE2_RELEASE){
				_F_PAGE2(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_PAGE3_RELEASE){
				_F_PAGE3(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_IPOD_RELEASE){
				_F_CALL_IPOD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_GPS�ź�_RELEASE){
				_F_CALL_GPS�ź�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_������_RELEASE){
				_F_CALL_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_�����_RELEASE){
				_F_SET�����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_�Ǳ���_RELEASE){
				_F_CALL_�Ǳ���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_ԭ������USB_RELEASE){
				_F_CALL_ԭ��������USB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_P1_RELEASE){
				_F_PAGE_CHANGE("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_P2_RELEASE){
				_F_PAGE_CHANGE("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_P3_RELEASE){
				_F_PAGE_CHANGE("3",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==MAIN1_CDC_RELEASE){
				_F_CALL_CDC(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_DVD_RELEASE){
				_F_CALL_DVD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_IPOD_RELEASE){
				_F_CALL_IPOD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_SD��_RELEASE){
				_F_CALL_SD(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_USB_RELEASE){
				_F_CALL_USB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_USB2_RELEASE){
				_F_CALL_USB2(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_DVD_PRESSING){
				_F_RE_SET_8202_POWER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_SD��_PRESSING){
				_F_RE_SET_8202_POWER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_USB_PRESSING){
				_F_RE_SET_8202_POWER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_ͼƬ_RELEASE){
				_F_CALL_ͼƬ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_�ⲿ����_RELEASE){
				_F_CALL_�ⲿ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_������_RELEASE){
				_F_CALL_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��������_RELEASE){
				_F_CALL_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_������_RELEASE){
				_F_CALL_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����_RELEASE){
				_F_CALL_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��������_RELEASE){
				_F_CALL_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����·��_RELEASE){
				_F_CALL_����·��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_����������_RELEASE){
				_F_����������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��ʾ����_RELEASE){
				_F_��ʾ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_��Ƶ����_RELEASE){
				_F_��Ƶ����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_NEXT_PAGE_RELEASE){
				_F_NEXT_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_POWER_ON){
				_F_REPOWER_ON(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MAIN1_GPS_RELEASE){
				_F_RUN_GPS(msg);
				msg.setComsumered();
			}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
