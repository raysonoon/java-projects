public class Q3Point3D extends Q3Point2D {

    protected int z;
    
    public Q3Point3D() {
        super();
        z = 0;
    }

    public Q3Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public String describe() {
        return "(" + super.x + "," + super.y + "," + z + ")";
    }

    @Override
    public double distance() {
        return Math.sqrt(super.x*super.x + super.y*super.y + z*z);
    }

    public double distance(Q3Point3D another) {
        int xDiff = super.x - another.x;
        int yDiff = super.y - another.y;
        int zDiff = this.z - another.z;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }

    public static void main(String[] args) {
        Q3Point2D p2a = new Q3Point2D(1, 0);
        Q3Point2D p2b = new Q3Point2D(2, 0);
        System.out.println(p2a.distance(p2b)); // 1

        Q3Point3D p3a = new Q3Point3D(5, 0, 0);
        Q3Point3D p3b = new Q3Point3D(8, 0 ,0);
        System.out.println(p3a.distance(p3b)); // 2

        System.out.println(p3a.distance(p2a)); // 3
        System.out.println(p2b.distance(p3b)); // 4

        Q3Point2D p2c = new Q3Point3D(10, 0, 0);;
        System.out.println(p2c.distance(p2a)); // 5
        System.out.println(p2c.distance(p3a)); // 6
        System.out.println(p3b.distance(p2c)); // 7

        //Q3PointBase p1a = new Point2D(8, 0);
       // System.out.print(p1a.distance());
    }
}