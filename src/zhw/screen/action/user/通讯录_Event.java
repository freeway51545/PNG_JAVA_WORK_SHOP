package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_ͨѶ¼;
public abstract class ͨѶ¼_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_δ��(MSG_ZHW msg);
   public abstract void _F_ɾ��(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_�绰��(MSG_ZHW msg);
   public abstract void _F_ͨѶ¼(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_��������(MSG_ZHW msg);
     final static int ST_ͨѶ¼= 3057;
boolean IS_ST_ͨѶ¼(){ return ST_ͨѶ¼==STATE;}
final static int ͨѶ¼_��ҳ= 25020;
final static int ͨѶ¼_��ҳ_RELEASE=  25021;
final static int ͨѶ¼_��ҳ_PRESSING=  25022;
final static int  ͨѶ¼_��ҳ_PRESSED=  25023;
final static int  ͨѶ¼_��ҳ_ENTER=  25024;
final static int  ͨѶ¼_��ҳ_LEAVE=  25025;

final static int ͨѶ¼_����= 25030;
final static int ͨѶ¼_����_RELEASE=  25031;
final static int ͨѶ¼_����_PRESSING=  25032;
final static int  ͨѶ¼_����_PRESSED=  25033;
final static int  ͨѶ¼_����_ENTER=  25034;
final static int  ͨѶ¼_����_LEAVE=  25035;

final static int ͨѶ¼_����= 25040;
final static int ͨѶ¼_����_RELEASE=  25041;
final static int ͨѶ¼_����_PRESSING=  25042;
final static int  ͨѶ¼_����_PRESSED=  25043;
final static int  ͨѶ¼_����_ENTER=  25044;
final static int  ͨѶ¼_����_LEAVE=  25045;

final static int ͨѶ¼_����= 25050;
final static int ͨѶ¼_����_RELEASE=  25051;
final static int ͨѶ¼_����_PRESSING=  25052;
final static int  ͨѶ¼_����_PRESSED=  25053;
final static int  ͨѶ¼_����_ENTER=  25054;
final static int  ͨѶ¼_����_LEAVE=  25055;

final static int ͨѶ¼_δ��= 25060;
final static int ͨѶ¼_δ��_RELEASE=  25061;
final static int ͨѶ¼_δ��_PRESSING=  25062;
final static int  ͨѶ¼_δ��_PRESSED=  25063;
final static int  ͨѶ¼_δ��_ENTER=  25064;
final static int  ͨѶ¼_δ��_LEAVE=  25065;

final static int ͨѶ¼_ɾ��= 25070;
final static int ͨѶ¼_ɾ��_RELEASE=  25071;
final static int ͨѶ¼_ɾ��_PRESSING=  25072;
final static int  ͨѶ¼_ɾ��_PRESSED=  25073;
final static int  ͨѶ¼_ɾ��_ENTER=  25074;
final static int  ͨѶ¼_ɾ��_LEAVE=  25075;

final static int ͨѶ¼_����= 25080;
final static int ͨѶ¼_����_RELEASE=  25081;
final static int ͨѶ¼_����_PRESSING=  25082;
final static int  ͨѶ¼_����_PRESSED=  25083;
final static int  ͨѶ¼_����_ENTER=  25084;
final static int  ͨѶ¼_����_LEAVE=  25085;

final static int ͨѶ¼_�绰��= 25090;
final static int ͨѶ¼_�绰��_RELEASE=  25091;
final static int ͨѶ¼_�绰��_PRESSING=  25092;
final static int  ͨѶ¼_�绰��_PRESSED=  25093;
final static int  ͨѶ¼_�绰��_ENTER=  25094;
final static int  ͨѶ¼_�绰��_LEAVE=  25095;

final static int ͨѶ¼_ͨѶ¼= 25100;
final static int ͨѶ¼_ͨѶ¼_RELEASE=  25101;
final static int ͨѶ¼_ͨѶ¼_PRESSING=  25102;
final static int  ͨѶ¼_ͨѶ¼_PRESSED=  25103;
final static int  ͨѶ¼_ͨѶ¼_ENTER=  25104;
final static int  ͨѶ¼_ͨѶ¼_LEAVE=  25105;

final static int ͨѶ¼_����= 25110;
final static int ͨѶ¼_����_RELEASE=  25111;
final static int ͨѶ¼_����_PRESSING=  25112;
final static int  ͨѶ¼_����_PRESSED=  25113;
final static int  ͨѶ¼_����_ENTER=  25114;
final static int  ͨѶ¼_����_LEAVE=  25115;

final static int ͨѶ¼_��������= 25120;
final static int ͨѶ¼_��������_RELEASE=  25121;
final static int ͨѶ¼_��������_PRESSING=  25122;
final static int  ͨѶ¼_��������_PRESSED=  25123;
final static int  ͨѶ¼_��������_ENTER=  25124;
final static int  ͨѶ¼_��������_LEAVE=  25125;


public ͨѶ¼_Event() {
      actionMap.putInt("��ҳ",ͨѶ¼_��ҳ);
      actionMap.putInt("����",ͨѶ¼_����);
      actionMap.putInt("����",ͨѶ¼_����);
      actionMap.putInt("����",ͨѶ¼_����);
      actionMap.putInt("δ��",ͨѶ¼_δ��);
      actionMap.putInt("ɾ��",ͨѶ¼_ɾ��);
      actionMap.putInt("����",ͨѶ¼_����);
      actionMap.putInt("�绰��",ͨѶ¼_�绰��);
      actionMap.putInt("ͨѶ¼",ͨѶ¼_ͨѶ¼);
      actionMap.putInt("����",ͨѶ¼_����);
      actionMap.putInt("��������",ͨѶ¼_��������);
	STATE= changeState(STATE,ST_ͨѶ¼);
	setBindScreen(new Screen_ͨѶ¼(),SCRN_ͨѶ¼);
}

public String getScreenName(){
	return  "ͨѶ¼";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ͨѶ¼){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_δ��_RELEASE){
				_F_δ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_ɾ��_RELEASE){
				_F_ɾ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_�绰��_RELEASE){
				_F_�绰��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_ͨѶ¼_RELEASE){
				_F_ͨѶ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ͨѶ¼_��������_RELEASE){
				_F_��������(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
