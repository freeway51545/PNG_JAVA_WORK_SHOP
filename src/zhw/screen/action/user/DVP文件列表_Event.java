package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_DVP�ļ��б�;
public abstract class DVP�ļ��б�_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_�ļ��б�(MSG_ZHW msg);
   public abstract void _F_PREV_PAGE(MSG_ZHW msg);
   public abstract void _F_NEXT_PAGE(MSG_ZHW msg);
   public abstract void _F_DVP_TIMMER(MSG_ZHW msg);
   public abstract void _F_SHOW_Ŀ¼(MSG_ZHW msg);
   public abstract void _F_SHOW_��Ƶ(MSG_ZHW msg);
   public abstract void _F_SHOW_��Ƶ(MSG_ZHW msg);
   public abstract void _F_SHOW_ͼƬ(MSG_ZHW msg);
   public abstract void _F_�����б�(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
     final static int ST_DVP�ļ��б�= 3044;
boolean IS_ST_DVP�ļ��б�(){ return ST_DVP�ļ��б�==STATE;}
final static int DVP�ļ��б�_��һҳ= 24070;
final static int DVP�ļ��б�_��һҳ_RELEASE=  24071;
final static int DVP�ļ��б�_��һҳ_PRESSING=  24072;
final static int  DVP�ļ��б�_��һҳ_PRESSED=  24073;
final static int  DVP�ļ��б�_��һҳ_ENTER=  24074;
final static int  DVP�ļ��б�_��һҳ_LEAVE=  24075;

final static int DVP�ļ��б�_��һҳ= 24080;
final static int DVP�ļ��б�_��һҳ_RELEASE=  24081;
final static int DVP�ļ��б�_��һҳ_PRESSING=  24082;
final static int  DVP�ļ��б�_��һҳ_PRESSED=  24083;
final static int  DVP�ļ��б�_��һҳ_ENTER=  24084;
final static int  DVP�ļ��б�_��һҳ_LEAVE=  24085;

final static int DVP�ļ��б�_Ŀ¼= 24090;
final static int DVP�ļ��б�_Ŀ¼_RELEASE=  24091;
final static int DVP�ļ��б�_Ŀ¼_PRESSING=  24092;
final static int  DVP�ļ��б�_Ŀ¼_PRESSED=  24093;
final static int  DVP�ļ��б�_Ŀ¼_ENTER=  24094;
final static int  DVP�ļ��б�_Ŀ¼_LEAVE=  24095;

final static int DVP�ļ��б�_��Ƶ= 24100;
final static int DVP�ļ��б�_��Ƶ_RELEASE=  24101;
final static int DVP�ļ��б�_��Ƶ_PRESSING=  24102;
final static int  DVP�ļ��б�_��Ƶ_PRESSED=  24103;
final static int  DVP�ļ��б�_��Ƶ_ENTER=  24104;
final static int  DVP�ļ��б�_��Ƶ_LEAVE=  24105;

final static int DVP�ļ��б�_��Ƶ= 24110;
final static int DVP�ļ��б�_��Ƶ_RELEASE=  24111;
final static int DVP�ļ��б�_��Ƶ_PRESSING=  24112;
final static int  DVP�ļ��б�_��Ƶ_PRESSED=  24113;
final static int  DVP�ļ��б�_��Ƶ_ENTER=  24114;
final static int  DVP�ļ��б�_��Ƶ_LEAVE=  24115;

final static int DVP�ļ��б�_ͼƬ= 24120;
final static int DVP�ļ��б�_ͼƬ_RELEASE=  24121;
final static int DVP�ļ��б�_ͼƬ_PRESSING=  24122;
final static int  DVP�ļ��б�_ͼƬ_PRESSED=  24123;
final static int  DVP�ļ��б�_ͼƬ_ENTER=  24124;
final static int  DVP�ļ��б�_ͼƬ_LEAVE=  24125;

final static int DVP�ļ��б�_�����б�= 24130;
final static int DVP�ļ��б�_�����б�_RELEASE=  24131;
final static int DVP�ļ��б�_�����б�_PRESSING=  24132;
final static int  DVP�ļ��б�_�����б�_PRESSED=  24133;
final static int  DVP�ļ��б�_�����б�_ENTER=  24134;
final static int  DVP�ļ��б�_�����б�_LEAVE=  24135;

final static int DVP�ļ��б�_�ر�= 24140;
final static int DVP�ļ��б�_�ر�_RELEASE=  24141;
final static int DVP�ļ��б�_�ر�_PRESSING=  24142;
final static int  DVP�ļ��б�_�ر�_PRESSED=  24143;
final static int  DVP�ļ��б�_�ر�_ENTER=  24144;
final static int  DVP�ļ��б�_�ر�_LEAVE=  24145;


public DVP�ļ��б�_Event() {
      actionMap.putInt("��һҳ",DVP�ļ��б�_��һҳ);
      actionMap.putInt("��һҳ",DVP�ļ��б�_��һҳ);
      actionMap.putInt("Ŀ¼",DVP�ļ��б�_Ŀ¼);
      actionMap.putInt("��Ƶ",DVP�ļ��б�_��Ƶ);
      actionMap.putInt("��Ƶ",DVP�ļ��б�_��Ƶ);
      actionMap.putInt("ͼƬ",DVP�ļ��б�_ͼƬ);
      actionMap.putInt("�����б�",DVP�ļ��б�_�����б�);
      actionMap.putInt("�ر�",DVP�ļ��б�_�ر�);
	STATE= changeState(STATE,ST_DVP�ļ��б�);
	setBindScreen(new Screen_DVP�ļ��б�(),SCRN_DVP�ļ��б�);
}

public String getScreenName(){
	return  "DVP�ļ��б�";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_DVP�ļ��б�){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_�ļ��б�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_��һҳ_RELEASE){
				_F_PREV_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_��һҳ_RELEASE){
				_F_NEXT_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW._TIMMER_10PS){
				_F_DVP_TIMMER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_Ŀ¼_RELEASE){
				_F_SHOW_Ŀ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_��Ƶ_RELEASE){
				_F_SHOW_��Ƶ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_��Ƶ_RELEASE){
				_F_SHOW_��Ƶ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_ͼƬ_RELEASE){
				_F_SHOW_ͼƬ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_�����б�_RELEASE){
				_F_�����б�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==DVP�ļ��б�_�ر�_RELEASE){
				_F_�ر�(msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
