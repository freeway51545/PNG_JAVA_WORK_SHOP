package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�µ绰�� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[25];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[25];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"����ͨ����¼\\ͨ����¼.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BAR","����ͨ����¼\\�����.png",158,119,7,-1,0);
	pngs[3].setValues("BT��ʾ","����ͨ����¼\\������ʾ��.png",300,151,7,-1,0);
	pngs[4].setValues("��¼��","����ͨ����¼\\ͨ����¼��.png",135,93,7,-1,0);
	pngs[5].setValues("ͨѶ¼","����ͨ����¼\\ͨѶ¼.png",219,412,0,-1,0);
	pngs[6].setValues("����","����ͨ����¼\\����.png",75,412,0,-1,0);
	pngs[7].setValues("��������","����ͨ����¼\\��������.png",664,412,0,-1,0);
	pngs[8].setValues("�绰��","����ͨ����¼\\�绰��.png",370,412,0,-1,0);
	pngs[9].setValues("����","����ͨ����¼\\����.png",519,412,0,-1,0);
	pngs[10].setValues("�绰������","����ͨ����¼\\�绰������.png",370,412,0,-1,0);
	pngs[11].setValues(null,"����ͨ����¼\\�绰��\\�绰��1.png",1,89,1,-1,0);
	pngs[12].setValues("���","����ͨ����¼\\�绰��\\���.png",28,199,0,-1,0);
	pngs[13].setValues("����","����ͨ����¼\\�绰��\\����.png",28,285,0,-1,0);
	pngs[14].setValues("����","����ͨ����¼\\�绰��\\����.png",28,111,0,-1,0);
	pngs[15].setValues("������","����ͨ����¼\\��������\\������.png",413,195,7,-1,0);
	pngs[16].setValues("����ʧ��","����ͨ����¼\\��������\\����ʧ��.png",413,195,7,-1,0);
	pngs[17].setValues("������","����ͨ����¼\\��������\\������.png",413,195,7,-1,0);
	pngs[18].setValues("����ͬ��","����ͨ����¼\\��������\\����ͬ��.png",413,195,7,-1,0);
	pngs[19].setValues("��ǰ�޼�¼","����ͨ����¼\\��������\\��ǰ�޼�¼.png",413,195,7,-1,0);
	pngs[20].setValues("�豸δ����","����ͨ����¼\\��������\\�豸δ����.png",413,195,7,-1,0);
	pngs[21].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[22].setValues("����","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[23].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[24].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("R1",163,127,580,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("R2",161,173,580,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("R3",162,219,580,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("R4",161,263,580,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("R5",164,307,580,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("INFO",299,57,580,35,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
