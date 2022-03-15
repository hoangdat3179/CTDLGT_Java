import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bai217 {

    public boolean containsDuplicate(int[] nums) {
        //1 1 2 3 => 3
        Set<Integer> mySet = new HashSet<>();
        for (Integer x : nums) {
            mySet.add(x);
        }

        if(mySet.size() < nums.length){
            return true;
        }

        return false;
    }


}
