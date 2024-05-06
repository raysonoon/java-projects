/* MovablePoint class implements Movable interface */

/**
 * MovablePoint
 */
public class MovablePoint implements Movable {
    // Package-private variables
    int x, y, xSpeed, ySpeed;

    // Public constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Public methods
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    // toString()
    public String toString() {
        return "(" + x + "," + y + ")," + "speed=(" + xSpeed + "," + ySpeed + ")";
    }
}