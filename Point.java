/* Point Superclass */

/**
 * Point
 */
public class Point {

    // Declare private instance variables
    private float x, y;

    // Public constructors
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Public setters & getters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        // Declare & allocate XY array
        float[] XY = new float[2];
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}