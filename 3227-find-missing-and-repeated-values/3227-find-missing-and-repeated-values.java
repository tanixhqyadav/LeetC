class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int xr[]=new int[2];
        int n=grid.length;
        int ar[]=new int[(n*n)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ar[grid[i][j]]++;
            }
        }
        for(int i=1;i<ar.length;i++){
            if(ar[i]==2){
                xr[0]=i;
            }if(ar[i]==0){
                xr[1]=i;
            }
        }
        return xr;
    }
}