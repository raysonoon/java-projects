// IM1002 2022-2023 Q3

abstract public class Q3C extends Q3A implements ITF2 {
    protected int id;

    public Q3C(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public void hi(String name) {
        System.out.println("C says hi to " + name);
    }

    public String toString() {
        return "C[name=" + super.name + ",id=" + id + "]";
    }

    public static void main(String[] args) {
        // Q3A a1 = new Q3A("Peter");
 
         Q3B b1 = new Q3B("Paul");
         System.out.println(b1);
 
         Q3C c1 = new Q3D("Jane", 5); //upcast to D
         System.out.println(c1);
         c1.hi();
         c1.hi("Peter");
         c1.goodDay();
 
         Q3A a2 = new Q3D("David", 8);
         System.out.println(a2);
         a2.hi("Peter");
         //a2.hi(5);
     }
}