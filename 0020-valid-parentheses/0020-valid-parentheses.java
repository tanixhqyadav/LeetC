class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mp=new HashMap<>();
        mp.put('(',')');
        mp.put('[',']');
        mp.put('{','}');
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                if(mp.get(st.pop())!=s.charAt(i))  return false;
            }
        }
        System.out.println(st.size());
        return st.isEmpty();
    }
}