package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP_VCD extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[19];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[10];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[19];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP_VCD\\VCD.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP_VCD\\VCD1.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("�����淵��","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"pub\\���ز��˳�.png",745,0,1,-1,0);
	pngs[5].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[6].setValues(null,"DVP_����ͼ��\\������0.png",130,368,1,-1,0);
	pngs[7].setValues("������","DVP_����ͼ��\\������.png",137,375,7,-1,0);
	pngs[8].setValues("����ͼ��","���ſ���ͼ��\\����.png",190,15,7,-1,0);
	pngs[9].setValues("��ͣͼ��","���ſ���ͼ��\\��ͣ.png",187,15,7,-1,0);
	pngs[10].setValues("��ֹͼ��","���ſ���ͼ��\\��ֹ.png",11,57,7,-1,0);
	pngs[11].setValues("�½�ͼ��","���ſ���ͼ��\\�½�.png",59,19,7,-1,0);
	pngs[12].setValues("���ͼ��","���ſ���ͼ��\\Random.png",656,17,7,-1,0);
	pngs[13].setValues("�����ͼ��","���ſ���ͼ��\\Random_disable.png",656,17,7,-1,0);
	pngs[14].setValues("�ظ���ͼ��","���ſ���ͼ��\\Repeat_off.png",548,15,7,-1,0);
	pngs[15].setValues("�����ظ�ͼ��","���ſ���ͼ��\\Repeat_One.png",550,15,7,-1,0);
	pngs[16].setValues("�ظ�����ͼ��","���ſ���ͼ��\\Repeat_All.png",547,15,7,-1,0);
	pngs[17].setValues("�ļ���ͼ��","���ſ���ͼ��\\�ļ���.png",69,59,7,-1,0);
	pngs[18].setValues("ֹͣͼ��","���ſ���ͼ��\\ֹͣ.png",189,16,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[10];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����ʱ��",42,371,120,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("ý������",352,14,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("��Ŀ����",94,19,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("PBC״̬",261,20,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("����״̬",168,19,80,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("�ظ�ģʽ",536,18,120,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("���ģʽ",649,18,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("����״̬",451,19,80,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("����ʱ��",671,371,120,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("�г�˵��",323,168,220,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
