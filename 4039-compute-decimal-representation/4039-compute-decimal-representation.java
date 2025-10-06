class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> l=new ArrayList<>();
        int p=1;
        while(n>0){
            int op=n%10;
            if(op!=0){
                l.add(op*p);
            }
            n/=10;
            p*=10;
        }
        Collections.sort(l);
        int ar[]=new int[l.size()];
        int u=0;
        for(int i=l.size()-1;i>=0;i--){
            ar[u]=l.get(i);
            u++;
        }
        return ar;

    }
}