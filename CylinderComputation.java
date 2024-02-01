/* Java program to print surface area & volume of a sphere, given the radius */
import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, baseArea, surfaceArea, volume;
        Scanner in = new Scanner(System.in);

        // Prompt and read user's radius & height
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();

        // Compute base area
        baseArea = Math.PI * radius * radius;
        // Compute surface area
        surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
        // Compute volume
        volume = baseArea * height;

        // Print results
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);

        in.close();
;    }
}