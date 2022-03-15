public class Sum {

    public static int sum(int[] a , int i){
        if(i >= a.length)  {
            return 0;
        }
        
        int tong = a[i] + sum(a, i+1);

        return tong;
    }

    public static void main(String[] args) {
        int x = 9 / 2;
        System.out.println("x = " + x);
    
    }
}
