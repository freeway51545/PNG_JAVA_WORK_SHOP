package zhw.screen;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import zhw.screen.action.BaseStateEventItem;

public class SettingParameter implements IScreenConst {
	public final static int BOOL_PARAMTER = 0;
	public final static int BUTTON_PARAMTER = 1;
	public final static int GPS_PARAMTER = 2;
	private int nParamterType = BOOL_PARAMTER;
	private String iconName, name;
	public boolean isSelectedItem;
	IParamterCallBack ppcb;
	static private ArrayList<SettingParameter> alParamters = new ArrayList<SettingParameter>();
	public boolean bValue;

	public String getIconName() {
		return iconName;
	};

	public int getParamterType() {
		return nParamterType;
	}

	public SettingParameter(String nameSet, String iconNameSet) {
		name = nameSet;
		iconName = iconNameSet;
		nParamterType = BOOL_PARAMTER;
		ppcb = null;
	}

	public SettingParameter(String nameSet, String iconNameSet, int pType,
			IParamterCallBack ppcbSet) {
		name = nameSet;
		iconName = iconNameSet;
		nParamterType = pType;
		ppcb = ppcbSet;
	}

	public String getShowString() {
		switch (nParamterType) {
		case BOOL_PARAMTER:
		case BUTTON_PARAMTER:
			return name;
		case GPS_PARAMTER:
			return "GPS_TACH_ACTIVE:";
		}
		return name;
	}

	public void action(boolean value) {
		switch (nParamterType) {
		case BOOL_PARAMTER:
			// bValue = !bValue;

			break;
		case BUTTON_PARAMTER:
			if (ppcb != null) {
				ppcb.action();
			}
			return;
		case GPS_PARAMTER:
			return;
		}
	}

	/*
	 * virtual int getDealType()=0; virtual void drawData(int x,int y,int
	 * width,int height,DrawContext &dc)=0; virtual void bnActive()=0; virtual
	 * int readFromFile(char *line)=0; virtual int writeToFile(ZString &line)=0;
	 * virtual bool getBoolValue()=0; void drawData(RECT r,DrawContext &dc){
	 * drawData(r.left,r.top,r.right-r.left,r.bottom-r.top,dc); } RECT
	 * drawIcon(int x,int y,int width,int height,DrawContext &dc); virtual char
	 * *getShowName(char *buffer,int size){return "";}; //void drawIcon(int
	 * x,int y,int width,int height,DrawContext &dc); *
	 */
	class ScreenJump implements IParamterCallBack {
		String screenJump;

		ScreenJump(String nScreen) {
			screenJump = nScreen;
		}

		public void action() {
			// TODO Auto-generated method stub
			BaseStateEventItem.TO_SCRN(screenJump);
		}
	}

	class _F_屏幕校正 implements IParamterCallBack {
		public void action() {
			// TODO Auto-generated method stub
		}
	}

	class _F_恢复出厂设置 implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_设置车标 implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_系统升级 implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_工厂设置 implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}



	public static ArrayList<SettingParameter> listAllParamters() {
		SettingParameter s = new SettingParameter("", "");
		s.inilist();
		return alParamters;
	}

	public SettingParameter getBnParam(String s1, String s2, Class c) {
		Object o = null;
		if (c != null) {
			try {
				o = c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SettingParameter sp = new SettingParameter(s1, s2, BUTTON_PARAMTER,
				(IParamterCallBack) o);
		return sp;
	}

	public SettingParameter getBnScrnParam(String s1, String s2, String screenNo) {
		ScreenJump sj = new ScreenJump(screenNo);
		SettingParameter sp = new SettingParameter(s1, s2, BUTTON_PARAMTER, sj);
		return sp;
	}

	public SettingParameter getBlParam(String s1, String s2) {
		return new SettingParameter(s1, s2);
	}

	private void inilist() {
		if (alParamters.size() != 0)
			return;
		alParamters.add(getBlParam("按键声音", "按钮声音")); // b按键BEEP
		alParamters.add(getBlParam("倒车镜像", "导车镜像"));
		alParamters.add(getBlParam("导航监听", "导航兼听"));
		alParamters.add(getBnParam("恢复出厂设置", "恢复出厂设置", _F_恢复出厂设置.class));
		alParamters.add(getBnParam("车标设置", "车标设置", _F_设置车标.class));
		//alParamters.add(getBnScrnParam("背景设置", "背景设置", SCRN_图片预览));
		alParamters.add(new SettingParameter("GPS导航路径", "GPS导航路径",
				GPS_PARAMTER, null));
		///
		alParamters.add(getBnScrnParam("方向盘设置", "方向盘设置", SCRN_方向盘设置));
		alParamters.add(getBnScrnParam("音量设置", "GPS声音设置", SCRN_GPS声音));
		alParamters.add(getBlParam("启动时启动导航", "启动导航"));
		alParamters.add(getBlParam("界面切换动画", "界面切换"));
		alParamters.add(getBnScrnParam("音频设置", "音频设置", SCRN_音频设置));
		alParamters.add(getBnScrnParam("亮度设置", "亮度设置", SCRN_显示设置));
		alParamters.add(getBnParam("系统升级（请先插入升级卡)", "系统升级", _F_系统升级.class));
		alParamters.add(getBnParam("工厂设置", "工厂设置", _F_工厂设置.class)); // add by
																	// luffy
																	// 12-18
		alParamters.add(getBnScrnParam("系统信息", "版本", SCRN_TXTSHOW));
		alParamters.add(getBlParam("刹车后DVD开", "刹车"));
		alParamters.add(getBlParam("倒车静音", "倒车静音"));
		alParamters.add(getBlParam("倒车时显示雷达", "刹车"));
		// BoolParameter b电阻选择("方向盘按钮电阻开关 1K(开)/10K(关) ","电阻选择");
		alParamters.add(getBnParam("中控设置", "科鲁兹设置", _F_科鲁兹设置.class)); // add by
																		// luffy
																		// 12-18
		alParamters.add(getBlParam("同步GPS时间", "时间设置"));
		alParamters.add(getBnParam("屏幕校正", "触摸校准", _F_屏幕校正.class));
		alParamters.add(getBnScrnParam("测试返回", "测试返回", SCRN_MAIN1));
	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		/*
		Screen screen = ScreenEventManager.getScreen(SCRN_参数设置);
		if (screen != null) {
			BASE_PNG_STRUCT pic = screen.findPng(getIconName());
			if (PNG_STRUCT.class.isInstance(pic)) {
				PNG_STRUCT png = (PNG_STRUCT) pic;
				return png.fetchImageBitmap();
			}
		}
		*/
		return null;
	}

}
