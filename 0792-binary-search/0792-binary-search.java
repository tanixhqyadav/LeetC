class Solution {
    public int search(int[] nums, int t) {
        if(nums[0]==t) return 0;
        int ans=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(t==nums[mid]){
                return mid;
            }
            else if(nums[mid]>t){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}