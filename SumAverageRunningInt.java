/* Java program that produces sum of 1 to 100 and then computes the average */

public class SumAverageRunningInt {
    public static void main(String[] args) {
        // Declare variables
        int sum  = 0, count = 0;
        double average;
        final int lowerbound = 111;
        final int upperbound = 8899;

        // for loop to sum numbers
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
            ++count;        
        }

        // Compute average in double
        average = (double)sum / 100;

        // Print sum & average
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average of the sum is " + average);
        System.out.println("Count is " + count);

    }
}