package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_»Ìº¸≈Ã extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[2];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[2];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("»Ìº¸≈Ã±≥æ∞","»Ìº¸≈Ã\\bg.png",0,0,1,-1,0);
	pngs[1].setValues("»Ìº¸≈Ã—°÷–","»Ìº¸≈Ã\\—°÷–.png",0,0,8,-1,0);
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
