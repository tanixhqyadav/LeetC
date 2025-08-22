class Solution {
    public int maxArea(int[] ar) {
        int i=0;
        int j=ar.length-1;
        int mx=0;
        while(i<j){
            int he=Math.min(ar[i],ar[j]);
            int w=j-i;
            int il=he*w;
            mx = Math.max(mx,il);
            if(ar[i]<ar[j]) {
                i++;
            }else{
                j--;
            }
        }
        return mx;
    }
}
