import java.util.*;

public class Main {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
        	list.add(scan.nextInt());
        }

        Collections.sort(list);
        System.out.println(rank(list.toArray(new Integer[list.size()]), 12));
	}

	public static boolean rank(Integer[] array, int target) {
		int low = 0;
		int mid;
		int high = array.length - 1;

		while (low <= high) {
			mid = (high + low) / 2;

			if (target < array[mid]) 
				high = mid - 1;
			} else if (target > array[mid]) {
				low = mid + 1;
			} else {
				return true;
			}
		}

		return false;
	}
}