// Java program that swap contents of two variables and print the results

import java.util.Scanner;
/**
 * SwapIntegers
 */
public class SwapIntegers {
    public static void main(String[] args) {
        int number1, number2, temp;
        Scanner in = new Scanner(System.in);

        // Prompt and read user's number1 & number2
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();

        // Swap integers
        temp = number1;
        number1 = number2;
        number2 = temp;

        // Print results
        System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);

        in.close();
    }
}