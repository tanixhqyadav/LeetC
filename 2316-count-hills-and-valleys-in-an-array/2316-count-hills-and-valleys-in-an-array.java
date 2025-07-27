class Solution {
    public int countHillValley(int[] a) {
        int c=0;
        for(int i=1;i<a.length-1;i++){
            if(a[i]==a[i-1]){ 
                continue;
            }
            int p=i-1;
            while(p>=0 && a[p]==a[i]){ 
                p--;
            }    
            int n=i+1;
            while(n<a.length && a[n]==a[i]){
                n++;
            }
            if(p>=0 && n<a.length) {
                if(a[i]>a[p] && a[i]>a[n]){
                    c++;
                }
                else if(a[i]<a[p] && a[i]<a[n]){
                    c++;
                }
            }
        }
        return c;
    }
}
