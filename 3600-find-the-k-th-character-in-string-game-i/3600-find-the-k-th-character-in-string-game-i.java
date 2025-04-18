public class Solution {
    public char kthCharacter(int k) {
        String s=str("a",k); 
        // System.out.println(s);
        return s.charAt(k-1); 
    }
    public String str(String s, int k) {
    if(s.length()>=k) {
        return s;
    }
    StringBuilder ne=new StringBuilder();
    for (int i=0;i<s.length();i++) {
        char c=s.charAt(i);
        ne.append(c=='z'?'a':(char)(c+1));
    }
        return str(s+ne.toString(),k);   
    }

}
