package dc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import zhw.png.BaseItem;
import zhw.png.FileOp;
import zhw.png.IShowCondistionConst;
import zhw.png.PNG_STRUCT;
import zhw.png.ScreenGraphic;
import zhw.screen.action.ScreenEventManager;

public class Draw extends JPanel implements ListSelectionListener,
		MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane jsp, itemJsp;
	private JList<String> list;
	private JList<String> itemList;
	DefaultListModel<String> listModel;
	DefaultListModel<String> itemListModel;
	FileOp fo;
	private boolean beDisableSelect;
	private JLabel jlable;
	public final static int ST_WOK = 0;
	public final static int ST_CUT = 1;
	public final static int ST_RUN = 2;
	public int state = ST_WOK;

	public Draw() {
		this.setLayout(null);
		listModel = new DefaultListModel<String>();
		itemListModel = new DefaultListModel<String>();

		// 然后创建JList：

		list = new JList<String>(listModel);
		itemList = new JList<String>(itemListModel);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// 当然可以给它加监听:
		jsp = new JScrollPane(list);
		jsp.setBounds(1024 + FileOp.TEST_DRAWX + 10, 40, 300, 400);
		list.addListSelectionListener(this);

		itemJsp = new JScrollPane(itemList);
		itemJsp.setBounds(1024 + FileOp.TEST_DRAWX + 10, 50 + 400, 300, 400);
		itemList.addListSelectionListener(this);

		this.add(jsp);
		//
		add(getpCmd1());
		this.add(itemJsp);
		// //////////////////
		// 添加命令Panel //
		// //////////////////
		this.add(getCmdPanel());
		list.setRequestFocusEnabled(false);
		itemList.setRequestFocusEnabled(false);
		this.addMouseListener(this);
		jlable = new JLabel();
		Dimension d = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		jlable.setLocation(1024 + 100, d.height - 30);
		jlable.setSize(300, 30);
		this.add(jlable);
		this.add(getShowOption());
	}

	private Component getpCmd1() {
		// TODO Auto-generated method stub
		JPanel pCmd1 = new JPanel();
		pCmd1.setBounds(1024 + FileOp.TEST_DRAWX + 310, 400, 80, 400);
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		JPanel jpBlank = new JPanel();
		jpBlank.setPreferredSize(new Dimension(30, 30));
		pCmd1.setLayout(fl);
		pCmd1.add(getSort());
		pCmd1.add(jpBlank);
		pCmd1.add(getAddFile());
		pCmd1.add(getChangeFile());
		pCmd1.add(getMoveUp());
		pCmd1.add(getMoveDown());
		pCmd1.add(getDeletDown());
		pCmd1.add(getPrevBn());
		pCmd1.add(getNextBn());
		pCmd1.add(getSameBn());
		return pCmd1;
	}

	private Component getSort() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("Sort");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fo.sortScreen();
				reloadFoData();
			};
		});
		return jb;
	}

	private Component getDeletDown() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("D");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (fo.getCurrentScreen().removeCurrent()) {
					if (itemList.getSelectedIndex() > 0) {
						itemListModel.remove(itemList.getSelectedIndex());
					}
				}
			};
		});
		return jb;
	}

	private Component getMoveDown() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("V");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (fo.getCurrentScreen().moveDownCurrent()) {
					int nSelect = itemList.getSelectedIndex();
					if (nSelect >= 0 && nSelect < itemListModel.getSize()) {
						String str1 = itemListModel.get(nSelect + 1);
						String str2 = itemListModel.get(nSelect);
						itemListModel.set(nSelect, str1);
						itemListModel.set(nSelect + 1, str2);
						itemList.setSelectedIndex(nSelect + 1);
					}
				}
			};
		});
		return jb;
	}

	private Component getMoveUp() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("^");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (fo.getCurrentScreen().moveUpCurrent()) {
					int nSelect = itemList.getSelectedIndex();
					if (nSelect > 0) {
						String str1 = itemListModel.get(nSelect - 1);
						String str2 = itemListModel.get(nSelect);
						itemListModel.set(nSelect, str1);
						itemListModel.set(nSelect - 1, str2);
						itemList.setSelectedIndex(nSelect - 1);
					}
				}
			};
		});
		return jb;
	}

	private FileDialog fileDialog;
	private String filePath = null;

	private Component getChangeFile() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("C");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BaseItem bi = fo.getCurrentScreen().getActiveItem();
				int n = fo.getAmount(bi.getName());
				if (n > 3) {
					int result = JOptionPane.showConfirmDialog(
							WorkDialog.workDialog, "PUB PIC", "CHANGED IS ?",
							JOptionPane.YES_NO_OPTION);
					if (result != JOptionPane.YES_OPTION) {
						return;
					}
				}
				if (bi instanceof PNG_STRUCT) {
					if (fileDialog == null) {
						fileDialog = new FileDialog(WorkDialog.workDialog);
					}
					if (filePath != null) {
						fileDialog.setDirectory(filePath);
					}
					fileDialog.show();
					String fileName = fileDialog.getFile();
					if (fileName != null) {
						filePath = fileDialog.getDirectory();
						PNG_STRUCT png = (PNG_STRUCT) bi;
						png.replaceImage(filePath + "\\" + fileName);
						repaint();
					}
				}
			};
		});
		return jb;
	}

	private FileDialog fileDialogAdd;
	String filePathAdd = "E:\\Android_DC\\F102_JAVA_IMAGE\\img";

	private Component getAddFile() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("A");
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (fileDialogAdd == null) {
					fileDialogAdd = new FileDialog(WorkDialog.workDialog);
				}
				fileDialogAdd.setDirectory(filePathAdd);
				fileDialogAdd.show();
				String fileName = fileDialogAdd.getFile();
				if (fileName != null) {
					filePathAdd = fileDialogAdd.getDirectory();
					if (filePathAdd
							.startsWith("E:\\Android_DC\\F102_JAVA_IMAGE\\img")) {
						String allFileName = filePathAdd + fileName;
						allFileName = allFileName.toLowerCase();
						fo.getCurrentScreen().addPng(allFileName);
						// int n=fo.getCurrentScreen().n
						int n = fo.getCurrentScreen().getnSelectItem();
						initOneScreen();
						// int pngLen =
						// fo.getCurrentScreen().pnStructList.size();
						itemList.setSelectedIndex(n);
					} else {
						JOptionPane
								.showConfirmDialog(WorkDialog.workDialog,
										"只支持 在E:\\Android_DC\\F102_JAVA_IMAGE\\img 目录下 选择文件");
					}
				}
			};
		});
		return jb;
	}

	private JPanel getShowOption() {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEADING);
		jp.setBounds(1024 + FileOp.TEST_DRAWX +310, 100, 100, 400);
		jp.setLayout(fl);
		jp.add(getCkACTION());
		jp.add(getCkBACK());
		jp.add(getCkBLANK());
		jp.add(getCkFREE());
		jp.add(getCkHide());
		JPanel j0 = new JPanel();
		j0.setPreferredSize(new Dimension(20, 30));
		jp.add(j0);
		jp.add(getCkLongPress());
		// / final static String showName[] = { "ACTION", "BACK", "BLANK", "3",
		// "4", "5", "6", "FREE", "PICS" };
		return jp;
	}

	private JCheckBox jcbLongPressing;

	private Component getCkLongPress() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (jcbLongPressing != null) {
			return jcbLongPressing;
		}
		jcbLongPressing = new JCheckBox();
		jcbLongPressing.setText("long pressing");
		jcbLongPressing.addItemListener(longPressingListener);
		return jcbLongPressing;
	}

	private JCheckBox jcbFree;
	private JCheckBox jcbBlank;
	private JCheckBox jcbBACK;
	private JCheckBox jcbACTION;
	private JCheckBox jcbHide;

	protected int getShowCondistion(JCheckBox jCheckBox) {
		// TODO Auto-generated method stub
		String string = jCheckBox.getText();
		for (int i = 0; i < IShowCondistionConst.showName.length; i++) {
			if (string.equals(IShowCondistionConst.showName[i])) {
				return i;
			}
		}
		return IShowCondistionConst.N_HIDE;
	}

	protected void setShowCondition() {
		// TODO Auto-generated method stub
		BaseItem bi = fo.getCurrentScreen().getActiveItem();
		if (bi == null)
			return;
		bi = fo.getCurrentScreen().getActiveItem();
		if (bi != null) {
			if (bi.getClass() == PNG_STRUCT.class) {
				JCheckBox jcba[] = { jcbFree, jcbBlank, jcbBACK, jcbACTION,
						jcbHide };
				String toFind = IShowCondistionConst.showName[bi.showCondition];
				for (int i = 0; i < jcba.length; i++) {
					String name = jcba[i].getText();
					if (name.equals(toFind)) {
						jcba[i].setSelected(true);
					} else {
						jcba[i].setSelected(false);
					}
				}
				this.jcbLongPressing.setSelected(((PNG_STRUCT) bi)
						.isLongPressed());
			}
		}

	}

	ItemListener longPressingListener = new ItemListener() {
		JCheckBox jCheckBox;

		public void itemStateChanged(ItemEvent e) {
			jCheckBox = (JCheckBox) e.getSource();

			// add[Integer.valueOf(jCheckBox.getText())] = 1;
			BaseItem bi = fo.getCurrentScreen().getActiveItem();
			if (bi == null)
				return;
			bi = fo.getCurrentScreen().getActiveItem();
			if (bi != null) {
				if (bi.getClass() == PNG_STRUCT.class) {
					PNG_STRUCT png = (PNG_STRUCT) bi;
					png.setLongPressingAction(jCheckBox.isSelected());
					refreshListActionMode();
				}
			}

		}
	};

	ItemListener itemListener = new ItemListener() {
		JCheckBox jCheckBox;

		public void itemStateChanged(ItemEvent e) {
			jCheckBox = (JCheckBox) e.getSource();

			if (jCheckBox.isSelected()) {
				// add[Integer.valueOf(jCheckBox.getText())] = 1;
				BaseItem bi = fo.getCurrentScreen().getActiveItem();
				if (bi == null)
					return;
				bi = fo.getCurrentScreen().getActiveItem();
				if (bi != null) {
					if (bi.getClass() == PNG_STRUCT.class) {
						PNG_STRUCT png = (PNG_STRUCT) bi;
						png.showCondition = getShowCondistion(jCheckBox);
						setShowCondition();
						refreshListActionMode();
					}
				}
			}

		}
	};

	// JCheckBox jcb=null;
	private Component getCkFREE() {
		// TODO Auto-generated method stub
		if (jcbFree != null) {
			return jcbFree;
		}
		jcbFree = new JCheckBox();
		jcbFree.setText(IShowCondistionConst.showName[7]);
		jcbFree.addItemListener(itemListener);
		return jcbFree;
	}

	private Component getCkHide() {
		// TODO Auto-generated method stub
		if (jcbHide != null) {
			return jcbHide;
		}
		jcbHide = new JCheckBox();
		jcbHide.setText(IShowCondistionConst.showName[3]);
		jcbHide.addItemListener(itemListener);
		return jcbHide;
	}

	private Component getCkBLANK() {
		// TODO Auto-generated method stub
		if (jcbBlank != null) {
			return jcbBlank;
		}
		jcbBlank = new JCheckBox();
		jcbBlank.setText(IShowCondistionConst.showName[2]);
		jcbBlank.addItemListener(itemListener);
		return jcbBlank;
	}

	private Component getCkBACK() {
		// TODO Auto-generated method stub
		if (jcbBACK != null) {
			return jcbBACK;
		}
		jcbBACK = new JCheckBox();
		jcbBACK.setText(IShowCondistionConst.showName[1]);
		jcbBACK.addItemListener(itemListener);
		return jcbBACK;
	}

	private Component getCkACTION() {
		// TODO Auto-generated method stub
		if (jcbACTION != null) {
			return jcbACTION;
		}
		jcbACTION = new JCheckBox();
		jcbACTION.setText(IShowCondistionConst.showName[0]);
		jcbACTION.addItemListener(itemListener);
		return jcbACTION;
	}

	private JPanel getCmdPanel() {
		// TODO Auto-generated method stub
		JPanel jp = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		jp.setLayout(fl);
		jp.setLocation(10, 10);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		d.height = 80;
		d.width -= 20;
		jp.setSize(d);
		jp.add(getLoadBn());
		jp.add(getSaveBn());
		jp.add(getSaveCBn());
		jp.add(getCutAction());
		jp.add(getShowActionBn());
		jp.add(getRunBn());
		jp.add(getAlignAll());
		jp.add(getAddAction());

		return jp;
	}

	JButton jbActionAddRemove;

	private Component getAddAction() {
		// TODO Auto-generated method stub
		jbActionAddRemove = new JButton();
		jbActionAddRemove.setText("添加Action");
		jbActionAddRemove.setEnabled(false);
		jbActionAddRemove.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BaseItem bi = fo.getCurrentScreen().getActiveItem();
				if (bi != null) {
					if (bi.getClass() == PNG_STRUCT.class) {
						PNG_STRUCT png = (PNG_STRUCT) bi;
						if (png.hasFuction()) {
							png.removeFunction();
						} else {
							png.addFunction();
						}
						updateShow();
						refreshListActionMode();
					}
				}
				// ScreenGraphic sg = fo.allScreen.get(nScreenAct);
			};
		});
		return jbActionAddRemove;
	}

	private Component getAlignAll() {
		// TODO Auto-generated method stub
		JButton jbAlignAll = new JButton();
		jbAlignAll.setText("对齐所有界面");
		jbAlignAll.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n = itemList.getSelectedIndex();
				int nScreenAct = list.getSelectedIndex();
				ScreenGraphic sg = fo.allScreen.get(nScreenAct);
				if (sg != null) {
					fo.setAllItemLocationAs(sg, n);
				}

				// ScreenGraphic sg = fo.allScreen.get(nScreenAct);
			};
		});
		return jbAlignAll;

	}

	private Component getRunBn() {
		// TODO Auto-generated method stub
		JButton jbRun = new JButton();
		jbRun.setText("运  行");
		jbRun.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nScreenAct = list.getSelectedIndex();
				ScreenGraphic sg = fo.allScreen.get(nScreenAct);
				state = ST_RUN;
				if (sg != null) {
					boolean b = ScreenEventManager.setActiveScreen("SCRN_"
							+ sg.screenId);
					if (b) {
						JRunDialog jrd = new JRunDialog(WorkDialog.workDialog,
								nScreenAct);
						jrd.show();
					} else {
						JOptionPane.showMessageDialog(WorkDialog.workDialog,
								"没有对应的事件处理器");
					}
				}
				state = ST_WOK;
				// ScreenEventManager.getActiveScreen();
			}

		});
		return jbRun;
	}

	private Component getShowActionBn() {
		// TODO Auto-generated method stub

		JButton bnButton = new JButton();
		bnButton.setText("动  作");
		bnButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// beginCut();
				// fo.loadSetting();
				fo.getCurrentScreen().showAllItems(Draw.this);

			}

		});

		return bnButton;
		/*
		 * case IDC_ACTIONS: activeScreen->showAllItems(); break; return null;
		 */
	}

	private Component getCutAction() {
		// TODO Auto-generated method stub
		JButton jbCut = new JButton();
		jbCut.setText("剪切");
		jbCut.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				beginCut();
				// fo.loadSetting();

			}

		});

		return jbCut;
	}

	protected void beginCut() {
		// TODO Auto-generated method stub
		if (!fo.getCurrentScreen().locationCutPic()) {
			JOptionPane.showMessageDialog(this, "没有可意剪切的图片", "提示", 0, null);
			// MessageBox(hDlg,L"没有可意剪切的图片",L"提示",0);
		} else {
			// DialogBox(hInst, MAKEINTRESOURCE(IDD_DIALOG_FG), hDlg,
			// ZhwCutProc);
			state = ST_CUT;
			JCutDialog jd = new JCutDialog(WorkDialog.workDialog,
					fo.getCurrentScreen());
			jd.setModal(true);
			jd.show();
			state = ST_WOK;
		}

	}

	private Component getSaveBn() {
		// TODO Auto-generated method stub
		JButton jbSave = new JButton();
		jbSave.setText("保存");
		jbSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					fo.saveSetting(false);
					Draw.this.reloadFoData();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		return jbSave;
	}
	
	private Component getSaveCBn() {
		// TODO Auto-generated method stub
		JButton jbSave = new JButton();
		jbSave.setText("保存C");
		jbSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					fo.saveSetting(true);
					Draw.this.reloadFoData();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		return jbSave;
	}


	private Component getPrevBn() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("<<");
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				itemList.setSelectedIndex(itemList.getSelectedIndex() - 1);
			}

		});

		return jb;
	}

	private Component getNextBn() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText(">>");
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				itemList.setSelectedIndex(itemList.getSelectedIndex() + 1);
			}

		});

		return jb;
	}

	private Component getSameBn() {
		// TODO Auto-generated method stub
		JButton jb = new JButton();
		jb.setText("S");
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fo.setSameFileNameAsSameLocation();
			}

		});

		return jb;
	}

	private Component getLoadBn() {
		// TODO Auto-generated method stub
		JButton jbLoad = new JButton();
		jbLoad.setText("加载");
		jbLoad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					fo.loadSetting();
					Draw.this.reloadFoData();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		return jbLoad;
	}

	protected void reloadFoData() {
		// TODO Auto-generated method stub

		int nOldSelect = list.getSelectedIndex();
		beDisableSelect = true;
		listModel.removeAllElements();
		for (int i = 0; i < fo.allScreen.size(); i++) {
			String nameP = fo.allScreen.get(i).getName();
			String name = String.format("%2d", i) + ".";
			String projectPath = fo.allScreen.get(i).projectPath;

			if (projectPath != null) {
				int n = projectPath.lastIndexOf("\\");
				if (n > 0) {
					String pName = projectPath.substring(n + 1);
					name += "<" + pName + ">     ";
				}
			}
			if (fo.allScreen.get(i).isDlg()) {
				nameP += "(Dlg)";
			}
			listModel.addElement(name + nameP);
		}
		beDisableSelect = false;
		list.setSelectedIndex(nOldSelect);
	}

	public void drawFile(Graphics g, int x, int y, String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedImage bi = ImageIO.read(fis);
			g.drawImage(bi, x, y, null);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateShow() {
		BaseItem bi = fo.getCurrentScreen().getActiveItem();
		if (bi == null)
			return;
		jlable.setText(bi.getName() + "(" + bi.getX() + "," + bi.getY() + ")");
		bi = fo.getCurrentScreen().getActiveItem();
		if (bi != null) {
			if (bi.getClass() == PNG_STRUCT.class) {
				PNG_STRUCT png = (PNG_STRUCT) bi;
				if (png.isActionBotton()) {
					if (png.hasFuction()) {
						jbActionAddRemove.setText("remove action");
					} else {
						jbActionAddRemove.setText("add action");
					}
					jbActionAddRemove.setEnabled(true);
				} else {
					jbActionAddRemove.setEnabled(false);
				}
			} else {
				jbActionAddRemove.setEnabled(false);
			}
		}
		setShowCondition();
	}

	public void paint(Graphics g) {
		super.paint(g);
		try {
			// drawFile(g,0,0,
			// "F:/ZHW-WINCE-c-FOR_JAVA/ARM11/WORK-DIR/img/背景图/1.jpg");
			// drawFile(g,0,-300,
			// "F:/ZHW-WINCE-c-FOR_JAVA/ARM11/WORK-DIR/img/新界面/主界面.png");

			// void setClip(Shape)

			Shape s = g.getClip();
			g.setClip(FileOp.TEST_DRAWX-5, FileOp.TEST_DRAWY-4, 1029, 610);
			g.setColor(Color.BLACK);
			g.drawRect(FileOp.TEST_DRAWX-2, FileOp.TEST_DRAWY-1, 804, 482);
			g.drawRect(FileOp.TEST_DRAWX-3, FileOp.TEST_DRAWY-2, 1024+4, 600+2);
			ScreenGraphic screen = WorkDialog.fo.allScreen.get(fo
					.getnActiveScreen());
			screen.drawOnScreen(g);
			g.setClip(s);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// g.drawImage, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
	}

	public void refreshListActionMode() {
		int n = itemList.getSelectedIndex();

		BaseItem bi = fo.getCurrentScreen().getActiveItem();
		if (bi.getClass() != PNG_STRUCT.class) {
			return;
		}
		PNG_STRUCT png = (PNG_STRUCT) bi;

		// if (png.aliasName != null) {
		if (n < 0) {
			n = 0;
		}
		try {
			if (itemListModel.size() > n) {
				itemListModel.set(n, n + ">" + png.getShowString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// }
	}

	public void initOneScreen() {
		int n = list.getSelectedIndex();
		ScreenGraphic scrn = fo.allScreen.get(n);
		// scrn.uninit();
		// scrn.reinitItems();
		itemListModel.removeAllElements();
		int pngLen = scrn.pnStructList.size();
		for (int i = 0; i < scrn.pnStructList.size(); i++) {
			PNG_STRUCT png = scrn.pnStructList.get(i);
			png.initSubAction();
			// if (png.aliasName != null) {
			itemListModel.addElement(i + ">"
					+ scrn.pnStructList.get(i).getShowString());
			// } else {
			// itemListModel.addElement(i + ">"
			// + scrn.pnStructList.get(i).getName());
			// }
		}
		for (int i = 0; i < scrn.txtStruct.size(); i++) {
			itemListModel.addElement((i + pngLen) + ">"
					+ scrn.txtStruct.get(i).getName());
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (beDisableSelect)
			return;
		if (e.getSource() == list) {
			initOneScreen();
			fo.setnActiveScreen(list.getSelectedIndex());
			updateShow();
			this.repaint();
			// jbActionAddRemove.setText("");
			jbActionAddRemove.setEnabled(false);
		}
		if (e.getSource() == itemList) {
			fo.getCurrentScreen().setnSelectItem(itemList.getSelectedIndex());
			updateShow();
			this.repaint();
		}
	}

	public void initData(FileOp foSet) {
		// TODO Auto-generated method stub
		fo = foSet;
		reloadFoData();
		fo.setDraw(this);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		fo.moveTo(e.getX(), e.getY());

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
