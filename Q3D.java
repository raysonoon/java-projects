// IM1003 Q3

public class Q3D extends Q3C {

    public Q3D(String name, int id) {
        super(name, id);
    }

    @Override
    public void hi() {
        System.out.println("D says hi");
    }

    public void hi(int id) {
        System.out.println("D says hi to " + id);
    }

    @Override
    public void bonjour() {
        System.out.println("D says bonjour");
    }

    @Override
    public String toString() {
        return "D[name=" + super.name + ",id=" + super.id + "]";
    }

}