public class _1346_Check_If_N {
    public static boolean checkIfExist(int[] a) {
        boolean[] daXuatHien = new boolean[2001];

        for (int i = 0; i < a.length; i++) {
            // Danh dau so a[i] da xuat hien
            int ai = a[i];
            daXuatHien[ai] = true;

            int bigger = a[i] * 2;
            if(bigger < daXuatHien.length){
                if(daXuatHien[bigger] == true){
                    return true;
                }
            }
       
            if(ai%2 == 0){
                int smaller = a[i]/2;
                if(daXuatHien[smaller]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {7,-1,14,11};
        System.out.println(checkIfExist(a));
    }
}
