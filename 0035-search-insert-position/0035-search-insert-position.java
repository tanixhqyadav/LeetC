class Solution {
    public int searchInsert(int[] nums, int t) {
        int i=0;int j=nums.length-1;
        int ans=nums.length;
        while(i<=j){
            int mid=(i+j)/2;
            System.out.println(mid+", "+i+","+j);
            if(nums[mid]==t){
                return mid;
            }
            else if(t<nums[mid] ){
                ans=mid;
                j=mid-1;
            }
            else {
                i=mid+1;
                // ans=mid+1;
            }
        }
        return ans;
    }
}