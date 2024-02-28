/* Java program that prompts user for a word and decides if input is a palindrome */

import java.util.Scanner;

/**
 * PalindromicWordTest
 */
public class PalindromicWordTest {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // Save input string for output printing
        String inStrLowerCase; // Convert input string to lowercase to reduce no of cases
        int inStrLen;
        char forwardChar, backwardChar; // Scan forward & backwards to compare two chars
        boolean isPalindromic; // Boolean flag

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt and read user input as string
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLowerCase = inStr.toLowerCase();
        inStrLen = inStr.length();
        in.close(); // Close scanner

        isPalindromic = true; // assume true, unless check fails
        // For loop to scan string forward and backwards
        for (int forwardIdx = 0, backwardIdx = inStrLen - 1; forwardIdx < inStrLen/2; ++forwardIdx, --backwardIdx) {
            forwardChar = inStrLowerCase.charAt(forwardIdx);
            backwardChar = inStrLowerCase.charAt(backwardIdx);
            if (forwardChar != backwardChar) {
                isPalindromic = false;
                break; // Upon first encounter, no need to go further
            }
        }
        if (isPalindromic == true)
            System.out.println('"' + inStr + '"' + " is palindromic");
        else
            System.out.println('"' + inStr + '"' + " is not palindromic");
    }
}