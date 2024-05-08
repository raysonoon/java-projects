/**
 * DropVowels
 */
public class DropVowels {

    public static void main(String[] args) {
        String input = "HELLO world";
        String result = dropVowels(input);
        System.out.println(result);
    }

    public static String dropVowels (String inStr) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        char inChar;
        boolean isVowel;
        String outStr = "";

        for (int i = 0; i < inStr.length(); i++) {
            inChar = inStr.charAt(i);
            isVowel = false;

            // Check if the current character is a vowel
            for (char vowel : vowels) {
                if (inChar == vowel) {
                    isVowel = true;
                    break;
                }
            }
            
            // If the current character is not a vowel, add it to the output string
            if (!isVowel) {
                outStr += inChar;
            }
        }
        return outStr;
    }
    
}