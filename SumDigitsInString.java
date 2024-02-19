/* Java program that prompts user for a string and prints the sum of all digits, ignoring the rest
 */

import java.util.Scanner;

/**
 * SumDigitsInString
 */
public class SumDigitsInString {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String
        char inChar;
        int sumDigits = 0;

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a String: ");
        inStr = in.next(); // use next() to read a string 
        inStrLen = inStr.length();
        in.close();

        // For loop to sum up digits
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            inChar = inStr.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                sumDigits += (inChar - '0');
            }
        }

        // Print results
        System.out.println("The sum of all digits is: " + sumDigits);

    }
}
