class Solution {
    public int[][] merge(int[][] irv) {
        Arrays.sort(irv , (a,b)->{
            return Integer.compare(a[0],b[0]);
        });
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<irv.length;i++){
            if(l.size()==0){
                l.add(irv[i]);
            }else{
                int h=l.get(l.size()-1)[1];
                int y=irv[i][0];
                int op=irv[i][1];
                if(y<=h){
                    l.get(l.size()-1)[1]=Math.max(op,Math.max(h,y));
                }
                else{
                    l.add(irv[i]);
                }
            }
        }
        int yr[][]=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            yr[i]=l.get(i);
        }
        return yr;
    }
    public static void print(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}