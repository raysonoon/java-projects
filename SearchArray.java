/* Java program that prompts searches for a a content in array */

import java.util.Scanner;

/**
 * SearchArray
 */
public class SearchArray {

    public static void main(String[] args) {

        // Declare variables
        int numItems, searchKey;

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

            // Convert string into integer values and store into respective array
            for (int num = 0; num < numItems; num++) {
                items[num] = Integer.parseInt(itemValues[num]);
            }
        }

        // Get search key from user
        System.out.print("Enter the search key: ");
        searchKey = in.nextInt();
        in.close();

        // Call search function
        if (search(items, searchKey) != -1) {
            System.out.println(searchKey + " is found with index " + search(items, searchKey));
        } else {
            System.out.println(searchKey + " is not found");
        }
    }

    // Method to search an array
    public static int search(int[] array, int key) {
        int keyIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                keyIndex = i;
        }
        return keyIndex;
    }
}