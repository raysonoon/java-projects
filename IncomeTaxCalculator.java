/* Java program that calculates income tax payable )in double) */
import java.util.Scanner;
/**
 * IncomeTaxCalculator
 */
public class IncomeTaxCalculator {

    public static void main(String[] args) {
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Declare & initialise tax rates for respective income brackets
        final double TAX_RATE_AFTER_20K = 0.1;
        final double TAX_RATE_AFTER_40K = 0.2;
        final double TAX_RATE_AFTER_60K = 0.3;

        // Declare taxable income, income tax
        int taxableIncome;
        double incomeTax;

        // Prompt user for income and scan input
        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();

        // Compute income tax
        if (taxableIncome <= 20000) {
            incomeTax = 0;
        } else if (taxableIncome <= 40000) {
            incomeTax = (taxableIncome - 20000) * TAX_RATE_AFTER_20K;
        } else if (taxableIncome <= 60000) {
            incomeTax = 20000 * TAX_RATE_AFTER_20K + (taxableIncome - 40000) * TAX_RATE_AFTER_40K;
        } else {
            incomeTax = 20000 * TAX_RATE_AFTER_20K + 20000 * TAX_RATE_AFTER_40K + (taxableIncome - 60000) * TAX_RATE_AFTER_60K;
        }

        // Display income tax
        System.out.printf("The income tax payable is: $%.2f%n", incomeTax);

        in.close();
    }
}