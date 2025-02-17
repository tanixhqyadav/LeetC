class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            String s="";
            s+=i*i;
            if(isit(s,i,0)){
                sum+=(i*i);
            }
        }
        return sum;
    }
    public static boolean isit(String s, int x,int y){
        if(y==x && s.length()==0){
            return true;
        }
        if(y>x){
            return false;
        }
        int cs=0;
        for(int i=0;i<s.length();i++){
            cs=cs*10+ (int) (s.charAt(i)-48);
            if(isit(s.substring(i+1),x,y+cs)){
                return true;
            }
        }
        return false;
    }
}