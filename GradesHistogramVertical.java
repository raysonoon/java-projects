import java.util.Scanner;

public class GradesHistogramVertical {
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
            for (int num = 0; num < numStudents; num++) {
                System.out.print("Enter the grade for student " + (num + 1) + ": ");
                grades[num] = in.nextInt();
            }
        }
        in.close();

        // For loop to populate the bins
        for (int idx = 0; idx < grades.length; idx++) {
            if (grades[idx] == 100) {
                ++bins[9];
            } else {
                ++bins[grades[idx] / 10];
            }
        }

        // Find the max frequency
        int maxFrequency = 0;
        for (int bin : bins) { // for-each loop that sets p to first element
            if (bin > maxFrequency) {
                maxFrequency = bin;
            }
        }

        for (int level = maxFrequency; level > 0; level--) {
            for (int binNum = 0; binNum < bins.length; binNum++) {
                if (bins[binNum] >= level)
                    System.out.print("   *   ");
                else
                    System.out.print("       ");
            }
            System.out.println();
        }
        // Print the labels for the bins
        for (int binNum = 0; binNum < bins.length; binNum++) {
            if (binNum == 9) {
                System.out.printf(" 90-100");
            } else {
                System.out.printf("%3d-%-3d", binNum * 10, binNum * 10 + 9);
            }
        }
        System.out.println();
    }
}