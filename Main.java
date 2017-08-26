import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = scan.nextInt();
        }
    }
}