package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP_DVD1 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[28];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[12];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[28];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP_DVD1\\DVD-1-1.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP_DVD1\\DVD-1-2.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[3].setValues("主界面返回","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[4].setValues(null,"关屏与返回\\返回.png",683,1,1,-1,0);
	pngs[5].setValues("返回列表","关屏与返回\\返回1.png",683,0,0,-1,0);
	pngs[6].setValues(null,"pub\\返回并退出.png",745,0,1,-1,0);
	pngs[7].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	pngs[8].setValues(null,"DVP_控制图标\\播放条0.png",130,368,1,-1,0);
	pngs[9].setValues("进度条","DVP_控制图标\\播放条.png",137,375,7,-1,0);
	pngs[10].setValues("播放图标","播放控制图标\\播放.png",315,13,7,-1,0);
	pngs[11].setValues("暂停图标","播放控制图标\\暂停.png",315,15,7,-1,0);
	pngs[12].setValues("禁止图标","播放控制图标\\禁止.png",3,53,7,-1,0);
	pngs[13].setValues("章节图标","播放控制图标\\章节.png",177,17,1,-1,0);
	pngs[14].setValues("随机图标","播放控制图标\\Random.png",545,10,7,-1,0);
	pngs[15].setValues("随机关图标","播放控制图标\\Random_disable.png",545,10,7,-1,0);
	pngs[16].setValues("重复关图标","播放控制图标\\Repeat_off.png",472,11,7,-1,0);
	pngs[17].setValues("单曲重复图标","播放控制图标\\Repeat_One.png",471,11,7,-1,0);
	pngs[18].setValues("重复所有图标","播放控制图标\\Repeat_All.png",472,10,7,-1,0);
	pngs[19].setValues("文件数图标","播放控制图标\\文件数.png",59,13,1,-1,0);
	pngs[20].setValues("喇叭","播放控制图标\\喇叭.png",598,11,1,-1,0);
	pngs[21].setValues("停止图标","播放控制图标\\停止.png",313,14,7,-1,0);
	pngs[22].setValues("重复文件夹图标","播放控制图标\\Repeat_Folder.png",472,12,7,-1,0);
	pngs[23].setValues("重复章节图标","播放控制图标\\Repeat_CH.png",473,12,7,-1,0);
	pngs[24].setValues("重复TT图标","播放控制图标\\Repeat_TT.png",472,12,7,-1,0);
	pngs[25].setValues("立体声","播放控制图标\\立体声.png",650,55,7,-1,0);
	pngs[26].setValues("右声道","播放控制图标\\右声道.png",650,56,7,-1,0);
	pngs[27].setValues("左声道","播放控制图标\\左声道.png",647,56,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[12];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("进度时间",36,371,100,20,0x00ffffff,10,0,0,0);
	texts[1].setValues("媒体类型",363,12,80,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("曲目数量",89,17,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("章节数量",214,16,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("播放状态",494,488,80,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("重复模式",354,497,100,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("随机模式",636,499,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("声道",637,57,140,24,0x00ffffff,10,0,0,0);
	texts[8].setValues("歌曲时间",642,371,100,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("ZOOM倍数",527,56,100,24,0x00ffffff,10,0,0,0);
	texts[10].setValues("声道伴唱",631,16,70,20,0x00ffffff,10,0,0,0);
	texts[11].setValues("行车说明",323,168,220,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
