class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        subs(ll,l,0,nums);
        return ll;
    }
   public static void subs(List<List<Integer>> ll, List<Integer> l,int x, int tr[]){
        // if(x==t/r.length){
            ll.add(new ArrayList<>(l));
            // return ;   
        // }
        for(int i=x;i<tr.length;i++){
            if(i>x && tr[i-1]==tr[i]){
                continue;
            }
            l.add(tr[i]);
            subs(ll,l,i+1,tr);
            l.remove(l.size()-1);
        }
    }
}