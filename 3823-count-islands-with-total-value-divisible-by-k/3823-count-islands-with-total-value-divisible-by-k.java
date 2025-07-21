class Solution {
    public int countIslands(int[][] gr, int k) {
        boolean vis[][]=new boolean [gr.length][gr[0].length];
        int c=0;
        for(int i=0;i<gr.length;i++){
            for(int j=0;j<gr[0].length;j++){
                if(!vis[i][j] && gr[i][j]!=0){
                     int sum=dfs(gr,i,j,vis);
                        if(sum>0 && sum%k==0){
                            c++;
                        }
                    }
                }
            }
        return c;
        }
    public static int  dfs(int gr[][], int i, int j, boolean vis[][]){
        if(i<0 || j<0 || j>=gr[0].length || i>=gr.length || vis[i][j] || gr[i][j]==0){
            return 0;
        }
        vis[i][j]=true;
        int s=gr[i][j];
        s+=dfs(gr,i+1,j,vis);
        s+=dfs(gr,i,j+1,vis);
        s+=dfs(gr,i-1,j,vis);
        s+=dfs(gr,i,j-1,vis);
        return s;
    }
}