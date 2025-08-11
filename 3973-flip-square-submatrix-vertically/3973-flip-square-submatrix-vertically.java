class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i=x;
        int j=y;
        int p=(x+k)-1;
        int q=(y+k)-1;
        System.out.println(i+" "+p+" "+j+" "+q);
        while(i<=p){
            int cl=j;
            int cy=j;
            while(cl<=q && cy<=q){
                int t=grid[i][cl];
                System.out.println(t);
                grid[i][cl]=grid[p][cy];
                grid[p][cy]=t;
                cl++;
                cy++;
            }
            i++;
            p--;
        }
        return grid;
    }
}