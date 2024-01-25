/* Java program to sum odd & even numbers from a given range and then find their differences */

public class OddEvenSum {
    public static void main(String[] args) {
        // Declare & initialise variables
        final int lowerbound = 1;
        final int upperbound = 1000;
        int sumEven = 0;
        int sumOdd = 0;
        int number = lowerbound;

        // Loop & sum up values
        while (number <= upperbound) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            number++;
        }
        
        // Print results
        System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is " + sumEven);
        System.out.println("The difference between their sums is" + (sumOdd - sumEven));
    }
}