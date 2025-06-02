class Solution {
    public int candy(int[] rat) {
        int n=rat.length;
        int c=0;
        int[] can=new int[n];
        for(int i=0;i<n;i++){
            can[i]=1;
        }
        for(int i=1;i<n;i++)
            if (rat[i]>rat[i-1])
                can[i]=can[i-1]+1;
        for(int i=n-1;i>0;i--){
            if(rat[i-1]>rat[i]){
                can[i-1]=Math.max(can[i]+1, can[i-1]);
            }
            c+=can[i-1];
        }
        return c+can[n-1];
    }
}
