package zhw.png;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;

import dc.Draw;
import dc.WorkDialog;

public class FileOp {
	final static int UNKOWN_TYPE = 0;
	final static int INFOR_PNG = 1;
	final static int INFOR_TXT = 2;
	final static int INFOR_BACK_GROUND = 3;
	public static boolean IS_RUN_MODE = false;

	public final static int TEST_DRAWX = 10;
	public final static int TEST_DRAWY = 50;
	public final static int CUT_DRAWX = 100;
	public final static int CUT_DRAWY = 100;

	public int screenLoc = -1, pngLoc = -1, txtLoc = -1;
	ScreenGraphic thisScreen;
	public Vector<ScreenGraphic> allScreen = new Vector<ScreenGraphic>();

	public ScreenGraphic findScreen(String name) {
		for (int i = 0; i < allScreen.size(); i++) {
			if (name.equals(allScreen.get(i).screenId)) {
				return allScreen.get(i);
			}
		}
		return null;
	}

	private int nActiveScreen = 0;
	// public int screenLen;
	public int actScrnNo;

	private Draw draw = null;

	// private int changedInfor;

	public String getPropIni() {
		return "prop.ini";
	}

	public String getPrjectFileName() {
		return "project";
	}

	private static int getNextInteger(StringTokenizer st) {
		if (st == null)
			return 0;
		if (st.hasMoreElements()) {
			String s = st.nextToken();
			s = s.trim();
			if (s.startsWith("0X")) {
				return getHex(s.substring(2));
			}
			try {

				return Integer.parseInt(s);
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	static int getNo(char c) {
		if (c >= '0' && c <= '9') {
			return c - '0';
		}
		if (c >= 'a' && c <= 'f') {
			return c - 'a' + 10;
		}
		if (c >= 'A' && c <= 'F') {
			return c - 'A' + 10;
		}
		return 0;
	}

	private static int getHex(String substring) {
		// TODO Auto-generated method stub
		char ca[] = substring.toCharArray();
		int n = 0;
		for (int i = 0; i < ca.length; i++) {
			n *= 16;
			n += getNo(ca[i]);
		}
		return n;
	}

	public void loadSetting() throws IOException {
		allScreen.clear();
		int inforType = UNKOWN_TYPE;

		screenLoc = -1;
		pngLoc = -1;
		txtLoc = -1;
		pngLoc = -1;
		// screenLen = 0;
		actScrnNo = 0;
		File dir = new File(getPrjectFileName());
		File fs[] = null;
		dir.mkdirs();
		if (dir.exists()) {
			fs = dir.listFiles();
		}
		if (fs == null || fs.length == 0) {
			File f = new File(getPropIni());
			fs = new File[1];
			fs[0] = f;
		}
		for (int i = 0; i < fs.length; i++) {
			if (!fs[i].getName().endsWith(".ini")) {
				continue;
			}
			FileReader fis = new FileReader(fs[i]);
			java.io.BufferedReader br = new BufferedReader(fis);
			// scan the screen and PNG FILE AND TXTS

			while (true) {
				String buffer = br.readLine();
				if (buffer == null)
					break;
				String line = buffer;
				if (buffer.length() > 0) {
					if (buffer.startsWith("[BACK_GROUND")) {
						inforType = INFOR_BACK_GROUND;
						if (pngLoc != -1) {
							inforType = UNKOWN_TYPE;
						}
						// SIZE=
						StringTokenizer st = new StringTokenizer(line, "[] ");
						st.nextElement();
						while (st.hasMoreElements()) {
							String str = st.nextToken();
							if (str.startsWith("SIZE=")) {
								StringTokenizer v = new StringTokenizer(str,
										"=X");
								String stName = v.nextToken();
								String stWidth = v.nextToken();
								String stHeight = v.nextToken();
								if ("SIZE".equals(stName)) {
									if (stWidth != null || stHeight != null) {
										try {
											ScreenGraphic.sizeWidth = Integer
													.parseInt(stWidth);
											ScreenGraphic.sizeHeight = Integer
													.parseInt(stHeight);
										} catch (Exception e) {
											e.printStackTrace();
										}
									}
								}
							}
						}
					} else if (line.startsWith("[SCREEN")) {
						thisScreen = new ScreenGraphic();
						allScreen.add(thisScreen);
						StringTokenizer st = new StringTokenizer(line, "[] ");
						// StringToken st(line," ][");
						// st.next();
						thisScreen.dlgBack = "";
						thisScreen.initParamValue();
						while (st.hasMoreElements()) {
							String nextValue = st.nextToken();
							if (nextValue == null) {
								break;
							}
							StringTokenizer v = new StringTokenizer(nextValue,
									"=");
							String id = v.nextToken();
							if (v.hasMoreElements()) {
								String value = v.nextToken();
								if (id.equals("ID")) {
									thisScreen.screenId = value;
								} else if (id.equals("NAME")) {
									thisScreen.screenName = value;
								} else if (id.endsWith("PROJECT")) {
									thisScreen.projectPath = value;
								} else if (id.equals("DlgBack")) {
									thisScreen.dlgBack = value;// 背景
								} else if (id.equals("GEN_CODE")) {
									if (value.length() == 0
											|| value.charAt(0) == 'F'
											|| value.charAt(0) == 'f') {
										thisScreen.genCode = false;
									}
								} else if (id.equals("beinclude")) {
									if (value.charAt(0) == 't') {
										thisScreen.beinclude = true;
									}
								} else if (id.equals("Fullscreen")) {
									if (value.length() == 0
											|| value.charAt(0) == 'T'
											|| value.charAt(0) == 't') {
										thisScreen.Fullscreen = true;
									}
								} else if (id.equals("background")) {
									thisScreen.background = value;
								} else if (id.equals("packageName")) {
									thisScreen.packageName = value;
								} else if (id.equals("INCLUDE")) {
									// if (value.equals("true")) {
									thisScreen.setIncludeEq(value);
									// }
								} else if (id.equals("GEN")) {
									if (value.charAt(0) == 'f'
											|| value.charAt(0) == 'F') {
										thisScreen.setGen(false);
									}
								}

							}
						}
					} else if (buffer.equals("[PNG]")) {
						inforType = INFOR_PNG;
					} else if (buffer.equals("[TXT]")) {
						inforType = INFOR_TXT;
					} else {
						if (inforType == UNKOWN_TYPE) {
							continue;//
						} else if (inforType == INFOR_BACK_GROUND) {
						} else if (inforType == INFOR_PNG) {
							PNG_STRUCT png = new PNG_STRUCT();
							StringTokenizer st = new StringTokenizer(buffer,
									"\t");
							String name = st.nextToken();
							name = name.trim();
							int p0 = name.indexOf('[');
							int p2 = name.indexOf(']');
							if (p0 > 0 && p2 > 0) {
								String actionName = name.substring(p0 + 1, p2);
								int actionLoc = actionName.indexOf(':');
								if (actionLoc > 0) {
									png.aliasName = actionName.substring(0,
											actionLoc);
									png.actionFunction = actionName
											.substring(actionLoc + 1);
								} else {
									png.aliasName = actionName;
									png.actionFunction = "";
								}
								png.name = name.substring(0, p0);
								png.name = png.name.toLowerCase();
							} else {
								png.name = name;
								png.name = png.name.toLowerCase();
								png.aliasName = null;
							}
							png.xLoc = getNextInteger(st);
							png.yLoc = getNextInteger(st);
							png.showCondition = getNextInteger(st);

							// sscanf(bufferTemp1,"%d\t%d\t%d\t%d",&pngStruct[pngLoc].xLoc,&pngStruct[pngLoc].yLoc,&pngStruct[pngLoc].showCondition,&pngStruct[pngLoc].nNumberPic);
							// if(thisScreen.pngLen==1){
							// thisScreen.pnStructList=&pngStruct[pngLoc];
							// }
							thisScreen.pnStructList.add(png);
							/*
							 * if(pngStruct[pngLoc].showCondition==5){
							 * thisScreen.nBackGroundNo=thisScreen.pngLen;
							 * thisScreen.activeNo=thisScreen.nBackGroundNo+1;
							 * // 设置 }
							 */
						} else {
							TXT_STRUCT tx = new TXT_STRUCT();
							StringTokenizer st = new StringTokenizer(buffer,
									"\t");
							tx.name = st.nextToken().trim();
							tx.xLoc = getNextInteger(st);
							tx.yLoc = getNextInteger(st);
							tx.width = getNextInteger(st);
							tx.height = getNextInteger(st);
							tx.rgb = getNextInteger(st);
							tx.fontSize = getNextInteger(st);
							tx.showCondition = getNextInteger(st);
							tx.dY = getNextInteger(st);
							tx.dHgith = getNextInteger(st);
							if (tx.rgb == 0) {
								tx.rgb = 0xffffff;
							}
							if (tx.fontSize <= 5) {
								tx.fontSize = 10;
							}
							this.thisScreen.txtStruct.add(tx);
						}
					}
				}
			}
			// readParams();
			br.close();
			fis.close();
		}
	}

	public int getnActiveScreen() {
		return nActiveScreen;
	}

	public void setnActiveScreen(int nActiveScreen) {
		this.allScreen.get(this.nActiveScreen).uninit();
		this.nActiveScreen = nActiveScreen;

	}

	public ScreenGraphic getCurrentScreen() {
		// TODO Auto-generated method stub
		return allScreen.get(nActiveScreen);
	}

	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		ScreenGraphic s = getCurrentScreen();
		BaseItem bi = s.getActiveItem();
		bi.setLocation(bi.getX() + dx, bi.getY() + dy);
		draw.updateShow();
		draw.repaint();
	}

	public void setDraw(Draw draw2) {
		// TODO Auto-generated method stub
		draw = draw2;
	}

	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		// 数值范围 -10,-10 1024+10 X 600 +10
		x -= TEST_DRAWX;
		y -= TEST_DRAWY;
		if (x < -10)
			return;
		if (y < -10)
			return;
		if (x > 1024 + 10)
			return;
		if (y > 600 + 10)
			return;
		ScreenGraphic s = getCurrentScreen();
		BaseItem bi = s.getActiveItem();
		bi.setLocation(x, y);
		draw.updateShow();
		draw.repaint();
	}

	void saveCurrent() throws IOException {

		//
		File dir = new File(getPrjectFileName());
		File fs[] = null;
		if (dir.exists()) {
			fs = dir.listFiles();
		}
		if (fs == null || fs.length == 0) {
			return;
		}
		Calendar c = Calendar.getInstance();
		String prjDir = "autosave\\prject_" + c.get(Calendar.YEAR) + "-"
				+ c.get(Calendar.MONTH) + "-" + c.get(Calendar.DAY_OF_MONTH)
				+ "_" + c.get(Calendar.HOUR) + "：" + c.get(Calendar.MINUTE)
				+ "\\";
		new File(prjDir).mkdirs();
		for (int i = 0; i < fs.length; i++) {
			if (fs[i].isDirectory()) {
				continue;
			}
			if (!fs[i].getName().endsWith(".ini")) {
				continue;
			}
			String backUpName = prjDir + fs[i].getName();
			FileOutputStream fos = new FileOutputStream(backUpName);
			FileInputStream fis = new FileInputStream(fs[i]);
			byte ba[] = new byte[1024];
			do {
				int n = fis.read(ba);
				if (n <= 0)
					break;
				fos.write(ba, 0, n);
			} while (true);
			// CopyFile(getTFileName(L"prop.ini",orgFile),getTFileName(oldFile,pathOldFile),true);
			fis.close();
			fos.close();
		}
	}

	public static String getStringJavaFileName0(String c) {
		// char ccc[] = new char[1000];
		StringBuffer sb = new StringBuffer();
		if (c == null)
			return "null";
		// int n=0;
		// ccc[n++]='\"';
		// sb.append('"');
		for (int i = 0; i < c.length(); i++) {
			char c0 = c.charAt(i);
			if (c0 > 0x7F) {
				// StringBuffer sb=new StringBuffer
				sb.append(String.valueOf((int) c0)).append("_");
			} else {
				// ccc[n++]=c0;
				sb.append(c0);
			}
			if (c0 == '\\')
				sb.append('\\');
			// ccc[n++]='\\';
		}
		// ccc[n++]='\"';
		// sb.append('"');
		// ccc[n]=0;
		return sb.toString();
	}

	String getStringJavaFileName(String c) {
		// char ccc[] = new char[1000];
		StringBuffer sb = new StringBuffer();
		if (c == null)
			return "null";
		// int n=0;
		// ccc[n++]='\"';
		sb.append('"');
		for (int i = 0; i < c.length(); i++) {
			char c0 = c.charAt(i);
			if (c0 > 0x7F) {
				// StringBuffer sb=new StringBuffer
				sb.append(String.valueOf((int) c0)).append("_");
			} else {
				// ccc[n++]=c0;
				sb.append(c0);
			}
			if (c0 == '\\')
				sb.append('\\');
			// ccc[n++]='\\';
		}
		// ccc[n++]='\"';
		sb.append('"');
		// ccc[n]=0;
		return sb.toString();
	}

	String getStringJava(String c) {
		// char ccc[] = new char[1000];
		StringBuffer sb = new StringBuffer();
		if (c == null)
			return "null";
		// int n=0;
		// ccc[n++]='\"';
		sb.append('"');
		for (int i = 0; i < c.length(); i++) {
			char c0 = c.charAt(i);
			if (c0 > 0x7F) {
				// StringBuffer sb=new StringBuffer
				// sb.append(String.valueOf((int)c0)).append("_");
				sb.append(c0);
			} else {
				// ccc[n++]=c0;
				sb.append(c0);
			}
			if (c0 == '\\')
				sb.append('\\');
			// ccc[n++]='\\';
		}
		// ccc[n++]='\"';
		sb.append('"');
		// ccc[n]=0;
		return sb.toString();
	}

	/*
	 * public static void getModifiedTime_1(){ File f = new
	 * File("C:\\test.txt"); //Calendar cal = Calendar.getInstance(); long time
	 * = f.lastModified(); //cal.setTimeInMillis(time);
	 * //此处toLocalString()方法是不推荐的，但是仍可输出 //System.out.println("修改时间[1] " +
	 * cal.getTime().toLocaleString()); //输出：修改时间[1] 2009-8-17 10:32:38 }
	 */
	// 复制文件
	static Runtime runtime = Runtime.getRuntime();

	public static void copyFileTrue0(String s, String t) {
		String cmd = "cmd /c copy " + s + " " + t + "";
		try {
			System.out.println("begin execute :" + cmd);
			runtime.exec(cmd);
			System.out.println("execute over:" + cmd);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void copyFileTrueWeb(String s, String tempFile, String t) {

		String cmd = "F:\\F102-PROJ-01\\libwebp-0.4.4-windows-x86\\bin\\cwebp -q 80 "
				+ s + " -o " + t;

		String cmdCopy = "cmd /c copy " + s + " " + tempFile + "";
		try {
			System.out.println("begin execute :" + cmd);
			runtime.exec(cmdCopy);
			System.out.println("execute over:" + cmd);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("begin execute :" + cmd);
			runtime.exec(cmd);
			System.out.println("execute over:" + cmd);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void copyFile(File sourceFile, File tempFile, File targetFile)
			throws IOException {
		if (!sourceFile.exists()) {
			return;
		}

		if (sourceFile.exists() && tempFile.exists()) {
			if (sourceFile.lastModified() == tempFile.lastModified()
					&& sourceFile.length() == tempFile.length()) {
				System.out.println("SAME FILE :" + tempFile.getPath());
				return;
			}
		}
		String path = "E:\\Android_DC\\F102_JAVA_IMAGE\\"
				+ sourceFile.getPath();
		String targetFileName = targetFile.getPath();
		// targetFileName = targetFileName.toLowerCase();
		// targetFileName = targetFileName.replace(".png", ".webp");
		copyFileTrueWeb(path, tempFile.getPath(), targetFileName);
		/*
		 * BufferedInputStream inBuff = null; BufferedOutputStream outBuff =
		 * null; try { // 新建文件输入流并对它进行缓冲 inBuff = new BufferedInputStream(new
		 * FileInputStream(sourceFile));
		 * 
		 * // 新建文件输出流并对它进行缓冲 outBuff = new BufferedOutputStream(new
		 * FileOutputStream(targetFile));
		 * 
		 * // 缓冲数组 byte[] b = new byte[1024 * 5]; int len; while ((len =
		 * inBuff.read(b)) != -1) { outBuff.write(b, 0, len); } // 刷新此缓冲的输出流
		 * outBuff.flush(); } finally { // 关闭流 if (inBuff != null)
		 * inBuff.close(); if (outBuff != null) outBuff.close(); }
		 */
	}

	public static void copyFile0(File sourceFile, File targetFile)
			throws IOException {

		BufferedInputStream inBuff = null;
		BufferedOutputStream outBuff = null;
		try {
			// 新建文件输入流并对它进行缓冲
			inBuff = new BufferedInputStream(new FileInputStream(sourceFile));

			// 新建文件输出流并对它进行缓冲
			outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));

			// 缓冲数组
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1) {
				outBuff.write(b, 0, len);
			}
			// 刷新此缓冲的输出流
			outBuff.flush();
		} finally {
			// 关闭流
			if (inBuff != null)
				inBuff.close();
			if (outBuff != null)
				outBuff.close();
		}
	}

	// void copyDir(String src,String target){
	// File f=new File(src);
	// File fa[]=f.listFiles();
	// if(fa==null)
	// return;
	// (new File(target)).mkdirs();
	// for(int i=0;i<fa.length;i++){
	// String name=fa[i].getName();
	// if(fa[i].isDirectory()){
	// if(".".equals(name))
	// continue;
	// if("..".equals(name))
	// continue;
	// copyDir(src+"\\"+fa[i].getName(),target+"\\"+fa[i].getName());
	// }else{
	// File t=new File(target+name);
	// try {
	// copyFile(fa[i],t);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// }
	// }
	void writeDatas(ScreenGraphic s0, ScreenGraphic parentScreen)
			throws FileNotFoundException {
		String fileName;
		String projectPath = parentScreen.projectPath;
		// boolean isIncludedPackage = false;
		// if (s0.getPacageName().equals(parentScreen.getIncludePack())) {
		// isIncludedPackage = true;
		// }
		if (projectPath != null) {
			if (s0.beinclude) {
				fileName = projectPath
						+ "\\src\\zhw\\screen\\user\\action_include\\Screen_"
						+ s0.screenId + ".java";
				makeDir(fileName);
			} else {
				fileName = projectPath + "\\src\\zhw\\screen\\user\\Screen_"
						+ s0.screenId + ".java";
			}
		} else {
			return;
		}
		// sprintf(fileName,"F:\ZHW-WINCE-C-for-3360\UI\A6\Setting\\%s-setting.cpp",uiBaseRoot);
		setFileWritbale(fileName);
		PrintWriter pw = new PrintWriter(fileName);
		// FILE *fpWrite=fopen(fileName,"wb");
		// scan the screen and PNG FILE AND TXTS
		if (s0.beinclude) {
			pw.printf("package zhw.screen.user.action_include;\r\n");
		} else {
			pw.printf("package zhw.screen.user;\r\n");
		}

		pw.printf("import zhw.png.PNG_STRUCT;\r\nimport zhw.png.TXT_STRUCT;\r\nimport zhw.screen.Screen;\r\nimport zhw.screen.DlgScreen;\r\n");
		if (s0.isDlg()) {
			pw.printf("public class Screen_%s extends DlgScreen{\r\n",
					s0.screenId);
		} else {
			pw.printf("public class Screen_%s extends Screen{\r\n", s0.screenId);
		}
		// pw.printf("	public Screen screen[]=new Screen[%d] ;\r\n",screenLen);
		pw.printf("	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[%d];\r\n",
				s0.pnStructList.size());
		pw.printf("	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[%d];\r\n",
				s0.txtStruct.size());

		pw.printf("//pngLoc=%d;\r\n", pngLoc);
		pw.printf("//txtLoc=%d;\r\n", txtLoc);
		// pw.printf("//backGroundACount=%d;\r\n",backGroundACount);

		pw.printf("private void initPng(){\r\n");
		pw.printf("	PNG_STRUCT pngs[]=new PNG_STRUCT[%d];\r\n",
				s0.pnStructList.size());
		pw.printf("	for(int i=0;i<pngs.length;i++){\r\n");
		pw.printf("	\tpngs[i]=new PNG_STRUCT();\r\n\t}\r\n\r\n");
		// int nPngBegin=0;
		// if(screen[i].pngLen>0){
		// nPngBegin=s.pnStructList-pngStruct0;
		// }
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			pw.printf("\tpngs[%d].setValues(%s,", j,
					getStringJava(png.aliasName));
			pw.printf("%s,", getStringJavaFileName(png.name));
			pw.printf("%d,", png.xLoc);
			pw.printf("%d,", png.yLoc);
			pw.printf("%d,", png.showCondition);
			pw.printf("%d,", png.showCustomer);
			pw.printf("%d", 0);
			pw.printf(");\r\n");
			pw.flush();
		}
		pw.printf("	setPngs(pngs);}\r\n");

		pw.printf("private void initTxt(){\r\n");
		pw.printf("TXT_STRUCT	texts[]=new TXT_STRUCT[%d];\r\n",
				s0.txtStruct.size());
		pw.printf("	for(int i=0;i<texts.length;i++){\r\n");
		pw.printf("	\ttexts[i]=new TXT_STRUCT();\r\n\t}\r\n\r\n");

		for (int j = 0; j < s0.txtStruct.size(); j++) {
			// int loc=txtBegin+j;
			TXT_STRUCT txt = s0.txtStruct.get(j);
			pw.printf("\ttexts[%d].setValues(%s,", j, getStringJava(txt.name));
			pw.printf("%d,", txt.xLoc);
			pw.printf("%d,", txt.yLoc);
			pw.printf("%d,", txt.width);
			pw.printf("%d,", txt.height);
			pw.printf("0x%08x,", txt.rgb);
			pw.printf("%d,", txt.fontSize);
			pw.printf("%d,", txt.showCondition);
			pw.printf("%d,", txt.dY);
			pw.printf("%d);", txt.dHgith);
			pw.printf("\r\n");
		}
		pw.printf("	setTexts(texts);}\r\n");

		pw.printf("	public void init(){\r\n		initPng();\r\n		initTxt();\r\n");
		if (s0.isDlg()) {
			pw.printf("		initDlg();\r\n");
		}
		/*
		 * for(int i=0;i<screenLen;i++){
		 * pw.printf("\tscreen[%d]=new Screen();\r\n",i);
		 * //pw.printf("screen[%d].txtLen=%d;\r\n",i,screen[i].txtLen);
		 * //pw.printf("screen[%d].pngLen=%d;\r\n",i,screen[i].pngLen);
		 * pw.printf("\tscreen[%d].beInited=%d;\r\n",i,0);
		 * pw.printf("\tscreen[%d].pnStructList=new PNG_STRUCT[%d];\r\n"
		 * ,i,screen[i].pngLen); int
		 * nPngBegin=screen[i].pnStructList-pngStruct0;
		 * pw.printf("\tfor(int i=0;i<%d;i++){\r\n",screen[i].pngLen);
		 * pw.printf(
		 * "\t\tscreen[%d].pnStructList[i]=pngStruct0[%d+i];\r\n",i,nPngBegin);
		 * pw.printf("\t};\r\n");
		 * 
		 * //pw.printf("screen[%d].pnStructList=pngStruct0+%d;\r\n",i,nPngBegin);
		 * if(screen[i].txtLen!=0){ int txtBegin=screen[i].txtStruct-txtStruct;
		 * pw
		 * .printf("\tscreen[%d].txtStruct=new TXT_STRUCT[%d];\r\n",i,screen[i]
		 * .txtLen); pw.printf("\tfor(int i=0;i<%d;i++){\r\n",screen[i].txtLen);
		 * pw
		 * .printf("\t\tscreen[%d].txtStruct[i]=txtStruct[%d+i];\r\n",i,txtBegin
		 * ); pw.printf("\t};\r\n"); } pw.printf("\r\n"); }
		 */
		pw.printf("}\r\n");
		pw.printf("}\r\n");
		pw.close();
	}

	private void makeDir(String fileName) {
		// TODO Auto-generated method stub
		int n = fileName.lastIndexOf("\\");
		String dir = fileName.substring(0, n);
		File f = new File(dir);
		if (f.exists()) {
			return;
		}
		f.mkdirs();
	}

	private void setFileWritbale(String fileName) {
		// TODO Auto-generated method stub
		File f = new File(fileName);
		if (f.exists()) {
			f.setWritable(true);
		}
	}

	Hashtable<String, ScreenGraphic> htProejctDeleted = new Hashtable<String, ScreenGraphic>();

	String getBlank(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			str += "\t";
		}
		return str;
	}

	// public final static int
	// myBackId=com.dc.bt.R.id.back_ground_bt_add_confirm;
	//
	void writeBackXml_old(ScreenGraphic s, ScreenGraphic parent,
			Vector<PNG_STRUCT> plList, Vector<String> plName) {
		String path = parent.projectPath + "\\res\\layout\\"
				+ s.screenId.toLowerCase() + "_background.xml";
		PrintWriter pw;
		int xOff = 0;
		int yOff = 0;

		try {
			File f = new File(path);
			if (f.exists()) {
				f.setWritable(true);
			}
			// PictureUtil.graphicsGeneration("d:/temp.jpg", plList);
			int sizeWidth = ScreenGraphic.sizeWidth;
			int sizeHeight = ScreenGraphic.sizeHeight;
			pw = new PrintWriter(path);
			pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");

			pw.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			pw.println(getBlank(1)
					+ "xmlns:tools=\"http://schemas.android.com/tools\"");
			pw.println(getBlank(1) + "android:layout_width=\"" + sizeWidth
					+ "px\"");
			pw.println(getBlank(1) + "android:layout_height=\"" + sizeHeight
					+ "px\"");
			pw.println(getBlank(1) + "android:id=\"@+id/back_ground_"
					+ s.screenId.toLowerCase() + "\"");
			// pw.println(getBlank(1) + "android:visibility=\"invisible\"");
			if (s.isDlg()) {
				pw.println(getBlank(1) + "android:background=\"#00ffffff\">");
			} else {
				if (s.background != null) {
					pw.println(getBlank(1) + "android:background="
							+ s.background + ">");
				} else {
					pw.println(getBlank(1) + "android:background=\"#000000\">");
				}
			}

			for (int i = 0; i < plList.size(); i++) {
				if (i == 0 && s.isDlg()) {
					xOff = plList.get(i).xLoc;
					if (s.Fullscreen) {
						yOff = plList.get(i).yLoc;
					} else {
						yOff = plList.get(i).yLoc - 55;
					}
				}
				String name = plName.get(i);
				int loc = name.lastIndexOf(".");
				name = name.substring(0, loc);
				pw.println(getBlank(1) + "<ImageView");
				pw.println(getBlank(2) + "android:id=\"@+id/"
						+ s.screenId.toLowerCase() + "_" + name + "\"");
				pw.println(getBlank(2)
						+ "android:layout_width=\"wrap_content\"");
				pw.println(getBlank(2)
						+ "android:layout_height=\"wrap_content\"");
				pw.println(getBlank(2) + "android:layout_weight=\"1\"");
				pw.println(getBlank(2) + "android:layout_marginTop=\""
						+ ((s.Fullscreen ? 0 : 0) + plList.get(i).yLoc)
						+ "px\"");
				pw.println(getBlank(2) + " android:layout_marginLeft=\""
						+ (plList.get(i).xLoc) + "px\"");
				pw.println(getBlank(2) + "android:visibility=\"visible\"");
				pw.println(getBlank(2)
						+ "android:contentDescription=\"@string/app_name\"");

				pw.println(getBlank(2) + "android:src=\"@drawable/" + name
						+ "\" />");
				pw.println();
			}
			if (s.isDlg()) {
				pw.println("\t <zhw.screen.dlg.DlgMainView");
				pw.println("\t\tandroid:id=\"@+id/DlgMain_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\tandroid:layout_width=\"wrap_content\"");
				pw.println("\t\tandroid:layout_height=\"wrap_content\" >");
				pw.println("\t\t</zhw.screen.dlg.DlgMainView>");

				pw.println("\t <zhw.png.ActivePngView");
				pw.println("\t\t android:id=\"@+id/ActivePngView_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\t android:layout_width=\"wrap_content\"");
				pw.println("\t\t android:layout_height=\"wrap_content\" />");
			}
			for (int i = 0; i < s.txtStruct.size(); i++) {
				TXT_STRUCT txt = s.txtStruct.get(i);
				if (txt.name != null) {
					String name = txt.name.toLowerCase();
					if (name.endsWith(".xml")) {
						pw.println(" <include layout=\"@layout/"
								+ name.substring(0, name.lastIndexOf(".xml"))
								+ "\" /> ");
					}
				}
			}
			// pw.println(" <include layout=\"@layout/" +
			// s.screenId.toLowerCase()
			// + "_extend.xml\" />");
			// String pathExtends = parent.projectPath + "\\res\\layout\\"
			// + s.screenId.toLowerCase() + "_extend.xml";
			// if (!new File(pathExtends).exists() ) {
			// try {
			//
			// FileOutputStream fos = new FileOutputStream(pathExtends);
			// PrintWriter pwExtern = new PrintWriter(fos);
			// pwExtern.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			// pwExtern.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			// pwExtern.println(getBlank(1)
			// + "xmlns:tools=\"http://schemas.android.com/tools\"");
			// pwExtern.println("android:background=\"#00ffffff\">");
			// pwExtern.println("<!-- add view at here -->");
			// pwExtern.println("</FrameLayout>");
			// pwExtern.close();
			// fos.close();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			pw.println("</FrameLayout>");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void writeBackXml(ScreenGraphic s, ScreenGraphic parent,
			Vector<PNG_STRUCT> plList, Vector<String> plName, String projectPath) {
		String path = parent.projectPath + "\\res\\layout\\"
				+ s.screenId.toLowerCase() + "_background.xml";
		PrintWriter pw;
		int xOff = 0;
		int yOff = 0;

		try {
			File f = new File(path);
			if (f.exists()) {
				f.setWritable(true);
			}
			String tempFilePath = projectPath + "\\assets_res\\drawable\\";
			(new File(tempFilePath)).mkdirs();

			String jpgName = "auto_image_back_ground_"
					+ s.screenId.toLowerCase();
			String jpgPath = projectPath + "\\res\\drawable\\" + jpgName;
			String tempFileName = tempFilePath + jpgName + ".png";
			htUseFullBackFil.put(jpgName + ".png", "");
			PictureUtil.graphicsGeneration(jpgPath, plList);
			int sizeWidth = ScreenGraphic.sizeWidth;
			int sizeHeight = ScreenGraphic.sizeHeight;
			pw = new PrintWriter(path);
			pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");

			pw.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			pw.println(getBlank(1)
					+ "xmlns:tools=\"http://schemas.android.com/tools\"");
			pw.println(getBlank(1) + "android:layout_width=\"" + sizeWidth
					+ "px\"");
			pw.println(getBlank(1) + "android:layout_height=\"" + sizeHeight
					+ "px\"");
			pw.println(getBlank(1) + "android:id=\"@+id/back_ground_"
					+ s.screenId.toLowerCase() + "\"");
			// pw.println(getBlank(1) + "android:visibility=\"invisible\"");
			if (s.isDlg()) {
				pw.println(getBlank(1) + "android:background=\"#00ffffff\">");
			} else {
				if (s.background != null) {
					pw.println(getBlank(1) + "android:background="
							+ s.background + ">");
				} else {
					pw.println(getBlank(1) + "android:background=\"#000000\">");
				}
			}

			pw.println("\t<ImageView");
			pw.println("\tandroid:layout_width=\"wrap_content\"");
			pw.println("\tandroid:layout_height=\"wrap_content\"");
			pw.println("\tandroid:layout_weight=\"1\"");
			pw.println("\tandroid:layout_marginTop=\"0px\"");
			pw.println("\tandroid:layout_marginLeft=\"0px\"");
			pw.println("\tandroid:src=\"@drawable/" + jpgName + "\" />");

			if (s.isDlg()) {
				pw.println("\t <zhw.screen.dlg.DlgMainView");
				pw.println("\t\tandroid:id=\"@+id/DlgMain_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\tandroid:layout_width=\"wrap_content\"");
				pw.println("\t\tandroid:layout_height=\"wrap_content\" >");
				pw.println("\t\t</zhw.screen.dlg.DlgMainView>");

				pw.println("\t <zhw.png.ActivePngView");
				pw.println("\t\t android:id=\"@+id/ActivePngView_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\t android:layout_width=\"wrap_content\"");
				pw.println("\t\t android:layout_height=\"wrap_content\" />");
			}
			for (int i = 0; i < s.txtStruct.size(); i++) {
				TXT_STRUCT txt = s.txtStruct.get(i);
				if (txt.name != null) {
					String name = txt.name.toLowerCase();
					if (name.endsWith(".xml")) {
						pw.println(" <include layout=\"@layout/"
								+ name.substring(0, name.lastIndexOf(".xml"))
								+ "\" /> ");
					}
				}
			}
			// pw.println(" <include layout=\"@layout/" +
			// s.screenId.toLowerCase()
			// + "_extend.xml\" />");
			// String pathExtends = parent.projectPath + "\\res\\layout\\"
			// + s.screenId.toLowerCase() + "_extend.xml";
			// if (!new File(pathExtends).exists() ) {
			// try {
			//
			// FileOutputStream fos = new FileOutputStream(pathExtends);
			// PrintWriter pwExtern = new PrintWriter(fos);
			// pwExtern.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			// pwExtern.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			// pwExtern.println(getBlank(1)
			// + "xmlns:tools=\"http://schemas.android.com/tools\"");
			// pwExtern.println("android:background=\"#00ffffff\">");
			// pwExtern.println("<!-- add view at here -->");
			// pwExtern.println("</FrameLayout>");
			// pwExtern.close();
			// fos.close();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			pw.println("</FrameLayout>");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void writeBackXmlwww(ScreenGraphic s, ScreenGraphic parent,
			Vector<PNG_STRUCT> plList, Vector<String> plName, String projectPath) {
		String path = parent.projectPath + "\\res\\layout\\"
				+ s.screenId.toLowerCase() + "_background.xml";
		PrintWriter pw;
		int xOff = 0;
		int yOff = 0;

		try {
			File f = new File(path);
			if (f.exists()) {
				f.setWritable(true);
			}
			String jpgName = "auto_image_back_ground_"
					+ s.screenId.toLowerCase();
			String backDir = projectPath + "\\assets\\background\\";
			new File(backDir).mkdirs();
			String jpgPathWeb = projectPath + "\\assets\\background\\"
					+ jpgName;
			// PictureUtil.graphicsGenerationWeb(jpgPathWeb, plList);
			int sizeWidth = ScreenGraphic.sizeWidth;
			int sizeHeight = ScreenGraphic.sizeHeight;
			pw = new PrintWriter(path);
			pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");

			pw.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			pw.println(getBlank(1)
					+ "xmlns:tools=\"http://schemas.android.com/tools\"");
			pw.println(getBlank(1) + "android:layout_width=\"" + sizeWidth
					+ "px\"");
			pw.println(getBlank(1) + "android:layout_height=\"" + sizeHeight
					+ "px\"");
			pw.println(getBlank(1) + "android:id=\"@+id/back_ground_"
					+ s.screenId.toLowerCase() + "\"");
			// pw.println(getBlank(1) + "android:visibility=\"invisible\"");
			if (s.isDlg()) {
				pw.println(getBlank(1) + "android:background=\"#00ffffff\">");
			} else {
				if (s.background != null) {
					pw.println(getBlank(1) + "android:background="
							+ s.background + ">");
				} else {
					pw.println(getBlank(1)
							+ "android:background=\"#00000000\">");
				}
			}
			if (false) {
				pw.println("\t<ImageView");
				pw.println("\tandroid:layout_width=\"wrap_content\"");
				pw.println("\tandroid:layout_height=\"wrap_content\"");
				pw.println("\tandroid:layout_weight=\"1\"");
				pw.println("\tandroid:layout_marginTop=\"0px\"");
				pw.println("\tandroid:layout_marginLeft=\"0px\"");
				pw.println("\tandroid:src=\"@drawable/" + jpgName + "\" />");
			}
			if (s.isDlg()) {
				pw.println("\t <zhw.screen.dlg.DlgMainView");
				pw.println("\t\tandroid:id=\"@+id/DlgMain_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\tandroid:layout_width=\"wrap_content\"");
				pw.println("\t\tandroid:layout_height=\"wrap_content\" >");
				pw.println("\t\t</zhw.screen.dlg.DlgMainView>");

				pw.println("\t <zhw.png.ActivePngView");
				pw.println("\t\t android:id=\"@+id/ActivePngView_"
						+ s.screenId.toLowerCase() + "\"");
				pw.println("\t\t android:layout_width=\"wrap_content\"");
				pw.println("\t\t android:layout_height=\"wrap_content\" />");
			}
			for (int i = 0; i < s.txtStruct.size(); i++) {
				TXT_STRUCT txt = s.txtStruct.get(i);
				if (txt.name != null) {
					String name = txt.name.toLowerCase();
					if (name.endsWith(".xml")) {
						pw.println(" <include layout=\"@layout/"
								+ name.substring(0, name.lastIndexOf(".xml"))
								+ "\" /> ");
					}
				}
			}
			// pw.println(" <include layout=\"@layout/" +
			// s.screenId.toLowerCase()
			// + "_extend.xml\" />");
			// String pathExtends = parent.projectPath + "\\res\\layout\\"
			// + s.screenId.toLowerCase() + "_extend.xml";
			// if (!new File(pathExtends).exists() ) {
			// try {
			//
			// FileOutputStream fos = new FileOutputStream(pathExtends);
			// PrintWriter pwExtern = new PrintWriter(fos);
			// pwExtern.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			// pwExtern.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			// pwExtern.println(getBlank(1)
			// + "xmlns:tools=\"http://schemas.android.com/tools\"");
			// pwExtern.println("android:background=\"#00ffffff\">");
			// pwExtern.println("<!-- add view at here -->");
			// pwExtern.println("</FrameLayout>");
			// pwExtern.close();
			// fos.close();
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			pw.println("</FrameLayout>");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Hashtable<String, String> htToDeleteFileName = new Hashtable<String,
	// String>();
	Hashtable<String, String> htUseFullBackFil = new Hashtable<String, String>();

	void writePngs(ScreenGraphic s, ScreenGraphic parent) {
		boolean beOnlyCopyToAsset = false;
		if (s.projectPath != null) {
			// COPY ALL FILE TO ASSCI
			Vector<PNG_STRUCT> pl = s.pnStructList;
			Vector<PNG_STRUCT> plBack = new Vector<PNG_STRUCT>();
			Vector<String> plName = new Vector<String>();

			if (!htProejctDeleted.containsKey(s.projectPath)) {
				// deleteBackFile(htToDeleteFileName, s.projectPath
				// + "\\res\\drawable");
				htProejctDeleted.put(s.projectPath, s);
			}
			boolean outputPng = false;
			for (int j = 0; j < pl.size(); j++) {
				PNG_STRUCT png = pl.get(j);
				if (png.showCondition == 1) {
					// 背景的内容 放在资源目录下
					if (!beOnlyCopyToAsset) {
						if (s.isDlg() || outputPng) {
							String tempFileName = parent.projectPath
									+ "\\assets_res\\drawable\\";
							String name = copyPngFileAsBack("img\\"
									+ pl.get(j).getName(), tempFileName,
									parent.projectPath + "\\res\\drawable");
							plBack.add(png);
							plName.add(name);
						} else {
							plBack.add(png);
						}
					}
				} else {
					String tempFile = parent.projectPath + "\\assets_res";
					copyPngFileAsWebp("img\\" + pl.get(j).getName(), tempFile,
							parent.projectPath + "\\assets");
				}
				//
			}
			// for(allScreen.get(i).pnStructList.)
			// copyDir("img\\")
			// \assets
			if (s.isDlg() || outputPng) {
				writeBackXml_old(s, parent, plBack, plName);
			} else {
				writeBackXml(s, parent, plBack, plName, parent.projectPath);
			}
		}
	}

	private void deleteBackFile(String dir) {
		// TODO Auto-generated method stub
		File flst[] = new File(dir).listFiles();
		if (flst != null) {
			for (int i = 0; i < flst.length; i++) {
				if (flst[i].getName().startsWith("auto_img_")) {
					// htToDelete.put(flst[i].getName(), flst[i].getName());
					// flst[i].delete();
					String path = flst[i].getPath().toLowerCase();
					// shortName=shortName.substring(dir.length());
					if (htUseFullBackFil.get(path) == null) {
						flst[i].delete();
					}
				}
			}
		}
	}

	class AssetCopy {
		ScreenGraphic target;
		ScreenGraphic beInclude;
	};

	void writeSettingJava() throws FileNotFoundException {
		// htProject.clear();
		Vector<AssetCopy> vTocpy = new Vector<AssetCopy>();
		Vector<ScreenGraphic> vToWritedProject = new Vector<ScreenGraphic>();
		ScreenGraphic sPublic = null;
		// Vector<ScreenGraphic> v[] = new
		// Vector<ScreenGraphic>[allScreen.size()];
		Vector<Vector<ScreenGraphic>> vAll = new Vector<Vector<ScreenGraphic>>();
		Vector<ScreenGraphic> vDealed = new Vector<ScreenGraphic>();
		for (int i = 0; i < allScreen.size(); i++) {
			if (allScreen.get(i).screenId == "DEL")
				continue;
			Vector<ScreenGraphic> v = new Vector<ScreenGraphic>();
			ScreenGraphic s = allScreen.get(i);
			if (!s.isGen())
				continue;
			if (vDealed.indexOf(s) != -1) {
				// 已经处理了
				continue;
			}
			vDealed.add(s);
			// 查找相同工程名称的
			v.add(s);
			for (int j = i + 1; j < allScreen.size(); j++) {
				ScreenGraphic s1 = allScreen.get(j);
				if (s1.projectPath == null) {
					continue;
				}
				if (s1.projectPath.equals(s.projectPath)) {
					v.add(s1);
					vDealed.add(s1);
				}
			}
			vAll.add(v);
			if (s.getIncludePack() != null) {
				String inp = s.getIncludePack();
				int nCount = 0;
				Vector<String> vInclude = new Vector<String>();
				for (int j = 0; j < allScreen.size(); j++) {
					ScreenGraphic s1 = allScreen.get(j);
					if (inp.equals(allScreen.get(j).getPacageName())) {
						// v.add(s1);
						// v.add(new ExportAssestScreenGraphic(s1));
						AssetCopy ac = new AssetCopy();
						ac.beInclude = s1;
						ac.target = s;
						vTocpy.add(ac);
						vInclude.add(s1.getName());
						nCount++;
					}
				}
				s.vIncludeName = vInclude;
				s.nIncludeCount = nCount;
				s.haveInclude = true;
			}
		}
		// delete all project tempfile

		for (int i = 0; i < vAll.size(); i++) {
			Vector<ScreenGraphic> v = vAll.get(i);
			ScreenGraphic t = v.get(0);
			for (int j = 0; j < v.size(); j++) {
				ScreenGraphic s = v.get(j);

				if ("PUBLIC".equals(s.screenName)) {
					sPublic = s;
					// continue;// 最后写出去
				}
				try {
					if (s.genCode) {
						writeDatas(s, v.get(0));
						writeActions(s, v.get(0));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				writePngs(s, v.get(0));
				// Vector<ScreenGraphic> vPjList = htProject.get(s);
				// if (vPjList == null) {
				// vPjList = new Vector<ScreenGraphic>();
				// htProject.put(s.projectPath, vPjList);
				// }
				// vPjList.add(s);

				if (s.projectPath != null) {
					vToWritedProject.add(s);
				}
			}
			outputScreenList(v);
		}

		if (sPublic != null) {
			String nameProjectPath = sPublic.projectPath;
			for (int i = 0; i < vToWritedProject.size(); i++) {
				sPublic.projectPath = vToWritedProject.get(i).projectPath;
				// writeDatas(sPublic);
				// writePngs(sPublic);
			}
			sPublic.projectPath = nameProjectPath;
		}

		// Enumeration<String> e = this.htProject.keys();
		// while (e.hasMoreElements()) {
		// outputScreenList(e.nextElement());
		// }
		Enumeration<String> e1 = htProejctDeleted.keys();
		while (e1.hasMoreElements()) {
			String s = e1.nextElement();
			ScreenGraphic sg = htProejctDeleted.get(s);
			deleteBackFile(sg.projectPath + "\\res\\drawable");
		}
		Hashtable<String, String> htExecuted = new Hashtable<String, String>();
		for (int i = 0; i < vTocpy.size(); i++) {
			AssetCopy ac = vTocpy.get(i);
			//
			String target = ac.target.projectPath + "\\assets\\";
			String src = ac.beInclude.projectPath + "\\assets\\*.*";
			String cmd = "cmd /c xcopy " + src + " " + target + " /s /y";
			if (htExecuted.get(cmd) != null) {
				continue;
			}
			try {
				System.out.println("begin execute :" + cmd);
				htExecuted.put(cmd, "execute");
				runtime.exec(cmd);
				System.out.println("execute over:");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		for (int i = 0; i < vTocpy.size(); i++) {
			AssetCopy ac = vTocpy.get(i);
			//
			String target = ac.target.projectPath + "\\res\\layout\\";
			String src = ac.beInclude.projectPath
					+ "\\res\\layout\\*background.xml";
			String cmd = "cmd /c xcopy " + src + " " + target + " /s /y";
			if (htExecuted.get(cmd) != null) {
				continue;
			}
			try {
				System.out.println("begin execute :" + cmd);
				htExecuted.put(cmd, "execute");
				runtime.exec(cmd);
				System.out.println("execute over:");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private void outputScreenList(Vector<ScreenGraphic> v)
			throws FileNotFoundException {
		// Vector<ScreenGraphic> v = htProject.get(v2);
		if (v == null || v.size() == 0) {
			return;
		}
		ScreenGraphic s = v.get(0);
		String IScreenConstName = "IScreenConst";
		String packName = "zhw.screen.constd";
		String EventListDataName = "EventListData";

		if (s.beinclude) {
			IScreenConstName = "IScreenConstI";
			packName = "zhw.screen.constd.action_include";
			EventListDataName = "EventListDataI";
		}

		String fileName = getEventListDataFileName(s);
		int n = fileName.lastIndexOf("\\");
		String dir = fileName.substring(0, n);
		(new File(dir)).mkdirs();
		setFileWritbale(fileName);
		PrintWriter pw = new PrintWriter(fileName);
		pw.printf("package " + packName + ";\r\n");
		pw.printf("import zhw.screen.action.EventList;\r\n");
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic s1 = v.get(i);
			if (!s1.genCode)
				continue;
			if (s.beinclude) {
				pw.printf("import zhw.screen.action.user.actions_include."
						+ s1.getName() + "_Event_funcs;\r\n");
			} else {
				pw.printf("import zhw.screen.action.user.actions."
						+ s1.getName() + "_Event_funcs;\r\n");
			}
		}

		pw.printf("\r\npublic class " + EventListDataName);
		if (s.haveInclude) {
			pw.printf(" extends zhw.screen.constd.action_include.EventListDataI");
		}
		pw.printf(" implements " + packName + "." + IScreenConstName + " {\r\n");
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic ss = v.elementAt(i);
			if (!ss.genCode)
				continue;
			String name = ss.getName();
			pw.printf("\tpublic static " + name + "_Event_funcs " + name
					+ "_inst = new " + name + "_Event_funcs();\r\n");
		}
		pw.printf("\r\n\tpublic static void init() {\r\n");
		if (s.haveInclude) {
			pw.printf("  zhw.screen.constd.action_include.EventListDataI.init();\r\n");
		}
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic ss = v.elementAt(i);
			if (!ss.genCode)
				continue;
			String name = ss.getName();
			pw.printf("\t\tEventList.addScren(" + IScreenConstName + ".SCRN_"
					+ name + "," + name + "_inst);\r\n");
		}
		pw.printf("\t}\r\n}");

		pw.close();
		fileName = getScreenConstFileName(s);
		n = fileName.lastIndexOf("\\");
		dir = fileName.substring(0, n);
		(new File(dir)).mkdirs();

		setFileWritbale(fileName);
		PrintWriter pw1 = new PrintWriter(fileName);

		pw1.printf("package " + packName + ";\r\n");
		if (s.haveInclude) {
			pw1.printf("import zhw.screen.constd.action_include.IScreenConstI;\r\n");
		}
		pw1.printf("\r\npublic interface " + IScreenConstName);
		if (s.haveInclude) {
			pw1.printf(" extends IScreenConstI ");
		}
		pw1.printf(" {\r\n");
		pw1.printf("\tfinal static int xOrg = 0;\r\n");
		pw1.printf("\tfinal static int yOrg = 0;// just for test\r\n");
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic ss = v.elementAt(i);
			if (!ss.genCode)
				continue;
			String name = ss.getName();
			pw1.printf("\tfinal static String SCRN_" + name + " = \"" + name
					+ "\";\r\n");
		}

		// int nl = projectPath.lastIndexOf("\\");
		// String projShowName = projectPath.substring(nl + 1);
		// projShowName = projShowName.toLowerCase();
		if (!s.beinclude) {
			pw1.printf("\t final static int backList[]={\r\n");
			for (int i = 0; i < v.size(); i++) {
				ScreenGraphic ss = v.elementAt(i);
				if (!ss.genCode)
					continue;
				String name = ss.getName();
				pw1.printf("\t\t" + s.getPacageName() + ".R.id.back_ground_"
						+ name.toLowerCase() + ",\r\n");
			}
			if (s.haveInclude) {
				//
				for (int i = 0; i < s.nIncludeCount; i++) {
					// pw1.printf("\t\tIScreenConstI.backList[" + i + "],\r\n");
					// pw1.printf("\t\tIScreenConstI.backList[" + i + "],\r\n");
					pw1.printf("\t\t" + s.getPacageName()
							+ ".R.id.back_ground_"
							+ s.vIncludeName.get(i).toLowerCase() + ",\r\n");
				}
			}
			pw1.printf("\r\n\t};\r\n");
			pw1.printf("\t final static int backListBackXml[]={\r\n");
			for (int i = 0; i < v.size(); i++) {
				ScreenGraphic ss = v.elementAt(i);
				if (!ss.genCode)
					continue;
				String name = ss.getName();
				pw1.printf("\t\t" + s.getPacageName() + ".R.layout."
						+ name.toLowerCase() + "_background,\r\n");
			}
			if (s.haveInclude) {
				//
				for (int i = 0; i < s.nIncludeCount; i++) {
					pw1.printf("\t\t" + s.getPacageName() + ".R.layout."
							+ s.vIncludeName.get(i).toLowerCase()
							+ "_background,\r\n");
				}
			}
		}
		pw1.printf("\r\n\t};\r\n");
		if (!s.beinclude) {
			for (int i = 0; i < v.size(); i++) {
				ScreenGraphic ss = v.elementAt(i);
				if (!ss.genCode)
					continue;
				String name = ss.getName();
				pw1.printf("\t\tpublic final static int back_id_"
						+ ss.screenId.toLowerCase() + "=" + s.getPacageName()
						+ ".R.id.back_ground_" + name.toLowerCase() + ";\r\n");
			}
			if (s.haveInclude) {
				for (int i = 0; i < s.nIncludeCount; i++) {
					String name = s.vIncludeName.get(i).toLowerCase();
					pw1.printf("\t\tpublic final static int back_id_"
							+ name.toLowerCase() + "=" + s.getPacageName()
							+ ".R.id.back_ground_" + name.toLowerCase()
							+ ";\r\n");
				}
			}

			pw1.printf("}\r\n");
		}
		pw1.flush();
		pw1.close();

	}

	private String getScreenConstFileName(ScreenGraphic s) {
		// TODO Auto-generated method stub
		if (s.beinclude) {
			String fName = s.projectPath
					+ "\\src\\zhw\\screen\\constd\\action_include\\IScreenConstI.java";
			makeDir(fName);
			return fName;
		} else {
			return s.projectPath
					+ "\\src\\zhw\\screen\\constd\\IScreenConst.java";
		}
	}

	private String getEventListDataFileName(ScreenGraphic s) {
		// TODO Auto-generated method stub
		if (s.beinclude) {
			String fName = s.projectPath
					+ "\\src\\zhw\\screen\\constd\\action_include\\EventListDataI.java";
			makeDir(fName);
			return fName;
		} else {
			return s.projectPath
					+ "\\src\\zhw\\screen\\constd\\EventListData.java";
		}
	}

	private ScreenGraphic findFirstScreen(String projectPath) {
		// TODO Auto-generated method stub
		for (int i = 0; i < allScreen.size(); i++) {
			String pj = allScreen.get(i).projectPath;
			if (pj == null) {
				continue;
			}
			if (allScreen.get(i).projectPath.equals(projectPath)) {
				return allScreen.get(i);
			}
		}
		System.out.println("can't find :" + projectPath);
		return null;
	}

	// Hashtable<String, Vector<ScreenGraphic>> htProject = new
	// Hashtable<String, Vector<ScreenGraphic>>();

	/*
	 * <include layout="@layout/bt_book_background" />
	 * 
	 * <include layout="@layout/bt_dial_background" />
	 * 
	 * <include layout="@layout/bt_music_background" />
	 * 
	 * <include layout="@layout/bt_option_background" />
	 * 
	 * <include layout="@layout/bt_record_background" />
	 * 
	 * <include layout="@layout/bt_set_background" />
	 * 
	 * <include layout="@layout/bt_src_background" />
	 * 
	 * <include layout="@layout/bt_pair_background" />
	 */
	private void writeActions(ScreenGraphic s0, ScreenGraphic screenParent)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName;
		String oldFileName;
		String file_funcs;
		String projectPath = screenParent.projectPath;
		if (projectPath == null) {
			return;
		}
		if (projectPath != null) {

			oldFileName = projectPath + "\\src\\zhw\\screen\\action\\user\\"
					+ s0.screenId + "_Event.java";
			fileName = projectPath + "\\src\\zhw\\screen\\action\\user\\"
					+ s0.screenId + "_EventV1.java";
			if (s0.beinclude) {
				file_funcs = projectPath
						+ "\\src\\zhw\\screen\\action\\user\\actions_include\\"
						+ s0.screenId + "_Event_funcs.java";
				fileName = projectPath
						+ "\\src\\zhw\\screen\\action\\user\\actions_include\\b\\"
						+ s0.screenId + "_EventV1.java";
			} else {
				file_funcs = projectPath
						+ "\\src\\zhw\\screen\\action\\user\\actions\\"
						+ s0.screenId + "_Event_funcs.java";
			}
		} else {
			return;
		}
		if (new File(oldFileName).exists()) {
			return;
		}
		// sprintf(fileName,"F:\ZHW-WINCE-C-for-3360\UI\A6\Setting\\%s-setting.cpp",uiBaseRoot);
		int n = fileName.lastIndexOf("\\");
		String dir = fileName.substring(0, n);
		(new File(dir)).mkdirs();

		// FILE *fpWrite=fopen(fileName,"wb");
		// scan the screen and PNG FILE AND TXTS
		n = file_funcs.lastIndexOf("\\");
		dir = file_funcs.substring(0, n);
		(new File(dir)).mkdirs();
		setFileWritbale(fileName);
		PrintWriter pw = new PrintWriter(fileName);
		if (s0.beinclude) {
			pw.printf("package zhw.screen.action.user.actions_include.b;\r\n");
		} else {
			pw.printf("package zhw.screen.action.user;\r\n");
		}
		pw.printf("import zhw.screen.action.BaseStateEventItem;\r\n");
		pw.printf("import zhw.screen.action.MSG_ZHW;\r\n");
		if (s0.beinclude) {
			pw.printf("import zhw.screen.user.action_include.Screen_"
					+ s0.screenId + ";\r\n");
		} else {
			pw.printf("import zhw.screen.user.Screen_" + s0.screenId + ";\r\n");
		}
		pw.printf("public abstract class " + s0.screenId
				+ "_EventV1 extends BaseStateEventItem \r\n");
		if (s0.beinclude) {
			pw.printf(" implements	zhw.screen.constd.action_include.IScreenConstI{\r\n");
		} else {
			pw.printf(" implements	zhw.screen.constd.IScreenConst{\r\n");
		}
		pw.printf("\tpublic abstract void _F_INIT_FUN(MSG_ZHW msg);\r\n");
		pw.printf("\tpublic abstract void _F_UPDATE_TIMMER(MSG_ZHW msg);\r\n");
		Hashtable<String, String> funcs = new Hashtable<String, String>();
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String f = png.getFunctionName();
				if (funcs.containsKey(f)) {
					continue;
				}
				pw.printf("\tpublic abstract void " + png.getFunctionName()
						+ "(MSG_ZHW msg" + png.getFunctionParamters()
						+ ");\r\n");
				if (png.isLongPressed()) {
					pw.printf("\tpublic abstract void " + png.getFunctionName()
							+ "_Pressing" + "(MSG_ZHW msg"
							+ png.getFunctionParamters() + ");\r\n");
				}
				funcs.put(f, f);
			}
		}
		pw.println();
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				int id = 20000 + j * 20;
				String functionId = s0.screenId + "_" + png.aliasName;
				pw.printf("\tfinal static int " + functionId + "			 = "
						+ String.format("%8d", id) + ";\r\n");
				pw.printf("\tfinal static int " + functionId + "_RELEASE  = "
						+ String.format("%8d", id + 1) + ";\r\n");
				pw.printf("\tfinal static int " + functionId + "_PRESSING = "
						+ String.format("%8d", id + 2) + ";\r\n");
				pw.printf("\tfinal static int " + functionId + "_PRESSED  = "
						+ String.format("%8d", id + 3) + ";\r\n");
			}
		}
		pw.println();
		pw.printf("\tpublic " + s0.screenId + "_EventV1(){\r\n");
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String functionId = s0.screenId + "_" + png.aliasName;
				pw.printf("\t\tactionMap.putInt(\"" + png.aliasName + "\","
						+ functionId + ");\r\n");
			}
		}

		pw.printf("\t\tsetBindScreen(new Screen_" + s0.screenId + "(),SCRN_"
				+ s0.screenId + ");\r\n\t}\r\n");
		pw.printf("\tpublic String getScreenName(){\r\n");
		pw.printf("\t\treturn  \"" + s0.screenId + "\";\r\n\t}\r\n");

		pw.printf("\tpublic void dispatch(MSG_ZHW msg){\r\n");

		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String functionId = s0.screenId + "_" + png.aliasName;
				pw.printf("\t\tif(msg.wParam==" + functionId + "_RELEASE){\r\n");
				pw.printf("\t\t\t" + png.getFunctionName() + "(msg"
						+ png.getFunctionValue() + ");\r\n");
				pw.printf("\t\t\tmsg.setComsumered();\r\n");
				pw.printf("\t\t}\r\n");
				if (png.isLongPressed()) {
					pw.printf("\t\tif(msg.wParam==" + functionId
							+ "_PRESSING){\r\n");
					pw.printf("\t\t\t" + png.getFunctionName() + "_Pressing"
							+ "(msg" + png.getFunctionValue() + ");\r\n");
					pw.printf("\t\t\tmsg.setComsumered();\r\n");
					pw.printf("\t\t}\r\n");
				}
			}
		}
		pw.printf("\t\tif(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){\r\n");
		pw.printf("\t\t\t_F_INIT_FUN(msg);\r\n");
		pw.printf("\t\t\tmsg.setComsumered();\r\n");
		pw.printf("\t\t}\r\n");
		pw.printf("\t\tif(msg.wParam==MSG_ZHW._TIMMER_10PS){\r\n");
		pw.printf("\t\t\t_F_UPDATE_TIMMER(msg);\r\n");
		pw.printf("\t\t\tmsg.setComsumered();\r\n");
		pw.printf("\t\t}\r\n");

		pw.printf("\t}\r\n");
		pw.printf("}\r\n");
		pw.close();
		if (new File(file_funcs).exists()) {
			return;
		}
		pw = new PrintWriter(file_funcs);
		funcs.clear();
		if (s0.beinclude) {
			pw.printf("package zhw.screen.action.user.actions_include;\r\n");
		} else {
			pw.printf("package zhw.screen.action.user.actions;\r\n");
		}
		pw.printf("import zhw.screen.action.MSG_ZHW;\r\n");
		if (s0.beinclude) {
			pw.printf("import zhw.screen.action.user.actions_include.b."
					+ s0.screenId + "_EventV1;\r\n");
			pw.printf("import zhw.screen.constd.action_include.EventListDataI;\r\n");
		} else {
			pw.printf("import zhw.screen.action.user." + s0.screenId
					+ "_EventV1;\r\n");
			pw.printf("import zhw.screen.constd.IScreenConst;\r\n");
		}

		pw.printf("import zhw.screen.action.BackUtil;\r\n");

		pw.printf("public class " + s0.screenId + "_Event_funcs extends "
				+ s0.screenId + "_EventV1 {\r\n");
		if (s0.isDlg()) {
			pw.printf("\t final static int dlgBackId=" + s0.getPacageName()
					+ ".R.layout." + s0.screenId.toLowerCase()
					+ "_background;\r\n");
			pw.printf("\t final static int dlgMainView=" + s0.getPacageName()
					+ ".R.id.DlgMain_" + s0.screenId.toLowerCase() + ";\r\n");

			pw.printf("\t final static int dlgActiveView=" + s0.getPacageName()
					+ ".R.id.ActivePngView_" + s0.screenId.toLowerCase()
					+ ";\r\n");

		} else {

			String myBackId = "\t public final static int myBackId_"
					+ s0.screenId.toLowerCase() + "="
					+ screenParent.getPacageName() + ".R.id.back_ground_"
					+ s0.screenId.toLowerCase() + ";";

			// pw.printf("\t final static int myBackId="
			// + screenParent.getPacageName() + ".R.id.back_ground_"
			// + s0.screenId.toLowerCase() + ";\r\n");
		}
		pw.printf("\t@Override\r\n");
		pw.printf("\tpublic void _F_INIT_FUN(MSG_ZHW msg) {\r\n");
		pw.printf("\t\t// TODO Auto-generated method stub\r\n");
		if (s0.isDlg()) {
			// 不用管
			// pw.printf("\t\tsetBackId(myBackId);\r\n");
		} else {
			String myBackId = "IScreenConst.back_id_"
					+ s0.screenId.toLowerCase();
			pw.printf(
					"\t\tBackUtil.showBackGround(this.getMainActivity(), IScreenConst.backList,%s);\r\n",
					myBackId);
		}
		pw.printf("\t}\r\n");
		pw.printf("\r\n");
		pw.printf("\t@Override\r\n");
		pw.printf("\tpublic void _F_UPDATE_TIMMER(MSG_ZHW msg) {\r\n");
		pw.printf("\t\t// TODO Auto-generated method stub\r\n");

		pw.printf("\t}\r\n");

		if (s0.isDlg()) {
			pw.printf("\tpublic int getBackId(){\r\n");
			pw.printf("\t\treturn dlgBackId;\r\n");
			pw.printf("\t}\r\n");
			pw.printf("\tpublic int getDlgMainViewId(){\r\n");
			pw.printf("\t\treturn dlgMainView;\r\n");
			pw.printf("\t}\r\n");

			pw.printf("\tpublic boolean isDlg(){\r\n");
			pw.printf("\t\treturn true;\r\n");
			pw.printf("\t}\r\n");

			pw.println("\tpublic int getActiveViewId() {");
			pw.println("\t	return dlgActiveView;");
			pw.println("\t}");

		}

		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String f = png.getFunctionName();
				if (funcs.containsKey(f)) {
					continue;
				}
				pw.printf("	public  void " + png.getFunctionName()
						+ "(MSG_ZHW msg" + png.getFunctionParamters()
						+ "){\r\n	};\r\n");
				funcs.put(f, f);
			}
		}

		pw.printf("\r\n");
		pw.printf("}\r\n");
		pw.close();
	}

	public static void copyPngFileAsWebp(String src, String tempTarget,
			String target) {
		// TODO Auto-generated method stub
		String file1 = target + "\\" + getStringJavaFileName0(src);
		int n = file1.lastIndexOf("\\");
		String dir = file1.substring(0, n);
		(new File(dir)).mkdirs();

		String tempFileName = tempTarget + "\\" + getStringJavaFileName0(src);
		n = tempFileName.lastIndexOf("\\");
		String tempDir = tempFileName.substring(0, n);
		(new File(tempDir)).mkdirs();
		try {
			file1 = file1.toLowerCase();
			file1 = file1.replace(".png", ".webp");
			copyFile(new File(src), new File(tempFileName), new File(file1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// String s2 = src + "_files";
		// File f = new File(s2);
		// if (f.exists()) {
		// String dir2 = target + "\\" + getStringJavaFileName0(s2);
		// (new File(dir2)).mkdirs();
		// try {
		// copyFile(new File(s2 + "\\Part.ini"), new File(dir2
		// + "\\Part.ini"));
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// // file2+="\\prop.ini";
		//
		// }
	}

	private String copyPngFileAsBack(String src, String tempFileName,
			String target) {
		// TODO Auto-generated method stub
		String targetBackName = getStringJavaFileName0(src);
		targetBackName = targetBackName.replace('\\', '_').toLowerCase();
		targetBackName = "auto_" + targetBackName.replaceAll("__", "_");
		String file1 = target + "\\" + targetBackName;
		String tempFile = tempFileName + "" + targetBackName;
		int n = file1.lastIndexOf("\\");
		String dir = file1.substring(0, n);
		(new File(dir)).mkdirs();
		try {
			// 判断文件 大小 和最后修改时间
			file1 = file1.toLowerCase();
			file1 = file1.replace(".png", ".webp");
			htUseFullBackFil.put(file1.toLowerCase(), "");// 有用的图片
			copyFile(new File(src), new File(tempFile), new File(file1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return targetBackName;
		/*
		 * String s2 = src + "_files"; File f = new File(s2); if (f.exists()) {
		 * String dir2 = target + "\\" + getStringJavaFileName0(s2); (new
		 * File(dir2)).mkdirs(); try { copyFile(new File(s2 + "\\Part.ini"), new
		 * File(dir2 + "\\Part.ini")); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } //
		 * file2+="\\prop.ini"; }
		 */
	}

	public void saveSetting(boolean beCreateAsC) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {
			saveCurrent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// changedInfor = 1;
		// char propFileName[100];
		Vector<String> vPrj = new Vector<String>();
		for (int i = 0; i < allScreen.size(); i++) {
			String prj = allScreen.get(i).getPrjectShortName();
			if (!vPrj.contains(prj)) {
				vPrj.add(prj);
			}
			// v.add(allScreen[i])
		}
		for (int j = 0; j < vPrj.size(); j++) {
			String prj = vPrj.get(j);

			PrintWriter pw = new PrintWriter(getPrjectFileName() + "\\" + prj
					+ ".ini");

			// FILE *fp=fopen(getPropIni(propFileName),"wb");

			if (ScreenGraphic.sizeWidth == 1024) {
				pw.printf("[BACK_GROUND SIZE=1024X600]\r\n");
				// pw.printf(" SIZE=1024X600", s.projectPath);
			} else {
				pw.printf("[BACK_GROUND SIZE=800X480]\r\n");
				// pw.printf(" SIZE=800X480", s.projectPath);
			}

			for (int i = 0; i < allScreen.size(); i++) {
				ScreenGraphic s = allScreen.get(i);
				if (!prj.equals(s.getPrjectShortName())) {
					continue;
				}
				pw.printf("[SCREEN ");
				if (s.screenId != null) {
					pw.printf("ID=%s ", s.screenId);
				} else {
					pw.printf("ID=%s ", s.getName());
				}
				if (s.screenName != null) {
					pw.printf("NAME=%s", s.screenName);
				} else {
					pw.printf("NAME=%s", s.getName());
				}
				if (s.projectPath != null) {
					pw.printf(" PROJECT=%s", s.projectPath);
				}

				if (s.dlgBack != null && s.dlgBack.length() > 0) {
					pw.printf(" DlgBack=%s", s.dlgBack);
				}
				if (s.genCode == false) {
					pw.printf(" GEN_CODE=FALSE");
				}
				if (s.background != null) {
					pw.printf(" background=%s", s.background);
				}
				// if (s.packageName != null) {
				pw.printf(" packageName=%s", s.getPacageName());

				if (s.getIncludePack() != null) {
					pw.printf(" INCLUDE=%s", s.getIncludePack());
				}
				if (!s.isGen()) {
					pw.printf(" GEN=false");
				}
				if (s.beinclude) {
					pw.printf(" beinclude=true");
				}
				// }
				if (s.Fullscreen) {
					pw.printf(" Fullscreen=TRUE");
				}
				pw.printf("]\r\n");

				pw.printf("[PNG]\r\n");
				for (int k = 0; k < s.pnStructList.size(); k++) {
					PNG_STRUCT png = s.pnStructList.get(k);
					if (png.aliasName == null)
						pw.printf("%40s\t%5d\t%5d\t%5d\t%5d\r\n", png.name,
								png.xLoc, png.yLoc, png.showCondition, 0);
					else {
						pw.printf("%40s[%s]\t%5d\t%5d\t%5d\t%5d\r\n", png.name,
								png.getActionString(), png.xLoc, png.yLoc,
								png.showCondition, 0);
					}

				}
				pw.printf("[TXT]\r\n");
				for (int k = 0; k < s.txtStruct.size(); k++) {
					TXT_STRUCT txt = s.txtStruct.get(k);
					pw.printf(
							"%40s\t%5d\t%5d\t%5d\t%5d\t0X%08X\t%5d\t%5d\t%5d\t%5d\r\n",
							txt.name, txt.xLoc, txt.yLoc, txt.width,
							txt.height, txt.rgb, txt.fontSize,
							txt.showCondition, txt.dY, txt.dHgith);
				}

			}
			pw.close();
		}
		if (beCreateAsC) {
			FileOp_A7 foa = new FileOp_A7(this);
			foa.createCRuntimFile();
			return;
		}
		writeSettingJava();
		// write车标JPG();
	}

	private void write车标JPG() {
		// TODO Auto-generated method stub
		// File f = new File("E:\\Android_DC\\1024x600_img\\img\\车标BMP");
		// File fs[] = f.listFiles();
		// // END WITH JPG
		// if (fs != null) {
		// try {
		// FileOutputStream fos = new FileOutputStream(
		// "E:/Android_DC/设置/assets/jpg/list.txt");
		// for (int i = 0; i < fs.length; i++) {
		// // COPY FILE
		// String map = "" + i + " " + fs[i].getName() + "\r\n";
		// fos.write(map.getBytes());
		// // String cmd = "copy " + fs[i].getPath()
		// // + " E:\\Android_DC\\设置\\assets\\jpg\\" + i + ".jpg";
		// copyFile(fs[i], new File(
		// "E:\\Android_DC\\设置\\assets\\jpg\\" + i + ".jpg"));
		// }
		// fos.close();
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
	}

	public void setAllItemLocationAs(ScreenGraphic sg, int n) {
		// TODO Auto-generated method stub
		PNG_STRUCT png = sg.pnStructList.get(n);
		if (png != null) {
			for (int i = 0; i < this.allScreen.size(); i++) {
				PNG_STRUCT png1 = (PNG_STRUCT) this.allScreen.get(i).findPng(
						png.getName());
				if (png1 != null) {
					png1.setLocation(png.getX(), png.getY());
				}
			}
		}
	}

	public void setSameFileNameAsSameLocation() {
		// TODO Auto-generated method stub
		BaseItem bi = getCurrentScreen().getActiveItem();
		if (bi != null) {
			String name = bi.getName();
			int x = bi.getX();
			int y = bi.getY();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < allScreen.size(); i++) {
				String str = allScreen.get(i).adjustAsSameLocation(name, x, y);
				sb.append(str);
			}
			JOptionPane.showMessageDialog(WorkDialog.workDialog, sb.toString(),
					"information", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public int getAmount(String name) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 0; i < allScreen.size(); i++) {
			if (allScreen.get(i).findPng(name) != null) {
				n++;
			}

		}
		return n;
	}

	public void sortScreen() {
		// TODO Auto-generated method stub
		Collections.sort(allScreen, new Comparator() {

			public int compare(Object left, Object right) {
				ScreenGraphic l = (ScreenGraphic) left;
				ScreenGraphic r = (ScreenGraphic) right;
				String s1 = l.getShowName();
				String s2 = l.getShowName();
				return s1.compareTo(s2);
			}
		});

	}

}