package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_ϵͳ���� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[14];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[9];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[14];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"ͨ������\\�µ�ͨ������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"ͨ������\\�µ�ͨ������_PRESS.png",0,0,8,-1,0);
	pngs[2].setValues("ɲ����","ͨ������\\OFF.png",274,108,0,-1,0);
	pngs[3].setValues("ɲ����","ͨ������\\ON.png",228,107,0,-1,0);
	pngs[4].setValues("��ť����","ͨ������\\OFF.png",644,109,0,-1,0);
	pngs[5].setValues("��ť����","ͨ������\\ON.png",598,107,0,-1,0);
	pngs[6].setValues("���������","ͨ������\\OFF.png",277,196,0,-1,0);
	pngs[7].setValues("��������","ͨ������\\ON.png",230,195,0,-1,0);
	pngs[8].setValues("����������","ͨ������\\OFF.png",646,196,0,-1,0);
	pngs[9].setValues("����������","ͨ������\\ON.png",600,195,0,-1,0);
	pngs[10].setValues(null,"Ԥ��ͼƬ\\С�����ü�.png",739,-1,1,-1,0);
	pngs[11].setValues("��������","Ԥ��ͼƬ\\С�����ü�1.png",739,-1,0,-1,0);
	pngs[12].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[13].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[9];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������",350,569,400,50,0x00ffffff,10,0,0,0);
	texts[1].setValues("ɲ��",103,112,120,39,0x00000001,10,0,0,0);
	texts[2].setValues("������",469,114,120,36,0x00000001,10,0,0,0);
	texts[3].setValues("��������",100,200,120,35,0x00000001,10,0,0,0);
	texts[4].setValues("��������",469,201,120,33,0x00000001,10,0,0,0);
	texts[5].setValues("��������",105,378,220,35,0x00000001,10,0,0,0);
	texts[6].setValues("�ָ���������",469,288,220,32,0x00000001,10,0,0,0);
	texts[7].setValues("������У��",102,288,220,37,0x00000001,10,0,0,0);
	texts[8].setValues("��������",476,373,220,37,0x00000001,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
