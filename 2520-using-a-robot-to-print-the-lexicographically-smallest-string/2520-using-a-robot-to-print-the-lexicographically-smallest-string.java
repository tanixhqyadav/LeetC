class Solution {
    public String robotWithString(String s) {
        int frq[]=new int[26];
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']++;
        }
        Stack<Character> st=new Stack<>();
        char sch='a';
        StringBuilder sts=new StringBuilder();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            frq[s.charAt(i)-'a']--;

            while(sch<='z' && frq[sch-'a']==0){
                sch++;
            }
            while(!st.isEmpty() && st.peek()<=sch){
                sts.append(st.pop());
            }
        }

        return sts.toString();
    }
}