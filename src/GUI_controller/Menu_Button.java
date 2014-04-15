package GUI_controller;
import javax.naming.Context;
import javax.swing.JButton;

/**
 * A button that contains a number value, the value represents whether it is 
 * selected or not.
 * 
 * IF the button is selected you can press it
 * @author LgLinus
 *
 */
public class Menu_Button extends JButton {

	private int selectNumber;
	private boolean selected;
	private Main_Menu main;

	public Menu_Button(Main_Menu main, int id) {
		selectNumber = id;
		this.main = main;
	}

	/**
	 * Updates our button, if it is selected display it. If not disable the button
	 */
	public void update() {
		if (main.selectNumber == this.selectNumber) {
			selected = true;
			this.setEnabled(true);
		} else {
			this.setEnabled(false);
			selected = false;
		}
	}

	/**
	 * Method to be initialized on creation of the instance
	 */
	public void press() {
		System.out.print("Initialize in creation of instance");
	}

	/**
	 * Returns whether the button is selected
	 * @return selected
	 */
	public boolean getSelected() {
		return selected;
	}
}
