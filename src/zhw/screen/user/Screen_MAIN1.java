package zhw.screen.user;
import zhw.png.PNG_STRUCT;
import zhw.png.TXT_STRUCT;
import zhw.screen.Screen;
public class Screen_MAIN1 extends Screen{
	//public PNG_STRUCT pngStruct0[]=new PNG_STRUCT[83];
	//public TXT_STRUCT txtStruct[]=new TXT_STRUCT[0];
//pngLoc=-1;
//txtLoc=-1;
private void initPng(){
	PNG_STRUCT pngs[]=new PNG_STRUCT[83];
	for(int i=0;i<pngs.length;i++){
		pngs[i]=new PNG_STRUCT();
	}

	pngs[0].setValues(null,"�½���\\������.png",0,0,1,-1,0);
	pngs[1].setValues(null,"�½���\\title_bar.png",0,0,1,-1,0);
	pngs[2].setValues("����","�½���\\ͼ��\\����.png",1647,346,0,-1,0);
	pngs[3].setValues("������","�½���\\ͼ��\\������.png",1797,346,0,-1,0);
	pngs[4].setValues("����","�½���\\ͼ��\\����.png",1947,346,0,-1,0);
	pngs[5].setValues("DVD","�½���\\ͼ��\\DVD.png",2097,346,0,-1,0);
	pngs[6].setValues("SD��","�½���\\ͼ��\\SD��.png",2247,346,0,-1,0);
	pngs[7].setValues("USB","�½���\\ͼ��\\USB.PNG",847,136,0,-1,0);
	pngs[8].setValues("USB2","�½���\\ͼ��\\USB1.PNG",1786,136,0,-1,0);
	pngs[9].setValues("����","�½���\\ͼ��\\����.png",997,136,0,-1,0);
	pngs[10].setValues("��������","�½���\\ͼ��\\ǽֽ.png",1147,136,0,-1,0);
	pngs[11].setValues("IPOD","�½���\\ͼ��\\ipod.png",1800,500,0,-1,0);
	pngs[12].setValues("GPS�ź�","�½���\\ͼ��\\GPS�ź�.png",1297,136,0,-1,0);
	pngs[13].setValues("����","�½���\\ͼ��\\����.png",2100,500,0,-1,0);
	pngs[14].setValues("�ⲿ����","�½���\\ͼ��\\��Ƶ����.png",1447,136,0,-1,0);
	pngs[15].setValues("��������","�½���\\ͼ��\\��������.png",0,500,0,-1,0);
	pngs[16].setValues("T_����","�½���\\����\\ͼ������\\����.png",36,336,0,-1,0);
	pngs[17].setValues("T_������","�½���\\����\\ͼ������\\������.png",186,336,0,-1,0);
	pngs[18].setValues("T_����","�½���\\����\\ͼ������\\����.png",336,336,0,-1,0);
	pngs[19].setValues("T_DVD","�½���\\����\\ͼ������\\dvd.png",486,336,0,-1,0);
	pngs[20].setValues("T_SD��","�½���\\����\\ͼ������\\SD.png",636,336,0,-1,0);
	pngs[21].setValues("T_USB","�½���\\����\\ͼ������\\USB1.PNG",836,126,0,-1,0);
	pngs[22].setValues("T_USB2","�½���\\����\\ͼ������\\USB2.PNG",1786,126,0,-1,0);
	pngs[23].setValues("T_����","�½���\\����\\ͼ������\\����.png",986,126,0,-1,0);
	pngs[24].setValues("T_��������","�½���\\����\\ͼ������\\��������.png",1136,126,0,-1,0);
	pngs[25].setValues("T_IPOD","�½���\\����\\ͼ������\\IPOD.png",1286,126,0,-1,0);
	pngs[26].setValues("T_GPS�ź�","�½���\\����\\ͼ������\\GPS�ź�.png",1436,126,0,-1,0);
	pngs[27].setValues("T_����","�½���\\����\\ͼ������\\����.png",1636,126,0,-1,0);
	pngs[28].setValues("T_�ⲿ����","�½���\\����\\ͼ������\\�ⲿ����.png",1786,126,0,-1,0);
	pngs[29].setValues("T_��������","�½���\\����\\ͼ������\\��������.png",0,500,0,-1,0);
	pngs[30].setValues("T_��","�½���\\����\\����\\��.png",334,493,0,-1,0);
	pngs[31].setValues("T_��","�½���\\����\\����\\��.png",578,181,0,-1,0);
	pngs[32].setValues("T_��","�½���\\����\\����\\��.png",651,182,0,-1,0);
	pngs[33].setValues("T_XQ1","�½���\\����\\����\\XQ1.png",464,64,0,-1,0);
	pngs[34].setValues("T_XQ2","�½���\\����\\����\\XQ2.png",464,63,0,-1,0);
	pngs[35].setValues("T_XQ3","�½���\\����\\����\\XQ3.PNG",552,124,0,-1,0);
	pngs[36].setValues("T_XQ4","�½���\\����\\����\\XQ4.png",459,62,0,-1,0);
	pngs[37].setValues("T_XQ5","�½���\\����\\����\\XQ5.png",458,62,0,-1,0);
	pngs[38].setValues("T_XQ6","�½���\\����\\����\\XQ6.png",457,58,0,-1,0);
	pngs[39].setValues("T_XQ7","�½���\\����\\����\\XQ7.png",441,59,0,-1,0);
	pngs[40].setValues("����","�½���\\����\\����\\����.png",245,143,0,-1,0);
	pngs[41].setValues("B0","�½���\\����\\������\\0.png",94,121,0,-1,0);
	pngs[42].setValues("B1","�½���\\����\\������\\1.png",169,120,0,-1,0);
	pngs[43].setValues("B2","�½���\\����\\������\\2.png",277,121,0,-1,0);
	pngs[44].setValues("B3","�½���\\����\\������\\3.png",14,70,0,-1,0);
	pngs[45].setValues("B4","�½���\\����\\������\\4.png",344,121,0,-1,0);
	pngs[46].setValues("B5","�½���\\����\\������\\5.png",11,71,0,-1,0);
	pngs[47].setValues("B6","�½���\\����\\������\\6.PNG",14,66,0,-1,0);
	pngs[48].setValues("B7","�½���\\����\\������\\7.png",15,68,0,-1,0);
	pngs[49].setValues("B8","�½���\\����\\������\\8.png",10,68,0,-1,0);
	pngs[50].setValues("B9","�½���\\����\\������\\9.png",14,63,0,-1,0);
	pngs[51].setValues("L0","�½���\\����\\С����\\0.png",637,182,0,-1,0);
	pngs[52].setValues("L1","�½���\\����\\С����\\1.png",641,59,0,-1,0);
	pngs[53].setValues("L2","�½���\\����\\С����\\2.png",617,181,0,-1,0);
	pngs[54].setValues("L3","�½���\\����\\С����\\3.png",638,63,0,-1,0);
	pngs[55].setValues("L4","�½���\\����\\С����\\4.png",637,65,0,-1,0);
	pngs[56].setValues("L5","�½���\\����\\С����\\5.png",642,67,0,-1,0);
	pngs[57].setValues("L6","�½���\\����\\С����\\6.PNG",645,66,0,-1,0);
	pngs[58].setValues("L7","�½���\\����\\С����\\7.png",640,66,0,-1,0);
	pngs[59].setValues("L8","�½���\\����\\С����\\8.png",556,182,0,-1,0);
	pngs[60].setValues("L9","�½���\\����\\С����\\9.png",642,67,0,-1,0);
	pngs[61].setValues(null,"�½���\\Сͼ��\\BT-��.png",622,9,1,-1,0);
	pngs[62].setValues("BT","�½���\\Сͼ��\\BT-��.png",622,8,7,-1,0);
	pngs[63].setValues(null,"�½���\\Сͼ��\\sd-��.png",698,9,1,-1,0);
	pngs[64].setValues("SD","�½���\\Сͼ��\\sd-��.png",698,8,7,-1,0);
	pngs[65].setValues(null,"�½���\\Сͼ��\\usb1-��.png",588,8,1,-1,0);
	pngs[66].setValues("U_SB","�½���\\Сͼ��\\usb1-��.png",590,7,7,-1,0);
	pngs[67].setValues(null,"�½���\\Сͼ��\\usb2-��.png",654,8,1,-1,0);
	pngs[68].setValues("U_SB2","�½���\\Сͼ��\\usb2-��.png",656,7,7,-1,0);
	pngs[69].setValues(null,"�½���\\Сͼ��\\DVD-��.png",554,7,1,-1,0);
	pngs[70].setValues("L_DVD","�½���\\Сͼ��\\DVD-��.png",554,8,7,-1,0);
	pngs[71].setValues(null,"�½���\\��������ʾ.png",306,298,1,-1,0);
	pngs[72].setValues("P1","�½���\\������ѡ��״̬��ʾ.PNG",1906,298,0,-1,0);
	pngs[73].setValues("P2","�½���\\������ѡ��״̬��ʾ.PNG",1969,298,0,-1,0);
	pngs[74].setValues("P3","�½���\\������ѡ��״̬��ʾ.PNG",2032,298,0,-1,0);
	pngs[75].setValues("ʱ��","�½���\\����.png",456,66,7,-1,0);
	pngs[76].setValues(null,"�����Сͼ��\\�����Сͼ��.PNG",153,6,1,-1,0);
	pngs[77].setValues("�����","�����Сͼ��\\�����Сͼ�꿪��.PNG",153,5,0,-1,0);
	pngs[78].setValues("����0","�����뷵��\\����1.png",73,-1,7,-1,0);
	pngs[79].setValues("����","�����뷵��\\����2.png",73,-1,0,-1,0);
	pngs[80].setValues("����","�½���\\��ԭ.png",738,-1,7,-1,0);
	pngs[81].setValues("��ԭ","�½���\\��ԭ1.png",738,-1,0,-1,0);
	pngs[82].setValues("��","�½���\\��1.png",259,332,7,-1,0);
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
