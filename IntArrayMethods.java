/* Java program that prompts user for the number & value of items in an array and ten pint its contents */

import java.util.Scanner;

/**
 * PrintArray
 */
public class IntArrayMethods {

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

            // Print results of methods
            print(items);
            System.out.println("The min is: " + min(items));
            System.out.println("The max is: " + max(items));
            System.out.println("The sum is: " + sum(items));
            System.out.printf("The average (rounded to 2 decimal places) is: %.2f%n", average(items));
        }

        if (isEmpty(items))
            System.out.println("This array is empty");
        else
            System.out.println("This array is not empty");
    }

    // Method to print array contents
    public static void print(int[] array) {
        System.out.print("The values are: [");
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

    // Method to find minimum in array
    public static int min(int[] array) {
        int arrayMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arrayMin)
                arrayMin = array[i];
        }
        return arrayMin;
    }

    // Method to find max in array
    public static int max(int[] array) {
        int arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arrayMax)
                arrayMax = array[i];
        }
        return arrayMax;
    }

    // Method to find sum of array contents
    public static int sum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }

    // Method to find average of array contents
    public static double average(int[] array) {
        int arraySum = 0;
        double arrayAverage = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
            arrayAverage = (double) arraySum / array.length;
        }
        return arrayAverage;
    }

    // Method to check if array's length is 0
    public static boolean isEmpty(int[] array) {
        boolean arrayEmpty = false;
        if (array.length == 0)
            arrayEmpty = true;
        return arrayEmpty;
    }
}