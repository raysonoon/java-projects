/* Rectangle class that models a rectangle with a length & width*/

/**
 * Rectangle
 */
public class Rectangle extends Shape {

    // Declare private instance variables
    private double length;
    private double width;

    // Constructors
    // Rectangle with default length & width
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // Rectangle with given length & width
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    // Rectangle with given length, width, string & color
    public Rectangle(double w, double l, String color, boolean filled) {
        super(color,filled);
        width = w;
        length = l;
    }

    // Public methods
    // Returns radius
    public double getLength() {
        return length;
    }

    // Sets new length
    public void setLength(double newLength) {
        length = newLength;
    }

    // Returns width
    public double getWidth() {
        return width;
    }

    // Sets new width
    public void setWidth(double newWidth) {
        width = newWidth;
    }

    // Returns area
    public double getArea() {
        return length * width;
    }

    // Returns perimeter
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    // Returns String
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}