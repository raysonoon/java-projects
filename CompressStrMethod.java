// IM1003 2022-2023 Q1c
/* compress() takes non-empty string of uppercase letters and compresses
 * n adjacent repeated letters X, replacing with <nX> for n > 1
 */

 /**
  * CompressStrMethod
  */
 public class CompressStrMethod {
 
    public static void main(String[] args) {
        String test = "AAABBBCCDDEEFFG";
        System.out.println(compress(test));
    }

    public static String compress(String inStr) {
        String outStr = "";
        char savedChar = inStr.charAt(0); //non-empty
        int numChar = 1;
        char currentChar;

        for (int i = 1; i < inStr.length(); i++) {
            currentChar = inStr.charAt(i);
            if (currentChar == savedChar) {
                numChar++;
            } else { // safely assume no more of the same char if in sequence
                outStr += (numChar > 1) ? "<" + numChar + savedChar + ">" : savedChar;
                savedChar = currentChar; // move to next different character
                numChar = 1; // reset numChar
            }
        }
        // Append the last character or its compressed form after loop ends
        outStr += (numChar > 1) ? "<" + numChar + savedChar + ">" : savedChar;
        return outStr;
    }
 }