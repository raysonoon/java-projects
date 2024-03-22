/* Cat subclass of Mammal subclass */
/**
 * Cat
 */
public class Cat extends Mammal {

    // Public constructors
    public Cat(String name) {
        super(name);
    }

    // greets method
    public void greets() {
        System.out.println("Meow");
    }

    // toString()
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}