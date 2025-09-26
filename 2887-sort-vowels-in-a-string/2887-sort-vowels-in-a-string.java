class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> l=new ArrayList<>();
        char po[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(op(s.charAt(i))){
                l.add(s.charAt(i));
            }else{
                po[i]=s.charAt(i);
            }
        }
        Collections.sort(l);
        int x=0;
        for(int i=0;i<po.length;i++){
            if(po[i]=='\0'){
                po[i]=l.get(x);
                x++;
            }
        }
        String ans="";
        for(int i=0;i<po.length;i++){
            ans+=po[i];
        }
        return ans;
    }
    public static boolean op(char ch){
        return ch=='a' || ch=='e' ||  ch=='i' ||ch=='o' || ch=='u' || ch=='A'
        || ch=='E' ||  ch=='I' ||ch=='O' || ch=='U';
    }
}