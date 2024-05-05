/* Java program that takes an int array and prints its contents in the form of
 * [a1, a2, ..., an]
 */

 import java.util.Scanner;

 /**
  * PrintArrayMethod
  */
 public class PrintArrayMethod {
 
    public static void main(String[] args) {
        // Declare variables
        int arraySize;

        // Initialise scanner
        Scanner in = new Scanner(System.in);

        // Prompt user for array size and integers
        System.out.print("Enter size of array: ");
        arraySize = in.nextInt();

        // Declare and allocate int array
        int[] intArray = new int[arraySize];

        // Prompt user for integer elements of array
        System.out.print("Enter integer elements of the array (separated by spaces): "); 
        
        // Assign each index of array to respective element
        for (int idx = 0; idx < arraySize; idx++) {
            intArray[idx] = in.nextInt();
        }
        in.close();

        // Print array
        print(intArray);
    }

    public static void print(int[] array) {
        System.out.print("The array is: [");
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print(array[idx]);
            } else {
                System.out.print(", " + array[idx]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
 }