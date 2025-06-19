class Solution {
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       dp[1]=2;
       return opl(dp,n);
    }
    public static int opl(int dp[], int n){
        if(n==1 || n==2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=opl(dp,n-1)+opl(dp,n-2);
    }
}