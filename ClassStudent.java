import javax.swing.JOptionPane;
	/**
	 * @author Thomas Putman
	 * @version October 30, 2018
	 * This program will ask the user to enter name
	 * and number of credits then display their class
	 */
public class ClassStudent {
public static void main(String[] args) {
	// Opening message to tell user what the program does
	JOptionPane.showMessageDialog(null, "This program will determine a users class by the amount of credits that they have completed.");
	// User enters name and total credit hours completed
	String name = JOptionPane.showInputDialog("Enter your name: ");
	String creditsCompleted = JOptionPane.showInputDialog("Enter the amount of completed credits: ");
	int creditHours = Integer.parseInt(creditsCompleted);
	
	if(creditHours > 0 &&  creditHours <= 20) {
		JOptionPane.showMessageDialog(null, "Name entered: " + name + "\r\n" + "Total credits completed: " + creditsCompleted + "\r\n" + "Your current class is Freshman.");
	}
	else if(creditHours > 20 && creditHours <= 55) {
		JOptionPane.showMessageDialog(null,  "Name entered: " + name + "\r\n" + "Total credits completed: " + creditsCompleted + "\r\n" + "Your current class is Sophmore.");
	}
	else if(creditHours > 55 && creditHours <= 85) {
		JOptionPane.showMessageDialog(null,  "Name entered: " + name + "\r\n" + "Total credits completed: " + creditsCompleted + "\r\n" + "Your current class is Junior.");
	}
	else if(creditHours >= 86 && creditHours <= 200) {
		JOptionPane.showMessageDialog(null,  "Name entered: " + name + "\r\n" + "Total credits completed: " + creditsCompleted + "\r\n" + "Your current class is Senior.");
	}
	else
			JOptionPane.showMessageDialog(null,"Error: You must enter a whole number between 0 and 200");
	}
}
	
	
