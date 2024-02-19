/* Java program that cipher's caesar's code (case insensitive)v*/

import java.util.Scanner;

/**
 * CaesarCode
 */
public class CaesarCode {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String
        char inChar; // each individual char in the string


        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a plaintext string: ");
        inStr = in.next().toUpperCase(); // use next() to read a string and convert to lowercase
        inStrLen = inStr.length();
        in.close();

        System.out.print("The ciphertext string is: ");
        // For loop with switch to cipher plaintext string
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            inChar = inStr.charAt(charIdx);
                switch (inChar) {
                    case 'X':
                        System.out.print("A");
                        break;
                    case 'Y':
                        System.out.print("B");
                        break;
                    case 'Z':
                        System.out.print("C");
                        break;
                    default:
                        System.out.print((char)(inChar + 3));
                }
            }
        System.out.println();
    }
}
