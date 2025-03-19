class Solution {
    public int minOperations(int[] nums) {
        int ola=0;
        for (int i=0;i<=nums.length-3;i++) {
            if (nums[i]==0) {
                flip_flop(nums,i);
                ola++;
            }
        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                return -1; 
            }
        }
        return ola;
    }

    
    private static void flip_flop(int[] nums, int i) {
        for (int j=0;j<3;j++) {
            nums[i + j]=nums[i + j]==0?1:0;
        }
    }
}