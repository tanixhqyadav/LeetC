class Solution {
    public List<Integer> findWordsContaining(String[] w, char x) {
        String s="";
        s+=x;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<w.length;i++){
            if(w[i].contains(s)){
                l.add(i);
            }
        }
        return l;
    }
}