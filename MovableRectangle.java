/* Movable Rectangle is composed of (has) 2 MovablePoints topLeft & bottomRight */

/**
 * MovableRectangle
 */
public class MovableRectangle implements Movable {
    // Private instance variables
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    // Public constructor
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Public methods
    // toString()
    public String toString() {
        return topLeft.toString() + "," + bottomRight.toString();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}