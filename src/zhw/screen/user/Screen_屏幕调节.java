package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_��Ļ���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[3];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[7];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[3];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��Ļ����\\screen.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��Ļ����\\screen1.png",0,0,8,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[7];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("NUM1",364,87,80,25,0x00ffffff,10,0,0,0);
	texts[1].setValues("NUM2",364,154,80,25,0x00ffffff,10,0,0,0);
	texts[2].setValues("NUM3",364,229,80,25,0x00ffffff,10,0,0,0);
	texts[3].setValues("NUM4",362,300,80,25,0x00ffffff,10,0,0,0);
	texts[4].setValues("Ĭ��",540,369,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("����",674,368,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("����",404,367,80,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
