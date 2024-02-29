/* Java program that prompts user for size and prints square pattern */

import java.util.Scanner;

/**
 * SquarePattern
 */
public class SquarePattern {

    public static void main(String[] args) {
        // Declare variables
        int size;

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user for size input
        System.out.print("Enter the size of square pattern: ");
        size = in.nextInt();
        // Close the scanner
        in.close();

        // Nested for loop to print pattern
        for (int row = 1; row <= size; row++) {
            // Inner loop to print each columns of a row
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            // Newline after printing all the columns
            System.out.println();
        }
    }
}