/* Java program that prompts user for size of pattern (in int) and
 * prints triangular pattern
 */

 import java.util.Scanner;

 /**
  * TriangularPatternB
  */
 public class TriangularPatternB {
 
    public static void main(String[] args) {

        // Initialise scanner
        Scanner in = new Scanner(System.in);

        // Prompt the user and read input
        System.out.print("Enter the size of the pattern: ");
        int size = in.nextInt();
        in.close();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println(); // Move cursor to next row
        }
    }
 }