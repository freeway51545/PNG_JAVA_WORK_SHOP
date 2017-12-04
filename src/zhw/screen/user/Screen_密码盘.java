package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_√‹¬Î≈Ã extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[2];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[2];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("MM","√‹¬Î—È÷§\\√‹¬ÎŒ¥µ„ª˜.png",0,0,1,-1,0);
	pngs[1].setValues(null,"√‹¬Î—È÷§\\√‹¬Îµ„ª˜.png",0,0,8,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("T1",273,24,400,44,0x00ffffff,10,0,0,0);
	texts[1].setValues("T2",273,88,400,44,0x00ffffff,10,0,0,0);
	texts[2].setValues("√‹¬Î",166,173,400,39,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
