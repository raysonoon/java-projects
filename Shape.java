/* Shape superclass */

/**
 * Shape
 */
public class Shape {

    // Private instance variables
    private String color;
    private boolean filled;

    // Public constructors
    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Public setters & getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}