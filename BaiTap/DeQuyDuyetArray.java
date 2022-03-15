public class DeQuyDuyetArray {
    
    public static void duyetArray(int[] arr, int i){
        if(i < 0 || i >= arr.length){
            return;
        }
        
        System.out.println(arr[i]); 
        duyetArray(arr, i-1);
    }
    
    public static void main(String[] args) {
        int[] arr = {2,5,7,9};
        duyetArray(arr, arr.length-1);
    }

}
