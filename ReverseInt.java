/* Java program that prompts user for a positive integer and prints the reverse of the input integer */

import java.util.Scanner;

/**
 * ReverseInt
 */
public class ReverseInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        int inNumber, inDigit;

        // Prompt and read user input
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();
        System.out.print("The reverse is: ");

        // While loop to extract last digit w/ modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // Extract last digit
            System.out.print(inDigit);
            inNumber /= 10; // Drop last digit
        }
        System.out.println();
        in.close();
    }
}