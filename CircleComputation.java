/* Java program to print area & circumference of a circle, given the radius */
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, area, diameter, circumference;
        Scanner in = new Scanner(System.in);

        // Prompt and read user's radius
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        // Compute area
        area = Math.PI * radius * radius;
        // Compute diameter
        diameter = 2.0 * radius;
        // Compute circumference
        circumference = 2.0 * Math.PI * radius;

        // Print results
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);

        in.close();
;    }
}