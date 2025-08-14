class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int x=Integer.MIN_VALUE;
        for(int i=0;i<=num.length()-3;i++){
            String subs=num.substring(i,i+3);
            if(subs.charAt(0)==subs.charAt(1) && subs.charAt(1)==subs.charAt(2)){
                int nums=Integer.parseInt(subs);
                if(nums>x){
                    x=nums;
                    s=subs;
                }
            }
        }
        return s;
    }
}