class Solution {
    public int uniqueXorTriplets(int[] nums) {
    if(nums.length<3)  return nums.length;
    int msb=0;
    int temp = nums.length;
    while(temp>0) {
        temp = temp >> 1;
        msb++;
    }
        return (int) Math.pow(2,msb);
    }
}