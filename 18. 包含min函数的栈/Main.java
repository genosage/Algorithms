import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println();
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.isEmpty()) {
            stack1.push(node);
            stack2.push(node);
        } else {
            stack2.push(Math.min(node, stack1.peek()));
            stack1.push(node);
        }
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}