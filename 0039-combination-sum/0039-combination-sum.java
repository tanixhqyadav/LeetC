class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        com(ll,l,can,t,0);   
        return ll;
    }
public static void com(List<List<Integer>> ll, List<Integer> l,int can[],int t,int i){
    if(i==can.length || t<0){
        return ;
    }
    if(t==0){
        ll.add(new ArrayList<>(l));
        return;
    }
    for(int x=i;x<can.length;x++){
        l.add(can[x]);
        com(ll,l,can,t-can[x],x);
        l.remove(l.size()-1);
    }
}
}