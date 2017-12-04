package zhw.screen.action;

import java.util.Hashtable;

public class Bundle extends Hashtable<String, String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@SuppressWarnings("unchecked")
	public void putInt(String string, int a) {
		// TODO Auto-generated method stub
		this.put(string, a+"");
		
	}

	public int getInt(String msgName) {
		// TODO Auto-generated method stub
		String a=super.get(msgName);
		if(a==null)
			return -1;
		try{
			return Integer.parseInt(a);
		}catch(Exception e){
			
		}
		return -1;
		//return 0;
	}

}
