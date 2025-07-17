class Solution {
    public int mincostTickets(int[] days, int[] costs) {
    int n = days.length;
    int[] dp = new int[n];
    Arrays.fill(dp, -1);
    return solve(0, days, costs, dp);
    }

private int solve(int idx, int[] days, int[] costs, int[] dp) {
    if(idx>=days.length) return 0;
    if(dp[idx] != -1) return dp[idx];
    int ans=Integer.MAX_VALUE;
    int [] dur={1, 7, 30};

    for(int i=0;i<3;i++){
        int cost=costs[i];
        int duro= dur[i];
        int ni=idx;
        while(ni<days.length && days[ni]<=days[idx]+duro-1){
            ni++;
        }
        ans=Math.min(ans,cost+solve(ni,days,costs,dp));
    }

    dp[idx]=ans;
    return ans;
}

}