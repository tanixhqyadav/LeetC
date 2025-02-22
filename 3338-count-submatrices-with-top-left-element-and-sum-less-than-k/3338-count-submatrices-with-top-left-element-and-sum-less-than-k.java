class Solution {
    public int countSubmatrices(int[][] v, int k) {
        // int sum[][]=new int[grid.length][grid[0].length];
        // sum[0][0]=grid[0][0];
        // for(int i=1;i<grid[0].length;i++){
        //     sum[0][i]=sum[0][i-1]+grid[0][i];
        // }
        // for(int i=1;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(j==0){
        //             sum[i][j]=sum[i-1][j]+grid[i][j];
        //         }
        //         else{
        //             sum[i][j]=sum[i][j-1]+sum[i-1][j];
        //         }
        //     }
        // }
        // int c=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(sum[i][j]<=k){
        //             c++;
        //         }   
        //     }
        // }
        // return c;

        
        // o(1) via space

        int n = v.length, m = v[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                v[i][j] += v[i][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                v[j][i] += v[j - 1][i];
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] <= k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}