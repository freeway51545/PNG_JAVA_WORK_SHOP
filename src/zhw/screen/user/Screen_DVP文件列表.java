package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP文件列表 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[28];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[7];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[28];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP文件列表\\DVP_FL.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BUTTON","DVP文件列表\\DVP_FL1.png",0,0,8,-1,0);
	pngs[3].setValues("L1","DVP文件列表\\长的点击.png",90,57,7,-1,0);
	pngs[4].setValues("L2","DVP文件列表\\长的点击.png",90,127,7,-1,0);
	pngs[5].setValues("L3","DVP文件列表\\长的点击.png",90,198,7,-1,0);
	pngs[6].setValues("L4","DVP文件列表\\长的点击.png",90,269,7,-1,0);
	pngs[7].setValues("L5","DVP文件列表\\长的点击.png",90,340,7,-1,0);
	pngs[8].setValues("L6","DVP文件列表\\长的点击.png",89,410,7,-1,0);
	pngs[9].setValues("滑动BEGIN","DVP文件列表\\滚动光标.png",20,154,7,-1,0);
	pngs[10].setValues("滑动","DVP文件列表\\滚动光标.png",19,238,7,-1,0);
	pngs[11].setValues("滑动END","DVP文件列表\\滚动光标.png",20,321,7,-1,0);
	pngs[12].setValues("电影","DVP文件列表\\电影.png",95,144,7,-1,0);
	pngs[13].setValues("电影1","DVP文件列表\\电影1.png",94,146,7,-1,0);
	pngs[14].setValues("音乐","DVP文件列表\\音乐.png",94,207,7,-1,0);
	pngs[15].setValues("音乐1","DVP文件列表\\音乐1.png",93,208,7,-1,0);
	pngs[16].setValues("文件夹","DVP文件列表\\文件夹.png",95,81,7,-1,0);
	pngs[17].setValues("文件夹1","DVP文件列表\\文件夹1.png",94,78,7,-1,0);
	pngs[18].setValues("图片","DVP文件列表\\图片.png",91,283,7,-1,0);
	pngs[19].setValues("图片1","DVP文件列表\\图片1.png",92,287,7,-1,0);
	pngs[20].setValues(null,"关屏与返回\\关屏1.png",-5,502,0,-1,0);
	pngs[21].setValues("关屏","关屏与返回\\关屏2.png",82,509,0,-1,0);
	pngs[22].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[23].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[24].setValues(null,"关屏与返回\\返回.png",653,1,1,-1,0);
	pngs[25].setValues("返回列表","关屏与返回\\返回1.png",652,2,0,-1,0);
	pngs[26].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[27].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[7];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("文件1",156,80,550,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("文件2",156,152,550,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("文件3",156,220,550,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("文件4",157,293,550,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("文件5",157,358,550,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("文件6",158,428,550,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("目录",71,16,550,30,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
