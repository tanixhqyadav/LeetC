class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        int i=1;
        int nu=(int) Math.pow(3,i);
        while(len(nu)<=len(n)){
            nu=(int)Math.pow(3,i);
            l.add(nu);
            i++;
        }
        System.out.println(l);
        int s=0;
        for(int x=l.size()-1;x>=0;x--){
            if(l.get(x)>n){
                continue;
            }
            else{
                n-=l.get(x);
            }
            // System.out.println(n);
        }
        if(n==0) return true;
        return false;
    }
    public static int len(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    public static boolean  powT(int n){
        // System.out.println(n);
        if(n==1) return true;
        if( n==0 && n%3!=0) return false;
        return powT(n/3);
    }
}