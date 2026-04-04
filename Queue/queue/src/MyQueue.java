import java.util.*;

class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    // push element
    void push(int x) {
        in.push(x);
    }

    // pop element
    int pop() {
        shift();
        if (out.isEmpty()) return -1;
        return out.pop();
    }

    // peek front
    int peek() {
        shift();
        if (out.isEmpty()) return -1;
        return out.peek();
    }

    // check empty
    boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    // helper
    void shift() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();

        int n = sc.nextInt();  // number of operations

        while (n-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {          // push
                int x = sc.nextInt();
                q.push(x);
            }
            else if (type == 2) {     // pop
                System.out.println(q.pop());
            }
            else if (type == 3) {     // peek
                System.out.println(q.peek());
            }
            else if (type == 4) {     // empty
                System.out.println(q.empty());
            }
        }
    }
}