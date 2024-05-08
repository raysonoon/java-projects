public class Q3Point2D implements Q3PointBase {

    protected int x;
    protected int y;
    
    public Q3Point2D() {
        x = 0;
        y = 0;
    }

    public Q3Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String describe() {
        return "(" + x + y + ")";
    }

    @Override
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Q3Point2D another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}