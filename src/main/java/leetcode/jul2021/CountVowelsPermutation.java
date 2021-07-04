package leetcode.jul2021;

public class CountVowelsPermutation {
    public int accept(int n) {
        int MOD = (int)(1e9 + 7);
        long[][] dp = new long[n + 1][5];

        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }

        int[][] relation = new int[][] {
                { 1 }, { 0, 2 },
                { 0, 1, 3, 4 },
                { 2, 4 }, { 0 }
        };

        for (int i = 1; i < n; i++) {

            for (int u = 0; u < 5; u++) {
                dp[i + 1][u] = 0;

                for (int v : relation[u]) {

                    dp[i + 1][u] += dp[i][v] % MOD;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[n][i]) % MOD;
        }

        return (int)ans;
    }
}
