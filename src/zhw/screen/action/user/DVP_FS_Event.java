package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP_FS;
public abstract class DVP_FS_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_DVP_FS(MSG_ZHW msg);
   public abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_上一曲(MSG_ZHW msg);
   public abstract void _F_下一曲(MSG_ZHW msg);
   public abstract void _F_声道(MSG_ZHW msg);
   public abstract void _F_屏显(MSG_ZHW msg);
   public abstract void _F_随机(MSG_ZHW msg);
   public abstract void _F_重复(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_BACK_TO_MAIN(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
     final static int ST_DVP_FS= 3053;
boolean IS_ST_DVP_FS(){ return ST_DVP_FS==STATE;}
final static int DVP_FS_播放= 24780;
final static int DVP_FS_播放_RELEASE=  24781;
final static int DVP_FS_播放_PRESSING=  24782;
final static int  DVP_FS_播放_PRESSED=  24783;
final static int  DVP_FS_播放_ENTER=  24784;
final static int  DVP_FS_播放_LEAVE=  24785;

final static int DVP_FS_上一曲= 24790;
final static int DVP_FS_上一曲_RELEASE=  24791;
final static int DVP_FS_上一曲_PRESSING=  24792;
final static int  DVP_FS_上一曲_PRESSED=  24793;
final static int  DVP_FS_上一曲_ENTER=  24794;
final static int  DVP_FS_上一曲_LEAVE=  24795;

final static int DVP_FS_下一曲= 24800;
final static int DVP_FS_下一曲_RELEASE=  24801;
final static int DVP_FS_下一曲_PRESSING=  24802;
final static int  DVP_FS_下一曲_PRESSED=  24803;
final static int  DVP_FS_下一曲_ENTER=  24804;
final static int  DVP_FS_下一曲_LEAVE=  24805;

final static int DVP_FS_声道= 24810;
final static int DVP_FS_声道_RELEASE=  24811;
final static int DVP_FS_声道_PRESSING=  24812;
final static int  DVP_FS_声道_PRESSED=  24813;
final static int  DVP_FS_声道_ENTER=  24814;
final static int  DVP_FS_声道_LEAVE=  24815;

final static int DVP_FS_屏显= 24820;
final static int DVP_FS_屏显_RELEASE=  24821;
final static int DVP_FS_屏显_PRESSING=  24822;
final static int  DVP_FS_屏显_PRESSED=  24823;
final static int  DVP_FS_屏显_ENTER=  24824;
final static int  DVP_FS_屏显_LEAVE=  24825;

final static int DVP_FS_随机= 24830;
final static int DVP_FS_随机_RELEASE=  24831;
final static int DVP_FS_随机_PRESSING=  24832;
final static int  DVP_FS_随机_PRESSED=  24833;
final static int  DVP_FS_随机_ENTER=  24834;
final static int  DVP_FS_随机_LEAVE=  24835;

final static int DVP_FS_重复= 24840;
final static int DVP_FS_重复_RELEASE=  24841;
final static int DVP_FS_重复_PRESSING=  24842;
final static int  DVP_FS_重复_PRESSED=  24843;
final static int  DVP_FS_重复_ENTER=  24844;
final static int  DVP_FS_重复_LEAVE=  24845;

final static int DVP_FS_关闭= 24850;
final static int DVP_FS_关闭_RELEASE=  24851;
final static int DVP_FS_关闭_PRESSING=  24852;
final static int  DVP_FS_关闭_PRESSED=  24853;
final static int  DVP_FS_关闭_ENTER=  24854;
final static int  DVP_FS_关闭_LEAVE=  24855;

final static int DVP_FS_主界面返回= 24860;
final static int DVP_FS_主界面返回_RELEASE=  24861;
final static int DVP_FS_主界面返回_PRESSING=  24862;
final static int  DVP_FS_主界面返回_PRESSED=  24863;
final static int  DVP_FS_主界面返回_ENTER=  24864;
final static int  DVP_FS_主界面返回_LEAVE=  24865;

final static int DVP_FS_返回列表= 24870;
final static int DVP_FS_返回列表_RELEASE=  24871;
final static int DVP_FS_返回列表_PRESSING=  24872;
final static int  DVP_FS_返回列表_PRESSED=  24873;
final static int  DVP_FS_返回列表_ENTER=  24874;
final static int  DVP_FS_返回列表_LEAVE=  24875;


public DVP_FS_Event() {
      actionMap.putInt("播放",DVP_FS_播放);
      actionMap.putInt("上一曲",DVP_FS_上一曲);
      actionMap.putInt("下一曲",DVP_FS_下一曲);
      actionMap.putInt("声道",DVP_FS_声道);
      actionMap.putInt("屏显",DVP_FS_屏显);
      actionMap.putInt("随机",DVP_FS_随机);
      actionMap.putInt("重复",DVP_FS_重复);
      actionMap.putInt("关闭",DVP_FS_关闭);
      actionMap.putInt("主界面返回",DVP_FS_主界面返回);
      actionMap.putInt("返回列表",DVP_FS_返回列表);
	STATE= changeState(STATE,ST_DVP_FS);
	setBindScreen(new Screen_DVP_FS(),SCRN_DVP_FS);
}

public String getScreenName(){
	return  "DVP_FS";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP_FS){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_DVP_FS(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_UPDATE_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_播放_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_上一曲_RELEASE){
				_F_上一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_下一曲_RELEASE){
				_F_下一曲(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_声道_RELEASE){
				_F_声道(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_屏显_RELEASE){
				_F_屏显(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_随机_RELEASE){
				_F_随机(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_重复_RELEASE){
				_F_重复(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_主界面返回_RELEASE){
				_F_BACK_TO_MAIN(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP_FS_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
