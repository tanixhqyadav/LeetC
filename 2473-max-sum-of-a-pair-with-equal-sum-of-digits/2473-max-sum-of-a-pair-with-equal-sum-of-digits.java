class Solution {
    public int maximumSum(int[] nums) {
        int ar[][]=new int[82][2];
        for(int i=0;i<82;i++) {
            ar[i][0]=-1;
            ar[i][1]=-1;
        }
        int x=-1;
        for(int i=0;i<nums.length;i++){
            int d=rev(nums[i]);
            if(nums[i]>ar[d][0]){
                ar[d][1] = ar[d][0]; 
                ar[d][0] = nums[i]; 
            }
            else if(nums[i]>ar[d][1]){
                ar[d][1]=nums[i];
            }
            if(ar[d][0]!=-1 && ar[d][1]!=-1){
                x=Math.max(x,ar[d][0]+ar[d][1]);
            }
        }
        return x;

    }
    public static int rev(int x){
        int s=0;
        while(x!=0){
            s+=x%10;
            x/=10;
        }
        return s;
    }
}