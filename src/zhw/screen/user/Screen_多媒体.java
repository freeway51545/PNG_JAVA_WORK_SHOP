package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_��ý�� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[29];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[11];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[29];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"������\\�µĸ�����.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BUTTON","������\\������.png",0,0,8,-1,0);
	pngs[3].setValues("L1","������\\���ĵ��.png",89,55,7,-1,0);
	pngs[4].setValues("L2","������\\���ĵ��.png",89,123,7,-1,0);
	pngs[5].setValues("L3","������\\���ĵ��.png",88,193,7,-1,0);
	pngs[6].setValues("L4","������\\���ĵ��.png",89,261,7,-1,0);
	pngs[7].setValues("L5","������\\���ĵ��.png",88,332,7,-1,0);
	pngs[8].setValues("����BEGIN","������\\�������.png",20,123,7,-1,0);
	pngs[9].setValues("����","������\\�������.png",20,213,7,-1,0);
	pngs[10].setValues("����END","������\\�������.png",20,290,7,-1,0);
	pngs[11].setValues(null,"������\\��ͣ.png",730,112,7,-1,0);
	pngs[12].setValues(null,"������\\����.png",722,52,7,-1,0);
	pngs[13].setValues("��Ӱ","USB\\��Ӱ.png",92,59,7,-1,0);
	pngs[14].setValues("�����ļ���","USB\\�����ļ���.png",98,299,7,-1,0);
	pngs[15].setValues("�����ļ���1","USB\\�����ļ���1.png",97,339,7,-1,0);
	pngs[16].setValues("��Ӱ�ļ���","USB\\��Ӱ�ļ���.png",95,133,7,-1,0);
	pngs[17].setValues("��Ӱ�ļ���1","USB\\��Ӱ�ļ���1.png",97,339,7,-1,0);
	pngs[18].setValues("����1","USB\\����1.png",92,193,7,-1,0);
	pngs[19].setValues("��Ӱ1","USB\\��Ӱ2.png",95,260,7,-1,0);
	pngs[20].setValues("����","USB\\����.png",247,273,7,-1,0);
	pngs[21].setValues(null,"USB\\������0.png",33,569,1,-1,0);
	pngs[22].setValues("������","USB\\������.png",51,579,7,-1,0);
	pngs[23].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[24].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[25].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[26].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[27].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[28].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[11];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("�ļ�1",142,69,800,25,0x00ffffff,10,0,0,0);
	texts[1].setValues("�ļ�2",146,129,800,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("�ļ�3",146,198,800,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("�ļ�4",143,264,800,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ļ�5",138,350,800,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("�ļ�6",155,512,800,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("�ļ�7",135,553,800,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("ʱ��",337,515,100,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("����",79,10,650,30,0x0000ff00,10,0,0,0);
	texts[9].setValues("�ļ�����",539,499,250,18,0x00ffffff,10,0,0,0);
	texts[10].setValues("��Ŀ����",585,378,250,19,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
