package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_SDUSB_LOAD extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[17];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[17];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues("LD1","������\\LD\\01.png",330,168,7,-1,0);
	pngs[1].setValues("LD2","������\\LD\\02.png",331,168,7,-1,0);
	pngs[2].setValues("LD3","������\\LD\\03.png",331,168,7,-1,0);
	pngs[3].setValues("LD4","������\\LD\\04.png",332,169,7,-1,0);
	pngs[4].setValues("LD5","������\\LD\\05.png",332,172,7,-1,0);
	pngs[5].setValues("LD6","������\\LD\\06.png",331,173,7,-1,0);
	pngs[6].setValues("LD7","������\\LD\\07.png",330,171,7,-1,0);
	pngs[7].setValues("LD8","������\\LD\\08.png",330,172,7,-1,0);
	pngs[8].setValues("LD9","������\\LD\\09.png",330,171,7,-1,0);
	pngs[9].setValues("LD10","������\\LD\\10.png",330,170,7,-1,0);
	pngs[10].setValues("LD11","������\\LD\\11.png",329,171,7,-1,0);
	pngs[11].setValues("LD12","������\\LD\\12.png",329,169,7,-1,0);
	pngs[12].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[13].setValues("SD��","������\\sd��.png",30,6,7,-1,0);
	pngs[14].setValues("USB��","������\\USB.png",28,5,7,-1,0);
	pngs[15].setValues(null,"pub\\���ز��˳�.png",711,1,1,-1,0);
	pngs[16].setValues("ȡ��","pub\\���ز��˳�1.png",711,0,0,-1,0);
	setPngs(pngs);}
private void initTxt(){
TXT_STRUCT	texts[]=new TXT_STRUCT[0];
	for(int i=0;i<texts.length;i++){
		texts[i]=new TXT_STRUCT();
	}

	setTexts(texts);}
	public void init(){
		initPng();
		initTxt();
}
}
