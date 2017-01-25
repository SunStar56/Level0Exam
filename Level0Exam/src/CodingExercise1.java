import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.setSpeed(10);
		r.penDown();
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		String color = JOptionPane.showInputDialog(
				"Would you like to have a red, blue, or green circle? If you input something other than these colors, it will be black.");
		if (color.equalsIgnoreCase("red")) {
			r.setPenColor(255, 10, 10);
		} else if (color.equalsIgnoreCase("green")) {
			r.setPenColor(10, 255, 10);
		} else if (color.equalsIgnoreCase("blue")) {
			r.setPenColor(10, 10, 255);
		} else {
			r.setPenColor(0, 0, 0);
		} // 2. set the pen width to 10
		r.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 75; i++) {
			r.move(5);
			r.turn(5);
		}
	}

}
