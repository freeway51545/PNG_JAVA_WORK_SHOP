package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_���ֲ��� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[32];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[15];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[32];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"���ֲ���\\���ֲ���.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"���ֲ���\\���ֲ���1.png",0,0,8,-1,0);
	pngs[3].setValues("����","���ֲ���\\����.PNG",35,64,1,-1,0);
	pngs[4].setValues("NUM","���ֲ���\\��Ŀ��.PNG",60,2,1,-1,0);
	pngs[5].setValues(null,"DVP_����ͼ��\\������0.png",150,341,1,-1,0);
	pngs[6].setValues("������","DVP_����ͼ��\\������.png",157,348,7,-1,0);
	pngs[7].setValues(null,"���ֲ���\\�ݳ���.png",310,123,1,-1,0);
	pngs[8].setValues(null,"���ֲ���\\ר��.png",310,160,1,-1,0);
	pngs[9].setValues(null,"���ֲ���\\���.png",310,238,1,-1,0);
	pngs[10].setValues(null,"���ֲ���\\����.png",310,196,1,-1,0);
	pngs[11].setValues(null,"���ֲ���\\��Ŀ.png",310,80,1,-1,0);
	pngs[12].setValues(null,"�����뷵��\\����.png",653,1,1,-1,0);
	pngs[13].setValues("�����б�","�����뷵��\\����1.png",652,2,0,-1,0);
	pngs[14].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[15].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[16].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[17].setValues("�ر�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	pngs[18].setValues("����ͼ��","���ſ���ͼ��\\����.png",229,14,7,-1,0);
	pngs[19].setValues("��ͣͼ��","���ſ���ͼ��\\��ͣ.png",229,14,7,-1,0);
	pngs[20].setValues("��ֹͼ��","���ſ���ͼ��\\��ֹ.png",70,500,7,-1,0);
	pngs[21].setValues("�½�ͼ��","���ſ���ͼ��\\�½�.png",337,503,7,-1,0);
	pngs[22].setValues("���ͼ��","���ſ���ͼ��\\Random.png",585,11,7,-1,0);
	pngs[23].setValues("�����ͼ��","���ſ���ͼ��\\Random_disable.png",585,12,7,-1,0);
	pngs[24].setValues("�ظ���ͼ��","���ſ���ͼ��\\Repeat_off.png",484,11,7,-1,0);
	pngs[25].setValues("�����ظ�ͼ��","���ſ���ͼ��\\Repeat_One.png",484,11,7,-1,0);
	pngs[26].setValues("�ظ�����ͼ��","���ſ���ͼ��\\Repeat_All.png",484,11,7,-1,0);
	pngs[27].setValues("�ļ���ͼ��","���ſ���ͼ��\\�ļ���.png",482,502,7,-1,0);
	pngs[28].setValues("ֹͣͼ��","���ſ���ͼ��\\ֹͣ.png",229,14,7,-1,0);
	pngs[29].setValues("������","���ſ���ͼ��\\������.png",20,55,7,-1,0);
	pngs[30].setValues("������","���ſ���ͼ��\\������.png",20,56,7,-1,0);
	pngs[31].setValues("������","���ſ���ͼ��\\������.png",17,56,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[15];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("����",56,342,100,23,0x00ffffff,10,0,0,0);
	texts[1].setValues("�ܳ�",675,343,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("�ظ�",462,20,120,18,0x00ffffff,10,0,0,0);
	texts[3].setValues("���",540,20,120,18,0x00ffffff,10,0,0,0);
	texts[4].setValues("����״̬",239,20,100,18,0x00ffffff,10,0,0,0);
	texts[5].setValues("����",370,82,560,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("�ݳ���",370,123,460,25,0x00ffffff,10,0,0,0);
	texts[7].setValues("ר��",370,162,460,25,0x00ffffff,10,0,0,0);
	texts[8].setValues("����",370,200,460,25,0x00ffffff,10,0,0,0);
	texts[9].setValues("���",370,241,460,25,0x00ffffff,10,0,0,0);
	texts[10].setValues("��Ŀ����",107,20,160,18,0x00ffffff,10,0,0,0);
	texts[11].setValues("�ļ���",220,55,350,28,0x00ffffff,10,0,0,0);
	texts[12].setValues("�豸����",352,14,80,30,0x00ffffff,10,0,0,0);
	texts[13].setValues("ý���Ƿ�֧��",262,300,220,28,0x00ffffff,10,0,0,0);
	texts[14].setValues("����",623,510,140,24,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
