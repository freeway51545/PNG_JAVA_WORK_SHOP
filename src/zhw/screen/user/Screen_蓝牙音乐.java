package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_¿∂—¿“Ù¿÷ extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[20];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[20];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"¿∂—¿“Ù¿÷\\–¬µƒ¿∂—¿“Ù¿÷.png",0,0,1,-1,0);
	pngs[1].setValues(null,"πÿ∆¡”Î∑µªÿ\\∑µªÿ.png",652,2,1,-1,0);
	pngs[2].setValues("∑µªÿ¿∂—¿","πÿ∆¡”Î∑µªÿ\\∑µªÿ1.png",651,1,0,-1,0);
	pngs[3].setValues(null,"πÿ∆¡”Î∑µªÿ\\πÿ∆¡1.png",139,500,1,-1,0);
	pngs[4].setValues("πÿ∆¡","πÿ∆¡”Î∑µªÿ\\πÿ∆¡2.png",210,497,0,-1,0);
	pngs[5].setValues(null,"πÿ∆¡”Î∑µªÿ\\÷˜“≥.png",0,-1,1,-1,0);
	pngs[6].setValues("÷˜ΩÁ√Ê","πÿ∆¡”Î∑µªÿ\\÷˜“≥1.png",0,-1,0,-1,0);
	pngs[7].setValues(null,"pub\\∑µªÿ≤¢ÕÀ≥ˆ.png",744,0,1,-1,0);
	pngs[8].setValues("πÿ±’","pub\\∑µªÿ≤¢ÕÀ≥ˆ1.png",745,0,0,-1,0);
	pngs[9].setValues(null,"¿∂—¿“Ù¿÷\\—›≥™’ﬂ.png",338,218,1,-1,0);
	pngs[10].setValues(null,"¿∂—¿“Ù¿÷\\◊®º≠.png",341,291,1,-1,0);
	pngs[11].setValues(null,"¿∂—¿“Ù¿÷\\«˙ƒø.png",335,147,1,-1,0);
	pngs[12].setValues(null,"¿∂—¿“Ù¿÷\\“Ù¿÷Õº±Í.png",47,138,1,-1,0);
	pngs[13].setValues(null,"¿∂—¿“Ù¿÷\\øÚº‹.png",0,-1,1,-1,0);
	pngs[14].setValues("ST","¿∂—¿“Ù¿÷\\¿∂—¿“Ù¿÷≤•∑≈.png",41,93,7,-1,0);
	pngs[15].setValues("SP","¿∂—¿“Ù¿÷\\¿∂—¿“Ù¿÷Õ£÷π.png",42,93,7,-1,0);
	pngs[16].setValues("UC","¿∂—¿“Ù¿÷\\¿∂—¿“Ù¿÷Œ¥¡¨Ω”.png",34,93,7,-1,0);
	pngs[17].setValues("…œ“ª«˙","¿∂—¿“Ù¿÷\\…œ“ª«˙.png",149,413,0,-1,0);
	pngs[18].setValues("œ¬“ª«˙","¿∂—¿“Ù¿÷\\œ¬“ª«˙.png",591,413,0,-1,0);
	pngs[19].setValues("≤•∑≈","¿∂—¿“Ù¿÷\\≤•∑≈.png",371,412,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("≤•∑≈◊¥Ã¨",13,58,100,24,0x00ffffff,40,0,0,0);
	texts[1].setValues("Ω¯∂»",55,342,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("◊‹≥§",667,343,100,23,0x00ffffff,10,0,0,0);
	texts[3].setValues("±ÍÃ‚",405,158,350,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("—›≥™’ﬂ",410,236,350,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("◊®º≠",412,306,350,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
