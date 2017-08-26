import java.util.*;

class Main {

    public static void main(String[] args){
        Main main = new Main();

        System.out.println(main.JumpFloor(6));

    }

    public int JumpFloor(int target) {
        if (target == 0) return 1;
        if (target == 1) return 1;

        return JumpFloor(target - 2) + JumpFloor(target - 1);
    }

    public int JumpFloorII(int target) {
        if (target == 0) return 1;
        if (target == 1) return 1;

        return 2 * JumpFloorII(target - 1);
    }
}