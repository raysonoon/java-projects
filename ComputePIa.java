/* Java program to compute the value of PI */

import java.util.Scanner;

/**
 * ComputePIa
 */
public class ComputePIa {

    public static void main(String[] args) {
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);
        // Declare variables
        int maxDenominator;
        double sum = 0.0;

        // Read user input denominator
        System.out.print("Enter the maximum denominator: ");
        maxDenominator = in.nextInt();

        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., maxDenominator
            if (denominator % 4 == 1) {
               // add into sum
               sum += 4 * (1.0/denominator);
            } else if (denominator % 4 == 3) {
               // subtract from sum
               sum -= 4 * (1.0/denominator);
            } else {
               System.out.println("impossible - error in logic");
            }
        }
        
        // Print results
        System.out.printf("The PI computed is: %.10f%n", sum);

        in.close();
        
    }
}