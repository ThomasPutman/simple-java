import javax.swing.JOptionPane;
/**
 * This program is designed to ask user for letter grade and match
 * quality points with that letter
 * @author Thomas Putman
 * @version November 14, 2018
 */
public class QualityPointsMethod {
	
	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "This program converts a letter grade \r\n"
			+ " to the correpsonding number of quality points.");
	String grade = JOptionPane.showInputDialog("Enter the letter grade:");
	JOptionPane.showMessageDialog(null, "Letter grade entered: " + grade + "\nYou received "
            + computeQualityPoints(grade) + " quality points");
	computeQualityPoints(grade);
	}
	/**
	 * This method converts a letter grade inputed by user to 
	 * the corresponding number of quality points, you are rewarded 0 quality
	 * points for no or invalid responses
	 * @param String grade that is the grade for the user
	 * @return The quality points associated with letter grade
	 */
	public static double computeQualityPoints (String grade) {
	if (grade.equals("a")) {
		return 4.0;
	}
	if (grade.equals("A")) {
		return 4.0;
	}
	if (grade.equals("a-")) {
		return 3.7;
	}
	if (grade.equals("A-")) {
		return 3.7;
	}
	if (grade.equals("b+")) {
		return 3.3;
	}
	if (grade.equals("B+")) {
		return 3.3;
	}
	if (grade.equals("b")) {
		return 3.0;
	}
	if (grade.equals("B")) {
		return 3.0;
	}
	if (grade.equals("b-")) {
		return 2.7;
	}
	if (grade.equals("B-")) {
		return 2.7;
	}
	if (grade.equals("C+")) {
		return 2.3;
	}
	if (grade.equals("c+")) {
		return 2.3;
	}
	if (grade.equals("c")) {
		return 2.0;
	}
	if (grade.equals("C")) {
		return 2.0;
	}
	if (grade.equals("c-")) {
		return 1.7;
	}
	if (grade.equals("C-")) {
		return 1.7;
	}
	if (grade.equals("d+")) {
		return 1.3;
	}
	if (grade.equals("D+")) {
		return 1.3;
	}
	if (grade.equals("d")) {
		return 1.0;
	}
	if (grade.equals("D")) {
		return 1.0;
	}
	if (grade.equals("d-")) {
		return 0.7;
	}
	if (grade.equals("D-")) {
		return 0.7;
	}
	if (grade.equals("f")) {
		return 0.0;
	}
	if (grade.equals("F")) {
		return 0.0;
	}
	else {
		JOptionPane.showMessageDialog(null, "Enter a valid letter");
	}
	return 0;
	}
	
}
	
	
	
