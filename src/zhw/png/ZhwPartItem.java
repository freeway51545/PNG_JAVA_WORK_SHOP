package zhw.png;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ZhwPartItem {
	public String name;
	public int x; // 最多5个区域连成一片
	public int y; // 最多5个区域连成一片
	public int width=0;
	public int height=0;
	//public int picNo;
	//public int hbId;// 合并的ID，如果不为-1，就是被合并到其他对象上。
	private int picNo;

	public void setAsNewItem(int xSet, int ySet, int widthSet,int heightSet,String nameSet) {
			x=xSet;
			y=ySet;
			width=widthSet;
			height=heightSet;
			name=nameSet;
	}

	public boolean containt(char thisBloc[][]) {
		return false;
	}

	int readFile(BufferedReader br) throws IOException {
		String line=br.readLine();
		if(line==null)
			return 0;
		if(line.length()==0){
			line=br.readLine();
		}
		if(line==null)
			return 0;
		if(line.length()==0)
			return 0;
		StringTokenizer st=new StringTokenizer(line,"\t=");
		st.nextElement();
		if(st.hasMoreElements()){
			name=st.nextToken();
		}
		line = br.readLine();
		if(line==null)
			return 0;
		st=new StringTokenizer(line,"\t=,");
		while(st.hasMoreElements()){
			String id=st.nextToken();
		
			if(id.equals("x"))
			{
				x=ZhwPartInit.getNextInteger(st);
			}
			if(id.equals("y")){
				y=ZhwPartInit.getNextInteger(st);
			}
			if(id.equals("picNo")){
				picNo=ZhwPartInit.getNextInteger(st);
			}
			if(id.equals("width")){
				width=ZhwPartInit.getNextInteger(st);
			}
			if(id.equals("height")){
				height=ZhwPartInit.getNextInteger(st);
			}
		}
		if(width==0)
			width=50;
		if(height==0)
			height=50;
		return 1;
	}

	void writeFile(PrintWriter pw) {
		pw.println("\tname="+name);
		pw.printf("\tx=%d,y=%d,picNo=%d,width=%d,height=%d\r\n",x,y,picNo,width,height);
		pw.println();
	}
	
	public RECT getRect(){
		RECT r=new RECT();
		r.left=x;
		r.top=y;
		r.right=x+width;
		r.bottom=y+height;
		return r;
	}

	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setRect(RECT thisBox) {
		// TODO Auto-generated method stub
		x=thisBox.left;
		y=thisBox.top;
		width=thisBox.getWith();
		height=thisBox.getHeigt();
		
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		name=name2;
		
	}

}
