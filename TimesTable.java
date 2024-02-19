/* Java program that prompts user for size and prints multiplication table of that size */

import java.util.Scanner;

/**
 * TimesTable
 */
public class TimesTable {

    public static void main(String[] args) {
        // Declare size & spacing variable
        int size;
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user for size variable
        System.out.print("Enter the size of the table: "); // No newline for prompting message
        size = in.nextInt(); // Read next input as "int"
        in.close();
        
        // For loops to print multiplication table
        // Print row 1 header
        System.out.print(" * |");
        for (int headernum = 1; headernum <= size; headernum++) {
            System.out.printf("%4d", headernum);
        }
        // Move cursor to next line
        System.out.println();
        
        // Print row 2 border
        System.out.print("===+");
        for (int bordernum = 1; bordernum <= size; bordernum++) {
            System.out.print("====");
        }
        // Move cursor to next line
        System.out.println();

        // Print multiples
        for (int row = 1; row <= size; row++) {
            System.out.print(" " + row + " |");
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", col*row);
            }
            // Move cursor to next line
            System.out.println();
        }
    }
}