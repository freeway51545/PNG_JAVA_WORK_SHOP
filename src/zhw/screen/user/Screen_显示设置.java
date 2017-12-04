package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_显示设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"显示设置\\新的显示设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"显示设置\\新的显示设置1.png",0,0,8,-1,0);
	pngs[3].setValues("滑块","显示设置\\滑块.png",430,501,0,-1,0);
	pngs[4].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[5].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[6].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[7].setValues("返回设置","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[8].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[9].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("1#",659,286,50,27,0x00ffffff,10,0,0,0);
	texts[1].setValues("明亮",98,515,100,35,0x00ffffff,10,0,0,0);
	texts[2].setValues("柔和",286,491,100,35,0x00ffffff,10,0,0,0);
	texts[3].setValues("标准",496,497,100,35,0x00ffffff,10,0,0,0);
	texts[4].setValues("用户",698,518,100,35,0x00ffffff,10,0,0,0);
	texts[5].setValues("显示设置",353,552,500,37,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
