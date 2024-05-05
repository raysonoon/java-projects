/* LineSub is a point extended by NewPoint*/

/**
 * LineSub
 */
public class LineSub extends NewPoint {
    // Line consists 2 points: begin & end
    // Begin point inherited from superclass Point

    // Declare private instance variables
    NewPoint end; // Ending point

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct begin point
        this.end = new NewPoint(endX, endY); // construct end point
    }

    public LineSub(NewPoint begin, NewPoint end) {
        super(begin.getX(), begin.getY()); // reconstruct begin point
        this.end = end;
    }

    // Public setters & getters
    public NewPoint getBegin() {
        return this; // Return instance of LineSub, which is also a NewPoint
    }

    public NewPoint getEnd() {
        return end;
    }

    public void setBegin(NewPoint begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(NewPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return super.getX();
    }

    public int getEndY() {
        return super.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
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
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Angle of line (in radians)
    public double getAngle() {
        int xDiff = Math.abs(super.getX() - end.getX());
        int yDiff = Math.abs(super.getY() - end.getY());
        return Math.atan2(yDiff, xDiff);
    }

    // toString()
    public String toString() {
        return "Line begin " + super.toString() + " end " + end;
    }

    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println(l1.getLength());

        NewPoint p1 = new NewPoint(3, 4);
        NewPoint p2 = new NewPoint(7, 11);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getAngle());
    }
}