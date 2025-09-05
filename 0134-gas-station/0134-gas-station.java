class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc){
            return -1;
        }
        // int ans=0;
        // int i=0;
        // while(i<gas.length){
        //     int j=i;
        //     int t=0;
        //     int c=0;
        //     // int ans=-1;
        //     while(c<gas.length){
        //         t+=gas[j]-cost[j];
        //         if(t<0){
        //             break;
        //         }
        //         j=(j+1)%gas.length;
        //         c++;
        //     }
        //     if(c==gas.length){
        //         ans=i;
        //     }
        //     i++;
        // }
        // return ans;
        int t=0;
        int ans=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            c+=gas[i]-cost[i];
            if(c<0){
                ans=i+1;
                c=0;
            }
        }
        return ans;
    }
}