class Solution {
    public long splitArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
       long sump=0;
       long sumc=nums[0]+nums[1];
       for(int i=2;i<nums.length;i++){
            if(pr(i)){
                sump+=nums[i];
            }else{
                sumc+=nums[i];
            }
       } 
       return (long)Math.abs(sump-sumc);
    }
    public static boolean pr(int x){
        // if(x==0 || x==1){
        //     return false;
        // }
        for(int i=2;i<=Math.sqrt(x);i++){
            if((x%i)==0){
                return false;
            }
        }
        return true;
    }
}