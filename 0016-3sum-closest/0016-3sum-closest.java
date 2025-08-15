class Solution {
    public int threeSumClosest(int[] num, int t) {
        int minn=Integer.MAX_VALUE;
        // int maxp=Integer.MIN_VALUE;
        int dif=Integer.MAX_VALUE;
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=j+1;k<num.length;k++){
                    int tar=num[i]+num[j]+num[k];
                    if(tar==t){
                        return t;
                    }
                    // else{
                    //     if(tar<t){
                    //         minn=Math.min((int)Math.abs(tar-t),minn);
                    //     }if(tar>t){
                    //         maxp=Math.min(tar-t,maxp);
                    //     }
                    // }
                    // System.out.println(minn+" "+maxp+" "+tar);
                    // if(minn==Integer.MAX_VALUE ||  maxp==Integer.MIN_VALUE ){
                    //     dif= (minn==Integer.MAX_VALUE ? maxp : minn);
                    // }
                    // else {
                    //     dif=Math.min(dif,Math.min(minn,maxp));
                    // }
                    if(Math.abs(tar-t) < Math.abs(dif-t)){
                        dif=tar;
                    }
                }
            }
        }
        return dif;
    }
}