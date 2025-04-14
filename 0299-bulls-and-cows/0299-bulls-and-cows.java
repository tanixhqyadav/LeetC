class Solution {
    public String getHint(String sec, String gu) {
        int b=0;
        int c=0;
        int ar[]=new int[10];
        for(int i=0;i<sec.length();i++){
            if(sec.charAt(i)==gu.charAt(i)){
                b++;
            }else{
                if(ar[sec.charAt(i)-'0']++ < 0) c++;
                if(ar[gu.charAt(i)-'0']-- > 0 ) c++;
            }
        }
        return b+"A"+c+"B";

    }
}