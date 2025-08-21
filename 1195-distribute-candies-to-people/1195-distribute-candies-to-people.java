class Solution {
    public int[] distributeCandies(int can, int n) {
        int[] ar=new int[n];
        int op=1;
        int i=0;
        while(can>0) {
            int cu= Math.min(op, can);
            ar[i]+=cu;
            can-=cu;
            op++;
            i=(i+1)%n;
        }
        return ar;
    }
}
