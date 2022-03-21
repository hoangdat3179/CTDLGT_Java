import java.util.HashMap;

public class test1 {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String res[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].charAt(arr[i].length() - 1) - '0';
            String x = arr[i].substring(0, arr[i].length() - 1);

            res[a - 1] = x;

        }
        String ans = String.join(" ", res);
        return ans;
    }
}
