package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_����;
public abstract class ����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_PRESSED(String a,MSG_ZHW msg);
   public abstract void _F_ɾ��(MSG_ZHW msg);
   public abstract void _F_ɾ��ȫ��(MSG_ZHW msg);
   public abstract void _F_�ز�(MSG_ZHW msg);
   public abstract void _F_����_����(MSG_ZHW msg);
   public abstract void _F_�Ҷ�(MSG_ZHW msg);
   public abstract void _F_�л�(MSG_ZHW msg);
   public abstract void _F_�Ͽ�����(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
   public abstract void _F_�绰��(MSG_ZHW msg);
   public abstract void _F_ͨ����¼(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_BTM(MSG_ZHW msg);
   public abstract void _F_SEARCH(MSG_ZHW msg);
   public abstract void _F_TIMMER(MSG_ZHW msg);
   public abstract void _F_INIT_BT(MSG_ZHW msg);
   public abstract void _F_GET_TEL_NO(MSG_ZHW msg);
   public abstract void _F_TOMAIN(MSG_ZHW msg);
     final static int ST_����_NORMAL= 3002;
boolean IS_ST_����_NORMAL(){ return ST_����_NORMAL==STATE;}
final static int ����_����������= 20040;
final static int ����_����������_RELEASE=  20041;
final static int ����_����������_PRESSING=  20042;
final static int  ����_����������_PRESSED=  20043;
final static int  ����_����������_ENTER=  20044;
final static int  ����_����������_LEAVE=  20045;

final static int ����_0= 20050;
final static int ����_0_RELEASE=  20051;
final static int ����_0_PRESSING=  20052;
final static int  ����_0_PRESSED=  20053;
final static int  ����_0_ENTER=  20054;
final static int  ����_0_LEAVE=  20055;

final static int ����_1= 20060;
final static int ����_1_RELEASE=  20061;
final static int ����_1_PRESSING=  20062;
final static int  ����_1_PRESSED=  20063;
final static int  ����_1_ENTER=  20064;
final static int  ����_1_LEAVE=  20065;

final static int ����_2= 20070;
final static int ����_2_RELEASE=  20071;
final static int ����_2_PRESSING=  20072;
final static int  ����_2_PRESSED=  20073;
final static int  ����_2_ENTER=  20074;
final static int  ����_2_LEAVE=  20075;

final static int ����_3= 20080;
final static int ����_3_RELEASE=  20081;
final static int ����_3_PRESSING=  20082;
final static int  ����_3_PRESSED=  20083;
final static int  ����_3_ENTER=  20084;
final static int  ����_3_LEAVE=  20085;

final static int ����_4= 20090;
final static int ����_4_RELEASE=  20091;
final static int ����_4_PRESSING=  20092;
final static int  ����_4_PRESSED=  20093;
final static int  ����_4_ENTER=  20094;
final static int  ����_4_LEAVE=  20095;

final static int ����_5= 20100;
final static int ����_5_RELEASE=  20101;
final static int ����_5_PRESSING=  20102;
final static int  ����_5_PRESSED=  20103;
final static int  ����_5_ENTER=  20104;
final static int  ����_5_LEAVE=  20105;

final static int ����_6= 20110;
final static int ����_6_RELEASE=  20111;
final static int ����_6_PRESSING=  20112;
final static int  ����_6_PRESSED=  20113;
final static int  ����_6_ENTER=  20114;
final static int  ����_6_LEAVE=  20115;

final static int ����_7= 20120;
final static int ����_7_RELEASE=  20121;
final static int ����_7_PRESSING=  20122;
final static int  ����_7_PRESSED=  20123;
final static int  ����_7_ENTER=  20124;
final static int  ����_7_LEAVE=  20125;

final static int ����_8= 20130;
final static int ����_8_RELEASE=  20131;
final static int ����_8_PRESSING=  20132;
final static int  ����_8_PRESSED=  20133;
final static int  ����_8_ENTER=  20134;
final static int  ����_8_LEAVE=  20135;

final static int ����_9= 20140;
final static int ����_9_RELEASE=  20141;
final static int ����_9_PRESSING=  20142;
final static int  ����_9_PRESSED=  20143;
final static int  ����_9_ENTER=  20144;
final static int  ����_9_LEAVE=  20145;

final static int ����_STAR= 20150;
final static int ����_STAR_RELEASE=  20151;
final static int ����_STAR_PRESSING=  20152;
final static int  ����_STAR_PRESSED=  20153;
final static int  ����_STAR_ENTER=  20154;
final static int  ����_STAR_LEAVE=  20155;

final static int ����_jinhao= 20160;
final static int ����_jinhao_RELEASE=  20161;
final static int ����_jinhao_PRESSING=  20162;
final static int  ����_jinhao_PRESSED=  20163;
final static int  ����_jinhao_ENTER=  20164;
final static int  ����_jinhao_LEAVE=  20165;

final static int ����_ɾ��= 20170;
final static int ����_ɾ��_RELEASE=  20171;
final static int ����_ɾ��_PRESSING=  20172;
final static int  ����_ɾ��_PRESSED=  20173;
final static int  ����_ɾ��_ENTER=  20174;
final static int  ����_ɾ��_LEAVE=  20175;

final static int ����_�ز�= 20180;
final static int ����_�ز�_RELEASE=  20181;
final static int ����_�ز�_PRESSING=  20182;
final static int  ����_�ز�_PRESSED=  20183;
final static int  ����_�ز�_ENTER=  20184;
final static int  ����_�ز�_LEAVE=  20185;

final static int ����_����_����= 20190;
final static int ����_����_����_RELEASE=  20191;
final static int ����_����_����_PRESSING=  20192;
final static int  ����_����_����_PRESSED=  20193;
final static int  ����_����_����_ENTER=  20194;
final static int  ����_����_����_LEAVE=  20195;

final static int ����_�Ҷ�= 20200;
final static int ����_�Ҷ�_RELEASE=  20201;
final static int ����_�Ҷ�_PRESSING=  20202;
final static int  ����_�Ҷ�_PRESSED=  20203;
final static int  ����_�Ҷ�_ENTER=  20204;
final static int  ����_�Ҷ�_LEAVE=  20205;

final static int ����_�л�= 20210;
final static int ����_�л�_RELEASE=  20211;
final static int ����_�л�_PRESSING=  20212;
final static int  ����_�л�_PRESSED=  20213;
final static int  ����_�л�_ENTER=  20214;
final static int  ����_�л�_LEAVE=  20215;

final static int ����_�Ͽ�= 20220;
final static int ����_�Ͽ�_RELEASE=  20221;
final static int ����_�Ͽ�_PRESSING=  20222;
final static int  ����_�Ͽ�_PRESSED=  20223;
final static int  ����_�Ͽ�_ENTER=  20224;
final static int  ����_�Ͽ�_LEAVE=  20225;

final static int ����_��������= 20230;
final static int ����_��������_RELEASE=  20231;
final static int ����_��������_PRESSING=  20232;
final static int  ����_��������_PRESSED=  20233;
final static int  ����_��������_ENTER=  20234;
final static int  ����_��������_LEAVE=  20235;

final static int ����_�绰��= 20240;
final static int ����_�绰��_RELEASE=  20241;
final static int ����_�绰��_PRESSING=  20242;
final static int  ����_�绰��_PRESSED=  20243;
final static int  ����_�绰��_ENTER=  20244;
final static int  ����_�绰��_LEAVE=  20245;

final static int ����_ͨ����¼= 20250;
final static int ����_ͨ����¼_RELEASE=  20251;
final static int ����_ͨ����¼_PRESSING=  20252;
final static int  ����_ͨ����¼_PRESSED=  20253;
final static int  ����_ͨ����¼_ENTER=  20254;
final static int  ����_ͨ����¼_LEAVE=  20255;

final static int ����_����= 20260;
final static int ����_����_RELEASE=  20261;
final static int ����_����_PRESSING=  20262;
final static int  ����_����_PRESSED=  20263;
final static int  ����_����_ENTER=  20264;
final static int  ����_����_LEAVE=  20265;

final static int ����_����= 20270;
final static int ����_����_RELEASE=  20271;
final static int ����_����_PRESSING=  20272;
final static int  ����_����_PRESSED=  20273;
final static int  ����_����_ENTER=  20274;
final static int  ����_����_LEAVE=  20275;

final static int ����_����= 20280;
final static int ����_����_RELEASE=  20281;
final static int ����_����_PRESSING=  20282;
final static int  ����_����_PRESSED=  20283;
final static int  ����_����_ENTER=  20284;
final static int  ����_����_LEAVE=  20285;

final static int ����_����= 20290;
final static int ����_����_RELEASE=  20291;
final static int ����_����_PRESSING=  20292;
final static int  ����_����_PRESSED=  20293;
final static int  ����_����_ENTER=  20294;
final static int  ����_����_LEAVE=  20295;

final static int ����_��ҳ= 20300;
final static int ����_��ҳ_RELEASE=  20301;
final static int ����_��ҳ_PRESSING=  20302;
final static int  ����_��ҳ_PRESSED=  20303;
final static int  ����_��ҳ_ENTER=  20304;
final static int  ����_��ҳ_LEAVE=  20305;


public ����_Event() {
      actionMap.putInt("����������",����_����������);
      actionMap.putInt("0",����_0);
      actionMap.putInt("1",����_1);
      actionMap.putInt("2",����_2);
      actionMap.putInt("3",����_3);
      actionMap.putInt("4",����_4);
      actionMap.putInt("5",����_5);
      actionMap.putInt("6",����_6);
      actionMap.putInt("7",����_7);
      actionMap.putInt("8",����_8);
      actionMap.putInt("9",����_9);
      actionMap.putInt("STAR",����_STAR);
      actionMap.putInt("jinhao",����_jinhao);
      actionMap.putInt("ɾ��",����_ɾ��);
      actionMap.putInt("�ز�",����_�ز�);
      actionMap.putInt("����_����",����_����_����);
      actionMap.putInt("�Ҷ�",����_�Ҷ�);
      actionMap.putInt("�л�",����_�л�);
      actionMap.putInt("�Ͽ�",����_�Ͽ�);
      actionMap.putInt("��������",����_��������);
      actionMap.putInt("�绰��",����_�绰��);
      actionMap.putInt("ͨ����¼",����_ͨ����¼);
      actionMap.putInt("����",����_����);
      actionMap.putInt("����",����_����);
      actionMap.putInt("����",����_����);
      actionMap.putInt("����",����_����);
      actionMap.putInt("��ҳ",����_��ҳ);
	STATE= changeState(STATE,ST_����_NORMAL);
	setBindScreen(new Screen_����(),SCRN_����);
}

public String getScreenName(){
	return  "����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����_NORMAL){
			if(msg.wParam==����_����������_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_0_RELEASE){
				_F_PRESSED("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_1_RELEASE){
				_F_PRESSED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_RELEASE){
				_F_PRESSED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_3_RELEASE){
				_F_PRESSED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_4_RELEASE){
				_F_PRESSED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_5_RELEASE){
				_F_PRESSED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_6_RELEASE){
				_F_PRESSED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_7_RELEASE){
				_F_PRESSED("7",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_8_RELEASE){
				_F_PRESSED("8",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_9_RELEASE){
				_F_PRESSED("9",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_STAR_RELEASE){
				_F_PRESSED("*",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_jinhao_RELEASE){
				_F_PRESSED("#",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_ɾ��_RELEASE){
				_F_ɾ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_ɾ��_PRESSING){
				_F_ɾ��ȫ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_�ز�_RELEASE){
				_F_�ز�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_����_RELEASE){
				_F_����_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_����_PRESSING){
				_F_�ز�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_�Ҷ�_RELEASE){
				_F_�Ҷ�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_�л�_RELEASE){
				_F_�л�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_�Ͽ�_RELEASE){
				_F_�Ͽ�����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_�绰��_RELEASE){
				_F_�绰��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_ͨ����¼_RELEASE){
				_F_ͨ����¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_RELEASE){
				_F_BTM(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_����_RELEASE){
				_F_SEARCH(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_GET_TEL_NO){
				_F_GET_TEL_NO(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_��ҳ_RELEASE){
				_F_TOMAIN(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
