import java.util.*;

class BubbleSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 12};

        bubbleSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSort(int[] a, int length) {
        boolean flag = true;

        for (int i = 0; i < length - 1; i++) {

            flag = false;

            for (int j = length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    flag = true;
                }
            }

            if (!flag) break;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}