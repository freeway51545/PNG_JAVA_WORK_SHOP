package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_新电话本 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[25];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[25];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙通话记录\\通话记录.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BAR","蓝牙通话记录\\点击后.png",158,119,7,-1,0);
	pngs[3].setValues("BT提示","蓝牙通话记录\\蓝牙提示框.png",300,151,7,-1,0);
	pngs[4].setValues("记录盘","蓝牙通话记录\\通话记录盘.png",135,93,7,-1,0);
	pngs[5].setValues("通讯录","蓝牙通话记录\\通讯录.png",219,412,0,-1,0);
	pngs[6].setValues("蓝牙","蓝牙通话记录\\蓝牙.png",75,412,0,-1,0);
	pngs[7].setValues("蓝牙音乐","蓝牙通话记录\\蓝牙音乐.png",664,412,0,-1,0);
	pngs[8].setValues("电话本","蓝牙通话记录\\电话本.png",370,412,0,-1,0);
	pngs[9].setValues("设置","蓝牙通话记录\\设置.png",519,412,0,-1,0);
	pngs[10].setValues("电话本高亮","蓝牙通话记录\\电话本高亮.png",370,412,0,-1,0);
	pngs[11].setValues(null,"蓝牙通话记录\\电话本\\电话本1.png",1,89,1,-1,0);
	pngs[12].setValues("清除","蓝牙通话记录\\电话本\\清除.png",28,199,0,-1,0);
	pngs[13].setValues("搜索","蓝牙通话记录\\电话本\\搜索.png",28,285,0,-1,0);
	pngs[14].setValues("下载","蓝牙通话记录\\电话本\\下载.png",28,111,0,-1,0);
	pngs[15].setValues("请重试","蓝牙通话记录\\蓝牙字体\\请重试.png",413,195,7,-1,0);
	pngs[16].setValues("下载失败","蓝牙通话记录\\蓝牙字体\\下载失败.png",413,195,7,-1,0);
	pngs[17].setValues("下载中","蓝牙通话记录\\蓝牙字体\\下载中.png",413,195,7,-1,0);
	pngs[18].setValues("正在同步","蓝牙通话记录\\蓝牙字体\\正在同步.png",413,195,7,-1,0);
	pngs[19].setValues("当前无记录","蓝牙通话记录\\蓝牙字体\\当前无记录.png",413,195,7,-1,0);
	pngs[20].setValues("设备未连接","蓝牙通话记录\\蓝牙字体\\设备未连接.png",413,195,7,-1,0);
	pngs[21].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[22].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[23].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[24].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[6];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("R1",163,127,580,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("R2",161,173,580,30,0x00ffffff,10,0,0,0);
	texts[2].setValues("R3",162,219,580,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("R4",161,263,580,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("R5",164,307,580,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("INFO",299,57,580,35,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
