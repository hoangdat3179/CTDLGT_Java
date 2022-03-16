import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> myMap = new HashMap<Character, String>();
        Set<String> word_set = new HashSet<String>();
        Set<Character> pattern_set = new HashSet<Character>();
        String[] words = s.split(" ");
        for (String word : words) {
            word_set.add(word);
        }
        for (char c : pattern.toCharArray()) {
            pattern_set.add(c);
        }
        if (words.length != pattern.length() || word_set.size() != pattern_set.size()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (myMap.containsKey(pattern.charAt(i))) {
                if (!myMap.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                myMap.put(pattern.charAt(i), words[i]);
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
