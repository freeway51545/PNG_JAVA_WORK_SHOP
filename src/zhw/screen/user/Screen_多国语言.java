package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[6];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[6];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"����ѡ��\\����ѡ��.png",0,0,1,-1,0);
	pngs[1].setValues(null,"����ѡ��\\����ѡ��1.png",0,0,8,-1,0);
	pngs[2].setValues("OK","����ѡ��\\����ѡ��3.png",46,380,0,-1,0);
	pngs[3].setValues("CANCEL","����ѡ��\\����ѡ��3.png",414,380,0,-1,0);
	pngs[4].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[5].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("LanguageSelection",194,-2,400,50,0x00ffffff,10,0,0,0);
	texts[1].setValues("OK",118,384,400,50,0x00ffffff,10,0,0,0);
	texts[2].setValues("CANCEL",488,384,400,50,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
