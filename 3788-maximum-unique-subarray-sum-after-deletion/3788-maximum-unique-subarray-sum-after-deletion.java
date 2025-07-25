class Solution {
    public int maxSum(int[] nums) {
        int x=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x && x<0){
                x=nums[i];
            }
        }
        if(x<0){
            return x;
        }
        else{
            HashSet<Integer> mp=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=0){
                    mp.add(nums[i]);
                }
            }
            int s=0;
            for(int op:mp){
                s+=op;
            }
            return s;
        }
    }
}