package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_ʱ����� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[9];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[37];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[9];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"ʱ������\\�µ�ʱ������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("��","ʱ������\\��.png",885,235,0,-1,0);
	pngs[3].setValues("��","ʱ������\\��.png",886,379,0,-1,0);
	pngs[4].setValues("Y1","ʱ������\\��ɫ���.png",47,147,7,-1,0);
	pngs[5].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[6].setValues("���ز���","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[7].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[8].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[37];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("ʱ������",316,581,400,50,0x00ffffff,10,0,0,0);
	texts[1].setValues("��",46,507,80,40,0x00000001,10,0,0,0);
	texts[2].setValues("��",233,508,80,36,0x00000001,10,0,0,0);
	texts[3].setValues("��",394,509,80,38,0x00000001,10,0,0,0);
	texts[4].setValues("ʱ",563,518,80,38,0x00000001,10,0,0,0);
	texts[5].setValues("��",704,506,80,38,0x00000001,10,0,0,0);
	texts[6].setValues("ʱ��",553,575,80,33,0x00000001,10,0,0,0);
	texts[7].setValues("��1",80,180,80,29,0x00ffffff,10,0,0,0);
	texts[8].setValues("��1",207,180,80,29,0x00ffffff,10,0,0,0);
	texts[9].setValues("��1",310,180,80,29,0x00ffffff,10,0,0,0);
	texts[10].setValues("ʱ1",408,180,80,29,0x00ffffff,10,0,0,0);
	texts[11].setValues("��1",510,180,80,29,0x00ffffff,10,0,0,0);
	texts[12].setValues("ʱ��1",605,180,80,29,0x00ffffff,10,0,0,0);
	texts[13].setValues("��2",80,226,80,29,0x00ffffff,10,0,0,0);
	texts[14].setValues("��2",207,226,80,29,0x00ffffff,10,0,0,0);
	texts[15].setValues("��2",310,226,80,29,0x00ffffff,10,0,0,0);
	texts[16].setValues("ʱ2",408,226,80,29,0x00ffffff,10,0,0,0);
	texts[17].setValues("��2",510,226,80,29,0x00ffffff,10,0,0,0);
	texts[18].setValues("ʱ��2",605,226,80,29,0x00ffffff,10,0,0,0);
	texts[19].setValues("��3",80,279,80,29,0x00ffffff,10,0,0,0);
	texts[20].setValues("��3",207,279,80,29,0x00ffffff,10,0,0,0);
	texts[21].setValues("��3",310,279,80,29,0x00ffffff,10,0,0,0);
	texts[22].setValues("ʱ3",408,279,80,29,0x00ffffff,10,0,0,0);
	texts[23].setValues("��3",510,279,80,29,0x00ffffff,10,0,0,0);
	texts[24].setValues("ʱ��3",605,279,80,29,0x00ffffff,10,0,0,0);
	texts[25].setValues("��4",80,336,80,29,0x00ffffff,10,0,0,0);
	texts[26].setValues("��4",207,336,80,29,0x00ffffff,10,0,0,0);
	texts[27].setValues("��4",310,336,80,29,0x00ffffff,10,0,0,0);
	texts[28].setValues("ʱ4",408,336,80,29,0x00ffffff,10,0,0,0);
	texts[29].setValues("��4",510,336,80,29,0x00ffffff,10,0,0,0);
	texts[30].setValues("ʱ��4",605,336,80,29,0x00ffffff,10,0,0,0);
	texts[31].setValues("��5",80,387,80,29,0x00ffffff,10,0,0,0);
	texts[32].setValues("��5",207,387,80,29,0x00ffffff,10,0,0,0);
	texts[33].setValues("��5",310,387,80,29,0x00ffffff,10,0,0,0);
	texts[34].setValues("ʱ5",408,387,80,29,0x00ffffff,10,0,0,0);
	texts[35].setValues("��5",510,387,80,29,0x00ffffff,10,0,0,0);
	texts[36].setValues("ʱ��5",605,387,80,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
