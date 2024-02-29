/* Invoice Item that models an item of an invoice, with an ID, description, quantity & unit price */

public class InvoiceItem {

    // Declare private variables
    private String id, desc;
    private int qty;
    private double unitPrice;

    // Constructors
    // Invoice with given id, desc, qty & unit price
    public InvoiceItem(String ID, String DESC, int QTY, double UP) {
        id = ID;
        desc = DESC;
        qty = QTY;
        unitPrice = UP;
    }

    // Public methods
    // returns ID
    public String getId() {
        return id;
    }

    // returns desc
    public String getDesc() {
        return desc;
    }

    // returns qty
    public int getQty() {
        return qty;
    }

    // set qty
    public void setQty(int newQty) {
        qty = newQty;
    }

    // get unit price
    public double getUnitPrice() {
        return unitPrice;
    }

    // set unit price
    public void setUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice;
    }

    // get total
    public double getTotal() {
        return unitPrice * qty;
    }

    // returns string description of instance
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}