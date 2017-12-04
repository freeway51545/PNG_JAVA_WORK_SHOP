package zhw.png;

public class RECT {
	public	int left, top, right, bottom;

	public void larg(int i) {
		// TODO Auto-generated method stub
		left-=2;
		top-=2;
		right+=2;
		bottom+=2;
	}

	public int getWith() {
		// TODO Auto-generated method stub
		return right-left;
	}

	public int getHeigt() {
		// TODO Auto-generated method stub
		return bottom-top;
	}

	public void move(int testDrawx, int testDrawy) {
		// TODO Auto-generated method stub
		left+=testDrawx;
		top+=testDrawy;
		right+=testDrawx;
		bottom+=testDrawy;
	}

	public boolean contents(int x, int y) {
		// TODO Auto-generated method stub
		if(x<left||x>right)
			return false;
		if(y<top||y>bottom)
			return false;
		return true;
		
	}
}
