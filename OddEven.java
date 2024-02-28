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
        System.out.print("Enter a number: "); // No newline for prompting message
        numberIn = in.nextInt();
        in.close();

        // Check odd/even and print result
        if (isOdd(numberIn)) {
            System.out.println(numberIn + " is an odd number");
        } else {
            System.out.println(numberIn + " is an even number");
        }

    }

    public static boolean isOdd(int number) {
        return (number % 2 != 0);
    }
}