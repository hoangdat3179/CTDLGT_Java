import java.util.HashMap;
import java.util.Map;

public class String2 {
    public static void main(String[] args) {
        String[] arr = { "abc", "xyz", "abc" };

        Map<String, Integer> myMap = new HashMap<>();
        
        for (String s : arr) {
            if(myMap.containsKey(s) == false){
                myMap.put(s, 1);
            }else{
                int giaTriHienTaiCuaValue = myMap.get(s);
                int giaTriMoi = giaTriHienTaiCuaValue + 1;
                myMap.put(s, giaTriMoi);
            }
        }

        for (var entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
