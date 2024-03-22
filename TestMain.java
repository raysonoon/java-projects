public class TestMain {
   public static void main(String[] args) {
      Animal a1 = new Animal("Animal 1");
      System.out.println(a1);
      Mammal m1 = new Mammal("Mammal 1");
      System.out.println(m1);
      Cat c1 = new Cat("Cat 1");
      System.out.println(c1);
      c1.greets();
      Dog d1 = new Dog("Dog 1");
      System.out.println(d1);
      d1.greets();
      Dog d2 = new Dog("Dog 2");
      d1.greets(d2);
   }
}
