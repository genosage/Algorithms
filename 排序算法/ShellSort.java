import java.util.*;

class ShellSort {

    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 12};

        shellSort(a, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void shellSort(int[] a, int length) {
        int increment = length;

        while (increment > 1) {
            increment = increment / 3 + 1;

            for (int i = 0; i < length - increment; i++) {
                if (a[i + increment] < a[i]) {
                    int temp = a[i + increment];
                    int j = i;
                    while (j >= 0 && a[j] > temp) {
                        a[j + increment] = a[j];
                        j -= increment;
                    }
                    a[j + increment] = temp;
                }
            }
        }
    }
}