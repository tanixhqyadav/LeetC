class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            int op=findI(nums2,nums1[i]);
            if(op==nums2.length){
                ans[i]=-1;
            }
            else{
                boolean x=false;
                for(int j=op+1;j<nums2.length;j++){
                    if(nums2[j]>nums1[i]){
                        x=true;
                        ans[i]=nums2[j];
                        break;
                    }
                }
                if(!x){
                    ans[i]=-1;
                }
            }
        }
        return ans;
    }
    public static int findI(int nums[], int k){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                ans=i;
            }
        }
        return ans;
    }
}