/* Java program that prints "ONE", "TWO", "NINE", "OTHER" if 
depending on value of int variable */

public class PrintNumberInWord {
    public static void main(String[] args) {
        // Declare & initialise number variable
        int number = 1;

        // Switch-case-default to print respective results
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("OTHER");  
        }
    }
} 