package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_原车蓝牙 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[5];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[5];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("背景","原车蓝牙\\原车蓝牙.png",0,0,1,-1,0);
	pngs[1].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[2].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[3].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[4].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[0];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
