/**
 * The Ball class models a bouncing ball
 */
public class Ball {
    // The private instance variables
    private float x, y, xDelta, yDelta;
    private int radius;
 
    /** Constructs a Ball instance with the given input */
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
       this.x = x;
       this.y = y;
       this.xDelta = xDelta;
       this.yDelta = yDelta;
    }
 
    // The public getters and setters for the private variables
    public float getX() {
       return this.x;
    }
    public void setX(float x) {
       this.x = x;
    }

    public float getY() {
       return this.y;
    }
    public void setY(float y) {
       this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
       return this.xDelta;
    }
    public void setXDelta(float xDelta) {
       this.xDelta = xDelta;
    }

    public float getYDelta() {
       return this.yDelta;
    }
    public void setYDelta(float yDelta) {
       this.yDelta = yDelta;
    }
 
    /** Returns a self-descriptive String */
    public String toString() {
       return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
 
    /** Moves a step by increment x and y by xDelta and yDelta, respectively.
        Return "this" instance to support chaining operation. */
    public void move() {
       x += xDelta;
       y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    
    public void reflectVertical() {
        yDelta = -yDelta;
    }
 }
 