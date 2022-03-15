import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(9);
        myQueue.add(10);

        while(myQueue.peek() != 9){
            int x = myQueue.poll();
            System.out.println(x);
        }
        
        System.out.println("==============================");

        for (Integer x : myQueue) {
            System.out.println(x);
        }
        // 9 , 10
    }
}
