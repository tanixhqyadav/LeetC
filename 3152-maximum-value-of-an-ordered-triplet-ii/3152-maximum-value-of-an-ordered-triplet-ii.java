class Solution {
    public long maximumTripletValue(int[] nums) {
        long s=0;
        int n=nums.length;
        int pr[]=new int[n];
        int suf[]=new int[n];
        pr[0]=nums[0];
        suf[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pr[i]=Math.max(pr[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],nums[i]);
        }
        int x=1;
        while(x<n-1){
            // System.out.print(pr[x-1]+" "+nums[x]+" "+suf[x+1]+" ");
            long ans=( (long) pr[x-1]-nums[x])*suf[x+1];
            System.out.print(ans+" ");
            s=Math.max(ans,s);
            x++;
        }
        return s;
    }
}