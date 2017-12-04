package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_蓝牙编辑 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[1];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙通话记录\\编辑\\编辑.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"蓝牙通话记录\\编辑\\编辑1.png",0,0,8,-1,0);
	pngs[3].setValues("密码高亮","蓝牙通话记录\\编辑\\密码.png",736,86,7,-1,0);
	pngs[4].setValues("名称高亮","蓝牙通话记录\\编辑\\名称.png",611,87,7,-1,0);
	pngs[5].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[6].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[8].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[1];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("TXT",176,83,280,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
