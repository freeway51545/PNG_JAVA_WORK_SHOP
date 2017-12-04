package zhw.com.py;

import java.util.Collections;
import java.util.Vector;

public class PyList {

	private PyList() {

	}

	private static PyList inst = new PyList();

	public static PyList getInst() {
		return inst;
	}

	boolean isInied = false;
	public static int MAX = 20758;
	public static int hzUnicode[] = new int[MAX];
	public static String hzPy[] = new String[MAX];

	public void init() {
		if (isInied) {
			return;
		}
		isInied = true;
		A0.loadData(hzUnicode, hzPy);
		A0.loadData(hzUnicode, hzPy);
		A1.loadData(hzUnicode, hzPy);
		A2.loadData(hzUnicode, hzPy);
		A3.loadData(hzUnicode, hzPy);
		A4.loadData(hzUnicode, hzPy);
		A5.loadData(hzUnicode, hzPy);
		A6.loadData(hzUnicode, hzPy);
		A7.loadData(hzUnicode, hzPy);
		A8.loadData(hzUnicode, hzPy);
		A9.loadData(hzUnicode, hzPy);
		A10.loadData(hzUnicode, hzPy);
		A11.loadData(hzUnicode, hzPy);
		A12.loadData(hzUnicode, hzPy);
		A13.loadData(hzUnicode, hzPy);
		A14.loadData(hzUnicode, hzPy);
		A15.loadData(hzUnicode, hzPy);
		A16.loadData(hzUnicode, hzPy);
		A17.loadData(hzUnicode, hzPy);
		A18.loadData(hzUnicode, hzPy);
		A19.loadData(hzUnicode, hzPy);
		A20.loadData(hzUnicode, hzPy);
	}

	String findPy(int hz)// 二分查找，返回有序表中大于等于x的元素位置
	{
		int low = 0, high = MAX - 1, mid, t;
		while (low <= high) {
			mid = (low + high) / 2;
			// t=strcmp(a[mid],x);//比较中点位置与x
			t = hzUnicode[mid] - hz;
			if (t == 0)
				return hzPy[mid];// 相等返回其位置
			else if (t > 0)
				high = mid - 1;// x小于mid元素，则在中点前
			else
				low = mid + 1;
		}
		return null;// 返回大于x的第一个元素
	}

	public String get(char c) {
		// TODO Auto-generated method stub
		String py = findPy(c);
		if (py == null) {
			return String.valueOf((int) c) + "_";
			// String.to
		}
		return py;
	}

	public void selfTest() {
		// TODO Auto-generated method stub
		init();
		String s[] = { "张伟1", "张伟2", "张a伟2", "尹洪", "马英东", };
	};
}
