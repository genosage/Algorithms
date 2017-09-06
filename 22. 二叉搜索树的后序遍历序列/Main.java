import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] a = {6, 7};

        System.out.println(main.VerifySquenceOfBST(a));
    }

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length <= 0) return false;
        return VerifySquenceOfBSTHelper(sequence, 0, sequence.length - 1);
    }

    public boolean VerifySquenceOfBSTHelper(int[] sequence, int low, int high) {
        if (low >= high) return true;

        int root = sequence[high];

        int i = low;
        for (; i < high; i++) {
            if (sequence[i] > root) break;
        }

        for (int j = i; j < high; j++) {
            if (sequence[j] < root) return false;
        }

        return VerifySquenceOfBSTHelper(sequence, low, i - 1) && VerifySquenceOfBSTHelper(sequence, i, high - 1);
    }
}