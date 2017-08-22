import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();;
        int number = 1;

        while (count > 0) {
            number++;

            boolean flag = false;
            int i = 2;
            int sqrt = (int)Math.sqrt(number);

            while (i <= sqrt) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
                i++;
            }

            if (!flag) {
                count--;
            }
        }

        System.out.println(number);
    }
}