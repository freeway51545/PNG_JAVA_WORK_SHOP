package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_多媒体 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[29];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[11];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[29];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"歌曲库\\新的歌曲库.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("BUTTON","歌曲库\\下面点击.png",0,0,8,-1,0);
	pngs[3].setValues("L1","歌曲库\\长的点击.png",89,55,7,-1,0);
	pngs[4].setValues("L2","歌曲库\\长的点击.png",89,123,7,-1,0);
	pngs[5].setValues("L3","歌曲库\\长的点击.png",88,193,7,-1,0);
	pngs[6].setValues("L4","歌曲库\\长的点击.png",89,261,7,-1,0);
	pngs[7].setValues("L5","歌曲库\\长的点击.png",88,332,7,-1,0);
	pngs[8].setValues("滑动BEGIN","歌曲库\\滚动光标.png",20,123,7,-1,0);
	pngs[9].setValues("滑动","歌曲库\\滚动光标.png",20,213,7,-1,0);
	pngs[10].setValues("滑动END","歌曲库\\滚动光标.png",20,290,7,-1,0);
	pngs[11].setValues(null,"歌曲库\\暂停.png",730,112,7,-1,0);
	pngs[12].setValues(null,"歌曲库\\播放.png",722,52,7,-1,0);
	pngs[13].setValues("电影","USB\\电影.png",92,59,7,-1,0);
	pngs[14].setValues("音乐文件夹","USB\\音乐文件夹.png",98,299,7,-1,0);
	pngs[15].setValues("音乐文件夹1","USB\\音乐文件夹1.png",97,339,7,-1,0);
	pngs[16].setValues("电影文件夹","USB\\电影文件夹.png",95,133,7,-1,0);
	pngs[17].setValues("电影文件夹1","USB\\电影文件夹1.png",97,339,7,-1,0);
	pngs[18].setValues("音乐1","USB\\音乐1.png",92,193,7,-1,0);
	pngs[19].setValues("电影1","USB\\电影2.png",95,260,7,-1,0);
	pngs[20].setValues("音乐","USB\\音乐.png",247,273,7,-1,0);
	pngs[21].setValues(null,"USB\\播放条0.png",33,569,1,-1,0);
	pngs[22].setValues("进度条","USB\\播放条.png",51,579,7,-1,0);
	pngs[23].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[24].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[25].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[26].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[27].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[28].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[11];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("文件1",142,69,800,25,0x00ffffff,10,0,0,0);
	texts[1].setValues("文件2",146,129,800,28,0x00ffffff,10,0,0,0);
	texts[2].setValues("文件3",146,198,800,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("文件4",143,264,800,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("文件5",138,350,800,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("文件6",155,512,800,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("文件7",135,553,800,28,0x00ffffff,10,0,0,0);
	texts[7].setValues("时间",337,515,100,28,0x00ffffff,10,0,0,0);
	texts[8].setValues("标题",79,10,650,30,0x0000ff00,10,0,0,0);
	texts[9].setValues("文件数量",539,499,250,18,0x00ffffff,10,0,0,0);
	texts[10].setValues("曲目个数",585,378,250,19,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
