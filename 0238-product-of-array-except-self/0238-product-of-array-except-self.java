class Solution {
    public int[] productExceptSelf(int[] nums) {
        return pro(nums);
    }
    public static int[] pro(int nums[]){
        int n=nums.length;
        int lf[]=new int[nums.length];
        int ri[]=new int[nums.length];
        lf[0]=1;
        for(int i=1;i<nums.length;i++){
            lf[i]=lf[i-1]*nums[i-1];
            System.out.print(lf[i]+" ");
        }
        ri[n-1]=1;
        for(int i=n-2;i>=0;i--){
            ri[i]=ri[i+1]*nums[i+1];
            System.out.print(ri[i]+" ");
        }
        for(int i=0;i<n;i++){
            lf[i]=lf[i]*ri[i];
        }
        return lf;


    }
}