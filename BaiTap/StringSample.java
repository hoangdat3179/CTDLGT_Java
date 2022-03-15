import java.util.Arrays;

/**
 * StringSample
 */
public class StringSample {

    public static void main(String[] args) {
        // 1. check if there is "porn" in a sentence " there is a porn"
        String post = "there is a porn";
        if(post.contains("porn")){
            System.out.println("Xoa");
        }

        // 2. replace all "porn" to "xxxx"
        String modifiedPost = post.replace("porn", "xxx");
        
        // 3. "Hoang Van Cong" to "HOANG VAN CONG"
        String name = "Hoang Van Cong";
        String capitalName = name.toUpperCase();

        // 4. "dog,cat,bird" to ["dog", "cat", "bird"]
        String input = "dog,cat,bird";
        String[] output = input.split(","); //["dog", "cat", "bird"]

        // "abc" => ['a', 'b', 'c']
        String s = "abc";
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}