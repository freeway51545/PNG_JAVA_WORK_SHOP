package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_新电话本;
public abstract class 新电话本_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_TIMMER_BT(MSG_ZHW msg);
   public abstract void _F_主页(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
   public abstract void _F_下载(MSG_ZHW msg);
   public abstract void _F_清除(MSG_ZHW msg);
   public abstract void _F_搜索(MSG_ZHW msg);
   public abstract void _F_蓝牙(MSG_ZHW msg);
   public abstract void _F_电话本(MSG_ZHW msg);
   public abstract void _F_通讯录(MSG_ZHW msg);
   public abstract void _F_设置(MSG_ZHW msg);
   public abstract void _F_蓝牙音乐(MSG_ZHW msg);
     final static int ST_新电话本= 3058;
boolean IS_ST_新电话本(){ return ST_新电话本==STATE;}
final static int 新电话本_主页= 25130;
final static int 新电话本_主页_RELEASE=  25131;
final static int 新电话本_主页_PRESSING=  25132;
final static int  新电话本_主页_PRESSED=  25133;
final static int  新电话本_主页_ENTER=  25134;
final static int  新电话本_主页_LEAVE=  25135;

final static int 新电话本_返回= 25140;
final static int 新电话本_返回_RELEASE=  25141;
final static int 新电话本_返回_PRESSING=  25142;
final static int  新电话本_返回_PRESSED=  25143;
final static int  新电话本_返回_ENTER=  25144;
final static int  新电话本_返回_LEAVE=  25145;

final static int 新电话本_下载= 25150;
final static int 新电话本_下载_RELEASE=  25151;
final static int 新电话本_下载_PRESSING=  25152;
final static int  新电话本_下载_PRESSED=  25153;
final static int  新电话本_下载_ENTER=  25154;
final static int  新电话本_下载_LEAVE=  25155;

final static int 新电话本_清除= 25160;
final static int 新电话本_清除_RELEASE=  25161;
final static int 新电话本_清除_PRESSING=  25162;
final static int  新电话本_清除_PRESSED=  25163;
final static int  新电话本_清除_ENTER=  25164;
final static int  新电话本_清除_LEAVE=  25165;

final static int 新电话本_搜索= 25170;
final static int 新电话本_搜索_RELEASE=  25171;
final static int 新电话本_搜索_PRESSING=  25172;
final static int  新电话本_搜索_PRESSED=  25173;
final static int  新电话本_搜索_ENTER=  25174;
final static int  新电话本_搜索_LEAVE=  25175;

final static int 新电话本_蓝牙= 25180;
final static int 新电话本_蓝牙_RELEASE=  25181;
final static int 新电话本_蓝牙_PRESSING=  25182;
final static int  新电话本_蓝牙_PRESSED=  25183;
final static int  新电话本_蓝牙_ENTER=  25184;
final static int  新电话本_蓝牙_LEAVE=  25185;

final static int 新电话本_电话本= 25190;
final static int 新电话本_电话本_RELEASE=  25191;
final static int 新电话本_电话本_PRESSING=  25192;
final static int  新电话本_电话本_PRESSED=  25193;
final static int  新电话本_电话本_ENTER=  25194;
final static int  新电话本_电话本_LEAVE=  25195;

final static int 新电话本_通讯录= 25200;
final static int 新电话本_通讯录_RELEASE=  25201;
final static int 新电话本_通讯录_PRESSING=  25202;
final static int  新电话本_通讯录_PRESSED=  25203;
final static int  新电话本_通讯录_ENTER=  25204;
final static int  新电话本_通讯录_LEAVE=  25205;

final static int 新电话本_设置= 25210;
final static int 新电话本_设置_RELEASE=  25211;
final static int 新电话本_设置_PRESSING=  25212;
final static int  新电话本_设置_PRESSED=  25213;
final static int  新电话本_设置_ENTER=  25214;
final static int  新电话本_设置_LEAVE=  25215;

final static int 新电话本_蓝牙音乐= 25220;
final static int 新电话本_蓝牙音乐_RELEASE=  25221;
final static int 新电话本_蓝牙音乐_PRESSING=  25222;
final static int  新电话本_蓝牙音乐_PRESSED=  25223;
final static int  新电话本_蓝牙音乐_ENTER=  25224;
final static int  新电话本_蓝牙音乐_LEAVE=  25225;


public 新电话本_Event() {
      actionMap.putInt("主页",新电话本_主页);
      actionMap.putInt("返回",新电话本_返回);
      actionMap.putInt("下载",新电话本_下载);
      actionMap.putInt("清除",新电话本_清除);
      actionMap.putInt("搜索",新电话本_搜索);
      actionMap.putInt("蓝牙",新电话本_蓝牙);
      actionMap.putInt("电话本",新电话本_电话本);
      actionMap.putInt("通讯录",新电话本_通讯录);
      actionMap.putInt("设置",新电话本_设置);
      actionMap.putInt("蓝牙音乐",新电话本_蓝牙音乐);
	STATE= changeState(STATE,ST_新电话本);
	setBindScreen(new Screen_新电话本(),SCRN_新电话本);
}

public String getScreenName(){
	return  "新电话本";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_新电话本){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_BT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_主页_RELEASE){
				_F_主页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_返回_RELEASE){
				_F_返回(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_下载_RELEASE){
				_F_下载(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_清除_RELEASE){
				_F_清除(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_搜索_RELEASE){
				_F_搜索(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_蓝牙_RELEASE){
				_F_蓝牙(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_电话本_RELEASE){
				_F_电话本(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_通讯录_RELEASE){
				_F_通讯录(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_设置_RELEASE){
				_F_设置(msg);
				msg.setComsumered();
			}
			if(msg.wParam==新电话本_蓝牙音乐_RELEASE){
				_F_蓝牙音乐(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
