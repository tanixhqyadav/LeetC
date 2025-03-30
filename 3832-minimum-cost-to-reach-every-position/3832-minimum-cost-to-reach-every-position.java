class Solution {
    public int[] minCosts(int[] cost) {
        int t=cost[0];
        for(int i=1;i<cost.length;i++){
            cost[i]=Math.min(cost[i],cost[i-1]);
        }
        return cost;
   
    }
}