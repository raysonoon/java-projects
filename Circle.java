/* Circle class that models a circle with a radius */

/**
 * Circle
 */
public class Circle {

    // Declare private instance variables
    private double radius;

    // Constructors
    // Circle with default radius & colour
    public Circle() {
        radius = 1.0;
    }

    // Circle with given radius
    public Circle(double r) {
        radius = r;
    }

    // Public methods
    // Returns radius
    public double getRadius() {
        return radius;
    }

    // Returns void
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Returns area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Returns circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Returns string
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}