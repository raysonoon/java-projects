import java.util.Scanner; //keyboard input

public class Multiple {
    public static void main(String[] args) {
        // Declare variables
        int number1, number2;
        Scanner in = new Scanner(System.in); // Scan keyboard for input

        // Put up prompting messages and read inputs as "int"
        System.out.print("Enter 1st integer: "); // No newline for prompting message
        number1 = in.nextInt();

        System.out.print("Enter 2nd integer: ");
        number2 = in.nextInt();
        
        // Check if number1 is divisible by number2
        if (number1 % number2 == 0) {
            System.out.println(number1 + " IS a multiple of " + number2);
        } else {
            System.out.println(number1 + " IS NOT a multiple of " + number2);
        }

        in.close();
    }
}