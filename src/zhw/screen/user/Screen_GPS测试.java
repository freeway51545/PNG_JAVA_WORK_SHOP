package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_GPS测试 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[7];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[31];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[7];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"GPS测试\\bg.png",0,0,1,-1,0);
	pngs[1].setValues(null,"新界面\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues(null,"GPS测试\\signal.png",0,0,8,-1,0);
	pngs[3].setValues(null,"关屏与返回\\主页.png",9,1,1,-1,0);
	pngs[4].setValues("主界面","关屏与返回\\主页1.png",9,1,0,-1,0);
	pngs[5].setValues(null,"关屏与返回\\返回.png",677,1,1,-1,0);
	pngs[6].setValues("返回","关屏与返回\\返回1.png",677,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[31];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	texts[0].setValues("GPS测试",85,8,200,33,0x00ffffff,10,0,0,0);
	texts[1].setValues("卫星颗数",262,133,150,33,0x00ffffff,10,0,0,0);
	texts[2].setValues("时间",269,201,150,33,0x00ffffff,10,0,0,0);
	texts[3].setValues("速度",280,539,150,33,0x00ffffff,10,0,0,0);
	texts[4].setValues("卫星颗数value",409,133,300,33,0x00ffffff,10,0,0,0);
	texts[5].setValues("时间value",406,202,350,33,0x00ffffff,10,0,0,0);
	texts[6].setValues("速度value",280,539,250,33,0x00ffffff,10,0,0,0);
	texts[7].setValues("编号1",79,446,36,23,0x00ffffff,10,0,0,0);
	texts[8].setValues("编号2",133,446,36,23,0x00ffffff,10,0,0,0);
	texts[9].setValues("编号3",188,446,36,23,0x00ffffff,10,0,0,0);
	texts[10].setValues("编号4",243,446,36,23,0x00ffffff,10,0,0,0);
	texts[11].setValues("编号5",299,446,36,23,0x00ffffff,10,0,0,0);
	texts[12].setValues("编号6",353,446,36,23,0x00ffffff,10,0,0,0);
	texts[13].setValues("编号7",408,446,36,23,0x00ffffff,10,0,0,0);
	texts[14].setValues("编号8",463,446,36,23,0x00ffffff,10,0,0,0);
	texts[15].setValues("编号9",518,446,36,23,0x00ffffff,10,0,0,0);
	texts[16].setValues("编号10",572,446,36,23,0x00ffffff,10,0,0,0);
	texts[17].setValues("编号11",627,446,36,23,0x00ffffff,10,0,0,0);
	texts[18].setValues("编号12",682,446,36,23,0x00ffffff,10,0,0,0);
	texts[19].setValues("snr1",79,411,36,19,0x00ffffff,10,0,0,0);
	texts[20].setValues("snr2",133,411,36,19,0x00ffffff,10,0,0,0);
	texts[21].setValues("snr3",188,411,36,19,0x00ffffff,10,0,0,0);
	texts[22].setValues("snr4",243,411,36,19,0x00ffffff,10,0,0,0);
	texts[23].setValues("snr5",299,411,36,19,0x00ffffff,10,0,0,0);
	texts[24].setValues("snr6",353,411,36,19,0x00ffffff,10,0,0,0);
	texts[25].setValues("snr7",408,411,36,19,0x00ffffff,10,0,0,0);
	texts[26].setValues("snr8",463,411,36,19,0x00ffffff,10,0,0,0);
	texts[27].setValues("snr9",518,411,36,19,0x00ffffff,10,0,0,0);
	texts[28].setValues("snr10",572,411,36,19,0x00ffffff,10,0,0,0);
	texts[29].setValues("snr11",627,411,36,19,0x00ffffff,10,0,0,0);
	texts[30].setValues("snr12",682,411,36,19,0x00ffffff,10,0,0,0);
	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
