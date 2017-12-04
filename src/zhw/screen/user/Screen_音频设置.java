package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_音频设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[16];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"音频设置\\新的音频设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"音频设置\\新的音频设置1.png",0,0,8,-1,0);
	pngs[3].setValues("滑块","音频设置\\滑块.png",372,96,0,-1,0);
	pngs[4].setValues(null,"关屏与返回\\关屏1.png",139,500,1,-1,0);
	pngs[5].setValues("关屏","关屏与返回\\关屏2.png",210,497,0,-1,0);
	pngs[6].setValues(null,"关屏与返回\\返回.png",725,2,1,-1,0);
	pngs[7].setValues("返回按钮","关屏与返回\\返回1.png",724,2,0,-1,0);
	pngs[8].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[9].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[16];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("音频设置",272,581,400,30,0x00ffffff,10,0,0,0);
	texts[1].setValues("流行",38,526,80,26,0x00ffffff,10,0,0,0);
	texts[2].setValues("摇滚",230,513,80,28,0x00ffffff,10,0,0,0);
	texts[3].setValues("爵士",344,516,80,28,0x00ffffff,10,0,0,0);
	texts[4].setValues("古典",472,519,80,28,0x00ffffff,10,0,0,0);
	texts[5].setValues("标准",606,517,80,28,0x00ffffff,10,0,0,0);
	texts[6].setValues("前",380,601,40,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("后",558,585,40,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("左",466,571,40,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("右",669,557,40,20,0x00ffffff,10,0,0,0);
	texts[10].setValues("高音",247,412,85,18,0x00ffffff,10,0,0,0);
	texts[11].setValues("低音",74,412,85,18,0x00ffffff,10,0,0,0);
	texts[12].setValues("中音",165,412,85,18,0x00ffffff,10,0,0,0);
	texts[13].setValues("响度",327,412,100,18,0x00ffffff,10,0,0,0);
	texts[14].setValues("响度频率",414,412,100,18,0x00ffffff,10,0,0,0);
	texts[15].setValues("响度频率VALUE",263,509,100,16,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
