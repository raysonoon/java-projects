/* Customer class that models a customer in a transaction */

/**
 * Customer
 */
public class Customer {

    // Private instance variables
    private int id, discount;
    private String name;

    // Public constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Public setters & getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}