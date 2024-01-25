/* Java program to sum all running integers from 1 to 1000 that are
 * divisble by 3, 5 or 7, but not 15, 21, 35 or 105
*/

public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        // Declare & initialise variables
        final int lowerbound = 1;
        final int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;

        // Loop & sum up values
        while (number <= upperbound) {
            if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && (number % 15 != 0 && number % 21 != 0 && number % 35 != 0 && number % 105 != 0)) {
                //if (number % 15 != 0 && number % 21 != 0 && number % 35 != 0 && number % 105 != 0) {
                    sum += number;
                //}
            }
            number++;
        }
        
        // Print results
        System.out.println("The sum of correct numbers from " + lowerbound + " to " + upperbound + " is " + sum);
        /*int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            // Check if the number is divisible by 3, 5, or 7
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                // Check if the number is NOT divisible by 15, 21, 35, or 105
                if (i % 15 != 0 && i % 21 != 0 && i % 35 != 0 && i % 105 != 0) {
                    sum += i;
                }
            }
        }

        System.out.println("The sum of numbers meeting the criteria is: " + sum);
*/
    }
}