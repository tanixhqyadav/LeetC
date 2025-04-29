class Solution {
    public String smallestNumber(String p) {
        String op=Construct(p);
        return op;
    }
    public static String Construct(String str){
        int ans[]=new int[str.length()+1];
        int count=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=str.length();i++){
            if(i==str.length() || str.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while(!st.empty()){
                    ans[st.pop()]=count;
                    count++;
                }
            }
            else{
                st.push(i);
            }
        }
        String s="";
        for(int i=0;i<ans.length;i++){
            s=s+ans[i];
        }
        return s;
    }
}