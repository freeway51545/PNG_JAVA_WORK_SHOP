package dc;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

import zhw.png.FileOp;

public class WorkDialog extends JFrame {
	private static Draw draw = new Draw();
	private static final long serialVersionUID = 1L;
	public static WorkDialog workDialog = null;
	// 用于处理拖动事件，表示鼠标按下时的坐标，相对于JFrame
	int xOld = 0;
	int yOld = 0;

	public WorkDialog() {
		this.setLayout(null);
		setUndecorated(true);

	}

	public static FileOp fo = new FileOp();

	public static void main(String args[]) {

		try {
			fo.loadSetting();
			draw.initData(fo);
			ZWAWTEventListener ZwL = new ZWAWTEventListener();
			ZwL.setFo(fo);
			Toolkit.getDefaultToolkit().addAWTEventListener(
					ZwL,
					AWTEvent.MOUSE_EVENT_MASK
							+ AWTEvent.MOUSE_MOTION_EVENT_MASK
							+ AWTEvent.MOUSE_WHEEL_EVENT_MASK
							+ AWTEvent.KEY_EVENT_MASK);
			ZwL.setDraw(draw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workDialog = new WorkDialog();
		workDialog
				.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		workDialog.setContentPane(draw);
		// wd.getContentPane();
		workDialog.show();
	}
}
