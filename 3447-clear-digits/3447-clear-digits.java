class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.size()==0) return "";
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        String op=rev(ans);
        return op;
        
    }
    public static String rev(String s){
        String kl="";
        for(int i=s.length()-1;i>=0;i--){
            kl+=s.charAt(i);
        }
        return kl;
    }
    
}