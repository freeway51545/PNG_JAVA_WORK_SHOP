package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_GPS≤‚ ‘;
public abstract class GPS≤‚ ‘_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_RESET(MSG_ZHW msg);
   public abstract void _F_ON_FF(MSG_ZHW msg);
   public abstract void _F_∑µªÿ(MSG_ZHW msg);
     final static int ST_GPS≤‚ ‘= 3035;
boolean IS_ST_GPS≤‚ ‘(){ return ST_GPS≤‚ ‘==STATE;}
final static int GPS≤‚ ‘_∑µªÿ≤Œ ˝= 22970;
final static int GPS≤‚ ‘_∑µªÿ≤Œ ˝_RELEASE=  22971;
final static int GPS≤‚ ‘_∑µªÿ≤Œ ˝_PRESSING=  22972;
final static int  GPS≤‚ ‘_∑µªÿ≤Œ ˝_PRESSED=  22973;
final static int  GPS≤‚ ‘_∑µªÿ≤Œ ˝_ENTER=  22974;
final static int  GPS≤‚ ‘_∑µªÿ≤Œ ˝_LEAVE=  22975;

final static int GPS≤‚ ‘_reset= 22980;
final static int GPS≤‚ ‘_reset_RELEASE=  22981;
final static int GPS≤‚ ‘_reset_PRESSING=  22982;
final static int  GPS≤‚ ‘_reset_PRESSED=  22983;
final static int  GPS≤‚ ‘_reset_ENTER=  22984;
final static int  GPS≤‚ ‘_reset_LEAVE=  22985;

final static int GPS≤‚ ‘_on_off= 22990;
final static int GPS≤‚ ‘_on_off_RELEASE=  22991;
final static int GPS≤‚ ‘_on_off_PRESSING=  22992;
final static int  GPS≤‚ ‘_on_off_PRESSED=  22993;
final static int  GPS≤‚ ‘_on_off_ENTER=  22994;
final static int  GPS≤‚ ‘_on_off_LEAVE=  22995;

final static int GPS≤‚ ‘_∑µªÿ= 23000;
final static int GPS≤‚ ‘_∑µªÿ_RELEASE=  23001;
final static int GPS≤‚ ‘_∑µªÿ_PRESSING=  23002;
final static int  GPS≤‚ ‘_∑µªÿ_PRESSED=  23003;
final static int  GPS≤‚ ‘_∑µªÿ_ENTER=  23004;
final static int  GPS≤‚ ‘_∑µªÿ_LEAVE=  23005;


public GPS≤‚ ‘_Event() {
      actionMap.putInt("∑µªÿ≤Œ ˝",GPS≤‚ ‘_∑µªÿ≤Œ ˝);
      actionMap.putInt("reset",GPS≤‚ ‘_reset);
      actionMap.putInt("on_off",GPS≤‚ ‘_on_off);
      actionMap.putInt("∑µªÿ",GPS≤‚ ‘_∑µªÿ);
	STATE= changeState(STATE,ST_GPS≤‚ ‘);
	setBindScreen(new Screen_GPS≤‚ ‘(),SCRN_GPS≤‚ ‘);
}

public String getScreenName(){
	return  "GPS≤‚ ‘";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_GPS≤‚ ‘){
			if(msg.wParam==GPS≤‚ ‘_∑µªÿ≤Œ ˝_RELEASE){
				TO_SCRN(SCRN_µº∫Ω);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS≤‚ ‘_reset_RELEASE){
				_F_RESET(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS≤‚ ‘_on_off_RELEASE){
				_F_ON_FF(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS≤‚ ‘_∑µªÿ_RELEASE){
				_F_∑µªÿ(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
