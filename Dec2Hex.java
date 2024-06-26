/* Java program that converts user input decimal to hexadecimal */

import java.util.Scanner;

/**
 * Dec2Hex
 */
public class Dec2Hex {

    public static void main(String[] args) {
        int dec = 0; // User input decimal
        String hexStr = "";
        int radix = 16;

        // Look up table
        final char[] HEX_CHARS = { '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        // Get user input decimal
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        if (in.hasNextInt()) {
            dec = in.nextInt();
        } else {
            System.err.println("Invalid decimal");
            System.exit(1);
        }
        in.close();
        // Divide by 16 until 0 and add all remainder backwards
        while (dec > 0) {
            int hexDigit = dec % radix;
            hexStr = HEX_CHARS[hexDigit] + hexStr;
            dec = dec / radix;
        }
        // Print equivalent hexadecimal
        System.out.println("The equivalent hexadecimal is " + hexStr);
    }
}