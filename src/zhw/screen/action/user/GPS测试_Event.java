package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_GPS����;
public abstract class GPS����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_RESET(MSG_ZHW msg);
   public abstract void _F_ON_FF(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
     final static int ST_GPS����= 3035;
boolean IS_ST_GPS����(){ return ST_GPS����==STATE;}
final static int GPS����_���ز���= 22970;
final static int GPS����_���ز���_RELEASE=  22971;
final static int GPS����_���ز���_PRESSING=  22972;
final static int  GPS����_���ز���_PRESSED=  22973;
final static int  GPS����_���ز���_ENTER=  22974;
final static int  GPS����_���ز���_LEAVE=  22975;

final static int GPS����_reset= 22980;
final static int GPS����_reset_RELEASE=  22981;
final static int GPS����_reset_PRESSING=  22982;
final static int  GPS����_reset_PRESSED=  22983;
final static int  GPS����_reset_ENTER=  22984;
final static int  GPS����_reset_LEAVE=  22985;

final static int GPS����_on_off= 22990;
final static int GPS����_on_off_RELEASE=  22991;
final static int GPS����_on_off_PRESSING=  22992;
final static int  GPS����_on_off_PRESSED=  22993;
final static int  GPS����_on_off_ENTER=  22994;
final static int  GPS����_on_off_LEAVE=  22995;

final static int GPS����_����= 23000;
final static int GPS����_����_RELEASE=  23001;
final static int GPS����_����_PRESSING=  23002;
final static int  GPS����_����_PRESSED=  23003;
final static int  GPS����_����_ENTER=  23004;
final static int  GPS����_����_LEAVE=  23005;


public GPS����_Event() {
      actionMap.putInt("���ز���",GPS����_���ز���);
      actionMap.putInt("reset",GPS����_reset);
      actionMap.putInt("on_off",GPS����_on_off);
      actionMap.putInt("����",GPS����_����);
	STATE= changeState(STATE,ST_GPS����);
	setBindScreen(new Screen_GPS����(),SCRN_GPS����);
}

public String getScreenName(){
	return  "GPS����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_GPS����){
			if(msg.wParam==GPS����_���ز���_RELEASE){
				TO_SCRN(SCRN_����);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_reset_RELEASE){
				_F_RESET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_on_off_RELEASE){
				_F_ON_FF(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
