package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_导航_2;
public abstract class 导航_2_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_导航DIR(MSG_ZHW msg);
   public abstract void _F_刷新(MSG_ZHW msg);
   public abstract void _F_上一页(MSG_ZHW msg);
   public abstract void _F_下一页(MSG_ZHW msg);
   public abstract void _F_SELECT(String a,MSG_ZHW msg);
   public abstract void _F_SELECT_UP_DIR(MSG_ZHW msg);
   public abstract void _F_UPDATE_FORDER(MSG_ZHW msg);
   public abstract void _F_MSG_CARD_REMOVED(MSG_ZHW msg);
   public abstract void _F_MSG_CARD_INSERTED(MSG_ZHW msg);
   public abstract void _F_主页(MSG_ZHW msg);
     final static int ST_导航2_NORMAL= 3011;
boolean IS_ST_导航2_NORMAL(){ return ST_导航2_NORMAL==STATE;}
final static int 导航_2_返回导航设置= 21180;
final static int 导航_2_返回导航设置_RELEASE=  21181;
final static int 导航_2_返回导航设置_PRESSING=  21182;
final static int  导航_2_返回导航设置_PRESSED=  21183;
final static int  导航_2_返回导航设置_ENTER=  21184;
final static int  导航_2_返回导航设置_LEAVE=  21185;

final static int 导航_2_刷新= 21190;
final static int 导航_2_刷新_RELEASE=  21191;
final static int 导航_2_刷新_PRESSING=  21192;
final static int  导航_2_刷新_PRESSED=  21193;
final static int  导航_2_刷新_ENTER=  21194;
final static int  导航_2_刷新_LEAVE=  21195;

final static int 导航_2_上一页= 21200;
final static int 导航_2_上一页_RELEASE=  21201;
final static int 导航_2_上一页_PRESSING=  21202;
final static int  导航_2_上一页_PRESSED=  21203;
final static int  导航_2_上一页_ENTER=  21204;
final static int  导航_2_上一页_LEAVE=  21205;

final static int 导航_2_下一页= 21210;
final static int 导航_2_下一页_RELEASE=  21211;
final static int 导航_2_下一页_PRESSING=  21212;
final static int  导航_2_下一页_PRESSED=  21213;
final static int  导航_2_下一页_ENTER=  21214;
final static int  导航_2_下一页_LEAVE=  21215;

final static int 导航_2_L0= 21220;
final static int 导航_2_L0_RELEASE=  21221;
final static int 导航_2_L0_PRESSING=  21222;
final static int  导航_2_L0_PRESSED=  21223;
final static int  导航_2_L0_ENTER=  21224;
final static int  导航_2_L0_LEAVE=  21225;

final static int 导航_2_L1= 21230;
final static int 导航_2_L1_RELEASE=  21231;
final static int 导航_2_L1_PRESSING=  21232;
final static int  导航_2_L1_PRESSED=  21233;
final static int  导航_2_L1_ENTER=  21234;
final static int  导航_2_L1_LEAVE=  21235;

final static int 导航_2_L2= 21240;
final static int 导航_2_L2_RELEASE=  21241;
final static int 导航_2_L2_PRESSING=  21242;
final static int  导航_2_L2_PRESSED=  21243;
final static int  导航_2_L2_ENTER=  21244;
final static int  导航_2_L2_LEAVE=  21245;

final static int 导航_2_L3= 21250;
final static int 导航_2_L3_RELEASE=  21251;
final static int 导航_2_L3_PRESSING=  21252;
final static int  导航_2_L3_PRESSED=  21253;
final static int  导航_2_L3_ENTER=  21254;
final static int  导航_2_L3_LEAVE=  21255;

final static int 导航_2_L4= 21260;
final static int 导航_2_L4_RELEASE=  21261;
final static int 导航_2_L4_PRESSING=  21262;
final static int  导航_2_L4_PRESSED=  21263;
final static int  导航_2_L4_ENTER=  21264;
final static int  导航_2_L4_LEAVE=  21265;

final static int 导航_2_上级目录= 21270;
final static int 导航_2_上级目录_RELEASE=  21271;
final static int 导航_2_上级目录_PRESSING=  21272;
final static int  导航_2_上级目录_PRESSED=  21273;
final static int  导航_2_上级目录_ENTER=  21274;
final static int  导航_2_上级目录_LEAVE=  21275;

final static int 导航_2_主页= 21280;
final static int 导航_2_主页_RELEASE=  21281;
final static int 导航_2_主页_PRESSING=  21282;
final static int  导航_2_主页_PRESSED=  21283;
final static int  导航_2_主页_ENTER=  21284;
final static int  导航_2_主页_LEAVE=  21285;


public 导航_2_Event() {
      actionMap.putInt("返回导航设置",导航_2_返回导航设置);
      actionMap.putInt("刷新",导航_2_刷新);
      actionMap.putInt("上一页",导航_2_上一页);
      actionMap.putInt("下一页",导航_2_下一页);
      actionMap.putInt("L0",导航_2_L0);
      actionMap.putInt("L1",导航_2_L1);
      actionMap.putInt("L2",导航_2_L2);
      actionMap.putInt("L3",导航_2_L3);
      actionMap.putInt("L4",导航_2_L4);
      actionMap.putInt("上级目录",导航_2_上级目录);
      actionMap.putInt("主页",导航_2_主页);
	STATE= changeState(STATE,ST_导航2_NORMAL);
	setBindScreen(new Screen_导航_2(),SCRN_导航_2);
}

public String getScreenName(){
	return  "导航_2";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_导航2_NORMAL){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_导航DIR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_返回导航设置_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_刷新_RELEASE){
				_F_刷新(msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_L0_RELEASE){
				_F_SELECT("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_L1_RELEASE){
				_F_SELECT("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_L2_RELEASE){
				_F_SELECT("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_L3_RELEASE){
				_F_SELECT("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_L4_RELEASE){
				_F_SELECT("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_上级目录_RELEASE){
				_F_SELECT_UP_DIR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_FORDER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CARD_REMOVED){
				_F_MSG_CARD_REMOVED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_CARD_INSERTED){
				_F_MSG_CARD_INSERTED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==导航_2_主页_RELEASE){
				_F_主页(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
