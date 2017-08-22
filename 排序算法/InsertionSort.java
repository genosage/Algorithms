import java.util.*;

class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 0};

        insertionSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void insertionSort(int[] a, int length) {
        for (int i = 0; i < length - 1; i++) {
            if (a[i + 1] < a[i]) {
                int temp = a[i + 1];
                int j = i;
                while (j >= 0 && a[j] > temp) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = temp;
            }
        }
    }
}