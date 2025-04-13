class Solution {
    public int countGoodNumbers(long n) {
        long MOD=1000000007;
        long ans;

        if (n%2==0){
            ans=1;
        } else{
            ans = 5;
        }

        ans = (ans * myPow(20, n / 2, MOD)) % MOD;

        return (int) ans;
    }

    public long myPow(long x, long n, long mod) {

        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            long half = myPow(x, n / 2, mod);
            return (half * half) % mod;
        } 

        else {
            return (x * myPow(x, n - 1, mod)) % mod;
        }
    }
}