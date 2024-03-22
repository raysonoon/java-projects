/* Point3D, subclass of Point2D */

/**
 * Point3D
 */
public class Point3D extends Point2D {

    // Private instance variables
    private float z;

    // Public constructors
    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    // Public setters & getters
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        // Declare & allocate XYZ array
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = z;
        
        return XYZ;
    }
    
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}