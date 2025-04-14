class Solution {
    public String smallestPalindrome(String s) {
        int[] x=new int[26];
        for(char c:s.toCharArray()){
            x[c-'a']++;
        }
        StringBuilder t=new StringBuilder();
        String ui="";
        for(int i=0;i<26;i++){
            if(x[i]%2==1){
                if(ui.equals("")||(char)(i+'a')<ui.charAt(0)){
                    if(!ui.equals("")){
                        t.append(ui.charAt(0));
                    }
                    ui=String.valueOf((char)(i+'a'));
                    x[i]--;
                }else{
                    x[i]--;
                    t.append((char)(i+'a'));
                }
            }
            for(int j=0;j<x[i]/2;j++){
                t.append((char)(i+'a'));
            }
        }
        StringBuilder op=new StringBuilder(t).reverse();
        return t.toString()+ui+op.toString();
    }
}
