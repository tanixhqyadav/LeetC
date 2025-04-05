class Solution {
    public int subsetXORSum(int[] nums) {
        return rec(nums,0,0);
    }

    public static int rec(int ar[], int i,int n){
        if(i==ar.length){
            return n;
        }
        int in=rec(ar,i+1,n^ar[i]);
        int ex=rec(ar,i+1,n);
        return in+ex;
   }
}