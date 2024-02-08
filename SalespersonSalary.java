/* Java program to compute salary of all saplespersons in a company. Program terminates
in response to 01 */

import java.util.Scanner;

/**
 * SalespersonSalary
 */
public class SalespersonSalary {

    public static void main(String[] args) {
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);
        // Declare constants
        // The keyword "final" marked these as constant (i.e., cannot changed).
        // Use uppercase words joined with underscore to name constants
        final double BASE_SALARY = 1000;
        final double COMMISSION_RATE = 0.15;
        final int SENTINEL = -1; // Terminating value for input

        // Declare variables
        int sales; // Input gross sales
        double salary; // Salary to be computed

        // Read first input to "seed" while loop
        System.out.print("Enter sales in dollars (or -1 to end): ");
        sales = in.nextInt();

        // Sentinel controlled loop to compute salary
        while (sales != SENTINEL) {
            // Compute salary
            salary = BASE_SALARY + sales * COMMISSION_RATE;

            // Display salary
            System.out.printf("Salary is: $%.2f%n%n", salary);

            // Read the next input
            System.out.print("Enter sales in dollars (or -1 to end): ");
            sales = in.nextInt();
        }
        // Display bye!
        System.out.println("bye");
        in.close();
    }
}