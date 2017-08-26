import java.util.*;

class Main {

    public static void main(String[] args) {
        Main main = new Main();

        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        int rows = 3;
        int cols = 4;
        char[] str = {'b', 'c', 'c', 'e', 'd'};

        System.out.println(main.hasPath(matrix, rows, cols, str));
    }


    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        char[][] board = new char[rows][cols];
        boolean[][] used = new boolean[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            board[i / cols][i % cols] = matrix[i];
            used[i / cols][i % cols] = false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (dfs(board, used, str, i / cols, i % cols, 0)) return true;
        }

        return false;
    }

    public boolean dfs(char[][] board, boolean[][] used, char[] str, int row, int col, int index) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;

        if (!used[row][col] && board[row][col] == str[index]) {
            if (index == str.length - 1) return true;

            used[row][col] = true;

            if (dfs(board, used, str, row - 1, col, index + 1)) return true;
            if (dfs(board, used, str, row + 1, col, index + 1)) return true;
            if (dfs(board, used, str, row, col - 1, index + 1)) return true;
            if (dfs(board, used, str, row, col + 1, index + 1)) return true;

            used[row][col] = false;

            return false;
        }

        return false;
    }
}