package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��������\\bg2.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��������\\ѡ��2.png",0,0,8,-1,0);
	pngs[3].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[4].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[5].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[6].setValues("��������","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[8].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("ȷ��",180,426,120,30,0x00ffffff,40,0,0,0);
	texts[1].setValues("��һҳ",21,426,120,30,0x00ffffff,40,0,0,0);
	texts[2].setValues("��һҳ",342,426,120,30,0x00ffffff,40,0,0,0);
	texts[3].setValues("����ѡ��",162,559,600,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("SD��",662,426,120,30,0x00ffffff,40,0,0,0);
	texts[5].setValues("ϵͳ����",502,426,120,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
