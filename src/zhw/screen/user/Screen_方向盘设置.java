package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_方向盘设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[27];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[22];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[27];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[1].setValues(null,"方向盘设置\\新的方向盘设置.png",0,0,1,-1,0);
	pngs[2].setValues(null,"方向盘设置\\新的方向盘设置1.png",0,0,8,-1,0);
	pngs[3].setValues("复位_K","方向盘设置\\设置OK.png",334,525,0,-1,0);
	pngs[4].setValues("音频_K","方向盘设置\\音频.png",730,142,0,-1,0);
	pngs[5].setValues("确认_K","方向盘设置\\设置OK.png",333,419,0,-1,0);
	pngs[6].setValues("静音_K","方向盘设置\\静音.png",134,225,0,-1,0);
	pngs[7].setValues("音量减_K","方向盘设置\\音量减.png",331,228,0,-1,0);
	pngs[8].setValues("音量加_K","方向盘设置\\音量加.png",529,230,0,-1,0);
	pngs[9].setValues("电源_K","方向盘设置\\电源.png",135,141,0,-1,0);
	pngs[10].setValues("模式_K","方向盘设置\\模式.png",531,141,0,-1,0);
	pngs[11].setValues("上一曲_K","方向盘设置\\上一曲.png",133,316,0,-1,0);
	pngs[12].setValues("下一曲_K","方向盘设置\\下一曲.png",334,317,0,-1,0);
	pngs[13].setValues("收音_K","方向盘设置\\收音.png",733,232,0,-1,0);
	pngs[14].setValues("打电话_K","方向盘设置\\打电话.png",529,318,0,-1,0);
	pngs[15].setValues("导航_K","方向盘设置\\导航.png",132,399,0,-1,0);
	pngs[16].setValues("DVD_K","方向盘设置\\DVD.png",331,140,0,-1,0);
	pngs[17].setValues("挂电话_K","方向盘设置\\挂电话.png",731,317,0,-1,0);
	pngs[18].setValues("当前设置","方向盘设置\\当前设置.png",144,123,7,-1,0);
	pngs[19].setValues("提示1","方向盘设置\\提示1.png",503,418,7,-1,0);
	pngs[20].setValues("提示2","方向盘设置\\提示2.png",463,431,7,-1,0);
	pngs[21].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[22].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[23].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[24].setValues("返回按钮","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[25].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[26].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[22];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("方向盘设置",101,700,600,36,0x00ffffff,10,0,0,0);
	texts[1].setValues("复位",52,499,100,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("清除",190,498,100,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("确认",319,502,100,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("返回",436,502,100,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("静音",219,591,100,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("音量减",376,578,100,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("音量加",618,507,100,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("电源",630,575,100,28,0x00ffffff,10,0,0,0);
	texts[9].setValues("上一曲",40,555,100,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("下一曲",584,532,100,28,0x00ffffff,10,0,0,0);
	texts[11].setValues("收音",443,519,100,28,0x00ffffff,10,0,0,0);
	texts[12].setValues("模式",525,581,100,28,0x00ffffff,10,0,0,0);
	texts[13].setValues("打电话",308,555,100,28,0x00ffffff,10,0,0,0);
	texts[14].setValues("导航",479,520,100,28,0x00ffffff,10,0,0,0);
	texts[15].setValues("DVD",626,496,100,28,0x00ffffff,10,0,0,0);
	texts[16].setValues("挂断",723,542,100,28,0x00ffffff,10,0,0,0);
	texts[17].setValues("V1",114,74,100,28,0x00ffffff,10,0,0,0);
	texts[18].setValues("V2",268,75,100,28,0x00ffffff,10,0,0,0);
	texts[19].setValues("V3",424,74,100,28,0x00ffffff,10,0,0,0);
	texts[20].setValues("V4",588,77,100,28,0x00ffffff,10,0,0,0);
	texts[21].setValues("V5",266,352,400,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
