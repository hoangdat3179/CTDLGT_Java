import java.util.Stack;

public class Bai844 {

    public static String bienDoi(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> myStack = new Stack<>();

        for (char c : arr) {
            if (c != '#') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty() == false) {
                    myStack.pop();
                }
            }
        }

        // String kq = "";
        // for (Character c : myStack) {
        //     kq += c;
        // }
        return myStack.toString();
    }

    public static boolean backspaceCompare(String s, String t) {
        s = bienDoi(s);
        t = bienDoi(t);
        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c") == true);
        System.out.println(backspaceCompare("ab##", "c#d#") == true);
        System.out.println(backspaceCompare("a#c", "b") == false);
    }
}
