class Solution {
    public boolean checkDivisibility(int n) {
        return n%(p(n)+op(n))==0 ? true : false;
    }
    public static int op(int x){
        int s=0;
        while(x!=0){
            s+=x%10;
            x/=10;
        }
        System.out.println(s);
        return s;
    }
    public static  int p(int y){
        int p=1;
        while(y!=0){
            p*=y%10;
            y/=10;
        }
        System.out.println(p);
        return p;
    }
}