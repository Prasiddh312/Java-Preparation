import java.util.Stack;
//Stack(LIFO) has methods like PUSH POP PEEK
//It also contains methds of list like add,remove...etc.
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.push(20);
        s.push(30);
        System.out.println(s);

        System.out.println(s.peek());
        //s.remove(1);
        //System.out.println(s);

        s.pop();
        System.out.println(s);
    }
}
