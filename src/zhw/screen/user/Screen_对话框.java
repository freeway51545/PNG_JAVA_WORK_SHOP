package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�Ի��� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[5];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[2];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[5];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("BK","�Ի���\\�Ի���.png",175,109,7,-1,0);
	pngs[1].setValues("OK","�Ի���\\ȷ��.png",237,364,0,-1,0);
	pngs[2].setValues("CANCEL","�Ի���\\ȡ��.png",523,359,0,-1,0);
	pngs[3].setValues("FXP","�Ի���\\�������.png",221,220,7,-1,0);
	pngs[4].setValues("TH","�Ի���\\������.png",221,220,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[2];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("T1",142,504,400,33,0x00ffffff,10,0,0,0);
	texts[1].setValues("T2",250,523,400,33,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
