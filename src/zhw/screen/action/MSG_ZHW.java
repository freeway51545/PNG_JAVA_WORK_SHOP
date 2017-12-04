package zhw.screen.action;

import java.awt.event.MouseEvent;
import java.io.Serializable;

public class MSG_ZHW implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8500323262370806228L;
	public final static int NULL_MSG = 0;
	public final static int NULL_RELEASE = 1;
	public final static int NULL_PRESSING = 2;
	public final static int NULL_PRESSED = 3;
	public final static int NULL_ENTER = 4;
	public final static int NULL_LEAVE = 5;

	public final static int _TIMMER_10PS = 1000;
	public final static int _TIMMER_OVER = 1001;
	public final static int MSG_FoundValidChannel = 1002;
	public final static int MSG_SEARCH_OVER = 1003;
	public final static int 独占MouseMove = 1004;
	public final static int 独占MouseUp = 1005;
	public final static int MSG_SET_OK = 1006;
	public final static int MSG_ENTER_STATE = 1007;;
	public final static int MSG_SELECT_UP = 1008;
	public final static int MSG_AUTO_SCROLL = 1009;
	public final static int MSG_SCROLL_STOP = 1010;
	public final static int MSG_ENTER_SCRN = 1011;
	public final static int MSG_RECORD_OVER = 1012;
	public final static int MSG_GAME_OVER = 1013;
	public final static int MSG_DIR_LIST = 1014;
	public final static int MSG_FILE_LIST = 1015;
	public final static int MSG_SONG_TXT = 1016;
	public final static int MSG_SONG_TITLE = 1017;
	public final static int MSG_REDRAW = 1018;
	public final static int MSG_KEY_EVENT = 1019;
	public final static int MSG_EXCHANG_SCRN = 1020;
	public final static int MSG_EXCHANG_STATE = 1021;
	public final static int MSG_TURN_UP = 1023;
	public final static int MSG_TURN_DOWN = 1024;
	public final static int MSG_DIR_LIST_NEW = 1025;
	public final static int MSG_FILE_LIST_NEW = 1026;
	public final static int MSG_GET_TEL_NO = 1027;
	public final static int MSG_BT_STATE_CHANGED = 1028;
	public final static int MSG_TURN_SELECT = 1029;
	public final static int MSG_SONG_NAME_RE = 1030;
	public final static int MSG_DIR_CHANGED = 1031;
	public final static int MSG_MP3_INFOR = 1032;
	public final static int MSG_PLAY_NO_CHANGED = 1033;
	public final static int MSG_USB_PLUG_IN = 1034;
	public final static int MSG_USB_DRAG_OUT = 1035;
	public final static int MSG_SD_PLUG_IN = 1036;
	public final static int MSG_SD_DRAG_OUT = 1037;
	public final static int MSG_OUT_DVD_DOOR = 1038;
	public final static int MSG_IIS_ACTIVE_ON = 1039;
	public final static int MSG_IIS_ACTIVE_OFF = 1040;
	public final static int MSG_INIT_COPY_DATA = 1041;
	public final static int MSG_CHANGE_TO_WINCE = 1042;
	public final static int MSG_CHANGE_TO_CONTROL = 1043;
	public final static int MSG_SCREEN_右滑动 = 1044;
	public final static int MSG_SCREEN_左滑动 = 1045;
	public final static int MSG_DISK_PLUG_IN = 1046;
	public final static int MSG_RE_ENTER_SCRN = 1047;
	public final static int MSG_LONG_PRESSED_MESSAGE = 1048;
	public final static int MSG_MOVE_PRESSED_MESSAGE = 1049;
	public final static int MSG_POWER_ON = 1050;
	public final static int MSG_FILE_PLAY_OVER = 1051;
	public final static int MSG_FULL_SCREEN_CAMERA = 1052;
	public final static int MSG_ENTER_BACK = 1056;
	public final static int MSG_CLOSE_BACK = 1057;
	public final static int MSG_DVD_STATE = 1058;
	public final static int MSG_DVD_FIRST_ENTER = 1059;
	public final static int MSG_ENTERED_NEW = 1060;
	public final static int MSG_OPEN_CAMERA_WINDOW = 1061;
	public final static int MSG_CLOSE_CAMERA_WINDOW = 1062;
	public final static int MSG_CLEAR_CAMERA_WIN_BUFFER = 1063;
	public final static int MSG_CARD_REMOVED = 1064;
	public final static int MSG_CARD_INSERTED = 1065;
	public final static int MSG_POWER_OFF_EVETN = 1066;
	public final static int MSG_IIS_SOURCE_CHANGED = 1067;
	public final static int MSG_REDRAW_FORCE = 1068;
	public final static int MSG_SHOW_ZHW_CONTRL = 1069;
	public final static int MSG_DISABLE_SHOW_CHEBIAO = 1070;
	public final static int MSG_UNLOCK_SCREEN_LOCK = 1080;
	public final static int MSG_LOCK_SCREEN = 1090;
	public final static int MSG_SD_CARD_HAVE_EEROR = 1091;
	public final static int MSG_DRAW_BRIGHT_VOL = 1092;
	public final static int MSG_DRAW_MUTE = 1093;
	public final static int MSG_draw空调Win = 1094;
	public final static int MSG_draw倒车Win = 1095;
	public final static int MSG_SEND_MUTE_CMD = 1096;
	public final static int MSG_RESTORE_WIN0_PHR = 1097;

	public int lParam;
	public int wParam;
//	public MotionEvent event;
	public boolean comsumered;
	public boolean isKeyComsumered;
	public String name;
	public boolean eventDealed;
	public int serialNo;
	public int x;
	public int y;
	public MouseEvent mouseEvent;

	public MSG_ZHW() {
		comsumered = false;
		isKeyComsumered = false;
		eventDealed = false;
		serialNo = 0;
	}

	public MSG_ZHW(int msgEnterState, int state) {
		// TODO Auto-generated constructor stub
		comsumered = false;
		isKeyComsumered = false;
		eventDealed = false;
		serialNo = 0;
		wParam=msgEnterState;
		lParam=state;
	}

	public void setComsumered() {
		// TODO Auto-generated method stub
		comsumered = true;

	};
};
