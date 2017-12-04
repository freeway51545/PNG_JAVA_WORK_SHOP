package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_MCU_UPDATE extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[5];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[2];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[5];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"MCU_UPDATE\\update.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"MCU_UPDATE\\update1.png",0,0,8,-1,0);
	pngs[3].setValues(null,"关屏与返回\\返回.png",725,2,1,-1,0);
	pngs[4].setValues("返回按钮","关屏与返回\\返回1.png",724,2,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[2];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("提示信息",313,121,400,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("百分比",624,229,70,25,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
