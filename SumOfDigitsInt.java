/* Java program that prompts user for positive integer and print sum of all its digits */

import java.util.Scanner;

/**
 * SumOfDigitsInt
 */
public class SumOfDigitsInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inNumber;
        int inDigit;
        int sum = 0;

        // Prompt and read inputs as "int"
        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();

        // Extract the "last" digit repeatedly using a while-loop with modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            inNumber /= 10;          // drop "last" digit
            sum += inDigit;
        }

        // Print results
        System.out.println("The sum of all digits is: " + sum);

        in.close();
    }
}