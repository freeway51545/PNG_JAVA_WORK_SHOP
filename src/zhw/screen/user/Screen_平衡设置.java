package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_平衡设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[4];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"平衡设置\\平衡.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"平衡设置\\平衡1.png",0,0,8,-1,0);
	pngs[3].setValues("平衡点","平衡设置\\小球球.png",279,253,7,-1,0);
	pngs[4].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[5].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[6].setValues(null,"关屏与返回\\返回.png",683,1,1,-1,0);
	pngs[7].setValues("返回","关屏与返回\\返回1.png",683,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[4];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("前后平衡:",616,152,100,25,0x00ffffff,10,0,0,0);
	texts[1].setValues("左右平衡:",615,354,100,25,0x00ffffff,10,0,0,0);
	texts[2].setValues("前后值",709,152,70,25,0x00ffffff,10,0,0,0);
	texts[3].setValues("左右值",708,354,70,25,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
