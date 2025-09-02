class Solution {
    public int[] recoverOrder(int[] order, int[] fr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<fr.length;i++){
            mp.put(fr[i],mp.getOrDefault(fr[i],0)+1);
        }
        int ans[]=new int[fr.length];
        int x=0;
        for(int i=0;i<order.length;i++){
            if(mp.containsKey(order[i])){
                ans[x]=order[i];
                x++;
            }
        }
        return ans;
    }
}