class Solution {
    public int maxProfit(int[] pr) {
        // int n=pr.length;
        // int yp[]=pr.clone();
        // Arrays.sort(yp);
        // int c=0;
        // for(int i=0;i<pr.length;i++){
        //     if(yp[i]==pr[i]){
        //         c++;
        //     }
        // }
        // if(c==pr.length){
        //     return pr[n-1]-pr[0];
        // }
        // int mx=0;
        // int i=0;
        // boolean bl[]=new boolean[pr.length];
        // while(i<pr.length){
        //     int o=pr[i];
        //     int j=i+1;
        //     if(bl[i]){
        //         i++;
        //         continue;
        //     }
        //     while(j<pr.length){
        //         if(pr[j]>o){
        //             // System.out.println(mx+" "+o+" "+pr[j]+" "+bl[j]);
        //             mx+=pr[j]-o;
        //             bl[j]=true;
        //             break;
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        // return mx;
        int ans=0;
        for(int i=1;i<pr.length;i++){
            if(pr[i]>pr[i-1]){
                ans+=pr[i]-pr[i-1];
            }
        }
        return ans;

    }
}