package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_���ֲ���;
public abstract class ���ֲ���_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_����(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_��һ��(MSG_ZHW msg);
   public abstract void _F_���(MSG_ZHW msg);
   public abstract void _F_ѭ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
     final static int ST_���ֲ���_NORMAL= 3010;
boolean IS_ST_���ֲ���_NORMAL(){ return ST_���ֲ���_NORMAL==STATE;}
final static int ���ֲ���_����= 21090;
final static int ���ֲ���_����_RELEASE=  21091;
final static int ���ֲ���_����_PRESSING=  21092;
final static int  ���ֲ���_����_PRESSED=  21093;
final static int  ���ֲ���_����_ENTER=  21094;
final static int  ���ֲ���_����_LEAVE=  21095;

final static int ���ֲ���_��һ��= 21100;
final static int ���ֲ���_��һ��_RELEASE=  21101;
final static int ���ֲ���_��һ��_PRESSING=  21102;
final static int  ���ֲ���_��һ��_PRESSED=  21103;
final static int  ���ֲ���_��һ��_ENTER=  21104;
final static int  ���ֲ���_��һ��_LEAVE=  21105;

final static int ���ֲ���_��һ��= 21110;
final static int ���ֲ���_��һ��_RELEASE=  21111;
final static int ���ֲ���_��һ��_PRESSING=  21112;
final static int  ���ֲ���_��һ��_PRESSED=  21113;
final static int  ���ֲ���_��һ��_ENTER=  21114;
final static int  ���ֲ���_��һ��_LEAVE=  21115;

final static int ���ֲ���_���= 21120;
final static int ���ֲ���_���_RELEASE=  21121;
final static int ���ֲ���_���_PRESSING=  21122;
final static int  ���ֲ���_���_PRESSED=  21123;
final static int  ���ֲ���_���_ENTER=  21124;
final static int  ���ֲ���_���_LEAVE=  21125;

final static int ���ֲ���_ѭ��= 21130;
final static int ���ֲ���_ѭ��_RELEASE=  21131;
final static int ���ֲ���_ѭ��_PRESSING=  21132;
final static int  ���ֲ���_ѭ��_PRESSED=  21133;
final static int  ���ֲ���_ѭ��_ENTER=  21134;
final static int  ���ֲ���_ѭ��_LEAVE=  21135;

final static int ���ֲ���_����= 21140;
final static int ���ֲ���_����_RELEASE=  21141;
final static int ���ֲ���_����_PRESSING=  21142;
final static int  ���ֲ���_����_PRESSED=  21143;
final static int  ���ֲ���_����_ENTER=  21144;
final static int  ���ֲ���_����_LEAVE=  21145;

final static int ���ֲ���_EQ= 21150;
final static int ���ֲ���_EQ_RELEASE=  21151;
final static int ���ֲ���_EQ_PRESSING=  21152;
final static int  ���ֲ���_EQ_PRESSED=  21153;
final static int  ���ֲ���_EQ_ENTER=  21154;
final static int  ���ֲ���_EQ_LEAVE=  21155;

final static int ���ֲ���_�����б�= 21160;
final static int ���ֲ���_�����б�_RELEASE=  21161;
final static int ���ֲ���_�����б�_PRESSING=  21162;
final static int  ���ֲ���_�����б�_PRESSED=  21163;
final static int  ���ֲ���_�����б�_ENTER=  21164;
final static int  ���ֲ���_�����б�_LEAVE=  21165;

final static int ���ֲ���_�ر�= 21170;
final static int ���ֲ���_�ر�_RELEASE=  21171;
final static int ���ֲ���_�ر�_PRESSING=  21172;
final static int  ���ֲ���_�ر�_PRESSED=  21173;
final static int  ���ֲ���_�ر�_ENTER=  21174;
final static int  ���ֲ���_�ر�_LEAVE=  21175;


public ���ֲ���_Event() {
      actionMap.putInt("����",���ֲ���_����);
      actionMap.putInt("��һ��",���ֲ���_��һ��);
      actionMap.putInt("��һ��",���ֲ���_��һ��);
      actionMap.putInt("���",���ֲ���_���);
      actionMap.putInt("ѭ��",���ֲ���_ѭ��);
      actionMap.putInt("����",���ֲ���_����);
      actionMap.putInt("EQ",���ֲ���_EQ);
      actionMap.putInt("�����б�",���ֲ���_�����б�);
      actionMap.putInt("�ر�",���ֲ���_�ر�);
	STATE= changeState(STATE,ST_���ֲ���_NORMAL);
	setBindScreen(new Screen_���ֲ���(),SCRN_���ֲ���);
}

public String getScreenName(){
	return  "���ֲ���";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_���ֲ���_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_��һ��_RELEASE){
				_F_��һ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_���_RELEASE){
				_F_���(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_ѭ��_RELEASE){
				_F_ѭ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_EQ_RELEASE){
				_F_EQ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==���ֲ���_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
