package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_音频调节;
public abstract class 音频调节_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_音频调节(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_摇滚(MSG_ZHW msg);
   public abstract void _F_流行(MSG_ZHW msg);
   public abstract void _F_现场(MSG_ZHW msg);
   public abstract void _F_舞曲(MSG_ZHW msg);
   public abstract void _F_古典(MSG_ZHW msg);
   public abstract void _F_柔和(MSG_ZHW msg);
   public abstract void _F_开关(MSG_ZHW msg);
   public abstract void _F_平衡(MSG_ZHW msg);
   public abstract void _F_返回(MSG_ZHW msg);
   public abstract void _F_主页(MSG_ZHW msg);
     final static int ST_音频调节= 3052;
boolean IS_ST_音频调节(){ return ST_音频调节==STATE;}
final static int 音频调节_关闭= 24670;
final static int 音频调节_关闭_RELEASE=  24671;
final static int 音频调节_关闭_PRESSING=  24672;
final static int  音频调节_关闭_PRESSED=  24673;
final static int  音频调节_关闭_ENTER=  24674;
final static int  音频调节_关闭_LEAVE=  24675;

final static int 音频调节_摇滚= 24680;
final static int 音频调节_摇滚_RELEASE=  24681;
final static int 音频调节_摇滚_PRESSING=  24682;
final static int  音频调节_摇滚_PRESSED=  24683;
final static int  音频调节_摇滚_ENTER=  24684;
final static int  音频调节_摇滚_LEAVE=  24685;

final static int 音频调节_流行= 24690;
final static int 音频调节_流行_RELEASE=  24691;
final static int 音频调节_流行_PRESSING=  24692;
final static int  音频调节_流行_PRESSED=  24693;
final static int  音频调节_流行_ENTER=  24694;
final static int  音频调节_流行_LEAVE=  24695;

final static int 音频调节_现场= 24700;
final static int 音频调节_现场_RELEASE=  24701;
final static int 音频调节_现场_PRESSING=  24702;
final static int  音频调节_现场_PRESSED=  24703;
final static int  音频调节_现场_ENTER=  24704;
final static int  音频调节_现场_LEAVE=  24705;

final static int 音频调节_舞曲= 24710;
final static int 音频调节_舞曲_RELEASE=  24711;
final static int 音频调节_舞曲_PRESSING=  24712;
final static int  音频调节_舞曲_PRESSED=  24713;
final static int  音频调节_舞曲_ENTER=  24714;
final static int  音频调节_舞曲_LEAVE=  24715;

final static int 音频调节_古典= 24720;
final static int 音频调节_古典_RELEASE=  24721;
final static int 音频调节_古典_PRESSING=  24722;
final static int  音频调节_古典_PRESSED=  24723;
final static int  音频调节_古典_ENTER=  24724;
final static int  音频调节_古典_LEAVE=  24725;

final static int 音频调节_柔和= 24730;
final static int 音频调节_柔和_RELEASE=  24731;
final static int 音频调节_柔和_PRESSING=  24732;
final static int  音频调节_柔和_PRESSED=  24733;
final static int  音频调节_柔和_ENTER=  24734;
final static int  音频调节_柔和_LEAVE=  24735;

final static int 音频调节_开关= 24740;
final static int 音频调节_开关_RELEASE=  24741;
final static int 音频调节_开关_PRESSING=  24742;
final static int  音频调节_开关_PRESSED=  24743;
final static int  音频调节_开关_ENTER=  24744;
final static int  音频调节_开关_LEAVE=  24745;

final static int 音频调节_平衡= 24750;
final static int 音频调节_平衡_RELEASE=  24751;
final static int 音频调节_平衡_PRESSING=  24752;
final static int  音频调节_平衡_PRESSED=  24753;
final static int  音频调节_平衡_ENTER=  24754;
final static int  音频调节_平衡_LEAVE=  24755;

final static int 音频调节_返回= 24760;
final static int 音频调节_返回_RELEASE=  24761;
final static int 音频调节_返回_PRESSING=  24762;
final static int  音频调节_返回_PRESSED=  24763;
final static int  音频调节_返回_ENTER=  24764;
final static int  音频调节_返回_LEAVE=  24765;

final static int 音频调节_主页= 24770;
final static int 音频调节_主页_RELEASE=  24771;
final static int 音频调节_主页_PRESSING=  24772;
final static int  音频调节_主页_PRESSED=  24773;
final static int  音频调节_主页_ENTER=  24774;
final static int  音频调节_主页_LEAVE=  24775;


public 音频调节_Event() {
      actionMap.putInt("关闭",音频调节_关闭);
      actionMap.putInt("摇滚",音频调节_摇滚);
      actionMap.putInt("流行",音频调节_流行);
      actionMap.putInt("现场",音频调节_现场);
      actionMap.putInt("舞曲",音频调节_舞曲);
      actionMap.putInt("古典",音频调节_古典);
      actionMap.putInt("柔和",音频调节_柔和);
      actionMap.putInt("开关",音频调节_开关);
      actionMap.putInt("平衡",音频调节_平衡);
      actionMap.putInt("返回",音频调节_返回);
      actionMap.putInt("主页",音频调节_主页);
	STATE= changeState(STATE,ST_音频调节);
	setBindScreen(new Screen_音频调节(),SCRN_音频调节);
}

public String getScreenName(){
	return  "音频调节";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_音频调节){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_音频调节(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_摇滚_RELEASE){
				_F_摇滚(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_流行_RELEASE){
				_F_流行(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_现场_RELEASE){
				_F_现场(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_舞曲_RELEASE){
				_F_舞曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_古典_RELEASE){
				_F_古典(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_柔和_RELEASE){
				_F_柔和(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_开关_RELEASE){
				_F_开关(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_平衡_RELEASE){
				_F_平衡(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_返回_RELEASE){
				_F_返回(msg);
				msg.setComsumered();
			}
			if(msg.wParam==音频调节_主页_RELEASE){
				_F_主页(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
