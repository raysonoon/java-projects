import java.util.Scanner;

/**
 * OddEven
 */
public class OddEven {
    public static void main(String[] args) {
        // Declare variables
        int numberIn;
        Scanner in = new Scanner(System.in); // Scan keyboard for input

        // Put up prompting messages and read inputs as "int"
        System.out.print("Enter an integer: "); // No newline for prompting message
        numberIn = in.nextInt();

        // Check odd/even and print result
        if (numberIn % 2 == 0) {
            System.out.println(numberIn + " is even");
        } else {
            System.out.println(numberIn + " is odd");
        }

        // Print bye
        System.out.println("bye");
    }
}