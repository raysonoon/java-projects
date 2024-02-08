/* Java program that prompts user for maximum denominator and then computes sum of Harmonic
 * series up to n, and print the result (in full precision)
 */

import java.util.Scanner;

/**
 * HarmonicSum
 */
public class HarmonicSum {

    public static void main(String[] args) {
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);
        // Declare variables
        final int MAX_DENOMINATOR;
        double absDiff;
        double sumL2R = 0.0, sumR2L = 0.0;

        // Put up prompting messages and read inputs as "int"
        System.out.print("Enter the max denominator: ");
        MAX_DENOMINATOR = in.nextInt();

        // Compute harmonic sum using for loops
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += 1.0 / denominator;
        }
        for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--) {
            sumR2L += 1.0 / denominator;
        }

        // Compute absolute difference in double
        absDiff = sumL2R - sumR2L;
        if (absDiff < 0)
            absDiff = -absDiff;

        // Print results in full precision
        System.out.println("The sum from left-to-right is: " + sumL2R);
        System.out.println("The sum from right-to-left is: " + sumR2L);
        System.out.println("The absolute difference is: " + absDiff);
        in.close();
    }
}