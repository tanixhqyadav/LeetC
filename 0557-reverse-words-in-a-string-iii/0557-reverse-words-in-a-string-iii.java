class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
        String ans="";
        for(int i=0;i<ar.length;i++){
            StringBuilder st=new StringBuilder(ar[i]);
            ans+=st.reverse().toString()+" ";
        }
        return ans.trim();
    }
}