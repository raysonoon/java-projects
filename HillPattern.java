/* Java program that prompts user for num of rows and prints Hill pattern */

import java.util.Scanner;

/**
 * HillPattern
 */
public class HillPattern {

    public static void main(String[] args) {
        // Declare size variable
        int numRows;
        // Scan keyboard for input
        Scanner in = new Scanner(System.in); 

        // Prompt user for size variable
        System.out.print("Enter the rows: ");  // No newline for prompting message
        numRows = in.nextInt();                     // Read next input as "int"
        in.close();

        // Nested for loop to print hill pattern
        for (int row = 1; row <= numRows; row++) {

            // Print left-hand spaces
            for (int col = 1; col <= numRows - row; col++) {
                System.out.print(" ");
            }

            // Print ^
            for (int arrow = 1; arrow <= 2*row - 1; arrow++) {
                System.out.print("^");
            }
            
            // Move cursor to next line
            System.out.println();
        }
    }
}