package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_ƽ������;
public abstract class ƽ������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_ƽ������(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_��ҳ(MSG_ZHW msg);
   public abstract void _F_UP(MSG_ZHW msg);
   public abstract void _F_DOWN(MSG_ZHW msg);
   public abstract void _F_LEFT(MSG_ZHW msg);
   public abstract void _F_RIGHT(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
     final static int ST_ƽ������= 3054;
boolean IS_ST_ƽ������(){ return ST_ƽ������==STATE;}
final static int ƽ������_��ҳ= 24880;
final static int ƽ������_��ҳ_RELEASE=  24881;
final static int ƽ������_��ҳ_PRESSING=  24882;
final static int  ƽ������_��ҳ_PRESSED=  24883;
final static int  ƽ������_��ҳ_ENTER=  24884;
final static int  ƽ������_��ҳ_LEAVE=  24885;

final static int ƽ������_UP= 24890;
final static int ƽ������_UP_RELEASE=  24891;
final static int ƽ������_UP_PRESSING=  24892;
final static int  ƽ������_UP_PRESSED=  24893;
final static int  ƽ������_UP_ENTER=  24894;
final static int  ƽ������_UP_LEAVE=  24895;

final static int ƽ������_DOWN= 24900;
final static int ƽ������_DOWN_RELEASE=  24901;
final static int ƽ������_DOWN_PRESSING=  24902;
final static int  ƽ������_DOWN_PRESSED=  24903;
final static int  ƽ������_DOWN_ENTER=  24904;
final static int  ƽ������_DOWN_LEAVE=  24905;

final static int ƽ������_LEFT= 24910;
final static int ƽ������_LEFT_RELEASE=  24911;
final static int ƽ������_LEFT_PRESSING=  24912;
final static int  ƽ������_LEFT_PRESSED=  24913;
final static int  ƽ������_LEFT_ENTER=  24914;
final static int  ƽ������_LEFT_LEAVE=  24915;

final static int ƽ������_RIGHT= 24920;
final static int ƽ������_RIGHT_RELEASE=  24921;
final static int ƽ������_RIGHT_PRESSING=  24922;
final static int  ƽ������_RIGHT_PRESSED=  24923;
final static int  ƽ������_RIGHT_ENTER=  24924;
final static int  ƽ������_RIGHT_LEAVE=  24925;

final static int ƽ������_����= 24930;
final static int ƽ������_����_RELEASE=  24931;
final static int ƽ������_����_PRESSING=  24932;
final static int  ƽ������_����_PRESSED=  24933;
final static int  ƽ������_����_ENTER=  24934;
final static int  ƽ������_����_LEAVE=  24935;


public ƽ������_Event() {
      actionMap.putInt("��ҳ",ƽ������_��ҳ);
      actionMap.putInt("UP",ƽ������_UP);
      actionMap.putInt("DOWN",ƽ������_DOWN);
      actionMap.putInt("LEFT",ƽ������_LEFT);
      actionMap.putInt("RIGHT",ƽ������_RIGHT);
      actionMap.putInt("����",ƽ������_����);
	STATE= changeState(STATE,ST_ƽ������);
	setBindScreen(new Screen_ƽ������(),SCRN_ƽ������);
}

public String getScreenName(){
	return  "ƽ������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_ƽ������){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_ƽ������(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_��ҳ_RELEASE){
				_F_��ҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_UP_RELEASE){
				_F_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_DOWN_RELEASE){
				_F_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_LEFT_RELEASE){
				_F_LEFT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_RIGHT_RELEASE){
				_F_RIGHT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==ƽ������_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
