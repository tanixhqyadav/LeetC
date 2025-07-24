class Solution {
    public boolean checkXMatrix(int[][] gr) {
        int n=gr.length;
        for(int i=0;i<gr.length;i++){
            for(int j=0;j<gr.length;j++){
                if(i==j ||  j==n-i-1){
                    if(gr[i][j]==0){
                        return false;
                    }
                }
                else if(gr[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}