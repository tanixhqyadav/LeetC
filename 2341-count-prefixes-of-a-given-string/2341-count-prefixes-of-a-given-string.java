class Solution {
    public int countPrefixes(String[] w, String s) {
        int c=0;
        for(int i=0;i<w.length;i++){
            if(s.startsWith(w[i])){
                c++;
            }
        }
        return c;
    }
}