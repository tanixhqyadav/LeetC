class Solution {
    public int smallestNumber(int n) {
        if(n==1) return 1;
        int c=n+1;
        int ans=0;
        while(c<=Integer.MAX_VALUE){
            if((c&(c-1))==0){
                ans=c;
                break;
            }
            c++;
        }
        return ans-1;
    }
}