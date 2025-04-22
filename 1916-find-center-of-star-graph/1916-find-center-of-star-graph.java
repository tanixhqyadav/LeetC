class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            for(int j=0;j<2;j++){
                mp.put(edges[i][j],mp.getOrDefault(edges[i][j],0)+1);
            }
        }
        int n=edges.length;
        int x=0;
        for(Integer i:mp.keySet()){
            if(mp.get(i)==n){
                x=i;
            }
        }
        return x;
    }
}