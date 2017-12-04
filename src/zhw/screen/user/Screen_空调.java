package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_空调 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[26];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[5];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[26];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("BACK","空调\\backg.png",0,0,7,-1,0);
	pngs[1].setValues("1","空调\\1.png",416,450,7,-1,0);
	pngs[2].setValues("2","空调\\2.png",439,445,7,-1,0);
	pngs[3].setValues("3","空调\\3.png",461,440,7,-1,0);
	pngs[4].setValues("4","空调\\4.png",483,435,7,-1,0);
	pngs[5].setValues("5","空调\\5.png",505,429,7,-1,0);
	pngs[6].setValues("6","空调\\6.png",527,424,7,-1,0);
	pngs[7].setValues("7","空调\\7.png",550,416,7,-1,0);
	pngs[8].setValues("DUAL","空调\\DUAL.png",170,358,7,-1,0);
	pngs[9].setValues("上","空调\\shang.png",283,336,7,-1,0);
	pngs[10].setValues("右","空调\\bal.png",305,372,7,-1,0);
	pngs[11].setValues("下","空调\\xia.png",290,386,7,-1,0);
	pngs[12].setValues("RL","空调\\RL.png",279,449,7,-1,0);
	pngs[13].setValues("CAR","空调\\car.png",396,356,7,-1,0);
	pngs[14].setValues("AUTO","空调\\AUTO.png",492,380,7,-1,0);
	pngs[15].setValues("AL","空调\\AL.png",539,376,7,-1,0);
	pngs[16].setValues("AB","空调\\AB.png",560,370,7,-1,0);
	pngs[17].setValues("AQS","空调\\AQS.png",430,363,7,-1,0);
	pngs[18].setValues("内部循环","空调\\inner.png",434,363,7,-1,0);
	pngs[19].setValues("外循环","空调\\out.png",403,357,7,-1,0);
	pngs[20].setValues("LEFT","空调\\left.png",24,417,7,-1,0);
	pngs[21].setValues("RIGHT","空调\\right.png",690,417,7,-1,0);
	pngs[22].setValues("A/C","空调\\AC.png",632,353,7,-1,0);
	pngs[23].setValues("MAX","空调\\MAX.png",175,423,7,-1,0);
	pngs[24].setValues("WIND","空调\\wind.png",609,423,7,-1,0);
	pngs[25].setValues("NF","空调\\NF.png",406,416,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[5];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("外部温度",645,531,100,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("左温度",4,349,90,36,0x00ffffff,10,0,0,0);
	texts[2].setValues("右温度",680,351,90,36,0x00ffffff,10,0,0,0);
	texts[3].setValues("左数字",81,441,50,24,0x00ffffff,10,0,0,0);
	texts[4].setValues("右数字",745,441,50,24,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
