class Solution{
    public int smallestValue(int n){
        if(n==4) return 4;
        while(!op(n)){
            int min=0;
            int temp=n;
            for(int i=2;i*i<=temp;i++){
                while(n%i==0){
                    min+=i;
                    n/=i;
                }
            }
            if(n>1) min+=n;
            if(min==temp) break;
            n=min;
        }
        return n;
    }
    public static boolean op(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
