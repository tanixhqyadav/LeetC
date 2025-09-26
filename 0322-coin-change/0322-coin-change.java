import java.util.*;

class Solution {
    public int coinChange(int[] co, int a) {
        int dp[][] = new int[co.length][a + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = vo(0, co, a, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int vo(int i, int co[], int am, int dp[][]) {
        if (am == 0) return 0;
        if (i == co.length) return Integer.MAX_VALUE;

        if (dp[i][am] != -1) return dp[i][am];

        int in = Integer.MAX_VALUE;
        if (am - co[i] >= 0) {
            int res = vo(i, co, am - co[i], dp);
            if (res != Integer.MAX_VALUE) in = 1 + res;
        }

        int ex = vo(i + 1, co, am, dp);

        return dp[i][am] = Math.min(in, ex);
    }
}
