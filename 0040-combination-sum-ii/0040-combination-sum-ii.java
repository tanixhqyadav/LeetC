class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int t) {
        Arrays.sort(cand);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        rec(cand,t,ll, 0,l);
        return ll;
    }
    public static void rec(int cd[], int t, List<List<Integer>> ll,int i, List<Integer> l){
        if(t==0){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int x=i;x<cd.length;x++){
            if(x>i  && cd[x]==cd[x-1]) continue;
            if(t<cd[x]) break;
            l.add(cd[x]);
            rec(cd,t-cd[x],ll,x+1,l);
            l.remove(l.size()-1);
        }
    }
}