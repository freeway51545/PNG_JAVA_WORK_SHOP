package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[23];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[9];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[23];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("back","������1\\������32-01-01.png",159,220,0,-1,0);
	pngs[1].setValues("P0","������1\\������123-07.png",228,239,0,-1,0);
	pngs[2].setValues("volIcon","������1\\����-02.png",169,224,0,-1,0);
	pngs[3].setValues("briIcon","������1\\����-05.png",164,222,0,-1,0);
	pngs[4].setValues("ST","pub\\������.png",148,3,7,-1,0);
	pngs[5].setValues("MUTE","pub\\����.png",565,319,7,-1,0);
	pngs[6].setValues("BT","pub\\��������.png",267,-2,7,-1,0);
	pngs[7].setValues("NOBT","pub\\�����Ͽ�.png",45,5,7,-1,0);
	pngs[8].setValues("BT_NOT_CONNECT","pub\\����δ����.png",16,6,7,-1,0);
	pngs[9].setValues("CALLOUT","pub\\���.png",19,288,7,-1,0);
	pngs[10].setValues("CALLOUT1","pub\\���_1.png",18,76,7,-1,0);
	pngs[11].setValues("CALLIN","pub\\���.png",20,126,7,-1,0);
	pngs[12].setValues("CALLIN1","pub\\���_1.png",19,177,7,-1,0);
	pngs[13].setValues("TALKING","pub\\ͨ����.png",15,227,7,-1,0);
	pngs[14].setValues("MUTE1","������ʾ��־\\����1.png",563,3,0,-1,0);
	pngs[15].setValues("MUTE2","������ʾ��־\\����2.png",521,5,0,-1,0);
	pngs[16].setValues("NOBT1","������ʾ��־\\�����Ͽ�.png",265,0,0,-1,0);
	pngs[17].setValues("BT1","������ʾ��־\\��������.png",256,-3,0,-1,0);
	pngs[18].setValues("ST1","������ʾ��־\\������.png",698,-2,0,-1,0);
	pngs[19].setValues("��ʾ��","��Ϣ��ʾ\\��Ϣ��.png",0,391,7,-1,0);
	pngs[20].setValues("��ʾ��Ϣ","��Ϣ��ʾ\\��Ϣ��ʾ.png",1,422,7,-1,0);
	pngs[21].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[22].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[9];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����",593,230,60,34,0x00ffffff,40,0,0,0);
	texts[1].setValues("����λ��",65,13,200,29,0x00ffffff,40,0,0,0);
	texts[2].setValues("GPS����",234,218,100,20,0x00ffffff,40,0,0,0);
	texts[3].setValues("ʱ��",297,3,130,41,0x00000001,10,0,0,0);
	texts[4].setValues("����",442,148,200,21,0x00ffffff,10,0,0,0);
	texts[5].setValues("����",454,20,200,19,0x00ffffff,10,0,0,0);
	texts[6].setValues("AMPM",439,9,100,35,0x000000ff,10,0,0,0);
	texts[7].setValues("����",614,111,100,30,0x00ffffff,40,0,0,0);
	texts[8].setValues("����",161,234,100,30,0x00ffffff,40,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
