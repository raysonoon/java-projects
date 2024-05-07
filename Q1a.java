// IM1003 2022-2023 Q1a 
/**
 * Q1a
 */
public class Q1a {

    public static void main(String[] args) {
        char[] a1 = {'J','O', 'V', 'I', 'A', 'L'};
        char[] a2 = foo(a1);
        System.out.println(bar(a2));
    }

    public static char[] foo(char[] inArr) {
        if (inArr.length < 2) throw new IllegalArgumentException();
        char[] outArr = new char[inArr.length - 2];
        for (int i = 1; i < inArr.length -1; ++i) {
            outArr[i - 1] = inArr[i];
            System.out.println("i=" + i + ",inArr[i]=" + inArr[i]); 
        }
        return outArr;
    }

    public static String bar(char[] arr) {
        String str = "";
        for (int i = arr.length - 1; i >= 0; --i) str += arr[i];
        return str;
    }
}