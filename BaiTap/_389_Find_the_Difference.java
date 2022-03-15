import java.util.Arrays;

public class _389_Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] != tChar[i]) {
                return tChar[i];
            }
        }
        return tChar[tChar.length - 1];
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}