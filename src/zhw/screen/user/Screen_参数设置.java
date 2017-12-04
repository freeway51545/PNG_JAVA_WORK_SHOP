package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[55];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[4];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[55];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"���ý���1\\��������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("��","���ý���1\\X.png",673,68,7,-1,0);
	pngs[3].setValues("��2","���ý���1\\X1.png",673,70,7,-1,0);
	pngs[4].setValues("��","���ý���1\\Y.png",740,246,7,-1,0);
	pngs[5].setValues("��2","���ý���1\\Y1.png",739,196,7,-1,0);
	pngs[6].setValues("���","���ý���1\\���.png",720,85,7,-1,0);
	pngs[7].setValues("�����","���ý���1\\�����.png",720,84,7,-1,0);
	pngs[8].setValues("BAR","���ý���1\\BAR.PNG",0,63,7,-1,0);
	pngs[9].setValues("GPS��������","����Сͼ��\\GPS��������.png",38,67,7,-1,0);
	pngs[10].setValues("GPS����·��","����Сͼ��\\GPS����·��.png",50,420,7,-1,0);
	pngs[11].setValues("��������","����Сͼ��\\��������.png",100,420,7,-1,0);
	pngs[12].setValues("����������","����Сͼ��\\����������.png",213,9,7,-1,0);
	pngs[13].setValues("�����л�","����Сͼ��\\�����л�.png",500,420,7,-1,0);
	pngs[14].setValues("��������","����Сͼ��\\��������.png",550,420,7,-1,0);
	pngs[15].setValues("����У׼","����Сͼ��\\����У׼.png",600,420,7,-1,0);
	pngs[16].setValues("��������","����Сͼ��\\��������.png",650,420,7,-1,0);
	pngs[17].setValues("��Ƶ����","����Сͼ��\\��Ƶ����.png",700,420,7,-1,0);
	pngs[18].setValues("ʱ������","����Сͼ��\\ʱ������.png",750,420,7,-1,0);
	pngs[19].setValues("ϵͳ����","����Сͼ��\\ϵͳ����.png",800,420,7,-1,0);
	pngs[20].setValues("ɲ��","����Сͼ��\\ɲ��.png",150,420,7,-1,0);
	pngs[21].setValues("��������","����Сͼ��\\��������.png",250,420,7,-1,0);
	pngs[22].setValues("��������","����Сͼ��\\��������.png",300,420,7,-1,0);
	pngs[23].setValues("�ָ���������","����Сͼ��\\�ָ���������.png",350,420,7,-1,0);
	pngs[24].setValues("��ť����","����Сͼ��\\��ť����.png",400,420,7,-1,0);
	pngs[25].setValues("�汾","����Сͼ��\\ϵͳ��Ϣ.png",350,420,7,-1,0);
	pngs[26].setValues("��������","����Сͼ��\\��������.png",800,420,7,-1,0);
	pngs[27].setValues("��³������","����Сͼ��\\��������.png",800,420,7,-1,0);
	pngs[28].setValues("��������","����Сͼ��\\��������.png",800,420,7,-1,0);
	pngs[29].setValues("����ѡ��","����Сͼ��\\����ͼ��.png",800,420,7,-1,0);
	pngs[30].setValues("���ѡ��","����Сͼ��\\���ͼ��.png",800,420,7,-1,0);
	pngs[31].setValues("��������","����Сͼ��\\��������.png",200,420,7,-1,0);
	pngs[32].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[33].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[34].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[35].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[36].setValues("��������F","����Сͼ��\\����\\��������F.png",38,67,7,-1,0);
	pngs[37].setValues("��ͼF","����Сͼ��\\����\\��ͼF.png",50,420,7,-1,0);
	pngs[38].setValues("��������F","����Сͼ��\\����\\��������F.png",100,420,7,-1,0);
	pngs[39].setValues("��������F","����Сͼ��\\����\\��������F.png",213,9,7,-1,0);
	pngs[40].setValues("��������F","����Сͼ��\\����\\��������F.png",500,420,7,-1,0);
	pngs[41].setValues("��������F","����Сͼ��\\����\\��������F.png",550,420,7,-1,0);
	pngs[42].setValues("��������F","����Сͼ��\\����\\��������F.png",600,420,7,-1,0);
	pngs[43].setValues("����������F","����Сͼ��\\����\\����������F.png",650,420,7,-1,0);
	pngs[44].setValues("���ſ���F","����Сͼ��\\����\\���ſ���F.png",700,420,7,-1,0);
	pngs[45].setValues("�ָ���������F","����Сͼ��\\����\\�ָ���������F.png",750,420,7,-1,0);
	pngs[46].setValues("��������F","����Сͼ��\\����\\��������F.png",800,420,7,-1,0);
	pngs[47].setValues("��Ļ����F","����Сͼ��\\����\\��Ļ����F.png",150,420,7,-1,0);
	pngs[48].setValues("����ʱ��������F","����Сͼ��\\����\\����ʱ��������F.png",250,420,7,-1,0);
	pngs[49].setValues("ʱ������F","����Сͼ��\\����\\ʱ������F.png",300,420,7,-1,0);
	pngs[50].setValues("ͬ��GPSʱ��F","����Сͼ��\\����\\ͬ��GPSʱ��F.png",350,420,7,-1,0);
	pngs[51].setValues("ϵͳ��ϢF","����Сͼ��\\����\\ϵͳ��ϢF.png",400,420,7,-1,0);
	pngs[52].setValues("�г�ʱ��ֹ��ƵF","����Сͼ��\\����\\�г�ʱ��ֹ��ƵF.png",350,420,7,-1,0);
	pngs[53].setValues("��������F","����Сͼ��\\����\\��������F.png",800,420,7,-1,0);
	pngs[54].setValues("��Ƶ����F","����Сͼ��\\����\\��Ƶ����F.png",800,420,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[4];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������",360,573,400,37,0x00ffffff,10,0,0,0);
	texts[1].setValues("showName",105,77,560,29,0x00ffffff,10,0,0,0);
	texts[2].setValues("����_��",687,82,40,29,0x00ffffff,10,0,0,0);
	texts[3].setValues("����_��",732,81,40,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
