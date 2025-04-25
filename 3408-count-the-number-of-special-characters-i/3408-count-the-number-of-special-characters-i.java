class Solution {
    public int numberOfSpecialChars(String w) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<w.length();i++){
            mp.put(w.charAt(i),mp.getOrDefault(w.charAt(i),0)+1);
        }
        int c=0;
        for(Character ch:mp.keySet()){
            if(ch>=97 && ch<=122 &&  mp.containsKey(Character.toUpperCase(ch))){
                System.out.println(Character.toUpperCase(ch));
                c++;
            }
        }
        return c;
    }
}