package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_MAIN1 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[83];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[83];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"新界面\\主界面.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("导航","新界面\\图标\\导航.png",1647,346,0,-1,0);
	pngs[3].setValues("收音机","新界面\\图标\\收音机.png",1797,346,0,-1,0);
	pngs[4].setValues("蓝牙","新界面\\图标\\蓝牙.png",1947,346,0,-1,0);
	pngs[5].setValues("DVD","新界面\\图标\\DVD.png",2097,346,0,-1,0);
	pngs[6].setValues("SD卡","新界面\\图标\\SD卡.png",2247,346,0,-1,0);
	pngs[7].setValues("USB","新界面\\图标\\USB.PNG",847,136,0,-1,0);
	pngs[8].setValues("USB2","新界面\\图标\\USB1.PNG",1786,136,0,-1,0);
	pngs[9].setValues("设置","新界面\\图标\\设置.png",997,136,0,-1,0);
	pngs[10].setValues("背景设置","新界面\\图标\\墙纸.png",1147,136,0,-1,0);
	pngs[11].setValues("IPOD","新界面\\图标\\ipod.png",1800,500,0,-1,0);
	pngs[12].setValues("GPS信号","新界面\\图标\\GPS信号.png",1297,136,0,-1,0);
	pngs[13].setValues("电视","新界面\\图标\\电视.png",2100,500,0,-1,0);
	pngs[14].setValues("外部输入","新界面\\图标\\视频输入.png",1447,136,0,-1,0);
	pngs[15].setValues("蓝牙音乐","新界面\\图标\\蓝牙音乐.png",0,500,0,-1,0);
	pngs[16].setValues("T_导航","新界面\\字体\\图标字体\\导航.png",36,336,0,-1,0);
	pngs[17].setValues("T_收音机","新界面\\字体\\图标字体\\收音机.png",186,336,0,-1,0);
	pngs[18].setValues("T_蓝牙","新界面\\字体\\图标字体\\蓝牙.png",336,336,0,-1,0);
	pngs[19].setValues("T_DVD","新界面\\字体\\图标字体\\dvd.png",486,336,0,-1,0);
	pngs[20].setValues("T_SD卡","新界面\\字体\\图标字体\\SD.png",636,336,0,-1,0);
	pngs[21].setValues("T_USB","新界面\\字体\\图标字体\\USB1.PNG",836,126,0,-1,0);
	pngs[22].setValues("T_USB2","新界面\\字体\\图标字体\\USB2.PNG",1786,126,0,-1,0);
	pngs[23].setValues("T_设置","新界面\\字体\\图标字体\\设置.png",986,126,0,-1,0);
	pngs[24].setValues("T_背景设置","新界面\\字体\\图标字体\\背景设置.png",1136,126,0,-1,0);
	pngs[25].setValues("T_IPOD","新界面\\字体\\图标字体\\IPOD.png",1286,126,0,-1,0);
	pngs[26].setValues("T_GPS信号","新界面\\字体\\图标字体\\GPS信号.png",1436,126,0,-1,0);
	pngs[27].setValues("T_电视","新界面\\字体\\图标字体\\电视.png",1636,126,0,-1,0);
	pngs[28].setValues("T_外部输入","新界面\\字体\\图标字体\\外部输入.png",1786,126,0,-1,0);
	pngs[29].setValues("T_蓝牙音乐","新界面\\字体\\图标字体\\蓝牙音乐.png",0,500,0,-1,0);
	pngs[30].setValues("T_年","新界面\\字体\\日期\\年.png",334,493,0,-1,0);
	pngs[31].setValues("T_月","新界面\\字体\\日期\\月.png",578,181,0,-1,0);
	pngs[32].setValues("T_日","新界面\\字体\\日期\\日.png",651,182,0,-1,0);
	pngs[33].setValues("T_XQ1","新界面\\字体\\日期\\XQ1.png",464,64,0,-1,0);
	pngs[34].setValues("T_XQ2","新界面\\字体\\日期\\XQ2.png",464,63,0,-1,0);
	pngs[35].setValues("T_XQ3","新界面\\字体\\日期\\XQ3.PNG",552,124,0,-1,0);
	pngs[36].setValues("T_XQ4","新界面\\字体\\日期\\XQ4.png",459,62,0,-1,0);
	pngs[37].setValues("T_XQ5","新界面\\字体\\日期\\XQ5.png",458,62,0,-1,0);
	pngs[38].setValues("T_XQ6","新界面\\字体\\日期\\XQ6.png",457,58,0,-1,0);
	pngs[39].setValues("T_XQ7","新界面\\字体\\日期\\XQ7.png",441,59,0,-1,0);
	pngs[40].setValues("两点","新界面\\字体\\日期\\两点.png",245,143,0,-1,0);
	pngs[41].setValues("B0","新界面\\字体\\大数字\\0.png",94,121,0,-1,0);
	pngs[42].setValues("B1","新界面\\字体\\大数字\\1.png",169,120,0,-1,0);
	pngs[43].setValues("B2","新界面\\字体\\大数字\\2.png",277,121,0,-1,0);
	pngs[44].setValues("B3","新界面\\字体\\大数字\\3.png",14,70,0,-1,0);
	pngs[45].setValues("B4","新界面\\字体\\大数字\\4.png",344,121,0,-1,0);
	pngs[46].setValues("B5","新界面\\字体\\大数字\\5.png",11,71,0,-1,0);
	pngs[47].setValues("B6","新界面\\字体\\大数字\\6.PNG",14,66,0,-1,0);
	pngs[48].setValues("B7","新界面\\字体\\大数字\\7.png",15,68,0,-1,0);
	pngs[49].setValues("B8","新界面\\字体\\大数字\\8.png",10,68,0,-1,0);
	pngs[50].setValues("B9","新界面\\字体\\大数字\\9.png",14,63,0,-1,0);
	pngs[51].setValues("L0","新界面\\字体\\小数字\\0.png",637,182,0,-1,0);
	pngs[52].setValues("L1","新界面\\字体\\小数字\\1.png",641,59,0,-1,0);
	pngs[53].setValues("L2","新界面\\字体\\小数字\\2.png",617,181,0,-1,0);
	pngs[54].setValues("L3","新界面\\字体\\小数字\\3.png",638,63,0,-1,0);
	pngs[55].setValues("L4","新界面\\字体\\小数字\\4.png",637,65,0,-1,0);
	pngs[56].setValues("L5","新界面\\字体\\小数字\\5.png",642,67,0,-1,0);
	pngs[57].setValues("L6","新界面\\字体\\小数字\\6.PNG",645,66,0,-1,0);
	pngs[58].setValues("L7","新界面\\字体\\小数字\\7.png",640,66,0,-1,0);
	pngs[59].setValues("L8","新界面\\字体\\小数字\\8.png",556,182,0,-1,0);
	pngs[60].setValues("L9","新界面\\字体\\小数字\\9.png",642,67,0,-1,0);
	pngs[61].setValues(null,"新界面\\小图标\\BT-暗.png",622,9,1,-1,0);
	pngs[62].setValues("BT","新界面\\小图标\\BT-亮.png",622,8,7,-1,0);
	pngs[63].setValues(null,"新界面\\小图标\\sd-暗.png",698,9,1,-1,0);
	pngs[64].setValues("SD","新界面\\小图标\\sd-亮.png",698,8,7,-1,0);
	pngs[65].setValues(null,"新界面\\小图标\\usb1-暗.png",588,8,1,-1,0);
	pngs[66].setValues("U_SB","新界面\\小图标\\usb1-亮.png",590,7,7,-1,0);
	pngs[67].setValues(null,"新界面\\小图标\\usb2-暗.png",654,8,1,-1,0);
	pngs[68].setValues("U_SB2","新界面\\小图标\\usb2-亮.png",656,7,7,-1,0);
	pngs[69].setValues(null,"新界面\\小图标\\DVD-暗.png",554,7,1,-1,0);
	pngs[70].setValues("L_DVD","新界面\\小图标\\DVD-亮.png",554,8,7,-1,0);
	pngs[71].setValues(null,"新界面\\主界面提示.png",306,298,1,-1,0);
	pngs[72].setValues("P1","新界面\\主界面选中状态提示.PNG",1906,298,0,-1,0);
	pngs[73].setValues("P2","新界面\\主界面选中状态提示.PNG",1969,298,0,-1,0);
	pngs[74].setValues("P3","新界面\\主界面选中状态提示.PNG",2032,298,0,-1,0);
	pngs[75].setValues("时间","新界面\\日历.png",456,66,7,-1,0);
	pngs[76].setValues(null,"软键盘小图标\\软件盘小图标.PNG",153,6,1,-1,0);
	pngs[77].setValues("软键盘","软键盘小图标\\软件盘小图标开启.PNG",153,5,0,-1,0);
	pngs[78].setValues("关屏0","关屏与返回\\关屏1.png",73,-1,7,-1,0);
	pngs[79].setValues("关屏","关屏与返回\\关屏2.png",73,-1,0,-1,0);
	pngs[80].setValues("还了","新界面\\还原.png",738,-1,7,-1,0);
	pngs[81].setValues("还原","新界面\\还原1.png",738,-1,0,-1,0);
	pngs[82].setValues("叉","新界面\\叉1.png",259,332,7,-1,0);
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
