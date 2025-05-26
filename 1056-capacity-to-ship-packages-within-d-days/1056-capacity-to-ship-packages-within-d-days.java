class Solution {
    public int shipWithinDays(int[] wei, int d) {
        int tw=0;
        int mx=0;
       for(int i=0;i<wei.length;i++){
            mx=Math.max(wei[i],mx);
            tw+=wei[i];
       } 
       int st=mx;
       int hi=tw;
       int ans=tw;
       while(st<=hi){
            int mid=st+(hi-st)/2;
            // System.out.println(mid);
            if(isItposi(wei,mid,d)){
                ans=mid;
                System.out.println(ans+"x ");
                hi=mid-1;
            }
            else{
                st=mid+1;
            }
       }
       return ans;
    }
    public static boolean isItposi(int ar[],int mid,int d){
        int s=0;
        int c=1;
        for(int i=0;i<ar.length;i++){
            if(s+ar[i]>mid){
                c++;
                s=0;
            }
            s+=ar[i];
        }
        return c<=d;
    }
}