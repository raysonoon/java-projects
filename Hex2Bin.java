/* Java program that converts user's hexadecimal to binary */

import java.util.Scanner;

/**
 * Hex2Bin
 */
public class Hex2Bin {

    public static void main(String[] args) {
        String hexStr; // Input hex String
        int hexStrLen; //Length of hexStr

         // Instead of using 16 if-else, use an array as look-up table
         // for HEx '0' to 'F' to binary string
         final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                                    "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        // Read user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = in.next().toLowerCase();
        hexStrLen = hexStr.length();
        in.close();

        System.out.print("The equivalent binary is ");
        // For loop to read each char of hex string starting from left
        for (int pos = 0; pos < hexStrLen; pos++) {
            char hexChar = hexStr.charAt(pos);
            // index into HEX_BITS array
            if (hexChar >= '0' && hexChar <= '9') {
                System.out.print(HEX_BITS[hexChar - '0']);
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                System.out.print(HEX_BITS[hexChar - 'a' + 10]);
            } else {
                System.err.println("Invalid Hex String");
                return;
            }
            // Separate each converted binary with a space
            System.out.print(" ");
        }
        System.out.println();
    }
}