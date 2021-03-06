import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot Hal = new Robot();
    	Hal.penDown();
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("What color would you like to use?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if (color.equalsIgnoreCase("Yellow")) {
			Hal.setPenColor(255, 0, 0);
		} else if(color.equalsIgnoreCase("Blue"))  {
			Hal.setPenColor(0, 0, 255);
		}
   	 // 2. set the pen width to 10
    	Hal.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 
   	 for (int i = 0; i < 4; i++) {
   	 	Hal.move(100);
   	 	Hal.turn(90);
   	 	
   	 }
    }

}