import java.util.HashMap;

public class _290_Word_Pattern {
    public static boolean wordPattern(String s, String t) {
        HashMap<Character, String> H = new HashMap<>();
        String[] tArr = t.split(" ");

        if(s.length() != tArr.length) return false;

        for (int i = 0; i < s.length(); i++) {
            char ci = s.charAt(i);
            String ti = tArr[i];
            if(H.containsKey(ci)){
                String dich = H.get(ci);
                if(dich.equals(ti) == false){
                    return false;
                }
            }else{
                if(H.containsValue(ti)){
                    return false;
                }
                H.put(ci, ti);
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
