class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=st.charAt(i);
            if(Character.isLowerCase(ch)){
                ans.append(st.charAt(i));
            }
            else if(ch=='#'){
                ans.append(ans);
            }
            else if(ch=='%'){
                ans=ans.reverse();
            }
            else if(ch=='*' && ans.length()>0){
                ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }
}