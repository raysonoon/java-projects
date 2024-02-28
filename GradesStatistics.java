/* Java program that prompts user for the number of students in a class and each of their grades in an array */

import java.util.Scanner;

/**
 * GradesStatistics
 */
public class GradesStatistics {

    public static void main(String[] args) {
        
        // Declare variables
        int numStudents, min, max;
        double total = 0, average;

        // Scam keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user for input and then read
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        int[] grades = new int[numStudents]; // Declare and allocate array

        // For loop and prompt user for input
        if (grades.length > 0) {
            for (int num  = 0; num < numStudents; num++) {
                System.out.print("Enter the grade for student " + (num + 1) + ": ");
                grades[num] = in.nextInt();
            }
        }
        in.close();

        // Initialise min and max with first grade
        min = grades[0];
        max = grades[0];

        // For loop to compute average, max, min
        for (int idx = 0; idx < numStudents; idx++) {
            total += grades[idx];
            if (grades[idx] > max) {
                max = grades[idx];
                }
            if (grades[idx] < min) {
                min = grades[idx];
            }
        }
        average = total / numStudents;
        System.out.printf("The average is: %.2f%n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
} 