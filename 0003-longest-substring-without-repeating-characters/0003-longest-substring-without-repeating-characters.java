class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        HashSet<Character> st=new HashSet<>();
        int l=0;
        // int ans=0;
        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }
            ans=Math.max(ans,i-l+1);
            st.add(s.charAt(i));
        }
        return ans;
    }
}