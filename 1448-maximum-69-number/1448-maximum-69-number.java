class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        int y=0;
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            if(l=='6'){
                y=i;
                break;
            }
        }
        String jk=s.substring(0,y)+'9'+s.substring(y+1);
        int op=Integer.parseInt(jk);
        return op;
    }
}