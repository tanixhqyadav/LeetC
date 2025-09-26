class Solution {
    public int[] searchRange(int[] nums, int t) {
        int start=0;
        int end=nums.length-1;
        int fs=-1;
        int ls=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==t){
                fs=mid;
                end=mid-1;
            }
            else if(nums[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        start=0;
        end=nums.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==t){
                ls=mid;
                start=mid+1;
            }
            else if(nums[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{fs,ls};
    }
}