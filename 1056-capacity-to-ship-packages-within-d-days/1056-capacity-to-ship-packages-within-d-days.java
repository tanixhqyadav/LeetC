class Solution {
    public int shipWithinDays(int[] wei, int d) {
        int l=0;
        for(int i=0;i<wei.length;i++){
            l=Math.max(wei[i],l);
        }
        int hi=0;
        for(int i=0;i<wei.length;i++){
            hi+=wei[i];
        }
        int ans=-1;
        while(l<=hi){
            int mid=l+(hi-l)/2;
            if(isPos(wei,d,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                l=mid+1;
            }

        }
        return ans;
    }
    public static boolean isPos(int wei[], int d, int mid){
        int s=0;
        int c=1;
        for(int i=0;i<wei.length;i++){
            s+=wei[i];
            if(s>mid){
                c++;
                s=wei[i];
            }
           
        }
         if(c<=d){
                return true;
            }
        return false;
    }
}