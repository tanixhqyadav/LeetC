class Solution {
    public int maxProduct(int[] num) {
        int x=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int p=1;
            for(int j=i;j<num.length;j++){
                p=p*num[j];
                x=Math.max(p,x);
            }
        }
        return x;
    }
}