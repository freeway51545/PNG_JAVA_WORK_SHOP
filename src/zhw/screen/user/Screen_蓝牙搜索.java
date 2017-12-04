package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_蓝牙搜索 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙通话记录\\收索\\搜索.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"蓝牙通话记录\\收索\\搜索1.png",0,0,8,-1,0);
	pngs[3].setValues("BAR","蓝牙通话记录\\点击后.png",104,138,7,-1,0);
	pngs[4].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[5].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[6].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[7].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("R1",106,147,580,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("R2",107,193,580,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("TXT",136,78,550,38,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
