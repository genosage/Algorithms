import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<String> list = main.combination("abcde");

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }

    public ArrayList<String> combination(String str) {
        ArrayList<String> list = new ArrayList<String>();

        if (str == null || str == "") {
            return list;
        }

        StringBuilder sb = new StringBuilder();
        char[] cs = str.toCharArray();

        for (int i = 1; i <= cs.length; i++) {
            recursion(list, sb, cs, 0, i);
        }

        return list;
    }

    public void recursion(ArrayList<String> list, StringBuilder sb, char[] cs, int index, int length) {
        if (length == 0) {
            list.add(sb.toString());
            return;
        }

        if (length > (cs.length - index) || index >= cs.length) return;

        sb.append(cs[index]);
        recursion(list, sb, cs, index + 1, length - 1);
        sb.deleteCharAt(sb.length() - 1);

        recursion(list, sb, cs, index + 1, length);
    }

    public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }

}