/* Java program that prompts user for integers and produce sum of numbers 
containing digit 8. Enter -1 to end */

import java.util.Scanner;

/**
 * MagicSum
 */
public class MagicSum {

    public static void main(String[] args) {
        // Declare variables
        final int SENTINEL = -1; // Terminating input
        int number;
        int magicSum = 0;

        // Initialise scanner
        Scanner in = new Scanner(System.in);

        // do-while loop to read first input and "seed" the while loop
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (hasEight(number)) {
                magicSum += number;
            }
        } while (number != SENTINEL);
        in.close();

        System.out.println("The magic sum is: " + magicSum);
    }

    public static boolean hasEight(int number) {
        boolean hasEight = false;
        // Modulus/divide to extract and drop each digit in int
        while (number > 0) {
            if (number % 10 == 8) {
                hasEight = true;
            }
            number /= 10;
        }
        return hasEight;
    }
}