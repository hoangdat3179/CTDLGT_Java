import java.util.Stack;

public class Bai20 {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> myStack = new Stack<>();
        // String moNgoac = "([{";

        for (char c : arr) {
            // if(moNgoac.indexOf(c) >= 0){
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else { // )]}
                if (myStack.isEmpty()) {
                    return false;
                }
                char p = myStack.peek();
                // String ketHop = p + "" + c;
                // if(ketHop.equals("()") || ketHop.equals("[]") || ketHop.equals("{}")){
                if ((c == ')' && p == '(')
                        || (c == ']' && p == '[')
                        || (c == '}' && p == '{')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }

        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()") == true);
        System.out.println(isValid("()[]{}") == true);
        System.out.println(isValid("{[()]}") == true);
        System.out.println(isValid("(]") == false);
        System.out.println(isValid("(") == false);
        System.out.println(isValid("]") == false);
    }
}
