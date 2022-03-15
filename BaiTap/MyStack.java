import java.util.Stack;

/**
 * MyStack
 */
public class MyStack {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        while(myStack.peek() != 3){
            int x = myStack.pop();
            System.out.println(x);
        }

        System.out.println("=====================");

        for (Integer x : myStack) {
            System.out.println(x);//1,2,3
        }
    }
    
}