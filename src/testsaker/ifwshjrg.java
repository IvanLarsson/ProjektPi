package testsaker;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ifwshjrg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ifwshjrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ifwshjrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ifwshjrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ifwshjrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ifwshjrg frame = new ifwshjrg();
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
	public ifwshjrg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(398, 355, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setBounds(338, 97, 86, 165);
		contentPane.add(slider);
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		toggleButton.setBounds(398, 283, 121, 23);
		contentPane.add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("New toggle button");
		toggleButton_1.setIcon(new ImageIcon("C:\\Users\\Ivan\\Pictures\\MahLogga200.jpg"));
		toggleButton_1.setBounds(50, 50, 244, 280);
		contentPane.add(toggleButton_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 364, 365, 37);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				
				fc.showOpenDialog(contentPane);
String blah;			
				blah = fc.getSelectedFile().getAbsolutePath();
				ProcessBuilder pb = new ProcessBuilder ("C:/Program Files/Java/jdk1.7.0_11", "-jar", blah);
//				pb.directory(new File())
				try {
					pb.start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(416, 27, 89, 23);
		contentPane.add(btnNewButton);
	}
}
