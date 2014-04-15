package GUI_controller;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Basic GUI example of console. The user can navigate through the menu by
 * pressing left or right and press the button by pressing enter.
 * 
 * @author LgLinus
 * 
 */
public class Main_Menu extends JFrame {
	public int selectNumber = 0;
	private ArrayList<Menu_Button> buttons = new ArrayList<Menu_Button>();
	private JPanel panel;

	@SuppressWarnings("serial")
	public Main_Menu() {
		this.setSize(1280, 760);
		this.setName("Console");
		this.setVisible(true);
		this.addKeyListener(new buttonListener());
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(new FlowLayout());

		createButtons();
	}

	private void createButtons() {
		buttons.add(new Menu_Button(this, buttons.size()) {
			@Override
			public void press() {
				System.out.println("BUTTON 1");
			}
		});
		buttons.get(0).setText("Knapp 1");
		buttons.get(0).setSize(100, 30);
		panel.add(buttons.get(0));

		buttons.add(new Menu_Button(this, buttons.size()) {
			@Override
			public void press() {
				System.out.println("BUTTON 2");
			}
		});
		buttons.get(1).setText("Ze Button 2");
		buttons.get(1).setSize(100, 30);
		panel.add(buttons.get(1));

		buttons.add(new Menu_Button(this, buttons.size()) {
			@Override
			public void press() {
				System.out.println("BUTTON 3");
			}
		});
		buttons.get(2).setText("Button 3");
		buttons.get(2).setSize(100, 30);
		panel.add(buttons.get(2));

		updateButtons();
	}

	private void updateButtons(){
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).update();
		}
	}
	
	private class buttonListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent key) {

		}

		@Override
		public void keyReleased(KeyEvent key) {
			if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
				selectNumber++;
				if (selectNumber >= buttons.size())
					selectNumber = 0;

			
			} else if (key.getKeyCode() == KeyEvent.VK_LEFT) {
				selectNumber--;
				if (selectNumber < 0)
					selectNumber = buttons.size() - 1;
				
			} else if (key.getKeyCode() == KeyEvent.VK_ENTER) {
				for (int i = 0; i < buttons.size(); i++) {
					if (buttons.get(i).getSelected())
						buttons.get(i).press();
				}
			}
			updateButtons();
		}

		@Override
		public void keyTyped(KeyEvent key) {
		}
	}
}
