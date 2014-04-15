package PI;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class GUI_Pi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Pi frame = new GUI_Pi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Pi() {

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		final CardLayout cl = new CardLayout(0, 0);
		contentPane.setLayout(cl);

		final JPanel panel = new JPanel();
		contentPane.add(panel, "name_6798406101994");
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Games");
		
		btnNewButton.setBounds(748, 83, 165, 68);
		panel.add(btnNewButton);

		JButton btnOptions = new JButton("Options");
		btnOptions.setBounds(748, 259, 165, 68);
		panel.add(btnOptions);

		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(748, 427, 165, 68);
		panel.add(btnAbout);

		final JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_6810941850142");
		panel_1.setLayout(null);

		JButton btnGame = new JButton("Game 1");
		btnGame.setBounds(748, 83, 165, 68);
		panel_1.add(btnGame);

		JButton btnGame_1 = new JButton("Game 2");
		btnGame_1.setBounds(748, 259, 165, 68);
		panel_1.add(btnGame_1);

		JButton btnReturn = new JButton("Return");
		
		btnReturn.setBounds(509, 545, 165, 68);
		panel_1.add(btnReturn);
		
		final JPanel panel_2 = new JPanel();
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
		
		JButton button = new JButton("Connect Handheld");
		button.setBounds(666, 404, 165, 68);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(412, 550, 165, 68);
		panel_2.add(button_1);
		
		final JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "name_8765118079202");
		panel_3.setLayout(null);
		
		JButton button_2 = new JButton("Return");
		button_2.setBounds(323, 565, 165, 68);
		panel_3.add(button_2);
		
		JTextArea txtrAbout = new JTextArea();
		txtrAbout.setText("About");
		txtrAbout.setBounds(544, 56, 411, 502);
		panel_3.add(txtrAbout);

		// try {
		// Thread.sleep(1000);
		// robot();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
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
		

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panel_1");
				panel_2.hide();
				panel.show();
			}
		});
		
		button_2.addActionListener(new ActionListener() {
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
		
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice();
		if (gd.isFullScreenSupported()) {
			try {
				gd.setFullScreenWindow(this);
			} finally {
				// gd.setFullScreenWindow(null);
			}
		} else {
			System.err.println("Nej");
		}
	}

	
	
	
	public void server(){
		
	}
	
	
	
	
	public void robot() {
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void goForward() {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public void goBack() {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
