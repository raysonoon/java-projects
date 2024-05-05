/* The class NewLine composes 2 instances of class NewPoint */

/**
 * NewLine
 */
public class NewLine {

    // Declare private instance variables
    private NewPoint begin, end; // beginning & ending point

    // Public constructors
    public NewLine(NewPoint begin, NewPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public NewLine(int beginX, int beginY, int endX, int endY) {
        // Construct the points
        begin = new NewPoint(beginX, beginY);
        end = new NewPoint(endX, endY);
    }

    // Public setters & getters
    public NewPoint getBegin() {
        return begin;
    }
    public NewPoint getEnd() {
        return end;
    }

    public void setBegin(NewPoint begin) {
        this.begin = begin;
    }

    public void setEnd(NewPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Length of line
    public int getLength() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // Angle of line (in radians)
    public double getAngle() {
        int xDiff = Math.abs(begin.getX() - end.getX());
        int yDiff = Math.abs(begin.getY() - end.getY());
        return Math.atan2(yDiff, xDiff);
    }

    // toString()
    public String toString() {
        return "Line begin " + begin + " end " + end;
    }

    // Test driver
    public static void main(String[] args) {
        NewLine l1 = new NewLine(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println(l1.getLength());

        NewPoint p1 = new NewPoint(3, 4);
        NewPoint p2 = new NewPoint(7, 11);
        NewLine l2 = new NewLine(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getAngle());
    }
}