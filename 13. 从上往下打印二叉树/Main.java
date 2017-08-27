import java.util.*;

public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println();
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null) {
            return list;
        } else {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.left != null) queue.offer(root.left);
            if (root.right != null) queue.offer(root.right);
            list.add(root.val);
        }

        return list;
    }
}