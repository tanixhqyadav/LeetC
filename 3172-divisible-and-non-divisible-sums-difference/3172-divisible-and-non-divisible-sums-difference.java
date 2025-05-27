class Solution {
    public int differenceOfSums(int n, int m) {
        int op=0;
        int topi=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                op+=i;
            }
            else{
                topi+=i;
            }
        }
        return op-topi;
    }
}