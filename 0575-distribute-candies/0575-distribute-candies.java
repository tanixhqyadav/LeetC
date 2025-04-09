class Solution {
    public int distributeCandies(int[] cand) {
        int n=cand.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(cand[i]);
        }
        int eat=cand.length/2;
        if(st.size()>eat){
            return eat;
        }
        return st.size();
    }
}