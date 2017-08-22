import java.util.*;

class SelectionSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 12};

        selectionSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void selectionSort(int[] a, int length) {
        int min = 0;

        for (int i = 0; i < length - 1; i++) {

            min = i;

            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                swap(a, i, min);
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}