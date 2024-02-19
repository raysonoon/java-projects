/* Java program that prompts user for a string; and prints string in reverse order */

import java.util.Scanner;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a String: ");
        inStr = in.next(); // use next() to read a string
        inStrLen = inStr.length();
        in.close();

        System.out.print("The reverse is: ");
        // For loop to reverse string
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) { // Process string from the right
            System.out.print(inStr.charAt(charIdx));
        }
        System.out.println();
    }
}
