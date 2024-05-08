import java.util.Scanner;

/**
 * PrintQ1bPattern2022
 */
public class PrintQ1bPattern2022 {

    public static void main(String[] args) {
        int size;
        char colChar = 'A';
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();

        // Print Pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                // Print headers
                if (col == 1) {
                    System.out.print((char)colChar);
                } else if (col == 2) {
                    System.out.print(":");
                } else if (col == 3) {
                    System.out.print(" ");
                } else if (col == 4) {
                    // Print + - based on row no.
                    for (int patternCount = 1; patternCount <= row; patternCount++) {
                        if (patternCount % 2 == 0) {
                            System.out.print("-");
                        } else {
                            System.out.print("+");
                        }
                    }
                }
            }
            colChar += 1;
            System.out.println();
        }
        
    }
}