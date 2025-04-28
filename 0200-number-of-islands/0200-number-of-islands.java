class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        // System.out.p
        boolean[][] vis=new boolean[r][c];
        int co=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,vis);
                    co++;
                }
            }
        }
        return co;
    }
    public static void dfs(char grid[][],int i,int j,boolean vis[][]){
        if(i<0 || j>=grid[0].length || i>=grid.length || j<0 || vis[i][j] ||grid[i][j]=='0'){
            return ;
        }
        vis[i][j]=true;
        dfs(grid,i+1,j,vis);
        dfs(grid,i-1,j,vis);
        dfs(grid,i,j+1,vis);
        dfs(grid,i,j-1,vis);
    }
}