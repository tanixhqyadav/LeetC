class Solution {
    public int search(int[] nums, int t) {
        int x=nums[0];
        int y=nums[nums.length-1];
        int i=0;
        int j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            System.out.println(i+" "+j+" "+mid);
            if(nums[mid]==t){
                return mid;
            }
            if(nums[i]<=nums[mid]){
                if(nums[i]<=t && t<nums[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else {
                if(nums[mid]<t && t<=nums[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
                // /j=mid-1;
            }
        }
        return ans;
    }
}