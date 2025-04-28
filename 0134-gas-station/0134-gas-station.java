class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=0;
        // for(int i=0;i<gas.length;i++){
        //     int t=0;
        //     int c=0;
        //     int j=i;
        //     while(c<gas.length){
        //         t+=gas[j]-cost[j];
        //         if(t<0){
        //             break;
        //         }
        //         j=(j+1)%gas.length;
        //         c++;
        //     }
        //     if(c==gas.length && t>=0){
        //         return i;
        //     }
        // } 
        // return -1;
        int tg=0;
        int tc=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
        }      
        if(tg<tc){
            return -1;
        }
        int t=0;
        for(int i=0;i<gas.length;i++){
            t+=gas[i]-cost[i];
            if(t<0){
                ans=i+1;
                t=0;
            }
        }
        return t>=0 ? ans : -1; 
    }
}