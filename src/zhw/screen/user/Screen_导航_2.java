package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_导航_2 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[7];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[7];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"导航路径\\新的导航路径.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"导航路径\\新的导航路径1.png",0,0,8,-1,0);
	pngs[3].setValues("文件","导航路径\\22.png",56,251,0,-1,0);
	pngs[4].setValues("文件夹","导航路径\\文件夹.png",59,174,0,-1,0);
	pngs[5].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[6].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("0",110,169,500,36,0x00ffffff,10,0,0,0);
	texts[1].setValues("1",110,250,500,36,0x00ffffff,10,0,0,0);
	texts[2].setValues("2",109,322,500,36,0x00ffffff,10,0,0,0);
	texts[3].setValues("3",104,401,500,36,0x00ffffff,10,0,0,0);
	texts[4].setValues("4",108,484,500,36,0x00ffffff,10,0,0,0);
	texts[5].setValues("路径显示",55,98,600,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
