public class TestMain {
   public static void main(String[] args) {
      Cat c1 = new Cat("Cat 1");
      c1.greets();   // Meow
      Dog d1 = new Dog("Dog 1");
      Dog d2 = new Dog("Dog 2");
      d1.greets();    // Woof
      d1.greets(d2);  // Woooof
      BigDog b1 = new BigDog("BigDog 1");
      BigDog b2 = new BigDog("BigDog 2");
      b1.greets();    // Wooow
      b1.greets(d1);  // Woooooow
      b1.greets(b2);  // Wooooooooow

      // Test Polymorphism
      Animal a1 = new Cat("Cat 1");
      a1.greets();  // Meow
      Animal a2 = new Dog("Dog 1");
      a2.greets();  // Woof
      Animal a3 = new BigDog("Big Dog 1");
      a3.greets();  // Wooow
   }
}