import java.io.Console;

/**
 * Temp
 */
public class Temp {
    public static int count = 0;

    public static int search(int[] a, int x) {

        int iL = 0, iR = a.length - 1;

        while (iL <= iR) {
            count++;
            // 1
            int k = (iL + iR) / 2;
            if (a[k] == x) {
                return k;
            } else if (a[k] < x) {
                iL = k + 1;
            } else {
                iR = k - 1;
            }
        }

        return -1;
    }

    public int search1(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public  static long fib(int N) {
        count++;
        if(N <= 1) return N;
        return fib(N-1) + fib(N-2);
    }

    public static void main(String[] args) {
        fib(30);
        System.out.println(count);
    }

}