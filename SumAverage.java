/* Java program that produces sum of 1 to 100 and then computes the average */

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Declare variables
        int sum  = 0, lowerbound, upperbound;
        double average;

        // Prompt and read user's number1 & number2
        System.out.print("Enter the lowerbound: ");
        lowerbound = in.nextInt();
        System.out.print("Enter the upperbound: ");
        upperbound = in.nextInt();

        // for loop to sum numbers
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;      
        }

        // Compute average in double
        average = (double)sum / ((upperbound - lowerbound) + 1);

        // Print sum & average
        System.out.println("The sum is: " + sum);
        System.out.printf("The average is: %.2f%n", average);

        in.close();
    }
}