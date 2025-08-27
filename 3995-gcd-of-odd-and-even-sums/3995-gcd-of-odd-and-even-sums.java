class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ev=0;
        int od=0;
        for(int i=2;i<=n*2;i+=2){
            ev+=i;
        }
        for(int i=1;i<=(n*2);i+=2){
            od+=i;
        }
        // System.out.print(ev%od);
        return Gcd(ev,od);
    }
    public static int Gcd(int ev, int od){
        if(ev%od==0) return od;
        // System.out.println(ev/od);
        return Gcd(od,ev%od);
    }
}