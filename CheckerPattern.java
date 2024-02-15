/* Java program that prompts user for size of pattern (in int); and prints checker pattern */

import java.util.Scanner;

/**
 * CheckerPattern
 */
public class CheckerPattern {

    public static void main(String[] args) {

        // Declare size variable
        int size;
        // Scan keyboard for input
        Scanner in = new Scanner(System.in); 

        // Prompt user for size variable
        System.out.print("Enter the size: ");  // No newline for prompting message
        size = in.nextInt();                     // Read next input as "int"
        in.close();

        // Outer loop to print ALL the rows
        for (int row = 1; row <= size; row++) {
        // Use print() to print a space, if needed, before printing this row
            if (row%2 == 0)
                System.out.print(" ");
            // Inner loop to print ALL the columns of ONE row
            for (int col = 1; col <= size; col++) {
            // Use print() here
                System.out.print("# ");
            }
        // Print a newline after all the columns
        System.out.println();
        }
    }
}