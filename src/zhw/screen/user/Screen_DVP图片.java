package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVPͼƬ extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[18];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[8];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[18];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVPͼƬ\\DVP_PIC.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVPͼƬ\\DVP_PIC1.png",0,0,8,-1,0);
	pngs[2].setValues("NUM","���ֲ���\\��Ŀ��.PNG",50,4,1,-1,0);
	pngs[3].setValues(null,"�����뷵��\\����.png",653,1,1,-1,0);
	pngs[4].setValues("�����б�","�����뷵��\\����1.png",652,2,0,-1,0);
	pngs[5].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[6].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[7].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[8].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[9].setValues("����ͼ��","���ſ���ͼ��\\����.png",185,18,7,-1,0);
	pngs[10].setValues("��ͣͼ��","���ſ���ͼ��\\��ͣ.png",184,17,7,-1,0);
	pngs[11].setValues("��ֹͼ��","���ſ���ͼ��\\��ֹ.png",5,54,7,-1,0);
	pngs[12].setValues("���ͼ��","���ſ���ͼ��\\Random.png",514,16,7,-1,0);
	pngs[13].setValues("�����ͼ��","���ſ���ͼ��\\Random_disable.png",514,16,7,-1,0);
	pngs[14].setValues("�ظ���ͼ��","���ſ���ͼ��\\Repeat_off.png",447,15,7,-1,0);
	pngs[15].setValues("�����ظ�ͼ��","���ſ���ͼ��\\Repeat_One.png",447,16,7,-1,0);
	pngs[16].setValues("�ظ�����ͼ��","���ſ���ͼ��\\Repeat_All.png",448,16,7,-1,0);
	pngs[17].setValues("ֹͣͼ��","���ſ���ͼ��\\ֹͣ.png",184,17,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[8];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("ý������",334,16,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("��Ŀ����",96,20,80,20,0x00ffffff,10,0,0,0);
	texts[2].setValues("Ŀ¼����",563,482,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("����״̬",138,489,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("�ظ�ģʽ",547,52,150,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("���ģʽ",702,51,80,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("����״̬",568,20,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("�ļ�����",230,19,100,20,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
