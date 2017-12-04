package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP_FS extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[24];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[9];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[24];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP_FS\\DVP_FS.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP_FS\\DVP_FS1.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("�����淵��","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����.png",683,1,1,-1,0);
	pngs[5].setValues("�����б�","�����뷵��\\����1.png",683,0,0,-1,0);
	pngs[6].setValues(null,"pub\\���ز��˳�.png",745,0,1,-1,0);
	pngs[7].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[8].setValues(null,"DVP_����ͼ��\\������0.png",130,368,1,-1,0);
	pngs[9].setValues("������","DVP_����ͼ��\\������.png",137,375,7,-1,0);
	pngs[10].setValues("����ͼ��","���ſ���ͼ��\\����.png",249,13,7,-1,0);
	pngs[11].setValues("��ͣͼ��","���ſ���ͼ��\\��ͣ.png",245,14,7,-1,0);
	pngs[12].setValues("��ֹͼ��","���ſ���ͼ��\\��ֹ.png",7,59,7,-1,0);
	pngs[13].setValues("�½�ͼ��","���ſ���ͼ��\\�½�.png",77,16,7,-1,0);
	pngs[14].setValues("���ͼ��","���ſ���ͼ��\\Random.png",610,12,7,-1,0);
	pngs[15].setValues("�����ͼ��","���ſ���ͼ��\\Random_disable.png",609,12,7,-1,0);
	pngs[16].setValues("�ظ���ͼ��","���ſ���ͼ��\\Repeat_off.png",498,9,7,-1,0);
	pngs[17].setValues("�����ظ�ͼ��","���ſ���ͼ��\\Repeat_One.png",498,8,7,-1,0);
	pngs[18].setValues("�ظ�����ͼ��","���ſ���ͼ��\\Repeat_All.png",497,9,7,-1,0);
	pngs[19].setValues("�ļ���ͼ��","���ſ���ͼ��\\�ļ���.png",79,14,7,-1,0);
	pngs[20].setValues("ֹͣͼ��","���ſ���ͼ��\\ֹͣ.png",247,14,7,-1,0);
	pngs[21].setValues("������","���ſ���ͼ��\\������.png",650,55,7,-1,0);
	pngs[22].setValues("������","���ſ���ͼ��\\������.png",650,56,7,-1,0);
	pngs[23].setValues("������","���ſ���ͼ��\\������.png",647,56,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[9];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����ʱ��",42,371,120,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("ý������",336,12,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("��Ŀ����",121,16,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("����״̬",168,16,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ظ�ģʽ",467,16,120,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("���ģʽ",598,15,80,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("����",651,56,140,24,0x00ffffff,10,0,0,0);
	texts[7].setValues("����ʱ��",671,371,120,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("�г�˵��",323,168,220,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
