import java.util.Scanner;

/* Java program that prints "ONE", "TWO", "NINE", "OTHER" if 
depending on value of int variable */

public class PrintNumberInWord {
    public static void main(String[] args) {
        // Declare & initialise number variable
        int numberIn;
        // Scan keyboard input
        Scanner in = new Scanner(System.in);

        // Prompt & read user input
        System.out.print("Enter a number: ");
        numberIn = in.nextInt();

        // Switch-case-default to print respective results
        switch (numberIn) {
            case 0:
                System.out.println("ZERO");
                break;
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
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");  
        }
        
        System.out.println("bye!");

        in.close();
    }
} 