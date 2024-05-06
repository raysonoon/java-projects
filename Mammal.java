/* Mammal subclass of Animal*/

/**
 * Mammal
 */
public class Mammal extends Animal {
    
    // Public constructors
    public Mammal(String name) {
        super(name);
    }

    // Public methods
    @Override
    public void greets() {
        System.out.println("I'm :)");
    }

    // toString()
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}