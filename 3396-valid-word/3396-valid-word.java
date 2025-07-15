class Solution {
    public boolean isValid(String s) {
        if(s.length()<3){
            return false;
        }
        boolean x=false;
        boolean bn=false;
        for(int i=0;i<s.length();i++){
            char y=s.charAt(i);
            int op=s.charAt(i)-'0';
            if(Character.isUpperCase(y) || Character.isLowerCase(y)){
                if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I' || y=='O' || y=='U'){
                    x=true;
                }else{
                    bn=true;
                }
            }
            else{
                if(!(op>=0 && op<=9)){
                return false;
                }
            }
        }
        return x && bn;
    }
}