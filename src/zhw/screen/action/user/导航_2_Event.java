package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_����_2;
public abstract class ����_2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_����DIR(MSG_ZHW msg);
   public abstract void _F_ˢ��(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_SELECT(String a,MSG_ZHW msg);
   public abstract void _F_SELECT_UP_DIR(MSG_ZHW msg);
   public abstract void _F_UPDATE_FORDER(MSG_ZHW msg);
   public abstract void _F_MSG_CARD_REMOVED(MSG_ZHW msg);
   public abstract void _F_MSG_CARD_INSERTED(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
     final static int ST_����2_NORMAL= 3011;
boolean IS_ST_����2_NORMAL(){ return ST_����2_NORMAL==STATE;}
final static int ����_2_���ص�������= 21180;
final static int ����_2_���ص�������_RELEASE=  21181;
final static int ����_2_���ص�������_PRESSING=  21182;
final static int  ����_2_���ص�������_PRESSED=  21183;
final static int  ����_2_���ص�������_ENTER=  21184;
final static int  ����_2_���ص�������_LEAVE=  21185;

final static int ����_2_ˢ��= 21190;
final static int ����_2_ˢ��_RELEASE=  21191;
final static int ����_2_ˢ��_PRESSING=  21192;
final static int  ����_2_ˢ��_PRESSED=  21193;
final static int  ����_2_ˢ��_ENTER=  21194;
final static int  ����_2_ˢ��_LEAVE=  21195;

final static int ����_2_��һҳ= 21200;
final static int ����_2_��һҳ_RELEASE=  21201;
final static int ����_2_��һҳ_PRESSING=  21202;
final static int  ����_2_��һҳ_PRESSED=  21203;
final static int  ����_2_��һҳ_ENTER=  21204;
final static int  ����_2_��һҳ_LEAVE=  21205;

final static int ����_2_��һҳ= 21210;
final static int ����_2_��һҳ_RELEASE=  21211;
final static int ����_2_��һҳ_PRESSING=  21212;
final static int  ����_2_��һҳ_PRESSED=  21213;
final static int  ����_2_��һҳ_ENTER=  21214;
final static int  ����_2_��һҳ_LEAVE=  21215;

final static int ����_2_L0= 21220;
final static int ����_2_L0_RELEASE=  21221;
final static int ����_2_L0_PRESSING=  21222;
final static int  ����_2_L0_PRESSED=  21223;
final static int  ����_2_L0_ENTER=  21224;
final static int  ����_2_L0_LEAVE=  21225;

final static int ����_2_L1= 21230;
final static int ����_2_L1_RELEASE=  21231;
final static int ����_2_L1_PRESSING=  21232;
final static int  ����_2_L1_PRESSED=  21233;
final static int  ����_2_L1_ENTER=  21234;
final static int  ����_2_L1_LEAVE=  21235;

final static int ����_2_L2= 21240;
final static int ����_2_L2_RELEASE=  21241;
final static int ����_2_L2_PRESSING=  21242;
final static int  ����_2_L2_PRESSED=  21243;
final static int  ����_2_L2_ENTER=  21244;
final static int  ����_2_L2_LEAVE=  21245;

final static int ����_2_L3= 21250;
final static int ����_2_L3_RELEASE=  21251;
final static int ����_2_L3_PRESSING=  21252;
final static int  ����_2_L3_PRESSED=  21253;
final static int  ����_2_L3_ENTER=  21254;
final static int  ����_2_L3_LEAVE=  21255;

final static int ����_2_L4= 21260;
final static int ����_2_L4_RELEASE=  21261;
final static int ����_2_L4_PRESSING=  21262;
final static int  ����_2_L4_PRESSED=  21263;
final static int  ����_2_L4_ENTER=  21264;
final static int  ����_2_L4_LEAVE=  21265;

final static int ����_2_�ϼ�Ŀ¼= 21270;
final static int ����_2_�ϼ�Ŀ¼_RELEASE=  21271;
final static int ����_2_�ϼ�Ŀ¼_PRESSING=  21272;
final static int  ����_2_�ϼ�Ŀ¼_PRESSED=  21273;
final static int  ����_2_�ϼ�Ŀ¼_ENTER=  21274;
final static int  ����_2_�ϼ�Ŀ¼_LEAVE=  21275;

final static int ����_2_��ҳ= 21280;
final static int ����_2_��ҳ_RELEASE=  21281;
final static int ����_2_��ҳ_PRESSING=  21282;
final static int  ����_2_��ҳ_PRESSED=  21283;
final static int  ����_2_��ҳ_ENTER=  21284;
final static int  ����_2_��ҳ_LEAVE=  21285;


public ����_2_Event() {
      actionMap.putInt("���ص�������",����_2_���ص�������);
      actionMap.putInt("ˢ��",����_2_ˢ��);
      actionMap.putInt("��һҳ",����_2_��һҳ);
      actionMap.putInt("��һҳ",����_2_��һҳ);
      actionMap.putInt("L0",����_2_L0);
      actionMap.putInt("L1",����_2_L1);
      actionMap.putInt("L2",����_2_L2);
      actionMap.putInt("L3",����_2_L3);
      actionMap.putInt("L4",����_2_L4);
      actionMap.putInt("�ϼ�Ŀ¼",����_2_�ϼ�Ŀ¼);
      actionMap.putInt("��ҳ",����_2_��ҳ);
	STATE= changeState(STATE,ST_����2_NORMAL);
	setBindScreen(new Screen_����_2(),SCRN_����_2);
}

public String getScreenName(){
	return  "����_2";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_����2_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_����DIR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_���ص�������_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==����_2_ˢ��_RELEASE){
				_F_ˢ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_L0_RELEASE){
				_F_SELECT("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_L1_RELEASE){
				_F_SELECT("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_L2_RELEASE){
				_F_SELECT("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_L3_RELEASE){
				_F_SELECT("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_L4_RELEASE){
				_F_SELECT("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_�ϼ�Ŀ¼_RELEASE){
				_F_SELECT_UP_DIR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_FORDER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CARD_REMOVED){
				_F_MSG_CARD_REMOVED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CARD_INSERTED){
				_F_MSG_CARD_INSERTED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==����_2_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
