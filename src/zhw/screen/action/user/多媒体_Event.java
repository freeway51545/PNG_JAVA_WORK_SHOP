package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_多媒体;
public abstract class 多媒体_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_播放(MSG_ZHW msg);
   public abstract void _F_PREV_PAGE(MSG_ZHW msg);
   public abstract void _F_NEXT_PAGE(MSG_ZHW msg);
   public abstract void _F_播放(MSG_ZHW msg);
   public abstract void _F_DVD_TIMMER(MSG_ZHW msg);
   public abstract void _F_DIR_CHANGED_NEW(MSG_ZHW msg);
   public abstract void _F_FILES_CHANGED_NEW(MSG_ZHW msg);
   public abstract void _F_SELECTED(String a,MSG_ZHW msg);
   public abstract void _F_RECEIVE_SONG(MSG_ZHW msg);
   public abstract void _F_PLAY_NO_CHANGED(MSG_ZHW msg);
   public abstract void _F_CHANGED_TO_GECI(MSG_ZHW msg);
   public abstract void _F_SELECT_M_视频_切换(MSG_ZHW msg);
   public abstract void _F_MP3_INFOR(MSG_ZHW msg);
   public abstract void _F_PREV(MSG_ZHW msg);
   public abstract void _F_NEXT(MSG_ZHW msg);
   public abstract void _F_FILE_PLAY_OVER(MSG_ZHW msg);
   public abstract void _F_FIRST_PLAY(MSG_ZHW msg);
   public abstract void _F_ENTERED_NEW_MSG(MSG_ZHW msg);
   public abstract void _F_SHOW_目录(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
   public abstract void _F_REMOTE_KEY_DEAL(MSG_ZHW msg);
     final static int ST_多媒体_文件= 3013;
boolean IS_ST_多媒体_文件(){ return ST_多媒体_文件==STATE;}
final static int 多媒体_上一页= 21390;
final static int 多媒体_上一页_RELEASE=  21391;
final static int 多媒体_上一页_PRESSING=  21392;
final static int  多媒体_上一页_PRESSED=  21393;
final static int  多媒体_上一页_ENTER=  21394;
final static int  多媒体_上一页_LEAVE=  21395;

final static int 多媒体_下一页= 21400;
final static int 多媒体_下一页_RELEASE=  21401;
final static int 多媒体_下一页_PRESSING=  21402;
final static int  多媒体_下一页_PRESSED=  21403;
final static int  多媒体_下一页_ENTER=  21404;
final static int  多媒体_下一页_LEAVE=  21405;

final static int 多媒体_播放_暂停= 21410;
final static int 多媒体_播放_暂停_RELEASE=  21411;
final static int 多媒体_播放_暂停_PRESSING=  21412;
final static int  多媒体_播放_暂停_PRESSED=  21413;
final static int  多媒体_播放_暂停_ENTER=  21414;
final static int  多媒体_播放_暂停_LEAVE=  21415;

final static int 多媒体_L1= 21420;
final static int 多媒体_L1_RELEASE=  21421;
final static int 多媒体_L1_PRESSING=  21422;
final static int  多媒体_L1_PRESSED=  21423;
final static int  多媒体_L1_ENTER=  21424;
final static int  多媒体_L1_LEAVE=  21425;

final static int 多媒体_L2= 21430;
final static int 多媒体_L2_RELEASE=  21431;
final static int 多媒体_L2_PRESSING=  21432;
final static int  多媒体_L2_PRESSED=  21433;
final static int  多媒体_L2_ENTER=  21434;
final static int  多媒体_L2_LEAVE=  21435;

final static int 多媒体_L3= 21440;
final static int 多媒体_L3_RELEASE=  21441;
final static int 多媒体_L3_PRESSING=  21442;
final static int  多媒体_L3_PRESSED=  21443;
final static int  多媒体_L3_ENTER=  21444;
final static int  多媒体_L3_LEAVE=  21445;

final static int 多媒体_L4= 21450;
final static int 多媒体_L4_RELEASE=  21451;
final static int 多媒体_L4_PRESSING=  21452;
final static int  多媒体_L4_PRESSED=  21453;
final static int  多媒体_L4_ENTER=  21454;
final static int  多媒体_L4_LEAVE=  21455;

final static int 多媒体_L5= 21460;
final static int 多媒体_L5_RELEASE=  21461;
final static int 多媒体_L5_PRESSING=  21462;
final static int  多媒体_L5_PRESSED=  21463;
final static int  多媒体_L5_ENTER=  21464;
final static int  多媒体_L5_LEAVE=  21465;

final static int 多媒体_L6= 21470;
final static int 多媒体_L6_RELEASE=  21471;
final static int 多媒体_L6_PRESSING=  21472;
final static int  多媒体_L6_PRESSED=  21473;
final static int  多媒体_L6_ENTER=  21474;
final static int  多媒体_L6_LEAVE=  21475;

final static int 多媒体_L7= 21480;
final static int 多媒体_L7_RELEASE=  21481;
final static int 多媒体_L7_PRESSING=  21482;
final static int  多媒体_L7_PRESSED=  21483;
final static int  多媒体_L7_ENTER=  21484;
final static int  多媒体_L7_LEAVE=  21485;

final static int 多媒体_歌词1= 21490;
final static int 多媒体_歌词1_RELEASE=  21491;
final static int 多媒体_歌词1_PRESSING=  21492;
final static int  多媒体_歌词1_PRESSED=  21493;
final static int  多媒体_歌词1_ENTER=  21494;
final static int  多媒体_歌词1_LEAVE=  21495;

final static int 多媒体_视频_音乐= 21500;
final static int 多媒体_视频_音乐_RELEASE=  21501;
final static int 多媒体_视频_音乐_PRESSING=  21502;
final static int  多媒体_视频_音乐_PRESSED=  21503;
final static int  多媒体_视频_音乐_ENTER=  21504;
final static int  多媒体_视频_音乐_LEAVE=  21505;

final static int 多媒体_上一曲= 21510;
final static int 多媒体_上一曲_RELEASE=  21511;
final static int 多媒体_上一曲_PRESSING=  21512;
final static int  多媒体_上一曲_PRESSED=  21513;
final static int  多媒体_上一曲_ENTER=  21514;
final static int  多媒体_上一曲_LEAVE=  21515;

final static int 多媒体_下一曲= 21520;
final static int 多媒体_下一曲_RELEASE=  21521;
final static int 多媒体_下一曲_PRESSING=  21522;
final static int  多媒体_下一曲_PRESSED=  21523;
final static int  多媒体_下一曲_ENTER=  21524;
final static int  多媒体_下一曲_LEAVE=  21525;

final static int 多媒体_显示目录= 21530;
final static int 多媒体_显示目录_RELEASE=  21531;
final static int 多媒体_显示目录_PRESSING=  21532;
final static int  多媒体_显示目录_PRESSED=  21533;
final static int  多媒体_显示目录_ENTER=  21534;
final static int  多媒体_显示目录_LEAVE=  21535;

final static int 多媒体_EQ= 21540;
final static int 多媒体_EQ_RELEASE=  21541;
final static int 多媒体_EQ_PRESSING=  21542;
final static int  多媒体_EQ_PRESSED=  21543;
final static int  多媒体_EQ_ENTER=  21544;
final static int  多媒体_EQ_LEAVE=  21545;

final static int 多媒体_关闭= 21550;
final static int 多媒体_关闭_RELEASE=  21551;
final static int 多媒体_关闭_PRESSING=  21552;
final static int  多媒体_关闭_PRESSED=  21553;
final static int  多媒体_关闭_ENTER=  21554;
final static int  多媒体_关闭_LEAVE=  21555;


public 多媒体_Event() {
      actionMap.putInt("上一页",多媒体_上一页);
      actionMap.putInt("下一页",多媒体_下一页);
      actionMap.putInt("播放_暂停",多媒体_播放_暂停);
      actionMap.putInt("L1",多媒体_L1);
      actionMap.putInt("L2",多媒体_L2);
      actionMap.putInt("L3",多媒体_L3);
      actionMap.putInt("L4",多媒体_L4);
      actionMap.putInt("L5",多媒体_L5);
      actionMap.putInt("L6",多媒体_L6);
      actionMap.putInt("L7",多媒体_L7);
      actionMap.putInt("歌词1",多媒体_歌词1);
      actionMap.putInt("视频_音乐",多媒体_视频_音乐);
      actionMap.putInt("上一曲",多媒体_上一曲);
      actionMap.putInt("下一曲",多媒体_下一曲);
      actionMap.putInt("显示目录",多媒体_显示目录);
      actionMap.putInt("EQ",多媒体_EQ);
      actionMap.putInt("关闭",多媒体_关闭);
	STATE= changeState(STATE,ST_多媒体_文件);
	setBindScreen(new Screen_多媒体(),SCRN_多媒体);
}

public String getScreenName(){
	return  "多媒体";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_多媒体_文件){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_上一页_RELEASE){
				_F_PREV_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_下一页_RELEASE){
				_F_NEXT_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_播放_暂停_RELEASE){
				_F_播放(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_DVD_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_DIR_LIST_NEW){
				_F_DIR_CHANGED_NEW(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FILE_LIST_NEW){
				_F_FILES_CHANGED_NEW(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L1_RELEASE){
				_F_SELECTED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L2_RELEASE){
				_F_SELECTED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L3_RELEASE){
				_F_SELECTED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L4_RELEASE){
				_F_SELECTED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L5_RELEASE){
				_F_SELECTED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L6_RELEASE){
				_F_SELECTED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_L7_RELEASE){
				_F_SELECTED("7",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
			if(msg.wParam==MSG_ZHW.MSG_SONG_NAME_RE){
				_F_RECEIVE_SONG(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_PLAY_NO_CHANGED){
				_F_PLAY_NO_CHANGED(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_歌词1_RELEASE){
				_F_CHANGED_TO_GECI(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_视频_音乐_RELEASE){
				_F_SELECT_M_视频_切换(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_MP3_INFOR){
				_F_MP3_INFOR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_上一曲_RELEASE){
				_F_PREV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_下一曲_RELEASE){
				_F_NEXT(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_FILE_PLAY_OVER){
				_F_FILE_PLAY_OVER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_DVD_FIRST_ENTER){
				_F_FIRST_PLAY(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTERED_NEW){
				_F_ENTERED_NEW_MSG(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_显示目录_RELEASE){
				_F_SHOW_目录(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_EQ_RELEASE){
				_F_EQ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==多媒体_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_KEY_EVENT){
				_F_REMOTE_KEY_DEAL(msg);
				msg.setComsumered();
			}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
