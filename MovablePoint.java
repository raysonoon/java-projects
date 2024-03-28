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
    public void moveUp() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    // toString()
    public String toString() {
        return "(" + x + "," + y + ")," + "speed=(" + xSpeed + "," + ySpeed + ")";
    }
}