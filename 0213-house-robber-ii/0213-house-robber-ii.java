class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[]=new int[nums.length];
        int dp1[]=new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        return Math.max(op(dp,nums,0),op2(dp1,nums,1));
    }
    public static int op(int dp[], int nums[], int i){
        if(i>=nums.length-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int in=0,ex=0;
        in=nums[i]+op(dp,nums,i+2);
        ex=op(dp,nums,i+1);
        return dp[i]=Math.max(in,ex);
    }
    public static int op2(int dp[], int nums[], int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int in=0,ex=0;
        in=nums[i]+op2(dp,nums,i+2);
        ex=op2(dp,nums,i+1);
        return dp[i]=Math.max(in,ex);
    }
}