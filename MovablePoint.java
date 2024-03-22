/* MovablePoint subclass of Point */

/**
 * MovablePoint
 */
public class MovablePoint extends Point {

    // Private instance variables
    private float xSpeed, ySpeed;

    // Public constructors
    public MovablePoint() {
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Public setters & getters
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        // Declare & allocate XYSpeed array
        float[] XYSpeed = new float[2];
        XYSpeed[0] = xSpeed;
        XYSpeed[1] = ySpeed;
        return XYSpeed;
    }

    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")"; 
    }

    public MovablePoint move() {
        float x = super.getX(), y = super.getY();
        x += xSpeed;
        y += ySpeed;
        super.setXY(x,y);
        return this;
    }
}