package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_�������� extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[13];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[13];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"��������\\��������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"��������\\��������1.png",0,0,8,-1,0);
	pngs[3].setValues("�༭","��������\\�༭.png",510,241,0,-1,0);
	pngs[4].setValues("����","��������\\����.png",224,242,0,-1,0);
	pngs[5].setValues("�Ͽ�","��������\\�Ͽ�.png",371,240,0,-1,0);
	pngs[6].setValues("NC","��������\\�豸δ����.png",277,159,7,-1,0);
	pngs[7].setValues("C","��������\\�豸������.png",276,158,7,-1,0);
	pngs[8].setValues("SHL","��������\\���ø���.png",519,412,7,-1,0);
	pngs[9].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[10].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[11].setValues(null,"�����뷵��\\����.png",731,3,1,-1,0);
	pngs[12].setValues("����","�����뷵��\\����1.png",731,3,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("��������",233,527,400,44,0x00ffffff,10,0,0,0);
	texts[1].setValues("����",527,140,120,29,0x00ffffff,10,0,0,0);
	texts[2].setValues("����",524,189,120,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
