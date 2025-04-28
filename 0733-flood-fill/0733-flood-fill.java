class Solution {
    public int[][] floodFill(int[][] im, int sr, int sc, int cl) {
        boolean[][] vis = new boolean[im.length][im[0].length];
        int originalColor = im[sr][sc];
        dfs(im, sr, sc, cl, vis, originalColor);
        return im;
    }

    public static void dfs(int[][] im, int i, int j, int cl, boolean[][] vis, int originalColor) {
        if (i < 0 || i >= im.length || j < 0 || j >= im[0].length || vis[i][j] || im[i][j] != originalColor) {
            return;
        }
        
        im[i][j] = cl;
        vis[i][j] = true;
        
        dfs(im, i + 1, j, cl, vis, originalColor);
        dfs(im, i - 1, j, cl, vis, originalColor);
        dfs(im, i, j + 1, cl, vis, originalColor);
        dfs(im, i, j - 1, cl, vis, originalColor);
    }
}
