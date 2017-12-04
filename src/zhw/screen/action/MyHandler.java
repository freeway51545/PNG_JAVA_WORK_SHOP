package zhw.screen.action;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


class MyHandler extends Handler {

	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}
	/*
	public MyHandler() {
	}

	public MyHandler(Looper L) {
		super(L);
	}

	// 必须重写这个方法，用于处理message
	@Override
	public void handleMessage(Message msg) {
		// 这里用于更新UI
		Bundle b = msg.getData();
		// String process = b.getString("process");
		MSG_ZHW msgp = (MSG_ZHW) b.getSerializable("msg");
		int bseiId= b.getInt("SCRN_ID");
		BaseStateEventItem bsei;
		if(bseiId==-1){
			bsei=ScreenEventManager.getActiveEvent();
		}else{
			bsei=ScreenEventManager.getBaseStateEventItem(bseiId);
		}
		
		bsei.dispatch(msgp);
		// MainActivity.this.re
	}
	*/
};
