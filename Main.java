// == CS400 Spring 2024 File Header Information ==
// Name: Anna Thao (Athao28)
// Email: athao28@wisc.edu
// Lecturer: Dr. Jiazhen Zhou
// Notes to Grader:

/*
 * Test the use of the Color method
 */
import java.util.*;

public class Main{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Beggining of testing the color class:");
		Color myColor = new Color("blue");

		System.out.println("What color do you want to change to? ");
		String newColor = input.next();
		//If color change succeeded
		if( myColor.changeColor(newColor)){
			System.out.println("The new color is:"+myColor.getColor());
		}
		else{
			System.out.println("Color change failed! ");
		}
	}
}
