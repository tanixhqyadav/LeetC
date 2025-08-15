class Solution {
    public boolean isPowerOfFour(int n) {
        return op(n);
    }
    public static boolean op(int n){
        if(n==1) return true;
        if( n<1 || n%4!=0) return false;
        // long u=(long)Math.abs(n);
        return op(n/4);
    }
}