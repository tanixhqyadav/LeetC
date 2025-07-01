class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1]-b[1]);
        int x=pairs[0][1];
        int c=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>x){
                c++;
                x=pairs[i][1];
            }
        }
        return c;
    }
}