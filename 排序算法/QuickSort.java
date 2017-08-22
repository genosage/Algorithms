import java.util.*;

class QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 12};

        quickSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int[] a, int length) {
        qSort(a, 0, a.length - 1);
    }

    public static void qSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            qSort(a, low, pivot - 1);
            qSort(a, pivot + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivotKey = a[low];

        while (low < high) {
            while (a[high] >= pivotKey && high > low) {
                high--;
            }
            swap(a, low, high);
            while (a[low] <= pivotKey && low < high) {
                low++;
            }
            swap(a, low, high);
        }

        return low;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}