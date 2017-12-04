package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_标志仪表控制 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[4];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[9];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[4];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("背景","仪表控制\\bg.png",0,0,1,-1,0);
	pngs[1].setValues("选中","仪表控制\\选中.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[3].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[9];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("波　　段:",77,79,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("波段_VALUE",171,79,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("频率:",449,79,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("频率_VALUE",521,79,160,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("模式",107,267,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("暗色",614,265,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("菜单",98,415,80,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("退出",614,412,80,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("OK",360,340,80,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
