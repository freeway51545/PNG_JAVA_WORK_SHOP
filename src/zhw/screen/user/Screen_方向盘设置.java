package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_���������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[27];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[22];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[27];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[1].setValues(null,"����������\\�µķ���������.png",0,0,1,-1,0);
	pngs[2].setValues(null,"����������\\�µķ���������1.png",0,0,8,-1,0);
	pngs[3].setValues("��λ_K","����������\\����OK.png",334,525,0,-1,0);
	pngs[4].setValues("��Ƶ_K","����������\\��Ƶ.png",730,142,0,-1,0);
	pngs[5].setValues("ȷ��_K","����������\\����OK.png",333,419,0,-1,0);
	pngs[6].setValues("����_K","����������\\����.png",134,225,0,-1,0);
	pngs[7].setValues("������_K","����������\\������.png",331,228,0,-1,0);
	pngs[8].setValues("������_K","����������\\������.png",529,230,0,-1,0);
	pngs[9].setValues("��Դ_K","����������\\��Դ.png",135,141,0,-1,0);
	pngs[10].setValues("ģʽ_K","����������\\ģʽ.png",531,141,0,-1,0);
	pngs[11].setValues("��һ��_K","����������\\��һ��.png",133,316,0,-1,0);
	pngs[12].setValues("��һ��_K","����������\\��һ��.png",334,317,0,-1,0);
	pngs[13].setValues("����_K","����������\\����.png",733,232,0,-1,0);
	pngs[14].setValues("��绰_K","����������\\��绰.png",529,318,0,-1,0);
	pngs[15].setValues("����_K","����������\\����.png",132,399,0,-1,0);
	pngs[16].setValues("DVD_K","����������\\DVD.png",331,140,0,-1,0);
	pngs[17].setValues("�ҵ绰_K","����������\\�ҵ绰.png",731,317,0,-1,0);
	pngs[18].setValues("��ǰ����","����������\\��ǰ����.png",144,123,7,-1,0);
	pngs[19].setValues("��ʾ1","����������\\��ʾ1.png",503,418,7,-1,0);
	pngs[20].setValues("��ʾ2","����������\\��ʾ2.png",463,431,7,-1,0);
	pngs[21].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[22].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[23].setValues(null,"�����뷵��\\����.png",677,1,1,-1,0);
	pngs[24].setValues("���ذ�ť","�����뷵��\\����1.png",677,0,0,-1,0);
	pngs[25].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[26].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[22];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����������",101,700,600,36,0x00ffffff,10,0,0,0);
	texts[1].setValues("��λ",52,499,100,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("���",190,498,100,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("ȷ��",319,502,100,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("����",436,502,100,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("����",219,591,100,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("������",376,578,100,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("������",618,507,100,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("��Դ",630,575,100,28,0x00ffffff,10,0,0,0);
	texts[9].setValues("��һ��",40,555,100,28,0x00ffffff,10,0,0,0);
	texts[10].setValues("��һ��",584,532,100,28,0x00ffffff,10,0,0,0);
	texts[11].setValues("����",443,519,100,28,0x00ffffff,10,0,0,0);
	texts[12].setValues("ģʽ",525,581,100,28,0x00ffffff,10,0,0,0);
	texts[13].setValues("��绰",308,555,100,28,0x00ffffff,10,0,0,0);
	texts[14].setValues("����",479,520,100,28,0x00ffffff,10,0,0,0);
	texts[15].setValues("DVD",626,496,100,28,0x00ffffff,10,0,0,0);
	texts[16].setValues("�Ҷ�",723,542,100,28,0x00ffffff,10,0,0,0);
	texts[17].setValues("V1",114,74,100,28,0x00ffffff,10,0,0,0);
	texts[18].setValues("V2",268,75,100,28,0x00ffffff,10,0,0,0);
	texts[19].setValues("V3",424,74,100,28,0x00ffffff,10,0,0,0);
	texts[20].setValues("V4",588,77,100,28,0x00ffffff,10,0,0,0);
	texts[21].setValues("V5",266,352,400,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
