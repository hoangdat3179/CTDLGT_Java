import java.util.HashMap;
import java.util.Map;

public class Bai387 {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        
        Map<Character, Integer> myMap = new HashMap<>();

        for (char c : arr) {
            if(myMap.containsKey(c)){
                int soHienTai = myMap.get(c);
                myMap.put(c, soHienTai+1);
            }else{  
                myMap.put(c, 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(myMap.get(arr[i]) == 1){
                return i;
            }
        }

        return -1;
    }
}
