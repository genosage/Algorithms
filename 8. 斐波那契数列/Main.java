import java.util.*;

class Main {

    public static void main(String[] args){
        Main main = new Main();

        System.out.println(main.Fibonacci(39));
    }

    public int Fibonacci(int n) {
        int first = 0;
        int second = 1;

        while (n > 0) {
            second += first;
            first = second - first;
            n--;
        }

        return first;
    }
}