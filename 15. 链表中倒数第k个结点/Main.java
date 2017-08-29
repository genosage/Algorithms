import java.util.*;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println();
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (k <= 0) return null;

        ListNode node = head;

        while (--k > 0) {
            if (node == null) return null;
            node = node.next;
        }
        
        if (node == null) return null;

        while (node.next != null) {
            head = head.next;
            node = node.next;
        }

        return head;
    }
}