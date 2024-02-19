/* Java program that prompts user for a string and counts no. of vowels
 * & digits (0-9) contained in the string
 */

import java.util.Scanner;

/**
 * CountVowelDigit
 */
public class CountVowelDigit {

    public static void main(String[] args) {
        // Declare variables
        String inStr; // input string
        int inStrLen; // Length of input String
        char inChar;
        int countvowel = 0, countdigit = 0;
        double percentagevowel, percentagedigit;

        // Scan keyboard for input
        Scanner in = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase(); // use next() to read a string and convert to lowercase
        inStrLen = inStr.length();
        in.close();

        // For loop to reverse string
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            inChar = inStr.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                countdigit++;
            } else {
                switch (inChar) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        countvowel++;
                        break;
                }
            }
        }
        
        // Compute percentages
        percentagevowel = (double)countvowel / inStrLen * 100;
        percentagedigit = (double)countdigit / inStrLen * 100;

        // Print results
        System.out.printf("Number of vowels is: %d (%.2f%%)%n", countvowel, percentagevowel);
        System.out.printf("Number of digits is: %d (%.2f%%)%n", countdigit, percentagedigit);

    }
}
