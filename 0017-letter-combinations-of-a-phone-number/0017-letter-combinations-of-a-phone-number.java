class Solution {
    static String op[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digi) {
        List<String> ans=new ArrayList<>();
        if(digi.length()==0){
            return ans;
        }
        hola(ans,digi,"",0);
        return ans;
    }
    public static void hola(List<String> l, String s , String as,int x){
        if(as.length()==s.length()){
            l.add(as);
            return ;
        }
        if(x==s.length()){
            // l.add(as);
            return ;
        }
        String xh=op[s.charAt(x)-'0'];
        for(int i=0;i<xh.length();i++){
            hola(l,s,as+xh.charAt(i),x+1);
        }
    }
}