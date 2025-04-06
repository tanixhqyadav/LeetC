class Solution {
    public int myAtoi(String l){
        if(l==null || l.length()==0)return 0;
        String s=l.trim();
        if(s.length() ==0 )return 0;
        long ans=0;
        int i=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        boolean ne=false;
        if((s.charAt(0)<'0' || s.charAt(0)>'9') && s.charAt(0)!='+' && s.charAt(0)!='-'){ 
            return 0;
        }
        if(s.charAt(0)=='-'){
            ne=true;
            i++;
        }else if(s.charAt(0)=='+'){
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            ans=ans*10+(s.charAt(i)-'0');
            if(!ne && ans>max)return max;
            if(ne && -ans<min)return min;
            i++;
        }
        if(ne){
            ans=-ans;
        }
        return (int)ans;
    }
}
