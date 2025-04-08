class Solution{
    public int[][] merge(int[][]jk){
        if( jk.length<=1){
            return jk;
        }
        Arrays.sort(jk,(a,b) -> a[0] - b[0]);
        List<int[]>op=new ArrayList<>();
        int[]x=jk[0];
        for(int i=1;i<jk.length;i++){
            if(x[1]>=jk[i][0]){
                x[1]=Math.max(x[1],jk[i][1]);
            }else{
                op.add(x);
                x=jk[i];
            }
        }
        op.add(x);
        return op.toArray(new int[op.size()][]);
    }
}
