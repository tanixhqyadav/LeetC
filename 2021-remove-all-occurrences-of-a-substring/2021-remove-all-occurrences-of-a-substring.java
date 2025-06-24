class Solution {
    public String removeOccurrences(String s, String p) {
        // String x="";
        while(s.contains(p)){
            s=s.replaceFirst(p,"");
        }
        return s;
    }
}