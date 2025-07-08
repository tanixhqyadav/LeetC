class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=1;
        for(int i:dp){
            System.out.print(i+" ");
            max=Math.max(i,max);
        }
        return max;
    }
    public static int longo_Binary(int ar[]){
        int dp[]=new int[ar.length];
        dp[0]=ar[0];
        int le=1;
        for(int i=1;i<dp.length;i++){
            if(ar[i]>dp[le-1]){
                dp[le]=ar[i];
                le++;
            }
            else{
                int idx=Binary_s(dp,0,le-1,ar[i]);
                dp[idx]=ar[i];
            }
        }
        return le;
    }
    public static int Binary_s(int dp[], int i, int j, int x){
        int a=i;
        int b=j;
        int ans=0;
        while(a<=b){
            int mid=(a+b)/2;
            if(dp[mid]>=x){
                ans=mid;
                b=mid-1;
            }
            else{
                a=mid+1;
            }
        }
        return ans;
    }
}