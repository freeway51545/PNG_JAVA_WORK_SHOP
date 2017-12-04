package dc;

import java.awt.Component;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JRunDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JRunDialog(JFrame wd, int actScrenNo) {
		// TODO Auto-generated constructor stub 
		super(wd);
		this.setModal(true);
		this.getContentPane().setLayout(null);
		setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		setLocation(0, 0);
		this.add(getCmdPanel());
		// toCutPng = toCutScreen.getToCutPng();
		// autoCutePic(false);

		// Screen screen = ScreenEventManager.getActiveScreen();

	}

	private Component getCmdPanel() {
		// TODO Auto-generated method stub
		JPanel jp = new JRunPanel();
		// jp.addMouseListener(jp);
		jp.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		jp.setPreferredSize(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize());
		return jp;
	}

	/*
	 * public void paint(Graphics g) { super.paint(g);
	 * //System.out.println("set onDraw:" + this); Screen screen =
	 * ScreenEventManager.getActiveScreen(); Canvas c = new Canvas(); c.setG(g);
	 * screen.drawOnScreen(c);
	 * 
	 * /* PNG_STRUCT pngstrcut=new PNG_STRUCT(); //pngstrcut. //pngstrcut. * /
	 * if(imageBitmap==null){ //String mPath =
	 * Environment.getExternalStorageDirectory().toString(); imageBitmap=
	 * BitmapFactory.decodeFile("/mnt/external_sd/ѡǰ.png"); } super.onDraw(c);
	 * Paint p=new Paint(); p.setColor(0xff00ff); p.setAlpha(100); c.drawLine(0,
	 * 0, 100, 100, p); if(imageBitmap!=null){ p.setAlpha(255);
	 * c.drawBitmap(imageBitmap, 0, 0,p); c.drawBitmap(imageBitmap, 200, 200,p);
	 * } /* / // c.drawBitmap(bitmap, left, top, paint) }
	 */

}
