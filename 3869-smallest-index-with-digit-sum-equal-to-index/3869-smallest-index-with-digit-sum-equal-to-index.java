class Solution {
    public int smallestIndex(int[] nums) {
        int x=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                x=Math.min(x,i);
            }
        }
        return x==Integer.MAX_VALUE ? -1 : x; 
    }
    public static int sum(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}