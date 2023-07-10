import java.util.LinkedList;
import java.util.Queue;

//FIFO
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        // poll will remove first elements from queue also it will return same element.
        System.out.println(queue.poll());
        System.out.println(queue);

        //To check which next element will pop from queue
        System.out.println(queue.peek());

        queue.add(50);
        System.out.println(queue);

 /* There are 3 more function in queue which is same as these  but they all throw
            an exception.
            add() -> same as offer()
            remove() -> same as poll()
            element() -> same as peek()
        */
    }
}
