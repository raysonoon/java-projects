import java.util.Scanner;

// Java program to calculate perimeter & area of rectangle based on user's length & width
/**
 * RectangleComputation8
 */
public class RectangleComputation {
    public static void main(String[] args) {
        int length, width, area, perimeter;
        Scanner in = new Scanner(System.in);

        // Prompt and read user inputs
        System.out.print("Enter the length: ");
        length = in.nextInt();
        System.out.print("Enter the width: ");
        width = in.nextInt();

        // Compute perimeter
        perimeter = 2 * length + 2 * width;
        // Compute area
        area = length * width;

        // Print results
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

        in.close();
    }
    
}