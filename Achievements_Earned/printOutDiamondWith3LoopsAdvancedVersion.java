// Finally it is time for the advanced version of my classwork.
// The topic requires us to print out a diamond with 9 lines in just 3 loops, with Math.abs() method suggested to use.
// In this advanced program, the lines of the diamond is based on user inputs, though odd inputs are required.
// However, I did not use any Math.abs() method in this program. Instead, multiple mathematicis equations are used.

// It is also much more simple to explain it with an example.
// Take a diagram with 9 lines as an example. (Though I did use diamonds with different lines to test the equations.)
/*     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
// Let divide the diagram into two parts, one is lines with increasing "*" and one is with decreasing "*".
// The first equation we need to know is where is the line that seperates both of it
// To be continued...

import java.util.Scanner;

public class printOutDiamondWith3LoopsAdvancedVersion {

	public static void main(String[] args) {
		
		int userInput = 0;
		boolean isValidFlag = false;
	
		Scanner keyboardInput = new Scanner(System.in);
		
		// Request to user inputs of the no. of lines.
		System.out.println("This program is used to print out a diagram of diamond.");	
		while (isValidFlag == false) {
			System.out.println("Please insert the no. of lines that you want to used(must be a odd number):");
			userInput = keyboardInput.nextInt();
			if (userInput % 2 == 1 && userInput >= 3) {
				isValidFlag = true; // maxNumberOfLines is an odd number and it's bigger than 3.
			} 
		} // If an even number is inserted or the number inserted is lower than 3, the user is requested to input another number.
	
		double numberOfLines = userInput;
		// double type is used instead of integer type in order to prevent removal of remainder when a division performed.
	
		// Print out the diamond.
		for (int i = 1; i <= numberOfLines; i++) { 
    // Determine the number of lines, which is also the maximum number of slots (the line in the middle).
			if (i <= Math.ceil(numberOfLines/2)) { // Seperate the whole diamond into two parts(as mentioned above).
				for (int j = 1; j <= i + ((Math.ceil(numberOfLines/2) - 1)); j++) {
					if (j <= Math.ceil(numberOfLines/2) - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} else { // i > Math.ceil(numberOfLines/2)
				for (int k = 1; k <= (Math.ceil(numberOfLines/2) + (Math.ceil(numberOfLines/2) - 1)) - (i - Math.ceil(numberOfLines/2)); k++) {
					if (k <= i - Math.ceil(numberOfLines/2)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} 
			System.out.println();	
		}
    
	}
}
