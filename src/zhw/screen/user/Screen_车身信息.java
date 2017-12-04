package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_车身信息 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[4];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[21];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[4];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"中控设置\\bg.png",0,0,1,-1,0);
	pngs[1].setValues(null,"中控设置\\选中.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[3].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[21];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("L0",9,73,420,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("L1",9,125,420,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("L2",9,177,420,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("L3",9,229,420,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("L4",9,281,420,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("L5",9,333,420,30,0x00ffffff,10,0,0,0);
	texts[6].setValues("L6",9,385,420,30,0x00ffffff,10,0,0,0);
	texts[7].setValues("L7",9,437,420,30,0x00ffffff,10,0,0,0);
	texts[8].setValues("V0",472,75,149,28,0x00ffffff,10,0,0,0);
	texts[9].setValues("V1",472,127,149,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("V2",472,179,149,28,0x00ffffff,10,0,0,0);
	texts[11].setValues("V3",472,231,149,28,0x00ffffff,10,0,0,0);
	texts[12].setValues("V4",472,283,149,28,0x00ffffff,10,0,0,0);
	texts[13].setValues("V5",472,335,149,28,0x00ffffff,10,0,0,0);
	texts[14].setValues("V6",472,387,149,28,0x00ffffff,10,0,0,0);
	texts[15].setValues("V7",472,439,149,28,0x00ffffff,10,0,0,0);
	texts[16].setValues("返回",714,87,80,28,0x00ffffff,10,0,0,0);
	texts[17].setValues("恢复默",712,163,80,28,0x00ffffff,10,0,0,0);
	texts[18].setValues("认设置",713,194,80,28,0x00ffffff,10,0,0,0);
	texts[19].setValues("上一页",711,342,80,28,0x00ffffff,10,0,0,0);
	texts[20].setValues("下一页",709,424,80,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
