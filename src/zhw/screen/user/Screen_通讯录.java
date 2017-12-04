package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_通讯录 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[28];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[6];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[28];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"蓝牙通话记录\\通话记录.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"蓝牙通话记录\\通话记录2.png",-1,92,1,-1,0);
	pngs[3].setValues("BAR","蓝牙通话记录\\点击后.png",158,119,7,-1,0);
	pngs[4].setValues("BT提示","蓝牙通话记录\\蓝牙提示框.png",300,151,7,-1,0);
	pngs[5].setValues("记录盘","蓝牙通话记录\\通话记录盘.png",135,93,7,-1,0);
	pngs[6].setValues("通讯录","蓝牙通话记录\\通讯录.png",219,412,0,-1,0);
	pngs[7].setValues("蓝牙","蓝牙通话记录\\蓝牙.png",75,412,0,-1,0);
	pngs[8].setValues("蓝牙音乐","蓝牙通话记录\\蓝牙音乐.png",664,412,0,-1,0);
	pngs[9].setValues("电话本","蓝牙通话记录\\电话本.png",370,412,0,-1,0);
	pngs[10].setValues("设置","蓝牙通话记录\\设置.png",519,412,0,-1,0);
	pngs[11].setValues("未接","蓝牙通话记录\\未接.png",28,234,0,-1,0);
	pngs[12].setValues("播出","蓝牙通话记录\\播出.png",28,166,0,-1,0);
	pngs[13].setValues("播进","蓝牙通话记录\\播进.png",28,106,0,-1,0);
	pngs[14].setValues("删除","蓝牙通话记录\\记录删除.png",28,296,0,-1,0);
	pngs[15].setValues("电话本高亮","蓝牙通话记录\\电话本高亮.png",370,412,7,-1,0);
	pngs[16].setValues("通讯录高亮","蓝牙通话记录\\通讯录高亮.png",219,412,7,-1,0);
	pngs[17].setValues("未接高亮","蓝牙通话记录\\未接高亮.png",28,234,7,-1,0);
	pngs[18].setValues("播出高亮","蓝牙通话记录\\播出高亮.png",28,166,7,-1,0);
	pngs[19].setValues("播进高亮","蓝牙通话记录\\播进高亮.png",28,106,7,-1,0);
	pngs[20].setValues("记录删除高亮","蓝牙通话记录\\记录删除高亮.png",28,296,7,-1,0);
	pngs[21].setValues("当前无记录","蓝牙通话记录\\蓝牙字体\\当前无记录.png",413,195,7,-1,0);
	pngs[22].setValues("正在同步","蓝牙通话记录\\蓝牙字体\\正在同步.png",413,195,7,-1,0);
	pngs[23].setValues("设备未连接","蓝牙通话记录\\蓝牙字体\\设备未连接.png",413,196,7,-1,0);
	pngs[24].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[25].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	pngs[26].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[27].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
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
