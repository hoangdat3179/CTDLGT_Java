import java.util.Arrays;

public class _747LargestNumber {

    public static int dominantIndex(int[] nums) {
        int[] x = Arrays.copyOf(nums, nums.length);
        Arrays.sort(x);
        if (x.length >= 2) {
            if ((x[x.length - 2] * 2) <= x[x.length - 1]) {
                return findIndex(nums, x[x.length - 1]);
            }
            return -1;
        }
        return 0;
    }

    public String defangIPaddr(String address) {
        return address.replace("\\.a", "[.]");
    }

    public static int findIndex(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int Khai(int[] nums) {
        int firstMax = -1;
        int secondMax = -1;
        int index = -1;

        // O(n)
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }

        }

        return index;
    }

    public static void main(String[] args) {

    }
}
