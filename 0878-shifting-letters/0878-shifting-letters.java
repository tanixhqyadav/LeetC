class Solution {
    public String shiftingLetters(String s, int[] shi) {
        int n=shi.length;
        for(int i=n-2;i>=0;i--){
            shi[i]=(shi[i]+shi[i+1])%26;
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=(char)((s.charAt(i)-'a'+shi[i])%26+'a');
            ans+=ch;
        }

        return ans;
        // int n=shi.length-1;
        // while(shi[n]>=26){
        //     shi[n]=(shi[n]%26);
        // }
        // System.out.println(94%26);
        // for(int i=shi.length-2;i>=0;i--){
        //     long k=shi[i]+shi[i+1];
        //     while(k>=26){
        //         k%=26;
        //     }
        //     shi[i]=(int) k;
        // }
        // String ans = "";
        // for (int i = 0; i < s.length(); i++) {
        //     ans += (char)(s.charAt(i) + shi[i]);
        //     }
        // return ans;
    }
}