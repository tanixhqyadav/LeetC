class Solution {
    public int[] searchRange(int[] nums, int t) {
        int ar[]=new int[2];
        int i=0;
        int j=nums.length-1;
        int ans1=-1;
        int ans2=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==t){
                ans1=mid;
                j=mid-1;
            }
            else if(nums[mid]>t){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            System.out.println(i+" "+j+" "+mid);
            if(nums[mid]==t){
                ans2=mid;
                i=mid+1;
            }
            else if(nums[mid]<t){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        ar[0]=ans1;
        ar[1]=ans2;
        return ar;
    }
}