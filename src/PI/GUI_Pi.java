package PI;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class GUI_Pi extends JFrame {

	private JPanel contentPane;
	private int selectedNumber = 0;
	Sender send;
	private ArrayList<Menu_Button> Main_Menu_Buttons = new ArrayList<Menu_Button>();

	final JPanel panel;
	final JPanel panel_1;
	final JPanel panel_2;
	final JPanel panel_3;
	JPanel previousPanel;
	JPanel currentPanel;
	final CardLayout cl;
	private int nbrButtons = 3;

	/**
	 * Create the frame.
	 */
	public GUI_Pi(Sender sender) {
		this.send = sender;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		cl = new CardLayout(0, 0);
		contentPane.setLayout(cl);

		panel = new JPanel();

		contentPane.add(panel, "name_6798406101994");
		panel.setLayout(null);
		previousPanel = panel;
		currentPanel = panel;
		Menu_Button btnGames = new Menu_Button(this, 0) {
			public void press() {
				cl.show(contentPane, "panel_1");
				previousPanel = panel;
				currentPanel = panel_1;
				panel.hide();
				panel_1.show();
				nbrButtons = 1;
			}
		};
		Menu_Button btnOptions = new Menu_Button(this, 1) {
			public void press() {
				cl.show(contentPane, "panel_1");
				previousPanel = panel;
				panel.hide();
				panel_2.show();
				currentPanel = panel_2;
				nbrButtons = 1;
			}
		};
		Menu_Button btnAbout = new Menu_Button(this, 2) {
			public void press() {
				cl.show(contentPane, "panel_1");
				panel.hide();
				previousPanel = panel;
				panel_3.show();
				currentPanel = panel_3;
				nbrButtons = 1;
			}
		};

		Main_Menu_Buttons.add(btnGames);
		Main_Menu_Buttons.add(btnAbout);
		Main_Menu_Buttons.add(btnOptions);

		Menu_Button btnReturn = new Menu_Button(this, 0) {
			public void press() {
				cl.show(contentPane, "panel_1");
				panel_1.hide();
				panel.show();
				nbrButtons = 3;
			}
		};
		Main_Menu_Buttons.add(btnReturn);

		Menu_Button btnConnect = new Menu_Button(this, 0);
		Menu_Button btnReturnOpt = new Menu_Button(this, 1) {
			public void press() {
				cl.show(contentPane, "panel_1");
				panel_2.hide();
				panel.show();
				nbrButtons = 3;
			}
		};
		Main_Menu_Buttons.add(btnReturnOpt);

		Menu_Button btnReturnAbout = new Menu_Button(this, 0) {
			public void press() {
				cl.show(contentPane, "panel_1");
				panel_3.hide();
				panel.show();
				nbrButtons = 3;
			}
		};
		Main_Menu_Buttons.add(btnReturnAbout);

		btnGames.setBounds(748, 83, 165, 68);
		panel.add(btnGames);
		btnGames.setText("Games");

		btnOptions.setBounds(748, 248, 165, 68);
		panel.add(btnOptions);
		btnOptions.setText("Options");

		btnAbout.setBounds(748, 413, 165, 68);
		panel.add(btnAbout);
		btnAbout.setText("About");

		panel_1 = new JPanel();
		contentPane.add(panel_1, "name_6810941850142");
		panel_1.setLayout(null);

		JButton btnGame = new JButton("Game 1");
		btnGame.setBounds(748, 83, 165, 68);
		panel_1.add(btnGame);

		JButton btnGame_1 = new JButton("Game 2");
		btnGame_1.setBounds(748, 259, 165, 68);
		panel_1.add(btnGame_1);

		btnReturn.setBounds(509, 545, 165, 68);
		panel_1.add(btnReturn);
		btnReturn.setText("Return");

		panel_2 = new JPanel();
		contentPane.add(panel_2, "name_7946040729344");
		panel_2.setLayout(null);

		JSlider slider = new JSlider();
		slider.setBounds(750, 110, 200, 26);
		panel_2.add(slider);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Mute");
		chckbxNewCheckBox.setBounds(625, 110, 97, 23);
		panel_2.add(chckbxNewCheckBox);

		JLabel lblSound = new JLabel("Sound");
		lblSound.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSound.setBounds(713, 68, 72, 31);
		panel_2.add(lblSound);

		JSlider slider_1 = new JSlider();
		slider_1.setBounds(750, 272, 200, 26);
		panel_2.add(slider_1);

		JLabel lblBrightness = new JLabel("Brightness");
		lblBrightness.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBrightness.setBounds(713, 220, 72, 31);
		panel_2.add(lblBrightness);

		btnConnect.setBounds(666, 404, 165, 68);
		panel_2.add(btnConnect);
		btnConnect.setText("Connect Handheld");

		btnReturnOpt.setBounds(412, 550, 165, 68);
		panel_2.add(btnReturnOpt);
		btnReturnOpt.setText("Return");

		panel_3 = new JPanel();
		contentPane.add(panel_3, "name_8765118079202");
		panel_3.setLayout(null);

		btnReturnAbout.setBounds(323, 565, 165, 68);
		panel_3.add(btnReturnAbout);
		btnReturnAbout.setText("Return");

		JTextArea txtrAbout = new JTextArea();
		txtrAbout.setText("About");
		txtrAbout.setBounds(544, 56, 411, 502);
		panel_3.add(txtrAbout);

		btnGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
//				send.finished = false;
				panel.hide();
				panel_1.show();
			}
		});

		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel_1.hide();
				panel.show();
			}
		});

		btnOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel.hide();
				panel_2.show();
			}
		});

		btnReturnOpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel_2.hide();
				panel.show();
			}
		});

		btnReturnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel_3.hide();
				panel.show();
			}
		});

		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel.hide();
				panel_3.show();
			}
		});

		// För att få full screen
		// GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment()
		// .getDefaultScreenDevice();
		// if (gd.isFullScreenSupported()) {
		// try {
		// gd.setFullScreenWindow(this);
		// } finally {
		// // gd.setFullScreenWindow(null);
		// }
		// } else {
		// System.err.println("Nej");
		// }

		updateButtons();
	}

	public int getSelectedNumber() {
		return selectedNumber;
	}

	private void updateButtons() {
		for (int i = 0; i < Main_Menu_Buttons.size(); i++) {
			Main_Menu_Buttons.get(i).update();
		}
	}

	public void sendReceived(String inputLine) {
		if(inputLine!=null){
		if (inputLine.equals("12")) {
			this.selectedNumber++;
			if(this.selectedNumber>=this.nbrButtons)
				this.selectedNumber = 0;
			this.updateButtons();
		}
		if (inputLine.equals("9")) {
			this.selectedNumber--;
			if(this.selectedNumber<0)
				this.selectedNumber = this.nbrButtons-1;
			this.updateButtons();
		}
		if (inputLine.equals("16")) {
			for (int i = 0; i < Main_Menu_Buttons.size(); i++) {
				if ((Main_Menu_Buttons.get(i).getSelected())
						&& (Main_Menu_Buttons.get(i).isShowing())) {
					Main_Menu_Buttons.get(i).press();
					this.selectedNumber = 0;
					break;
				}
			}
			updateButtons();
		}
		if (inputLine.equals("18")) {
			currentPanel.hide();
			previousPanel.show();
			nbrButtons = 3;
		}
	}}

}
