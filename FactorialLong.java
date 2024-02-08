/* Java program that prompts user for an integer n and prints factorialLong of n */

/**
 * FactorialLong
 */

 import java.util.Scanner;

 public class FactorialLong {
 
     public static void main(String[] args) {
         // Scan keyboard for input
         Scanner in = new Scanner(System.in);
 
         // Declare variables
         int number;
         long factorial = 1;
 
         // Prompt user for input
         System.out.print("Enter an integer: ");
         number = in.nextInt();
 
         // For loop to compute factorial
         for (int product = 1; product <= number; product++) 
             factorial *= product;
 
         // Display results
         System.out.println("The Factorial of " + number + " is: " + factorial);
 
         in.close();
     }
 }