/* Person student staff inheritance */

/**
 * Person
 */
public class Person {

    // Declare private instance variables
    private String name, address;

    // Public constructors
    public Person(String name, String address) {
        this. name = name;
        this.address = address;
    }

    // Public setters & getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override // optional checks whether method in superclass is to be overridden --> signals an error toString is misspelled
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}