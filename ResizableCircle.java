/* ResizableCircle subclass */

/**
 * ResizableCircle
 */
public class ResizableCircle extends Circle {

    // Public constructors
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Resize method
    public void resize(int percent) {
        radius = radius*percent/100.0;
    }

    // toString()
    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
}