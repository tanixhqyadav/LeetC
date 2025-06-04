class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(!ops[i].equals("C") && !ops[i].equals("D") && !ops[i].equals("+")){
                st.push(Integer.parseInt(ops[i]));
            }
            else if(!st.isEmpty() && ops[i].equals("C")){
                st.pop();
            }
            else if(!st.isEmpty() && ops[i].equals("D")){
                int h=st.peek();
                h=h*2;
                st.push(h);
            }
            else if(!st.isEmpty() && ops[i].equals("+")){
                int l=st.pop();
                int y=st.pop();
                int pol=l+y;
                st.push(y);
                st.push(l);
                st.push(pol);
            }
            System.out.println(st);
        }
        int s=0;
        if(st.size()==0){
            return s;
        }
        while(!st.isEmpty()){
            s+=st.pop();
        }
        return s;
    }
}