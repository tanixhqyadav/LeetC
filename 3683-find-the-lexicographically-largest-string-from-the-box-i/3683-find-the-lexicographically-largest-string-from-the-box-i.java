class Solution {
    public String answerString(String s, int k) {
        if(k==1) return s;
        int n=s.length();
        int l=n-k+1;
        String ans="";
        for(int i=0;i<n;i++){
            String op;
            if(i+l<=n){
                op=s.substring(i,i+l);
            }
            else{
                op=s.substring(i);
            }
            if(op.compareTo(ans)>0){
                ans=op;
            }
        }
        return ans;
    }
}