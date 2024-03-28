/* BigDog subclass of Dog */

/**
 * BigDog
 */
public class BigDog extends Dog {
    
    // Public constructors
    public BigDog(String name) {
        super(name);
    }

    // Greet methods
    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}