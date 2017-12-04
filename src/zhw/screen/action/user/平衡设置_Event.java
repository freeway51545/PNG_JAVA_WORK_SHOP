package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_平衡设置;
public abstract class 平衡设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_平衡设置(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_主页(MSG_ZHW msg);
   public abstract void _F_UP(MSG_ZHW msg);
   public abstract void _F_DOWN(MSG_ZHW msg);
   public abstract void _F_LEFT(MSG_ZHW msg);
   public abstract void _F_RIGHT(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
     final static int ST_平衡设置= 3054;
boolean IS_ST_平衡设置(){ return ST_平衡设置==STATE;}
final static int 平衡设置_主页= 24880;
final static int 平衡设置_主页_RELEASE=  24881;
final static int 平衡设置_主页_PRESSING=  24882;
final static int  平衡设置_主页_PRESSED=  24883;
final static int  平衡设置_主页_ENTER=  24884;
final static int  平衡设置_主页_LEAVE=  24885;

final static int 平衡设置_UP= 24890;
final static int 平衡设置_UP_RELEASE=  24891;
final static int 平衡设置_UP_PRESSING=  24892;
final static int  平衡设置_UP_PRESSED=  24893;
final static int  平衡设置_UP_ENTER=  24894;
final static int  平衡设置_UP_LEAVE=  24895;

final static int 平衡设置_DOWN= 24900;
final static int 平衡设置_DOWN_RELEASE=  24901;
final static int 平衡设置_DOWN_PRESSING=  24902;
final static int  平衡设置_DOWN_PRESSED=  24903;
final static int  平衡设置_DOWN_ENTER=  24904;
final static int  平衡设置_DOWN_LEAVE=  24905;

final static int 平衡设置_LEFT= 24910;
final static int 平衡设置_LEFT_RELEASE=  24911;
final static int 平衡设置_LEFT_PRESSING=  24912;
final static int  平衡设置_LEFT_PRESSED=  24913;
final static int  平衡设置_LEFT_ENTER=  24914;
final static int  平衡设置_LEFT_LEAVE=  24915;

final static int 平衡设置_RIGHT= 24920;
final static int 平衡设置_RIGHT_RELEASE=  24921;
final static int 平衡设置_RIGHT_PRESSING=  24922;
final static int  平衡设置_RIGHT_PRESSED=  24923;
final static int  平衡设置_RIGHT_ENTER=  24924;
final static int  平衡设置_RIGHT_LEAVE=  24925;

final static int 平衡设置_返回= 24930;
final static int 平衡设置_返回_RELEASE=  24931;
final static int 平衡设置_返回_PRESSING=  24932;
final static int  平衡设置_返回_PRESSED=  24933;
final static int  平衡设置_返回_ENTER=  24934;
final static int  平衡设置_返回_LEAVE=  24935;


public 平衡设置_Event() {
      actionMap.putInt("主页",平衡设置_主页);
      actionMap.putInt("UP",平衡设置_UP);
      actionMap.putInt("DOWN",平衡设置_DOWN);
      actionMap.putInt("LEFT",平衡设置_LEFT);
      actionMap.putInt("RIGHT",平衡设置_RIGHT);
      actionMap.putInt("返回",平衡设置_返回);
	STATE= changeState(STATE,ST_平衡设置);
	setBindScreen(new Screen_平衡设置(),SCRN_平衡设置);
}

public String getScreenName(){
	return  "平衡设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_平衡设置){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_平衡设置(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_主页_RELEASE){
				_F_主页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_UP_RELEASE){
				_F_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_DOWN_RELEASE){
				_F_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_LEFT_RELEASE){
				_F_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_RIGHT_RELEASE){
				_F_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==平衡设置_返回_RELEASE){
				_F_返回(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
