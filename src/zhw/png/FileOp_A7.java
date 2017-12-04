package zhw.png;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import zhw.com.py.PyList;
import dc.Draw;

public class FileOp_A7 {
	private FileOp Fo = null;

	public FileOp_A7(FileOp fo) {
		setFo(fo);
	}

	public FileOp getFo() {
		return Fo;
	}

	public void setFo(FileOp fo) {
		Fo = fo;
	}

	// ScreenGraphic thisScreen;
	// public Vector<ScreenGraphic> allScreen = new Vector<ScreenGraphic>();
	public Vector<ScreenGraphic> getAllScreen() {
		return getFo().allScreen;
	}

	public ScreenGraphic findScreen(String name) {
		for (int i = 0; i < getAllScreen().size(); i++) {
			if (name.equals(getAllScreen().get(i).screenId)) {
				return getAllScreen().get(i);
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
			try {
				return Integer.parseInt(s);
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public static String getStringCFileName0(String c) {
		// char ccc[] = new char[1000];
		StringBuffer sb = new StringBuffer();
		if (c == null)
			return "null";
		PyList.getInst().init();
		// int n=0;
		// ccc[n++]='\"';
		// sb.append('"');
		for (int i = 0; i < c.length(); i++) {
			char c0 = c.charAt(i);
			if (c0 > 0x7F) {
				// StringBuffer sb=new StringBuffer
				String str1 = PyList.getInst().get(c0);
				sb.append(String.valueOf(str1));
				// sb.append(String.valueOf((int) c0)).append("_");
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
		PyList.getInst().init();
		if (c == null)
			return "null";
		// int n=0;
		// ccc[n++]='\"';
		sb.append('"');
		for (int i = 0; i < c.length(); i++) {
			char c0 = c.charAt(i);
			if (c0 > 0x7F) {
				// StringBuffer sb=new StringBuffer
				String str1 = PyList.getInst().get(c0);
				sb.append(String.valueOf(str1));
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

	String getStringC(String c) {
		// char ccc[] = new char[1000];
		StringBuffer sb = new StringBuffer();
		if (c == null)
			return "NULL";
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

	public static void copyFilePNG(String s, String t) {

		String cmdCopy = "cmd /c copy " + s + " " + t + "";
		try {
			runtime.exec(cmdCopy);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void copyFile(File sourceFile, File targetFile)
			throws IOException {
		if (!sourceFile.exists()) {
			return;
		}

		if (sourceFile.exists() && targetFile.exists()) {
			if (sourceFile.lastModified() == targetFile.lastModified()
					&& sourceFile.length() == targetFile.length()) {
				System.out.println("SAME FILE :" + targetFile.getPath());
				return;
			}
		}
		String path = "E:\\Android_DC\\F102_JAVA_IMAGE\\"
				+ sourceFile.getPath();
		String targetFileName = targetFile.getPath();
		// targetFileName = targetFileName.toLowerCase();
		// targetFileName = targetFileName.replace(".png", ".webp");
		copyFilePNG(path, targetFileName);
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
	void writeCDatas(ScreenGraphic s0, ScreenGraphic parentScreen,
			PrintWriter pw) throws FileNotFoundException {
		// String fileName;
		// String projectPath = parentScreen.projectPath;
		// boolean isIncludedPackage = false;
		// if (s0.getPacageName().equals(parentScreen.getIncludePack())) {
		// isIncludedPackage = true;
		// }
		// String dirCfileFix = rootSourceDir + s0.getPacageName() + "\\fix";
		// new File(dirCfileFix).mkdirs();
		// if (projectPath != null) {
		// fileName = dirCfileFix + "\\Screen_" + s0.screenId + ".cpp_cache";
		// } else {
		// return;
		// }
		// sprintf(fileName,"F:\ZHW-WINCE-C-for-3360\UI\A6\Setting\\%s-setting.cpp",uiBaseRoot);
		// setFileWritbale(fileName);
		// PrintWriter pw = new PrintWriter(fileName);
		// FILE *fpWrite=fopen(fileName,"wb");
		// scan the screen and PNG FILE AND TXTS
		pw.println("#include \"" + s0.screenId + "_EventV1.h\"");
		// pw.printf("	public Screen screen[]=new Screen[%d] ;\r\n",screenLen);
		pw.printf("	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[%d];\r\n",
				s0.pnStructList.size());
		pw.printf("	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[%d];\r\n",
				s0.txtStruct.size());

		// pw.printf("//pngLoc=%d;\r\n", pngLoc);
		// pw.printf("//txtLoc=%d;\r\n", txtLoc);
		// pw.printf("//backGroundACount=%d;\r\n",backGroundACount);
		String className = s0.screenId + "_EventV1";
		pw.printf("void " + className + "::initPng(){\r\n");
		// pw.printf("	PNG_STRUCT pngs[]=new PNG_STRUCT[%d];\r\n",
		// s0.pnStructList.size());
		// pw.printf("	for(int i=0;i<pngs.length;i++){\r\n");
		// pw.printf("	\tpngs[i]=new PNG_STRUCT();\r\n\t}\r\n\r\n");
		// int nPngBegin=0;
		// if(screen[i].pngLen>0){
		// nPngBegin=s.pnStructList-pngStruct0;
		// }
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			pw.printf("\tpngs[%d].setValues(%s,", j, getStringC(png.aliasName));
			pw.printf("%s,", getStringJavaFileName(png.name));
			pw.printf("%d,", png.xLoc);
			pw.printf("%d,", png.yLoc);
			pw.printf("%d,", png.showCondition);
			pw.printf("%d,", png.showCustomer);
			pw.printf("%d", 0);
			pw.printf(");\r\n");
			pw.flush();
		}
		pw.printf("	\t\t pnStructList=pngs;\r\n");
		pw.printf("	}\r\n\r\n");

		pw.printf("\tvoid " + className + "::initTxt(){\r\n");

		for (int j = 0; j < s0.txtStruct.size(); j++) {
			// int loc=txtBegin+j;
			TXT_STRUCT txt = s0.txtStruct.get(j);
			pw.printf("\t\ttexts[%d].setValues(%s,", j, getStringC(txt.name));
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
		pw.printf("	\ttxtStruct=texts;\r\n");
		pw.printf("	;}\r\n");

		pw.println("	void " + className + "::initScreen(){");
		pw.println("\t	static bool beIntied=0;");
		pw.println("\t	if(beIntied)");
		pw.println("\t		return;");
		pw.println("\t	beIntied=1;");
		pw.println("\t	initPng();");
		pw.println("\t	initTxt();");
		pw.println("\t}\r\n");
		if (s0.isDlg()) {
			// pw.printf("		initDlg();\r\n");
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
		// pw.printf("}\r\n");
		// pw.printf("}\r\n");
		// pw.close();
		// makeFileIfNotSave(fileName);
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

	void writeBackXml(ScreenGraphic s, ScreenGraphic parent,
			Vector<PNG_STRUCT> plList, Vector<String> plName, String projectPath) {
		// String path = parent.projectPath + "\\res\\layout\\"
		// + s.screenId.toLowerCase() + "_background.xml";
		// PrintWriter pw;
		// int xOff = 0;
		// int yOff = 0;

		try {
			// File f = new File(path);
			// if (f.exists()) {
			// f.setWritable(true);
			// }
			// G:\A7_QT_FROM_WINCE\WORK_DIR\png_resource\img\back_groud
			// String tempFilePath = projectPath + "\\assets_res\\drawable\\";
			// (new File(tempFilePath)).mkdirs();

			String backGroundDir = rootDir + "png_resource\\img\\back_groud\\";
			(new File(backGroundDir)).mkdirs();

			String jpgName = "auto_image_back_ground_"
					+ s.screenId.toLowerCase();
			String jpgPath = backGroundDir + jpgName;
			htUseFullBackFil.put(jpgName + ".png", "");
			PictureUtil.graphicsGeneration(jpgPath, plList);
			// int sizeWidth = ScreenGraphic.sizeWidth;
			// int sizeHeight = ScreenGraphic.sizeHeight;
			// pw = new PrintWriter(path);
			// pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			//
			// pw.println("<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
			// pw.println(getBlank(1)
			// + "xmlns:tools=\"http://schemas.android.com/tools\"");
			// pw.println(getBlank(1) + "android:layout_width=\"" + sizeWidth
			// + "px\"");
			// pw.println(getBlank(1) + "android:layout_height=\"" + sizeHeight
			// + "px\"");
			// pw.println(getBlank(1) + "android:id=\"@+id/back_ground_"
			// + s.screenId.toLowerCase() + "\"");
			// // pw.println(getBlank(1) + "android:visibility=\"invisible\"");
			// if (s.isDlg()) {
			// pw.println(getBlank(1) + "android:background=\"#00ffffff\">");
			// } else {
			// if (s.background != null) {
			// pw.println(getBlank(1) + "android:background="
			// + s.background + ">");
			// } else {
			// pw.println(getBlank(1) + "android:background=\"#000000\">");
			// }
			// }
			//
			// pw.println("\t<ImageView");
			// pw.println("\tandroid:layout_width=\"wrap_content\"");
			// pw.println("\tandroid:layout_height=\"wrap_content\"");
			// pw.println("\tandroid:layout_weight=\"1\"");
			// pw.println("\tandroid:layout_marginTop=\"0px\"");
			// pw.println("\tandroid:layout_marginLeft=\"0px\"");
			// pw.println("\tandroid:src=\"@drawable/" + jpgName + "\" />");
			//
			// if (s.isDlg()) {
			// pw.println("\t <zhw.screen.dlg.DlgMainView");
			// pw.println("\t\tandroid:id=\"@+id/DlgMain_"
			// + s.screenId.toLowerCase() + "\"");
			// pw.println("\t\tandroid:layout_width=\"wrap_content\"");
			// pw.println("\t\tandroid:layout_height=\"wrap_content\" >");
			// pw.println("\t\t</zhw.screen.dlg.DlgMainView>");
			//
			// pw.println("\t <zhw.png.ActivePngView");
			// pw.println("\t\t android:id=\"@+id/ActivePngView_"
			// + s.screenId.toLowerCase() + "\"");
			// pw.println("\t\t android:layout_width=\"wrap_content\"");
			// pw.println("\t\t android:layout_height=\"wrap_content\" />");
			// }
			for (int i = 0; i < s.txtStruct.size(); i++) {
				TXT_STRUCT txt = s.txtStruct.get(i);
				if (txt.name != null) {
					String name = txt.name.toLowerCase();
					if (name.endsWith(".xml")) {
						// pw.println(" <include layout=\"@layout/"
						// + name.substring(0, name.lastIndexOf(".xml"))
						// + "\" /> ");
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
			// pw.println("</FrameLayout>");
			// pw.close();
		} catch (Exception e) {
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
							String name = copyPngFileAsBack("img\\"
									+ pl.get(j).getName(), parent.projectPath
									+ "\\res\\drawable");
							plBack.add(png);
							plName.add(name);
						} else {
							plBack.add(png);
						}
					}
				} else {
					String target = rootDir + "\\png_resource";
					copyPngFileAsWebp("img\\" + pl.get(j).getName(), target);
				}
				//
			}
			// for(allScreen.get(i).pnStructList.)
			// copyDir("img\\")
			// \assets
			if (s.isDlg() || outputPng) {
				// writeBackXml_old(s, parent, plBack, plName);
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

	public static String rootDir = "G:\\A7_QT_FROM_WINCE\\WORK_DIR\\";
	public static String rootSourceDir = "G:\\A7_QT_FROM_WINCE\\UI\\A7_UI\\";

	void createCRuntimFile() throws FileNotFoundException {
		// htProject.clear();
		Vector<AssetCopy> vTocpy = new Vector<AssetCopy>();
		Vector<ScreenGraphic> vToWritedProject = new Vector<ScreenGraphic>();
		ScreenGraphic sPublic = null;
		// Vector<ScreenGraphic> v[] = new
		// Vector<ScreenGraphic>[allScreen.size()];
		Vector<Vector<ScreenGraphic>> vAll = new Vector<Vector<ScreenGraphic>>();
		Vector<ScreenGraphic> vDealed = new Vector<ScreenGraphic>();
		for (int i = 0; i < getAllScreen().size(); i++) {
			if (getAllScreen().get(i).screenId == "DEL")
				continue;
			Vector<ScreenGraphic> v = new Vector<ScreenGraphic>();
			ScreenGraphic s = getAllScreen().get(i);
			if (!s.isGen())
				continue;
			if (vDealed.indexOf(s) != -1) {
				// 已经处理了
				continue;
			}
			vDealed.add(s);
			// 查找相同工程名称的
			v.add(s);
			for (int j = i + 1; j < getAllScreen().size(); j++) {
				ScreenGraphic s1 = getAllScreen().get(j);
				if (s1.projectPath == null) {
					continue;
				}
				if (s1.projectPath.equals(s.projectPath)) {
					v.add(s1);
					vDealed.add(s1);
				}
			}
			vAll.add(v);
			if (false)
				if (s.getIncludePack() != null) {
					String inp = s.getIncludePack();
					int nCount = 0;
					Vector<String> vInclude = new Vector<String>();
					for (int j = 0; j < getAllScreen().size(); j++) {
						ScreenGraphic s1 = getAllScreen().get(j);
						if (inp.equals(getAllScreen().get(j).getPacageName())) {
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
						// writeCDatas(s, v.get(0));
						writeCActions(s, v.get(0));
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
		if (false)
			for (int i = 0; i < vTocpy.size(); i++) {
				AssetCopy ac = vTocpy.get(i);
				//
				String target = rootDir;
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
		// c 语言生成代码
		if (false)
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

		String fileName = getEventListDataFileName(s) + "_cache";
		int n = fileName.lastIndexOf("\\");
		String dir = fileName.substring(0, n);
		(new File(dir)).mkdirs();
		setFileWritbale(fileName);
		PrintWriter pw = new PrintWriter(fileName);
		String cacheName = fileName;
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic s1 = v.get(i);
			if (!s1.genCode)
				continue;
			pw.println("#include \"fix\\" + s1.getName() + "_EventV1.h\"");
		}
		pw.println();

		// pw.printf("\r\npublic class " + EventListDataName);
		if (s.haveInclude) {
			// pw.printf(" extends zhw.screen.constd.action_include.EventListDataI");
		}
		// pw.printf(" implements " + packName + "." + IScreenConstName +
		// " {\r\n");
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic ss = v.elementAt(i);
			if (!ss.genCode)
				continue;
			String name = ss.getName();
			pw.printf(" static " + name + "_EventV1 " + name + "_inst ;\r\n");
		}

		pw.printf("\r\n\t void " + s.getPrjectShortName() + "_init() {\r\n");
		if (s.haveInclude) {
			// pw.printf("  zhw.screen.constd.action_include.EventListDataI.init();\r\n");
		}
		for (int i = 0; i < v.size(); i++) {
			ScreenGraphic ss = v.elementAt(i);
			if (!ss.genCode)
				continue;
			String name = ss.getName();
			pw.printf("\t\taddScren(" + "SCRN2_" + name + "," + name
					+ "_inst);\r\n");
		}
		pw.printf("\t}\r\n");

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
			pw1.printf("\tfinal static String SCRN2_" + name + " = \"" + name
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
				pw1.printf("\t\t final static int back_id_"
						+ ss.screenId.toLowerCase() + "=" + s.getPacageName()
						+ ".R.id.back_ground_" + name.toLowerCase() + ";\r\n");
			}
			if (s.haveInclude) {
				for (int i = 0; i < s.nIncludeCount; i++) {
					String name = s.vIncludeName.get(i).toLowerCase();
					pw1.printf("\t\t final static int back_id_"
							+ name.toLowerCase() + "=" + s.getPacageName()
							+ ".R.id.back_ground_" + name.toLowerCase()
							+ ";\r\n");
				}
			}

			pw1.printf("}\r\n");
		}
		pw1.flush();
		pw1.close();
		makeFileIfNotSave(cacheName);
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
			String fName = rootSourceDir + s.packageName
					+ "\\EventListDataI.cpp";
			makeDir(fName);
			return fName;
		} else {
			return rootSourceDir + s.packageName + "\\" + s.packageName
					+ "_EventListData.cpp";
		}
	}

	private ScreenGraphic findFirstScreen(String projectPath) {
		// TODO Auto-generated method stub
		for (int i = 0; i < getAllScreen().size(); i++) {
			String pj = getAllScreen().get(i).projectPath;
			if (pj == null) {
				continue;
			}
			if (getAllScreen().get(i).projectPath.equals(projectPath)) {
				return getAllScreen().get(i);
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
	private void writeCActions(ScreenGraphic s0, ScreenGraphic screenParent)
			throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName;
		String file_funcs;
		String projectPath = screenParent.projectPath;
		if (projectPath == null) {
			return;
		}
		String dirCfile = rootSourceDir + s0.getPacageName();
		String dirCfileFix = rootSourceDir + s0.getPacageName() + "\\fix";
		String headFile;
		String file_extendHead;
		String className = s0.screenId + "_EventV1";
		new File(dirCfile).mkdirs();
		new File(dirCfileFix).mkdirs();
		if (projectPath != null) {
			fileName = dirCfileFix + "\\" + s0.screenId + "_EventV1.cpp_cache";
			headFile = dirCfileFix + "\\" + s0.screenId + "_EventV1.h_cache";
			file_funcs = dirCfile + "\\" + s0.screenId + "_Event_funcs.cpp";
			file_extendHead = dirCfile + "\\" + className + "_extend.h";
		} else {
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
		// setFileWritbale(fileName);
		PrintWriter pw = new PrintWriter(fileName);
		writeCDatas(s0, screenParent, pw);
		PrintWriter pwH = new PrintWriter(headFile);
		pwH.println("#ifndef " + s0.screenId + "_EventV1_HEAD");
		pwH.println("#define " + s0.screenId + "_EventV1_HEAD");
		pwH.println("#include \"pub.h\"");
		pwH.println("#include \"BaseStateEventItem2.h\"");
		String screeName = "SCRN2_" + s0.screenId;
		pwH.println("\r\n#define " + screeName + " \"" + screeName + "\"");
		// class RADIO_EventV1 :: public BaseStateEventItem{
		// public:
		// virtual void _F_INIT_FUN(MSG_ZHW msg)=0;
		// virtual void _F_UPDATE_TIMMER(MSG_ZHW msg)=0;
		// virtual void _F_Play(MSG_ZHW msg)=0;
		// };

		// #endif
		// pw.printf("package zhw.screen.action.user;\r\n");
		// pw.printf("import zhw.screen.action.BaseStateEventItem;\r\n");
		// pw.printf("import zhw.screen.action.MSG_ZHW;\r\n");
		// if (s0.beinclude) {
		// pw.printf("import zhw.screen.user.action_include.Screen_"
		// + s0.screenId + ";\r\n");
		// } else {
		// pw.printf("import zhw.screen.user.Screen_" + s0.screenId + ";\r\n");
		// }
		pwH.println("\r\n //---------- NEXT IS CMD DEFIND -----\r\n");
		if (false)
			for (int j = 0; j < s0.pnStructList.size(); j++) {
				// int loc=nPngBegin+j;
				PNG_STRUCT png = s0.pnStructList.get(j);
				if (png.hasFuction()) {
					int id = 20000 + j * 20;
					String functionId = s0.screenId + "_" + png.aliasName;
					pwH.printf("\t#define MSG_" + functionId + "			 "
							+ String.format("%8d", id) + "\r\n");
					pwH.printf("\t#define MSG_" + functionId + "_RELEASE   "
							+ String.format("%8d", id + 1) + "\r\n");
					pwH.printf("\t#define MSG_" + functionId + "_PRESSING  "
							+ String.format("%8d", id + 2) + "\r\n");
					pwH.printf("\t#define MSG_" + functionId + "_PRESSED   "
							+ String.format("%8d", id + 3) + "\r\n");
				}
			}
		pwH.println("\r\n //---------- NEXT IS FUN DEFIN-----\r\n");
		pwH.printf("class " + s0.screenId
				+ "_EventV1 : public BaseStateEventItemV2 {\r\npublic:\r\n");
		// if (s0.beinclude) {
		// pw.printf(" implements	zhw.screen.constd.action_include.IScreenConstI{\r\n");
		// } else {
		// pw.printf(" implements	zhw.screen.constd.IScreenConst{\r\n");
		// }
		pwH.printf("	PNG_STRUCT pngs[%d];\r\n", s0.pnStructList.size());
		pwH.printf("\tvirtual int getPngLength(){return %d;};\r\n",
				s0.pnStructList.size());

		pwH.printf("	TXT_STRUCT	texts[%d];\r\n", s0.txtStruct.size());
		pwH.printf("\tvirtual int getTextLength(){return %d;};\r\n",
				s0.txtStruct.size());

		pwH.printf("\t" + s0.screenId + "_EventV1();\r\n");
		pwH.printf("\tvirtual void _F_INIT_FUN(MSG_ZHW&msg);\r\n");
		pwH.printf("\tvirtual void _F_UPDATE_TIMMER(MSG_ZHW&msg);\r\n");
		pwH.println("\tvirtual void dispatch(MSG_ZHW&msg);");
		pwH.println("\tvirtual void drawDynimicQt(QPainter *qp);");

		if (s0.isDlg()) {
			pwH.println("\t virtual int getDlgMainViewId();");
			pwH.println("\t virtual bool isDlg();");
			pwH.println("\t virtual int getActiveViewId();");
			pwH.println("\t virtual int getBackId();");

		}
		pwH.println("\tvirtual int getMsgLen(){return 0;};");
		pwH.println("\tvirtual char* getTitleName();");

		pwH.println("\tvoid initPng();");
		pwH.println("\tvoid initTxt();");
		pwH.println("\tvirtual  void initScreen();");

		pwH.printf("\tvirtual char *getScreenName(){ return \"" + s0.screenId
				+ "\";};\r\n");

		Hashtable<String, String> funcs = new Hashtable<String, String>();
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String f = png.getFunctionName();
				if (funcs.containsKey(f)) {
					continue;
				}
				pwH.printf("\tvoid  " + png.getFunctionName() + "(MSG_ZHW&msg"
						+ png.getFunctionParamtersC() + ");\r\n");
				if (png.isLongPressed()) {
					pwH.printf("\tvoid  " + png.getFunctionName() + "_Pressing"
							+ "(MSG_ZHW&msg" + png.getFunctionParamtersC()
							+ ");\r\n");
				}
				funcs.put(f, f);
			}
		}
		pwH.println("#include \"..\\" + className + "_extend.h\"");
		pwH.println("\r\n};");

		pwH.println("#endif\r\n");
		pwH.println();
		pwH.close();
		if (!new File(file_extendHead).exists()) {
			PrintWriter fos = new PrintWriter(file_extendHead);
			fos.println("/// create by system");
			fos.close();
		}
		pw.println();

		pw.println("#include \"" + className + ".h\"");
		pw.printf("\t " + className + "::" + className + "(){\r\n");
		pw.println("\t\tchar *actionList[]={");
		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String functionId = s0.screenId + "_" + png.aliasName;
				pw.printf("\t\t\"" + png.aliasName + "\",\r\n");
			}
		}
		pw.println("\t\tNULL};\r\n\t\tsetActions(actionList);");
		pw.println("\t\tinitScreen();\t\r\n\t};");
		// pw.printf("\t\tsetBindScreen(new Screen_" + s0.screenId + "(),SCRN_"
		// + s0.screenId + ");\r\n\t}\r\n");

		pw.printf("\tvoid " + className + ":: dispatch(MSG_ZHW&msg){\r\n");

		pw.printf("\t\tif(msg.msgID==MSG_ENTER_SCRN){\r\n");
		pw.printf("\t\t\t_F_INIT_FUN(msg);\r\n");
		pw.printf("\t\t\tcomsumer(msg);return;\r\n");
		pw.printf("\t\t}\r\n");

		pw.printf("\t\tif(msg.msgID==_TIMMER_10PS){\r\n");
		pw.printf("\t\t\t_F_UPDATE_TIMMER(msg);\r\n");
		pw.printf("\t\t\tcomsumer(msg);\r\n");
		pw.printf("\t\t\treturn;\r\n");
		pw.printf("\t\t\t}\r\n");

		for (int j = 0; j < s0.pnStructList.size(); j++) {
			// int loc=nPngBegin+j;
			PNG_STRUCT png = s0.pnStructList.get(j);
			if (png.hasFuction()) {
				String functionId = png.aliasName;
				pw.printf("\t\tif(msg.actionName==\"" + functionId
						+ "\"&&msg.msgID==NULL_RELEASE){\r\n");
				pw.printf("\t\t\t" + png.getFunctionName() + "(msg"
						+ png.getFunctionValue() + ");\r\n");
				pw.printf("\t\t\tcomsumer(msg);;\r\n");
				pw.printf("\t\t}\r\n");
				if (png.isLongPressed()) {
					pw.printf("\t\tif(msg.actionName==\"" + functionId
							+ "\"&&msg.msgID==NULL_PRESSING){\r\n");
					pw.printf("\t\t\t" + png.getFunctionName() + "_Pressing"
							+ "(msg" + png.getFunctionValue() + ");\r\n");
					pw.printf("\t\t\tcomsumer(msg);;\r\n");
					pw.printf("\t\t}\r\n");
				}
			}
		}
		if (false) {
			pw.printf("\t\tif(msg.wParam==MSG_ENTER_SCRN){\r\n");
			pw.printf("\t\t\t_F_INIT_FUN(msg);\r\n");
			pw.printf("\t\t\tmsg.setComsumered();\r\n");
			pw.printf("\t\t}\r\n");
			pw.printf("\t\tif(msg.wParam==_TIMMER_10PS){\r\n");
			pw.printf("\t\t\t_F_UPDATE_TIMMER(msg);\r\n");
			pw.printf("\t\t\tmsg.setComsumered();\r\n");
			pw.printf("\t\t}\r\n");
		}
		pw.printf("\t}\r\n");
		pw.close();
		if (new File(file_funcs).exists()) {
			file_funcs = file_funcs + "_temp";
		}
		pw = new PrintWriter(file_funcs);
		funcs.clear();

		pw.println("#include \"fix\\" + className + ".h\"");
		if (s0.isDlg()) {
			pw.printf("\t static int dlgBackId=0;//" + s0.getPacageName()
					+ ".R.layout." + s0.screenId.toLowerCase()
					+ "_background;\r\n");
			pw.printf("\t static int dlgMainView=0;//" + s0.getPacageName()
					+ ".R.id.DlgMain_" + s0.screenId.toLowerCase() + ";\r\n");

			pw.printf("\t static int dlgActiveView=0;//" + s0.getPacageName()
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
		pw.printf("\t//@Override\r\n");
		pw.printf("\t void " + className + "::_F_INIT_FUN(MSG_ZHW&msg) {\r\n");
		pw.printf("\t\t// TODO Auto-generated method stub\r\n");
		if (s0.isDlg()) {
			// 不用管
			// pw.printf("\t\tsetBackId(myBackId);\r\n");
		} else {
			String myBackId = "IScreenConst.back_id_"
					+ s0.screenId.toLowerCase();
			pw.printf(
					"\t\t//BackUtil.showBackGround(this.getMainActivity(), IScreenConst.backList,%s);\r\n",
					myBackId);
			pw.printf(
					"\t\t//BackUtil.showBackGround(this.getMainActivity(), IScreenConst.backList,%s);\r\n",
					myBackId);
		}
		pw.printf("\t}\r\n");
		pw.printf("\r\n");
		pw.printf("\t//@Override\r\n");
		pw.printf("\tvoid " + className
				+ "::_F_UPDATE_TIMMER(MSG_ZHW&msg) {\r\n");
		pw.printf("\t\t// TODO Auto-generated method stub\r\n");

		pw.printf("\t}\r\n");

		if (s0.isDlg()) {
			pw.printf("\tint " + className + "::getBackId(){\r\n");
			pw.printf("\t\treturn dlgBackId;\r\n");
			pw.printf("\t}\r\n");
			pw.printf("\t int " + className + "::getDlgMainViewId(){\r\n");
			pw.printf("\t\treturn dlgMainView;\r\n");
			pw.printf("\t}\r\n");

			pw.printf("\t bool " + className + "::isDlg(){\r\n");
			pw.printf("\t\treturn true;\r\n");
			pw.printf("\t}\r\n");

			pw.println("\t int " + className + ":: getActiveViewId() {");
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
				pw.printf("	void " + className + "::" + png.getFunctionName()
						+ "(MSG_ZHW&msg" + png.getFunctionParamtersC()
						+ "){\r\n	};\r\n");
				funcs.put(f, f);
			}
		}

		pw.printf("\r\n");
		// pw.printf("}\r\n");
		
		pw.close();
		makeFileIfNotSave(fileName);// _cache;
		makeFileIfNotSave(headFile);// _cache;
	}

	private void makeFileIfNotSave(String fileName) {
		// TODO Auto-generated method stub
		int n = fileName.lastIndexOf("_cache");
		if (n < 0) {
			return;
		}
		String oldFile = fileName.substring(0, n);
		try {
			byte ba1[] = readFile(oldFile);
			byte ba2[] = readFile(fileName);
			boolean copyIt = false;
			if (ba1 == null) {
				copyIt = true;
			} else {
				if (ba1.length != ba2.length) {
					copyIt = true;
				} else {
					for (int i = 0; i < ba1.length; i++) {
						if (ba1[i] != ba2[i]) {
							copyIt = true;
							break;
						}
					}
				}
			}
			if (copyIt) {
				FileOutputStream fos = new FileOutputStream(oldFile);
				fos.write(ba2);
				fos.close();
			}
			new File(fileName).delete();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private byte[] readFile(String file) throws Exception {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		if (!new File(file).exists()) {
			return null;
		}
		FileInputStream fis = new FileInputStream(file);
		byte ba[] = new byte[1024];
		while (true) {
			int len = fis.read(ba);
			if (len <= 0) {
				break;
			}
			baos.write(ba, 0, len);
		}
		fis.close();
		baos.close();
		return baos.toByteArray();
	}

	public static void copyPngFileAsWebp(String src, String target) {
		// TODO Auto-generated method stub
		String file1 = target + "\\" + getStringCFileName0(src);
		int n = file1.lastIndexOf("\\");
		String dir = file1.substring(0, n);
		(new File(dir)).mkdirs();

		try {
			file1 = file1.toLowerCase();
			copyFile(new File(src), new File(file1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// String s2 = src + "_files";
		// File f = new File(s2);
		// if (f.exists()) {
		// String dir2 = target + "\\" + getStringCFileName0(s2);
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

	private String copyPngFileAsBack(String src, String target) {
		// TODO Auto-generated method stub
		String targetBackName = getStringCFileName0(src);
		targetBackName = targetBackName.replace('\\', '_').toLowerCase();
		targetBackName = "auto_" + targetBackName.replaceAll("__", "_");
		String file1 = target + "\\" + targetBackName;
		int n = file1.lastIndexOf("\\");
		String dir = file1.substring(0, n);
		(new File(dir)).mkdirs();
		try {
			// 判断文件 大小 和最后修改时间
			file1 = file1.toLowerCase();
			htUseFullBackFil.put(file1.toLowerCase(), "");// 有用的图片
			copyFile(new File(src), new File(file1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return targetBackName;
		/*
		 * String s2 = src + "_files"; File f = new File(s2); if (f.exists()) {
		 * String dir2 = target + "\\" + getStringCFileName0(s2); (new
		 * File(dir2)).mkdirs(); try { copyFile(new File(s2 + "\\Part.ini"), new
		 * File(dir2 + "\\Part.ini")); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } //
		 * file2+="\\prop.ini"; }
		 */
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
			for (int i = 0; i < this.getAllScreen().size(); i++) {
				PNG_STRUCT png1 = (PNG_STRUCT) this.getAllScreen().get(i)
						.findPng(png.getName());
				if (png1 != null) {
					png1.setLocation(png.getX(), png.getY());
				}
			}
		}
	}

	public int getAmount(String name) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i = 0; i < getAllScreen().size(); i++) {
			if (getAllScreen().get(i).findPng(name) != null) {
				n++;
			}

		}
		return n;
	}

}