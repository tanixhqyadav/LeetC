class Solution {
    public boolean exist(char[][] bo, String w) {
        boolean tr[][]=new boolean[bo.length][bo[0].length];
        for(int i=0;i<bo.length;i++){
            for(int j=0;j<bo[i].length;j++){
                if(pl(bo,w,tr,i,j,0)){
                    return true;
                }
            }
        }

        return false;

    }
    public static boolean pl(char[][] bo,String w, boolean tr[][],int i, int j, int x){
        if(x==w.length()){
            return true ;
        }
        if(i<0 || i>=bo.length || j<0 || j>=bo[0].length || tr[i][j]){
            return false;
        }
        if(tr[i][j] || bo[i][j]!=w.charAt(x)) return false;
        tr[i][j]=true;
        boolean kl=(pl(bo,w,tr,i,j+1,x+1) ||pl(bo,w,tr,i+1,j,x+1)|| pl(bo,w,tr,i,j-1,x+1)
             || pl(bo,w,tr,i-1,j,x+1));
        tr[i][j]=false;
        return kl;
    }
}