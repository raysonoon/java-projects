/* Java program that returns true if number contains digit 8 */

import java.util.Scanner;

/**
 * MagicNumber
 */
public class MagicNumber {

    public static void main(String[] args) {
        // Declare variables
        int numberIn;
        Scanner in = new Scanner(System.in); // Scan keyboard for input

        // Put up prompting messages and read inputs as "int"
        System.out.print("Enter a positive integer: "); // No newline for prompting message
        numberIn = in.nextInt();
        in.close();

        // Print results
        if (isMagic(numberIn)) {
            System.out.println(numberIn + " is a magic number");
        } else {
            System.out.println(numberIn + " is not a magic number");
        }
    }

    public static boolean isMagic(int number) {
        int digit;
        boolean magicDigit = false;
        while (number > 0) {
            digit = number % 10;
            if (digit == 8)
                magicDigit = true;
            number /= 10;
        }
        return magicDigit;
    }
}