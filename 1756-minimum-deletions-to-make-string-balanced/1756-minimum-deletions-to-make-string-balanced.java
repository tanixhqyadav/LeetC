class Solution {
    public int minimumDeletions(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int rt=0;
        int ht=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(rt>0){
                    ++ht;
                    --rt;
                }
            }
            else{
                ++rt;
            }
        }
        return ht;
    }
}