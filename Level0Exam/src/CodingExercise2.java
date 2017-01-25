
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int ageint = Integer.parseInt(age);
		int year = 2017 - ageint;
		String birthday = JOptionPane.showInputDialog("Have you had your birthday this year?");
		if (birthday.equalsIgnoreCase("yes")) {
			JOptionPane.showInputDialog(null, "You were born in " + year + ".");
		} else if (birthday.equalsIgnoreCase("no")) {
			int newbday = year - 1;
			JOptionPane.showMessageDialog(null, "You were born in " + newbday + ".");
		}
		if (ageint > 30) {
			JOptionPane.showMessageDialog(null, "You're too old.");
		}
	}

}
