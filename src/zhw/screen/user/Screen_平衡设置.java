package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_ƽ������ extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[4];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"ƽ������\\ƽ��.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"ƽ������\\ƽ��1.png",0,0,8,-1,0);
	pngs[3].setValues("ƽ���","ƽ������\\С����.png",279,253,7,-1,0);
	pngs[4].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[5].setValues("��ҳ","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\����.png",683,1,1,-1,0);
	pngs[7].setValues("����","�����뷵��\\����1.png",683,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[4];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("ǰ��ƽ��:",616,152,100,25,0x00ffffff,10,0,0,0);
	texts[1].setValues("����ƽ��:",615,354,100,25,0x00ffffff,10,0,0,0);
	texts[2].setValues("ǰ��ֵ",709,152,70,25,0x00ffffff,10,0,0,0);
	texts[3].setValues("����ֵ",708,354,70,25,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
