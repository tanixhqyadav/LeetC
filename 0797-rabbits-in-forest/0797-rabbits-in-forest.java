class Solution {
    public int numRabbits(int[] ans) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=0;
        for(int i=0;i<ans.length;i++){
            mp.put(ans[i],mp.getOrDefault(ans[i],0)+1);
        } 
        for(Map.Entry<Integer,Integer> ent:mp.entrySet()){
            int x=ent.getKey();
            int co=ent.getValue();
            int gs=x+1;
            int gr=(co+gs-1)/gs;
            c+=gs*gr;
        }
        return c;
    }
}