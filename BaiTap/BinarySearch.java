public class BinarySearch {

    public static int search2(int[] a, int x) {
        int iL = 0, iR = a.length - 1;

        while( iL <= iR ){
            int k = (iL+iR)/2;
            if(a[k] == x){
                return k;
            }else if(a[k] < x){
                iL = k+1;
            }else{
                iR = k-1;
            }
        }

        return -1;
    }

    // i- >i +1
    // i -> i-1
    public static int deQuySearch(int[] a, int x, int iL, int iR){
        //1. Dieu kien dung
        if(iL > iR ){
            return -1;
        }

        //2. Main Task
        int k = (iL+iR)/2;
        if(a[k] == x){
            return k;
        }

        //3. CTTH
        int kq = -1;
        if(a[k] < x){
            kq = deQuySearch(a, x, k+1, iR);
        }else{
            kq = deQuySearch(a, x, iL, k-1);
        }
        
        return kq;
    }

    public static int search(int[] a, int x) {
        return deQuySearch(a, x, 0, a.length-1);
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8 };
     
    }
}
