package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_蓝牙配置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[13];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[3];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[13];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙设置\\蓝牙设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"蓝牙设置\\蓝牙设置1.png",0,0,8,-1,0);
	pngs[3].setValues("编辑","蓝牙设置\\编辑.png",510,241,0,-1,0);
	pngs[4].setValues("连接","蓝牙设置\\连接.png",224,242,0,-1,0);
	pngs[5].setValues("断开","蓝牙设置\\断开.png",371,240,0,-1,0);
	pngs[6].setValues("NC","蓝牙设置\\设备未链接.png",277,159,7,-1,0);
	pngs[7].setValues("C","蓝牙设置\\设备已链接.png",276,158,7,-1,0);
	pngs[8].setValues("SHL","蓝牙设置\\设置高亮.png",519,412,7,-1,0);
	pngs[9].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[10].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[11].setValues(null,"关屏与返回\\返回.png",731,3,1,-1,0);
	pngs[12].setValues("返回","关屏与返回\\返回1.png",731,3,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[3];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("蓝牙配置",233,527,400,44,0x00ffffff,10,0,0,0);
	texts[1].setValues("名称",527,140,120,29,0x00ffffff,10,0,0,0);
	texts[2].setValues("密码",524,189,120,29,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
