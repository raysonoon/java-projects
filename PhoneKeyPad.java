/* Java program that prompts user for a string (case insensitive)
 * and converts to a sequence of keypad digits
 */

import java.util.Scanner;

/**
 * Phone Keypad
 */
public class PhoneKeyPad {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String
        char inChar; // each individual char in the string


        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase(); // use next() to read a string and convert to lowercase
        inStrLen = inStr.length();
        in.close();

        System.out.print("The phone number is: ");
        // For loop with switch
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) { // Process string from the right
            inChar = inStr.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                System.out.print(inChar);
            } else {
                switch (inChar) {
                    case 'a': case 'b': case 'c': // same as: if (inChar == 'a' || inChar == 'b' || inChar == 'c')
                        System.out.print("2");
                        break;
                    case 'd': case 'e': case 'f':
                        System.out.print("3");
                        break;
                    case 'g': case 'h': case 'i':
                        System.out.print("4");
                        break;
                    case 'j': case 'k': case 'l':
                        System.out.print("5");
                        break;
                    case 'm': case 'n': case 'o':
                        System.out.print("6");
                        break;
                    case 'p': case 'q': case 'r': case 's':
                        System.out.print("7");
                        break;
                    case 't': case 'u': case 'v':
                        System.out.print("8");
                        break;
                    case 'w': case 'x': case 'y': case 'z':
                        System.out.print("9");
                        break;
                    /*case '1':
                        System.out.print("1");
                        break;
                    case '8':
                        System.out.print("8");
                        break;
                    case '0':
                        System.out.print("0");
                        break;*/
                    default:
                        System.out.println("error in input");
                }
            }
        }
        System.out.println();
    }
}
