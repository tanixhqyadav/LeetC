class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                o++;
            }
            else{
                z++;
            }
        }
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            if(o-1>0){
                ans+="1";
                o--;
            }else{
                ans+="0";
            }
        }
        return ans+"1";
    }
}