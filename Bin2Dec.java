/* Java program that converts binary string to decimal equivalent */

import java.util.Scanner;

/**
 * Bin2Dec
 */
public class Bin2Dec {

    public static void main(String[] args) {
        // Declare variables
        String binStr; // Input binary string
        int binStrLen; // Length of binary string
        char binChar; // Each char in the binary string 
        int dec = 0; // Equivalent decimal number

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt and read user input as string
        System.out.print("Enter a binary string: ");
        binStr = in.next();
        binStrLen = binStr.length();
        in.close(); // Close scanner

        // For loop to read string
        for (int exp = 0; exp < binStrLen; exp++) {
            // Extract each char using charAt(), starting from the right
            binChar = binStr.charAt(binStrLen - 1 - exp);
            // 3 cases: '0', '1', others
            if (binChar == '0') {
                // Do nothing
            } else if (binChar == '1') {
                dec += (int)Math.pow(2, exp); // 1 * 2^exp
            } else {
                System.err.println("invalid binary string");
                return;
            }
        }
        System.out.println("The decimal equivalent is: " + dec);
    }
}