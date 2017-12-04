package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_车标 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"车标设置\\bg2.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"车标设置\\选中2.png",0,0,8,-1,0);
	pngs[3].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[4].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[5].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[6].setValues("返回设置","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[8].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("确认",180,426,120,30,0x00ffffff,40,0,0,0);
	texts[1].setValues("上一页",21,426,120,30,0x00ffffff,40,0,0,0);
	texts[2].setValues("下一页",342,426,120,30,0x00ffffff,40,0,0,0);
	texts[3].setValues("车标选择",162,559,600,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("SD卡",662,426,120,30,0x00ffffff,40,0,0,0);
	texts[5].setValues("系统车标",502,426,120,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
