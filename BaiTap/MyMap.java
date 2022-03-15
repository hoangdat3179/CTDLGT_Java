import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2 };

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int ai : arr) {
            if(myMap.containsKey(ai) == false){
                myMap.put(ai, 1);
            }else{
                int giaTriHienTaiCuaValue = myMap.get(ai);
                int giaTriMoi = giaTriHienTaiCuaValue + 1;
                myMap.put(ai, giaTriMoi);
            }
        }

        // for (var entry : myMap.entrySet()) {
        //     System.out.println(entry.getKey()  + " - " + entry.getValue());
        // }

        // for (Integer key : myMap.keySet()) {
        //     System.out.println(key + " - " + myMap.get(key));
        // }

        // 1-2
        // 2-2
        // 3-1
    }
}
