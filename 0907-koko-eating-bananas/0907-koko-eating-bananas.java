class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mx=0;
        for(int i=0;i<piles.length;i++){
            mx=Math.max(piles[i],mx);
        }
        int st=1;
        int hi=mx;
        // int ans=mx;
        while(st<=hi){
            int mid=st+(hi-st)/2;
            if(isIt(piles,mid,h)){
                // ans=mid;
                hi=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }
    public static boolean isIt(int ar[],int mid, int h){
        int s=0;
        for(int i=0;i<ar.length;i++) {
            s+=(ar[i]+mid-1)/mid;
            if(s>h){
                return false;
            }
        }
        return s<=h;
    }
}