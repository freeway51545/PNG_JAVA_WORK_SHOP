package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��ý��;
public abstract class ��ý��_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_INIT_����(MSG_ZHW msg);
   public abstract void _F_PREV_PAGE(MSG_ZHW msg);
   public abstract void _F_NEXT_PAGE(MSG_ZHW msg);
   public abstract void _F_����(MSG_ZHW msg);
   public abstract void _F_DVD_TIMMER(MSG_ZHW msg);
   public abstract void _F_DIR_CHANGED_NEW(MSG_ZHW msg);
   public abstract void _F_FILES_CHANGED_NEW(MSG_ZHW msg);
   public abstract void _F_SELECTED(String a,MSG_ZHW msg);
   public abstract void _F_RECEIVE_SONG(MSG_ZHW msg);
   public abstract void _F_PLAY_NO_CHANGED(MSG_ZHW msg);
   public abstract void _F_CHANGED_TO_GECI(MSG_ZHW msg);
   public abstract void _F_SELECT_M_��Ƶ_�л�(MSG_ZHW msg);
   public abstract void _F_MP3_INFOR(MSG_ZHW msg);
   public abstract void _F_PREV(MSG_ZHW msg);
   public abstract void _F_NEXT(MSG_ZHW msg);
   public abstract void _F_FILE_PLAY_OVER(MSG_ZHW msg);
   public abstract void _F_FIRST_PLAY(MSG_ZHW msg);
   public abstract void _F_ENTERED_NEW_MSG(MSG_ZHW msg);
   public abstract void _F_SHOW_Ŀ¼(MSG_ZHW msg);
   public abstract void _F_EQ(MSG_ZHW msg);
   public abstract void _F_�ر�(MSG_ZHW msg);
   public abstract void _F_REMOTE_KEY_DEAL(MSG_ZHW msg);
     final static int ST_��ý��_�ļ�= 3013;
boolean IS_ST_��ý��_�ļ�(){ return ST_��ý��_�ļ�==STATE;}
final static int ��ý��_��һҳ= 21390;
final static int ��ý��_��һҳ_RELEASE=  21391;
final static int ��ý��_��һҳ_PRESSING=  21392;
final static int  ��ý��_��һҳ_PRESSED=  21393;
final static int  ��ý��_��һҳ_ENTER=  21394;
final static int  ��ý��_��һҳ_LEAVE=  21395;

final static int ��ý��_��һҳ= 21400;
final static int ��ý��_��һҳ_RELEASE=  21401;
final static int ��ý��_��һҳ_PRESSING=  21402;
final static int  ��ý��_��һҳ_PRESSED=  21403;
final static int  ��ý��_��һҳ_ENTER=  21404;
final static int  ��ý��_��һҳ_LEAVE=  21405;

final static int ��ý��_����_��ͣ= 21410;
final static int ��ý��_����_��ͣ_RELEASE=  21411;
final static int ��ý��_����_��ͣ_PRESSING=  21412;
final static int  ��ý��_����_��ͣ_PRESSED=  21413;
final static int  ��ý��_����_��ͣ_ENTER=  21414;
final static int  ��ý��_����_��ͣ_LEAVE=  21415;

final static int ��ý��_L1= 21420;
final static int ��ý��_L1_RELEASE=  21421;
final static int ��ý��_L1_PRESSING=  21422;
final static int  ��ý��_L1_PRESSED=  21423;
final static int  ��ý��_L1_ENTER=  21424;
final static int  ��ý��_L1_LEAVE=  21425;

final static int ��ý��_L2= 21430;
final static int ��ý��_L2_RELEASE=  21431;
final static int ��ý��_L2_PRESSING=  21432;
final static int  ��ý��_L2_PRESSED=  21433;
final static int  ��ý��_L2_ENTER=  21434;
final static int  ��ý��_L2_LEAVE=  21435;

final static int ��ý��_L3= 21440;
final static int ��ý��_L3_RELEASE=  21441;
final static int ��ý��_L3_PRESSING=  21442;
final static int  ��ý��_L3_PRESSED=  21443;
final static int  ��ý��_L3_ENTER=  21444;
final static int  ��ý��_L3_LEAVE=  21445;

final static int ��ý��_L4= 21450;
final static int ��ý��_L4_RELEASE=  21451;
final static int ��ý��_L4_PRESSING=  21452;
final static int  ��ý��_L4_PRESSED=  21453;
final static int  ��ý��_L4_ENTER=  21454;
final static int  ��ý��_L4_LEAVE=  21455;

final static int ��ý��_L5= 21460;
final static int ��ý��_L5_RELEASE=  21461;
final static int ��ý��_L5_PRESSING=  21462;
final static int  ��ý��_L5_PRESSED=  21463;
final static int  ��ý��_L5_ENTER=  21464;
final static int  ��ý��_L5_LEAVE=  21465;

final static int ��ý��_L6= 21470;
final static int ��ý��_L6_RELEASE=  21471;
final static int ��ý��_L6_PRESSING=  21472;
final static int  ��ý��_L6_PRESSED=  21473;
final static int  ��ý��_L6_ENTER=  21474;
final static int  ��ý��_L6_LEAVE=  21475;

final static int ��ý��_L7= 21480;
final static int ��ý��_L7_RELEASE=  21481;
final static int ��ý��_L7_PRESSING=  21482;
final static int  ��ý��_L7_PRESSED=  21483;
final static int  ��ý��_L7_ENTER=  21484;
final static int  ��ý��_L7_LEAVE=  21485;

final static int ��ý��_���1= 21490;
final static int ��ý��_���1_RELEASE=  21491;
final static int ��ý��_���1_PRESSING=  21492;
final static int  ��ý��_���1_PRESSED=  21493;
final static int  ��ý��_���1_ENTER=  21494;
final static int  ��ý��_���1_LEAVE=  21495;

final static int ��ý��_��Ƶ_����= 21500;
final static int ��ý��_��Ƶ_����_RELEASE=  21501;
final static int ��ý��_��Ƶ_����_PRESSING=  21502;
final static int  ��ý��_��Ƶ_����_PRESSED=  21503;
final static int  ��ý��_��Ƶ_����_ENTER=  21504;
final static int  ��ý��_��Ƶ_����_LEAVE=  21505;

final static int ��ý��_��һ��= 21510;
final static int ��ý��_��һ��_RELEASE=  21511;
final static int ��ý��_��һ��_PRESSING=  21512;
final static int  ��ý��_��һ��_PRESSED=  21513;
final static int  ��ý��_��һ��_ENTER=  21514;
final static int  ��ý��_��һ��_LEAVE=  21515;

final static int ��ý��_��һ��= 21520;
final static int ��ý��_��һ��_RELEASE=  21521;
final static int ��ý��_��һ��_PRESSING=  21522;
final static int  ��ý��_��һ��_PRESSED=  21523;
final static int  ��ý��_��һ��_ENTER=  21524;
final static int  ��ý��_��һ��_LEAVE=  21525;

final static int ��ý��_��ʾĿ¼= 21530;
final static int ��ý��_��ʾĿ¼_RELEASE=  21531;
final static int ��ý��_��ʾĿ¼_PRESSING=  21532;
final static int  ��ý��_��ʾĿ¼_PRESSED=  21533;
final static int  ��ý��_��ʾĿ¼_ENTER=  21534;
final static int  ��ý��_��ʾĿ¼_LEAVE=  21535;

final static int ��ý��_EQ= 21540;
final static int ��ý��_EQ_RELEASE=  21541;
final static int ��ý��_EQ_PRESSING=  21542;
final static int  ��ý��_EQ_PRESSED=  21543;
final static int  ��ý��_EQ_ENTER=  21544;
final static int  ��ý��_EQ_LEAVE=  21545;

final static int ��ý��_�ر�= 21550;
final static int ��ý��_�ر�_RELEASE=  21551;
final static int ��ý��_�ر�_PRESSING=  21552;
final static int  ��ý��_�ر�_PRESSED=  21553;
final static int  ��ý��_�ر�_ENTER=  21554;
final static int  ��ý��_�ر�_LEAVE=  21555;


public ��ý��_Event() {
      actionMap.putInt("��һҳ",��ý��_��һҳ);
      actionMap.putInt("��һҳ",��ý��_��һҳ);
      actionMap.putInt("����_��ͣ",��ý��_����_��ͣ);
      actionMap.putInt("L1",��ý��_L1);
      actionMap.putInt("L2",��ý��_L2);
      actionMap.putInt("L3",��ý��_L3);
      actionMap.putInt("L4",��ý��_L4);
      actionMap.putInt("L5",��ý��_L5);
      actionMap.putInt("L6",��ý��_L6);
      actionMap.putInt("L7",��ý��_L7);
      actionMap.putInt("���1",��ý��_���1);
      actionMap.putInt("��Ƶ_����",��ý��_��Ƶ_����);
      actionMap.putInt("��һ��",��ý��_��һ��);
      actionMap.putInt("��һ��",��ý��_��һ��);
      actionMap.putInt("��ʾĿ¼",��ý��_��ʾĿ¼);
      actionMap.putInt("EQ",��ý��_EQ);
      actionMap.putInt("�ر�",��ý��_�ر�);
	STATE= changeState(STATE,ST_��ý��_�ļ�);
	setBindScreen(new Screen_��ý��(),SCRN_��ý��);
}

public String getScreenName(){
	return  "��ý��";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��ý��_�ļ�){
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_INIT_����(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_��һҳ_RELEASE){
				_F_PREV_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_��һҳ_RELEASE){
				_F_NEXT_PAGE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_����_��ͣ_RELEASE){
				_F_����(msg);
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
			if(msg.wParam==��ý��_L1_RELEASE){
				_F_SELECTED("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L2_RELEASE){
				_F_SELECTED("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L3_RELEASE){
				_F_SELECTED("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L4_RELEASE){
				_F_SELECTED("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L5_RELEASE){
				_F_SELECTED("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L6_RELEASE){
				_F_SELECTED("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_L7_RELEASE){
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
			if(msg.wParam==��ý��_���1_RELEASE){
				_F_CHANGED_TO_GECI(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_��Ƶ_����_RELEASE){
				_F_SELECT_M_��Ƶ_�л�(msg);
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_MP3_INFOR){
				_F_MP3_INFOR(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_��һ��_RELEASE){
				_F_PREV(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_��һ��_RELEASE){
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
			if(msg.wParam==��ý��_��ʾĿ¼_RELEASE){
				_F_SHOW_Ŀ¼(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_EQ_RELEASE){
				_F_EQ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��ý��_�ر�_RELEASE){
				_F_�ر�(msg);
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
