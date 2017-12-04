package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP_DVD1 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[28];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[12];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[28];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP_DVD1\\DVD-1-1.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP_DVD1\\DVD-1-2.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("�����淵��","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"�����뷵��\\����.png",683,1,1,-1,0);
	pngs[5].setValues("�����б�","�����뷵��\\����1.png",683,0,0,-1,0);
	pngs[6].setValues(null,"pub\\���ز��˳�.png",745,0,1,-1,0);
	pngs[7].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[8].setValues(null,"DVP_����ͼ��\\������0.png",130,368,1,-1,0);
	pngs[9].setValues("������","DVP_����ͼ��\\������.png",137,375,7,-1,0);
	pngs[10].setValues("����ͼ��","���ſ���ͼ��\\����.png",315,13,7,-1,0);
	pngs[11].setValues("��ͣͼ��","���ſ���ͼ��\\��ͣ.png",315,15,7,-1,0);
	pngs[12].setValues("��ֹͼ��","���ſ���ͼ��\\��ֹ.png",3,53,7,-1,0);
	pngs[13].setValues("�½�ͼ��","���ſ���ͼ��\\�½�.png",177,17,1,-1,0);
	pngs[14].setValues("���ͼ��","���ſ���ͼ��\\Random.png",545,10,7,-1,0);
	pngs[15].setValues("�����ͼ��","���ſ���ͼ��\\Random_disable.png",545,10,7,-1,0);
	pngs[16].setValues("�ظ���ͼ��","���ſ���ͼ��\\Repeat_off.png",472,11,7,-1,0);
	pngs[17].setValues("�����ظ�ͼ��","���ſ���ͼ��\\Repeat_One.png",471,11,7,-1,0);
	pngs[18].setValues("�ظ�����ͼ��","���ſ���ͼ��\\Repeat_All.png",472,10,7,-1,0);
	pngs[19].setValues("�ļ���ͼ��","���ſ���ͼ��\\�ļ���.png",59,13,1,-1,0);
	pngs[20].setValues("����","���ſ���ͼ��\\����.png",598,11,1,-1,0);
	pngs[21].setValues("ֹͣͼ��","���ſ���ͼ��\\ֹͣ.png",313,14,7,-1,0);
	pngs[22].setValues("�ظ��ļ���ͼ��","���ſ���ͼ��\\Repeat_Folder.png",472,12,7,-1,0);
	pngs[23].setValues("�ظ��½�ͼ��","���ſ���ͼ��\\Repeat_CH.png",473,12,7,-1,0);
	pngs[24].setValues("�ظ�TTͼ��","���ſ���ͼ��\\Repeat_TT.png",472,12,7,-1,0);
	pngs[25].setValues("������","���ſ���ͼ��\\������.png",650,55,7,-1,0);
	pngs[26].setValues("������","���ſ���ͼ��\\������.png",650,56,7,-1,0);
	pngs[27].setValues("������","���ſ���ͼ��\\������.png",647,56,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[12];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����ʱ��",36,371,100,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("ý������",363,12,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("��Ŀ����",89,17,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("�½�����",214,16,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("����״̬",494,488,80,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("�ظ�ģʽ",354,497,100,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("���ģʽ",636,499,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("����",637,57,140,24,0x00ffffff,10,0,0,0);
	texts[8].setValues("����ʱ��",642,371,100,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("ZOOM����",527,56,100,24,0x00ffffff,10,0,0,0);
	texts[10].setValues("�����鳪",631,16,70,20,0x00ffffff,10,0,0,0);
	texts[11].setValues("�г�˵��",323,168,220,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
