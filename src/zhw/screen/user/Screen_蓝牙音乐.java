package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[20];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[20];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��������\\�µ���������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�����뷵��\\����.png",652,2,1,-1,0);
	pngs[2].setValues("��������","�����뷵��\\����1.png",651,1,0,-1,0);
	pngs[3].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[4].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[5].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[6].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[7].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[8].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[9].setValues(null,"��������\\�ݳ���.png",338,218,1,-1,0);
	pngs[10].setValues(null,"��������\\ר��.png",341,291,1,-1,0);
	pngs[11].setValues(null,"��������\\��Ŀ.png",335,147,1,-1,0);
	pngs[12].setValues(null,"��������\\����ͼ��.png",47,138,1,-1,0);
	pngs[13].setValues(null,"��������\\���.png",0,-1,1,-1,0);
	pngs[14].setValues("ST","��������\\�������ֲ���.png",41,93,7,-1,0);
	pngs[15].setValues("SP","��������\\��������ֹͣ.png",42,93,7,-1,0);
	pngs[16].setValues("UC","��������\\��������δ����.png",34,93,7,-1,0);
	pngs[17].setValues("��һ��","��������\\��һ��.png",149,413,0,-1,0);
	pngs[18].setValues("��һ��","��������\\��һ��.png",591,413,0,-1,0);
	pngs[19].setValues("����","��������\\����.png",371,412,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����״̬",13,58,100,24,0x00ffffff,40,0,0,0);
	texts[1].setValues("����",55,342,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("�ܳ�",667,343,100,23,0x00ffffff,10,0,0,0);
	texts[3].setValues("����",405,158,350,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ݳ���",410,236,350,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("ר��",412,306,350,28,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
