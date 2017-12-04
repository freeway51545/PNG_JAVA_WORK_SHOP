package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_车标;
public abstract class 车标_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_SET_CHE_BIAO(MSG_ZHW msg);
   public abstract void _F_PAGE_UP(MSG_ZHW msg);
   public abstract void _F_PAGE_DOWN(MSG_ZHW msg);
   public abstract void _F_INIT_车标(MSG_ZHW msg);
   public abstract void _F_TIMMER_CHECK(MSG_ZHW msg);
   public abstract void _F_系统车标(MSG_ZHW msg);
   public abstract void _F_SD卡(MSG_ZHW msg);
     final static int ST_车标_NORMAL= 3014;
boolean IS_ST_车标_NORMAL(){ return ST_车标_NORMAL==STATE;}
     final static int ST_MAKE_CHE_BIAO= 3015;
boolean IS_ST_MAKE_CHE_BIAO(){ return ST_MAKE_CHE_BIAO==STATE;}
final static int 车标_返回设置= 21560;
final static int 车标_返回设置_RELEASE=  21561;
final static int 车标_返回设置_PRESSING=  21562;
final static int  车标_返回设置_PRESSED=  21563;
final static int  车标_返回设置_ENTER=  21564;
final static int  车标_返回设置_LEAVE=  21565;

final static int 车标_设置车标= 21570;
final static int 车标_设置车标_RELEASE=  21571;
final static int 车标_设置车标_PRESSING=  21572;
final static int  车标_设置车标_PRESSED=  21573;
final static int  车标_设置车标_ENTER=  21574;
final static int  车标_设置车标_LEAVE=  21575;

final static int 车标_上一页= 21580;
final static int 车标_上一页_RELEASE=  21581;
final static int 车标_上一页_PRESSING=  21582;
final static int  车标_上一页_PRESSED=  21583;
final static int  车标_上一页_ENTER=  21584;
final static int  车标_上一页_LEAVE=  21585;

final static int 车标_下一页= 21590;
final static int 车标_下一页_RELEASE=  21591;
final static int 车标_下一页_PRESSING=  21592;
final static int  车标_下一页_PRESSED=  21593;
final static int  车标_下一页_ENTER=  21594;
final static int  车标_下一页_LEAVE=  21595;

final static int 车标_系统车标= 21600;
final static int 车标_系统车标_RELEASE=  21601;
final static int 车标_系统车标_PRESSING=  21602;
final static int  车标_系统车标_PRESSED=  21603;
final static int  车标_系统车标_ENTER=  21604;
final static int  车标_系统车标_LEAVE=  21605;

final static int 车标_SD卡= 21610;
final static int 车标_SD卡_RELEASE=  21611;
final static int 车标_SD卡_PRESSING=  21612;
final static int  车标_SD卡_PRESSED=  21613;
final static int  车标_SD卡_ENTER=  21614;
final static int  车标_SD卡_LEAVE=  21615;


public 车标_Event() {
      actionMap.putInt("返回设置",车标_返回设置);
      actionMap.putInt("设置车标",车标_设置车标);
      actionMap.putInt("上一页",车标_上一页);
      actionMap.putInt("下一页",车标_下一页);
      actionMap.putInt("系统车标",车标_系统车标);
      actionMap.putInt("SD卡",车标_SD卡);
	STATE= changeState(STATE,ST_车标_NORMAL);
	setBindScreen(new Screen_车标(),SCRN_车标);
}

public String getScreenName(){
	return  "车标";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_车标_NORMAL){
			if(msg.wParam==车标_返回设置_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==车标_设置车标_RELEASE){
				_F_SET_CHE_BIAO(msg);
				STATE=changeState(STATE,ST_MAKE_CHE_BIAO);
				msg.setComsumered();
			}
			if(msg.wParam==车标_上一页_RELEASE){
				_F_PAGE_UP(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车标_下一页_RELEASE){
				_F_PAGE_DOWN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_车标(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_TIMMER_CHECK(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车标_系统车标_RELEASE){
				_F_系统车标(msg);
				msg.setComsumered();
			}
			if(msg.wParam==车标_SD卡_RELEASE){
				_F_SD卡(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}

		if (STATE == ST_MAKE_CHE_BIAO){
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
