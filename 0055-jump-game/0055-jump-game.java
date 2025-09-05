class Solution {
    public boolean canJump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(nums,0,dp)==1;
    }

    public static int rec(int ar[], int i, int dp[]) {
        if (i==ar.length-1) return 1;
        if (i>=ar.length) return 0;
        if (dp[i]!=-1) return dp[i];

        for (int x=1;x<=ar[i];x++) {
            if (rec(ar,i+x,dp)==1) {
                return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
}