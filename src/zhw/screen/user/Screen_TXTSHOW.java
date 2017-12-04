package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_TXTSHOW extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[6];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[2];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[6];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"AU_X\\系统信息.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[3].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[4].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[5].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[2];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("系统信息",324,80,200,33,0x00ffffff,10,0,0,0);
	texts[1].setValues("TXT1",242,178,400,26,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
