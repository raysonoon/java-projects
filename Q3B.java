// IM1003 2022-2023 Q3

public class Q3B extends Q3A {
    public Q3B(String name) {
        super(name);
    }

    @Override // Override interface hi() method
    public void hi() {
        System.out.println("B says hi");
    }
    public String toString() {
        return "B[name =" + super.name + "]";
    }
    
}