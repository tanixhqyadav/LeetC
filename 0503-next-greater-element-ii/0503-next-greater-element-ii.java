class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=i;
            int c=0;
            boolean x=false;
            while(c<=nums.length){
                if(nums[j]>nums[i]){
                    x=true;
                    ans[i]=nums[j];
                    break;
                }
                c++;
                j=(j+1)%nums.length;
            }
            if(!x){
                ans[i]=-1;
            }
        }
        return ans;
    }
}