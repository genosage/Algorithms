import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};

        System.out.println(main.IsPopOrder(pushA, popA));
    }

    public boolean IsPopOrder(int [] pushA, int [] popA) {
        int pushIndex = 0;
        int popIndex = 0;

        Stack<Integer> stack = new Stack<Integer>();

        while (popIndex < popA.length) {
            if (!stack.empty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            } else {
                if (pushIndex == pushA.length) break; 
                stack.push(pushA[pushIndex]);
                pushIndex++;
            }
        }

        return popIndex == popA.length;
    }
}