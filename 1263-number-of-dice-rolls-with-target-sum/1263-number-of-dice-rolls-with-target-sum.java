class Solution {
    public int numRollsToTarget(int n, int k, int t) {
       int dp[][]=new int[n+1][t+1];
       for(int x[]:dp){
            Arrays.fill(x,-1);
       }
       return help(n,k,t,dp);
    }
    public static int help(int n , int k, int t, int dp[][]){
        if(n==0){
            return t==0 ?  1 : 0;
        }
        if(t<0){
            return 0;
        }
        if(dp[n][t]!=-1){
            return dp[n][t];
        }
        long s=0;
        int mod=1_000_000_007;
        for(int i=1;i<=k;i++){
            s=(s+help(n-1,k,t-i,dp))%mod;
        }
        return dp[n][t]=(int)(s);
    }
}