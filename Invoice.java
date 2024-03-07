/* Invoice class that models an invoice for a particular customer, and composes and instance of Customer as an instance variable */

/**
 * Invoice
 */
public class Invoice {

    // Private instance variables
    private int id;
    private Customer customer;
    private double amount;

    // Public constructors
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Public setters & getters
    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return (100.0 - getCustomerDiscount())/100 * this.amount;
    }

    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer + ",amount=" + amount + "]";

    }
}
