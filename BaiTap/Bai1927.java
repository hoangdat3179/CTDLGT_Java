public class Bai1927 {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int soChuSo = demSoChuSo2(nums[i]);
            if (soChuSo % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int demSoChuSo(int a) {
        int dem = 0;
        while (a != 0) {
            a = a / 10;
            dem++;
        }
        return dem;
    }

    public static int demSoChuSo2(int a) {
        String aString = String.valueOf(a);
        return aString.length();
    }

    public static void main(String[] args) {
        // int[] arr = { 1234, 1234, 4567 };
        // System.out.println(findNumbers(arr));

        String s = "1234";
        System.out.println(s.length());

        int a = 123;
        String aString = String.valueOf(a);
        System.out.println(aString.length());
    }
}
