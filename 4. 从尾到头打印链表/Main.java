import java.util.*;


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ListNode head = new ListNode(0);
        ListNode current = head;

        for (int i = 1; i < 10; i++) {
            ListNode listNode = new ListNode(i);
            current.next = listNode;
            current = listNode;
        }

        main.printListFromTailToHead2(head);

        System.out.println();
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (ListNode current = listNode; current != null; current = current.next) {
            stack.push(current.val);
        }

        for (int val : stack) {
            list.add(val);
            System.out.println(val);
        }

        return list;
    }

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for (ListNode current = listNode; current != null; current = current.next) {
            stack.push(current.val);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            list.add(stack.pop());
        }

        return list;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (listNode == null) {
            return list;
        }
        recursion(listNode, list);
        return list;
    }

    public void recursion(ListNode listNode, ArrayList list) {
        if (listNode.next != null) {
            recursion(listNode.next, list);
        }

        System.out.println(listNode.val);
        list.add(listNode.val);
        return;
    }
}