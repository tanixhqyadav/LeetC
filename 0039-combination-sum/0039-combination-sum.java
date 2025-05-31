class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        pol(can, ll, t, 0,l);
        return ll;
    }
    public static void pol(int can[],List<List<Integer>> ll, int t, int i,List<Integer> l){
        if(i==can.length){
            return ;
        }
        if(t<0){
            return ;
        }
        if(t==0){
            ll.add(new ArrayList<>(l));
            return ;
        }
        l.add(can[i]);
        // System.out.println(l);
        pol(can,ll,t-can[i],i,l);
        // if(t<0){
            l.remove(l.size()-1);
        // }
        pol(can,ll,t,i+1,l);
    }
}