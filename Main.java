import java.util.*;

class Main {

	public static void main(String[] args){
		int[][] array = {
			{1,2,3,4},
			{2,3,4,5},
			{3,4,5,6},
			{4,5,6,7}
		};

		System.out.println(Find(6, array));

	}

	public static boolean Find(int target, int [][] array) {
		int row = 0;
		int column = array[0].length - 1;

		while (row < array.length && column >= 0) {
			if (target == array[row][column]) {
				return true;
			} else if (target < array[row][column]) {
				column--;
			} else {
				row++;
			}
		}

		return false;
	}
}