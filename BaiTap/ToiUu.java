import java.util.LinkedList;

public class ToiUu {

    public static int chuyenDoiChuSangSo(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int chuyenDoiChuSangSo4(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum % 50;
    }

    public static int chuyenDoiChuSangSo2(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] - 'a' + 1);
        }
        return sum;
    }

    public static int chuyenDoiChuSangSo3(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ('z' - arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strArr = { "abc", "cba", "def", "xyz" };

        LinkedList[] linkArr = new LinkedList[79];
        for (int i = 0; i < strArr.length; i++) {
            int k = chuyenDoiChuSangSo2(strArr[i]);
            // 1 linkArr Tai k, chua co gi => Tao link list, roi nhet strArr[i]
            if (linkArr[k] == null) {
                linkArr[k] = new LinkedList<>();
                linkArr[k].add(strArr[i]);
            } else { // Neu da ton tai roi => nhet strArr[i] tiep vao linked list
                linkArr[k].add(strArr[i]);
            }
        }

        boolean isFound = false;
        String x = "bca";
        int k = chuyenDoiChuSangSo2(x);
        var linkList = linkArr[k];
        for (Object str : linkList) {
            if(str.equals(x)){
                isFound = true;
            }
        }
        System.out.println(isFound);

        //O(1) * N

        // System.out.println(daXuatHien[chuyenDoiChuSangSo2("xyz")]);
        // System.out.println(daXuatHien[chuyenDoiChuSangSo2("xzy")]);
    }
}
