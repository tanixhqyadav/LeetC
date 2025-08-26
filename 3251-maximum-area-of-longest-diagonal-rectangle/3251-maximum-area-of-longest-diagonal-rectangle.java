class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        int i=0;
        int l=dim.length;
        double mxDim=0.0;
        int ans=0;
        while(i<l){
            int le=dim[i][0];
            int br=dim[i][1];
            double di=Math.sqrt((le*le)+(br*br));
            int ar=le*br;
            if(di>mxDim){
                mxDim=di;
                ans=ar;
            }
            else if(di==mxDim){
                ans=Math.max(ar,ans);                
            }
            i++;
        }
        return ans;
    }
}