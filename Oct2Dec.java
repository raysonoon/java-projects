/* Java program that converts octal string to decimal equivalent */

import java.util.Scanner;

/**
 * Oct2Dec
 */
public class Oct2Dec {

    public static void main(String[] args) {
        // Declare variables
        String octStr; // Input binary string
        int octStrLen; // Length of binary string
        char octChar; // Each char in the binary string 
        int dec = 0; // Equivalent decimal number

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt and read user input as string
        System.out.print("Enter an octal string: ");
        octStr = in.next();
        octStrLen = octStr.length();
        in.close(); // Close scanner

        // For loop to read string
        for (int exp = 0; exp < octStrLen; exp++) {
            // Extract each char using charAt(), starting from the right
            octChar = octStr.charAt(octStrLen - 1 - exp);
            // 3 cases: '0', '1', others
            if (octChar == '0') {
                // Do nothing
            } else if (octChar > '7') {
                System.err.println("invalid octal string");
                return;
            } else {
                dec += (octChar - '0') * (int)Math.pow(8, exp); // 1 * 2^exp
            }
        }
        System.out.println("The decimal equivalent is: " + dec);
    }
}