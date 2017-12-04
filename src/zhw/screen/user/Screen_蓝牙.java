package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_蓝牙 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[7];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙拨号\\新蓝牙.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"蓝牙拨号\\新蓝牙1.png",0,0,8,-1,0);
	pngs[3].setValues("BT","蓝牙拨号\\蓝牙.png",75,411,7,-1,0);
	pngs[4].setValues("BTC","蓝牙拨号\\已链接.png",149,103,7,-1,0);
	pngs[5].setValues("BTN","蓝牙拨号\\未链接.png",149,103,7,-1,0);
	pngs[6].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[7].setValues("返回主界面","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[8].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[9].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[7];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("显示1",132,103,90,32,0x00ffffff,10,0,0,0);
	texts[1].setValues("显示2",37,96,400,50,0x00ffffff,10,0,0,0);
	texts[2].setValues("分机号",59,540,200,38,0x00ffffff,10,0,0,0);
	texts[3].setValues("来去电",288,133,154,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("电话号码",64,101,350,32,0x00ffffff,10,0,0,0);
	texts[5].setValues("连接提示",238,502,80,38,0x00ffffff,10,0,0,0);
	texts[6].setValues("INFO",38,101,500,42,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
