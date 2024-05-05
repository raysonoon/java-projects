/* 2 NewPoint instances compose a point */
/**
 * NewPoint
 */
public class NewPoint {

    // Declare private variables
    private int x, y;

    // Public constructor
    public NewPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public setters & getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString()
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        NewPoint p1 = new NewPoint(10, 20); // Construct a point
        System.out.println(p1);
        p1.setXY(100, 10);
        System.out.println(p1);
    }
}