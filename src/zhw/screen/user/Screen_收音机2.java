package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_收音机2 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[36];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[19];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[36];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"收音机\\收音机.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"收音机\\收音机2.png",0,0,8,-1,0);
	pngs[3].setValues("ST高亮","收音机\\立体声高亮.png",659,82,7,-1,0);
	pngs[4].setValues("EQ","收音机\\EQ.png",55,81,0,-1,0);
	pngs[5].setValues("立体声","收音机\\立体声.png",659,82,0,-1,0);
	pngs[6].setValues("AM1","收音机\\AM1.png",136,169,7,-1,0);
	pngs[7].setValues("AM2","收音机\\AM2.png",136,169,7,-1,0);
	pngs[8].setValues("FM1","收音机\\FM1.png",136,169,7,-1,0);
	pngs[9].setValues("FM2","收音机\\FM2.png",136,169,7,-1,0);
	pngs[10].setValues("FM3","收音机\\FM3.png",136,169,7,-1,0);
	pngs[11].setValues("0","收音机\\NUM\\0.png",306,115,7,-1,0);
	pngs[12].setValues("1","收音机\\NUM\\1.png",247,115,7,-1,0);
	pngs[13].setValues("2","收音机\\NUM\\2.png",478,574,7,-1,0);
	pngs[14].setValues("3","收音机\\NUM\\3.png",478,574,7,-1,0);
	pngs[15].setValues("4","收音机\\NUM\\4.png",478,574,7,-1,0);
	pngs[16].setValues("5","收音机\\NUM\\5.png",478,574,7,-1,0);
	pngs[17].setValues("6","收音机\\NUM\\6.png",478,574,7,-1,0);
	pngs[18].setValues("7","收音机\\NUM\\7.png",478,574,7,-1,0);
	pngs[19].setValues("8","收音机\\NUM\\8.png",373,115,7,-1,0);
	pngs[20].setValues("9","收音机\\NUM\\9.png",472,115,7,-1,0);
	pngs[21].setValues("KHZ","收音机\\KHZ.png",575,168,7,-1,0);
	pngs[22].setValues("MHZ","收音机\\MHZ.png",576,168,7,-1,0);
	pngs[23].setValues("点","收音机\\NUM\\dian.png",438,110,7,-1,0);
	pngs[24].setValues("ST高亮1","收音机\\ST高亮.png",482,498,7,-1,0);
	pngs[25].setValues("立体灯","收音机\\立体灯1.png",579,139,7,-1,0);
	pngs[26].setValues("LL","收音机\\浏览.png",154,131,7,-1,0);
	pngs[27].setValues("SS","收音机\\收索.png",154,130,7,-1,0);
	pngs[28].setValues(null,"收音机\\立体灯.png",715,530,1,-1,0);
	pngs[29].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[30].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[31].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[32].setValues("返回按钮","pub\\返回并退出1.png",745,0,0,-1,0);
	pngs[33].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[34].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[35].setValues("远程FLAG","收音机\\远近程高亮.png",167,386,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[19];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("FM_MAIN",274,156,250,53,0x00ffffff,40,0,0,0);
	texts[1].setValues("C1",36,285,90,34,0x00ffffff,40,0,0,0);
	texts[2].setValues("C2",164,285,90,34,0x00ffffff,40,0,0,0);
	texts[3].setValues("C3",292,285,90,34,0x00ffffff,40,0,0,0);
	texts[4].setValues("C4",421,285,90,34,0x00ffffff,40,0,0,0);
	texts[5].setValues("C5",549,285,90,34,0x00ffffff,40,0,0,0);
	texts[6].setValues("C6",677,285,90,34,0x00ffffff,40,0,0,0);
	texts[7].setValues("立体声",166,541,90,19,0x00ffffff,40,0,0,0);
	texts[8].setValues("ST",143,88,80,22,0x00ffffff,40,0,0,0);
	texts[9].setValues("页码",349,510,90,24,0x00ffffff,40,0,0,0);
	texts[10].setValues("PL_MIN",141,132,90,24,0x00ffffff,40,0,0,0);
	texts[11].setValues("PL_MAX",504,532,90,24,0x00ffffff,40,0,0,0);
	texts[12].setValues("FM_MAIN_HZ",634,515,120,24,0x00ffffff,40,0,0,0);
	texts[13].setValues("向上搜索",47,459,65,18,0x00ffffff,40,0,0,0);
	texts[14].setValues("远近程",177,459,65,18,0x00ffffff,40,0,0,0);
	texts[15].setValues("自动搜索",305,459,65,18,0x00ffffff,40,0,0,0);
	texts[16].setValues("频段",432,459,65,18,0x00ffffff,40,0,0,0);
	texts[17].setValues("浏览",570,459,65,18,0x00ffffff,40,0,0,0);
	texts[18].setValues("向下搜索",690,459,65,18,0x00ffffff,40,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
