package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_��Ƶ���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[16];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��Ƶ����\\�µ���Ƶ����.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��Ƶ����\\�µ���Ƶ����1.png",0,0,8,-1,0);
	pngs[3].setValues("����","��Ƶ����\\����.png",372,96,0,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[5].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\����.png",725,2,1,-1,0);
	pngs[7].setValues("���ذ�ť","�����뷵��\\����1.png",724,2,0,-1,0);
	pngs[8].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[9].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[16];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��Ƶ����",272,581,400,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("����",38,526,80,26,0x00ffffff,10,0,0,0);
	texts[2].setValues("ҡ��",230,513,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("��ʿ",344,516,80,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ŵ�",472,519,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("��׼",606,517,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("ǰ",380,601,40,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("��",558,585,40,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("��",466,571,40,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("��",669,557,40,20,0x00ffffff,10,0,0,0);
	texts[10].setValues("����",247,412,85,18,0x00ffffff,10,0,0,0);
	texts[11].setValues("����",74,412,85,18,0x00ffffff,10,0,0,0);
	texts[12].setValues("����",165,412,85,18,0x00ffffff,10,0,0,0);
	texts[13].setValues("���",327,412,100,18,0x00ffffff,10,0,0,0);
	texts[14].setValues("���Ƶ��",414,412,100,18,0x00ffffff,10,0,0,0);
	texts[15].setValues("���Ƶ��VALUE",263,509,100,16,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
