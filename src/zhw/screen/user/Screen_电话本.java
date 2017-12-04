package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_电话本 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[12];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[10];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[12];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"电话本\\新电话本.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"电话本\\新电话本1.png",0,0,8,-1,0);
	pngs[3].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[4].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[5].setValues("TEL1","电话本\\长的按键.png",-1,53,7,-1,0);
	pngs[6].setValues("KEYS","电话本\\新电话本3.png",491,124,7,-1,0);
	pngs[7].setValues(null,"电话本\\新电话本4.png",491,124,8,-1,0);
	pngs[8].setValues(null,"关屏与返回\\返回.png",653,1,1,-1,0);
	pngs[9].setValues("返回蓝牙","关屏与返回\\返回1.png",652,2,0,-1,0);
	pngs[10].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[11].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[10];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("1",11,58,600,36,0x00ffffff,10,0,0,0);
	texts[1].setValues("2",8,131,600,36,0x00ffffff,10,0,0,0);
	texts[2].setValues("3",10,195,600,36,0x00ffffff,10,0,0,0);
	texts[3].setValues("4",10,262,600,36,0x00ffffff,10,0,0,0);
	texts[4].setValues("5",10,326,600,36,0x00ffffff,10,0,0,0);
	texts[5].setValues("6",8,392,600,36,0x00ffffff,10,0,0,0);
	texts[6].setValues("7",7,448,600,36,0x00ffffff,10,0,0,0);
	texts[7].setValues("状态",464,22,600,25,0x00ffffff,10,0,0,0);
	texts[8].setValues("过滤",678,357,100,15,0x00ffffff,10,0,0,0);
	texts[9].setValues("电话本",231,548,100,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
