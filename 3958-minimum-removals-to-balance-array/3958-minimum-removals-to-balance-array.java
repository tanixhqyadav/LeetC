class Solution{
    public int minRemoval(int[] a,int k){
        Arrays.sort(a);
        int l=0;
        int m=1;
        for(int r=0;r<a.length;r++){
            while(a[r]>(long)a[l]*k){   
                l++;
            }
            m=Math.max(m,r-l+1);
        }
        return a.length-m;
    }
}
