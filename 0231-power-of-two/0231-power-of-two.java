class Solution {
    public boolean isPowerOfTwo(int n) {
        return rec(n);
    }
    public static boolean rec(int n){
        if(n==1) return true;
        if(n==0 || n%2!=0) return false;
        return rec(n/2);
    }
}