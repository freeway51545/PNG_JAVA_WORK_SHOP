package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_参数设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[55];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[4];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[55];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"设置界面1\\滑动设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("叉","设置界面1\\X.png",673,68,7,-1,0);
	pngs[3].setValues("勾2","设置界面1\\X1.png",673,70,7,-1,0);
	pngs[4].setValues("勾","设置界面1\\Y.png",740,246,7,-1,0);
	pngs[5].setValues("叉2","设置界面1\\Y1.png",739,196,7,-1,0);
	pngs[6].setValues("点击","设置界面1\\点击.png",720,85,7,-1,0);
	pngs[7].setValues("点击后","设置界面1\\点击后.png",720,84,7,-1,0);
	pngs[8].setValues("BAR","设置界面1\\BAR.PNG",0,63,7,-1,0);
	pngs[9].setValues("GPS声音设置","设置小图标\\GPS声音设置.png",38,67,7,-1,0);
	pngs[10].setValues("GPS导航路径","设置小图标\\GPS导航路径.png",50,420,7,-1,0);
	pngs[11].setValues("亮度设置","设置小图标\\亮度设置.png",100,420,7,-1,0);
	pngs[12].setValues("方向盘设置","设置小图标\\方向盘设置.png",213,9,7,-1,0);
	pngs[13].setValues("界面切换","设置小图标\\界面切换.png",500,420,7,-1,0);
	pngs[14].setValues("背景设置","设置小图标\\背景设置.png",550,420,7,-1,0);
	pngs[15].setValues("触摸校准","设置小图标\\触摸校准.png",600,420,7,-1,0);
	pngs[16].setValues("车标设置","设置小图标\\车标设置.png",650,420,7,-1,0);
	pngs[17].setValues("音频设置","设置小图标\\音频设置.png",700,420,7,-1,0);
	pngs[18].setValues("时间设置","设置小图标\\时间设置.png",750,420,7,-1,0);
	pngs[19].setValues("系统升级","设置小图标\\系统升级.png",800,420,7,-1,0);
	pngs[20].setValues("刹车","设置小图标\\刹车.png",150,420,7,-1,0);
	pngs[21].setValues("导航兼听","设置小图标\\导航兼听.png",250,420,7,-1,0);
	pngs[22].setValues("导车镜像","设置小图标\\导车镜像.png",300,420,7,-1,0);
	pngs[23].setValues("恢复出厂设置","设置小图标\\恢复出厂设置.png",350,420,7,-1,0);
	pngs[24].setValues("按钮声音","设置小图标\\按钮声音.png",400,420,7,-1,0);
	pngs[25].setValues("版本","设置小图标\\系统信息.png",350,420,7,-1,0);
	pngs[26].setValues("工厂设置","设置小图标\\工厂设置.png",800,420,7,-1,0);
	pngs[27].setValues("科鲁兹设置","设置小图标\\工厂设置.png",800,420,7,-1,0);
	pngs[28].setValues("倒车静音","设置小图标\\倒车静音.png",800,420,7,-1,0);
	pngs[29].setValues("电阻选择","设置小图标\\电阻图标.png",800,420,7,-1,0);
	pngs[30].setValues("充电选择","设置小图标\\充电图标.png",800,420,7,-1,0);
	pngs[31].setValues("启动导航","设置小图标\\启动导航.png",200,420,7,-1,0);
	pngs[32].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[33].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[34].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[35].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[36].setValues("按键声音F","设置小图标\\字体\\按键声音F.png",38,67,7,-1,0);
	pngs[37].setValues("地图F","设置小图标\\字体\\地图F.png",50,420,7,-1,0);
	pngs[38].setValues("背景设置F","设置小图标\\字体\\背景设置F.png",100,420,7,-1,0);
	pngs[39].setValues("车标设置F","设置小图标\\字体\\车标设置F.png",213,9,7,-1,0);
	pngs[40].setValues("导航监听F","设置小图标\\字体\\导航监听F.png",500,420,7,-1,0);
	pngs[41].setValues("倒车静音F","设置小图标\\字体\\倒车静音F.png",550,420,7,-1,0);
	pngs[42].setValues("倒车镜像F","设置小图标\\字体\\倒车镜像F.png",600,420,7,-1,0);
	pngs[43].setValues("方向盘设置F","设置小图标\\字体\\方向盘设置F.png",650,420,7,-1,0);
	pngs[44].setValues("功放控制F","设置小图标\\字体\\功放控制F.png",700,420,7,-1,0);
	pngs[45].setValues("恢复出厂设置F","设置小图标\\字体\\恢复出厂设置F.png",750,420,7,-1,0);
	pngs[46].setValues("亮度设置F","设置小图标\\字体\\亮度设置F.png",800,420,7,-1,0);
	pngs[47].setValues("屏幕矫正F","设置小图标\\字体\\屏幕矫正F.png",150,420,7,-1,0);
	pngs[48].setValues("启动时启动导航F","设置小图标\\字体\\启动时启动导航F.png",250,420,7,-1,0);
	pngs[49].setValues("时间设置F","设置小图标\\字体\\时间设置F.png",300,420,7,-1,0);
	pngs[50].setValues("同步GPS时间F","设置小图标\\字体\\同步GPS时间F.png",350,420,7,-1,0);
	pngs[51].setValues("系统信息F","设置小图标\\字体\\系统信息F.png",400,420,7,-1,0);
	pngs[52].setValues("行车时禁止视频F","设置小图标\\字体\\行车时禁止视频F.png",350,420,7,-1,0);
	pngs[53].setValues("音量设置F","设置小图标\\字体\\音量设置F.png",800,420,7,-1,0);
	pngs[54].setValues("音频设置F","设置小图标\\字体\\音频设置F.png",800,420,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[4];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("参数设置",360,573,400,37,0x00ffffff,10,0,0,0);
	texts[1].setValues("showName",105,77,560,29,0x00ffffff,10,0,0,0);
	texts[2].setValues("开关_开",687,82,40,29,0x00ffffff,10,0,0,0);
	texts[3].setValues("开关_关",732,81,40,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
