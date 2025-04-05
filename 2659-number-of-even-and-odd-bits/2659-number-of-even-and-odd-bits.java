class Solution {
    public int[] evenOddBit(int n) {
        int ar[]=new int[2];
        int o=0;
        int e=0;
        int c=0;
        while(n!=0){
            if(n%2==1){
                if(c%2==1){
                    e++;
                }else{
                    o++;
                }
            }
            c++;
            n/=2;
        }
        ar[0]=o;
        ar[1]=e;
        return ar;
    }
}