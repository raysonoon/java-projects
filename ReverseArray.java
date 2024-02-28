/* Java program that reverses array content */

import java.util.Scanner;

/**
 * ReverseArray
 */
public class ReverseArray {

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

            // Convert string into integer values and store into respective array
            for (int num = 0; num < numItems; num++) {
                items[num] = Integer.parseInt(itemValues[num]);
            }
        }

        // Print results of methods
        print(items);
        reverse(items);
    }

    // Method to print array contents
    public static void print(int[] array) {
        System.out.print("The original array is: [");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();

        return;
    }

    // Method to reverse array contents
    public static void reverse(int[] array) {
        System.out.print("The reverse is: [");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();

        return;
    }
}