class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        int i=0;
        while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i)){
            i++;
        }
        return a.substring(0,i);
    }
}