package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_时间调整 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[37];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"时间设置\\新的时间设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("上","时间设置\\上.png",885,235,0,-1,0);
	pngs[3].setValues("下","时间设置\\下.png",886,379,0,-1,0);
	pngs[4].setValues("Y1","时间设置\\蓝色点击.png",47,147,7,-1,0);
	pngs[5].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[6].setValues("返回参数","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[8].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[37];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("时间设置",316,581,400,50,0x00ffffff,10,0,0,0);
	texts[1].setValues("年",46,507,80,40,0x00000001,10,0,0,0);
	texts[2].setValues("月",233,508,80,36,0x00000001,10,0,0,0);
	texts[3].setValues("日",394,509,80,38,0x00000001,10,0,0,0);
	texts[4].setValues("时",563,518,80,38,0x00000001,10,0,0,0);
	texts[5].setValues("分",704,506,80,38,0x00000001,10,0,0,0);
	texts[6].setValues("时制",553,575,80,33,0x00000001,10,0,0,0);
	texts[7].setValues("年1",80,180,80,29,0x00ffffff,10,0,0,0);
	texts[8].setValues("月1",207,180,80,29,0x00ffffff,10,0,0,0);
	texts[9].setValues("日1",310,180,80,29,0x00ffffff,10,0,0,0);
	texts[10].setValues("时1",408,180,80,29,0x00ffffff,10,0,0,0);
	texts[11].setValues("分1",510,180,80,29,0x00ffffff,10,0,0,0);
	texts[12].setValues("时制1",605,180,80,29,0x00ffffff,10,0,0,0);
	texts[13].setValues("年2",80,226,80,29,0x00ffffff,10,0,0,0);
	texts[14].setValues("月2",207,226,80,29,0x00ffffff,10,0,0,0);
	texts[15].setValues("日2",310,226,80,29,0x00ffffff,10,0,0,0);
	texts[16].setValues("时2",408,226,80,29,0x00ffffff,10,0,0,0);
	texts[17].setValues("分2",510,226,80,29,0x00ffffff,10,0,0,0);
	texts[18].setValues("时制2",605,226,80,29,0x00ffffff,10,0,0,0);
	texts[19].setValues("年3",80,279,80,29,0x00ffffff,10,0,0,0);
	texts[20].setValues("月3",207,279,80,29,0x00ffffff,10,0,0,0);
	texts[21].setValues("日3",310,279,80,29,0x00ffffff,10,0,0,0);
	texts[22].setValues("时3",408,279,80,29,0x00ffffff,10,0,0,0);
	texts[23].setValues("分3",510,279,80,29,0x00ffffff,10,0,0,0);
	texts[24].setValues("时制3",605,279,80,29,0x00ffffff,10,0,0,0);
	texts[25].setValues("年4",80,336,80,29,0x00ffffff,10,0,0,0);
	texts[26].setValues("月4",207,336,80,29,0x00ffffff,10,0,0,0);
	texts[27].setValues("日4",310,336,80,29,0x00ffffff,10,0,0,0);
	texts[28].setValues("时4",408,336,80,29,0x00ffffff,10,0,0,0);
	texts[29].setValues("分4",510,336,80,29,0x00ffffff,10,0,0,0);
	texts[30].setValues("时制4",605,336,80,29,0x00ffffff,10,0,0,0);
	texts[31].setValues("年5",80,387,80,29,0x00ffffff,10,0,0,0);
	texts[32].setValues("月5",207,387,80,29,0x00ffffff,10,0,0,0);
	texts[33].setValues("日5",310,387,80,29,0x00ffffff,10,0,0,0);
	texts[34].setValues("时5",408,387,80,29,0x00ffffff,10,0,0,0);
	texts[35].setValues("分5",510,387,80,29,0x00ffffff,10,0,0,0);
	texts[36].setValues("时制5",605,387,80,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
