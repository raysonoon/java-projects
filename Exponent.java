/* Java program that uses exponent method to return int value of base raised to the power of exp */

import java.util.Scanner;

/**
 * Exponent
 */
public class Exponent {

    public static void main(String[] args) {
        // Declare variables
        int exp; 
        int base; 

        // Prompt and read exponent and base
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();
        in.close();

        // Print result
        System.out.println(base + " raises to the power of " + exp  + " is: " + exponent(base, exp));

    }

    // Returns "base" raised to the power "exp"
    public static int exponent(int base, int exp) {
        int product = 1;

        for (int idx = 0; idx < exp; idx++) {
            product *= base;
        }
        
        return product;
    }
}