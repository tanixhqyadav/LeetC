class Solution {
    public int rob(int[] nums) {
        int sp[]=new int[nums.length];
        Arrays.fill(sp,-1);
        int x=op(nums,sp,0);
        for(int i=0;i<nums.length;i++){
            System.out.print(sp[i]+" ");
        }
        return x;
    }
    public static int op(int nums[], int dp[],int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int in=0;int ex=0;
        in=nums[i]+op(nums,dp,i+2);
        ex=op(nums,dp,i+1);
        return dp[i]=Math.max(in,ex);
    }
}