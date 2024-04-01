package 经典算法;
import java.util.ArrayList;
import java.util.List;
public class 八皇后 {
public static void main(String[] args) {
	
}
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        // 使用 char[][] 是为了展示结果时，直接使用 new String(char[])。
        // 一般情况下，使用 boolean[][] 即可。
        char[][] result = new char[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                result[i][j] = '.';
            }
        }
        backtrack(results, result, 0);
        return results;
    }

    private static void backtrack(List<List<String>> results, char[][] result, int x) {
        for (int j = 0; j < result.length; ++j) {
            if (isValid(result, x, j)) {
                result[x][j] = 'Q';
                if (x == result.length - 1) {
                    showResult(results, result);
                    // 可以直接 break
                } else {
                    // 皇后问题中，不会出现一行出现多个，所以直接跳到下一行
                    backtrack(results, result, x + 1);
                }
                result[x][j] = '.';
            }
        }
    }

    private static boolean isValid(char[][] result, int x, int y) {
        // ... (0, y)
        // ... ......
        // ... (x-1, y)
        // ... (x, y)
        for (int i = 0; i < x; ++i) {
            if (result[i][y] == 'Q') {
                return false;
            }
        }
        // ...
        // ... (x-1, y-1)
        // ... .......... (x, y)
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; --i, --j) {
            if (result[i][j] == 'Q') {
                return false;
            }
        }
        // ...
        // ... ...... (x-1, y+1)
        // ... (x, y)
        for (int i = x - 1, j = y + 1; i >= 0 && j < result.length; --i, ++j) {
            if (result[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    private static void showResult(List<List<String>> results, char[][] result) {
        List<String> list = new ArrayList<>(result.length);
        for (char[] value : result) {
            list.add(new String(value));
        }
        results.add(list);
    }
}