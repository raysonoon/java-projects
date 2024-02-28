/* Java program that prompts user for the number & value of items in an array and ten pint its contents */

import java.util.Scanner;

/**
 * PrintArray
 */
public class PrintArray {

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

        // Print array contents
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print(items[i]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
} 