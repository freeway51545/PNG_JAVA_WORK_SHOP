package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_ͼƬԤ�� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[11];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"Ԥ��ͼƬ\\��Ԥ��ͼƬ.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"Ԥ��ͼƬ\\��Ԥ��ͼƬ1.png",0,0,8,-1,0);
	pngs[3].setValues("SD","Ԥ��ͼƬ\\SD����.png",445,414,7,-1,0);
	pngs[4].setValues("SYS","Ԥ��ͼƬ\\ϵͳ����.png",252,414,7,-1,0);
	pngs[5].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[6].setValues("����","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[8].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[11];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������",279,535,400,39,0x00ffffff,10,0,0,0);
	texts[1].setValues("ѡ��",596,554,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("SDͼƬ",250,546,100,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("ɾ��",326,567,150,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("ϵͳͼƬ",474,530,110,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("����ͼƬ",261,532,150,18,0x00ffffff,10,0,0,0);
	texts[6].setValues("��ɱ���",586,508,150,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("��������",416,527,150,22,0x00ffffff,10,0,0,0);
	texts[8].setValues("��һҳ",326,538,100,30,0x00ffffff,10,0,0,0);
	texts[9].setValues("��һҳ",53,524,100,30,0x00ffffff,10,0,0,0);
	texts[10].setValues("��ʾ��Ϣ",257,192,360,36,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
