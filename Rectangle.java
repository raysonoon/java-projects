/* Rectangle class that models a rectangle with a length & width*/

/**
 * Rectangle
 */
public class Rectangle {

    // Declare private instance variables
    private float length;
    private float width;

    // Constructors
    // Rectangle with default length & width
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    // Rectangle with given length & width
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    // Public methods
    // Returns radius
    public float getLength() {
        return length;
    }

    // Sets new length
    public void setLength(float newLength) {
        length = newLength;
    }

    // Returns width
    public float getWidth() {
        return width;
    }

    // Sets new width
    public void setWidth(float newWidth) {
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
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}