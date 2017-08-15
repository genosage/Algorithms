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
        Main main = new Main();

        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = main.reConstructBinaryTree(pre, in);
        main.printTree(root);

        System.out.println();
    }

    public void printTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        System.out.println(treeNode.val);
        printTree(treeNode.left);
        printTree(treeNode.right);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }

        TreeNode treeNode = new TreeNode(pre[0]);

        int countL = 0;

        for (int i = 0; in[i] != pre[0]; i++) {
            countL++;
        }

        int[] preL = Arrays.copyOfRange(pre, 1, countL + 1);
        int[] inL = Arrays.copyOfRange(in, 0, countL);
        int[] preR = Arrays.copyOfRange(pre, countL + 1, pre.length);
        int[] inR = Arrays.copyOfRange(in, countL + 1, in.length);

        treeNode.left = reConstructBinaryTree(preL, inL);
        treeNode.right = reConstructBinaryTree(preR, inR);

        return treeNode;
    }
}