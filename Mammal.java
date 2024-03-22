/* Mammal subclass of Animal*/

/**
 * Mammal
 */
public class Mammal extends Animal {
    
    // Public constructors
    public Mammal(String name) {
        super(name);
    }

    // toString()
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}