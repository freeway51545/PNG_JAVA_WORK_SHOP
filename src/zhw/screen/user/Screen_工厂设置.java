package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_工厂设置 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[7];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[23];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[7];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"厂商设置\\bg.png",0,0,1,-1,0);
	pngs[1].setValues(null,"厂商设置\\selected.png",0,0,8,-1,0);
	pngs[2].setValues("state","厂商设置\\state.png",117,504,7,-1,0);
	pngs[3].setValues(null,"关屏与返回\\主页.png",52,505,1,-1,0);
	pngs[4].setValues("主界面","关屏与返回\\主页1.png",57,512,0,-1,0);
	pngs[5].setValues(null,"预览图片\\小的设置键.png",12,2,0,-1,0);
	pngs[6].setValues("返回参数","预览图片\\小的设置键1.png",12,2,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[23];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("工厂设置",42,521,150,32,0x00ffffff,10,0,0,0);
	texts[1].setValues("机器类型",74,68,110,32,0x00ffffff,10,0,0,0);
	texts[2].setValues("按键2",218,63,82,30,0x00ffffff,10,0,0,0);
	texts[3].setValues("按键3",317,63,82,30,0x00ffffff,10,0,0,0);
	texts[4].setValues("8033",415,63,82,30,0x00ffffff,10,0,0,0);
	texts[5].setValues("协议盒类型",598,416,140,26,0x00ffffff,10,0,0,0);
	texts[6].setValues("PAGE",627,446,82,25,0x00ffffff,10,0,0,0);
	texts[7].setValues("分体机",27,183,100,32,0x00ffffff,10,0,0,0);
	texts[8].setValues("是",217,187,82,30,0x00ffffff,10,0,0,0);
	texts[9].setValues("否",316,187,82,30,0x00ffffff,10,0,0,0);
	texts[10].setValues("是否支持键扫",25,311,170,32,0x00ffffff,10,0,0,0);
	texts[11].setValues("支持",218,313,82,30,0x00ffffff,10,0,0,0);
	texts[12].setValues("不支持",317,313,82,30,0x00ffffff,10,0,0,0);
	texts[13].setValues("保存",95,426,100,35,0x00ffffff,10,0,0,0);
	texts[14].setValues("返回",339,426,100,35,0x00ffffff,10,0,0,0);
	texts[15].setValues("L0",556,14,180,32,0x00ffffff,10,0,0,0);
	texts[16].setValues("L1",556,63,180,32,0x00ffffff,10,0,0,0);
	texts[17].setValues("L2",556,112,180,32,0x00ffffff,10,0,0,0);
	texts[18].setValues("L3",556,161,180,32,0x00ffffff,10,0,0,0);
	texts[19].setValues("L4",556,210,180,32,0x00ffffff,10,0,0,0);
	texts[20].setValues("L5",556,259,180,32,0x00ffffff,10,0,0,0);
	texts[21].setValues("L6",556,308,180,32,0x00ffffff,10,0,0,0);
	texts[22].setValues("L7",556,357,180,32,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
