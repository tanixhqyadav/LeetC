class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[]=new int[nums1.length+nums2.length];
        int x=0;
        for(int i=0;i<nums1.length;i++){
            nums3[x]=nums1[i];
            x++;
        }
        for(int i=0;i<nums2.length;i++){
            nums3[x]=nums2[i];
            x++;
        }
        Arrays.sort(nums3);
        if(nums3.length%2==1){
            return (double)nums3[(nums3.length-1)/2];
        }
        return (double) (nums3[(nums3.length)/2]+nums3[((nums3.length)/2)-1])/2;
    }
}