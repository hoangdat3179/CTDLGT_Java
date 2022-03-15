import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);

        // System.out.println(mySet.size());
        mySet.remove(1);
        System.out.println(mySet.size());
        for (Integer x : mySet) {
            System.out.println(x);
        }

        // System.out.println(mySet.contains(1));
        // System.out.println(mySet.contains(5));
    }
}
