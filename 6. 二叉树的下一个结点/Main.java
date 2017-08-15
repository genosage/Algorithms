import java.util.*;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        } else if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node != null) {
                if (node.left == null) {
                    return node;
                } else {
                    node = node.left;
                }
            }
            return null;
        } else if (pNode.next != null && pNode == pNode.next.left) {
            return pNode.next;
        } else if (pNode.next != null && pNode == pNode.next.right) {
            TreeLinkNode node = pNode.next;
            while (node != null) {
                if (node.next != null && node.next.left == node) {
                    return node.next;
                } else {
                    node = node.next;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}