package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_��ʾ���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��ʾ����\\�µ���ʾ����.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��ʾ����\\�µ���ʾ����1.png",0,0,8,-1,0);
	pngs[3].setValues("����","��ʾ����\\����.png",430,501,0,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[5].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[7].setValues("��������","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[8].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[9].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("1#",659,286,50,27,0x00ffffff,10,0,0,0);
	texts[1].setValues("����",98,515,100,35,0x00ffffff,10,0,0,0);
	texts[2].setValues("���",286,491,100,35,0x00ffffff,10,0,0,0);
	texts[3].setValues("��׼",496,497,100,35,0x00ffffff,10,0,0,0);
	texts[4].setValues("�û�",698,518,100,35,0x00ffffff,10,0,0,0);
	texts[5].setValues("��ʾ����",353,552,500,37,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
