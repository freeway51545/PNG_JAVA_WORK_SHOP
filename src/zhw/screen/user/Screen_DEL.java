package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DEL extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVD���\\1.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVD���\\2.png",0,0,8,-1,0);
	pngs[2].setValues(null,"�����뷵��\\����1.png",139,500,1,-1,0);
	pngs[3].setValues("����","�����뷵��\\����2.png",210,497,0,-1,0);
	pngs[4].setValues(null,"Ԥ��ͼƬ\\С�����ü�.png",739,-1,1,-1,0);
	pngs[5].setValues("��������","Ԥ��ͼƬ\\С�����ü�1.png",739,-1,0,-1,0);
	pngs[6].setValues(null,"�����뷵��\\��ҳ.png",0,-1,1,-1,0);
	pngs[7].setValues("������","�����뷵��\\��ҳ1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[0];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
