/* Java program that converts user input hexadecimal to decimal */

import java.util.Scanner;
/**
 * Hex2Dec
 */
public class Hex2Dec {

    public static void main(String[] args) {
        // Declare variables
        String hexStr;
        int hexStrLen;
        int dec = 0;

        // Get user input hexadecimal
        Scanner in = new Scanner(System.in);
        System.out.print("Enter hexadecimal: ");
        hexStr = in.nextLine().toUpperCase();
        hexStrLen = hexStr.length();
        in.close();

        // Read the hex string
        for (int exp = 0; exp < hexStrLen; exp++) {
            // Extract char of string backwards
            char hexChar = hexStr.charAt(hexStrLen - 1 - exp);
            // Convert char to corresponding decimal
            if (hexChar == '0') {
                // Do nothing
            } else if (hexChar >= '1' && hexChar <= '9') {
                dec += (hexChar - '0') * (int)Math.pow(16, exp);
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                dec += (hexChar - 'A' + 10) * (int)Math.pow(16, exp);
            } else {
                System.err.println("Invalid hexadecimal");
                return;
            }
        }

        // Print equivalent decimal
        System.out.println("The equivalent decimal is " + dec);
    }
}