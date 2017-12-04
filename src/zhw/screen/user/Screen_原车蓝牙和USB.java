package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_原车蓝牙和USB extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[4];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[12];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[4];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("背景","原车蓝牙和USB\\bg.png",0,0,1,-1,0);
	pngs[1].setValues("选中","原车蓝牙和USB\\选中.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[3].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[12];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("蓝　　牙:",77,79,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("蓝牙_VALUE",171,79,150,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("USB:",554,79,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("USB_VALUE",638,79,150,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("打开",96,192,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("关闭",264,192,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("总曲目:",77,124,80,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("总曲目_VALUE",171,124,150,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("当前曲:",333,124,80,28,0x00ffffff,10,0,0,0);
	texts[9].setValues("当前曲_VALUE",425,124,150,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("时间:",554,124,80,28,0x00ffffff,10,0,0,0);
	texts[11].setValues("时间_VALUE",638,124,150,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
