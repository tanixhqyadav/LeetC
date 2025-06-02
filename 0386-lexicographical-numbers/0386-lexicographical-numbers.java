class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l=new ArrayList<>();
        xl(l,0,n);
        return l;
    }
    public static void xl(List<Integer> l, int i, int n){
        if(i>n){
            return;
        }
        if(i>0){
            l.add(i);
        }
        int x=0;
        if(i==0){
            x=1;
        }
        for(;x<=9;x++){
            xl(l,i*10+x,n);
        }
    }

}