import java.util.LinkedList;
import java.util.Queue;

public class Bai933 {
    Queue<Integer> myQueue = new LinkedList<>();

    public int ping(int t) {
        myQueue.add(t);
        while( myQueue.peek() < t-3000 ){
            myQueue.poll();
        }
        return myQueue.size();
    }
}
