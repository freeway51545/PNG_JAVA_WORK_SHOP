package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_通讯录;
public abstract class 通讯录_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_主页(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
   public abstract void _F_播出(MSG_ZHW msg);
   public abstract void _F_播进(MSG_ZHW msg);
   public abstract void _F_未接(MSG_ZHW msg);
   public abstract void _F_删除(MSG_ZHW msg);
   public abstract void _F_蓝牙(MSG_ZHW msg);
   public abstract void _F_电话本(MSG_ZHW msg);
   public abstract void _F_通讯录(MSG_ZHW msg);
   public abstract void _F_设置(MSG_ZHW msg);
   public abstract void _F_蓝牙音乐(MSG_ZHW msg);
     final static int ST_通讯录= 3057;
boolean IS_ST_通讯录(){ return ST_通讯录==STATE;}
final static int 通讯录_主页= 25020;
final static int 通讯录_主页_RELEASE=  25021;
final static int 通讯录_主页_PRESSING=  25022;
final static int  通讯录_主页_PRESSED=  25023;
final static int  通讯录_主页_ENTER=  25024;
final static int  通讯录_主页_LEAVE=  25025;

final static int 通讯录_返回= 25030;
final static int 通讯录_返回_RELEASE=  25031;
final static int 通讯录_返回_PRESSING=  25032;
final static int  通讯录_返回_PRESSED=  25033;
final static int  通讯录_返回_ENTER=  25034;
final static int  通讯录_返回_LEAVE=  25035;

final static int 通讯录_播出= 25040;
final static int 通讯录_播出_RELEASE=  25041;
final static int 通讯录_播出_PRESSING=  25042;
final static int  通讯录_播出_PRESSED=  25043;
final static int  通讯录_播出_ENTER=  25044;
final static int  通讯录_播出_LEAVE=  25045;

final static int 通讯录_播进= 25050;
final static int 通讯录_播进_RELEASE=  25051;
final static int 通讯录_播进_PRESSING=  25052;
final static int  通讯录_播进_PRESSED=  25053;
final static int  通讯录_播进_ENTER=  25054;
final static int  通讯录_播进_LEAVE=  25055;

final static int 通讯录_未接= 25060;
final static int 通讯录_未接_RELEASE=  25061;
final static int 通讯录_未接_PRESSING=  25062;
final static int  通讯录_未接_PRESSED=  25063;
final static int  通讯录_未接_ENTER=  25064;
final static int  通讯录_未接_LEAVE=  25065;

final static int 通讯录_删除= 25070;
final static int 通讯录_删除_RELEASE=  25071;
final static int 通讯录_删除_PRESSING=  25072;
final static int  通讯录_删除_PRESSED=  25073;
final static int  通讯录_删除_ENTER=  25074;
final static int  通讯录_删除_LEAVE=  25075;

final static int 通讯录_蓝牙= 25080;
final static int 通讯录_蓝牙_RELEASE=  25081;
final static int 通讯录_蓝牙_PRESSING=  25082;
final static int  通讯录_蓝牙_PRESSED=  25083;
final static int  通讯录_蓝牙_ENTER=  25084;
final static int  通讯录_蓝牙_LEAVE=  25085;

final static int 通讯录_电话本= 25090;
final static int 通讯录_电话本_RELEASE=  25091;
final static int 通讯录_电话本_PRESSING=  25092;
final static int  通讯录_电话本_PRESSED=  25093;
final static int  通讯录_电话本_ENTER=  25094;
final static int  通讯录_电话本_LEAVE=  25095;

final static int 通讯录_通讯录= 25100;
final static int 通讯录_通讯录_RELEASE=  25101;
final static int 通讯录_通讯录_PRESSING=  25102;
final static int  通讯录_通讯录_PRESSED=  25103;
final static int  通讯录_通讯录_ENTER=  25104;
final static int  通讯录_通讯录_LEAVE=  25105;

final static int 通讯录_设置= 25110;
final static int 通讯录_设置_RELEASE=  25111;
final static int 通讯录_设置_PRESSING=  25112;
final static int  通讯录_设置_PRESSED=  25113;
final static int  通讯录_设置_ENTER=  25114;
final static int  通讯录_设置_LEAVE=  25115;

final static int 通讯录_蓝牙音乐= 25120;
final static int 通讯录_蓝牙音乐_RELEASE=  25121;
final static int 通讯录_蓝牙音乐_PRESSING=  25122;
final static int  通讯录_蓝牙音乐_PRESSED=  25123;
final static int  通讯录_蓝牙音乐_ENTER=  25124;
final static int  通讯录_蓝牙音乐_LEAVE=  25125;


public 通讯录_Event() {
      actionMap.putInt("主页",通讯录_主页);
      actionMap.putInt("返回",通讯录_返回);
      actionMap.putInt("播出",通讯录_播出);
      actionMap.putInt("播进",通讯录_播进);
      actionMap.putInt("未接",通讯录_未接);
      actionMap.putInt("删除",通讯录_删除);
      actionMap.putInt("蓝牙",通讯录_蓝牙);
      actionMap.putInt("电话本",通讯录_电话本);
      actionMap.putInt("通讯录",通讯录_通讯录);
      actionMap.putInt("设置",通讯录_设置);
      actionMap.putInt("蓝牙音乐",通讯录_蓝牙音乐);
	STATE= changeState(STATE,ST_通讯录);
	setBindScreen(new Screen_通讯录(),SCRN_通讯录);
}

public String getScreenName(){
	return  "通讯录";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_通讯录){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_主页_RELEASE){
				_F_主页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_返回_RELEASE){
				_F_返回(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_播出_RELEASE){
				_F_播出(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_播进_RELEASE){
				_F_播进(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_未接_RELEASE){
				_F_未接(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_删除_RELEASE){
				_F_删除(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_蓝牙_RELEASE){
				_F_蓝牙(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_电话本_RELEASE){
				_F_电话本(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_通讯录_RELEASE){
				_F_通讯录(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_设置_RELEASE){
				_F_设置(msg);
				msg.setComsumered();
			}
			if(msg.wParam==通讯录_蓝牙音乐_RELEASE){
				_F_蓝牙音乐(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
