/* Dog subclass of Animal */
/**
 * Dog
 */
public class Dog extends Animal {

    // Public constructors
    public Dog(String name) {
        super(name);
    }

    // greets method
    public void greets() {
        System.out.println("Woof");
    }

    // greets another dog
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    /*// toString()
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }*/
}