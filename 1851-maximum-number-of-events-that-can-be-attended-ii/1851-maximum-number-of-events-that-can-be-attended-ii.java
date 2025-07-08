class Solution {
    public int maxValue(int[][] ev, int k) {
        Arrays.sort(ev,(a,b)->a[0]-b[0]);
        int dp[][]=new int[ev.length][k+1];
        for(int ar[]:dp){
             Arrays.fill(ar,-1);
        }
        return op(ev,k,dp,0,0);
    }

    public static int op(int[][] ev,int k,int[][] dp,int i,int t) {
        if(i==ev.length||t==k) return 0;
        if(dp[i][t]!=-1) return dp[i][t];

        int nx=bs(ev,ev[i][1]);
        int in=ev[i][2]+op(ev,k,dp,nx,t+1);
        int ex=op(ev,k,dp,i+1,t);

        return dp[i][t]=Math.max(in,ex);
    }

    public static int bs(int[][] ev,int endTime) {
        int l=0, r=ev.length;
        while(l<r){
            int m=(l+r)/2;
            if(ev[m][0]>endTime){
                r=m;
            }
            else{ 
                l=m+1;
            }
        }
        return l;
    }
}
