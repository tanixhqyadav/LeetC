class Solution {
    public int maxDifference(String s) {
        int hr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            hr[ch]++;
        }
        // int x=Integer.MIN_VALUE;
        int ev=Integer.MAX_VALUE;
        int od=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(hr[i]>0){
                if(hr[i]%2==0){
                    if(hr[i]<ev){
                        ev=hr[i];
                    }
                }
                else{
                    if(hr[i]>od){
                        od=hr[i];
                    }
                }
            }
        }
        return od-ev;
    }
}