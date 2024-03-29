/* MyTriangle class that models a triangle with 3 vertices. Uses
 * 3 MyPoint instances
 */

 /**
  * MyTriangle
  */
 public class MyTriangle {
 
    // Declare private instance variables
    private MyPoint v1, v2, v3;

    // Public constructors
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Obj string representation
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    public double getPerimeter() {
        double s1 = v1.distance(v2);
        double s2 = v2.distance(v3);
        double s3 = v1.distance(v3);
        return s1 + s2 + s3;
    }

    public String getType() {
        if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v1.distance(v3)) {
            return "Isosceles";
        } else if (v1.distance(v2) == v2.distance(v3) && v1.distance(v2) == v1.distance(v3)) {
            return "Equilateral";
        } else
         return "Scalene";
    }
 }