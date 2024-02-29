/* Account class that models bank account of a customer */

public class Account {

    // Declare private variables
    private String id;
    private String name;
    private int balance;

    // Constructors
    // Account with given id, name & default balance
    public Account(String ID, String NAME) {
        id = ID;
        name = NAME;
        balance = 0;
    }

    // Account with given id, name & balance
    public Account(String ID, String NAME, int BALANCE) {
        id = ID;
        name = NAME;
        balance = BALANCE;
    }

    // Public methods
    // returns ID
    public String getId() {
        return id;
    }

    // returns desc
    public String getName() {
        return name;
    }

    // returns balance
    public int getBalance() {
        return balance;
    }

    // credit to balance
    public int credit(int topup) {
        balance += topup;
        return balance;
    }

    // debit from balance
    public int debit(int deduct) {
        if (deduct <= balance)
            balance -= deduct;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    // bank transfer
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // returns string description of instance
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}