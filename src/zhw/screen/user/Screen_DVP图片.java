package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_DVP图片 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[18];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[8];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[18];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"DVP图片\\DVP_PIC.png",0,0,1,-1,0);
	pngs[1].setValues(null,"DVP图片\\DVP_PIC1.png",0,0,8,-1,0);
	pngs[2].setValues("NUM","音乐播放\\曲目数.PNG",50,4,1,-1,0);
	pngs[3].setValues(null,"关屏与返回\\返回.png",653,1,1,-1,0);
	pngs[4].setValues("返回列表","关屏与返回\\返回1.png",652,2,0,-1,0);
	pngs[5].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[6].setValues("主界面","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[7].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[8].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	pngs[9].setValues("播放图标","播放控制图标\\播放.png",185,18,7,-1,0);
	pngs[10].setValues("暂停图标","播放控制图标\\暂停.png",184,17,7,-1,0);
	pngs[11].setValues("禁止图标","播放控制图标\\禁止.png",5,54,7,-1,0);
	pngs[12].setValues("随机图标","播放控制图标\\Random.png",514,16,7,-1,0);
	pngs[13].setValues("随机关图标","播放控制图标\\Random_disable.png",514,16,7,-1,0);
	pngs[14].setValues("重复关图标","播放控制图标\\Repeat_off.png",447,15,7,-1,0);
	pngs[15].setValues("单曲重复图标","播放控制图标\\Repeat_One.png",447,16,7,-1,0);
	pngs[16].setValues("重复所有图标","播放控制图标\\Repeat_All.png",448,16,7,-1,0);
	pngs[17].setValues("停止图标","播放控制图标\\停止.png",184,17,7,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[8];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("媒体类型",334,16,80,28,0x00ffffff,10,0,0,0);
	texts[1].setValues("曲目数量",96,20,80,20,0x00ffffff,10,0,0,0);
	texts[2].setValues("目录数量",563,482,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("播放状态",138,489,80,20,0x00ffffff,10,0,0,0);
	texts[4].setValues("重复模式",547,52,150,20,0x00ffffff,10,0,0,0);
	texts[5].setValues("随机模式",702,51,80,20,0x00ffffff,10,0,0,0);
	texts[6].setValues("收扩状态",568,20,80,20,0x00ffffff,10,0,0,0);
	texts[7].setValues("文件名称",230,19,100,20,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
