class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int x=-1;
        for(int i=1;i<nums.length;i++){
            x=Math.max(x,Math.abs(nums[i-1]-nums[i]));
        }
        x=Math.max(x,Math.abs(nums[nums.length-1]-nums[0]));
        return x;
    }
}