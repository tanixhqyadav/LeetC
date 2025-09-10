class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int t) {
        Arrays.sort(can);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        com(ll,can,t,0,l);
        return ll;
    }
public static void com(List<List<Integer>> ll,int can[], int t, int i,List<Integer> l){
        // if(i==can.length || t<0){
        //     return ;
        // }
        if(t==0){
            ll.add(new ArrayList<>(l));
            return ;
        }
        for(int x=i;x<can.length;x++){
            if(x>i && can[x-1]==can[x]){
                continue;
            }
            if(can[i]>t) break;
            l.add(can[x]);
            com(ll,can,t-can[x],x+1,l);
            l.remove(l.size()-1);
        }
    }
}