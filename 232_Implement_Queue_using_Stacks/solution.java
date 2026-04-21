import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    private Deque<Integer> stack1 = new ArrayDeque<>();
    private Deque<Integer> stack2 = new ArrayDeque<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        move();
        return stack2.pop();
    }

    public int peek() {
        move();
        return stack2.peek();

    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void move() {
        while (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */