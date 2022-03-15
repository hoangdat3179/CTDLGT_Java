public class Test {

    public static void temp1(){
        int[] a = { 1, 1, 2, 2, 3, 3, 3 };
        

        for (int i = 0; i < a.length; i++) {
            int countAi = 0;

            for (int j = 0; j < a.length; j++) {
                if(a[j] == a[i]){
                    countAi++;
                }
            }
            
            System.out.println(a[i] + " - " + countAi);
        }
    }

    public static void temp2(int[] a){
        int[] count = new int[101];

        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " - " + count[a[i]]);
        }
    }
    
    public static void main(String[] args) {
        int[] a =  { 1, 1, 2, 2, 3, 3, 3, 100 };
        temp2(a);
    }

}
