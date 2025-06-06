class Solution {
    public int arraySign(int[] nums) {
        int n=0;
        int p=0;
        // int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]>0){
                p++;
            }
            if(nums[i]<0){
                n++;
            }
        }
        if(n%2==1){
            return -1;
        }
        return 1;
    }
}