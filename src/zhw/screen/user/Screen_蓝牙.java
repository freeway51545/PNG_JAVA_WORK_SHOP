package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[7];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��������\\������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��������\\������1.png",0,0,8,-1,0);
	pngs[3].setValues("BT","��������\\����.png",75,411,7,-1,0);
	pngs[4].setValues("BTC","��������\\������.png",149,103,7,-1,0);
	pngs[5].setValues("BTN","��������\\δ����.png",149,103,7,-1,0);
	pngs[6].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[7].setValues("����������","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[8].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[9].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[7];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��ʾ1",132,103,90,32,0x00ffffff,10,0,0,0);
	texts[1].setValues("��ʾ2",37,96,400,50,0x00ffffff,10,0,0,0);
	texts[2].setValues("�ֻ���",59,540,200,38,0x00ffffff,10,0,0,0);
	texts[3].setValues("��ȥ��",288,133,154,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("�绰����",64,101,350,32,0x00ffffff,10,0,0,0);
	texts[5].setValues("������ʾ",238,502,80,38,0x00ffffff,10,0,0,0);
	texts[6].setValues("INFO",38,101,500,42,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
