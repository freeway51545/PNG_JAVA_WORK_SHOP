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

	pngs[0].setValues(null,"DVD变更\\1.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVD变更\\2.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[3].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[4].setValues(null,"预览图片\\小的设置键.png",739,-1,1,-1,0);
	pngs[5].setValues("返回设置","预览图片\\小的设置键1.png",739,-1,0,-1,0);
	pngs[6].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[7].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
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
