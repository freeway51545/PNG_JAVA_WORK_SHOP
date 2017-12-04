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

	class _F_��ĻУ�� implements IParamterCallBack {
		public void action() {
			// TODO Auto-generated method stub
		}
	}

	class _F_�ָ��������� implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_���ó��� implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_ϵͳ���� implements IParamterCallBack {

		public void action() {
			// TODO Auto-generated method stub

		}

	}

	class _F_�������� implements IParamterCallBack {

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
		alParamters.add(getBlParam("��������", "��ť����")); // b����BEEP
		alParamters.add(getBlParam("��������", "��������"));
		alParamters.add(getBlParam("��������", "��������"));
		alParamters.add(getBnParam("�ָ���������", "�ָ���������", _F_�ָ���������.class));
		alParamters.add(getBnParam("��������", "��������", _F_���ó���.class));
		//alParamters.add(getBnScrnParam("��������", "��������", SCRN_ͼƬԤ��));
		alParamters.add(new SettingParameter("GPS����·��", "GPS����·��",
				GPS_PARAMTER, null));
		///
		alParamters.add(getBnScrnParam("����������", "����������", SCRN_����������));
		alParamters.add(getBnScrnParam("��������", "GPS��������", SCRN_GPS����));
		alParamters.add(getBlParam("����ʱ��������", "��������"));
		alParamters.add(getBlParam("�����л�����", "�����л�"));
		alParamters.add(getBnScrnParam("��Ƶ����", "��Ƶ����", SCRN_��Ƶ����));
		alParamters.add(getBnScrnParam("��������", "��������", SCRN_��ʾ����));
		alParamters.add(getBnParam("ϵͳ���������Ȳ���������)", "ϵͳ����", _F_ϵͳ����.class));
		alParamters.add(getBnParam("��������", "��������", _F_��������.class)); // add by
																	// luffy
																	// 12-18
		alParamters.add(getBnScrnParam("ϵͳ��Ϣ", "�汾", SCRN_TXTSHOW));
		alParamters.add(getBlParam("ɲ����DVD��", "ɲ��"));
		alParamters.add(getBlParam("��������", "��������"));
		alParamters.add(getBlParam("����ʱ��ʾ�״�", "ɲ��"));
		// BoolParameter b����ѡ��("�����̰�ť���迪�� 1K(��)/10K(��) ","����ѡ��");
		alParamters.add(getBnParam("�п�����", "��³������", _F_��³������.class)); // add by
																		// luffy
																		// 12-18
		alParamters.add(getBlParam("ͬ��GPSʱ��", "ʱ������"));
		alParamters.add(getBnParam("��ĻУ��", "����У׼", _F_��ĻУ��.class));
		alParamters.add(getBnScrnParam("���Է���", "���Է���", SCRN_MAIN1));
	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		/*
		Screen screen = ScreenEventManager.getScreen(SCRN_��������);
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
