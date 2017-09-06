import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.NumberOf1(9));
    }

    public int NumberOf1(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}