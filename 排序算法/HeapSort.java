import java.util.*;

class HeapSort {

	public static void main(String[] args) {
		int[] a = {5, 3, 7, 2, 0, 1, 6, 3, 6, 4, 2, 12};

		heapSort(a, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void heapSort(int[] a, int length) {
		for (int i = (length - 1) / 2; i >= 0; i--) {
			heapAdjust(a, i, length - 1);
		}

		for (int i = length - 1; i > 0; i--) {
			swap(a, 0, i);
			heapAdjust(a, 0, i - 1);
		}
	}

	public static void heapAdjust(int[] a, int start, int end) {
		while (true) {
			int child = start * 2;

			if (child > end) break;

			if (child + 1 <= end && a[child + 1] > a[child]) {
				child++;
			}

			if (a[start] >= a[child]) break;

			swap(a, start, child);
			start = child;
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}