/* Circle class that models a circle with a radius */

/**
 * Circle
 */
public class Circle implements GeometricObject {

    // Declare protected instance variables
    protected double radius;

    // Constructors
    /*// Circle with default radius & colour
    public Circle() {
        radius = 1.0;
    }*/

    // Circle with given radius
    public Circle(double r) {
        radius = r;
    }

    // Circle with given radius, color & boolean filled
    /*public Circle(double r, String color, boolean filled) {
        super(color,filled);
        radius = r;
    }*/

    // Public methods
    // Returns radius
    /*public double getRadius() {
        return radius;
    }

    // Returns void
    public void setRadius(double newRadius) {
        radius = newRadius;
    }*/

    // Returns area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Returns circumference
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Returns string
    //@Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}