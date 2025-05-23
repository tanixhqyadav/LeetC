class Solution {
    public int passThePillow(int n, int t) {
        int c=t/(n-1);
        int r=t%(n-1);
        int ans=0;
        if(c%2==1) {
            ans=n-r;
        }else{
            ans=r+1;
        }
        return ans;
    }
}