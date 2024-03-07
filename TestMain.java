public class TestMain {
   public static void main(String[] args) {
      // Test constructor and toString()
      MyComplex c1 = new MyComplex();
      System.out.println(c1);  // toString()
      MyComplex c2 = new MyComplex(1.1, 2.2);
      System.out.println(c2);  // toString()

      // Test Getters and Setters
      c1.setReal(3.3);
      c1.setImag(4.4);
      System.out.println(c1);
      System.out.printf("Real is: %.2f%n", c1.getReal());
      System.out.printf("Imaginary is: %.2f%n", c1.getImag());
      System.out.printf("Magnitude is: %.2f%n", c1.magnitude());

      // Test equals()
      System.out.println("Is equal: " + c1.equals(c2));
      System.out.println("Is equal: " + c1.equals(3.3, 4.4));

      // Test isReal(), isImaginary()
      c1.setValue(5.5, 0.0);
      System.out.println(c1);
      System.out.println("Is real: " + c1.isReal());
      System.out.println("Is Imaginary: " + c1.isImaginary());

      // Test addInto() and addNew()
      System.out.println(c1.addInto(c2));  // toString()
      System.out.println(c1);   // c1 changed
      System.out.println(c1.addNew(c2));  // toString()
      System.out.println(c1);   // c1 no changed
   }
}