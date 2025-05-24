class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
        HashMap<Character,Integer> mp1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            mp1.put(t.charAt(i),mp1.getOrDefault(t.charAt(i),0)+1);
        }
        return mp.equals(mp1);

    }
}