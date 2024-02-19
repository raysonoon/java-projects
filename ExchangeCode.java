/* Java program that exchanges 'A' and 'Z', 'B' and 'Y', etc (case insensitive) */

import java.util.Scanner;

/**
 * ExchangeCode
 */
public class ExchangeCode {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String
        char plainTextChar, cipherTextChar; // each individual char in the string


        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a plaintext string: ");
        inStr = in.next().toUpperCase(); // use next() to read a string and convert to uppercase
        inStrLen = inStr.length();
        in.close();

        System.out.print("The ciphertext string is: ");
        // For loop to cipher plaintext string
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            plainTextChar = inStr.charAt(charIdx);
            cipherTextChar = (char)('A' + 'Z' - plainTextChar);
            System.out.print(cipherTextChar);
            }
        System.out.println();
    }
}
