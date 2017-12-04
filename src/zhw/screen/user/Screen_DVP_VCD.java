package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP_VCD extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[19];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[10];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[19];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP_VCD\\VCD.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP_VCD\\VCD1.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[3].setValues("主界面返回","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"pub\\返回并退出.png",745,0,1,-1,0);
	pngs[5].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	pngs[6].setValues(null,"DVP_控制图标\\播放条0.png",130,368,1,-1,0);
	pngs[7].setValues("进度条","DVP_控制图标\\播放条.png",137,375,7,-1,0);
	pngs[8].setValues("播放图标","播放控制图标\\播放.png",190,15,7,-1,0);
	pngs[9].setValues("暂停图标","播放控制图标\\暂停.png",187,15,7,-1,0);
	pngs[10].setValues("禁止图标","播放控制图标\\禁止.png",11,57,7,-1,0);
	pngs[11].setValues("章节图标","播放控制图标\\章节.png",59,19,7,-1,0);
	pngs[12].setValues("随机图标","播放控制图标\\Random.png",656,17,7,-1,0);
	pngs[13].setValues("随机关图标","播放控制图标\\Random_disable.png",656,17,7,-1,0);
	pngs[14].setValues("重复关图标","播放控制图标\\Repeat_off.png",548,15,7,-1,0);
	pngs[15].setValues("单曲重复图标","播放控制图标\\Repeat_One.png",550,15,7,-1,0);
	pngs[16].setValues("重复所有图标","播放控制图标\\Repeat_All.png",547,15,7,-1,0);
	pngs[17].setValues("文件数图标","播放控制图标\\文件数.png",69,59,7,-1,0);
	pngs[18].setValues("停止图标","播放控制图标\\停止.png",189,16,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[10];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("进度时间",42,371,120,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("媒体类型",352,14,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("曲目数量",94,19,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("PBC状态",261,20,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("播放状态",168,19,80,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("重复模式",536,18,120,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("随机模式",649,18,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("喇叭状态",451,19,80,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("歌曲时间",671,371,120,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("行车说明",323,168,220,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
