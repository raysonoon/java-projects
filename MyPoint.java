/* MyPoint class that models a 2D point with x & y coordinates */

/**
 * MyPoint
 */
public class MyPoint {

    // Declare private instance variables
    private int x, y;

    // Public constructors
    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public setters & getters
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        // Declare & allocate array
        int[] XY = new int[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.x - this.x, 2) + Math.pow(another.y - this.y, 2));
    }

    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}