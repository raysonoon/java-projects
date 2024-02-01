/* Java program to print surface area & volume of a sphere, given the radius */
import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius, volume, surfaceArea;
        Scanner in = new Scanner(System.in);

        // Prompt and read user's radius
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        // Compute surface area
        surfaceArea = 4 * Math.PI * radius * radius;
        // Compute volume
        volume = 4.0/3 * Math.PI * radius * radius * radius;

        // Print results
        System.out.printf("Surface Area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        in.close();
;    }
}