import java.util.HashMap;
import java.util.Map;

public class _383_Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();

        HashMap<Character,Integer> rMap = new HashMap<>();
        HashMap<Character, Integer> mMap = new HashMap<>();

        for (Character c : ransomNoteChar) {
            if (!rMap.containsKey(c)) {
                rMap.put(c, 1);
            } else {
                rMap.put(c, rMap.get(c) + 1);
            }
        }
        for (Character c : magazineChar) {
            if (!mMap.containsKey(c)) {
                mMap.put(c, 1);
            } else {
                mMap.put(c, mMap.get(c) + 1);
            }
        }
        for (var key : rMap.keySet()) {
            if (mMap.containsKey(key)) {
                if (rMap.get(key) > mMap.get(key)) {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
