package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP�ļ��б� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[28];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[7];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[28];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP�ļ��б�\\DVP_FL.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BUTTON","DVP�ļ��б�\\DVP_FL1.png",0,0,8,-1,0);
	pngs[3].setValues("L1","DVP�ļ��б�\\���ĵ��.png",90,57,7,-1,0);
	pngs[4].setValues("L2","DVP�ļ��б�\\���ĵ��.png",90,127,7,-1,0);
	pngs[5].setValues("L3","DVP�ļ��б�\\���ĵ��.png",90,198,7,-1,0);
	pngs[6].setValues("L4","DVP�ļ��б�\\���ĵ��.png",90,269,7,-1,0);
	pngs[7].setValues("L5","DVP�ļ��б�\\���ĵ��.png",90,340,7,-1,0);
	pngs[8].setValues("L6","DVP�ļ��б�\\���ĵ��.png",89,410,7,-1,0);
	pngs[9].setValues("����BEGIN","DVP�ļ��б�\\�������.png",20,154,7,-1,0);
	pngs[10].setValues("����","DVP�ļ��б�\\�������.png",19,238,7,-1,0);
	pngs[11].setValues("����END","DVP�ļ��б�\\�������.png",20,321,7,-1,0);
	pngs[12].setValues("��Ӱ","DVP�ļ��б�\\��Ӱ.png",95,144,7,-1,0);
	pngs[13].setValues("��Ӱ1","DVP�ļ��б�\\��Ӱ1.png",94,146,7,-1,0);
	pngs[14].setValues("����","DVP�ļ��б�\\����.png",94,207,7,-1,0);
	pngs[15].setValues("����1","DVP�ļ��б�\\����1.png",93,208,7,-1,0);
	pngs[16].setValues("�ļ���","DVP�ļ��б�\\�ļ���.png",95,81,7,-1,0);
	pngs[17].setValues("�ļ���1","DVP�ļ��б�\\�ļ���1.png",94,78,7,-1,0);
	pngs[18].setValues("ͼƬ","DVP�ļ��б�\\ͼƬ.png",91,283,7,-1,0);
	pngs[19].setValues("ͼƬ1","DVP�ļ��б�\\ͼƬ1.png",92,287,7,-1,0);
	pngs[20].setValues(null,"�����뷵��\\����1.png",-5,502,0,-1,0);
	pngs[21].setValues("����","�����뷵��\\����2.png",82,509,0,-1,0);
	pngs[22].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[23].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[24].setValues(null,"�����뷵��\\����.png",653,1,1,-1,0);
	pngs[25].setValues("�����б�","�����뷵��\\����1.png",652,2,0,-1,0);
	pngs[26].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[27].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[7];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("�ļ�1",156,80,550,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("�ļ�2",156,152,550,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("�ļ�3",156,220,550,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("�ļ�4",157,293,550,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ļ�5",157,358,550,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("�ļ�6",158,428,550,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("Ŀ¼",71,16,550,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
