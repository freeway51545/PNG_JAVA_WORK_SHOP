package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[7];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[23];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[7];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��������\\bg.png",0,0,1,-1,0);
	pngs[1].setValues(null,"��������\\selected.png",0,0,8,-1,0);
	pngs[2].setValues("state","��������\\state.png",117,504,7,-1,0);
	pngs[3].setValues(null,"�����뷵��\\��ҳ.png",52,505,1,-1,0);
	pngs[4].setValues("������","�����뷵��\\��ҳ1.png",57,512,0,-1,0);
	pngs[5].setValues(null,"Ԥ��ͼƬ\\С�����ü�.png",12,2,0,-1,0);
	pngs[6].setValues("���ز���","Ԥ��ͼƬ\\С�����ü�1.png",12,2,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[23];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������",42,521,150,32,0x00ffffff,10,0,0,0);
	texts[1].setValues("��������",74,68,110,32,0x00ffffff,10,0,0,0);
	texts[2].setValues("����2",218,63,82,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("����3",317,63,82,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("8033",415,63,82,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("Э�������",598,416,140,26,0x00ffffff,10,0,0,0);
	texts[6].setValues("PAGE",627,446,82,25,0x00ffffff,10,0,0,0);
	texts[7].setValues("�����",27,183,100,32,0x00ffffff,10,0,0,0);
	texts[8].setValues("��",217,187,82,30,0x00ffffff,10,0,0,0);
	texts[9].setValues("��",316,187,82,30,0x00ffffff,10,0,0,0);
	texts[10].setValues("�Ƿ�֧�ּ�ɨ",25,311,170,32,0x00ffffff,10,0,0,0);
	texts[11].setValues("֧��",218,313,82,30,0x00ffffff,10,0,0,0);
	texts[12].setValues("��֧��",317,313,82,30,0x00ffffff,10,0,0,0);
	texts[13].setValues("����",95,426,100,35,0x00ffffff,10,0,0,0);
	texts[14].setValues("����",339,426,100,35,0x00ffffff,10,0,0,0);
	texts[15].setValues("L0",556,14,180,32,0x00ffffff,10,0,0,0);
	texts[16].setValues("L1",556,63,180,32,0x00ffffff,10,0,0,0);
	texts[17].setValues("L2",556,112,180,32,0x00ffffff,10,0,0,0);
	texts[18].setValues("L3",556,161,180,32,0x00ffffff,10,0,0,0);
	texts[19].setValues("L4",556,210,180,32,0x00ffffff,10,0,0,0);
	texts[20].setValues("L5",556,259,180,32,0x00ffffff,10,0,0,0);
	texts[21].setValues("L6",556,308,180,32,0x00ffffff,10,0,0,0);
	texts[22].setValues("L7",556,357,180,32,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
