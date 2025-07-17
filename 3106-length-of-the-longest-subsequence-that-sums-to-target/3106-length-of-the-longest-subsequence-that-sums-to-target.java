class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int t ) {
        int dp[][]=new int[nums.size()][t+1];
        Collections.sort(nums);

        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }

        int res = op(0,nums,t,dp);
        return res==Integer.MIN_VALUE ?-1 : res;
    }

    public static int op(int i, List<Integer> nums,int target, int dp[][]){

        if(target == 0) return 0;

        if(i==nums.size()){
            return Integer.MIN_VALUE;
        }

        if(dp[i][target] != -1){
            return dp[i][target];
        }

        int in = Integer.MIN_VALUE;
        int ex = Integer.MIN_VALUE;
        if(nums.get(i)<=target){
            int temp = op(i+1, nums, target-nums.get(i),dp);
            if(temp != Integer.MIN_VALUE){
                in = 1 + temp;
            }
        }

        ex = op(i+1, nums, target, dp);

        return dp[i][target] = Math.max(in,ex);
    }
}