package dc;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import zhw.png.FileOp;

public class ZWAWTEventListener implements AWTEventListener {
	FileOp fo;
	private Draw draw;

	public void eventDispatched(AWTEvent event) {
		// TODO Auto-generated method stub
		if (MouseEvent.class.isInstance(event)) {
			MouseEvent me = (MouseEvent) event;

			if (me.getID() == MouseEvent.MOUSE_RELEASED/* 鼠标按下后释放时触发 */) {
				if (me.getSource() == getDraw()) {
					// 你的处理方法在这
					// fo.moveTo(me.getX(), me.getY());
				}
			}
		}

		if (KeyEvent.class.isInstance(event) && draw.state == Draw.ST_WOK) {
			KeyEvent ke = (KeyEvent) event;
			// System.out.println("KEY EVENT id= "+ke.getID());
			if (ke.getID() == KeyEvent.KEY_PRESSED) {
				/* 键盘按下后释放时触发 */
				switch (ke.getKeyCode()) {
				case KeyEvent.VK_ESCAPE:
					System.exit(0);
					break;
				case KeyEvent.VK_UP:
					fo.move(0, -1);
					break;
				case KeyEvent.VK_DOWN:
					fo.move(0, 1);
					break;
				case KeyEvent.VK_LEFT:
					fo.move(-1, 0);
					break;
				case KeyEvent.VK_RIGHT:
					fo.move(1, 0);
					break;
				}
			}

		}
		// 好些呢,
	}

	public void setFo(FileOp foSet) {
		// TODO Auto-generated method stub
		fo = foSet;
	}

	public Draw getDraw() {
		return draw;
	}

	public void setDraw(Draw draw) {
		this.draw = draw;
	}
}
