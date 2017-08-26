import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int[] a = {6501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913, 9962, 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465, 4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6335};

        System.out.println(main.minNumberInRotateArray(a));
    }


    public int minNumberInRotateArray(int [] array) {
        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }

            if (array[low] == array[mid] && array[mid] == array[high]) {
                int min = array[low];

                for (int i = low; i <= high; i++) {
                    min = array[i] > min ? min : array[i];
                }

                return min;
            }

            mid = (low + high) / 2;

            if (array[mid] >= array[low]) low = mid;

            if (array[mid] <= array[high]) high = mid;
        }

        return array[mid];
    }
}