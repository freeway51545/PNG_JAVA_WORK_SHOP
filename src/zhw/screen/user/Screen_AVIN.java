package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_AVIN extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[3];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[2];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[3];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[1].setValues(null,"AVIN\\亮度.PNG",683,1,1,-1,0);
	pngs[2].setValues("屏幕调节","AVIN\\亮度1.PNG",683,0,0,-1,0);
	setPngs(pngs);}

private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[2];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("AVIN",344,13,120,26,0x00ffffff,10,0,0,0);
	texts[1].setValues("提示信息",257,192,360,36,0x00ffffff,10,0,0,0);
	setTexts(texts);}


	public void init(){
		initPng();
		initTxt();
}
}
