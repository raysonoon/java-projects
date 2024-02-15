/* Java program that prompts user for size of pattern (in int); and prints Z pattern */

import java.util.Scanner;

/**
 * ZPattern        
 */
public class ZPattern {

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
                if (row == 1 || row == size) {
                    System.out.print("*");
                } else if (row + col == size + 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
         }
    }
}