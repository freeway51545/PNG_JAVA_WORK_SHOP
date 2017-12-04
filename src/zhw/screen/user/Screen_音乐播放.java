package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_音乐播放 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[32];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[15];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[32];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"音乐播放\\音乐播放.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"音乐播放\\音乐播放1.png",0,0,8,-1,0);
	pngs[3].setValues("音乐","音乐播放\\音乐.PNG",35,64,1,-1,0);
	pngs[4].setValues("NUM","音乐播放\\曲目数.PNG",60,2,1,-1,0);
	pngs[5].setValues(null,"DVP_控制图标\\播放条0.png",150,341,1,-1,0);
	pngs[6].setValues("进度条","DVP_控制图标\\播放条.png",157,348,7,-1,0);
	pngs[7].setValues(null,"音乐播放\\演唱者.png",310,123,1,-1,0);
	pngs[8].setValues(null,"音乐播放\\专辑.png",310,160,1,-1,0);
	pngs[9].setValues(null,"音乐播放\\年代.png",310,238,1,-1,0);
	pngs[10].setValues(null,"音乐播放\\流派.png",310,196,1,-1,0);
	pngs[11].setValues(null,"音乐播放\\曲目.png",310,80,1,-1,0);
	pngs[12].setValues(null,"关屏与返回\\返回.png",653,1,1,-1,0);
	pngs[13].setValues("返回列表","关屏与返回\\返回1.png",652,2,0,-1,0);
	pngs[14].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[15].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[16].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[17].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	pngs[18].setValues("播放图标","播放控制图标\\播放.png",229,14,7,-1,0);
	pngs[19].setValues("暂停图标","播放控制图标\\暂停.png",229,14,7,-1,0);
	pngs[20].setValues("禁止图标","播放控制图标\\禁止.png",70,500,7,-1,0);
	pngs[21].setValues("章节图标","播放控制图标\\章节.png",337,503,7,-1,0);
	pngs[22].setValues("随机图标","播放控制图标\\Random.png",585,11,7,-1,0);
	pngs[23].setValues("随机关图标","播放控制图标\\Random_disable.png",585,12,7,-1,0);
	pngs[24].setValues("重复关图标","播放控制图标\\Repeat_off.png",484,11,7,-1,0);
	pngs[25].setValues("单曲重复图标","播放控制图标\\Repeat_One.png",484,11,7,-1,0);
	pngs[26].setValues("重复所有图标","播放控制图标\\Repeat_All.png",484,11,7,-1,0);
	pngs[27].setValues("文件数图标","播放控制图标\\文件数.png",482,502,7,-1,0);
	pngs[28].setValues("停止图标","播放控制图标\\停止.png",229,14,7,-1,0);
	pngs[29].setValues("立体声","播放控制图标\\立体声.png",20,55,7,-1,0);
	pngs[30].setValues("右声道","播放控制图标\\右声道.png",20,56,7,-1,0);
	pngs[31].setValues("左声道","播放控制图标\\左声道.png",17,56,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[15];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("进度",56,342,100,23,0x00ffffff,10,0,0,0);
	texts[1].setValues("总长",675,343,100,23,0x00ffffff,10,0,0,0);
	texts[2].setValues("重复",462,20,120,18,0x00ffffff,10,0,0,0);
	texts[3].setValues("随机",540,20,120,18,0x00ffffff,10,0,0,0);
	texts[4].setValues("播放状态",239,20,100,18,0x00ffffff,10,0,0,0);
	texts[5].setValues("标题",370,82,560,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("演唱者",370,123,460,25,0x00ffffff,10,0,0,0);
	texts[7].setValues("专辑",370,162,460,25,0x00ffffff,10,0,0,0);
	texts[8].setValues("流派",370,200,460,25,0x00ffffff,10,0,0,0);
	texts[9].setValues("年代",370,241,460,25,0x00ffffff,10,0,0,0);
	texts[10].setValues("曲目数量",107,20,160,18,0x00ffffff,10,0,0,0);
	texts[11].setValues("文件名",220,55,350,28,0x00ffffff,10,0,0,0);
	texts[12].setValues("设备类型",352,14,80,30,0x00ffffff,10,0,0,0);
	texts[13].setValues("媒体是否支持",262,300,220,28,0x00ffffff,10,0,0,0);
	texts[14].setValues("声道",623,510,140,24,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
