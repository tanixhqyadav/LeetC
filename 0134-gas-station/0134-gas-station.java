class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int ans=0;
        int t=0;
        int c=0;
        for(int i=0;i<n;i++){
            c+=gas[i]-cost[i];
            t+=gas[i]-cost[i];
            if(c<0){
                ans=i+1;
                c=0;
            }
        }
        return t>=0 ? ans : -1;
    }
}