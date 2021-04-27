import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 * This program asks for the amount of classes you are taking, followed by the
 * amount of credits and grade, then calculates your GPA.
 * 
 * @author Thomas Putman
 * @version November 30, 2018
 *
 */
public class GPACalculator
{
	public static void main(String[] args)
	{
		UIManager.put("OptionPane.minimumSize", new Dimension(400, 200));
		String grade;
		int totalCredits = 0;
		double totalCreditsEarned = 0;
		int credits;
		int classes;
		double gpa;
		double number = 0;
		String greeting = "This program will calculate your GPA.";
		JOptionPane.showMessageDialog(null, greeting, "GPA Calculator", 1);
		classes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of classes you are taking"));
		for (int count = 0; count < classes; count++)
		{
			credits = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credits was class " + (count + 1)));
			grade = JOptionPane.showInputDialog(null, "Enter letter grade for class " + (count + 1));
			grade.toUpperCase();
			{
				number = computeQualityPoints(grade);
			}
			totalCredits += credits;
			totalCreditsEarned += (credits * number);
		}
		gpa = Math.round((totalCreditsEarned / totalCredits) * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Your GPA is: " + gpa);
	}
	/**
	 * Uses a letter grade to compute quality points received.
	 * 
	 * @param grade 
	 * @return quality points using JOptionPane if a valid
	 *         letter grade was entered
	 */
	public static double computeQualityPoints(String grade) {
		if (grade.equals("A")) {
			return 4.0;
		}
		if (grade.equals("A-")) {
			return 3.7;
		}
		if (grade.equals("B+")) {
			return 3.3;
		}
		if (grade.equals("B")) {
			return 3.0;
		}
		if (grade.equals("B-")) {
			return 2.7;
		}
		if (grade.equals("C+")) {
			return 2.3;
		}
		if (grade.equals("C")) {
			return 2.0;
		}
		if (grade.equals("C-")) {
			return 1.7;
		}
		if (grade.equals("D+")) {
			return 1.3;
		}
		if (grade.equals("D")) {
			return 1.0;
		}
		if (grade.equals("D-")) {
			return 0.7;
		}
		if (grade.equals("F")) {
			return 0.0;
		}
		return 0;
	}

}