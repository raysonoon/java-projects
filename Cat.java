/* Cat subclass of Animal */
/**
 * Cat
 */
public class Cat extends Animal {

    // Public constructors
    public Cat(String name) {
        super(name);
    }

    // greets method
    public void greets() {
        System.out.println("Meow");
    }

    /*// toString()
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }*/
}