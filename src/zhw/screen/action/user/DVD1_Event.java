package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
public abstract class DVD1_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_TO_SETING(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_AB(MSG_ZHW msg);
   public abstract void _F_������(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_��(MSG_ZHW msg);
   public abstract void _F_OK(MSG_ZHW msg);
   public abstract void _F_�˵�(MSG_ZHW msg);
   public abstract void _F_�˵�_PRESSING(MSG_ZHW msg);
   public abstract void _F_ȫ��(MSG_ZHW msg);
   public abstract void _F_��һ��_RELEASE(MSG_ZHW msg);
   public abstract void _F_��һ��_RELEASE(MSG_ZHW msg);
   public abstract void _F_���_RELEASE(MSG_ZHW msg);
   public abstract void _F_����_RELEASE(MSG_ZHW msg);
   public abstract void _F_����_RELEASE(MSG_ZHW msg);
   public abstract void _F_ֹͣ_RELEASE(MSG_ZHW msg);
   public abstract void _F_INIT_SRN(MSG_ZHW msg);
   public abstract void _F_BT_STATE_CHANGED(MSG_ZHW msg);
   public abstract void _F_RETURN(MSG_ZHW msg);
   public abstract void _F_REMOTE_KEY_DEAL(MSG_ZHW msg);
   public abstract void _F_CHANGE_TO_CONTROL(MSG_ZHW msg);
   public abstract void _F_CHANGE_TO_WINCE(MSG_ZHW msg);
   public abstract void _F_DVD_TIMMER(MSG_ZHW msg);
   public abstract void _F_FILE_PLAY_OVER(MSG_ZHW msg);
   public abstract void _F_SCRN_ENTERED(MSG_ZHW msg);
   public abstract void _F_CHECK_YUV(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_������(MSG_ZHW msg);
     final static int ST_DVD1_NORMAL= 3001;
boolean IS_ST_DVD1_NORMAL(){ return ST_DVD1_NORMAL==STATE;}
final static int DVD1_����= 20180;
final static int DVD1_����_RELEASE=  20181;
final static int DVD1_����_PRESSING=  20182;
final static int  DVD1_����_PRESSED=  20183;
final static int  DVD1_����_ENTER=  20184;
final static int  DVD1_����_LEAVE=  20185;

final static int DVD1_��ҳ= 20190;
final static int DVD1_��ҳ_RELEASE=  20191;
final static int DVD1_��ҳ_PRESSING=  20192;
final static int  DVD1_��ҳ_PRESSED=  20193;
final static int  DVD1_��ҳ_ENTER=  20194;
final static int  DVD1_��ҳ_LEAVE=  20195;

final static int DVD1_���= 20200;
final static int DVD1_���_RELEASE=  20201;
final static int DVD1_���_PRESSING=  20202;
final static int  DVD1_���_PRESSED=  20203;
final static int  DVD1_���_ENTER=  20204;
final static int  DVD1_���_LEAVE=  20205;

final static int DVD1_����= 20210;
final static int DVD1_����_RELEASE=  20211;
final static int DVD1_����_PRESSING=  20212;
final static int  DVD1_����_PRESSED=  20213;
final static int  DVD1_����_ENTER=  20214;
final static int  DVD1_����_LEAVE=  20215;

final static int DVD1_����= 20220;
final static int DVD1_����_RELEASE=  20221;
final static int DVD1_����_PRESSING=  20222;
final static int  DVD1_����_PRESSED=  20223;
final static int  DVD1_����_ENTER=  20224;
final static int  DVD1_����_LEAVE=  20225;

final static int DVD1_����= 20230;
final static int DVD1_����_RELEASE=  20231;
final static int DVD1_����_PRESSING=  20232;
final static int  DVD1_����_PRESSED=  20233;
final static int  DVD1_����_ENTER=  20234;
final static int  DVD1_����_LEAVE=  20235;

final static int DVD1_AB= 20240;
final static int DVD1_AB_RELEASE=  20241;
final static int DVD1_AB_PRESSING=  20242;
final static int  DVD1_AB_PRESSED=  20243;
final static int  DVD1_AB_ENTER=  20244;
final static int  DVD1_AB_LEAVE=  20245;

final static int DVD1_������= 20250;
final static int DVD1_������_RELEASE=  20251;
final static int DVD1_������_PRESSING=  20252;
final static int  DVD1_������_PRESSED=  20253;
final static int  DVD1_������_ENTER=  20254;
final static int  DVD1_������_LEAVE=  20255;

final static int DVD1_��= 20260;
final static int DVD1_��_RELEASE=  20261;
final static int DVD1_��_PRESSING=  20262;
final static int  DVD1_��_PRESSED=  20263;
final static int  DVD1_��_ENTER=  20264;
final static int  DVD1_��_LEAVE=  20265;

final static int DVD1_��= 20270;
final static int DVD1_��_RELEASE=  20271;
final static int DVD1_��_PRESSING=  20272;
final static int  DVD1_��_PRESSED=  20273;
final static int  DVD1_��_ENTER=  20274;
final static int  DVD1_��_LEAVE=  20275;

final static int DVD1_��= 20280;
final static int DVD1_��_RELEASE=  20281;
final static int DVD1_��_PRESSING=  20282;
final static int  DVD1_��_PRESSED=  20283;
final static int  DVD1_��_ENTER=  20284;
final static int  DVD1_��_LEAVE=  20285;

final static int DVD1_��= 20290;
final static int DVD1_��_RELEASE=  20291;
final static int DVD1_��_PRESSING=  20292;
final static int  DVD1_��_PRESSED=  20293;
final static int  DVD1_��_ENTER=  20294;
final static int  DVD1_��_LEAVE=  20295;

final static int DVD1_OK= 20300;
final static int DVD1_OK_RELEASE=  20301;
final static int DVD1_OK_PRESSING=  20302;
final static int  DVD1_OK_PRESSED=  20303;
final static int  DVD1_OK_ENTER=  20304;
final static int  DVD1_OK_LEAVE=  20305;

final static int DVD1_�˵�= 20310;
final static int DVD1_�˵�_RELEASE=  20311;
final static int DVD1_�˵�_PRESSING=  20312;
final static int  DVD1_�˵�_PRESSED=  20313;
final static int  DVD1_�˵�_ENTER=  20314;
final static int  DVD1_�˵�_LEAVE=  20315;

final static int DVD1_ȫ��= 20320;
final static int DVD1_ȫ��_RELEASE=  20321;
final static int DVD1_ȫ��_PRESSING=  20322;
final static int  DVD1_ȫ��_PRESSED=  20323;
final static int  DVD1_ȫ��_ENTER=  20324;
final static int  DVD1_ȫ��_LEAVE=  20325;

final static int DVD1_��һ��= 20330;
final static int DVD1_��һ��_RELEASE=  20331;
final static int DVD1_��һ��_PRESSING=  20332;
final static int  DVD1_��һ��_PRESSED=  20333;
final static int  DVD1_��һ��_ENTER=  20334;
final static int  DVD1_��һ��_LEAVE=  20335;

final static int DVD1_��һ��= 20340;
final static int DVD1_��һ��_RELEASE=  20341;
final static int DVD1_��һ��_PRESSING=  20342;
final static int  DVD1_��һ��_PRESSED=  20343;
final static int  DVD1_��һ��_ENTER=  20344;
final static int  DVD1_��һ��_LEAVE=  20345;

final static int DVD1_���= 20350;
final static int DVD1_���_RELEASE=  20351;
final static int DVD1_���_PRESSING=  20352;
final static int  DVD1_���_PRESSED=  20353;
final static int  DVD1_���_ENTER=  20354;
final static int  DVD1_���_LEAVE=  20355;

final static int DVD1_����= 20360;
final static int DVD1_����_RELEASE=  20361;
final static int DVD1_����_PRESSING=  20362;
final static int  DVD1_����_PRESSED=  20363;
final static int  DVD1_����_ENTER=  20364;
final static int  DVD1_����_LEAVE=  20365;

final static int DVD1_����= 20370;
final static int DVD1_����_RELEASE=  20371;
final static int DVD1_����_PRESSING=  20372;
final static int  DVD1_����_PRESSED=  20373;
final static int  DVD1_����_ENTER=  20374;
final static int  DVD1_����_LEAVE=  20375;

final static int DVD1_ֹͣ= 20380;
final static int DVD1_ֹͣ_RELEASE=  20381;
final static int DVD1_ֹͣ_PRESSING=  20382;
final static int  DVD1_ֹͣ_PRESSED=  20383;
final static int  DVD1_ֹͣ_ENTER=  20384;
final static int  DVD1_ֹͣ_LEAVE=  20385;

final static int DVD1_$MSG_BT_STATE_CHANGED= 20390;
final static int DVD1_$MSG_BT_STATE_CHANGED_RELEASE=  20391;
final static int DVD1_$MSG_BT_STATE_CHANGED_PRESSING=  20392;
final static int  DVD1_$MSG_BT_STATE_CHANGED_PRESSED=  20393;
final static int  DVD1_$MSG_BT_STATE_CHANGED_ENTER=  20394;
final static int  DVD1_$MSG_BT_STATE_CHANGED_LEAVE=  20395;

final static int DVD1_���ذ�ť= 20400;
final static int DVD1_���ذ�ť_RELEASE=  20401;
final static int DVD1_���ذ�ť_PRESSING=  20402;
final static int  DVD1_���ذ�ť_PRESSED=  20403;
final static int  DVD1_���ذ�ť_ENTER=  20404;
final static int  DVD1_���ذ�ť_LEAVE=  20405;

final static int DVD1_�ر�= 20410;
final static int DVD1_�ر�_RELEASE=  20411;
final static int DVD1_�ر�_PRESSING=  20412;
final static int  DVD1_�ر�_PRESSED=  20413;
final static int  DVD1_�ر�_ENTER=  20414;
final static int  DVD1_�ر�_LEAVE=  20415;

final static int DVD1_�����淵��= 20420;
final static int DVD1_�����淵��_RELEASE=  20421;
final static int DVD1_�����淵��_PRESSING=  20422;
final static int  DVD1_�����淵��_PRESSED=  20423;
final static int  DVD1_�����淵��_ENTER=  20424;
final static int  DVD1_�����淵��_LEAVE=  20425;


public DVD1_Event() {
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("��ҳ",DVD1_��ҳ);
      actionMap.putInt("���",DVD1_���);
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("AB",DVD1_AB);
      actionMap.putInt("������",DVD1_������);
      actionMap.putInt("��",DVD1_��);
      actionMap.putInt("��",DVD1_��);
      actionMap.putInt("��",DVD1_��);
      actionMap.putInt("��",DVD1_��);
      actionMap.putInt("OK",DVD1_OK);
      actionMap.putInt("�˵�",DVD1_�˵�);
      actionMap.putInt("ȫ��",DVD1_ȫ��);
      actionMap.putInt("��һ��",DVD1_��һ��);
      actionMap.putInt("��һ��",DVD1_��һ��);
      actionMap.putInt("���",DVD1_���);
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("����",DVD1_����);
      actionMap.putInt("ֹͣ",DVD1_ֹͣ);
      actionMap.putInt("$MSG_BT_STATE_CHANGED",DVD1_$MSG_BT_STATE_CHANGED);
      actionMap.putInt("���ذ�ť",DVD1_���ذ�ť);
      actionMap.putInt("�ر�",DVD1_�ر�);
      actionMap.putInt("�����淵��",DVD1_�����淵��);
	STATE= changeState(STATE,ST_DVD1_NORMAL);
}

public String getScreenName(){
	return  "DVD1";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVD1_NORMAL){
			if(msg.wParam==DVD1_����_RELEASE){
				_F_TO_SETING(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��ҳ_RELEASE){
				TO_SCRN(SCRN_DVD);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_���_PRESSED){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_����_PRESSED){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_����_PRESSED){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_����_PRESSED){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_AB_PRESSED){
				_F_AB(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_������_PRESSED){
				_F_������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��_PRESSED){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��_PRESSED){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��_PRESSED){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��_PRESSED){
				_F_��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_OK_PRESSED){
				_F_OK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_�˵�_RELEASE){
				_F_�˵�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_�˵�_PRESSING){
				_F_�˵�_PRESSING(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_ȫ��_PRESSED){
				_F_ȫ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��һ��_PRESSED){
				_F_��һ��_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_��һ��_PRESSED){
				_F_��һ��_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_���_PRESSED){
				_F_���_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_����_PRESSED){
				_F_����_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_����_PRESSED){
				_F_����_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_ֹͣ_PRESSED){
				_F_ֹͣ_RELEASE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_SRN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_$MSG_BT_STATE_CHANGED){
				_F_BT_STATE_CHANGED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_���ذ�ť_RELEASE){
				_F_RETURN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_REMOTE_KEY_DEAL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CHANGE_TO_CONTROL){
				_F_CHANGE_TO_CONTROL(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CHANGE_TO_WINCE){
				_F_CHANGE_TO_WINCE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_DVD_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_SCREEN_�һ���){
				TO_SCRN(SCRN_DVD);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FILE_PLAY_OVER){
				_F_FILE_PLAY_OVER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FULL_SCREEN_CAMERA){
				_F_ȫ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTERED_NEW){
				_F_SCRN_ENTERED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_CHECK_YUV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVD1_�����淵��_RELEASE){
				_F_������(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
