// IM1003 2022-2023 Q1b

import java.util.Scanner;

/**
 * PrintQ1bPattern
 */
public class PrintQ1bPattern {
    public static void main(String[] args) {
        int oddInt, midPt;
        
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter a positive odd integer: ");
        oddInt = in.nextInt();
        in.close();

        // Print pattern
        midPt = (oddInt +1)/2;
        for (int row = 1; row <= oddInt; row++) {
            for (int col = 1; col <= oddInt; col++) {
                if (row == midPt) {
                    System.out.print(col);
                } else {    // row other than 4
                    if (col == midPt) {
                        System.out.print("*");
                    } else {    // col other than 4
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // newline for next row
        }
    }
}