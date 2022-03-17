public class _2154_Keep_Multiplying_Found_Values_by_Two {
    public int findFinalValue(int[] nums, int original) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == original){
                original = 2*original;
                i=-1;
            }
        }
        return original;
    }
}
