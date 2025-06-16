class Solution {
    public int maximumDifference(int[] num) {
        int n=num.length;
        int kl=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int s=num[j]-num[i];
                if(num[i]!=num[j]){
                kl=Math.max(s,kl);
                }
            }
        }
        return kl;
    }
}