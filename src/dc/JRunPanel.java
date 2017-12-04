package dc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import zhw.png.FileOp;
import zhw.screen.Screen;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.action.ScreenEventManager;
import android.graphics.Canvas;

public class JRunPanel extends JPanel implements MouseListener {
	public JRunPanel() {
		this.addMouseListener(this);
	}

	public void paint(Graphics g) {
		super.paint(g);
		// System.out.println("set onDraw:" + this);
		Screen screen = ScreenEventManager.getActiveScreen();
		Canvas c = new Canvas();
		c.setG(g);
		g.setColor(Color.BLACK);
		g.drawRect(FileOp.TEST_DRAWX, FileOp.TEST_DRAWY, 800, 480);
		screen.drawOnScreen(c);
	}

	public void actionMouseEvent(MouseEvent e) {
		int x = e.getX() - FileOp.TEST_DRAWX;
		int y = e.getY() - FileOp.TEST_DRAWY;
		if (x < 0 || x > 1024)
			return;
		if (y < 0 || y > 600)
			return;
		// MSG_ZHW msg=new MSG_ZHW();

		Screen screen = ScreenEventManager.getActiveScreen();
		if (screen != null) {
			MSG_ZHW msg = new MSG_ZHW();
			// public MouseEvent(Component source, int id, long when, int
			// modifiers,
			// int x, int y, int clickCount, boolean popupTrigger)
			MouseEvent me = new MouseEvent(e.getComponent(), e.getID(),
					e.getWhen(), e.getModifiers(), x, y, e.getClickCount(),
					e.isPopupTrigger());
			msg.mouseEvent = me;
			ScreenEventManager.getActiveEvent().traslateMsg(screen, msg);
			if (ScreenEventManager.isBeNeedRedraw()) {
				// invalidate();
				repaint();
				ScreenEventManager.setBeNeedRedraw(false);
			}

		}
	}

	public void mouseClicked(MouseEvent e) {
		actionMouseEvent(e);
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		actionMouseEvent(e);
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		actionMouseEvent(e);
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
