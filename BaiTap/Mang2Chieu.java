/**
 * Mang2Chieu
 */
public class Mang2Chieu {
    // MainTask: in ra a[i][j]
    public static void inMang2Chieu(int[][] a, int i, int j) {
        // BTCC / DKD
        if (i >= a.length || i < 0 || j >= a[0].length || j < 0) {
            return;
        }

        System.out.print(a[i][j] + " ");

        if(j == a[0].length-1){
            System.out.println();
            inMang2Chieu(a, i+1, 0);
        }else{
            inMang2Chieu(a, i, j + 1);
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        inMang2Chieu(a, 0, 0);
    }

    /**
     * 1 2 3
     * 1 2 3
     */
}