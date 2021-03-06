package leetcode.jul2021;

public class ReshapeMatrix {
    public int[][] accept(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if (r * c != n * m) return mat;
        int[][] result = new int[r][c];

        for (int i = 0; i < r * c; i++)
            result[i / c][i % c] = mat[i / m][i % m];
        return result;
    }
}
