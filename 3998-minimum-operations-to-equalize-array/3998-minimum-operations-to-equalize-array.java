class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==1) return 0;
        int and=nums[0];
        for(int i=1;i<nums.length;i++){
            and&=nums[i];
        }
        System.out.println(and);
        if(and==nums[0] && and==nums[nums.length-1]){
            return 0;
        }
        return 1;
    }
}