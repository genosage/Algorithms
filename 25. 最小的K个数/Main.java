import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {3, 2, 1, 6, 4, 2, 3};
        ArrayList<Integer> list = main.GetLeastNumbers_Solution(a, 4);
        for (int i : list) {
            System.out.println(i);
        }
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (k <= 0) return list;
        if (input == null || input.length < k) return list;

        int low = 0;
        int high = input.length - 1;
        int pivot = Partition(input, low, high);

        while (pivot != k - 1) {
            if (pivot > k - 1) {
                high = pivot - 1;
            } else {
                low = pivot + 1;
            }

            pivot = Partition(input, low, high);
        }

        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }

        return list;
    }

    public int Partition(int[] input, int low, int high) {
        int pivotKey = input[low];

        while (low < high) {
            while (low < high && input[high] >= pivotKey) high--;
            swap(input, low, high);
            while (low < high && input[low] <= pivotKey) low++;
            swap(input, low, high);
        }

        return low;
    }

    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}