package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"����ͨ����¼\\����\\����.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"����ͨ����¼\\����\\����1.png",0,0,8,-1,0);
	pngs[3].setValues("BAR","����ͨ����¼\\�����.png",104,138,7,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[5].setValues("����","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[7].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("R1",106,147,580,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("R2",107,193,580,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("TXT",136,78,550,38,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
