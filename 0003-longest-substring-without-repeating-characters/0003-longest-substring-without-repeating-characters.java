class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st=new HashSet<>();
        int l=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(i));
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}