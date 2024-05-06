/* Test Driver for Shape superclass and subclasses */

/**
 * TestShape
 */
public class TestShape {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea()); // which version? Overridden method by Circle sub-class
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); cannot invoke methods from Circle
        // sub-class

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // cannot instantiate abstract class Shape

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast Rectangle to Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); cannot invoke methods from Rectangle
        // sub-class

        Rectangle r1 = (Rectangle)s3; // Downcast back to Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());

        Shape s4 = new Square(6.6); // Upcast Square to Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); cannot invoke methods from Square
        // sub-class

        Rectangle r2 = (Rectangle)s4; // Downcast Shape s4 to Rectangle, not Square
        System.out.println(r2); // Invoke methods from Square
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());  cannot invoke methods from Square
        // sub-class
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // Downcast Rectangle r2 to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}