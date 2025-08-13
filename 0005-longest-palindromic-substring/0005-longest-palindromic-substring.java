class Solution {
    public String longestPalindrome(String s) {
        int min=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String subs=s.substring(i,j);
                if(op(subs)){
                    if(subs.length()>min){
                        ans=subs;
                        min=subs.length();
                    }
                }
            }
        }
        return ans;
    }
    public static boolean op(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}