package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_MEDIA_PIC extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[8];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[4];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[8];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"MEDIA图片\\M_PIC.png",0,0,1,-1,0);
	pngs[1].setValues(null,"MEDIA图片\\M_PIC1.png",0,0,8,-1,0);
	pngs[2].setValues(null,"关屏与返回\\返回.png",653,1,1,-1,0);
	pngs[3].setValues("返回列表","关屏与返回\\返回1.png",652,2,0,-1,0);
	pngs[4].setValues(null,"关屏与返回\\主页.png",0,-1,1,-1,0);
	pngs[5].setValues("主界面返回","关屏与返回\\主页1.png",0,-1,0,-1,0);
	pngs[6].setValues(null,"pub\\返回并退出.png",744,0,1,-1,0);
	pngs[7].setValues("关闭","pub\\返回并退出1.png",745,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[4];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("媒体类型",69,17,80,22,0x00ffffff,10,0,0,0);
	texts[1].setValues("曲目数量",195,18,80,20,0x00ffffff,10,0,0,0);
	texts[2].setValues("播放状态",331,18,80,20,0x00ffffff,10,0,0,0);
	texts[3].setValues("文件名称",426,18,240,20,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
