package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_������ extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[6];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[6];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"�°�����\\bg.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�°�����\\ѡ��.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[3].setValues("�����淵��","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"pub\\���ز��˳�.png",744,0,1,-1,0);
	pngs[5].setValues("�˳�","pub\\���ز��˳�1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("NO",30,155,350,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("externNo",29,219,350,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("������״̬",31,328,350,22,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
