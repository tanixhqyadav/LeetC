class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int c=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-1]==nums[i-2]){
                if(nums[i-1]+nums[i-2]==nums[i]){
                    c++;
                }else{
                    c=0;
                }
            }
            else if(nums[i-1]+nums[i-2]==nums[i]){
                    c++;
            }else{
                c=0;
            }
            ans=Math.max(c+2,ans);
        }
        return ans;
    }
}