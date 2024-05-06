/* MovableCircle is composed of (has-a) MovablePoint */

/**
 * MovableCircle
 */
public class MovableCircle implements Movable{

    // Declare private instance variables
    private int radius;
    private MovablePoint center;

    // Public constructors
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed); // MovablePoint constructor for center object
        this.radius = radius;
    }

    // Public methods
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        //center.moveRight();
        // Alternatively
        center.x += center.xSpeed;
    }
}