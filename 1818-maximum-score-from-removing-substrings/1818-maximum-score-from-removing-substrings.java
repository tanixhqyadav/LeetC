class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            return op2(s,x,y);
        }else{
            return op1(s,x,y);
        }
        
    }
    public static int op1(String s,int x, int y){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int sum=0;
        // boolean fl=false;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                st.pop();
                sum+=y;
            }
            else{
                st.add(s.charAt(i));
            }
            // System.out.println(st);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb=sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(!st.isEmpty() && st.peek()=='a' && sb.charAt(i)=='b'){
                sum+=x;
                st.pop();
            }
            else{
                st.add(sb.charAt(i));
            }
        }
        return sum;
    }
    public static int op2(String s, int x, int y){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()=='a' && s.charAt(i)=='b'){
                sum+=x;
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb=sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(!st.isEmpty() && st.peek()=='b' && sb.charAt(i)=='a'){
                sum+=y;
                st.pop();
            }else{
                st.add(sb.charAt(i));
            }
        }
        return sum;
    }
}
