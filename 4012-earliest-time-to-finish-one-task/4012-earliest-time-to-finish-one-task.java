class Solution {
    public int earliestTime(int[][] tasks) {
        int x=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            x=Math.min(x,tasks[i][0]+tasks[i][1]);
        }
        return x;
    }
}