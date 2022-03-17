public class _2022_Convert_1D_Array_Into_2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        int index = 0;
        int[][] empty = new int[0][0];
        if (m * n != original.length)
            return empty;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[index];
                index++;
            }
        }
        return arr;
    }
}
