/**
 * GiaiThua
 */
public class GiaiThua {

    public static int giaiThua_Thai(int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
    
    // n! = n * (n-1)!
    public static int giaiThua(int n){
        if(n == 0){
            return 1;
        }
        return n * giaiThua(n-1);
    }


    public static void main(String[] args) {
        System.out.println(giaiThua(5));
    }
}