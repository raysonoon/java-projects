// IM1003 Q3

/**
 * Q3A
 */
abstract public class Q3A implements ITF1 {
    protected String name;

    public Q3A(String name) {
        this.name = name;
    }

    public void hi(String name) {
        System.out.println("A says hi to " + name);
    }
    public void goodDay() {
        System.out.println("A says good day");
    }
}