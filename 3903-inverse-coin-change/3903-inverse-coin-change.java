import java.util.*;

class Solution {
    private int countWays(int amount, List<Integer> res, int index, int[][] dp) {
        if (amount == 0) return 1;
        if (index >= res.size() || amount < 0) return 0;
        if (dp[amount][index] != -1) return dp[amount][index];
        int take = countWays(amount - res.get(index), res, index, dp);
        int notTake = countWays(amount, res, index + 1, dp);
        return dp[amount][index] = take + notTake;
    }

    public List<Integer> findCoins(int[] numWays) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numWays.length; i++) {
            int amount = i + 1;
            int waysFromQ = numWays[i];
            int[][] dp = new int[amount + 1][res.size() + 1];
            for (int[] row : dp) Arrays.fill(row, -1);
            int possibleWays = countWays(amount, res, 0, dp);
            if (possibleWays > 0 && waysFromQ == 0) return new ArrayList<>();
            else if (possibleWays > waysFromQ || possibleWays < waysFromQ - 1) return new ArrayList<>();
            else if (possibleWays == waysFromQ - 1) res.add(amount);
        }
        return res;
    }
}
