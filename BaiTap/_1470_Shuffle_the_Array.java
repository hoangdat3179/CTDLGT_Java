public class _1470_Shuffle_the_Array {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr =new int[2*n];
        int index=0;
       for(int i=0;i<n;i++){
           arr[index]=nums[i];
           arr[index+1]=nums[n+i];
           index+=2;
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7} ;
        System.out.println(shuffle(nums, 3));
    }
}
