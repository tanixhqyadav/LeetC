class Solution {
    public long zeroFilledSubarray(int[] n) {  
        long ans=0;
        long c=0;
        int idx=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                c++;
            }else{
                System.out.println(c);
                ans+=((c)*(c+1))/2;
                c=0;
            }
        }
        ans+=((c)*(c+1))/2;
        
        return ans;
    }
}










    //   long c=0;
    //   long h=0;
    //   for(int i=0;i<n.length;i++){
    //       if(n[i]==0){
    //           c++;
    //         }
    //         else{
    //             h+=(c*(c+1))/2;
    //             c=0;
    //         }
    //   }
    //   h+=(c*(c+1))/2;
    //   return h;