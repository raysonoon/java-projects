/* Java program that validates user's inputs from 0-100 */

import java.util.Scanner;

/**
 * InputValidation
 */
public class AverageWithInputValidation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare constant
        final int NUM_STUDENTS = 3;

        // Declare variables
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average = 0.0;

        // for loop to prompt user for marks of all the students
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            // Do-while loop controlled by boolean flag
            isValid = false; // default assuming input is not valid
            do {
                // Prompt and read input
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                // Validate input by setting boolean flag accordingly
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            
            // Sum up the marks of the students
            sum += numberIn;
            // Compute average
            average = (double)sum / NUM_STUDENTS;
        }

        // Print average marks
        System.out.printf("The average is: %.2f%n", average);

        in.close();

    }
}