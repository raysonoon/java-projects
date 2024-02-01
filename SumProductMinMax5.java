import java.util.Scanner;

/**
 * SumProductMinMax3
 */
public class SumProductMinMax5 {

    public static void main(String[] args) {
        // Declare variables
        int number1, number2, number3, number4, number5; // 5 input integers
        int sum, product, min, max; // Compute these
        Scanner in = new Scanner(System.in); // Scan the keyboard

        // Prompt & read inputs as "int"
        System.out.print("Enter 1st integer: ");
        number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        number3 = in.nextInt();
        System.out.print("Enter 4th integer: ");
        number4 = in.nextInt();
        System.out.print("Enter 5th integer: ");
        number5 = in.nextInt();

        // Compute sum and product
        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;

        // Compute min
        // The "coding pattern" for computing min is:
        // 1. Set min to the first item
        // 2. Compare current min with the second item and update min if second item is smaller
        // 3. Continue for the next item
        min = number1;        // Assume min is the 1st item
        if (number2 < min) {  // Check if the 2nd item is smaller than current min
            min = number2;     // Update min if so
        }
        if (number3 < min) {  // Continue for the next item
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        } else if (number5 < min) {
            min = number5;
        }

        // Computer max
        max = number1;        
        if (number2 > max) {  
            max = number2;     
        }       
        if (number3 > max) {  // Continue for the next item
            max = number3;
        } else if (number4 > max) {
            max = number4;
        } else if (number5 > max) {
            max = number5;
        }

        // Print results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);

        in.close();
    }
}