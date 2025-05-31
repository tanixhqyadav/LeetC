class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        opl(ll,n,k,l,1);
        return ll;
    }
    public static void opl(List<List<Integer>> ll, int n, int k ,List<Integer> l,int x){
        if(l.size()==k){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int i=x;i<=n;i++){
            l.add(i);
            opl(ll,n,k,l,i+1);
            l.remove(l.size()-1);
        }
    }
}