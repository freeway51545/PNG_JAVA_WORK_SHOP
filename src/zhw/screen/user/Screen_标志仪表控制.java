package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_��־�Ǳ���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[4];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[9];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[4];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("����","�Ǳ����\\bg.png",0,0,1,-1,0);
	pngs[1].setValues("ѡ��","�Ǳ����\\ѡ��.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[9];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������:",77,79,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("����_VALUE",171,79,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("Ƶ��:",449,79,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("Ƶ��_VALUE",521,79,160,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("ģʽ",107,267,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("��ɫ",614,265,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("�˵�",98,415,80,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("�˳�",614,412,80,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("OK",360,340,80,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
