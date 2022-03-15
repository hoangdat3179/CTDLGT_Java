/**
 * Sample
 */
public class Sample {

    public static int chuyenDoiChuSangSo(String s){
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int chuyenDoiChuSangSo4(String s){
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum % 50;
    }

    
    public static int chuyenDoiChuSangSo2(String s){
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += (arr[i] - 'a' + 1);
        }
        return sum;
    }

    public static int chuyenDoiChuSangSo3(String s){
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += ('z' - arr[i]);
        }
        return sum;
    }


    public static void main(String[] args) {
        String[] strArr = {"abc", "def", "xyz"};
        int[] intArr = new int[3];

        // O(n)
        //B1 Chuyen doi strArr -> intArr
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = chuyenDoiChuSangSo2(strArr[i]);
        }

        // O(n)
        // Buoc 2
        boolean[] daXuatHien = new boolean[79];
        for (int i = 0; i < intArr.length; i++) {
            daXuatHien[intArr[i]]  = true;
        }

        //B3: Kiem tra x da ton tai hay chua
        System.out.println(daXuatHien[chuyenDoiChuSangSo2("xyz")]);
        System.out.println(daXuatHien[chuyenDoiChuSangSo2("xzy")]);
    }
}