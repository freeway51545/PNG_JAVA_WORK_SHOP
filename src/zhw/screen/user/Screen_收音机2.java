package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_������2 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[36];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[19];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[36];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"������\\������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"������\\������2.png",0,0,8,-1,0);
	pngs[3].setValues("ST����","������\\����������.png",659,82,7,-1,0);
	pngs[4].setValues("EQ","������\\EQ.png",55,81,0,-1,0);
	pngs[5].setValues("������","������\\������.png",659,82,0,-1,0);
	pngs[6].setValues("AM1","������\\AM1.png",136,169,7,-1,0);
	pngs[7].setValues("AM2","������\\AM2.png",136,169,7,-1,0);
	pngs[8].setValues("FM1","������\\FM1.png",136,169,7,-1,0);
	pngs[9].setValues("FM2","������\\FM2.png",136,169,7,-1,0);
	pngs[10].setValues("FM3","������\\FM3.png",136,169,7,-1,0);
	pngs[11].setValues("0","������\\NUM\\0.png",306,115,7,-1,0);
	pngs[12].setValues("1","������\\NUM\\1.png",247,115,7,-1,0);
	pngs[13].setValues("2","������\\NUM\\2.png",478,574,7,-1,0);
	pngs[14].setValues("3","������\\NUM\\3.png",478,574,7,-1,0);
	pngs[15].setValues("4","������\\NUM\\4.png",478,574,7,-1,0);
	pngs[16].setValues("5","������\\NUM\\5.png",478,574,7,-1,0);
	pngs[17].setValues("6","������\\NUM\\6.png",478,574,7,-1,0);
	pngs[18].setValues("7","������\\NUM\\7.png",478,574,7,-1,0);
	pngs[19].setValues("8","������\\NUM\\8.png",373,115,7,-1,0);
	pngs[20].setValues("9","������\\NUM\\9.png",472,115,7,-1,0);
	pngs[21].setValues("KHZ","������\\KHZ.png",575,168,7,-1,0);
	pngs[22].setValues("MHZ","������\\MHZ.png",576,168,7,-1,0);
	pngs[23].setValues("��","������\\NUM\\dian.png",438,110,7,-1,0);
	pngs[24].setValues("ST����1","������\\ST����.png",482,498,7,-1,0);
	pngs[25].setValues("�����","������\\�����1.png",579,139,7,-1,0);
	pngs[26].setValues("LL","������\\���.png",154,131,7,-1,0);
	pngs[27].setValues("SS","������\\����.png",154,130,7,-1,0);
	pngs[28].setValues(null,"������\\�����.png",715,530,1,-1,0);
	pngs[29].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[30].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[31].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[32].setValues("���ذ�ť","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[33].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[34].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[35].setValues("Զ��FLAG","������\\Զ���̸���.png",167,386,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[19];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("FM_MAIN",274,156,250,53,0x00ffffff,40,0,0,0);
	texts[1].setValues("C1",36,285,90,34,0x00ffffff,40,0,0,0);
	texts[2].setValues("C2",164,285,90,34,0x00ffffff,40,0,0,0);
	texts[3].setValues("C3",292,285,90,34,0x00ffffff,40,0,0,0);
	texts[4].setValues("C4",421,285,90,34,0x00ffffff,40,0,0,0);
	texts[5].setValues("C5",549,285,90,34,0x00ffffff,40,0,0,0);
	texts[6].setValues("C6",677,285,90,34,0x00ffffff,40,0,0,0);
	texts[7].setValues("������",166,541,90,19,0x00ffffff,40,0,0,0);
	texts[8].setValues("ST",143,88,80,22,0x00ffffff,40,0,0,0);
	texts[9].setValues("ҳ��",349,510,90,24,0x00ffffff,40,0,0,0);
	texts[10].setValues("PL_MIN",141,132,90,24,0x00ffffff,40,0,0,0);
	texts[11].setValues("PL_MAX",504,532,90,24,0x00ffffff,40,0,0,0);
	texts[12].setValues("FM_MAIN_HZ",634,515,120,24,0x00ffffff,40,0,0,0);
	texts[13].setValues("��������",47,459,65,18,0x00ffffff,40,0,0,0);
	texts[14].setValues("Զ����",177,459,65,18,0x00ffffff,40,0,0,0);
	texts[15].setValues("�Զ�����",305,459,65,18,0x00ffffff,40,0,0,0);
	texts[16].setValues("Ƶ��",432,459,65,18,0x00ffffff,40,0,0,0);
	texts[17].setValues("���",570,459,65,18,0x00ffffff,40,0,0,0);
	texts[18].setValues("��������",690,459,65,18,0x00ffffff,40,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
