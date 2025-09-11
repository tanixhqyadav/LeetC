class Solution {
    public String sortVowels(String s) {
        char ch[]=new char[s.length()];
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(op(s.charAt(i))){
                l.add(s.charAt(i));
            }else{
                ch[i]=s.charAt(i);
            }
        }
        Collections.sort(l);
        // System.out.println(ch[1]+" "+l);
        int b=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='\0'){
                ch[i]=l.get(b);
                b++;
            }
        }
        String ans="";
        for(int i=0;i<ch.length;i++){
            ans+=ch[i];
        }
        return ans;
    }
    public static boolean op(char ch){
if(ch=='A' ||  ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a'||ch=='e'  ||      ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
        return false;
    }
}