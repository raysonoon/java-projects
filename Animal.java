/* Animal superclass */

/**
 * Animal
 */
public class Animal {

    // Private instance variables
    private String name;

    // Public constructors
    public Animal(String name) {
        this.name = name;
    }

    // toString()
    public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }
}