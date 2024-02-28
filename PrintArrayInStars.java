/* Java program that prompts user for the number & value of items in an array and then print its contents  in graphical form as * */

import java.util.Scanner;

/**
 * PrintArrayInStars
 */
public class PrintArrayInStars {

    public static void main(String[] args) {
        
        // Declare variables
        int numItems;

        // Scam keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user for input and then read
        System.out.print("Enter the number of items: ");
        numItems = in.nextInt();
        int[] items = new int[numItems]; // Declare and allocate array

        // For loop and prompt user for input
        if (items.length > 0) {
            in.nextLine(); // Consume newline character
            System.out.print("Enter the value of all items (separated by space): ");
            String inputLine = in.nextLine();
            String[] itemValues = inputLine.split(" ");
            in.close();

            for (int num  = 0; num < numItems; num++) {
                items[num] = Integer.parseInt(itemValues[num]);
            }
        }

        // Nested for loop to print array contents as *
        for (int i = 0; i < items.length; i++) {
            int countStars = 0;
            // Print rows
            System.out.print(i + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[i]; ++starNo) {
                // Print col
                System.out.print("*");
                countStars++;
            }
            System.out.print("(" + countStars + ")");
            System.out.println();
        }
    }
} 