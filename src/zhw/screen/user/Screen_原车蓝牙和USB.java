package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_ԭ��������USB extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[4];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[12];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[4];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("����","ԭ��������USB\\bg.png",0,0,1,-1,0);
	pngs[1].setValues("ѡ��","ԭ��������USB\\ѡ��.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[12];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������:",77,79,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("����_VALUE",171,79,150,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("USB:",554,79,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("USB_VALUE",638,79,150,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("��",96,192,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("�ر�",264,192,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("����Ŀ:",77,124,80,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("����Ŀ_VALUE",171,124,150,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("��ǰ��:",333,124,80,28,0x00ffffff,10,0,0,0);
	texts[9].setValues("��ǰ��_VALUE",425,124,150,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("ʱ��:",554,124,80,28,0x00ffffff,10,0,0,0);
	texts[11].setValues("ʱ��_VALUE",638,124,150,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
