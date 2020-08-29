import java.util.Deque;
import java.util.LinkedList;

/**
 * @author cc
 * @version 1.0
 * @date 2020/8/29 15:52
 */
public class DequeDemo {

    public static void main(String[] args) {
        newCode();
    }

    public static void newCode() {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("a");
        System.out.println(deque);
        deque.addFirst("b");
        System.out.println(deque);
        deque.addLast("c");
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }

    public static void oldCode() {
        Deque<String> deque = new LinkedList<>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.poll());
        }

        System.out.println(deque);
    }
}
