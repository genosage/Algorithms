import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}


public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        System.out.println("pre1:");
        preOrder1(root);

        System.out.println("pre2:");
        preOrder2(root);

        System.out.println("in1:");
        inOrder1(root);

        System.out.println("in2:");
        inOrder2(root);

        System.out.println("post1:");
        postOrder1(root);

        System.out.println("post2");
        postOrder2(root);
    }

    public static void preOrder1(TreeNode treeNode) {
        if (treeNode == null) return;

        System.out.println(treeNode.val);
        preOrder1(treeNode.left);
        preOrder1(treeNode.right);
    }

    public static void preOrder2(TreeNode treeNode) {
        if (treeNode == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (treeNode != null || !stack.isEmpty()) {
            if (treeNode != null) {
                System.out.println(treeNode.val);
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                treeNode = stack.pop();
                treeNode = treeNode.right;
            }
        }
    }

    public static void inOrder1(TreeNode treeNode) {
        if (treeNode == null) return;

        inOrder1(treeNode.left);
        System.out.println(treeNode.val);
        inOrder1(treeNode.right);
    }

    public static void inOrder2(TreeNode treeNode) {
        if (treeNode == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (treeNode != null || !stack.isEmpty()) {
            if (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                treeNode = stack.pop();
                System.out.println(treeNode.val);
                treeNode = treeNode.right;
            }
        }
    }

    public static void postOrder1(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder1(treeNode.left);
        postOrder1(treeNode.right);
        System.out.println(treeNode.val);
    }

    public static void postOrder2(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> output = new Stack<TreeNode>();

        stack.push(treeNode);

        while (!stack.isEmpty()) {
            treeNode = stack.pop();
            output.push(treeNode);

            if (treeNode.left != null) stack.push(treeNode.left);
            if (treeNode.right != null) stack.push(treeNode.right);

        }

        while (!output.isEmpty()) {
            System.out.println(output.pop().val);
        }
    }

}