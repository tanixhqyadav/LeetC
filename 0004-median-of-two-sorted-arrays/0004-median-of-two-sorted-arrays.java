class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            // double k = nums1[i];
            nums3[i] = nums1[i];
        }

        for(int j=0;j<nums2.length;j++){
            // double h = nums2[j];
            nums3[nums1.length+j] = nums2[j];
        }

        Arrays.sort(nums3);    

        int mid = (nums3.length-1)/2;
        if(nums3.length%2!=0){
            return (double)nums3[mid];
        }
        else{
            return (double)(nums3[mid]+nums3[mid+1])/2;
        
        }

        // int start = 0;
        // int end = nums3.length-1;
        // while(start<=end){
        //     double mid = start +(end - start)/2;
        //     double sum = 0;
        //     if(nums3.length%2!=0){
        //         return nums3[mid];
        //     }
        //     else if(nums3.length%2==0){
        //         sum = (nums3[mid]+nums3[mid-1])/2;
        //         return sum;
        //     }
        //     else{
        //         continue;
        //     }
        // }

        // return 0;
    }
}