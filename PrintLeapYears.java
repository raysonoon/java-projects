/* Java program that print all leap years between AD999 to AD2010 
and the total number of leap years during the period*/

public class PrintLeapYears {
    public static void main(String[] args) {
        // Declare & initialise variables
        final int lowerbound = 999;
        final int upperbound = 2010;
        int year = lowerbound;
        int count = 0;

        // Loop to print the leap years (divisible by 4 but not by 100, or divisible by 400)
        while (year <= upperbound) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year);
                count++;
            }
            year++;
        }

        // Print no. of leap years
        System.out.println("The total number of leap years from " + lowerbound + " to " + upperbound + " is " + count);
    }
}
