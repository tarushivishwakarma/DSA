import java.util.*;

class Solution {

    boolean[][] bad;

    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {

        int n = mat.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (mat[0][0] == 0) {
            ans.add(new ArrayList<>(Arrays.asList(-1)));
            return ans;
        }

        int[][] path = new int[n][n];
        bad = new boolean[n][n];

        if (!solve(0, 0, mat, path, n)) {
            ans.add(new ArrayList<>(Arrays.asList(-1)));
            return ans;
        }

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(path[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }

    boolean solve(int i, int j, int[][] mat, int[][] path, int n) {

        if (i == n - 1 && j == n - 1) {
            path[i][j] = 1;
            return true;
        }

        if (bad[i][j]) {
            return false;
        }

        path[i][j] = 1;

        int jump = mat[i][j];

        for (int step = 1; step <= jump; step++) {

            // Right first
            int nj = j + step;

            if (nj < n && mat[i][nj] != 0) {
                if (solve(i, nj, mat, path, n)) {
                    return true;
                }
            }

            // Down second
            int ni = i + step;

            if (ni < n && mat[ni][j] != 0) {
                if (solve(ni, j, mat, path, n)) {
                    return true;
                }
            }
        }

        path[i][j] = 0;
        bad[i][j] = true;

        return false;
    }
}