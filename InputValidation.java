/* Java program that validates user's inputs from 0-100 */

import java.util.Scanner;

/**
 * InputValidation
 */
public class InputValidation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        int numberIn;
        boolean isValid; 

        // Do-while loop controlled by boolean flag
        isValid = false; // default assuming input is not valid
        do {
            // Prompt and read input
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn = in.nextInt();
            // Validate input by setting boolean flag accordingly
            if (numberIn >= 0 && numberIn <= 10 || numberIn >=90 && numberIn <=100) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
        // Print valid number
        System.out.println("You have entered: " + numberIn);

        in.close();
    }
}