package zhw.screen.action.user;

import java.util.Hashtable;

import zhw.screen.action.BaseStateEventItem;

public class EventList {
	public static Hashtable<String,BaseStateEventItem>htMap=new Hashtable<String,BaseStateEventItem>();
	static{
		EventListData.init();
	}
	public static void addScren(String name,
			BaseStateEventItem h) {
		// TODO Auto-generated method stub
		htMap.put(name, h);
	}
	public static BaseStateEventItem getEventHandle(String scrnNo) {
		// TODO Auto-generated method stub
		return htMap.get(scrnNo);
	}
}
