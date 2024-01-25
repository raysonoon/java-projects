/* Java program to print area & circumference of a circle, given the radius */

public class CircleComputation {
    public static void main(String[] args) {
        double radius, area, circumference;
        final double PI = 3.14159265; // final to specify value cannot be changed

        radius = 1.2;

        // Compute area
        area = PI * radius * radius;
        // Compute circumference
        circumference = 2 * PI * radius;

        // Print results
        System.out.println("The radius is ");
        System.out.println(radius);
        System.out.println("The area is ");
        System.out.println(area);
        System.out.println("The circumference is ");
        System.out.println(circumference);
    }
}