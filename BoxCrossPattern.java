/* Java program that prompts user for size of pattern (in int); and prints Box with Cross pattern */

import java.util.Scanner;

/**
 * BoxCrossPattern     
 */
public class BoxCrossPattern {

    public static void main(String[] args) {

        // Declare size variable
        int size;
        // Scan keyboard for input
        Scanner in = new Scanner(System.in); 

        // Prompt user for size variable
        System.out.print("Enter the size: ");  // No newline for prompting message
        size = in.nextInt();                     // Read next input as "int"
        in.close();

        // For loop to print pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else if (row == col || row + col == size + 1) {
                    System.out.print("+");
                } else
                    System.out.print(" ");
            }
            System.out.println();
         }
    }
}