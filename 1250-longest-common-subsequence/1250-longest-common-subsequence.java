class Solution {
    public int longestCommonSubsequence(String te1, String te2) {
        int dp[][]=new int[te1.length()+1][te2.length()+1];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return op(te1,te2,dp,0,0);

    }
    public static int op(String s1,String s2, int dp[][], int i, int j){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=1+op(s1,s2,dp,i+1,j+1);
        }
        else{
            int pop=op(s1,s2,dp,i+1,j);
            int pxp=op(s1,s2,dp,i,j+1);
            ans=Math.max(pop,pxp);
        }
        return dp[i][j]=ans;
    }
}