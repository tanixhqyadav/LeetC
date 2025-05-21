class Solution {
    public void sortColors(int[] nums) {
      int o=0;
      int on=0;
      int t=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0) o++;
        else if(nums [i]==1) on++;
        else if(nums[i]==2) t++;
      }
      int i=0;
      while(i<o && i<nums.length){
        nums[i]=0;
        i++;
      }
        int c=0;
      while(c<on && i<nums.length){
        nums[i]=1;
        c++;
        i++;
      }
      int k=0;
      while(k<t && i<nums.length){
        nums[i]=2;
        k++;
        i++;
      }
    //   return nums;
    }
}