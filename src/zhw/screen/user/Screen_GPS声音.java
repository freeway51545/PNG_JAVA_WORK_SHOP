package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_GPS���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[12];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"GPS����\\�µ�GPS����.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"GPS����\\�µ�GPS����2.png",0,0,8,-1,0);
	pngs[3].setValues("��","GPS����\\GPS����ѡ��.png",48,96,7,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[5].setValues("���ز���","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[7].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[12];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("GPSTXT",737,91,30,29,0x00ffffff,10,0,0,0);
	texts[1].setValues("DVDTXT",737,156,30,26,0x00ffffff,10,0,0,0);
	texts[2].setValues("AUXTXT",737,220,30,26,0x00ffffff,10,0,0,0);
	texts[3].setValues("������TXT",735,284,30,29,0x00ffffff,10,0,0,0);
	texts[4].setValues("����TXT",735,349,30,26,0x00ffffff,10,0,0,0);
	texts[5].setValues("��������TXT",737,411,30,29,0x00ffffff,10,0,0,0);
	texts[6].setValues("GPS��������",75,95,220,27,0x00ffffff,10,0,0,0);
	texts[7].setValues("DVD",66,157,220,27,0x00ffffff,10,0,0,0);
	texts[8].setValues("AUX",63,220,220,27,0x00ffffff,10,0,0,0);
	texts[9].setValues("������",65,287,220,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("����",59,349,220,27,0x00ffffff,10,0,0,0);
	texts[11].setValues("��������",64,413,220,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
