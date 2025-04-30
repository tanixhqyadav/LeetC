class Solution {
    public String smallestNumber(String p) {
        String h=hola(p);
        return h;
    }
    public static String hola(String s){
        int ar[]=new int[s.length()+1];
        int c=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                ar[i]=c;
                c++;
                while(!st.isEmpty()){
                    ar[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String ans="";
        for(int i=0;i<ar.length;i++){
            ans+=ar[i];
        }
        return ans;

    }
    
}