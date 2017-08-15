import java.util.*;

class Main {

	public static void main(String[] args){
		Main main = new Main();
		int[] numbers = {3,2,1,7,4,5,2,0};
		int[] duplication = new int[1];

		System.out.println(main.duplicate(numbers, 8, duplication));
		System.out.println(duplication[0]);

	}

	public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length == 0) return false;
         
        int[] num = new int[length];
         
        for (int i = 0; i < length; i++) {
            if (num[numbers[i]] == 0) {
                num[numbers[i]] = 1;
            } else {
                duplication[0] = numbers[i];
                return true;
            }
        }
         
        return false;
    }
}