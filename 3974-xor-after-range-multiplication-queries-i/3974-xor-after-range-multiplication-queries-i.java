class Solution {
    public int xorAfterQueries(int[] nums, int[][] qu) {
        int i=0;
        int MOD=1000_000_007;
        while(i<qu.length){
            int l=qu[i][0];
            int r=qu[i][1];
            int k=qu[i][2];
            int v=qu[i][3];
            while(l<=r){
                nums[l]=(int)(((long)nums[l]*v)%((long)MOD));
                l+=k;
            }
            i++;
        }
        for(int op=0;op<nums.length;op++){
            System.out.print(nums[op]+" ");
        }
        long xor=nums[0];
        for(int op=1;op<nums.length;op++){
            xor^=nums[op];
        }
        return (int)xor;
    }
}