package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP文件列表;
public abstract class DVP文件列表_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_文件列表(MSG_ZHW msg);
   public abstract void _F_PREV_PAGE(MSG_ZHW msg);
   public abstract void _F_NEXT_PAGE(MSG_ZHW msg);
   public abstract void _F_DVP_TIMMER(MSG_ZHW msg);
   public abstract void _F_SHOW_目录(MSG_ZHW msg);
   public abstract void _F_SHOW_音频(MSG_ZHW msg);
   public abstract void _F_SHOW_视频(MSG_ZHW msg);
   public abstract void _F_SHOW_图片(MSG_ZHW msg);
   public abstract void _F_返回列表(MSG_ZHW msg);
   public abstract void _F_关闭(MSG_ZHW msg);
     final static int ST_DVP文件列表= 3044;
boolean IS_ST_DVP文件列表(){ return ST_DVP文件列表==STATE;}
final static int DVP文件列表_上一页= 24070;
final static int DVP文件列表_上一页_RELEASE=  24071;
final static int DVP文件列表_上一页_PRESSING=  24072;
final static int  DVP文件列表_上一页_PRESSED=  24073;
final static int  DVP文件列表_上一页_ENTER=  24074;
final static int  DVP文件列表_上一页_LEAVE=  24075;

final static int DVP文件列表_下一页= 24080;
final static int DVP文件列表_下一页_RELEASE=  24081;
final static int DVP文件列表_下一页_PRESSING=  24082;
final static int  DVP文件列表_下一页_PRESSED=  24083;
final static int  DVP文件列表_下一页_ENTER=  24084;
final static int  DVP文件列表_下一页_LEAVE=  24085;

final static int DVP文件列表_目录= 24090;
final static int DVP文件列表_目录_RELEASE=  24091;
final static int DVP文件列表_目录_PRESSING=  24092;
final static int  DVP文件列表_目录_PRESSED=  24093;
final static int  DVP文件列表_目录_ENTER=  24094;
final static int  DVP文件列表_目录_LEAVE=  24095;

final static int DVP文件列表_音频= 24100;
final static int DVP文件列表_音频_RELEASE=  24101;
final static int DVP文件列表_音频_PRESSING=  24102;
final static int  DVP文件列表_音频_PRESSED=  24103;
final static int  DVP文件列表_音频_ENTER=  24104;
final static int  DVP文件列表_音频_LEAVE=  24105;

final static int DVP文件列表_视频= 24110;
final static int DVP文件列表_视频_RELEASE=  24111;
final static int DVP文件列表_视频_PRESSING=  24112;
final static int  DVP文件列表_视频_PRESSED=  24113;
final static int  DVP文件列表_视频_ENTER=  24114;
final static int  DVP文件列表_视频_LEAVE=  24115;

final static int DVP文件列表_图片= 24120;
final static int DVP文件列表_图片_RELEASE=  24121;
final static int DVP文件列表_图片_PRESSING=  24122;
final static int  DVP文件列表_图片_PRESSED=  24123;
final static int  DVP文件列表_图片_ENTER=  24124;
final static int  DVP文件列表_图片_LEAVE=  24125;

final static int DVP文件列表_返回列表= 24130;
final static int DVP文件列表_返回列表_RELEASE=  24131;
final static int DVP文件列表_返回列表_PRESSING=  24132;
final static int  DVP文件列表_返回列表_PRESSED=  24133;
final static int  DVP文件列表_返回列表_ENTER=  24134;
final static int  DVP文件列表_返回列表_LEAVE=  24135;

final static int DVP文件列表_关闭= 24140;
final static int DVP文件列表_关闭_RELEASE=  24141;
final static int DVP文件列表_关闭_PRESSING=  24142;
final static int  DVP文件列表_关闭_PRESSED=  24143;
final static int  DVP文件列表_关闭_ENTER=  24144;
final static int  DVP文件列表_关闭_LEAVE=  24145;


public DVP文件列表_Event() {
      actionMap.putInt("上一页",DVP文件列表_上一页);
      actionMap.putInt("下一页",DVP文件列表_下一页);
      actionMap.putInt("目录",DVP文件列表_目录);
      actionMap.putInt("音频",DVP文件列表_音频);
      actionMap.putInt("视频",DVP文件列表_视频);
      actionMap.putInt("图片",DVP文件列表_图片);
      actionMap.putInt("返回列表",DVP文件列表_返回列表);
      actionMap.putInt("关闭",DVP文件列表_关闭);
	STATE= changeState(STATE,ST_DVP文件列表);
	setBindScreen(new Screen_DVP文件列表(),SCRN_DVP文件列表);
}

public String getScreenName(){
	return  "DVP文件列表";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP文件列表){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_文件列表(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_上一页_RELEASE){
				_F_PREV_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_下一页_RELEASE){
				_F_NEXT_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_DVP_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_目录_RELEASE){
				_F_SHOW_目录(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_音频_RELEASE){
				_F_SHOW_音频(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_视频_RELEASE){
				_F_SHOW_视频(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_图片_RELEASE){
				_F_SHOW_图片(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_返回列表_RELEASE){
				_F_返回列表(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP文件列表_关闭_RELEASE){
				_F_关闭(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
