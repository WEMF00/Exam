/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String Args[]) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int numAge = Integer.parseInt(age);
	int yearBorn = 2016 - numAge;
	System.out.print("You were born in " + yearBorn + ".");
	
	if (numAge >= 30){
		System.out.print("You are too old to play the game.");
	}
}
}