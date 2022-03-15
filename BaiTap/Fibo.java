public class Fibo {


    public static int Fibo_KoDeQuy(int n) {
        if(n <= 2){
            return n;
        }
        int [] a = new int [n+1];
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }



    public static int Fibo(int n) {
        System.out.print(n + " ");
        if(n <= 2){
            return n;
        }
        int Fn_1 = Fibo(n - 1); // F4
        int Fn_2 = Fibo(n - 2); // F3
        return Fn_1 + Fn_2; //
    }

    // [5-4-3-2-1-2-3-2-1]        

    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }
}
