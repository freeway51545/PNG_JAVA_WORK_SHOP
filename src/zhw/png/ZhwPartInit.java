package zhw.png;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

import dc.JCutDialog;

public class ZhwPartInit {
	public Vector<ZhwPartItem> vZhwPartItem = new Vector<ZhwPartItem>();
	String name;
	private int minAlfa;
	private PNG_STRUCT parent;
	public int getSize() {
		return vZhwPartItem.size();
	}

	public static int getNextInteger(StringTokenizer st) {
		if (st == null)
			return 0;
		if (st.hasMoreElements()) {
			String s = st.nextToken();
			s = s.trim();
			try {
				return Integer.parseInt(s);
			} catch (Exception e) {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public void readPartInit() throws IOException {
		clearAll();
		String ts = getFileName();
		File f=new File(ts);
		if(!f.exists())
			return;
		FileReader fis = new FileReader(ts);
		BufferedReader br = new BufferedReader(fis);
		String headLine = br.readLine();
		StringTokenizer st = new StringTokenizer(headLine, "= ");
		int iCount = 0;
		if (st.nextElement().equals("count")) {
			iCount = getNextInteger(st);
		}
		if(st.hasMoreElements()){
			if (st.nextElement().equals("minAlfa")) {
				minAlfa = getNextInteger(st);
			}
		}else{
			minAlfa=JCutDialog.ALL_MIN_ALFA_INIT;
		}
		for (int i = 0; i < iCount; i++) {
			ZhwPartItem zpi = new ZhwPartItem();
			if(zpi.readFile(br)==1){
				vZhwPartItem.add(zpi);
			}
		}
	}

	public void writePartInit() throws FileNotFoundException {
		String ts=getFileName();
		PrintWriter pw=new PrintWriter(ts);
		pw.printf("count=%d minAlfa=%d\r\n",vZhwPartItem.size(),minAlfa);
		for(int i=0;i<vZhwPartItem.size();i++){
			vZhwPartItem.get(i).writeFile(pw);
		}
		pw.close();
	}

	public void setName(String nameSet) {
		name = nameSet;
	}

	public ZhwPartItem findItem(char thisBloc[][]) {
		return null;
	}

	public void addNewItem(char thisBloc[][], int picNo) {

	}

	// void getFileName(char *fileName,int len);
	public String getFileName() {
		return "img\\" + name + "_files\\Part.ini";
	}

	public ZhwPartItem getNewItem() {
		return new ZhwPartItem();
	}

	public RECT getRect(int no) {
		if (no >= this.vZhwPartItem.size())
			return null;
		return vZhwPartItem.get(no).getRect();
	}

	public RECT getCombinRect(RECT rectFounc[], int no) {
		return null;
	}

	public ZhwPartItem locationRect(RECT rectFounc[], POINT p) {
		return null;
	}

	public String getName(int i) {
		// TODO Auto-generated method stub
		if (i >= this.vZhwPartItem.size())
			return null;
		return vZhwPartItem.get(i).getname();
	}

	public void clearAll() {
		// TODO Auto-generated method stub
		vZhwPartItem.clear();

	}

	public void add(ZhwPartItem makeNewItem) {
		// TODO Auto-generated method stub
		this.vZhwPartItem.add(makeNewItem);
	}

	public ZhwPartItem findItem(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0;i<this.vZhwPartItem.size();i++){
			if(this.vZhwPartItem.get(i).getRect().contents(x,y))
				return this.vZhwPartItem.get(i);
		}
		return null;		
	}

	public int getMinAlfa() {
		return minAlfa;
	}

	public void setMinAlfa(int minAlfa) {
		this.minAlfa = minAlfa;
	}

	public SUB_PNG_STRUCT findSub(String name2) {
		// TODO Auto-generated method stub
		for(int i=0;i<this.vZhwPartItem.size();i++){
			ZhwPartItem zpi=this.vZhwPartItem.get(i);
			if(name2.equals(zpi.getname())){
				SUB_PNG_STRUCT sub=new SUB_PNG_STRUCT();
				sub.initAs(zpi);
				//sub.setParent(vZhwPartItem.p)
			}
			
		}
		return null;
	}

	public PNG_STRUCT getParent() {
		return parent;
	}

	public void setParent(PNG_STRUCT parent) {
		this.parent = parent;
	}
}
