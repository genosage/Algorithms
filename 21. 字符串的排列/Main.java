import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<String> list = main.Permutation("abc");

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();

        if (str == null || str == "") {
            return list;
        }

        recursion(list, str.toCharArray(), 0);

        Collections.sort(list);

        return list;
    }

    public void recursion(ArrayList<String> list, char[] cs, int index) {
        if (index == cs.length - 1) {
            String s = new String(cs);
            list.add(s);
            return;
        }

        for (int i = index; i < cs.length; i++) {
            if (i == index || cs[i] != cs[index]) {
                swap(cs, index, i);
                recursion(list, cs, index + 1);
                swap(cs, index, i);
            }
        }
    }

    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

}