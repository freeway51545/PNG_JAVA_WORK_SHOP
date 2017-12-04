package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_音频调节 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[10];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[31];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[10];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"音频调节\\音效设置.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"音频调节\\音效设置1.png",0,0,8,-1,0);
	pngs[3].setValues("平衡","音频调节\\声场.png",655,83,0,-1,0);
	pngs[4].setValues("开关","音频调节\\重低音.png",57,83,0,-1,0);
	pngs[5].setValues("重低音开","音频调节\\重低音_亮.png",57,83,7,-1,0);
	pngs[6].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[7].setValues("主页","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[8].setValues(null,"关屏与返回\\返回.png",683,1,1,-1,0);
	pngs[9].setValues("返回","关屏与返回\\返回1.png",683,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[31];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("关闭",50,422,60,26,0x00ffffff,10,0,0,0);
	texts[1].setValues("流行",266,422,60,26,0x00ffffff,10,0,0,0);
	texts[2].setValues("摇滚",157,422,60,26,0x00ffffff,10,0,0,0);
	texts[3].setValues("现场",377,422,60,26,0x00ffffff,10,0,0,0);
	texts[4].setValues("古典",705,422,60,26,0x00ffffff,10,0,0,0);
	texts[5].setValues("舞曲",484,422,60,26,0x00ffffff,10,0,0,0);
	texts[6].setValues("柔和",596,422,60,26,0x00ffffff,10,0,0,0);
	texts[7].setValues("响度值",706,118,40,20,0x00ffffff,10,0,0,0);
	texts[8].setValues("响度",708,331,40,20,0x00ffffff,10,0,0,0);
	texts[9].setValues("重低音",602,555,85,32,0x00ffffff,10,0,0,0);
	texts[10].setValues("开关",326,515,80,32,0x00ffffff,10,0,0,0);
	texts[11].setValues("VAL1",59,118,40,20,0x00ffffff,10,0,0,0);
	texts[12].setValues("VAL2",122,118,40,20,0x00ffffff,10,0,0,0);
	texts[13].setValues("VAL3",186,118,40,20,0x00ffffff,10,0,0,0);
	texts[14].setValues("VAL4",251,118,40,20,0x00ffffff,10,0,0,0);
	texts[15].setValues("VAL5",315,118,40,20,0x00ffffff,10,0,0,0);
	texts[16].setValues("VAL6",381,118,40,20,0x00ffffff,10,0,0,0);
	texts[17].setValues("VAL7",446,118,40,20,0x00ffffff,10,0,0,0);
	texts[18].setValues("VAL8",511,118,40,20,0x00ffffff,10,0,0,0);
	texts[19].setValues("VAL9",575,118,40,20,0x00ffffff,10,0,0,0);
	texts[20].setValues("VAL10",640,118,40,20,0x00ffffff,10,0,0,0);
	texts[21].setValues("32",64,331,40,20,0x00ffffff,10,0,0,0);
	texts[22].setValues("64",129,331,40,20,0x00ffffff,10,0,0,0);
	texts[23].setValues("150",190,331,40,20,0x00ffffff,10,0,0,0);
	texts[24].setValues("250",254,331,40,20,0x00ffffff,10,0,0,0);
	texts[25].setValues("500",320,331,40,20,0x00ffffff,10,0,0,0);
	texts[26].setValues("1K",391,331,40,20,0x00ffffff,10,0,0,0);
	texts[27].setValues("2K",453,331,40,20,0x00ffffff,10,0,0,0);
	texts[28].setValues("4K",519,331,40,20,0x00ffffff,10,0,0,0);
	texts[29].setValues("8K",587,331,40,20,0x00ffffff,10,0,0,0);
	texts[30].setValues("16K",646,331,40,20,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
