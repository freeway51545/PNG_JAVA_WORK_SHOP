package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_GPS����;
public abstract class GPS����_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_ѡ��(MSG_ZHW msg);
   public abstract void _F_GPS��������BNT(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
     final static int ST_GPS����= 3026;
boolean IS_ST_GPS����(){ return ST_GPS����==STATE;}
final static int GPS����_����= 22440;
final static int GPS����_����_RELEASE=  22441;
final static int GPS����_����_PRESSING=  22442;
final static int  GPS����_����_PRESSED=  22443;
final static int  GPS����_����_ENTER=  22444;
final static int  GPS����_����_LEAVE=  22445;

final static int GPS����_����= 22450;
final static int GPS����_����_RELEASE=  22451;
final static int GPS����_����_PRESSING=  22452;
final static int  GPS����_����_PRESSED=  22453;
final static int  GPS����_����_ENTER=  22454;
final static int  GPS����_����_LEAVE=  22455;

final static int GPS����_ѡ��= 22460;
final static int GPS����_ѡ��_RELEASE=  22461;
final static int GPS����_ѡ��_PRESSING=  22462;
final static int  GPS����_ѡ��_PRESSED=  22463;
final static int  GPS����_ѡ��_ENTER=  22464;
final static int  GPS����_ѡ��_LEAVE=  22465;

final static int GPS����_GPS��������BNT= 22470;
final static int GPS����_GPS��������BNT_RELEASE=  22471;
final static int GPS����_GPS��������BNT_PRESSING=  22472;
final static int  GPS����_GPS��������BNT_PRESSED=  22473;
final static int  GPS����_GPS��������BNT_ENTER=  22474;
final static int  GPS����_GPS��������BNT_LEAVE=  22475;

final static int GPS����_���ز���= 22480;
final static int GPS����_���ز���_RELEASE=  22481;
final static int GPS����_���ز���_PRESSING=  22482;
final static int  GPS����_���ز���_PRESSED=  22483;
final static int  GPS����_���ز���_ENTER=  22484;
final static int  GPS����_���ز���_LEAVE=  22485;


public GPS����_Event() {
      actionMap.putInt("����",GPS����_����);
      actionMap.putInt("����",GPS����_����);
      actionMap.putInt("ѡ��",GPS����_ѡ��);
      actionMap.putInt("GPS��������BNT",GPS����_GPS��������BNT);
      actionMap.putInt("���ز���",GPS����_���ز���);
	STATE= changeState(STATE,ST_GPS����);
	setBindScreen(new Screen_GPS����(),SCRN_GPS����);
}

public String getScreenName(){
	return  "GPS����";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_GPS����){
			if(msg.wParam==GPS����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_����_RELEASE){
				_F_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_ѡ��_RELEASE){
				_F_ѡ��(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_GPS��������BNT_RELEASE){
				_F_GPS��������BNT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==GPS����_���ز���_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
