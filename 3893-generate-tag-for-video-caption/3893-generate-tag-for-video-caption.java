class Solution {
    public String generateTag(String str) {
        str=str.toLowerCase();
        String[] w=str.trim().split(" ");
        String ans="#"+w[0];
        for(int i=1;i<w.length;i++){
            String s=w[i];
            for(int j=0;j<s.length();j++){
                if( (int) s.charAt(j)>=97 && (int) s.charAt(j)<=122){
                    if(j==0){
                        ans+= (char) ((int) s.charAt(j)-32);
                    }
                    else{
                        ans+= s.charAt(j);
                    }
                }
            }
        }
        if(ans.length()>=100){
            return ans.substring(0,100);
        }
        return ans;
    }
}