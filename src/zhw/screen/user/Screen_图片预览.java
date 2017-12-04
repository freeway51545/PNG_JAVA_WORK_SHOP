package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_图片预览 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[11];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"预览图片\\新预览图片.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"预览图片\\新预览图片1.png",0,0,8,-1,0);
	pngs[3].setValues("SD","预览图片\\SD高亮.png",445,414,7,-1,0);
	pngs[4].setValues("SYS","预览图片\\系统高亮.png",252,414,7,-1,0);
	pngs[5].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[6].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[8].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[11];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("背景设置",279,535,400,39,0x00ffffff,10,0,0,0);
	texts[1].setValues("选中",596,554,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("SD图片",250,546,100,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("删除",326,567,150,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("系统图片",474,530,110,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("设置图片",261,532,150,18,0x00ffffff,10,0,0,0);
	texts[6].setValues("设成背景",586,508,150,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("创建背景",416,527,150,22,0x00ffffff,10,0,0,0);
	texts[8].setValues("上一页",326,538,100,30,0x00ffffff,10,0,0,0);
	texts[9].setValues("下一页",53,524,100,30,0x00ffffff,10,0,0,0);
	texts[10].setValues("提示信息",257,192,360,36,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
