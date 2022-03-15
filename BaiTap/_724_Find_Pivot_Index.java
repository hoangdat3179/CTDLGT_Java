/**
 * _724_Find_Pivot_Index
 */
public class _724_Find_Pivot_Index {

    public static boolean isPivot(int[] a, int i){
        int tongBenTrai = 0;
        int tongBenPhai = 0;

        for (int j = 0; j < a.length; j++) {
            if(j < i){
                tongBenTrai += a[j];
            }
            if(j > i){
                tongBenPhai += a[j];
            }
        }

        return tongBenTrai == tongBenPhai;
    }

    public static int pivotIndex(int[] a) {
        int tongBenTrai = 0;
        int tongBenPhai = 0;

        int SUM = 0;
        // n
        for (int ai : a) {
            SUM += ai;
        }

        //3n + n = 4n | 10 =? 40| 1000 =4 000
        // n^2 = 10 =? 1000 |1.000.000
        for (int i = 0; i < a.length; i++) {
            if(i-1 >= 0){
                tongBenTrai = tongBenTrai + a[i-1];
            }

            tongBenPhai = SUM - tongBenTrai - a[i];

            if(tongBenTrai == tongBenPhai){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums) == 3 ? "OK" : "---");
    }
}