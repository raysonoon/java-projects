/* Java program that prompts user for the number of students in a class and each of their grades in an array */

import java.util.Scanner;

/**
 * GradesHistogramBins
 */
public class GradesHistogramBins {

    public static void main(String[] args) {
        
        // Declare variables
        int numStudents;
        // Declare int array and allocate 10 histogram bins 
        int[] bins = new int[10];

        // Scam keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user for input and then read
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        int[] grades = new int[numStudents]; // Declare and allocate array

        // For loop and prompt user for student grades
        if (grades.length > 0) {
            for (int num  = 0; num < numStudents; num++) {
                System.out.print("Enter the grade for student " + (num + 1) + ": ");
                grades[num] = in.nextInt();
            }
        }
        in.close();

        // For loop to populate the bins
        for (int idx = 0; idx < grades.length; idx++) {
            if (grades[idx] == 100) {
                ++bins[9];
            }
            else {
                ++bins[grades[idx]/10]; // 100 / 10 = 10; 99 / 10 = 9;
            }
        }

        // Print the bins
        for (int binIdx = 0; binIdx < bins.length; binIdx++) {
            if (binIdx != 9) {
                System.out.printf("%2d-%3d: ", binIdx*10, binIdx*10 + 9);
            } else {
                System.out.printf("%2d-%3d: ", binIdx*10, binIdx*10 + 10);
            }
            System.out.println(bins[binIdx]);
        }
    }
} 