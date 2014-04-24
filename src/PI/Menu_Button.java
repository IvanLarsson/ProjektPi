package PI;
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
	private GUI_Pi gui;

	public Menu_Button(GUI_Pi gui, int id) {
		selectNumber = id;
		this.gui = gui;
	}

	/**
	 * Updates our button, if it is selected display it. If not disable the button
	 */
	public void update() {
		if (gui.getSelectedNumber() == this.selectNumber) {
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
