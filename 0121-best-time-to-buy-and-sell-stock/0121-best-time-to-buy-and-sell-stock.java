class Solution {
    public int maxProfit(int[] pr) {
        // int ans=Integer.MIN_VALUE;
        // int i=0;
        // while(i<pr.length){
        //     int op=pr[i];
        //     int j=i+1;
        //     while(j<pr.length){
        //         if(pr[j]>op){
        //             ans=Math.max(ans,pr[j]-op);
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        // return ans==Integer.MIN_VALUE ? 0 : ans;
        // int dp[]=new int[pr.length];
        // Arrays.fill(dp,Integer.MIN_VALUE);
        // dpi(pr,dp);
        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<dp.length;i++){
        //     ans=Math.max(ans,dp[i]);
        // }
        // return ans;
        //Dp Solution Not Work and Simple BruteForce Working BUt The Best app is to
        // Claulacte the mini and diffrmec bot at same time 
        int ans=0;
        int t=pr[0];
        for(int i=1;i<pr.length;i++){
            t=Math.min(t,pr[i]);
            ans=Math.max(ans,pr[i]-t);
        }
        return ans;
    }
    // public static void dpi(int pr[],int dp[]){
    //     for(int i=0;i<pr.length;i++){
    //         int x=pr[i];
    //         int c=0;
    //         for(int j=i+1;j<pr.length;j++){
    //             if(pr[j]>x){
    //                 c=Math.max(c,pr[j]-x);
    //             }
    //         }
    //         dp[i]=c;
    //     }
    // }
     
}