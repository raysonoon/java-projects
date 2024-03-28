/* Animal superclass */

/**
 * Animal
 */
abstract public class Animal {

    // Private instance variables
    private String name;

    // Public constructors
    public Animal(String name) {
        this.name = name;
    }

    // Greets abstract method
    abstract public void greets();

    // toString()
    /*public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }*/
}