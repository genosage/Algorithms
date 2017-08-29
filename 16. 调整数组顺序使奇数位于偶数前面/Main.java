import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        main.reOrderArray(a);

        System.out.println(Arrays.toString(a));
    }

    public void reOrderArray(int [] array) {
        if (array.length <= 1) return;

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] % 2 == 0 && array[j] % 2 != 0) {
                    swap(array, j - 1, j);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}